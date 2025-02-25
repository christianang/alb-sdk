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
 * The Gslb is a POJO class extends AviRestResource that used for creating
 * Gslb.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Gslb extends AviRestResource  {
    @JsonProperty("async_interval")
    private Integer asyncInterval = 0;

    @JsonProperty("clear_on_max_retries")
    private Integer clearOnMaxRetries = 20;

    @JsonProperty("client_ip_addr_group")
    private GslbClientIpAddrGroup clientIpAddrGroup;

    @JsonProperty("description")
    private String description;

    @JsonProperty("dns_configs")
    private List<DNSConfig> dnsConfigs;

    @JsonProperty("enable_config_by_members")
    private Boolean enableConfigByMembers = false;

    @JsonProperty("error_resync_interval")
    private Integer errorResyncInterval = 300;

    @JsonProperty("is_federated")
    private Boolean isFederated = true;

    @JsonProperty("leader_cluster_uuid")
    private String leaderClusterUuid;

    @JsonProperty("maintenance_mode")
    private Boolean maintenanceMode = false;

    @JsonProperty("name")
    private String name;

    @JsonProperty("replication_policy")
    private ReplicationPolicy replicationPolicy;

    @JsonProperty("send_interval")
    private Integer sendInterval = 15;

    @JsonProperty("sites")
    private List<GslbSite> sites;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("tenant_scoped")
    private Boolean tenantScoped = true;

    @JsonProperty("third_party_sites")
    private List<GslbThirdPartySite> thirdPartySites;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("view_id")
    private Integer viewId = 0;



    /**
     * This is the getter method this will return the attribute value.
     * Frequency with which messages are propagated to vs mgr.
     * Value of 0 disables async behavior and rpc are sent inline.
     * Allowed values are 0-5.
     * Field introduced in 18.2.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return asyncInterval
     */
    public Integer getAsyncInterval() {
        return asyncInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency with which messages are propagated to vs mgr.
     * Value of 0 disables async behavior and rpc are sent inline.
     * Allowed values are 0-5.
     * Field introduced in 18.2.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param asyncInterval set the asyncInterval.
     */
    public void setAsyncInterval(Integer  asyncInterval) {
        this.asyncInterval = asyncInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Max retries after which the remote site is treated as a fresh start.
     * In fresh start all the configs are downloaded.
     * Allowed values are 1-1024.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @return clearOnMaxRetries
     */
    public Integer getClearOnMaxRetries() {
        return clearOnMaxRetries;
    }

    /**
     * This is the setter method to the attribute.
     * Max retries after which the remote site is treated as a fresh start.
     * In fresh start all the configs are downloaded.
     * Allowed values are 1-1024.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @param clearOnMaxRetries set the clearOnMaxRetries.
     */
    public void setClearOnMaxRetries(Integer  clearOnMaxRetries) {
        this.clearOnMaxRetries = clearOnMaxRetries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Group to specify if the client ip addresses are public or private.
     * Field introduced in 17.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientIpAddrGroup
     */
    public GslbClientIpAddrGroup getClientIpAddrGroup() {
        return clientIpAddrGroup;
    }

    /**
     * This is the setter method to the attribute.
     * Group to specify if the client ip addresses are public or private.
     * Field introduced in 17.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientIpAddrGroup set the clientIpAddrGroup.
     */
    public void setClientIpAddrGroup(GslbClientIpAddrGroup clientIpAddrGroup) {
        this.clientIpAddrGroup = clientIpAddrGroup;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Sub domain configuration for the gslb.
     * Gslb service's fqdn must be a match one of these subdomains.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsConfigs
     */
    public List<DNSConfig> getDnsConfigs() {
        return dnsConfigs;
    }

    /**
     * This is the setter method. this will set the dnsConfigs
     * Sub domain configuration for the gslb.
     * Gslb service's fqdn must be a match one of these subdomains.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsConfigs
     */
    public void setDnsConfigs(List<DNSConfig>  dnsConfigs) {
        this.dnsConfigs = dnsConfigs;
    }

    /**
     * This is the setter method this will set the dnsConfigs
     * Sub domain configuration for the gslb.
     * Gslb service's fqdn must be a match one of these subdomains.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsConfigs
     */
    public Gslb addDnsConfigsItem(DNSConfig dnsConfigsItem) {
      if (this.dnsConfigs == null) {
        this.dnsConfigs = new ArrayList<DNSConfig>();
      }
      this.dnsConfigs.add(dnsConfigsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allows enable/disable of gslbservice pool groups and pool members from the gslb follower members.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableConfigByMembers
     */
    public Boolean getEnableConfigByMembers() {
        return enableConfigByMembers;
    }

    /**
     * This is the setter method to the attribute.
     * Allows enable/disable of gslbservice pool groups and pool members from the gslb follower members.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableConfigByMembers set the enableConfigByMembers.
     */
    public void setEnableConfigByMembers(Boolean  enableConfigByMembers) {
        this.enableConfigByMembers = enableConfigByMembers;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Frequency with which errored messages are resynced to follower sites.
     * Value of 0 disables resync behavior.
     * Allowed values are 60-3600.
     * Special values are 0 - disable.
     * Field introduced in 18.2.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @return errorResyncInterval
     */
    public Integer getErrorResyncInterval() {
        return errorResyncInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency with which errored messages are resynced to follower sites.
     * Value of 0 disables resync behavior.
     * Allowed values are 60-3600.
     * Special values are 0 - disable.
     * Field introduced in 18.2.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @param errorResyncInterval set the errorResyncInterval.
     */
    public void setErrorResyncInterval(Integer  errorResyncInterval) {
        this.errorResyncInterval = errorResyncInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field indicates that this object is replicated across gslb federation.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return isFederated
     */
    public Boolean getIsFederated() {
        return isFederated;
    }

    /**
     * This is the setter method to the attribute.
     * This field indicates that this object is replicated across gslb federation.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param isFederated set the isFederated.
     */
    public void setIsFederated(Boolean  isFederated) {
        this.isFederated = isFederated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Mark this site as leader of gslb configuration.
     * This site is the one among the avi sites.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return leaderClusterUuid
     */
    public String getLeaderClusterUuid() {
        return leaderClusterUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Mark this site as leader of gslb configuration.
     * This site is the one among the avi sites.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param leaderClusterUuid set the leaderClusterUuid.
     */
    public void setLeaderClusterUuid(String  leaderClusterUuid) {
        this.leaderClusterUuid = leaderClusterUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field disables the configuration operations on the leader for all federated objects.
     * Cud operations on gslb, gslbservice, gslbgeodbprofile and other federated objects will be rejected.
     * The rest-api disabling helps in upgrade scenarios where we don't want configuration sync operations to the gslb member when the member is being
     * upgraded.
     * This configuration programmatically blocks the leader from accepting new gslb configuration when member sites are undergoing upgrade.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return maintenanceMode
     */
    public Boolean getMaintenanceMode() {
        return maintenanceMode;
    }

    /**
     * This is the setter method to the attribute.
     * This field disables the configuration operations on the leader for all federated objects.
     * Cud operations on gslb, gslbservice, gslbgeodbprofile and other federated objects will be rejected.
     * The rest-api disabling helps in upgrade scenarios where we don't want configuration sync operations to the gslb member when the member is being
     * upgraded.
     * This configuration programmatically blocks the leader from accepting new gslb configuration when member sites are undergoing upgrade.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param maintenanceMode set the maintenanceMode.
     */
    public void setMaintenanceMode(Boolean  maintenanceMode) {
        this.maintenanceMode = maintenanceMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name for the gslb object.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name for the gslb object.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Policy for replicating configuration to the active follower sites.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return replicationPolicy
     */
    public ReplicationPolicy getReplicationPolicy() {
        return replicationPolicy;
    }

    /**
     * This is the setter method to the attribute.
     * Policy for replicating configuration to the active follower sites.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param replicationPolicy set the replicationPolicy.
     */
    public void setReplicationPolicy(ReplicationPolicy replicationPolicy) {
        this.replicationPolicy = replicationPolicy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Frequency with which group members communicate.
     * Allowed values are 1-3600.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @return sendInterval
     */
    public Integer getSendInterval() {
        return sendInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency with which group members communicate.
     * Allowed values are 1-3600.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @param sendInterval set the sendInterval.
     */
    public void setSendInterval(Integer  sendInterval) {
        this.sendInterval = sendInterval;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Select avi site member belonging to this gslb.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sites
     */
    public List<GslbSite> getSites() {
        return sites;
    }

    /**
     * This is the setter method. this will set the sites
     * Select avi site member belonging to this gslb.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sites
     */
    public void setSites(List<GslbSite>  sites) {
        this.sites = sites;
    }

    /**
     * This is the setter method this will set the sites
     * Select avi site member belonging to this gslb.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sites
     */
    public Gslb addSitesItem(GslbSite sitesItem) {
      if (this.sites == null) {
        this.sites = new ArrayList<GslbSite>();
      }
      this.sites.add(sitesItem);
      return this;
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
     * This field indicates tenant visibility for gs pool member selection across the gslb federated objects.tenant scope can be set only during the
     * gslb create and cannot be changed once it is set.
     * Field introduced in 18.2.12,20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return tenantScoped
     */
    public Boolean getTenantScoped() {
        return tenantScoped;
    }

    /**
     * This is the setter method to the attribute.
     * This field indicates tenant visibility for gs pool member selection across the gslb federated objects.tenant scope can be set only during the
     * gslb create and cannot be changed once it is set.
     * Field introduced in 18.2.12,20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param tenantScoped set the tenantScoped.
     */
    public void setTenantScoped(Boolean  tenantScoped) {
        this.tenantScoped = tenantScoped;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Third party site member belonging to this gslb.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return thirdPartySites
     */
    public List<GslbThirdPartySite> getThirdPartySites() {
        return thirdPartySites;
    }

    /**
     * This is the setter method. this will set the thirdPartySites
     * Third party site member belonging to this gslb.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return thirdPartySites
     */
    public void setThirdPartySites(List<GslbThirdPartySite>  thirdPartySites) {
        this.thirdPartySites = thirdPartySites;
    }

    /**
     * This is the setter method this will set the thirdPartySites
     * Third party site member belonging to this gslb.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return thirdPartySites
     */
    public Gslb addThirdPartySitesItem(GslbThirdPartySite thirdPartySitesItem) {
      if (this.thirdPartySites == null) {
        this.thirdPartySites = new ArrayList<GslbThirdPartySite>();
      }
      this.thirdPartySites.add(thirdPartySitesItem);
      return this;
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
     * Uuid of the gslb object.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the gslb object.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The view-id is used in change-leader mode to differentiate partitioned groups while they have the same gslb namespace.
     * Each partitioned group will be able to operate independently by using the view-id.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return viewId
     */
    public Integer getViewId() {
        return viewId;
    }

    /**
     * This is the setter method to the attribute.
     * The view-id is used in change-leader mode to differentiate partitioned groups while they have the same gslb namespace.
     * Each partitioned group will be able to operate independently by using the view-id.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param viewId set the viewId.
     */
    public void setViewId(Integer  viewId) {
        this.viewId = viewId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      Gslb objGslb = (Gslb) o;
      return   Objects.equals(this.uuid, objGslb.uuid)&&
  Objects.equals(this.name, objGslb.name)&&
  Objects.equals(this.dnsConfigs, objGslb.dnsConfigs)&&
  Objects.equals(this.sites, objGslb.sites)&&
  Objects.equals(this.leaderClusterUuid, objGslb.leaderClusterUuid)&&
  Objects.equals(this.sendInterval, objGslb.sendInterval)&&
  Objects.equals(this.clearOnMaxRetries, objGslb.clearOnMaxRetries)&&
  Objects.equals(this.viewId, objGslb.viewId)&&
  Objects.equals(this.thirdPartySites, objGslb.thirdPartySites)&&
  Objects.equals(this.clientIpAddrGroup, objGslb.clientIpAddrGroup)&&
  Objects.equals(this.asyncInterval, objGslb.asyncInterval)&&
  Objects.equals(this.errorResyncInterval, objGslb.errorResyncInterval)&&
  Objects.equals(this.replicationPolicy, objGslb.replicationPolicy)&&
  Objects.equals(this.maintenanceMode, objGslb.maintenanceMode)&&
  Objects.equals(this.isFederated, objGslb.isFederated)&&
  Objects.equals(this.description, objGslb.description)&&
  Objects.equals(this.tenantRef, objGslb.tenantRef)&&
  Objects.equals(this.tenantScoped, objGslb.tenantScoped)&&
  Objects.equals(this.enableConfigByMembers, objGslb.enableConfigByMembers);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Gslb {\n");
                  sb.append("    asyncInterval: ").append(toIndentedString(asyncInterval)).append("\n");
                        sb.append("    clearOnMaxRetries: ").append(toIndentedString(clearOnMaxRetries)).append("\n");
                        sb.append("    clientIpAddrGroup: ").append(toIndentedString(clientIpAddrGroup)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    dnsConfigs: ").append(toIndentedString(dnsConfigs)).append("\n");
                        sb.append("    enableConfigByMembers: ").append(toIndentedString(enableConfigByMembers)).append("\n");
                        sb.append("    errorResyncInterval: ").append(toIndentedString(errorResyncInterval)).append("\n");
                        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
                        sb.append("    leaderClusterUuid: ").append(toIndentedString(leaderClusterUuid)).append("\n");
                        sb.append("    maintenanceMode: ").append(toIndentedString(maintenanceMode)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    replicationPolicy: ").append(toIndentedString(replicationPolicy)).append("\n");
                        sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
                        sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    tenantScoped: ").append(toIndentedString(tenantScoped)).append("\n");
                        sb.append("    thirdPartySites: ").append(toIndentedString(thirdPartySites)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
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
