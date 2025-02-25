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
 * The CdpLldpInfo is a POJO class extends AviRestResource that used for creating
 * CdpLldpInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CdpLldpInfo  {
    @JsonProperty("chassis")
    private String chassis;

    @JsonProperty("device")
    private String device;

    @JsonProperty("mgmtaddr")
    private String mgmtaddr;

    @JsonProperty("port")
    private String port;

    @JsonProperty("switch_info_type")
    private String switchInfoType;

    @JsonProperty("system_name")
    private String systemName;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return chassis
     */
    public String getChassis() {
        return chassis;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param chassis set the chassis.
     */
    public void setChassis(String  chassis) {
        this.chassis = chassis;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return device
     */
    public String getDevice() {
        return device;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param device set the device.
     */
    public void setDevice(String  device) {
        this.device = device;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtaddr
     */
    public String getMgmtaddr() {
        return mgmtaddr;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtaddr set the mgmtaddr.
     */
    public void setMgmtaddr(String  mgmtaddr) {
        this.mgmtaddr = mgmtaddr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return port
     */
    public String getPort() {
        return port;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param port set the port.
     */
    public void setPort(String  port) {
        this.port = port;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - CDP, LLDP, NOT_APPLICABLE.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return switchInfoType
     */
    public String getSwitchInfoType() {
        return switchInfoType;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - CDP, LLDP, NOT_APPLICABLE.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param switchInfoType set the switchInfoType.
     */
    public void setSwitchInfoType(String  switchInfoType) {
        this.switchInfoType = switchInfoType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return systemName
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param systemName set the systemName.
     */
    public void setSystemName(String  systemName) {
        this.systemName = systemName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CdpLldpInfo objCdpLldpInfo = (CdpLldpInfo) o;
      return   Objects.equals(this.switchInfoType, objCdpLldpInfo.switchInfoType)&&
  Objects.equals(this.device, objCdpLldpInfo.device)&&
  Objects.equals(this.chassis, objCdpLldpInfo.chassis)&&
  Objects.equals(this.port, objCdpLldpInfo.port)&&
  Objects.equals(this.mgmtaddr, objCdpLldpInfo.mgmtaddr)&&
  Objects.equals(this.systemName, objCdpLldpInfo.systemName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CdpLldpInfo {\n");
                  sb.append("    chassis: ").append(toIndentedString(chassis)).append("\n");
                        sb.append("    device: ").append(toIndentedString(device)).append("\n");
                        sb.append("    mgmtaddr: ").append(toIndentedString(mgmtaddr)).append("\n");
                        sb.append("    port: ").append(toIndentedString(port)).append("\n");
                        sb.append("    switchInfoType: ").append(toIndentedString(switchInfoType)).append("\n");
                        sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
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
