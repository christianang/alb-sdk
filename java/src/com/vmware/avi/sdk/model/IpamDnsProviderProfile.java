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
 * The IpamDnsProviderProfile is a POJO class extends AviRestResource that used for creating
 * IpamDnsProviderProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpamDnsProviderProfile extends AviRestResource  {
    @JsonProperty("allocate_ip_in_vrf")
    private Boolean allocateIpInVrf = false;

    @JsonProperty("aws_profile")
    private IpamDnsAwsProfile awsProfile;

    @JsonProperty("azure_profile")
    private IpamDnsAzureProfile azureProfile;

    @JsonProperty("custom_profile")
    private IpamDnsCustomProfile customProfile;

    @JsonProperty("gcp_profile")
    private IpamDnsGCPProfile gcpProfile;

    @JsonProperty("infoblox_profile")
    private IpamDnsInfobloxProfile infobloxProfile;

    @JsonProperty("internal_profile")
    private IpamDnsInternalProfile internalProfile;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("oci_profile")
    private IpamDnsOCIProfile ociProfile;

    @JsonProperty("openstack_profile")
    private IpamDnsOpenstackProfile openstackProfile;

    @JsonProperty("proxy_configuration")
    private ProxyConfiguration proxyConfiguration;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("tencent_profile")
    private IpamDnsTencentProfile tencentProfile;

    @JsonProperty("type")
    private String type;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * If this flag is set, only allocate ip from networks in the virtual service vrf.
     * Applicable for avi vantage ipam only.
     * Field introduced in 17.2.4.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return allocateIpInVrf
     */
    public Boolean getAllocateIpInVrf() {
        return allocateIpInVrf;
    }

    /**
     * This is the setter method to the attribute.
     * If this flag is set, only allocate ip from networks in the virtual service vrf.
     * Applicable for avi vantage ipam only.
     * Field introduced in 17.2.4.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param allocateIpInVrf set the allocateIpInVrf.
     */
    public void setAllocateIpInVrf(Boolean  allocateIpInVrf) {
        this.allocateIpInVrf = allocateIpInVrf;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Provider details if type is aws.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return awsProfile
     */
    public IpamDnsAwsProfile getAwsProfile() {
        return awsProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Provider details if type is aws.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param awsProfile set the awsProfile.
     */
    public void setAwsProfile(IpamDnsAwsProfile awsProfile) {
        this.awsProfile = awsProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Provider details if type is microsoft azure.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return azureProfile
     */
    public IpamDnsAzureProfile getAzureProfile() {
        return azureProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Provider details if type is microsoft azure.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param azureProfile set the azureProfile.
     */
    public void setAzureProfile(IpamDnsAzureProfile azureProfile) {
        this.azureProfile = azureProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Provider details if type is custom.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customProfile
     */
    public IpamDnsCustomProfile getCustomProfile() {
        return customProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Provider details if type is custom.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param customProfile set the customProfile.
     */
    public void setCustomProfile(IpamDnsCustomProfile customProfile) {
        this.customProfile = customProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Provider details if type is google cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gcpProfile
     */
    public IpamDnsGCPProfile getGcpProfile() {
        return gcpProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Provider details if type is google cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gcpProfile set the gcpProfile.
     */
    public void setGcpProfile(IpamDnsGCPProfile gcpProfile) {
        this.gcpProfile = gcpProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Provider details if type is infoblox.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return infobloxProfile
     */
    public IpamDnsInfobloxProfile getInfobloxProfile() {
        return infobloxProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Provider details if type is infoblox.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param infobloxProfile set the infobloxProfile.
     */
    public void setInfobloxProfile(IpamDnsInfobloxProfile infobloxProfile) {
        this.infobloxProfile = infobloxProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Provider details if type is avi.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return internalProfile
     */
    public IpamDnsInternalProfile getInternalProfile() {
        return internalProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Provider details if type is avi.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param internalProfile set the internalProfile.
     */
    public void setInternalProfile(IpamDnsInternalProfile internalProfile) {
        this.internalProfile = internalProfile;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public List<RoleFilterMatchLabel> getMarkers() {
        return markers;
    }

    /**
     * This is the setter method. this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public void setMarkers(List<RoleFilterMatchLabel>  markers) {
        this.markers = markers;
    }

    /**
     * This is the setter method this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public IpamDnsProviderProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name for the ipam/dns provider profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name for the ipam/dns provider profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Provider details for oracle cloud.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ociProfile
     */
    public IpamDnsOCIProfile getOciProfile() {
        return ociProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Provider details for oracle cloud.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ociProfile set the ociProfile.
     */
    public void setOciProfile(IpamDnsOCIProfile ociProfile) {
        this.ociProfile = ociProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Provider details if type is openstack.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return openstackProfile
     */
    public IpamDnsOpenstackProfile getOpenstackProfile() {
        return openstackProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Provider details if type is openstack.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param openstackProfile set the openstackProfile.
     */
    public void setOpenstackProfile(IpamDnsOpenstackProfile openstackProfile) {
        this.openstackProfile = openstackProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return proxyConfiguration
     */
    public ProxyConfiguration getProxyConfiguration() {
        return proxyConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param proxyConfiguration set the proxyConfiguration.
     */
    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Provider details for tencent cloud.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tencentProfile
     */
    public IpamDnsTencentProfile getTencentProfile() {
        return tencentProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Provider details for tencent cloud.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tencentProfile set the tencentProfile.
     */
    public void setTencentProfile(IpamDnsTencentProfile tencentProfile) {
        this.tencentProfile = tencentProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Provider type for the ipam/dns provider profile.
     * Enum options - IPAMDNS_TYPE_INFOBLOX, IPAMDNS_TYPE_AWS, IPAMDNS_TYPE_OPENSTACK, IPAMDNS_TYPE_GCP, IPAMDNS_TYPE_INFOBLOX_DNS, IPAMDNS_TYPE_CUSTOM,
     * IPAMDNS_TYPE_CUSTOM_DNS, IPAMDNS_TYPE_AZURE, IPAMDNS_TYPE_OCI, IPAMDNS_TYPE_TENCENT, IPAMDNS_TYPE_INTERNAL, IPAMDNS_TYPE_INTERNAL_DNS,
     * IPAMDNS_TYPE_AWS_DNS, IPAMDNS_TYPE_AZURE_DNS.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- ipamdns_type_internal), basic edition(allowed values-
     * ipamdns_type_internal), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Provider type for the ipam/dns provider profile.
     * Enum options - IPAMDNS_TYPE_INFOBLOX, IPAMDNS_TYPE_AWS, IPAMDNS_TYPE_OPENSTACK, IPAMDNS_TYPE_GCP, IPAMDNS_TYPE_INFOBLOX_DNS, IPAMDNS_TYPE_CUSTOM,
     * IPAMDNS_TYPE_CUSTOM_DNS, IPAMDNS_TYPE_AZURE, IPAMDNS_TYPE_OCI, IPAMDNS_TYPE_TENCENT, IPAMDNS_TYPE_INTERNAL, IPAMDNS_TYPE_INTERNAL_DNS,
     * IPAMDNS_TYPE_AWS_DNS, IPAMDNS_TYPE_AZURE_DNS.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- ipamdns_type_internal), basic edition(allowed values-
     * ipamdns_type_internal), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the ipam/dns provider profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the ipam/dns provider profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      IpamDnsProviderProfile objIpamDnsProviderProfile = (IpamDnsProviderProfile) o;
      return   Objects.equals(this.uuid, objIpamDnsProviderProfile.uuid)&&
  Objects.equals(this.name, objIpamDnsProviderProfile.name)&&
  Objects.equals(this.type, objIpamDnsProviderProfile.type)&&
  Objects.equals(this.infobloxProfile, objIpamDnsProviderProfile.infobloxProfile)&&
  Objects.equals(this.awsProfile, objIpamDnsProviderProfile.awsProfile)&&
  Objects.equals(this.openstackProfile, objIpamDnsProviderProfile.openstackProfile)&&
  Objects.equals(this.internalProfile, objIpamDnsProviderProfile.internalProfile)&&
  Objects.equals(this.gcpProfile, objIpamDnsProviderProfile.gcpProfile)&&
  Objects.equals(this.customProfile, objIpamDnsProviderProfile.customProfile)&&
  Objects.equals(this.azureProfile, objIpamDnsProviderProfile.azureProfile)&&
  Objects.equals(this.ociProfile, objIpamDnsProviderProfile.ociProfile)&&
  Objects.equals(this.tencentProfile, objIpamDnsProviderProfile.tencentProfile)&&
  Objects.equals(this.proxyConfiguration, objIpamDnsProviderProfile.proxyConfiguration)&&
  Objects.equals(this.allocateIpInVrf, objIpamDnsProviderProfile.allocateIpInVrf)&&
  Objects.equals(this.markers, objIpamDnsProviderProfile.markers)&&
  Objects.equals(this.tenantRef, objIpamDnsProviderProfile.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IpamDnsProviderProfile {\n");
                  sb.append("    allocateIpInVrf: ").append(toIndentedString(allocateIpInVrf)).append("\n");
                        sb.append("    awsProfile: ").append(toIndentedString(awsProfile)).append("\n");
                        sb.append("    azureProfile: ").append(toIndentedString(azureProfile)).append("\n");
                        sb.append("    customProfile: ").append(toIndentedString(customProfile)).append("\n");
                        sb.append("    gcpProfile: ").append(toIndentedString(gcpProfile)).append("\n");
                        sb.append("    infobloxProfile: ").append(toIndentedString(infobloxProfile)).append("\n");
                        sb.append("    internalProfile: ").append(toIndentedString(internalProfile)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    ociProfile: ").append(toIndentedString(ociProfile)).append("\n");
                        sb.append("    openstackProfile: ").append(toIndentedString(openstackProfile)).append("\n");
                        sb.append("    proxyConfiguration: ").append(toIndentedString(proxyConfiguration)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    tencentProfile: ").append(toIndentedString(tencentProfile)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
