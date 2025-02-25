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
 * The GCPConfiguration is a POJO class extends AviRestResource that used for creating
 * GCPConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GCPConfiguration  {
    @JsonProperty("cloud_credentials_ref")
    private String cloudCredentialsRef;

    @JsonProperty("encryption_keys")
    private GCPEncryptionKeys encryptionKeys;

    @JsonProperty("firewall_target_tags")
    private List<String> firewallTargetTags;

    @JsonProperty("gcp_service_account_email")
    private String gcpServiceAccountEmail;

    @JsonProperty("gcs_bucket_name")
    private String gcsBucketName;

    @JsonProperty("gcs_project_id")
    private String gcsProjectId;

    @JsonProperty("network_config")
    private GCPNetworkConfig networkConfig;

    @JsonProperty("region_name")
    private String regionName;

    @JsonProperty("se_project_id")
    private String seProjectId;

    @JsonProperty("vip_allocation_strategy")
    private GCPVIPAllocation vipAllocationStrategy;

    @JsonProperty("zones")
    private List<String> zones;



    /**
     * This is the getter method this will return the attribute value.
     * Credentials to access google cloud platform apis.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudCredentialsRef
     */
    public String getCloudCredentialsRef() {
        return cloudCredentialsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Credentials to access google cloud platform apis.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudCredentialsRef set the cloudCredentialsRef.
     */
    public void setCloudCredentialsRef(String  cloudCredentialsRef) {
        this.cloudCredentialsRef = cloudCredentialsRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Encryption keys for google cloud services.
     * Field introduced in 18.2.10, 20.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return encryptionKeys
     */
    public GCPEncryptionKeys getEncryptionKeys() {
        return encryptionKeys;
    }

    /**
     * This is the setter method to the attribute.
     * Encryption keys for google cloud services.
     * Field introduced in 18.2.10, 20.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param encryptionKeys set the encryptionKeys.
     */
    public void setEncryptionKeys(GCPEncryptionKeys encryptionKeys) {
        this.encryptionKeys = encryptionKeys;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Firewall rule network target tags which will be applied on service engines to allow ingress and egress traffic for service engines.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return firewallTargetTags
     */
    public List<String> getFirewallTargetTags() {
        return firewallTargetTags;
    }

    /**
     * This is the setter method. this will set the firewallTargetTags
     * Firewall rule network target tags which will be applied on service engines to allow ingress and egress traffic for service engines.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return firewallTargetTags
     */
    public void setFirewallTargetTags(List<String>  firewallTargetTags) {
        this.firewallTargetTags = firewallTargetTags;
    }

    /**
     * This is the setter method this will set the firewallTargetTags
     * Firewall rule network target tags which will be applied on service engines to allow ingress and egress traffic for service engines.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return firewallTargetTags
     */
    public GCPConfiguration addFirewallTargetTagsItem(String firewallTargetTagsItem) {
      if (this.firewallTargetTags == null) {
        this.firewallTargetTags = new ArrayList<String>();
      }
      this.firewallTargetTags.add(firewallTargetTagsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Email of gcp service account to be associated to the service engines.
     * Field introduced in 20.1.7, 21.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gcpServiceAccountEmail
     */
    public String getGcpServiceAccountEmail() {
        return gcpServiceAccountEmail;
    }

    /**
     * This is the setter method to the attribute.
     * Email of gcp service account to be associated to the service engines.
     * Field introduced in 20.1.7, 21.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gcpServiceAccountEmail set the gcpServiceAccountEmail.
     */
    public void setGcpServiceAccountEmail(String  gcpServiceAccountEmail) {
        this.gcpServiceAccountEmail = gcpServiceAccountEmail;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Google cloud storage bucket name where service engine image will be uploaded.
     * This image will be deleted once the image is created in google compute images.
     * By default, a bucket will be created if this field is not specified.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gcsBucketName
     */
    public String getGcsBucketName() {
        return gcsBucketName;
    }

    /**
     * This is the setter method to the attribute.
     * Google cloud storage bucket name where service engine image will be uploaded.
     * This image will be deleted once the image is created in google compute images.
     * By default, a bucket will be created if this field is not specified.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gcsBucketName set the gcsBucketName.
     */
    public void setGcsBucketName(String  gcsBucketName) {
        this.gcsBucketName = gcsBucketName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Google cloud storage project id where service engine image will be uploaded.
     * This image will be deleted once the image is created in google compute images.
     * By default, service engine project id will be used.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gcsProjectId
     */
    public String getGcsProjectId() {
        return gcsProjectId;
    }

    /**
     * This is the setter method to the attribute.
     * Google cloud storage project id where service engine image will be uploaded.
     * This image will be deleted once the image is created in google compute images.
     * By default, service engine project id will be used.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gcsProjectId set the gcsProjectId.
     */
    public void setGcsProjectId(String  gcsProjectId) {
        this.gcsProjectId = gcsProjectId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Google cloud platform vpc network configuration for the service engines.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networkConfig
     */
    public GCPNetworkConfig getNetworkConfig() {
        return networkConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Google cloud platform vpc network configuration for the service engines.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param networkConfig set the networkConfig.
     */
    public void setNetworkConfig(GCPNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Google cloud platform region name where service engines will be spawned.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * This is the setter method to the attribute.
     * Google cloud platform region name where service engines will be spawned.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param regionName set the regionName.
     */
    public void setRegionName(String  regionName) {
        this.regionName = regionName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Google cloud platform project id where service engines will be spawned.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seProjectId
     */
    public String getSeProjectId() {
        return seProjectId;
    }

    /**
     * This is the setter method to the attribute.
     * Google cloud platform project id where service engines will be spawned.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seProjectId set the seProjectId.
     */
    public void setSeProjectId(String  seProjectId) {
        this.seProjectId = seProjectId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vip allocation strategy defines how the vips will be created in google cloud.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipAllocationStrategy
     */
    public GCPVIPAllocation getVipAllocationStrategy() {
        return vipAllocationStrategy;
    }

    /**
     * This is the setter method to the attribute.
     * Vip allocation strategy defines how the vips will be created in google cloud.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipAllocationStrategy set the vipAllocationStrategy.
     */
    public void setVipAllocationStrategy(GCPVIPAllocation vipAllocationStrategy) {
        this.vipAllocationStrategy = vipAllocationStrategy;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Google cloud platform zones where service engines will be distributed for ha.
     * Field introduced in 18.2.1.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return zones
     */
    public List<String> getZones() {
        return zones;
    }

    /**
     * This is the setter method. this will set the zones
     * Google cloud platform zones where service engines will be distributed for ha.
     * Field introduced in 18.2.1.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return zones
     */
    public void setZones(List<String>  zones) {
        this.zones = zones;
    }

    /**
     * This is the setter method this will set the zones
     * Google cloud platform zones where service engines will be distributed for ha.
     * Field introduced in 18.2.1.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return zones
     */
    public GCPConfiguration addZonesItem(String zonesItem) {
      if (this.zones == null) {
        this.zones = new ArrayList<String>();
      }
      this.zones.add(zonesItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GCPConfiguration objGCPConfiguration = (GCPConfiguration) o;
      return   Objects.equals(this.cloudCredentialsRef, objGCPConfiguration.cloudCredentialsRef)&&
  Objects.equals(this.regionName, objGCPConfiguration.regionName)&&
  Objects.equals(this.zones, objGCPConfiguration.zones)&&
  Objects.equals(this.seProjectId, objGCPConfiguration.seProjectId)&&
  Objects.equals(this.networkConfig, objGCPConfiguration.networkConfig)&&
  Objects.equals(this.firewallTargetTags, objGCPConfiguration.firewallTargetTags)&&
  Objects.equals(this.gcsProjectId, objGCPConfiguration.gcsProjectId)&&
  Objects.equals(this.gcsBucketName, objGCPConfiguration.gcsBucketName)&&
  Objects.equals(this.vipAllocationStrategy, objGCPConfiguration.vipAllocationStrategy)&&
  Objects.equals(this.encryptionKeys, objGCPConfiguration.encryptionKeys)&&
  Objects.equals(this.gcpServiceAccountEmail, objGCPConfiguration.gcpServiceAccountEmail);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GCPConfiguration {\n");
                  sb.append("    cloudCredentialsRef: ").append(toIndentedString(cloudCredentialsRef)).append("\n");
                        sb.append("    encryptionKeys: ").append(toIndentedString(encryptionKeys)).append("\n");
                        sb.append("    firewallTargetTags: ").append(toIndentedString(firewallTargetTags)).append("\n");
                        sb.append("    gcpServiceAccountEmail: ").append(toIndentedString(gcpServiceAccountEmail)).append("\n");
                        sb.append("    gcsBucketName: ").append(toIndentedString(gcsBucketName)).append("\n");
                        sb.append("    gcsProjectId: ").append(toIndentedString(gcsProjectId)).append("\n");
                        sb.append("    networkConfig: ").append(toIndentedString(networkConfig)).append("\n");
                        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
                        sb.append("    seProjectId: ").append(toIndentedString(seProjectId)).append("\n");
                        sb.append("    vipAllocationStrategy: ").append(toIndentedString(vipAllocationStrategy)).append("\n");
                        sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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
