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
 * The AzureConfiguration is a POJO class extends AviRestResource that used for creating
 * AzureConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AzureConfiguration  {
    @JsonProperty("availability_zones")
    private List<String> availabilityZones;

    @JsonProperty("cloud_credentials_ref")
    private String cloudCredentialsRef;

    @JsonProperty("des_id")
    private String desId;

    @JsonProperty("location")
    private String location;

    @JsonProperty("network_info")
    private List<AzureNetworkInfo> networkInfo;

    @JsonProperty("resource_group")
    private String resourceGroup;

    @JsonProperty("se_storage_account")
    private String seStorageAccount;

    @JsonProperty("subscription_id")
    private String subscriptionId;

    @JsonProperty("use_azure_dns")
    private Boolean useAzureDns = false;

    @JsonProperty("use_enhanced_ha")
    private Boolean useEnhancedHa = false;

    @JsonProperty("use_managed_disks")
    private Boolean useManagedDisks = true;

    @JsonProperty("use_standard_alb")
    private Boolean useStandardAlb = true;


    /**
     * This is the getter method this will return the attribute value.
     * Availability zones to be used in azure.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return availabilityZones
     */
    public List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * This is the setter method. this will set the availabilityZones
     * Availability zones to be used in azure.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return availabilityZones
     */
    public void setAvailabilityZones(List<String>  availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    /**
     * This is the setter method this will set the availabilityZones
     * Availability zones to be used in azure.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return availabilityZones
     */
    public AzureConfiguration addAvailabilityZonesItem(String availabilityZonesItem) {
      if (this.availabilityZones == null) {
        this.availabilityZones = new ArrayList<String>();
      }
      this.availabilityZones.add(availabilityZonesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Credentials to access azure cloud.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudCredentialsRef
     */
    public String getCloudCredentialsRef() {
        return cloudCredentialsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Credentials to access azure cloud.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudCredentialsRef set the cloudCredentialsRef.
     */
    public void setCloudCredentialsRef(String  cloudCredentialsRef) {
        this.cloudCredentialsRef = cloudCredentialsRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Disks encryption set resource-id (des_id) to encrypt se image and managed disk using customer-managed-keys.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return desId
     */
    public String getDesId() {
        return desId;
    }

    /**
     * This is the setter method to the attribute.
     * Disks encryption set resource-id (des_id) to encrypt se image and managed disk using customer-managed-keys.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param desId set the desId.
     */
    public void setDesId(String  desId) {
        this.desId = desId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Azure location where this cloud will be located.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * This is the setter method to the attribute.
     * Azure location where this cloud will be located.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param location set the location.
     */
    public void setLocation(String  location) {
        this.location = location;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Azure virtual network and subnet information.
     * Field introduced in 17.2.1.
     * Minimum of 1 items required.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networkInfo
     */
    public List<AzureNetworkInfo> getNetworkInfo() {
        return networkInfo;
    }

    /**
     * This is the setter method. this will set the networkInfo
     * Azure virtual network and subnet information.
     * Field introduced in 17.2.1.
     * Minimum of 1 items required.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networkInfo
     */
    public void setNetworkInfo(List<AzureNetworkInfo>  networkInfo) {
        this.networkInfo = networkInfo;
    }

    /**
     * This is the setter method this will set the networkInfo
     * Azure virtual network and subnet information.
     * Field introduced in 17.2.1.
     * Minimum of 1 items required.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networkInfo
     */
    public AzureConfiguration addNetworkInfoItem(AzureNetworkInfo networkInfoItem) {
      if (this.networkInfo == null) {
        this.networkInfo = new ArrayList<AzureNetworkInfo>();
      }
      this.networkInfo.add(networkInfoItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Azure resource group dedicated for avi controller.
     * Avi controller will create all its resources in this resource group.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * This is the setter method to the attribute.
     * Azure resource group dedicated for avi controller.
     * Avi controller will create all its resources in this resource group.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resourceGroup set the resourceGroup.
     */
    public void setResourceGroup(String  resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Storage account to be used for uploading se vhd images to azure.
     * Must include the resource group name.
     * Format '<resource-group> <storage-account-name>'.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seStorageAccount
     */
    public String getSeStorageAccount() {
        return seStorageAccount;
    }

    /**
     * This is the setter method to the attribute.
     * Storage account to be used for uploading se vhd images to azure.
     * Must include the resource group name.
     * Format '<resource-group> <storage-account-name>'.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seStorageAccount set the seStorageAccount.
     */
    public void setSeStorageAccount(String  seStorageAccount) {
        this.seStorageAccount = seStorageAccount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Subscription id for the azure subscription.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * This is the setter method to the attribute.
     * Subscription id for the azure subscription.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subscriptionId set the subscriptionId.
     */
    public void setSubscriptionId(String  subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Azure is the dns provider.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return useAzureDns
     */
    public Boolean getUseAzureDns() {
        return useAzureDns;
    }

    /**
     * This is the setter method to the attribute.
     * Azure is the dns provider.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param useAzureDns set the useAzureDns.
     */
    public void setUseAzureDns(Boolean  useAzureDns) {
        this.useAzureDns = useAzureDns;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Use azure's enhanced ha features.
     * This needs a public ip to be associated with the vip.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return useEnhancedHa
     */
    public Boolean getUseEnhancedHa() {
        return useEnhancedHa;
    }

    /**
     * This is the setter method to the attribute.
     * Use azure's enhanced ha features.
     * This needs a public ip to be associated with the vip.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param useEnhancedHa set the useEnhancedHa.
     */
    public void setUseEnhancedHa(Boolean  useEnhancedHa) {
        this.useEnhancedHa = useEnhancedHa;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Use azure managed disks for se storage.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useManagedDisks
     */
    public Boolean getUseManagedDisks() {
        return useManagedDisks;
    }

    /**
     * This is the setter method to the attribute.
     * Use azure managed disks for se storage.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useManagedDisks set the useManagedDisks.
     */
    public void setUseManagedDisks(Boolean  useManagedDisks) {
        this.useManagedDisks = useManagedDisks;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Use standard sku azure load balancer.
     * By default standard sku load balancer is used.
     * Field introduced in 17.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useStandardAlb
     */
    public Boolean getUseStandardAlb() {
        return useStandardAlb;
    }

    /**
     * This is the setter method to the attribute.
     * Use standard sku azure load balancer.
     * By default standard sku load balancer is used.
     * Field introduced in 17.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useStandardAlb set the useStandardAlb.
     */
    public void setUseStandardAlb(Boolean  useStandardAlb) {
        this.useStandardAlb = useStandardAlb;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AzureConfiguration objAzureConfiguration = (AzureConfiguration) o;
      return   Objects.equals(this.subscriptionId, objAzureConfiguration.subscriptionId)&&
  Objects.equals(this.cloudCredentialsRef, objAzureConfiguration.cloudCredentialsRef)&&
  Objects.equals(this.location, objAzureConfiguration.location)&&
  Objects.equals(this.networkInfo, objAzureConfiguration.networkInfo)&&
  Objects.equals(this.resourceGroup, objAzureConfiguration.resourceGroup)&&
  Objects.equals(this.useAzureDns, objAzureConfiguration.useAzureDns)&&
  Objects.equals(this.useEnhancedHa, objAzureConfiguration.useEnhancedHa)&&
  Objects.equals(this.useManagedDisks, objAzureConfiguration.useManagedDisks)&&
  Objects.equals(this.availabilityZones, objAzureConfiguration.availabilityZones)&&
  Objects.equals(this.useStandardAlb, objAzureConfiguration.useStandardAlb)&&
  Objects.equals(this.desId, objAzureConfiguration.desId)&&
  Objects.equals(this.seStorageAccount, objAzureConfiguration.seStorageAccount);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AzureConfiguration {\n");
                  sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
                        sb.append("    cloudCredentialsRef: ").append(toIndentedString(cloudCredentialsRef)).append("\n");
                        sb.append("    desId: ").append(toIndentedString(desId)).append("\n");
                        sb.append("    location: ").append(toIndentedString(location)).append("\n");
                        sb.append("    networkInfo: ").append(toIndentedString(networkInfo)).append("\n");
                        sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
                        sb.append("    seStorageAccount: ").append(toIndentedString(seStorageAccount)).append("\n");
                        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
                        sb.append("    useAzureDns: ").append(toIndentedString(useAzureDns)).append("\n");
                        sb.append("    useEnhancedHa: ").append(toIndentedString(useEnhancedHa)).append("\n");
                        sb.append("    useManagedDisks: ").append(toIndentedString(useManagedDisks)).append("\n");
                        sb.append("    useStandardAlb: ").append(toIndentedString(useStandardAlb)).append("\n");
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
