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
 * The NetworkSubnetClash is a POJO class extends AviRestResource that used for creating
 * NetworkSubnetClash.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NetworkSubnetClash  {
    @JsonProperty("ip_nw")
    private String ipNw;

    @JsonProperty("networks")
    private List<String> networks;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipNw
     */
    public String getIpNw() {
        return ipNw;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipNw set the ipNw.
     */
    public void setIpNw(String  ipNw) {
        this.ipNw = ipNw;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public List<String> getNetworks() {
        return networks;
    }

    /**
     * This is the setter method. this will set the networks
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public void setNetworks(List<String>  networks) {
        this.networks = networks;
    }

    /**
     * This is the setter method this will set the networks
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public NetworkSubnetClash addNetworksItem(String networksItem) {
      if (this.networks == null) {
        this.networks = new ArrayList<String>();
      }
      this.networks.add(networksItem);
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
      NetworkSubnetClash objNetworkSubnetClash = (NetworkSubnetClash) o;
      return   Objects.equals(this.ipNw, objNetworkSubnetClash.ipNw)&&
  Objects.equals(this.networks, objNetworkSubnetClash.networks);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NetworkSubnetClash {\n");
                  sb.append("    ipNw: ").append(toIndentedString(ipNw)).append("\n");
                        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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
