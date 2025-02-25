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
 * The CloudIpChange is a POJO class extends AviRestResource that used for creating
 * CloudIpChange.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CloudIpChange  {
    @JsonProperty("cc_id")
    private String ccId;

    @JsonProperty("error_string")
    private String errorString;

    @JsonProperty("ip")
    private IpAddr ip;

    @JsonProperty("ip6")
    private IpAddr ip6;

    @JsonProperty("ip6_mask")
    private Integer ip6Mask = 128;

    @JsonProperty("ip_mask")
    private Integer ipMask = 32;

    @JsonProperty("mac_addr")
    private String macAddr;

    @JsonProperty("port_uuid")
    private String portUuid;

    @JsonProperty("se_vm_uuid")
    private String seVmUuid;

    @JsonProperty("vtype")
    private String vtype;



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
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public IpAddr getIp() {
        return ip;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip set the ip.
     */
    public void setIp(IpAddr ip) {
        this.ip = ip;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip6
     */
    public IpAddr getIp6() {
        return ip6;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip6 set the ip6.
     */
    public void setIp6(IpAddr ip6) {
        this.ip6 = ip6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 128.
     * @return ip6Mask
     */
    public Integer getIp6Mask() {
        return ip6Mask;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 128.
     * @param ip6Mask set the ip6Mask.
     */
    public void setIp6Mask(Integer  ip6Mask) {
        this.ip6Mask = ip6Mask;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 32.
     * @return ipMask
     */
    public Integer getIpMask() {
        return ipMask;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 32.
     * @param ipMask set the ipMask.
     */
    public void setIpMask(Integer  ipMask) {
        this.ipMask = ipMask;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return macAddr
     */
    public String getMacAddr() {
        return macAddr;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param macAddr set the macAddr.
     */
    public void setMacAddr(String  macAddr) {
        this.macAddr = macAddr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return portUuid
     */
    public String getPortUuid() {
        return portUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param portUuid set the portUuid.
     */
    public void setPortUuid(String  portUuid) {
        this.portUuid = portUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seVmUuid
     */
    public String getSeVmUuid() {
        return seVmUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seVmUuid set the seVmUuid.
     */
    public void setSeVmUuid(String  seVmUuid) {
        this.seVmUuid = seVmUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
     * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vtype
     */
    public String getVtype() {
        return vtype;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
     * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vtype set the vtype.
     */
    public void setVtype(String  vtype) {
        this.vtype = vtype;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CloudIpChange objCloudIpChange = (CloudIpChange) o;
      return   Objects.equals(this.ccId, objCloudIpChange.ccId)&&
  Objects.equals(this.vtype, objCloudIpChange.vtype)&&
  Objects.equals(this.ip, objCloudIpChange.ip)&&
  Objects.equals(this.seVmUuid, objCloudIpChange.seVmUuid)&&
  Objects.equals(this.portUuid, objCloudIpChange.portUuid)&&
  Objects.equals(this.macAddr, objCloudIpChange.macAddr)&&
  Objects.equals(this.errorString, objCloudIpChange.errorString)&&
  Objects.equals(this.ipMask, objCloudIpChange.ipMask)&&
  Objects.equals(this.ip6, objCloudIpChange.ip6)&&
  Objects.equals(this.ip6Mask, objCloudIpChange.ip6Mask);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CloudIpChange {\n");
                  sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    ip6: ").append(toIndentedString(ip6)).append("\n");
                        sb.append("    ip6Mask: ").append(toIndentedString(ip6Mask)).append("\n");
                        sb.append("    ipMask: ").append(toIndentedString(ipMask)).append("\n");
                        sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
                        sb.append("    portUuid: ").append(toIndentedString(portUuid)).append("\n");
                        sb.append("    seVmUuid: ").append(toIndentedString(seVmUuid)).append("\n");
                        sb.append("    vtype: ").append(toIndentedString(vtype)).append("\n");
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
