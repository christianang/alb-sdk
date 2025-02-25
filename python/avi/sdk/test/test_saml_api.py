# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import json
import pytest
import vcr
import unittest
from avi.sdk.saml_avi_api import ApiSession, OktaSAMLApiSession, OneloginSAMLApiSession, WS1loginSAMLApiSession

api_version = '22.1.3'
config_file = pytest.config.getoption("--config")
with open(config_file) as f:
    cfg = json.load(f)

my_vcr = vcr.VCR(
    cassette_library_dir='python/avi/sdk/test/fixtures/saml_cassettes/',
    serializer='yaml',
    match_on= ['method','url']
)

@my_vcr.use_cassette()
def setUpModule():
    global gSAMPLE_CONFIG
    gSAMPLE_CONFIG = cfg

    global oktalogin_info
    global onelogin_info
    global ws1login_info
    global login_info
    global api
    global oktaapi
    global onelogin
    global ws1api

    oktalogin_info = gSAMPLE_CONFIG["OktaLoginInfo"]
    oktaapi = OktaSAMLApiSession(
        oktalogin_info["controller_ip"], oktalogin_info.get("username", "admin"),
        oktalogin_info.get("password", "fr3sca$%^"),
        tenant=oktalogin_info.get("tenant", "admin"),
        tenant_uuid=oktalogin_info.get("tenant_uuid", None),
        api_version=oktalogin_info.get("api_version", api_version),
        verify=False)

    onelogin_info = gSAMPLE_CONFIG["OneloginLoginInfo"]
    onelogin = OneloginSAMLApiSession(
        onelogin_info["controller_ip"], onelogin_info.get("username", "admin"),
        onelogin_info.get("password", "fr3sca$%^"),
        tenant=onelogin_info.get("tenant", "admin"),
        tenant_uuid=onelogin_info.get("tenant_uuid", None),
        api_version=onelogin_info.get("api_version", api_version),
        verify=False)

    ws1login_info = gSAMPLE_CONFIG["Ws1LoginInfo"]
    ws1api = WS1loginSAMLApiSession(
        ws1login_info["controller_ip"], ws1login_info.get("username", "admin"),
        ws1login_info.get("password", "fr3sca$%^"),
        tenant=ws1login_info.get("tenant", "admin"),
        tenant_uuid=ws1login_info.get("tenant_uuid", None),
        api_version=ws1login_info.get("api_version", api_version),
        verify=False)

    login_info = gSAMPLE_CONFIG["LoginInfo"]
    api = ApiSession(
        login_info["controller_ip"], login_info.get("username", "admin"),
        login_info.get("password", "fr3sca$%^"),
        tenant=login_info.get("tenant", "admin"),
        tenant_uuid=login_info.get("tenant_uuid", None),
        api_version=login_info.get("api_version", api_version),
        verify=False)


class TestSaml(unittest.TestCase):

    @pytest.mark.travis
    @my_vcr.use_cassette()

    @pytest.mark.TCID1_48_1548_2_0
    def test_basic_vs_using_okta(self):
        basic_vs_cfg = gSAMPLE_CONFIG["BasicVS"]
        vs_obj = basic_vs_cfg["vs_obj"]
        resp = oktaapi.post('pool', data=json.dumps(basic_vs_cfg["pool_obj"]),
                            api_version=api_version)
        assert resp.status_code in (200, 201)
        vs_obj["pool_ref"] = oktaapi.get_obj_ref(resp.json())
        resp = oktaapi.post('virtualservice', data=json.dumps(vs_obj),
                            api_version=api_version)
        assert resp.status_code in (200, 201)
        pool_name = gSAMPLE_CONFIG["BasicVS"]["pool_obj"]["name"]
        resp = oktaapi.get('virtualservice', tenant='admin',
                           api_version=api_version)
        assert resp.json()['count'] >= 1
        resp = oktaapi.delete_by_name('virtualservice', vs_obj['name'],
                                      api_version=api_version)
        assert resp.status_code in (200, 204)
        resp = oktaapi.delete_by_name("pool", pool_name,
                                      api_version=api_version)
        assert resp.status_code in (200, 204)

    @pytest.mark.travis
    @my_vcr.use_cassette()

    @pytest.mark.TCID1_48_1548_3_0
    def test_basic_vs_using_onelogin(self):
        basic_vs_cfg = gSAMPLE_CONFIG["BasicVS"]
        vs_obj = basic_vs_cfg["vs_obj"]
        resp = onelogin.post('pool', data=json.dumps(basic_vs_cfg["pool_obj"]),
                             api_version=api_version)
        assert resp.status_code in (200, 201)
        vs_obj["pool_ref"] = onelogin.get_obj_ref(resp.json())
        resp = onelogin.post('virtualservice', data=json.dumps(vs_obj),
                             api_version=api_version)
        assert resp.status_code in (200, 201)
        pool_name = gSAMPLE_CONFIG["BasicVS"]["pool_obj"]["name"]
        resp = onelogin.get('virtualservice', tenant='admin',
                            api_version=api_version)
        assert resp.json()['count'] >= 1
        resp = onelogin.delete_by_name('virtualservice', vs_obj['name'],
                                       api_version=api_version)
        assert resp.status_code in (200, 204)
        resp = onelogin.delete_by_name("pool", pool_name,
                                       api_version=api_version)
        assert resp.status_code in (200, 204)

    @pytest.mark.travis
    @my_vcr.use_cassette()

    def test_basic_vs_using_ws1(self):
        basic_vs_cfg = gSAMPLE_CONFIG["BasicVS"]
        vs_obj = basic_vs_cfg["vs_obj"]
        resp = ws1api.post('pool', data=json.dumps(basic_vs_cfg["pool_obj"]),
                            api_version=api_version)
        assert resp.status_code in (200, 201)
        vs_obj["pool_ref"] = ws1api.get_obj_ref(resp.json())
        resp = ws1api.post('vsvip', data=json.dumps(basic_vs_cfg["vsvip_obj"]),
                        api_version=ws1login_info.get("api_version"))
        assert resp.status_code in (200, 201)
        vs_obj["vsvip_ref"] = ws1api.get_obj_ref(resp.json())
        resp = ws1api.post('virtualservice', data=json.dumps(vs_obj),
                            api_version=ws1login_info.get("api_version"))
        assert resp.status_code in (200, 201)
        pool_name = gSAMPLE_CONFIG["BasicVS"]["pool_obj"]["name"]
        resp = ws1api.get('virtualservice', tenant='admin',
                           api_version=ws1login_info.get("api_version"))
        assert resp.json()['count'] >= 1
        resp = ws1api.delete_by_name('virtualservice', vs_obj['name'],
                                      api_version=ws1login_info.get("api_version"))
        assert resp.status_code in (200, 204)
        resp = ws1api.delete_by_name("pool", pool_name,
                                      api_version=ws1login_info.get("api_version"))
        assert resp.status_code in (200, 204)

    @pytest.mark.travis
    @my_vcr.use_cassette()

    @pytest.mark.TCID1_48_1548_1_0
    def test_basic_vs_using_ApiSession(self):
        basic_vs_cfg = gSAMPLE_CONFIG["BasicVS"]
        vs_obj = basic_vs_cfg["vs_obj"]
        resp = api.post('pool', data=json.dumps(basic_vs_cfg["pool_obj"]),
                        api_version=api_version)
        assert resp.status_code in (200, 201)
        vs_obj["pool_ref"] = onelogin.get_obj_ref(resp.json())
        resp = api.post('virtualservice', data=json.dumps(vs_obj),
                        api_version=api_version)
        assert resp.status_code in (200, 201)
        pool_name = gSAMPLE_CONFIG["BasicVS"]["pool_obj"]["name"]
        resp = api.get('virtualservice', tenant='admin',
                       api_version=api_version)
        assert resp.json()['count'] >= 1
        resp = api.delete_by_name('virtualservice', vs_obj['name'],
                                  api_version=api_version)
        assert resp.status_code in (200, 204)
        resp = api.delete_by_name("pool", pool_name,
                                  api_version=api_version)
        assert resp.status_code in (200, 204)