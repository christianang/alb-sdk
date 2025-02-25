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
 * The SidebandProfile is a POJO class extends AviRestResource that used for creating
 * SidebandProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SidebandProfile  {
    @JsonProperty("ip")
    private List<IpAddr> ip;

    @JsonProperty("sideband_max_request_body_size")
    private Integer sidebandMaxRequestBodySize = 1024;


    /**
     * This is the getter method this will return the attribute value.
     * Ip address of the sideband server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public List<IpAddr> getIp() {
        return ip;
    }

    /**
     * This is the setter method. this will set the ip
     * Ip address of the sideband server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public void setIp(List<IpAddr>  ip) {
        this.ip = ip;
    }

    /**
     * This is the setter method this will set the ip
     * Ip address of the sideband server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public SidebandProfile addIpItem(IpAddr ipItem) {
      if (this.ip == null) {
        this.ip = new ArrayList<IpAddr>();
      }
      this.ip.add(ipItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum size of the request body that will be sent on the sideband.
     * Allowed values are 0-16384.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @return sidebandMaxRequestBodySize
     */
    public Integer getSidebandMaxRequestBodySize() {
        return sidebandMaxRequestBodySize;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum size of the request body that will be sent on the sideband.
     * Allowed values are 0-16384.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @param sidebandMaxRequestBodySize set the sidebandMaxRequestBodySize.
     */
    public void setSidebandMaxRequestBodySize(Integer  sidebandMaxRequestBodySize) {
        this.sidebandMaxRequestBodySize = sidebandMaxRequestBodySize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SidebandProfile objSidebandProfile = (SidebandProfile) o;
      return   Objects.equals(this.ip, objSidebandProfile.ip)&&
  Objects.equals(this.sidebandMaxRequestBodySize, objSidebandProfile.sidebandMaxRequestBodySize);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SidebandProfile {\n");
                  sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    sidebandMaxRequestBodySize: ").append(toIndentedString(sidebandMaxRequestBodySize)).append("\n");
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
