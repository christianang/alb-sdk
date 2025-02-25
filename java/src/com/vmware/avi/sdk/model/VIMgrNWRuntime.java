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
 * The VIMgrNWRuntime is a POJO class extends AviRestResource that used for creating
 * VIMgrNWRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VIMgrNWRuntime extends AviRestResource  {
    @JsonProperty("auto_expand")
    private Boolean autoExpand;

    @JsonProperty("availability_zone")
    private String availabilityZone;

    @JsonProperty("cloud_ref")
    private String cloudRef;

    @JsonProperty("datacenter_uuid")
    private String datacenterUuid;

    @JsonProperty("dvs")
    private Boolean dvs;

    @JsonProperty("host_refs")
    private List<String> hostRefs;

    @JsonProperty("interested_nw")
    private Boolean interestedNw;

    @JsonProperty("ip_subnet")
    private List<VIMgrIPSubnetRuntime> ipSubnet;

    @JsonProperty("logical_switch_id")
    private String logicalSwitchId;

    @JsonProperty("managed_object_id")
    private String managedObjectId;

    @JsonProperty("MgmtNW")
    private Boolean MgmtNW;

    @JsonProperty("name")
    private String name;

    @JsonProperty("num_ports")
    private Integer numPorts;

    @JsonProperty("switch_name")
    private String switchName;

    @JsonProperty("tenant_name")
    private String tenantName;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("type")
    private String type;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("vlan")
    private Integer vlan;

    @JsonProperty("vlan_range")
    private List<VlanRange> vlanRange;

    @JsonProperty("vm_refs")
    private List<String> vmRefs;

    @JsonProperty("vrf_context_ref")
    private String vrfContextRef;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return autoExpand
     */
    public Boolean getAutoExpand() {
        return autoExpand;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param autoExpand set the autoExpand.
     */
    public void setAutoExpand(Boolean  autoExpand) {
        this.autoExpand = autoExpand;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param availabilityZone set the availabilityZone.
     */
    public void setAvailabilityZone(String  availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudRef
     */
    public String getCloudRef() {
        return cloudRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudRef set the cloudRef.
     */
    public void setCloudRef(String  cloudRef) {
        this.cloudRef = cloudRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return datacenterUuid
     */
    public String getDatacenterUuid() {
        return datacenterUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param datacenterUuid set the datacenterUuid.
     */
    public void setDatacenterUuid(String  datacenterUuid) {
        this.datacenterUuid = datacenterUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dvs
     */
    public Boolean getDvs() {
        return dvs;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dvs set the dvs.
     */
    public void setDvs(Boolean  dvs) {
        this.dvs = dvs;
    }
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type vimgrhostruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostRefs
     */
    public List<String> getHostRefs() {
        return hostRefs;
    }

    /**
     * This is the setter method. this will set the hostRefs
     * It is a reference to an object of type vimgrhostruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostRefs
     */
    public void setHostRefs(List<String>  hostRefs) {
        this.hostRefs = hostRefs;
    }

    /**
     * This is the setter method this will set the hostRefs
     * It is a reference to an object of type vimgrhostruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostRefs
     */
    public VIMgrNWRuntime addHostRefsItem(String hostRefsItem) {
      if (this.hostRefs == null) {
        this.hostRefs = new ArrayList<String>();
      }
      this.hostRefs.add(hostRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return interestedNw
     */
    public Boolean getInterestedNw() {
        return interestedNw;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param interestedNw set the interestedNw.
     */
    public void setInterestedNw(Boolean  interestedNw) {
        this.interestedNw = interestedNw;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipSubnet
     */
    public List<VIMgrIPSubnetRuntime> getIpSubnet() {
        return ipSubnet;
    }

    /**
     * This is the setter method. this will set the ipSubnet
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipSubnet
     */
    public void setIpSubnet(List<VIMgrIPSubnetRuntime>  ipSubnet) {
        this.ipSubnet = ipSubnet;
    }

    /**
     * This is the setter method this will set the ipSubnet
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipSubnet
     */
    public VIMgrNWRuntime addIpSubnetItem(VIMgrIPSubnetRuntime ipSubnetItem) {
      if (this.ipSubnet == null) {
        this.ipSubnet = new ArrayList<VIMgrIPSubnetRuntime>();
      }
      this.ipSubnet.add(ipSubnetItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of nsx-t segment spanning multiple vds with vcenter cloud.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return logicalSwitchId
     */
    public String getLogicalSwitchId() {
        return logicalSwitchId;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of nsx-t segment spanning multiple vds with vcenter cloud.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param logicalSwitchId set the logicalSwitchId.
     */
    public void setLogicalSwitchId(String  logicalSwitchId) {
        this.logicalSwitchId = logicalSwitchId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return managedObjectId
     */
    public String getManagedObjectId() {
        return managedObjectId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param managedObjectId set the managedObjectId.
     */
    public void setManagedObjectId(String  managedObjectId) {
        this.managedObjectId = managedObjectId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return MgmtNW
     */
    public Boolean getMgmtnw() {
        return MgmtNW;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param MgmtNW set the MgmtNW.
     */
    public void setMgmtnw(Boolean  MgmtNW) {
        this.MgmtNW = MgmtNW;
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
     * @return numPorts
     */
    public Integer getNumPorts() {
        return numPorts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numPorts set the numPorts.
     */
    public void setNumPorts(Integer  numPorts) {
        this.numPorts = numPorts;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return switchName
     */
    public String getSwitchName() {
        return switchName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param switchName set the switchName.
     */
    public void setSwitchName(String  switchName) {
        this.switchName = switchName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantName set the tenantName.
     */
    public void setTenantName(String  tenantName) {
        this.tenantName = tenantName;
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
     * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
     * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
     * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vlan
     */
    public Integer getVlan() {
        return vlan;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vlan set the vlan.
     */
    public void setVlan(Integer  vlan) {
        this.vlan = vlan;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vlanRange
     */
    public List<VlanRange> getVlanRange() {
        return vlanRange;
    }

    /**
     * This is the setter method. this will set the vlanRange
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vlanRange
     */
    public void setVlanRange(List<VlanRange>  vlanRange) {
        this.vlanRange = vlanRange;
    }

    /**
     * This is the setter method this will set the vlanRange
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vlanRange
     */
    public VIMgrNWRuntime addVlanRangeItem(VlanRange vlanRangeItem) {
      if (this.vlanRange == null) {
        this.vlanRange = new ArrayList<VlanRange>();
      }
      this.vlanRange.add(vlanRangeItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type vimgrvmruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmRefs
     */
    public List<String> getVmRefs() {
        return vmRefs;
    }

    /**
     * This is the setter method. this will set the vmRefs
     * It is a reference to an object of type vimgrvmruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmRefs
     */
    public void setVmRefs(List<String>  vmRefs) {
        this.vmRefs = vmRefs;
    }

    /**
     * This is the setter method this will set the vmRefs
     * It is a reference to an object of type vimgrvmruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmRefs
     */
    public VIMgrNWRuntime addVmRefsItem(String vmRefsItem) {
      if (this.vmRefs == null) {
        this.vmRefs = new ArrayList<String>();
      }
      this.vmRefs.add(vmRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type vrfcontext.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vrfContextRef
     */
    public String getVrfContextRef() {
        return vrfContextRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type vrfcontext.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vrfContextRef set the vrfContextRef.
     */
    public void setVrfContextRef(String  vrfContextRef) {
        this.vrfContextRef = vrfContextRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VIMgrNWRuntime objVIMgrNWRuntime = (VIMgrNWRuntime) o;
      return   Objects.equals(this.type, objVIMgrNWRuntime.type)&&
  Objects.equals(this.uuid, objVIMgrNWRuntime.uuid)&&
  Objects.equals(this.name, objVIMgrNWRuntime.name)&&
  Objects.equals(this.managedObjectId, objVIMgrNWRuntime.managedObjectId)&&
  Objects.equals(this.datacenterUuid, objVIMgrNWRuntime.datacenterUuid)&&
  Objects.equals(this.vlan, objVIMgrNWRuntime.vlan)&&
  Objects.equals(this.dvs, objVIMgrNWRuntime.dvs)&&
  Objects.equals(this.switchName, objVIMgrNWRuntime.switchName)&&
  Objects.equals(this.numPorts, objVIMgrNWRuntime.numPorts)&&
  Objects.equals(this.autoExpand, objVIMgrNWRuntime.autoExpand)&&
  Objects.equals(this.vlanRange, objVIMgrNWRuntime.vlanRange)&&
  Objects.equals(this.MgmtNW, objVIMgrNWRuntime.MgmtNW)&&
  Objects.equals(this.interestedNw, objVIMgrNWRuntime.interestedNw)&&
  Objects.equals(this.ipSubnet, objVIMgrNWRuntime.ipSubnet)&&
  Objects.equals(this.vmRefs, objVIMgrNWRuntime.vmRefs)&&
  Objects.equals(this.hostRefs, objVIMgrNWRuntime.hostRefs)&&
  Objects.equals(this.availabilityZone, objVIMgrNWRuntime.availabilityZone)&&
  Objects.equals(this.vrfContextRef, objVIMgrNWRuntime.vrfContextRef)&&
  Objects.equals(this.logicalSwitchId, objVIMgrNWRuntime.logicalSwitchId)&&
  Objects.equals(this.tenantName, objVIMgrNWRuntime.tenantName)&&
  Objects.equals(this.tenantRef, objVIMgrNWRuntime.tenantRef)&&
  Objects.equals(this.cloudRef, objVIMgrNWRuntime.cloudRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VIMgrNWRuntime {\n");
                  sb.append("    autoExpand: ").append(toIndentedString(autoExpand)).append("\n");
                        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
                        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
                        sb.append("    datacenterUuid: ").append(toIndentedString(datacenterUuid)).append("\n");
                        sb.append("    dvs: ").append(toIndentedString(dvs)).append("\n");
                        sb.append("    hostRefs: ").append(toIndentedString(hostRefs)).append("\n");
                        sb.append("    interestedNw: ").append(toIndentedString(interestedNw)).append("\n");
                        sb.append("    ipSubnet: ").append(toIndentedString(ipSubnet)).append("\n");
                        sb.append("    logicalSwitchId: ").append(toIndentedString(logicalSwitchId)).append("\n");
                        sb.append("    managedObjectId: ").append(toIndentedString(managedObjectId)).append("\n");
                        sb.append("    MgmtNW: ").append(toIndentedString(MgmtNW)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    numPorts: ").append(toIndentedString(numPorts)).append("\n");
                        sb.append("    switchName: ").append(toIndentedString(switchName)).append("\n");
                        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
                        sb.append("    vlanRange: ").append(toIndentedString(vlanRange)).append("\n");
                        sb.append("    vmRefs: ").append(toIndentedString(vmRefs)).append("\n");
                        sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
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
