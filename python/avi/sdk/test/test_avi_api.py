# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import json
import logging
import unittest
from multiprocessing.pool import ThreadPool
import pytest
from requests_toolbelt import MultipartEncoder
from avi.sdk.avi_api import (ApiSession, ObjectNotFound, APIError, ApiResponse,
                             avi_timedelta, sessionDict,
                             AviMultipartUploadError)
from avi.sdk.utils.api_utils import ApiUtils
from avi.sdk.samples.common import get_sample_ssl_params
from avi.sdk.samples.clone_vs import AviClone
from requests.packages import urllib3
from requests import Response
from multiprocessing import Pool, Process
import os, sys
import vcr
import copy
from datetime import timedelta
from parameterized import parameterized
from base64 import b64encode

gSAMPLE_CONFIG = None
api = None
log = logging.getLogger(__name__)
login_info = None

urllib3.disable_warnings()
gapi_version = '17.2.6'

config_file = pytest.config.getoption("--config")
with open(config_file) as f:
    cfg = json.load(f)

ARG_DEFAULT_VALUE = {
    'limit': 1,
    'step': 300,
    'se_fields': 'markers,name,uuid,tenant_ref'
}

DEFAULT_LICENSES = ['ENTERPRISE', 'ENTERPRISE_WITH_CLOUD_SERVICES']

# All REST APIs used in Usage Meter
GET_CLUSTER = '/cluster/runtime'
GET_CLUSTER_VERSION = '/cluster/version'
GET_CONTROLLER_METRICES = '/analytics/metrics/controller'
GET_LICENSE_USAGE = '/licenseusage'
GET_SERVICEENGINE_GROUP = '/serviceenginegroup'
GET_SYSTEM_CONFIG = '/systemconfiguration'

my_vcr = vcr.VCR(
    cassette_library_dir='python/avi/sdk/test/fixtures/cassettes/',
    serializer='json',
    match_on= ['method','url']
)
@my_vcr.use_cassette()
def setUpModule():
    global gSAMPLE_CONFIG
    gSAMPLE_CONFIG = cfg
    log.debug(' read config %s', gSAMPLE_CONFIG)

    global login_info
    login_info = gSAMPLE_CONFIG["LoginInfo"]
    global api
    api = ApiSession.get_session(
        login_info["controller_ip"], login_info.get("username", "admin"),
        login_info.get("password", "fr3sca$%^"),
        tenant=login_info.get("tenant", "admin"),
        tenant_uuid=login_info.get("tenant_uuid", None),
        api_version=login_info.get("api_version", gapi_version),
        verify=False)

def create_sessions(args):
    login_info, num_sessions = args
    log.info('pid %d num_sessions %d', os.getpid(), num_sessions)
    user = login_info.get("username", "admin")
    cip = login_info.get("controller_ip")
    port = login_info.get("port")
    k_port = port if port else 443
    key = cip + ":" + user + ":" + str(k_port)
    for _ in range(num_sessions):
        api = ApiSession(
            login_info["controller_ip"], login_info.get("username", "admin"),
            login_info.get("password", "fr3sca$%^"), api_version=login_info.get(
                "api_version", "17.1"), data_log=login_info['data_log'])
    return 1 if key in sessionDict else 0

def shared_session_check(index):
    rsp = api.get('tenant')
    return rsp.status_code


class Test(unittest.TestCase):

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_4_0
    def test_basic_vs(self):
        basic_vs_cfg = gSAMPLE_CONFIG["BasicVS"]
        vs_obj = basic_vs_cfg["vs_obj"]
        resp = api.post('pool', data=json.dumps(basic_vs_cfg["pool_obj"]),
                        api_version=login_info.get("api_version"))
        assert resp.status_code in (200, 201)
        vs_obj["pool_ref"] = api.get_obj_ref(resp.json())

        resp = api.post('vsvip', data=json.dumps(basic_vs_cfg["vsvip_obj"]),
                        api_version=login_info.get("api_version"))
        assert resp.status_code in (200, 201)
        vs_obj["vsvip_ref"] = api.get_obj_ref(resp.json())

        resp = api.post('virtualservice', data=json.dumps(vs_obj),
                        api_version=login_info.get("api_version"))
        print(resp.json)
        assert resp.status_code in (200, 201)
        pool_name = gSAMPLE_CONFIG["BasicVS"]["pool_obj"]["name"]
        vsvip_name = gSAMPLE_CONFIG["BasicVS"]["vsvip_obj"]["name"]
        resp = api.get('virtualservice', tenant='admin',
                        api_version=login_info.get("api_version"))
        assert resp.json()['count'] >= 1
        assert resp.status_code in (200, 204)
        resp = api.delete_by_name('virtualservice', vs_obj['name'],
                                      api_version=login_info.get("api_version"))
        assert resp.status_code in (200, 204)
        resp = api.delete_by_name("pool", pool_name,
                                      api_version=login_info.get("api_version"))
        assert resp.status_code in (200, 204)
        resp = api.delete_by_name("vsvip", vsvip_name,
                                     api_version=login_info.get("api_version"))
        assert resp.status_code in (200, 204)

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_22_0
    def test_reuse_api_session(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)
        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        assert api1 == api2

    @pytest.mark.travis
    @my_vcr.use_cassette()

    @pytest.mark.TCID1_48_1547_17_0
    def test_lazy_authentication(self):
        ApiSession.clear_cached_sessions()
        session = ApiSession(
            controller_ip=login_info["controller_ip"],
            username=login_info.get("username", "admin"),
            password=login_info.get("password", "fr3sca$%^"),
            lazy_authentication=True)
        assert not session.keystone_token
        session.get('pool')
        assert session.keystone_token
        ApiSession.clear_cached_sessions()
        session = ApiSession(
            controller_ip=login_info["controller_ip"],
            username=login_info.get("username", "admin"),
            password=login_info.get("password", "fr3sca$%^"),
            lazy_authentication=False)
        assert session.keystone_token

    @pytest.mark.travis
    @my_vcr.use_cassette()

    @pytest.mark.TCID1_48_1547_34_0
    def test_ssl_vs(self):
        papi = ApiSession(api.avi_credentials.controller,
                          api.avi_credentials.username,
                          api.avi_credentials.password,
                          api_version=api.avi_credentials.api_version,
                          verify=False, data_log=True)
        ssl_vs_cfg = gSAMPLE_CONFIG["SSL-VS"]
        vs_obj = ssl_vs_cfg["vs_obj"]
        pool_name = gSAMPLE_CONFIG["SSL-VS"]["pool_obj"]["name"]
        vsvip_name = gSAMPLE_CONFIG["SSL-VS"]["vsvip_obj"]["name"]
        resp = papi.post('pool', data=gSAMPLE_CONFIG["SSL-VS"]["pool_obj"])
        assert resp.status_code == 201
        vip_resp = papi.post('vsvip', data=gSAMPLE_CONFIG["SSL-VS"]["vsvip_obj"])
        assert resp.status_code == 201
        pool_ref = papi.get_obj_ref(resp.json())
        vsvip_ref = papi.get_obj_ref(vip_resp.json())
        cert, key, _, _ = get_sample_ssl_params \
            (folder_path=os.path.abspath(
                os.path.join(os.path.dirname(__file__), '..',
                             'samples')) + os.sep)
        api_utils = ApiUtils(papi)
        try:
            resp = api_utils.import_ssl_certificate("ssl-vs-kc", key, cert)
            ssl_kc = resp.json()
        except:
            ssl_kc = api.get_object_by_name('sslkeyandcertificate',
                                            'ssl-vs-kc')
        ssl_key_and_cert_ref = [papi.get_obj_ref(ssl_kc)]
        vs_obj["pool_ref"] = pool_ref
        vs_obj["vsvip_ref"] = vsvip_ref
        vs_obj["ssl_key_and_certificate_refs"] = ssl_key_and_cert_ref
        resp = papi.post('virtualservice', data=json.dumps(vs_obj))
        assert resp.status_code < 300
        resp = papi.delete_by_name('virtualservice', vs_obj['name'])
        assert resp.status_code in (200, 204)
        resp = papi.delete_by_name("pool", pool_name)
        assert resp.status_code in (200, 204)
        resp = api.delete_by_name('sslkeyandcertificate', 'ssl-vs-kc')
        assert resp.status_code in (200, 204)
        resp = papi.delete_by_name('vsvip', vsvip_name)
        assert resp.status_code in (200, 204)

    @pytest.mark.travis
    @my_vcr.use_cassette()

    @pytest.mark.TCID1_48_1547_6_0
    def test_cloned_session_headers(self):
        api2 = ApiSession(controller_ip=api.avi_credentials.controller,
                          username=api.avi_credentials.username, \
                          password=api.avi_credentials.password,
                          tenant=api.avi_credentials.tenant,
                          tenant_uuid=api.avi_credentials.tenant_uuid,
                          api_version=api.avi_credentials.api_version,
                          verify=False, data_log=api.data_log)
        SHARED_USER_HDRS = ['X-CSRFToken', 'Session-Id', 'Referer']
        for hdr in SHARED_USER_HDRS:
            if hdr in api.headers:
                assert api.headers[hdr] == api2.headers[hdr]

    @pytest.mark.travis
    @my_vcr.use_cassette()

    @pytest.mark.TCID1_48_1547_2_0
    def test_avi_json(self):
        rsp = Response()
        rsp.status_code = 404
        rsp._content = b'Not found'
        try:
            avi_rsp = ApiResponse(rsp)
            avi_rsp.json()
            assert False
        except ObjectNotFound:
            pass
        except Exception:
            assert False

        rsp.status_code = 501
        try:
            avi_rsp = ApiResponse(rsp)
            avi_rsp.json()
            assert False
        except APIError:
            pass
        except Exception:
            assert False

        rsp.status_code = 200
        rsp._content = b'{"count": 3, "results": ["a", "b", "c"]}'
        try:
            avi_rsp = ApiResponse(rsp)
            obj = avi_rsp.json()
            assert obj['count']
            assert avi_rsp.count() == 3
            assert len(obj['results']) == 3
        except Exception as e:
            log.debug('exception %s', str(e))
            log.debug('%s', traceback.format_exc())
            assert False

    @pytest.mark.travis
    @my_vcr.use_cassette()

    @pytest.mark.TCID1_48_1547_18_0
    def test_multiple_tenants(self):
        """
        Tests api with multiple tenants to make sure object is only returned
        for the right tenant.
        """
        tobj = {'name': 'test-tenant'}
        resp = api.post('tenant', data=tobj)
        assert resp.status_code in (200, 201)
        tapi = ApiSession(controller_ip=api.avi_credentials.controller,
                          username=api.avi_credentials.username,
                          password=api.avi_credentials.password,
                          tenant=tobj['name'], verify=False,
                          data_log=api.data_log)
        t_obj = tapi.get_object_by_name('tenant', tobj['name'])
        # created pool.
        log.info('tenant %s', t_obj)
        basic_vs_cfg = gSAMPLE_CONFIG["BasicVS"]
        pool_cfg = copy.deepcopy(basic_vs_cfg["pool_obj"])
        pool_cfg['name'] = pool_cfg['name'] + '-test-tenant'
        resp = tapi.post('pool', data=pool_cfg)
        assert resp.status_code in (200, 201)
        # check pool was not created in tenant admin
        pname = pool_cfg['name']
        resp = api.get_object_by_name('pool', pname)
        assert resp is None
        resp = tapi.get_object_by_name('pool', pname)
        assert resp
        resp = api.get_object_by_name('pool', pname, tenant_uuid=t_obj['uuid'])
        assert resp
        resp = api.get_object_by_name('pool', pname, tenant='test-tenant')
        assert resp
        resp = tapi.delete_by_name("pool", pname)
        assert resp.status_code in (200, 204)
        resp = api.get_object_by_name('pool', pname, tenant='test-tenant')
        assert resp is None
        resp = tapi.delete_by_name('tenant', 'test-tenant', tenant='admin')
        assert resp.status_code in (200, 204)

    @pytest.mark.travis
    @my_vcr.use_cassette()

    @pytest.mark.TCID1_48_1547_36_0
    def test_timeout(self):
        resp = api.get_object_by_name('tenant', 'admin', timeout=2)
        assert resp

    @pytest.mark.travis
    @my_vcr.use_cassette()

    @pytest.mark.TCID1_48_1547_8_0
    def test_force_uuid(self):
        basic_vs_cfg = gSAMPLE_CONFIG["BasicVS"]
        pool_cfg = copy.deepcopy(basic_vs_cfg["pool_obj"])
        pool_cfg['name'] = pool_cfg['name'] + '-force'
        resp = api.post('pool', data=pool_cfg, force_uuid='pool-force-42')
        assert resp.status_code in (200, 201)
        pool_obj = resp.json()
        assert pool_obj['uuid'] == 'pool-force-42'
        pool_obj = api.get_object_by_name('pool', pool_cfg['name'])
        assert pool_obj['uuid'] == 'pool-force-42'
        resp = api.delete_by_name("pool", pool_cfg['name'])
        assert resp.status_code in (200, 204)

    @pytest.mark.skip_travis

    @pytest.mark.TCID1_48_1547_19_0
    def test_multiprocess_cache(self):
        p = Pool(4)
        num_sessions_list = [1, 4, 3, 2, 1]
        p_args = []
        for num_ssn in num_sessions_list:
            t = (login_info, num_ssn)
            p_args.append(t)
        results = p.map(create_sessions, p_args)
        for result in results:
            assert result == 1

    @pytest.mark.skip_travis
    @pytest.mark.TCID1_48_1547_20_0
    def test_multiprocess_sharing(self):
        api.get_object_by_name('tenant', name='admin')
        p = Process(target=shared_session_check, args=(1,))
        p.start()
        p.join()
        p = Pool(16)
        shared_sessions = []
        for index in range(16):
            shared_sessions.append(index)
        results = p.map(shared_session_check, shared_sessions)
        print("results :",results)
        for result in results:
             assert result == 200

    @pytest.mark.travis
    @pytest.mark.TCID1_48_1547_5_0
    def test_cleanup_sessions(self):
        api._update_session_last_used()
        assert api.key in sessionDict
        assert 'api' in sessionDict[api.key]
        assert 'last_used' in sessionDict[api.key]

    @pytest.mark.travis
    @pytest.mark.TCID1_48_1547_3_0
    def test_avi_timedelta(self):
        try:
            avi_timedelta(10)
            assert False
        except:
            pass
        assert avi_timedelta(timedelta(seconds=10)) == 10

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_25_0
    def test_session_reset(self):
        papi = ApiSession(controller_ip=api.avi_credentials.controller,
                          username=api.avi_credentials.username,
                          password=api.avi_credentials.password, verify=False,
                          api_version=api.avi_credentials.api_version,
                          data_log=api.data_log)
        res = papi.get('pool', params={'fields': 'name'})
        assert res.status_code == 200
        papi.reset_session()
        res = papi.get('pool', params={'fields': 'name'})
        assert res.status_code == 200
        data = {'name': 'test-reset'}
        res = papi.post('pool', data=data)
        assert res.status_code == 201
        papi.reset_session()
        res = papi.delete_by_name('pool', 'test-reset')
        assert res.status_code == 204

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_24_0
    def test_session_multi_reset(self):
        papi = ApiSession(controller_ip=api.avi_credentials.controller,
                          username=api.avi_credentials.username,
                          password=api.avi_credentials.password,
                          verify=False,
                          api_version=api.avi_credentials.api_version,
                          data_log=api.data_log)
        papi.reset_session()
        papi.reset_session()

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_21_0
    def test_retry_unauth_api(self):
        papi = ApiSession(controller_ip=api.avi_credentials.controller,
                          username=api.avi_credentials.username,
                          password=api.avi_credentials.password,
                          verify=False,
                          api_version=api.avi_credentials.api_version,
                          data_log=api.data_log)
        papi.keystone_token = 'invalid'
        resp = papi.post('tenant', data={'name': 'tenant1', 'local': 'true'})
        assert resp.status_code == 201
        papi.delete_by_name('tenant', 'tenant1')

    # Added test cases for getter and setter methods in avi_api
    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_11_0
    def test_get_controller_ip(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                       verify=False)
        assert api1.controller_ip ==  api2.controller_ip

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_27_0
    def test_set_controller_ip(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        api1.controller_ip = '10.10.2.3'
        assert api1.controller_ip == api2.controller_ip
        api1.controller_ip = login_info['controller_ip']

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_16_0
    def test_get_username(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)

        assert api1.username == api2.username

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_33_0
    def test_set_username(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        api1.username = 'avi-networks'
        assert api1.username == api2.username
        api1.username = login_info.get("username", "admin")

    @pytest.mark.skip_travis
    @pytest.mark.TCID1_48_1547_13_0
    def test_get_password(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)

        assert api1.password == api2.password

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_29_0
    def test_set_password(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        api1.password = 'admin@#$'
        assert api1.password == api2.password
        api1.password = login_info.get("password", "fr3sca$%^")

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_12_0
    def test_get_key_token(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        assert api1.keystone_token == api2.keystone_token

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_28_0
    def test_set_key_token(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        token  = api1.keystone_token
        api1.keystone_token = "abc1werxSWASC"
        assert api1.keystone_token == api2.keystone_token
        api1.keystone_token = token

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_15_0
    def test_get_tenant_uuid(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        assert api1.tenant_uuid == api2.tenant_uuid

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_32_0
    def test_set_tenant_uuid(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        api1.tenant_uuid = "Xyssdd123YYY-test"
        assert api1.tenant_uuid == api2.tenant_uuid
        api1.tenant_uuid = login_info.get("tenant_uuid", None)

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_35_0
    def test_tenant(self):
         api1 = ApiSession(avi_credentials=api.avi_credentials,
                           verify=False)

         api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                       verify=False)
         assert api1.tenant == api2.tenant

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_31_0
    def test_set_tenant(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        api1.tenant == 'vmware'
        assert api1.tenant == api2.tenant
        api1.tenant = login_info.get("tenant", "admin")

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_14_0
    def test_get_port(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)

        assert api1.port == api2.port

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_30_0
    def test_set_port(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        api1.port = '9993'
        assert api1.port == api2.port
        api1.port = login_info.get("port")

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_9_0
    def test_get_api_version(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)

        assert api1.api_version == api2.api_version

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_26_0
    def test_set_api_version(self):
        api1 = ApiSession(avi_credentials=api.avi_credentials,
                          verify=False)

        api2 = ApiSession.get_session(avi_credentials=api.avi_credentials,
                                      verify=False)
        api1.api_version = "17.2.2"
        assert api1.api_version == api2.api_version
        api1.api_version = login_info.get("api_version", gapi_version)


    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_10_0
    def test_get_controller_details(self):
        controller_details = api.get_controller_details()
        assert controller_details['controller_ip'] == api.controller_ip
        assert controller_details[
                   'controller_api_version'] == api.remote_api_version

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_23_0
    def test_session_connected(self):
        ApiSession.clear_cached_sessions()
        session = ApiSession(
            controller_ip=login_info["controller_ip"],
            username=login_info.get("username", "admin"),
            password=login_info.get("password", "fr3sca$%^"),
            lazy_authentication=True)
        assert not session.connected
        session.get('pool')
        assert session.connected
        ApiSession.clear_cached_sessions()
        session = ApiSession(
            controller_ip=login_info["controller_ip"],
            username=login_info.get("username", "admin"),
            password=login_info.get("password", "fr3sca$%^"),
            lazy_authentication=False)
        assert session.connected

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_37_0
    def test_user_login(self):
        api1 = ApiSession(controller_ip=login_info.get('controller_ip'),
            username=login_info.get('username'),
            password=login_info.get('password'),
            lazy_authentication=False)
        user_info = gSAMPLE_CONFIG["Passwords"]
        original_password = login_info.get('password')
        new_password = "admin123@!@#"
        user_info['password'] = new_password
        user_info['old_password'] = original_password
        res = api1.put('useraccount', data=json.dumps(user_info))
        assert res.status_code == 200
        api1.clear_cached_sessions()

        api2 = ApiSession(controller_ip=login_info.get('controller_ip'),
                          username=login_info.get('username'),
                          password=new_password,
                          lazy_authentication=False)
        res = api2.get('pool')
        assert res.status_code in [200, 204]

        resp = api2.get('systemconfiguration', tenant='admin')
        r = resp.json()
        data = r['portal_configuration']['password_strength_check'] = False
        sysresp = api2.put('systemconfiguration', data=data, tenant='admin')
        assert sysresp.status_code == 200
        old_password = user_info['password']
        changed_password = original_password
        user_info['password'] = original_password
        user_info['old_password'] = old_password
        result = api2.put('useraccount', user_info)
        assert result.status_code == 200
        res = api2.get('pool')
        assert res.status_code in [200, 204]
        api2.clear_cached_sessions()

        api3 = ApiSession(controller_ip=login_info.get('controller_ip'),
                          username=login_info.get('username'),
                          password=changed_password,
                          lazy_authentication=False)
        res = api3.get('pool')
        assert res.status_code in [200, 204]

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_7_0
    def test_context_sharing(self):
        api1 = ApiSession(controller_ip=login_info.get('controller_ip'),
                          username=login_info.get('username'),
                          password=login_info.get('password'),
                          lazy_authentication=False)

        context_api1 = api1.get_context()

        api1.clear_cached_sessions()

        api2 = ApiSession(controller_ip=login_info.get('controller_ip'),
                          username=login_info.get('username'),
                          password=login_info.get('password'),
                          session_id= context_api1['session_id'],
                          csrftoken=context_api1['csrftoken'],
                          lazy_authentication=True)
        api2.get('pool')
        assert api2.get_context() == context_api1

    @pytest.mark.travis
    @my_vcr.use_cassette()
    @pytest.mark.TCID1_48_1547_1_0
    def test_api_session(self):
        api_session1 = ApiSession(controller_ip=login_info.get('controller_ip'),
                          username=login_info.get('username'),
                          password=login_info.get('password'),
                          tenant=login_info.get("tenant", "admin"),
                          tenant_uuid=login_info.get("tenant_uuid", None),
                          api_version=login_info.get("api_version", gapi_version),
                          verify=False)

        api_session2 = ApiSession.get_session(
            login_info["controller_ip"], login_info.get("username", "admin"),
            login_info.get("password", "fr3sca$%^"),
            tenant=login_info.get("tenant", "admin"),
            tenant_uuid=login_info.get("tenant_uuid", None),
            api_version=login_info.get("api_version", gapi_version),
            verify=False)

        assert api_session1.avi_credentials.session_id == api_session2.avi_credentials.session_id

    @parameterized.expand(
        [('https://192.10.100.132/api/vrfcontext/vrfcontext-31f1b55f-319c-44eb-862f-69d79ffdf295',
          'vrfcontext-31f1b55f-319c-44eb-862f-69d79ffdf295'),
         ('https://192.10.100.132/api/vrfcontext/vrfcontext-31f1b55f-319c-44eb-862f-69d79ffdf295#test-vrf',
          'vrfcontext-31f1b55f-319c-44eb-862f-69d79ffdf295'),
         ('vrfcontext-31f1b55f-319c-44eb-862f-69d79ffdf295',
          'vrfcontext-31f1b55f-319c-44eb-862f-69d79ffdf295')
         ])
    @pytest.mark.travis
    def test_get_slug_from_uri(self, input, expected):
        assert api.get_slug_from_uri(input) == expected

    @pytest.mark.travis
    @my_vcr.use_cassette()
    def test_clone_vs(self):
        basic_vs_cfg = gSAMPLE_CONFIG['BasicVS']
        vs_obj = basic_vs_cfg['vs_obj']
        resp = api.post('pool', data=json.dumps(basic_vs_cfg['pool_obj']),
                        api_version=login_info.get('api_version'))
        assert resp.status_code in (200, 201)
        vs_obj['pool_ref'] = api.get_obj_ref(resp.json())

        resp = api.post('vsvip', data=json.dumps(basic_vs_cfg['vsvip_obj']),
                        api_version=login_info.get('api_version'))
        assert resp.status_code in (200, 201)
        vs_obj['vsvip_ref'] = api.get_obj_ref(resp.json())

        resp = api.post('virtualservice', data=json.dumps(vs_obj),
                        api_version=login_info.get('api_version'))
        assert resp.status_code in (200, 201)

        avi_clone = AviClone(api)
        (new_vs,
         created_objs,
         warnings) = avi_clone.clone_vs(vs_obj['name'],
                                        'basic_vs_cloned',
                                        new_vs_vips=['10.90.64.124'],
                                        new_vs_fips=[None],
                                        new_vs_v6vips=[None],
                                        new_vs_placements=[None])
        assert new_vs is not None

        pool_name = gSAMPLE_CONFIG['BasicVS']['pool_obj']['name']
        vsvip_name = gSAMPLE_CONFIG['BasicVS']['vsvip_obj']['name']

        resp = api.delete_by_name('virtualservice', vs_obj['name'],
                                  api_version=login_info.get('api_version'))
        assert resp.status_code in (200, 204)

        resp = api.delete_by_name('pool', pool_name,
                                  api_version=login_info.get('api_version'))
        assert resp.status_code in (200, 204)

        resp = api.delete_by_name('vsvip', vsvip_name,
                                   api_version=login_info.get('api_version'))
        assert resp.status_code in (200, 204)

        all_created_objs = [new_vs]
        all_created_objs.extend(created_objs)
        avi_clone.delete_objects(created_objs=all_created_objs)

    @pytest.mark.skip_travis
    def test_avi_file_upload(self):
        file_path = sys.argv[0]
        file_uri = "controller://hsmpackages"
        controller_ip = login_info["controller_ip"]
        username = login_info.get("username", "admin")
        uri = "fileservice/hsmpackages?hsmtype=safenet"

        log.info("Creating ne session")
        api_session = ApiSession.get_session(controller_ip, username,
                        login_info.get("password", "fr3sca$%^"),
                        tenant=login_info.get("tenant", "admin"),
                        tenant_uuid=login_info.get("tenant_uuid", None),
                        api_version=login_info.get("api_version", gapi_version),
                        verify=False)
        api_session.timeout = 1000
        api_session.retry_wait_time = 1
        filename = os.path.basename(file_path)

        with open(file_path, 'rb') as fd:
            file_dict = {
                "file" : (filename, fd, 'application/octet-stream'),
                "uri"  : file_uri
            }
            #Invalidate the session by removing CSRF token
            sessionDict['%s:%s:443' % (controller_ip, username)]['csrftoken'] = ""
            data = MultipartEncoder(file_dict)
            headers = {}
            headers['Content-Type'] = data.content_type
            headers['Connection'] = 'keep-alive'
            try:
                log.info('Upload file with invalid session')
                api_session.post(uri, headers=headers, data=data)
                assert 0
            except AviMultipartUploadError as e:
                log.info("Exception: %s" % e)
                #re-encode the data
                data = MultipartEncoder(file_dict)
                #create valid session
            log.info('Upload file with valid session')
            api_session.reset_session()
            resp = api_session.post(uri, headers=headers, data=data)
            assert resp.status_code < 300
            log.info("File upload successfull")

    @pytest.mark.travis
    @my_vcr.use_cassette()
    def test_basic_auth(self):
        basic_vs_cfg = gSAMPLE_CONFIG["BasicVS"]
        vs_obj = basic_vs_cfg["vs_obj"]
        try:
            username = login_info.get("admin", "admin")
            password = login_info.get("password", "fr3sca$%^")
            api = ApiSession.get_session(login_info.get('controller_ip'), username,
                        password, tenant=login_info.get("tenant", "admin"),
                        tenant_uuid=login_info.get("tenant_uuid", None),
                        api_version=login_info.get("api_version", gapi_version),
                        verify=False)
            resp = api.get('systemconfiguration', tenant='admin')
            res = resp.json()
            res['portal_configuration']['allow_basic_authentication'] = True
            sysresp = api.put('systemconfiguration', data=res, tenant='admin')
            assert sysresp.status_code == 200
            ApiSession.clear_cached_sessions()
            headers = {
                "X-Avi-Version": login_info.get("api_version", gapi_version),
                "Authorization": "Basic {}".format(b64encode(bytes("{}:{}".format(username, password), encoding="utf8")).decode("ascii"))
            }
        except Exception as e:
            headers = {
                'X-Avi-Version': login_info.get("api_version", gapi_version),
                'Authorization': 'Basic YWRtaW46YXZpMTIzJCU='
            }
        aviapi = ApiSession(controller_ip=login_info.get('controller_ip'), username=login_info.get('username'),
                         api_version=login_info.get("api_version", gapi_version), user_hdrs=headers)

        resp = aviapi.post('pool', data=json.dumps(basic_vs_cfg["pool_obj"]),
                        api_version=login_info.get("api_version"))
        assert resp.status_code in (200, 201)

        resp = aviapi.post('vsvip', data=json.dumps(basic_vs_cfg["vsvip_obj"]),
                        api_version=login_info.get("api_version"))
        assert resp.status_code in (200, 201)
        vs_obj["vsvip_ref"] = api.get_obj_ref(resp.json())

        resp = aviapi.post('virtualservice', data=json.dumps(vs_obj),
                        api_version=login_info.get("api_version"))
        print(resp.json)
        assert resp.status_code in (200, 201)
        pool_name = gSAMPLE_CONFIG["BasicVS"]["pool_obj"]["name"]
        vsvip_name = gSAMPLE_CONFIG["BasicVS"]["vsvip_obj"]["name"]
        resp = aviapi.get('virtualservice', tenant='admin',
                       api_version=login_info.get("api_version"))
        assert resp.json()['count'] >= 1
        assert resp.status_code in (200, 204)
        resp = aviapi.delete_by_name('virtualservice', vs_obj['name'],
                                  api_version=login_info.get("api_version"))
        assert resp.status_code in (200, 204)
        resp = aviapi.delete_by_name("pool", pool_name,
                                  api_version=login_info.get("api_version"))
        assert resp.status_code in (200, 204)
        resp = aviapi.delete_by_name("vsvip", vsvip_name,
                                  api_version=login_info.get("api_version"))
        assert resp.status_code in (200, 204)

    # Added Usage Meter test cases to test APIs
    def test_cluster_uuid_api(self):
        """
        Verify cluster UUID
        """
        resp = api.get(GET_CLUSTER)
        assert resp.status_code == 200
        cluster_uuid = resp.json()['node_info']['cluster_uuid']
        assert cluster_uuid

    def test_cluster_version_api(self):
        """
        Verify cluster version is correct
        """
        cluster_data = api.get(GET_CLUSTER_VERSION)
        assert cluster_data.status_code == 200
        assert login_info['api_version'] == cluster_data.json()['Version']

    def test_default_license_tier(self):
        """
        Verify default license tier of AVI controller.
        """
        resp = api.get(GET_SYSTEM_CONFIG)
        assert resp.status_code == 200

        license_tier = resp.json()['default_license_tier']
        assert license_tier in DEFAULT_LICENSES

    def test_license_cores_api(self):
        """
        Verify license cores.
        """
        resp = api.get(GET_LICENSE_USAGE)
        assert resp.status_code == 200

        license_cores = resp.json()['licensed_cores']
        assert license_cores

    def test_get_metrics_api(self):
        """
        Verify AVI controller metrics API response.
        """
        params = {
            'metric_id': 'controller_stats.avg_num_service_cores',
            'limit': ARG_DEFAULT_VALUE['limit'],
            'step': ARG_DEFAULT_VALUE['step']
        }
        core_usage = api.get(GET_CONTROLLER_METRICES, params=params)
        assert core_usage.status_code == 200
        response = core_usage.json()
        analytics_metrics = response['results'][0]['series'][0]['header']['statistics']['mean']
        assert analytics_metrics is not None

    def test_per_segroup_consumed_cores_api(self):
        """
        Verify per service engine consumed cores API response.
        """
        service_engine_group = api.get(GET_SERVICEENGINE_GROUP, params={'fields': ARG_DEFAULT_VALUE['se_fields']})
        assert service_engine_group.status_code == 200

        service_engine_group_list = []
        for service_engine in service_engine_group.json()['results']:
            service_engine_group_list.append(service_engine['uuid'])
        assert service_engine_group_list

        for service_engine_uuid in service_engine_group_list:
            params = {
                'metric_id': 'segroup_stats.avg_license_usage',
                'limit': ARG_DEFAULT_VALUE['limit'],
                'step': ARG_DEFAULT_VALUE['step'],
                'obj_id': service_engine_uuid
            }
            core_usage = api.get(GET_CONTROLLER_METRICES, params=params)
            assert core_usage.status_code == 200
            analytics_metrics = core_usage.json()['results'][0]['series'][0]['header']['statistics']['mean']
            assert analytics_metrics is not None


if __name__ == "__main__":
    unittest.main()


