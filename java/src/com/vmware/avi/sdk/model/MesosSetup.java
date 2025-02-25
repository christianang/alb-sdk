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
 * The MesosSetup is a POJO class extends AviRestResource that used for creating
 * MesosSetup.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MesosSetup  {
    @JsonProperty("cc_id")
    private String ccId;

    @JsonProperty("failed_hosts")
    private List<String> failedHosts;

    @JsonProperty("fleet_endpoint")
    private String fleetEndpoint;

    @JsonProperty("hosts")
    private List<String> hosts;

    @JsonProperty("mesos_access")
    private Boolean mesosAccess;

    @JsonProperty("mesos_url")
    private String mesosUrl;

    @JsonProperty("missing_hosts")
    private List<String> missingHosts;

    @JsonProperty("new_hosts")
    private List<String> newHosts;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("se_deploy_method_access")
    private Boolean seDeployMethodAccess;

    @JsonProperty("se_name")
    private String seName;

    @JsonProperty("version")
    private String version;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccId
     */
    public String getCcId() {
        return ccId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccId set the ccId.
     */
    public void setCcId(String  ccId) {
        this.ccId = ccId;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return failedHosts
     */
    public List<String> getFailedHosts() {
        return failedHosts;
    }

    /**
     * This is the setter method. this will set the failedHosts
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return failedHosts
     */
    public void setFailedHosts(List<String>  failedHosts) {
        this.failedHosts = failedHosts;
    }

    /**
     * This is the setter method this will set the failedHosts
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return failedHosts
     */
    public MesosSetup addFailedHostsItem(String failedHostsItem) {
      if (this.failedHosts == null) {
        this.failedHosts = new ArrayList<String>();
      }
      this.failedHosts.add(failedHostsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fleetEndpoint
     */
    public String getFleetEndpoint() {
        return fleetEndpoint;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fleetEndpoint set the fleetEndpoint.
     */
    public void setFleetEndpoint(String  fleetEndpoint) {
        this.fleetEndpoint = fleetEndpoint;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    /**
     * This is the setter method. this will set the hosts
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hosts
     */
    public void setHosts(List<String>  hosts) {
        this.hosts = hosts;
    }

    /**
     * This is the setter method this will set the hosts
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hosts
     */
    public MesosSetup addHostsItem(String hostsItem) {
      if (this.hosts == null) {
        this.hosts = new ArrayList<String>();
      }
      this.hosts.add(hostsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mesosAccess
     */
    public Boolean getMesosAccess() {
        return mesosAccess;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mesosAccess set the mesosAccess.
     */
    public void setMesosAccess(Boolean  mesosAccess) {
        this.mesosAccess = mesosAccess;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mesosUrl
     */
    public String getMesosUrl() {
        return mesosUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mesosUrl set the mesosUrl.
     */
    public void setMesosUrl(String  mesosUrl) {
        this.mesosUrl = mesosUrl;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return missingHosts
     */
    public List<String> getMissingHosts() {
        return missingHosts;
    }

    /**
     * This is the setter method. this will set the missingHosts
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return missingHosts
     */
    public void setMissingHosts(List<String>  missingHosts) {
        this.missingHosts = missingHosts;
    }

    /**
     * This is the setter method this will set the missingHosts
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return missingHosts
     */
    public MesosSetup addMissingHostsItem(String missingHostsItem) {
      if (this.missingHosts == null) {
        this.missingHosts = new ArrayList<String>();
      }
      this.missingHosts.add(missingHostsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return newHosts
     */
    public List<String> getNewHosts() {
        return newHosts;
    }

    /**
     * This is the setter method. this will set the newHosts
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return newHosts
     */
    public void setNewHosts(List<String>  newHosts) {
        this.newHosts = newHosts;
    }

    /**
     * This is the setter method this will set the newHosts
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return newHosts
     */
    public MesosSetup addNewHostsItem(String newHostsItem) {
      if (this.newHosts == null) {
        this.newHosts = new ArrayList<String>();
      }
      this.newHosts.add(newHostsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDeployMethodAccess
     */
    public Boolean getSeDeployMethodAccess() {
        return seDeployMethodAccess;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seDeployMethodAccess set the seDeployMethodAccess.
     */
    public void setSeDeployMethodAccess(Boolean  seDeployMethodAccess) {
        this.seDeployMethodAccess = seDeployMethodAccess;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seName
     */
    public String getSeName() {
        return seName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seName set the seName.
     */
    public void setSeName(String  seName) {
        this.seName = seName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param version set the version.
     */
    public void setVersion(String  version) {
        this.version = version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MesosSetup objMesosSetup = (MesosSetup) o;
      return   Objects.equals(this.ccId, objMesosSetup.ccId)&&
  Objects.equals(this.mesosUrl, objMesosSetup.mesosUrl)&&
  Objects.equals(this.mesosAccess, objMesosSetup.mesosAccess)&&
  Objects.equals(this.fleetEndpoint, objMesosSetup.fleetEndpoint)&&
  Objects.equals(this.seDeployMethodAccess, objMesosSetup.seDeployMethodAccess)&&
  Objects.equals(this.reason, objMesosSetup.reason)&&
  Objects.equals(this.version, objMesosSetup.version)&&
  Objects.equals(this.seName, objMesosSetup.seName)&&
  Objects.equals(this.hosts, objMesosSetup.hosts)&&
  Objects.equals(this.newHosts, objMesosSetup.newHosts)&&
  Objects.equals(this.missingHosts, objMesosSetup.missingHosts)&&
  Objects.equals(this.failedHosts, objMesosSetup.failedHosts);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MesosSetup {\n");
                  sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    failedHosts: ").append(toIndentedString(failedHosts)).append("\n");
                        sb.append("    fleetEndpoint: ").append(toIndentedString(fleetEndpoint)).append("\n");
                        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
                        sb.append("    mesosAccess: ").append(toIndentedString(mesosAccess)).append("\n");
                        sb.append("    mesosUrl: ").append(toIndentedString(mesosUrl)).append("\n");
                        sb.append("    missingHosts: ").append(toIndentedString(missingHosts)).append("\n");
                        sb.append("    newHosts: ").append(toIndentedString(newHosts)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    seDeployMethodAccess: ").append(toIndentedString(seDeployMethodAccess)).append("\n");
                        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
                        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
