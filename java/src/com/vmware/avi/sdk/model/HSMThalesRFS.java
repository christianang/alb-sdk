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
 * The HSMThalesRFS is a POJO class extends AviRestResource that used for creating
 * HSMThalesRFS.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HSMThalesRFS  {
    @JsonProperty("ip")
    private IpAddr ip;

    @JsonProperty("port")
    private Integer port = 9004;



    /**
     * This is the getter method this will return the attribute value.
     * Ip address of the rfs server from where to sync the thales encrypted private key.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public IpAddr getIp() {
        return ip;
    }

    /**
     * This is the setter method to the attribute.
     * Ip address of the rfs server from where to sync the thales encrypted private key.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip set the ip.
     */
    public void setIp(IpAddr ip) {
        this.ip = ip;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Port at which the rfs server accepts the sync request from clients for thales encrypted private key.
     * Allowed values are 1-65535.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 9004.
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This is the setter method to the attribute.
     * Port at which the rfs server accepts the sync request from clients for thales encrypted private key.
     * Allowed values are 1-65535.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 9004.
     * @param port set the port.
     */
    public void setPort(Integer  port) {
        this.port = port;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HSMThalesRFS objHSMThalesRFS = (HSMThalesRFS) o;
      return   Objects.equals(this.ip, objHSMThalesRFS.ip)&&
  Objects.equals(this.port, objHSMThalesRFS.port);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HSMThalesRFS {\n");
                  sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
