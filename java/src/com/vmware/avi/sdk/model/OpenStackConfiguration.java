/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The OpenStackConfiguration is a POJO class extends AviRestResource that used for creating
 * OpenStackConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenStackConfiguration  {
    @JsonProperty("admin_tenant")
    private String adminTenant;

    @JsonProperty("admin_tenant_uuid")
    private String adminTenantUuid;

    @JsonProperty("allowed_address_pairs")
    private Boolean allowedAddressPairs = true;

    @JsonProperty("anti_affinity")
    private Boolean antiAffinity = true;

    @JsonProperty("auth_url")
    private String authUrl;

    @JsonProperty("config_drive")
    private Boolean configDrive = true;

    @JsonProperty("contrail_disable_policy")
    private Boolean contrailDisablePolicy = false;

    @JsonProperty("contrail_endpoint")
    private String contrailEndpoint;

    @JsonProperty("contrail_plugin")
    private Boolean contrailPlugin = false;

    @JsonProperty("custom_se_image_properties")
    private List<Property> customSeImageProperties;

    @JsonProperty("enable_os_object_caching")
    private Boolean enableOsObjectCaching = false;

    @JsonProperty("enable_tagging")
    private Boolean enableTagging = false;

    @JsonProperty("external_networks")
    private Boolean externalNetworks = false;

    @JsonProperty("free_floatingips")
    private Boolean freeFloatingips = false;

    @JsonProperty("hypervisor")
    private String hypervisor = "KVM";

    @JsonProperty("hypervisor_properties")
    private List<OpenStackHypervisorProperties> hypervisorProperties;

    @JsonProperty("img_format")
    private String imgFormat = "OS_IMG_FMT_AUTO";

    @JsonProperty("import_keystone_tenants")
    private Boolean importKeystoneTenants = true;

    @JsonProperty("insecure")
    private Boolean insecure = true;

    @JsonProperty("keystone_host")
    private String keystoneHost;

    @JsonProperty("map_admin_to_cloudadmin")
    private Boolean mapAdminToCloudadmin = false;

    @JsonProperty("mgmt_network_name")
    private String mgmtNetworkName;

    @JsonProperty("mgmt_network_uuid")
    private String mgmtNetworkUuid;

    @JsonProperty("name_owner")
    private Boolean nameOwner = true;

    @JsonProperty("neutron_rbac")
    private Boolean neutronRbac = true;

    @JsonProperty("password")
    private String password;

    @JsonProperty("privilege")
    private String privilege;

    @JsonProperty("prov_name")
    private List<String> provName;

    @JsonProperty("provider_vip_networks")
    private List<OpenStackVipNetwork> providerVipNetworks;

    @JsonProperty("region")
    private String region;

    @JsonProperty("role_mapping")
    private List<OpenStackRoleMapping> roleMapping;

    @JsonProperty("security_groups")
    private Boolean securityGroups = true;

    @JsonProperty("tenant_se")
    private Boolean tenantSe = true;

    @JsonProperty("use_admin_url")
    private Boolean useAdminUrl = true;

    @JsonProperty("use_internal_endpoints")
    private Boolean useInternalEndpoints = false;

    @JsonProperty("use_keystone_auth")
    private Boolean useKeystoneAuth = true;

    @JsonProperty("username")
    private String username;

    @JsonProperty("vip_port_in_admin_tenant")
    private Boolean vipPortInAdminTenant = false;



    /**
     * This is the getter method this will return the attribute value.
     * Openstack admin tenant (or project) information.
     * For keystone v3, provide the project information in project@domain format.
     * Domain need not be specified if the project belongs to the 'default' domain.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return adminTenant
     */
    public String getAdminTenant() {
        return adminTenant;
    }

    /**
     * This is the setter method to the attribute.
     * Openstack admin tenant (or project) information.
     * For keystone v3, provide the project information in project@domain format.
     * Domain need not be specified if the project belongs to the 'default' domain.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param adminTenant set the adminTenant.
     */
    public void setAdminTenant(String  adminTenant) {
        this.adminTenant = adminTenant;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Admin-tenant's uuid in openstack.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return adminTenantUuid
     */
    public String getAdminTenantUuid() {
        return adminTenantUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Admin-tenant's uuid in openstack.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param adminTenantUuid set the adminTenantUuid.
     */
    public void setAdminTenantUuid(String  adminTenantUuid) {
        this.adminTenantUuid = adminTenantUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If false, allowed-address-pairs extension will not be used.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return allowedAddressPairs
     */
    public Boolean getAllowedAddressPairs() {
        return allowedAddressPairs;
    }

    /**
     * This is the setter method to the attribute.
     * If false, allowed-address-pairs extension will not be used.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param allowedAddressPairs set the allowedAddressPairs.
     */
    public void setAllowedAddressPairs(Boolean  allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, an anti-affinity policy will be applied to all ses of a se-group, else no such policy will be applied.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return antiAffinity
     */
    public Boolean getAntiAffinity() {
        return antiAffinity;
    }

    /**
     * This is the setter method to the attribute.
     * If true, an anti-affinity policy will be applied to all ses of a se-group, else no such policy will be applied.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param antiAffinity set the antiAffinity.
     */
    public void setAntiAffinity(Boolean  antiAffinity) {
        this.antiAffinity = antiAffinity;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Auth url for connecting to keystone.
     * If this is specified, any value provided for keystone_host is ignored.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authUrl
     */
    public String getAuthUrl() {
        return authUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Auth url for connecting to keystone.
     * If this is specified, any value provided for keystone_host is ignored.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authUrl set the authUrl.
     */
    public void setAuthUrl(String  authUrl) {
        this.authUrl = authUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If false, metadata service will be used instead of  config-drive functionality to retrieve se vm metadata.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return configDrive
     */
    public Boolean getConfigDrive() {
        return configDrive;
    }

    /**
     * This is the setter method to the attribute.
     * If false, metadata service will be used instead of  config-drive functionality to retrieve se vm metadata.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param configDrive set the configDrive.
     */
    public void setConfigDrive(Boolean  configDrive) {
        this.configDrive = configDrive;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When set to true, the vip and data ports will be programmed to set virtual machine interface disable-policy.
     * Please refer contrail documentation for more on disable-policy.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return contrailDisablePolicy
     */
    public Boolean getContrailDisablePolicy() {
        return contrailDisablePolicy;
    }

    /**
     * This is the setter method to the attribute.
     * When set to true, the vip and data ports will be programmed to set virtual machine interface disable-policy.
     * Please refer contrail documentation for more on disable-policy.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param contrailDisablePolicy set the contrailDisablePolicy.
     */
    public void setContrailDisablePolicy(Boolean  contrailDisablePolicy) {
        this.contrailDisablePolicy = contrailDisablePolicy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Contrail vnc endpoint url (example http //10.10.10.100 8082).
     * By default, 'http //' scheme and 8082 port will be used if not provided in the url.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return contrailEndpoint
     */
    public String getContrailEndpoint() {
        return contrailEndpoint;
    }

    /**
     * This is the setter method to the attribute.
     * Contrail vnc endpoint url (example http //10.10.10.100 8082).
     * By default, 'http //' scheme and 8082 port will be used if not provided in the url.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param contrailEndpoint set the contrailEndpoint.
     */
    public void setContrailEndpoint(String  contrailEndpoint) {
        this.contrailEndpoint = contrailEndpoint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable contrail plugin mode.
     * (deprecated).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return contrailPlugin
     */
    public Boolean getContrailPlugin() {
        return contrailPlugin;
    }

    /**
     * This is the setter method to the attribute.
     * Enable contrail plugin mode.
     * (deprecated).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param contrailPlugin set the contrailPlugin.
     */
    public void setContrailPlugin(Boolean  contrailPlugin) {
        this.contrailPlugin = contrailPlugin;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Custom image properties to be set on a service engine image.
     * Only hw_vif_multiqueue_enabled property is supported.
     * Other properties will be ignored.
     * Field introduced in 18.2.7, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customSeImageProperties
     */
    public List<Property> getCustomSeImageProperties() {
        return customSeImageProperties;
    }

    /**
     * This is the setter method. this will set the customSeImageProperties
     * Custom image properties to be set on a service engine image.
     * Only hw_vif_multiqueue_enabled property is supported.
     * Other properties will be ignored.
     * Field introduced in 18.2.7, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customSeImageProperties
     */
    public void setCustomSeImageProperties(List<Property>  customSeImageProperties) {
        this.customSeImageProperties = customSeImageProperties;
    }

    /**
     * This is the setter method this will set the customSeImageProperties
     * Custom image properties to be set on a service engine image.
     * Only hw_vif_multiqueue_enabled property is supported.
     * Other properties will be ignored.
     * Field introduced in 18.2.7, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customSeImageProperties
     */
    public OpenStackConfiguration addCustomSeImagePropertiesItem(Property customSeImagePropertiesItem) {
      if (this.customSeImageProperties == null) {
        this.customSeImageProperties = new ArrayList<Property>();
      }
      this.customSeImageProperties.add(customSeImagePropertiesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When enabled, frequently used objects like networks, subnets, routers etc.
     * Are cached to improve performance and reduce load on openstack controllers.
     * Suitable for openstack environments where neutron resources are not frequently created, updated, or deleted.the cache is refreshed when cloud gc
     * api is issued.
     * Field introduced in 21.1.5, 22.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableOsObjectCaching
     */
    public Boolean getEnableOsObjectCaching() {
        return enableOsObjectCaching;
    }

    /**
     * This is the setter method to the attribute.
     * When enabled, frequently used objects like networks, subnets, routers etc.
     * Are cached to improve performance and reduce load on openstack controllers.
     * Suitable for openstack environments where neutron resources are not frequently created, updated, or deleted.the cache is refreshed when cloud gc
     * api is issued.
     * Field introduced in 21.1.5, 22.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableOsObjectCaching set the enableOsObjectCaching.
     */
    public void setEnableOsObjectCaching(Boolean  enableOsObjectCaching) {
        this.enableOsObjectCaching = enableOsObjectCaching;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When set to true, openstack resources created by avi are tagged with avi cloud uuid.
     * Field introduced in 21.1.5, 22.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableTagging
     */
    public Boolean getEnableTagging() {
        return enableTagging;
    }

    /**
     * This is the setter method to the attribute.
     * When set to true, openstack resources created by avi are tagged with avi cloud uuid.
     * Field introduced in 21.1.5, 22.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableTagging set the enableTagging.
     */
    public void setEnableTagging(Boolean  enableTagging) {
        this.enableTagging = enableTagging;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, allow selection of networks marked as 'external' for management,  vip or data networks.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return externalNetworks
     */
    public Boolean getExternalNetworks() {
        return externalNetworks;
    }

    /**
     * This is the setter method to the attribute.
     * If true, allow selection of networks marked as 'external' for management,  vip or data networks.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param externalNetworks set the externalNetworks.
     */
    public void setExternalNetworks(Boolean  externalNetworks) {
        this.externalNetworks = externalNetworks;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Free unused floating ips.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return freeFloatingips
     */
    public Boolean getFreeFloatingips() {
        return freeFloatingips;
    }

    /**
     * This is the setter method to the attribute.
     * Free unused floating ips.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param freeFloatingips set the freeFloatingips.
     */
    public void setFreeFloatingips(Boolean  freeFloatingips) {
        this.freeFloatingips = freeFloatingips;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default hypervisor type, only kvm is supported.
     * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "KVM".
     * @return hypervisor
     */
    public String getHypervisor() {
        return hypervisor;
    }

    /**
     * This is the setter method to the attribute.
     * Default hypervisor type, only kvm is supported.
     * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "KVM".
     * @param hypervisor set the hypervisor.
     */
    public void setHypervisor(String  hypervisor) {
        this.hypervisor = hypervisor;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Custom properties per hypervisor type.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hypervisorProperties
     */
    public List<OpenStackHypervisorProperties> getHypervisorProperties() {
        return hypervisorProperties;
    }

    /**
     * This is the setter method. this will set the hypervisorProperties
     * Custom properties per hypervisor type.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hypervisorProperties
     */
    public void setHypervisorProperties(List<OpenStackHypervisorProperties>  hypervisorProperties) {
        this.hypervisorProperties = hypervisorProperties;
    }

    /**
     * This is the setter method this will set the hypervisorProperties
     * Custom properties per hypervisor type.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hypervisorProperties
     */
    public OpenStackConfiguration addHypervisorPropertiesItem(OpenStackHypervisorProperties hypervisorPropertiesItem) {
      if (this.hypervisorProperties == null) {
        this.hypervisorProperties = new ArrayList<OpenStackHypervisorProperties>();
      }
      this.hypervisorProperties.add(hypervisorPropertiesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If os_img_fmt_raw, use raw images else use qcow2 for kvm.
     * Enum options - OS_IMG_FMT_AUTO, OS_IMG_FMT_QCOW2, OS_IMG_FMT_VMDK, OS_IMG_FMT_RAW, OS_IMG_FMT_FLAT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "OS_IMG_FMT_AUTO".
     * @return imgFormat
     */
    public String getImgFormat() {
        return imgFormat;
    }

    /**
     * This is the setter method to the attribute.
     * If os_img_fmt_raw, use raw images else use qcow2 for kvm.
     * Enum options - OS_IMG_FMT_AUTO, OS_IMG_FMT_QCOW2, OS_IMG_FMT_VMDK, OS_IMG_FMT_RAW, OS_IMG_FMT_FLAT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "OS_IMG_FMT_AUTO".
     * @param imgFormat set the imgFormat.
     */
    public void setImgFormat(String  imgFormat) {
        this.imgFormat = imgFormat;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Import keystone tenants list into avi.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return importKeystoneTenants
     */
    public Boolean getImportKeystoneTenants() {
        return importKeystoneTenants;
    }

    /**
     * This is the setter method to the attribute.
     * Import keystone tenants list into avi.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param importKeystoneTenants set the importKeystoneTenants.
     */
    public void setImportKeystoneTenants(Boolean  importKeystoneTenants) {
        this.importKeystoneTenants = importKeystoneTenants;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allow self-signed certificates when communicating with https service endpoints.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return insecure
     */
    public Boolean getInsecure() {
        return insecure;
    }

    /**
     * This is the setter method to the attribute.
     * Allow self-signed certificates when communicating with https service endpoints.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param insecure set the insecure.
     */
    public void setInsecure(Boolean  insecure) {
        this.insecure = insecure;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Keystone's hostname or ip address.
     * (deprecated) use auth_url instead.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return keystoneHost
     */
    public String getKeystoneHost() {
        return keystoneHost;
    }

    /**
     * This is the setter method to the attribute.
     * Keystone's hostname or ip address.
     * (deprecated) use auth_url instead.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param keystoneHost set the keystoneHost.
     */
    public void setKeystoneHost(String  keystoneHost) {
        this.keystoneHost = keystoneHost;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, map avi 'admin' tenant to the admin_tenant of the cloud.
     * Else map avi 'admin' to openstack 'admin' tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return mapAdminToCloudadmin
     */
    public Boolean getMapAdminToCloudadmin() {
        return mapAdminToCloudadmin;
    }

    /**
     * This is the setter method to the attribute.
     * If true, map avi 'admin' tenant to the admin_tenant of the cloud.
     * Else map avi 'admin' to openstack 'admin' tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param mapAdminToCloudadmin set the mapAdminToCloudadmin.
     */
    public void setMapAdminToCloudadmin(Boolean  mapAdminToCloudadmin) {
        this.mapAdminToCloudadmin = mapAdminToCloudadmin;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Avi management network name or cidr.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtNetworkName
     */
    public String getMgmtNetworkName() {
        return mgmtNetworkName;
    }

    /**
     * This is the setter method to the attribute.
     * Avi management network name or cidr.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtNetworkName set the mgmtNetworkName.
     */
    public void setMgmtNetworkName(String  mgmtNetworkName) {
        this.mgmtNetworkName = mgmtNetworkName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Management network uuid.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtNetworkUuid
     */
    public String getMgmtNetworkUuid() {
        return mgmtNetworkUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Management network uuid.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtNetworkUuid set the mgmtNetworkUuid.
     */
    public void setMgmtNetworkUuid(String  mgmtNetworkUuid) {
        this.mgmtNetworkUuid = mgmtNetworkUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, embed owner info in vip port 'name', else embed owner info in 'device_id' field.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return nameOwner
     */
    public Boolean getNameOwner() {
        return nameOwner;
    }

    /**
     * This is the setter method to the attribute.
     * If true, embed owner info in vip port 'name', else embed owner info in 'device_id' field.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param nameOwner set the nameOwner.
     */
    public void setNameOwner(Boolean  nameOwner) {
        this.nameOwner = nameOwner;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, enable neutron rbac discovery of networks shared across tenants/projects.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return neutronRbac
     */
    public Boolean getNeutronRbac() {
        return neutronRbac;
    }

    /**
     * This is the setter method to the attribute.
     * If true, enable neutron rbac discovery of networks shared across tenants/projects.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param neutronRbac set the neutronRbac.
     */
    public void setNeutronRbac(Boolean  neutronRbac) {
        this.neutronRbac = neutronRbac;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The password avi vantage will use when authenticating to keystone.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This is the setter method to the attribute.
     * The password avi vantage will use when authenticating to keystone.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param password set the password.
     */
    public void setPassword(String  password) {
        this.password = password;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Access privilege.
     * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * This is the setter method to the attribute.
     * Access privilege.
     * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param privilege set the privilege.
     */
    public void setPrivilege(String  privilege) {
        this.privilege = privilege;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Lbaas provider name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return provName
     */
    public List<String> getProvName() {
        return provName;
    }

    /**
     * This is the setter method. this will set the provName
     * Lbaas provider name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return provName
     */
    public void setProvName(List<String>  provName) {
        this.provName = provName;
    }

    /**
     * This is the setter method this will set the provName
     * Lbaas provider name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return provName
     */
    public OpenStackConfiguration addProvNameItem(String provNameItem) {
      if (this.provName == null) {
        this.provName = new ArrayList<String>();
      }
      this.provName.add(provNameItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * A tenant can normally use its own networks and any networks shared with it.
     * In addition, this setting provides extra networks that are usable by tenants.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return providerVipNetworks
     */
    public List<OpenStackVipNetwork> getProviderVipNetworks() {
        return providerVipNetworks;
    }

    /**
     * This is the setter method. this will set the providerVipNetworks
     * A tenant can normally use its own networks and any networks shared with it.
     * In addition, this setting provides extra networks that are usable by tenants.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return providerVipNetworks
     */
    public void setProviderVipNetworks(List<OpenStackVipNetwork>  providerVipNetworks) {
        this.providerVipNetworks = providerVipNetworks;
    }

    /**
     * This is the setter method this will set the providerVipNetworks
     * A tenant can normally use its own networks and any networks shared with it.
     * In addition, this setting provides extra networks that are usable by tenants.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return providerVipNetworks
     */
    public OpenStackConfiguration addProviderVipNetworksItem(OpenStackVipNetwork providerVipNetworksItem) {
      if (this.providerVipNetworks == null) {
        this.providerVipNetworks = new ArrayList<OpenStackVipNetwork>();
      }
      this.providerVipNetworks.add(providerVipNetworksItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Region name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     * This is the setter method to the attribute.
     * Region name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param region set the region.
     */
    public void setRegion(String  region) {
        this.region = region;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Defines the mapping from openstack role names to avi local role names.
     * For an openstack role, this mapping is consulted only if there is no local avi role with the same name as the openstack role.
     * This is an ordered list and only the first matching entry is used.
     * You can use '*' to match all openstack role names.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return roleMapping
     */
    public List<OpenStackRoleMapping> getRoleMapping() {
        return roleMapping;
    }

    /**
     * This is the setter method. this will set the roleMapping
     * Defines the mapping from openstack role names to avi local role names.
     * For an openstack role, this mapping is consulted only if there is no local avi role with the same name as the openstack role.
     * This is an ordered list and only the first matching entry is used.
     * You can use '*' to match all openstack role names.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return roleMapping
     */
    public void setRoleMapping(List<OpenStackRoleMapping>  roleMapping) {
        this.roleMapping = roleMapping;
    }

    /**
     * This is the setter method this will set the roleMapping
     * Defines the mapping from openstack role names to avi local role names.
     * For an openstack role, this mapping is consulted only if there is no local avi role with the same name as the openstack role.
     * This is an ordered list and only the first matching entry is used.
     * You can use '*' to match all openstack role names.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return roleMapping
     */
    public OpenStackConfiguration addRoleMappingItem(OpenStackRoleMapping roleMappingItem) {
      if (this.roleMapping == null) {
        this.roleMapping = new ArrayList<OpenStackRoleMapping>();
      }
      this.roleMapping.add(roleMappingItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If false, security-groups extension will not be used.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return securityGroups
     */
    public Boolean getSecurityGroups() {
        return securityGroups;
    }

    /**
     * This is the setter method to the attribute.
     * If false, security-groups extension will not be used.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param securityGroups set the securityGroups.
     */
    public void setSecurityGroups(Boolean  securityGroups) {
        this.securityGroups = securityGroups;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, then ses will be created in the appropriate tenants, else ses will be created in the admin_tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return tenantSe
     */
    public Boolean getTenantSe() {
        return tenantSe;
    }

    /**
     * This is the setter method to the attribute.
     * If true, then ses will be created in the appropriate tenants, else ses will be created in the admin_tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param tenantSe set the tenantSe.
     */
    public void setTenantSe(Boolean  tenantSe) {
        this.tenantSe = tenantSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If admin urls are either inaccessible or not to be accessed from avi controller, then set this to false.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useAdminUrl
     */
    public Boolean getUseAdminUrl() {
        return useAdminUrl;
    }

    /**
     * This is the setter method to the attribute.
     * If admin urls are either inaccessible or not to be accessed from avi controller, then set this to false.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useAdminUrl set the useAdminUrl.
     */
    public void setUseAdminUrl(Boolean  useAdminUrl) {
        this.useAdminUrl = useAdminUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Use internalurl for openstack endpoints instead of the default publicurl endpoints.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return useInternalEndpoints
     */
    public Boolean getUseInternalEndpoints() {
        return useInternalEndpoints;
    }

    /**
     * This is the setter method to the attribute.
     * Use internalurl for openstack endpoints instead of the default publicurl endpoints.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param useInternalEndpoints set the useInternalEndpoints.
     */
    public void setUseInternalEndpoints(Boolean  useInternalEndpoints) {
        this.useInternalEndpoints = useInternalEndpoints;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Use keystone for user authentication.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useKeystoneAuth
     */
    public Boolean getUseKeystoneAuth() {
        return useKeystoneAuth;
    }

    /**
     * This is the setter method to the attribute.
     * Use keystone for user authentication.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useKeystoneAuth set the useKeystoneAuth.
     */
    public void setUseKeystoneAuth(Boolean  useKeystoneAuth) {
        this.useKeystoneAuth = useKeystoneAuth;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The username avi vantage will use when authenticating to keystone.
     * For keystone v3, provide the user information in user@domain format, unless that user belongs to the default domain.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * This is the setter method to the attribute.
     * The username avi vantage will use when authenticating to keystone.
     * For keystone v3, provide the user information in user@domain format, unless that user belongs to the default domain.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param username set the username.
     */
    public void setUsername(String  username) {
        this.username = username;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When set to true, vip ports are created in openstack tenant configured as admin_tenant in cloud.
     * Otherwise, default behavior is to create vip ports in user tenant.
     * Field introduced in 21.1.5, 22.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return vipPortInAdminTenant
     */
    public Boolean getVipPortInAdminTenant() {
        return vipPortInAdminTenant;
    }

    /**
     * This is the setter method to the attribute.
     * When set to true, vip ports are created in openstack tenant configured as admin_tenant in cloud.
     * Otherwise, default behavior is to create vip ports in user tenant.
     * Field introduced in 21.1.5, 22.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param vipPortInAdminTenant set the vipPortInAdminTenant.
     */
    public void setVipPortInAdminTenant(Boolean  vipPortInAdminTenant) {
        this.vipPortInAdminTenant = vipPortInAdminTenant;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OpenStackConfiguration objOpenStackConfiguration = (OpenStackConfiguration) o;
      return   Objects.equals(this.username, objOpenStackConfiguration.username)&&
  Objects.equals(this.password, objOpenStackConfiguration.password)&&
  Objects.equals(this.adminTenant, objOpenStackConfiguration.adminTenant)&&
  Objects.equals(this.keystoneHost, objOpenStackConfiguration.keystoneHost)&&
  Objects.equals(this.mgmtNetworkName, objOpenStackConfiguration.mgmtNetworkName)&&
  Objects.equals(this.privilege, objOpenStackConfiguration.privilege)&&
  Objects.equals(this.useKeystoneAuth, objOpenStackConfiguration.useKeystoneAuth)&&
  Objects.equals(this.provName, objOpenStackConfiguration.provName)&&
  Objects.equals(this.mgmtNetworkUuid, objOpenStackConfiguration.mgmtNetworkUuid)&&
  Objects.equals(this.region, objOpenStackConfiguration.region)&&
  Objects.equals(this.hypervisor, objOpenStackConfiguration.hypervisor)&&
  Objects.equals(this.tenantSe, objOpenStackConfiguration.tenantSe)&&
  Objects.equals(this.importKeystoneTenants, objOpenStackConfiguration.importKeystoneTenants)&&
  Objects.equals(this.antiAffinity, objOpenStackConfiguration.antiAffinity)&&
  Objects.equals(this.securityGroups, objOpenStackConfiguration.securityGroups)&&
  Objects.equals(this.allowedAddressPairs, objOpenStackConfiguration.allowedAddressPairs)&&
  Objects.equals(this.freeFloatingips, objOpenStackConfiguration.freeFloatingips)&&
  Objects.equals(this.imgFormat, objOpenStackConfiguration.imgFormat)&&
  Objects.equals(this.useAdminUrl, objOpenStackConfiguration.useAdminUrl)&&
  Objects.equals(this.roleMapping, objOpenStackConfiguration.roleMapping)&&
  Objects.equals(this.useInternalEndpoints, objOpenStackConfiguration.useInternalEndpoints)&&
  Objects.equals(this.adminTenantUuid, objOpenStackConfiguration.adminTenantUuid)&&
  Objects.equals(this.configDrive, objOpenStackConfiguration.configDrive)&&
  Objects.equals(this.authUrl, objOpenStackConfiguration.authUrl)&&
  Objects.equals(this.insecure, objOpenStackConfiguration.insecure)&&
  Objects.equals(this.externalNetworks, objOpenStackConfiguration.externalNetworks)&&
  Objects.equals(this.neutronRbac, objOpenStackConfiguration.neutronRbac)&&
  Objects.equals(this.mapAdminToCloudadmin, objOpenStackConfiguration.mapAdminToCloudadmin)&&
  Objects.equals(this.hypervisorProperties, objOpenStackConfiguration.hypervisorProperties)&&
  Objects.equals(this.contrailPlugin, objOpenStackConfiguration.contrailPlugin)&&
  Objects.equals(this.contrailEndpoint, objOpenStackConfiguration.contrailEndpoint)&&
  Objects.equals(this.nameOwner, objOpenStackConfiguration.nameOwner)&&
  Objects.equals(this.providerVipNetworks, objOpenStackConfiguration.providerVipNetworks)&&
  Objects.equals(this.contrailDisablePolicy, objOpenStackConfiguration.contrailDisablePolicy)&&
  Objects.equals(this.customSeImageProperties, objOpenStackConfiguration.customSeImageProperties)&&
  Objects.equals(this.enableOsObjectCaching, objOpenStackConfiguration.enableOsObjectCaching)&&
  Objects.equals(this.enableTagging, objOpenStackConfiguration.enableTagging)&&
  Objects.equals(this.vipPortInAdminTenant, objOpenStackConfiguration.vipPortInAdminTenant);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OpenStackConfiguration {\n");
                  sb.append("    adminTenant: ").append(toIndentedString(adminTenant)).append("\n");
                        sb.append("    adminTenantUuid: ").append(toIndentedString(adminTenantUuid)).append("\n");
                        sb.append("    allowedAddressPairs: ").append(toIndentedString(allowedAddressPairs)).append("\n");
                        sb.append("    antiAffinity: ").append(toIndentedString(antiAffinity)).append("\n");
                        sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
                        sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
                        sb.append("    contrailDisablePolicy: ").append(toIndentedString(contrailDisablePolicy)).append("\n");
                        sb.append("    contrailEndpoint: ").append(toIndentedString(contrailEndpoint)).append("\n");
                        sb.append("    contrailPlugin: ").append(toIndentedString(contrailPlugin)).append("\n");
                        sb.append("    customSeImageProperties: ").append(toIndentedString(customSeImageProperties)).append("\n");
                        sb.append("    enableOsObjectCaching: ").append(toIndentedString(enableOsObjectCaching)).append("\n");
                        sb.append("    enableTagging: ").append(toIndentedString(enableTagging)).append("\n");
                        sb.append("    externalNetworks: ").append(toIndentedString(externalNetworks)).append("\n");
                        sb.append("    freeFloatingips: ").append(toIndentedString(freeFloatingips)).append("\n");
                        sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
                        sb.append("    hypervisorProperties: ").append(toIndentedString(hypervisorProperties)).append("\n");
                        sb.append("    imgFormat: ").append(toIndentedString(imgFormat)).append("\n");
                        sb.append("    importKeystoneTenants: ").append(toIndentedString(importKeystoneTenants)).append("\n");
                        sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
                        sb.append("    keystoneHost: ").append(toIndentedString(keystoneHost)).append("\n");
                        sb.append("    mapAdminToCloudadmin: ").append(toIndentedString(mapAdminToCloudadmin)).append("\n");
                        sb.append("    mgmtNetworkName: ").append(toIndentedString(mgmtNetworkName)).append("\n");
                        sb.append("    mgmtNetworkUuid: ").append(toIndentedString(mgmtNetworkUuid)).append("\n");
                        sb.append("    nameOwner: ").append(toIndentedString(nameOwner)).append("\n");
                        sb.append("    neutronRbac: ").append(toIndentedString(neutronRbac)).append("\n");
                        sb.append("    password: ").append(toIndentedString(password)).append("\n");
                        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
                        sb.append("    provName: ").append(toIndentedString(provName)).append("\n");
                        sb.append("    providerVipNetworks: ").append(toIndentedString(providerVipNetworks)).append("\n");
                        sb.append("    region: ").append(toIndentedString(region)).append("\n");
                        sb.append("    roleMapping: ").append(toIndentedString(roleMapping)).append("\n");
                        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
                        sb.append("    tenantSe: ").append(toIndentedString(tenantSe)).append("\n");
                        sb.append("    useAdminUrl: ").append(toIndentedString(useAdminUrl)).append("\n");
                        sb.append("    useInternalEndpoints: ").append(toIndentedString(useInternalEndpoints)).append("\n");
                        sb.append("    useKeystoneAuth: ").append(toIndentedString(useKeystoneAuth)).append("\n");
                        sb.append("    username: ").append(toIndentedString(username)).append("\n");
                        sb.append("    vipPortInAdminTenant: ").append(toIndentedString(vipPortInAdminTenant)).append("\n");
                  sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
          return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
}
