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
 * The OpenStackIpChange is a POJO class extends AviRestResource that used for creating
 * OpenStackIpChange.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenStackIpChange  {
    @JsonProperty("error_string")
    private String errorString;

    @JsonProperty("ip")
    private IpAddr ip;

    @JsonProperty("mac_addr")
    private String macAddr;

    @JsonProperty("port_uuid")
    private String portUuid;

    @JsonProperty("se_vm_uuid")
    private String seVmUuid;



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


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OpenStackIpChange objOpenStackIpChange = (OpenStackIpChange) o;
      return   Objects.equals(this.ip, objOpenStackIpChange.ip)&&
  Objects.equals(this.seVmUuid, objOpenStackIpChange.seVmUuid)&&
  Objects.equals(this.portUuid, objOpenStackIpChange.portUuid)&&
  Objects.equals(this.macAddr, objOpenStackIpChange.macAddr)&&
  Objects.equals(this.errorString, objOpenStackIpChange.errorString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OpenStackIpChange {\n");
                  sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
                        sb.append("    portUuid: ").append(toIndentedString(portUuid)).append("\n");
                        sb.append("    seVmUuid: ").append(toIndentedString(seVmUuid)).append("\n");
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
