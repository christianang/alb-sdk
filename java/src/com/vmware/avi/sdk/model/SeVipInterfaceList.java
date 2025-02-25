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
 * The SeVipInterfaceList is a POJO class extends AviRestResource that used for creating
 * SeVipInterfaceList.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeVipInterfaceList  {
    @JsonProperty("is_portchannel")
    private Boolean isPortchannel = false;

    @JsonProperty("networks")
    private List<DiscoveredNetwork> networks;

    @JsonProperty("vip_intf_ip")
    private IpAddr vipIntfIp;

    @JsonProperty("vip_intf_ip6")
    private IpAddr vipIntfIp6;

    @JsonProperty("vip_intf_mac")
    private String vipIntfMac;

    @JsonProperty("vlan_id")
    private Integer vlanId = 0;



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
     * List of placement_networks reachable from this interface.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public List<DiscoveredNetwork> getNetworks() {
        return networks;
    }

    /**
     * This is the setter method. this will set the networks
     * List of placement_networks reachable from this interface.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public void setNetworks(List<DiscoveredNetwork>  networks) {
        this.networks = networks;
    }

    /**
     * This is the setter method this will set the networks
     * List of placement_networks reachable from this interface.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public SeVipInterfaceList addNetworksItem(DiscoveredNetwork networksItem) {
      if (this.networks == null) {
        this.networks = new ArrayList<DiscoveredNetwork>();
      }
      this.networks.add(networksItem);
      return this;
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
     * @return vipIntfIp6
     */
    public IpAddr getVipIntfIp6() {
        return vipIntfIp6;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipIntfIp6 set the vipIntfIp6.
     */
    public void setVipIntfIp6(IpAddr vipIntfIp6) {
        this.vipIntfIp6 = vipIntfIp6;
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


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeVipInterfaceList objSeVipInterfaceList = (SeVipInterfaceList) o;
      return   Objects.equals(this.vipIntfMac, objSeVipInterfaceList.vipIntfMac)&&
  Objects.equals(this.vlanId, objSeVipInterfaceList.vlanId)&&
  Objects.equals(this.vipIntfIp, objSeVipInterfaceList.vipIntfIp)&&
  Objects.equals(this.isPortchannel, objSeVipInterfaceList.isPortchannel)&&
  Objects.equals(this.vipIntfIp6, objSeVipInterfaceList.vipIntfIp6)&&
  Objects.equals(this.networks, objSeVipInterfaceList.networks);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeVipInterfaceList {\n");
                  sb.append("    isPortchannel: ").append(toIndentedString(isPortchannel)).append("\n");
                        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
                        sb.append("    vipIntfIp: ").append(toIndentedString(vipIntfIp)).append("\n");
                        sb.append("    vipIntfIp6: ").append(toIndentedString(vipIntfIp6)).append("\n");
                        sb.append("    vipIntfMac: ").append(toIndentedString(vipIntfMac)).append("\n");
                        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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
