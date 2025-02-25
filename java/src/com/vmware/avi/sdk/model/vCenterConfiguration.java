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
 * The vCenterConfiguration is a POJO class extends AviRestResource that used for creating
 * vCenterConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class vCenterConfiguration  {
    @JsonProperty("content_lib")
    private ContentLibConfig contentLib;

    @JsonProperty("datacenter")
    private String datacenter;

    @JsonProperty("datacenter_managed_object_id")
    private String datacenterManagedObjectId;

    @JsonProperty("deactivate_vm_discovery")
    private Boolean deactivateVmDiscovery;

    @JsonProperty("is_nsx_environment")
    private Boolean isNsxEnvironment = false;

    @JsonProperty("management_ip_subnet")
    private IpAddrPrefix managementIpSubnet;

    @JsonProperty("management_network")
    private String managementNetwork;

    @JsonProperty("password")
    private String password;

    @JsonProperty("privilege")
    private String privilege = "WRITE_ACCESS";

    @JsonProperty("use_content_lib")
    private Boolean useContentLib = true;

    @JsonProperty("username")
    private String username;

    @JsonProperty("vcenter_template_se_location")
    private String vcenterTemplateSeLocation;

    @JsonProperty("vcenter_url")
    private String vcenterUrl;



    /**
     * This is the getter method this will return the attribute value.
     * Vcenter content library where service engine images are stored.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return contentLib
     */
    public ContentLibConfig getContentLib() {
        return contentLib;
    }

    /**
     * This is the setter method to the attribute.
     * Vcenter content library where service engine images are stored.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param contentLib set the contentLib.
     */
    public void setContentLib(ContentLibConfig contentLib) {
        this.contentLib = contentLib;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Datacenter for virtual infrastructure discovery.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return datacenter
     */
    public String getDatacenter() {
        return datacenter;
    }

    /**
     * This is the setter method to the attribute.
     * Datacenter for virtual infrastructure discovery.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param datacenter set the datacenter.
     */
    public void setDatacenter(String  datacenter) {
        this.datacenter = datacenter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Managed object id of the datacenter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return datacenterManagedObjectId
     */
    public String getDatacenterManagedObjectId() {
        return datacenterManagedObjectId;
    }

    /**
     * This is the setter method to the attribute.
     * Managed object id of the datacenter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param datacenterManagedObjectId set the datacenterManagedObjectId.
     */
    public void setDatacenterManagedObjectId(String  datacenterManagedObjectId) {
        this.datacenterManagedObjectId = datacenterManagedObjectId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, vm's on the vcenter will not be discovered.set it to true if there are more than 10000 vms in the datacenter.
     * Field deprecated in 30.1.1.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * @return deactivateVmDiscovery
     */
    public Boolean getDeactivateVmDiscovery() {
        return deactivateVmDiscovery;
    }

    /**
     * This is the setter method to the attribute.
     * If true, vm's on the vcenter will not be discovered.set it to true if there are more than 10000 vms in the datacenter.
     * Field deprecated in 30.1.1.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * @param deactivateVmDiscovery set the deactivateVmDiscovery.
     */
    public void setDeactivateVmDiscovery(Boolean  deactivateVmDiscovery) {
        this.deactivateVmDiscovery = deactivateVmDiscovery;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, nsx-t segment spanning multiple vds with vcenter cloud are merged to a single network in avi.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return isNsxEnvironment
     */
    public Boolean getIsNsxEnvironment() {
        return isNsxEnvironment;
    }

    /**
     * This is the setter method to the attribute.
     * If true, nsx-t segment spanning multiple vds with vcenter cloud are merged to a single network in avi.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param isNsxEnvironment set the isNsxEnvironment.
     */
    public void setIsNsxEnvironment(Boolean  isNsxEnvironment) {
        this.isNsxEnvironment = isNsxEnvironment;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Management subnet to use for avi service engines.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return managementIpSubnet
     */
    public IpAddrPrefix getManagementIpSubnet() {
        return managementIpSubnet;
    }

    /**
     * This is the setter method to the attribute.
     * Management subnet to use for avi service engines.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param managementIpSubnet set the managementIpSubnet.
     */
    public void setManagementIpSubnet(IpAddrPrefix managementIpSubnet) {
        this.managementIpSubnet = managementIpSubnet;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Management network to use for avi service engines.
     * It is a reference to an object of type vimgrnwruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return managementNetwork
     */
    public String getManagementNetwork() {
        return managementNetwork;
    }

    /**
     * This is the setter method to the attribute.
     * Management network to use for avi service engines.
     * It is a reference to an object of type vimgrnwruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param managementNetwork set the managementNetwork.
     */
    public void setManagementNetwork(String  managementNetwork) {
        this.managementNetwork = managementNetwork;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The password avi vantage will use when authenticating with vcenter.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This is the setter method to the attribute.
     * The password avi vantage will use when authenticating with vcenter.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param password set the password.
     */
    public void setPassword(String  password) {
        this.password = password;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set the access mode to vcenter as either read, which allows avi to discover networks and servers, or write, which also allows avi to create
     * service engines and configure their network properties.
     * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WRITE_ACCESS".
     * @return privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * This is the setter method to the attribute.
     * Set the access mode to vcenter as either read, which allows avi to discover networks and servers, or write, which also allows avi to create
     * service engines and configure their network properties.
     * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WRITE_ACCESS".
     * @param privilege set the privilege.
     */
    public void setPrivilege(String  privilege) {
        this.privilege = privilege;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If false, service engine image will not be pushed to content library.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useContentLib
     */
    public Boolean getUseContentLib() {
        return useContentLib;
    }

    /**
     * This is the setter method to the attribute.
     * If false, service engine image will not be pushed to content library.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useContentLib set the useContentLib.
     */
    public void setUseContentLib(Boolean  useContentLib) {
        this.useContentLib = useContentLib;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The username avi vantage will use when authenticating with vcenter.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * This is the setter method to the attribute.
     * The username avi vantage will use when authenticating with vcenter.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param username set the username.
     */
    public void setUsername(String  username) {
        this.username = username;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Avi service engine template in vcenter to be used for creating service engines.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterTemplateSeLocation
     */
    public String getVcenterTemplateSeLocation() {
        return vcenterTemplateSeLocation;
    }

    /**
     * This is the setter method to the attribute.
     * Avi service engine template in vcenter to be used for creating service engines.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterTemplateSeLocation set the vcenterTemplateSeLocation.
     */
    public void setVcenterTemplateSeLocation(String  vcenterTemplateSeLocation) {
        this.vcenterTemplateSeLocation = vcenterTemplateSeLocation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vcenter hostname or ip address.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterUrl
     */
    public String getVcenterUrl() {
        return vcenterUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Vcenter hostname or ip address.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterUrl set the vcenterUrl.
     */
    public void setVcenterUrl(String  vcenterUrl) {
        this.vcenterUrl = vcenterUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      vCenterConfiguration objvCenterConfiguration = (vCenterConfiguration) o;
      return   Objects.equals(this.username, objvCenterConfiguration.username)&&
  Objects.equals(this.password, objvCenterConfiguration.password)&&
  Objects.equals(this.vcenterUrl, objvCenterConfiguration.vcenterUrl)&&
  Objects.equals(this.privilege, objvCenterConfiguration.privilege)&&
  Objects.equals(this.datacenter, objvCenterConfiguration.datacenter)&&
  Objects.equals(this.managementNetwork, objvCenterConfiguration.managementNetwork)&&
  Objects.equals(this.managementIpSubnet, objvCenterConfiguration.managementIpSubnet)&&
  Objects.equals(this.vcenterTemplateSeLocation, objvCenterConfiguration.vcenterTemplateSeLocation)&&
  Objects.equals(this.deactivateVmDiscovery, objvCenterConfiguration.deactivateVmDiscovery)&&
  Objects.equals(this.useContentLib, objvCenterConfiguration.useContentLib)&&
  Objects.equals(this.contentLib, objvCenterConfiguration.contentLib)&&
  Objects.equals(this.isNsxEnvironment, objvCenterConfiguration.isNsxEnvironment)&&
  Objects.equals(this.datacenterManagedObjectId, objvCenterConfiguration.datacenterManagedObjectId);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class vCenterConfiguration {\n");
                  sb.append("    contentLib: ").append(toIndentedString(contentLib)).append("\n");
                        sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
                        sb.append("    datacenterManagedObjectId: ").append(toIndentedString(datacenterManagedObjectId)).append("\n");
                        sb.append("    deactivateVmDiscovery: ").append(toIndentedString(deactivateVmDiscovery)).append("\n");
                        sb.append("    isNsxEnvironment: ").append(toIndentedString(isNsxEnvironment)).append("\n");
                        sb.append("    managementIpSubnet: ").append(toIndentedString(managementIpSubnet)).append("\n");
                        sb.append("    managementNetwork: ").append(toIndentedString(managementNetwork)).append("\n");
                        sb.append("    password: ").append(toIndentedString(password)).append("\n");
                        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
                        sb.append("    useContentLib: ").append(toIndentedString(useContentLib)).append("\n");
                        sb.append("    username: ").append(toIndentedString(username)).append("\n");
                        sb.append("    vcenterTemplateSeLocation: ").append(toIndentedString(vcenterTemplateSeLocation)).append("\n");
                        sb.append("    vcenterUrl: ").append(toIndentedString(vcenterUrl)).append("\n");
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
