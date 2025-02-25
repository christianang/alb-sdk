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
 * The GCPSetup is a POJO class extends AviRestResource that used for creating
 * GCPSetup.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GCPSetup  {
    @JsonProperty("cc_id")
    private String ccId;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("network")
    private String network;

    @JsonProperty("nhop_inst")
    private String nhopInst;

    @JsonProperty("nhop_ip")
    private IpAddr nhopIp;

    @JsonProperty("project")
    private String project;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("route_name")
    private String routeName;

    @JsonProperty("subnet")
    private String subnet;

    @JsonProperty("vip")
    private IpAddr vip;

    @JsonProperty("vs_name")
    private String vsName;

    @JsonProperty("vs_uuid")
    private String vsUuid;

    @JsonProperty("zone")
    private String zone;



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
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostname set the hostname.
     */
    public void setHostname(String  hostname) {
        this.hostname = hostname;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param network set the network.
     */
    public void setNetwork(String  network) {
        this.network = network;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nhopInst
     */
    public String getNhopInst() {
        return nhopInst;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nhopInst set the nhopInst.
     */
    public void setNhopInst(String  nhopInst) {
        this.nhopInst = nhopInst;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nhopIp
     */
    public IpAddr getNhopIp() {
        return nhopIp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nhopIp set the nhopIp.
     */
    public void setNhopIp(IpAddr nhopIp) {
        this.nhopIp = nhopIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return project
     */
    public String getProject() {
        return project;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param project set the project.
     */
    public void setProject(String  project) {
        this.project = project;
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
     * @return routeName
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param routeName set the routeName.
     */
    public void setRouteName(String  routeName) {
        this.routeName = routeName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subnet
     */
    public String getSubnet() {
        return subnet;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subnet set the subnet.
     */
    public void setSubnet(String  subnet) {
        this.subnet = subnet;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vip
     */
    public IpAddr getVip() {
        return vip;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vip set the vip.
     */
    public void setVip(IpAddr vip) {
        this.vip = vip;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public String getVsName() {
        return vsName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsName set the vsName.
     */
    public void setVsName(String  vsName) {
        this.vsName = vsName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public String getVsUuid() {
        return vsUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsUuid set the vsUuid.
     */
    public void setVsUuid(String  vsUuid) {
        this.vsUuid = vsUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param zone set the zone.
     */
    public void setZone(String  zone) {
        this.zone = zone;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GCPSetup objGCPSetup = (GCPSetup) o;
      return   Objects.equals(this.ccId, objGCPSetup.ccId)&&
  Objects.equals(this.project, objGCPSetup.project)&&
  Objects.equals(this.network, objGCPSetup.network)&&
  Objects.equals(this.zone, objGCPSetup.zone)&&
  Objects.equals(this.hostname, objGCPSetup.hostname)&&
  Objects.equals(this.subnet, objGCPSetup.subnet)&&
  Objects.equals(this.vip, objGCPSetup.vip)&&
  Objects.equals(this.nhopIp, objGCPSetup.nhopIp)&&
  Objects.equals(this.nhopInst, objGCPSetup.nhopInst)&&
  Objects.equals(this.vsUuid, objGCPSetup.vsUuid)&&
  Objects.equals(this.routeName, objGCPSetup.routeName)&&
  Objects.equals(this.reason, objGCPSetup.reason)&&
  Objects.equals(this.vsName, objGCPSetup.vsName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GCPSetup {\n");
                  sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
                        sb.append("    network: ").append(toIndentedString(network)).append("\n");
                        sb.append("    nhopInst: ").append(toIndentedString(nhopInst)).append("\n");
                        sb.append("    nhopIp: ").append(toIndentedString(nhopIp)).append("\n");
                        sb.append("    project: ").append(toIndentedString(project)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
                        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
                        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
                        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
                        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
                        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
