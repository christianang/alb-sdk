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
 * The SeList is a POJO class extends AviRestResource that used for creating
 * SeList.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeList  {
    @JsonProperty("active_on_cloud")
    private Boolean activeOnCloud;

    @JsonProperty("active_on_se")
    private Boolean activeOnSe;

    @JsonProperty("admin_down_requested")
    private Boolean adminDownRequested = false;

    @JsonProperty("attach_ip_in_progress")
    private Boolean attachIpInProgress;

    @JsonProperty("cloud_programming_done")
    private Boolean cloudProgrammingDone;

    @JsonProperty("cloud_programming_status")
    private String cloudProgrammingStatus;

    @JsonProperty("delete_in_progress")
    private Boolean deleteInProgress = false;

    @JsonProperty("detach_ip_in_progress")
    private Boolean detachIpInProgress;

    @JsonProperty("floating_intf_ip")
    private List<IpAddr> floatingIntfIp;

    @JsonProperty("floating_intf_ip6_addresses")
    private List<IpAddr> floatingIntfIp6Addresses;

    @JsonProperty("incarnation")
    private String incarnation;

    @JsonProperty("is_portchannel")
    private Boolean isPortchannel = false;

    @JsonProperty("is_primary")
    private Boolean isPrimary = true;

    @JsonProperty("is_standby")
    private Boolean isStandby = false;

    @JsonProperty("memory")
    private Integer memory = 2001;

    @JsonProperty("mgmt_ip")
    private IpAddr mgmtIp;

    @JsonProperty("mgmt_ip6")
    private IpAddr mgmtIp6;

    @JsonProperty("scaleout_in_progress")
    private Boolean scaleoutInProgress = false;

    @JsonProperty("se_programming_done")
    private Boolean seProgrammingDone;

    @JsonProperty("se_ready_in_progress")
    private Boolean seReadyInProgress;

    @JsonProperty("se_ref")
    private String seRef;

    @JsonProperty("sec_idx")
    private Integer secIdx = 1;

    @JsonProperty("snat_ip")
    private IpAddr snatIp;

    @JsonProperty("snat_ip6_address")
    private IpAddr snatIp6Address;

    @JsonProperty("vcpus")
    private Integer vcpus = 2;

    @JsonProperty("vip6_subnet_mask")
    private Integer vip6SubnetMask = 128;

    @JsonProperty("vip_intf_ip")
    private IpAddr vipIntfIp;

    @JsonProperty("vip_intf_list")
    private List<SeVipInterfaceList> vipIntfList;

    @JsonProperty("vip_intf_mac")
    private String vipIntfMac;

    @JsonProperty("vip_subnet_mask")
    private Integer vipSubnetMask = 32;

    @JsonProperty("vlan_id")
    private Integer vlanId = 0;

    @JsonProperty("vnic")
    private List<VsSeVnic> vnic;



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
     * This flag is set when scaling in an se in admin down mode.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return adminDownRequested
     */
    public Boolean getAdminDownRequested() {
        return adminDownRequested;
    }

    /**
     * This is the setter method to the attribute.
     * This flag is set when scaling in an se in admin down mode.
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
     * All attempts to program the vip on cloud have been made.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudProgrammingDone
     */
    public Boolean getCloudProgrammingDone() {
        return cloudProgrammingDone;
    }

    /**
     * This is the setter method to the attribute.
     * All attempts to program the vip on cloud have been made.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudProgrammingDone set the cloudProgrammingDone.
     */
    public void setCloudProgrammingDone(Boolean  cloudProgrammingDone) {
        this.cloudProgrammingDone = cloudProgrammingDone;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status of vip on the cloud.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudProgrammingStatus
     */
    public String getCloudProgrammingStatus() {
        return cloudProgrammingStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Status of vip on the cloud.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudProgrammingStatus set the cloudProgrammingStatus.
     */
    public void setCloudProgrammingStatus(String  cloudProgrammingStatus) {
        this.cloudProgrammingStatus = cloudProgrammingStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This flag is set when an se is admin down or scaling in.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return deleteInProgress
     */
    public Boolean getDeleteInProgress() {
        return deleteInProgress;
    }

    /**
     * This is the setter method to the attribute.
     * This flag is set when an se is admin down or scaling in.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param deleteInProgress set the deleteInProgress.
     */
    public void setDeleteInProgress(Boolean  deleteInProgress) {
        this.deleteInProgress = deleteInProgress;
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return floatingIntfIp
     */
    public List<IpAddr> getFloatingIntfIp() {
        return floatingIntfIp;
    }

    /**
     * This is the setter method. this will set the floatingIntfIp
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return floatingIntfIp
     */
    public void setFloatingIntfIp(List<IpAddr>  floatingIntfIp) {
        this.floatingIntfIp = floatingIntfIp;
    }

    /**
     * This is the setter method this will set the floatingIntfIp
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return floatingIntfIp
     */
    public SeList addFloatingIntfIpItem(IpAddr floatingIntfIpItem) {
      if (this.floatingIntfIp == null) {
        this.floatingIntfIp = new ArrayList<IpAddr>();
      }
      this.floatingIntfIp.add(floatingIntfIpItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 floating interface ips for the routingservice.
     * Field introduced in 22.1.6, 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return floatingIntfIp6Addresses
     */
    public List<IpAddr> getFloatingIntfIp6Addresses() {
        return floatingIntfIp6Addresses;
    }

    /**
     * This is the setter method. this will set the floatingIntfIp6Addresses
     * Ipv6 floating interface ips for the routingservice.
     * Field introduced in 22.1.6, 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return floatingIntfIp6Addresses
     */
    public void setFloatingIntfIp6Addresses(List<IpAddr>  floatingIntfIp6Addresses) {
        this.floatingIntfIp6Addresses = floatingIntfIp6Addresses;
    }

    /**
     * This is the setter method this will set the floatingIntfIp6Addresses
     * Ipv6 floating interface ips for the routingservice.
     * Field introduced in 22.1.6, 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return floatingIntfIp6Addresses
     */
    public SeList addFloatingIntfIp6AddressesItem(IpAddr floatingIntfIp6AddressesItem) {
      if (this.floatingIntfIp6Addresses == null) {
        this.floatingIntfIp6Addresses = new ArrayList<IpAddr>();
      }
      this.floatingIntfIp6Addresses.add(floatingIntfIp6AddressesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Updated whenever this entry is created.
     * When the sees this has changed, it means that the se should disrupt, since there was a delete then create, not an update.
     * Field introduced in 18.1.5,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return incarnation
     */
    public String getIncarnation() {
        return incarnation;
    }

    /**
     * This is the setter method to the attribute.
     * Updated whenever this entry is created.
     * When the sees this has changed, it means that the se should disrupt, since there was a delete then create, not an update.
     * Field introduced in 18.1.5,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param incarnation set the incarnation.
     */
    public void setIncarnation(String  incarnation) {
        this.incarnation = incarnation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return isPortchannel
     */
    public Boolean getIsPortchannel() {
        return isPortchannel;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param isPortchannel set the isPortchannel.
     */
    public void setIsPortchannel(Boolean  isPortchannel) {
        this.isPortchannel = isPortchannel;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return isPrimary
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param isPrimary set the isPrimary.
     */
    public void setIsPrimary(Boolean  isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return isStandby
     */
    public Boolean getIsStandby() {
        return isStandby;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param isStandby set the isStandby.
     */
    public void setIsStandby(Boolean  isStandby) {
        this.isStandby = isStandby;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2001.
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2001.
     * @param memory set the memory.
     */
    public void setMemory(Integer  memory) {
        this.memory = memory;
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
     * This flag is set when a vs is actively scaling out to this se.
     * Field introduced in 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return scaleoutInProgress
     */
    public Boolean getScaleoutInProgress() {
        return scaleoutInProgress;
    }

    /**
     * This is the setter method to the attribute.
     * This flag is set when a vs is actively scaling out to this se.
     * Field introduced in 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param scaleoutInProgress set the scaleoutInProgress.
     */
    public void setScaleoutInProgress(Boolean  scaleoutInProgress) {
        this.scaleoutInProgress = scaleoutInProgress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * All attempts to program the vip on this serviceengine have been made.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seProgrammingDone
     */
    public Boolean getSeProgrammingDone() {
        return seProgrammingDone;
    }

    /**
     * This is the setter method to the attribute.
     * All attempts to program the vip on this serviceengine have been made.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seProgrammingDone set the seProgrammingDone.
     */
    public void setSeProgrammingDone(Boolean  seProgrammingDone) {
        this.seProgrammingDone = seProgrammingDone;
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
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRef
     */
    public String getSeRef() {
        return seRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRef set the seRef.
     */
    public void setSeRef(String  seRef) {
        this.seRef = seRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return secIdx
     */
    public Integer getSecIdx() {
        return secIdx;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param secIdx set the secIdx.
     */
    public void setSecIdx(Integer  secIdx) {
        this.secIdx = secIdx;
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
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @param vcpus set the vcpus.
     */
    public void setVcpus(Integer  vcpus) {
        this.vcpus = vcpus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 128.
     * @return vip6SubnetMask
     */
    public Integer getVip6SubnetMask() {
        return vip6SubnetMask;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 128.
     * @param vip6SubnetMask set the vip6SubnetMask.
     */
    public void setVip6SubnetMask(Integer  vip6SubnetMask) {
        this.vip6SubnetMask = vip6SubnetMask;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipIntfIp
     */
    public IpAddr getVipIntfIp() {
        return vipIntfIp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipIntfIp set the vipIntfIp.
     */
    public void setVipIntfIp(IpAddr vipIntfIp) {
        this.vipIntfIp = vipIntfIp;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipIntfList
     */
    public List<SeVipInterfaceList> getVipIntfList() {
        return vipIntfList;
    }

    /**
     * This is the setter method. this will set the vipIntfList
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipIntfList
     */
    public void setVipIntfList(List<SeVipInterfaceList>  vipIntfList) {
        this.vipIntfList = vipIntfList;
    }

    /**
     * This is the setter method this will set the vipIntfList
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipIntfList
     */
    public SeList addVipIntfListItem(SeVipInterfaceList vipIntfListItem) {
      if (this.vipIntfList == null) {
        this.vipIntfList = new ArrayList<SeVipInterfaceList>();
      }
      this.vipIntfList.add(vipIntfListItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipIntfMac
     */
    public String getVipIntfMac() {
        return vipIntfMac;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipIntfMac set the vipIntfMac.
     */
    public void setVipIntfMac(String  vipIntfMac) {
        this.vipIntfMac = vipIntfMac;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 32.
     * @return vipSubnetMask
     */
    public Integer getVipSubnetMask() {
        return vipSubnetMask;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 32.
     * @param vipSubnetMask set the vipSubnetMask.
     */
    public void setVipSubnetMask(Integer  vipSubnetMask) {
        this.vipSubnetMask = vipSubnetMask;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return vlanId
     */
    public Integer getVlanId() {
        return vlanId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param vlanId set the vlanId.
     */
    public void setVlanId(Integer  vlanId) {
        this.vlanId = vlanId;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vnic
     */
    public List<VsSeVnic> getVnic() {
        return vnic;
    }

    /**
     * This is the setter method. this will set the vnic
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vnic
     */
    public void setVnic(List<VsSeVnic>  vnic) {
        this.vnic = vnic;
    }

    /**
     * This is the setter method this will set the vnic
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vnic
     */
    public SeList addVnicItem(VsSeVnic vnicItem) {
      if (this.vnic == null) {
        this.vnic = new ArrayList<VsSeVnic>();
      }
      this.vnic.add(vnicItem);
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
      SeList objSeList = (SeList) o;
      return   Objects.equals(this.seRef, objSeList.seRef)&&
  Objects.equals(this.isPrimary, objSeList.isPrimary)&&
  Objects.equals(this.isStandby, objSeList.isStandby)&&
  Objects.equals(this.deleteInProgress, objSeList.deleteInProgress)&&
  Objects.equals(this.vcpus, objSeList.vcpus)&&
  Objects.equals(this.memory, objSeList.memory)&&
  Objects.equals(this.vipIntfMac, objSeList.vipIntfMac)&&
  Objects.equals(this.vipSubnetMask, objSeList.vipSubnetMask)&&
  Objects.equals(this.vnic, objSeList.vnic)&&
  Objects.equals(this.secIdx, objSeList.secIdx)&&
  Objects.equals(this.vlanId, objSeList.vlanId)&&
  Objects.equals(this.snatIp, objSeList.snatIp)&&
  Objects.equals(this.vipIntfIp, objSeList.vipIntfIp)&&
  Objects.equals(this.vipIntfList, objSeList.vipIntfList)&&
  Objects.equals(this.floatingIntfIp, objSeList.floatingIntfIp)&&
  Objects.equals(this.isPortchannel, objSeList.isPortchannel)&&
  Objects.equals(this.adminDownRequested, objSeList.adminDownRequested)&&
  Objects.equals(this.vip6SubnetMask, objSeList.vip6SubnetMask)&&
  Objects.equals(this.incarnation, objSeList.incarnation)&&
  Objects.equals(this.scaleoutInProgress, objSeList.scaleoutInProgress)&&
  Objects.equals(this.mgmtIp, objSeList.mgmtIp)&&
  Objects.equals(this.mgmtIp6, objSeList.mgmtIp6)&&
  Objects.equals(this.seReadyInProgress, objSeList.seReadyInProgress)&&
  Objects.equals(this.activeOnSe, objSeList.activeOnSe)&&
  Objects.equals(this.seProgrammingDone, objSeList.seProgrammingDone)&&
  Objects.equals(this.attachIpInProgress, objSeList.attachIpInProgress)&&
  Objects.equals(this.detachIpInProgress, objSeList.detachIpInProgress)&&
  Objects.equals(this.activeOnCloud, objSeList.activeOnCloud)&&
  Objects.equals(this.cloudProgrammingDone, objSeList.cloudProgrammingDone)&&
  Objects.equals(this.cloudProgrammingStatus, objSeList.cloudProgrammingStatus)&&
  Objects.equals(this.snatIp6Address, objSeList.snatIp6Address)&&
  Objects.equals(this.floatingIntfIp6Addresses, objSeList.floatingIntfIp6Addresses);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeList {\n");
                  sb.append("    activeOnCloud: ").append(toIndentedString(activeOnCloud)).append("\n");
                        sb.append("    activeOnSe: ").append(toIndentedString(activeOnSe)).append("\n");
                        sb.append("    adminDownRequested: ").append(toIndentedString(adminDownRequested)).append("\n");
                        sb.append("    attachIpInProgress: ").append(toIndentedString(attachIpInProgress)).append("\n");
                        sb.append("    cloudProgrammingDone: ").append(toIndentedString(cloudProgrammingDone)).append("\n");
                        sb.append("    cloudProgrammingStatus: ").append(toIndentedString(cloudProgrammingStatus)).append("\n");
                        sb.append("    deleteInProgress: ").append(toIndentedString(deleteInProgress)).append("\n");
                        sb.append("    detachIpInProgress: ").append(toIndentedString(detachIpInProgress)).append("\n");
                        sb.append("    floatingIntfIp: ").append(toIndentedString(floatingIntfIp)).append("\n");
                        sb.append("    floatingIntfIp6Addresses: ").append(toIndentedString(floatingIntfIp6Addresses)).append("\n");
                        sb.append("    incarnation: ").append(toIndentedString(incarnation)).append("\n");
                        sb.append("    isPortchannel: ").append(toIndentedString(isPortchannel)).append("\n");
                        sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
                        sb.append("    isStandby: ").append(toIndentedString(isStandby)).append("\n");
                        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
                        sb.append("    mgmtIp: ").append(toIndentedString(mgmtIp)).append("\n");
                        sb.append("    mgmtIp6: ").append(toIndentedString(mgmtIp6)).append("\n");
                        sb.append("    scaleoutInProgress: ").append(toIndentedString(scaleoutInProgress)).append("\n");
                        sb.append("    seProgrammingDone: ").append(toIndentedString(seProgrammingDone)).append("\n");
                        sb.append("    seReadyInProgress: ").append(toIndentedString(seReadyInProgress)).append("\n");
                        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
                        sb.append("    secIdx: ").append(toIndentedString(secIdx)).append("\n");
                        sb.append("    snatIp: ").append(toIndentedString(snatIp)).append("\n");
                        sb.append("    snatIp6Address: ").append(toIndentedString(snatIp6Address)).append("\n");
                        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
                        sb.append("    vip6SubnetMask: ").append(toIndentedString(vip6SubnetMask)).append("\n");
                        sb.append("    vipIntfIp: ").append(toIndentedString(vipIntfIp)).append("\n");
                        sb.append("    vipIntfList: ").append(toIndentedString(vipIntfList)).append("\n");
                        sb.append("    vipIntfMac: ").append(toIndentedString(vipIntfMac)).append("\n");
                        sb.append("    vipSubnetMask: ").append(toIndentedString(vipSubnetMask)).append("\n");
                        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
                        sb.append("    vnic: ").append(toIndentedString(vnic)).append("\n");
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
