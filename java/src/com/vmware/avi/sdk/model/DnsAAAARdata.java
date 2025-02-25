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
 * The DnsAAAARdata is a POJO class extends AviRestResource that used for creating
 * DnsAAAARdata.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsAAAARdata  {
    @JsonProperty("ip6_address")
    private IpAddr ip6Address;



    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 address for fqdn.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip6Address
     */
    public IpAddr getIp6Address() {
        return ip6Address;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 address for fqdn.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip6Address set the ip6Address.
     */
    public void setIp6Address(IpAddr ip6Address) {
        this.ip6Address = ip6Address;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DnsAAAARdata objDnsAAAARdata = (DnsAAAARdata) o;
      return   Objects.equals(this.ip6Address, objDnsAAAARdata.ip6Address);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DnsAAAARdata {\n");
                  sb.append("    ip6Address: ").append(toIndentedString(ip6Address)).append("\n");
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
