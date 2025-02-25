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
 * The VipSeAssigned is a POJO class extends AviRestResource that used for creating
 * VipSeAssigned.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VipSeAssigned  {
    @JsonProperty("active_on_cloud")
    private Boolean activeOnCloud;

    @JsonProperty("active_on_se")
    private Boolean activeOnSe;

    @JsonProperty("admin_down_requested")
    private Boolean adminDownRequested = false;

    @JsonProperty("attach_ip_in_progress")
    private Boolean attachIpInProgress;

    @JsonProperty("connected")
    private Boolean connected;

    @JsonProperty("detach_ip_in_progress")
    private Boolean detachIpInProgress;

    @JsonProperty("mgmt_ip")
    private IpAddr mgmtIp;

    @JsonProperty("mgmt_ip6")
    private IpAddr mgmtIp6;

    @JsonProperty("name")
    private String name;

    @JsonProperty("oper_status")
    private OperationalStatus operStatus;

    @JsonProperty("primary")
    private Boolean primary;

    @JsonProperty("ref")
    private String ref;

    @JsonProperty("scalein_in_progress")
    private Boolean scaleinInProgress = false;

    @JsonProperty("scaleout_in_progress")
    private Boolean scaleoutInProgress;

    @JsonProperty("se_ready_in_progress")
    private Boolean seReadyInProgress;

    @JsonProperty("snat_ip")
    private IpAddr snatIp;

    @JsonProperty("snat_ip6_address")
    private IpAddr snatIp6Address;

    @JsonProperty("standby")
    private Boolean standby;



    /**
     * This is the getter method this will return the attribute value.
     * Vip is active on cloud.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return activeOnCloud
     */
    public Boolean getActiveOnCloud() {
        return activeOnCloud;
    }

    /**
     * This is the setter method to the attribute.
     * Vip is active on cloud.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param activeOnCloud set the activeOnCloud.
     */
    public void setActiveOnCloud(Boolean  activeOnCloud) {
        this.activeOnCloud = activeOnCloud;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vip is active on this serviceengine.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return activeOnSe
     */
    public Boolean getActiveOnSe() {
        return activeOnSe;
    }

    /**
     * This is the setter method to the attribute.
     * Vip is active on this serviceengine.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param activeOnSe set the activeOnSe.
     */
    public void setActiveOnSe(Boolean  activeOnSe) {
        this.activeOnSe = activeOnSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return adminDownRequested
     */
    public Boolean getAdminDownRequested() {
        return adminDownRequested;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param adminDownRequested set the adminDownRequested.
     */
    public void setAdminDownRequested(Boolean  adminDownRequested) {
        this.adminDownRequested = adminDownRequested;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Attach ip is in progress.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return attachIpInProgress
     */
    public Boolean getAttachIpInProgress() {
        return attachIpInProgress;
    }

    /**
     * This is the setter method to the attribute.
     * Attach ip is in progress.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param attachIpInProgress set the attachIpInProgress.
     */
    public void setAttachIpInProgress(Boolean  attachIpInProgress) {
        this.attachIpInProgress = attachIpInProgress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connected
     */
    public Boolean getConnected() {
        return connected;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connected set the connected.
     */
    public void setConnected(Boolean  connected) {
        this.connected = connected;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Detach ip is in progress.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return detachIpInProgress
     */
    public Boolean getDetachIpInProgress() {
        return detachIpInProgress;
    }

    /**
     * This is the setter method to the attribute.
     * Detach ip is in progress.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param detachIpInProgress set the detachIpInProgress.
     */
    public void setDetachIpInProgress(Boolean  detachIpInProgress) {
        this.detachIpInProgress = detachIpInProgress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Management ipv4 address of se.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtIp
     */
    public IpAddr getMgmtIp() {
        return mgmtIp;
    }

    /**
     * This is the setter method to the attribute.
     * Management ipv4 address of se.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtIp set the mgmtIp.
     */
    public void setMgmtIp(IpAddr mgmtIp) {
        this.mgmtIp = mgmtIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Management ipv6 address of se.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtIp6
     */
    public IpAddr getMgmtIp6() {
        return mgmtIp6;
    }

    /**
     * This is the setter method to the attribute.
     * Management ipv6 address of se.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtIp6 set the mgmtIp6.
     */
    public void setMgmtIp6(IpAddr mgmtIp6) {
        this.mgmtIp6 = mgmtIp6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return operStatus
     */
    public OperationalStatus getOperStatus() {
        return operStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param operStatus set the operStatus.
     */
    public void setOperStatus(OperationalStatus operStatus) {
        this.operStatus = operStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return primary
     */
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param primary set the primary.
     */
    public void setPrimary(Boolean  primary) {
        this.primary = primary;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ref set the ref.
     */
    public void setRef(String  ref) {
        this.ref = ref;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return scaleinInProgress
     */
    public Boolean getScaleinInProgress() {
        return scaleinInProgress;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param scaleinInProgress set the scaleinInProgress.
     */
    public void setScaleinInProgress(Boolean  scaleinInProgress) {
        this.scaleinInProgress = scaleinInProgress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vip is awaiting scaleout response from this serviceengine.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return scaleoutInProgress
     */
    public Boolean getScaleoutInProgress() {
        return scaleoutInProgress;
    }

    /**
     * This is the setter method to the attribute.
     * Vip is awaiting scaleout response from this serviceengine.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param scaleoutInProgress set the scaleoutInProgress.
     */
    public void setScaleoutInProgress(Boolean  scaleoutInProgress) {
        this.scaleoutInProgress = scaleoutInProgress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vip is awaiting response from this serviceengine.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seReadyInProgress
     */
    public Boolean getSeReadyInProgress() {
        return seReadyInProgress;
    }

    /**
     * This is the setter method to the attribute.
     * Vip is awaiting response from this serviceengine.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seReadyInProgress set the seReadyInProgress.
     */
    public void setSeReadyInProgress(Boolean  seReadyInProgress) {
        this.seReadyInProgress = seReadyInProgress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return snatIp
     */
    public IpAddr getSnatIp() {
        return snatIp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param snatIp set the snatIp.
     */
    public void setSnatIp(IpAddr snatIp) {
        this.snatIp = snatIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 address for se snat.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return snatIp6Address
     */
    public IpAddr getSnatIp6Address() {
        return snatIp6Address;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 address for se snat.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param snatIp6Address set the snatIp6Address.
     */
    public void setSnatIp6Address(IpAddr snatIp6Address) {
        this.snatIp6Address = snatIp6Address;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return standby
     */
    public Boolean getStandby() {
        return standby;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param standby set the standby.
     */
    public void setStandby(Boolean  standby) {
        this.standby = standby;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VipSeAssigned objVipSeAssigned = (VipSeAssigned) o;
      return   Objects.equals(this.name, objVipSeAssigned.name)&&
  Objects.equals(this.primary, objVipSeAssigned.primary)&&
  Objects.equals(this.standby, objVipSeAssigned.standby)&&
  Objects.equals(this.connected, objVipSeAssigned.connected)&&
  Objects.equals(this.scaleinInProgress, objVipSeAssigned.scaleinInProgress)&&
  Objects.equals(this.operStatus, objVipSeAssigned.operStatus)&&
  Objects.equals(this.snatIp, objVipSeAssigned.snatIp)&&
  Objects.equals(this.adminDownRequested, objVipSeAssigned.adminDownRequested)&&
  Objects.equals(this.mgmtIp, objVipSeAssigned.mgmtIp)&&
  Objects.equals(this.mgmtIp6, objVipSeAssigned.mgmtIp6)&&
  Objects.equals(this.activeOnCloud, objVipSeAssigned.activeOnCloud)&&
  Objects.equals(this.attachIpInProgress, objVipSeAssigned.attachIpInProgress)&&
  Objects.equals(this.detachIpInProgress, objVipSeAssigned.detachIpInProgress)&&
  Objects.equals(this.activeOnSe, objVipSeAssigned.activeOnSe)&&
  Objects.equals(this.scaleoutInProgress, objVipSeAssigned.scaleoutInProgress)&&
  Objects.equals(this.seReadyInProgress, objVipSeAssigned.seReadyInProgress)&&
  Objects.equals(this.snatIp6Address, objVipSeAssigned.snatIp6Address)&&
  Objects.equals(this.ref, objVipSeAssigned.ref);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VipSeAssigned {\n");
                  sb.append("    activeOnCloud: ").append(toIndentedString(activeOnCloud)).append("\n");
                        sb.append("    activeOnSe: ").append(toIndentedString(activeOnSe)).append("\n");
                        sb.append("    adminDownRequested: ").append(toIndentedString(adminDownRequested)).append("\n");
                        sb.append("    attachIpInProgress: ").append(toIndentedString(attachIpInProgress)).append("\n");
                        sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
                        sb.append("    detachIpInProgress: ").append(toIndentedString(detachIpInProgress)).append("\n");
                        sb.append("    mgmtIp: ").append(toIndentedString(mgmtIp)).append("\n");
                        sb.append("    mgmtIp6: ").append(toIndentedString(mgmtIp6)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
                        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
                        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
                        sb.append("    scaleinInProgress: ").append(toIndentedString(scaleinInProgress)).append("\n");
                        sb.append("    scaleoutInProgress: ").append(toIndentedString(scaleoutInProgress)).append("\n");
                        sb.append("    seReadyInProgress: ").append(toIndentedString(seReadyInProgress)).append("\n");
                        sb.append("    snatIp: ").append(toIndentedString(snatIp)).append("\n");
                        sb.append("    snatIp6Address: ").append(toIndentedString(snatIp6Address)).append("\n");
                        sb.append("    standby: ").append(toIndentedString(standby)).append("\n");
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
