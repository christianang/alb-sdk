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
 * The IpamDnsInfobloxProfile is a POJO class extends AviRestResource that used for creating
 * IpamDnsInfobloxProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpamDnsInfobloxProfile  {
    @JsonProperty("dns_view")
    private String dnsView;

    @JsonProperty("extensible_attributes")
    private List<CustomParams> extensibleAttributes;

    @JsonProperty("ip6_address")
    private IpAddr ip6Address;

    @JsonProperty("ip_address")
    private IpAddr ipAddress;

    @JsonProperty("network_view")
    private String networkView;

    @JsonProperty("password")
    private String password;

    @JsonProperty("usable_alloc_subnets")
    private List<InfobloxSubnet> usableAllocSubnets;

    @JsonProperty("usable_domains")
    private List<String> usableDomains;

    @JsonProperty("username")
    private String username;

    @JsonProperty("wapi_version")
    private String wapiVersion = "2.0";



    /**
     * This is the getter method this will return the attribute value.
     * Dns view used for infoblox host record creation, if this field is not configured by the user, then its value will be set to 'default'.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsView
     */
    public String getDnsView() {
        return dnsView;
    }

    /**
     * This is the setter method to the attribute.
     * Dns view used for infoblox host record creation, if this field is not configured by the user, then its value will be set to 'default'.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsView set the dnsView.
     */
    public void setDnsView(String  dnsView) {
        this.dnsView = dnsView;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Custom parameters that will passed to the infoblox provider as extensible attributes.
     * Field introduced in 18.2.7, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return extensibleAttributes
     */
    public List<CustomParams> getExtensibleAttributes() {
        return extensibleAttributes;
    }

    /**
     * This is the setter method. this will set the extensibleAttributes
     * Custom parameters that will passed to the infoblox provider as extensible attributes.
     * Field introduced in 18.2.7, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return extensibleAttributes
     */
    public void setExtensibleAttributes(List<CustomParams>  extensibleAttributes) {
        this.extensibleAttributes = extensibleAttributes;
    }

    /**
     * This is the setter method this will set the extensibleAttributes
     * Custom parameters that will passed to the infoblox provider as extensible attributes.
     * Field introduced in 18.2.7, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return extensibleAttributes
     */
    public IpamDnsInfobloxProfile addExtensibleAttributesItem(CustomParams extensibleAttributesItem) {
      if (this.extensibleAttributes == null) {
        this.extensibleAttributes = new ArrayList<CustomParams>();
      }
      this.extensibleAttributes.add(extensibleAttributesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 address of infoblox appliance.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip6Address
     */
    public IpAddr getIp6Address() {
        return ip6Address;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 address of infoblox appliance.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip6Address set the ip6Address.
     */
    public void setIp6Address(IpAddr ip6Address) {
        this.ip6Address = ip6Address;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv4 address of infoblox appliance.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipAddress
     */
    public IpAddr getIpAddress() {
        return ipAddress;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv4 address of infoblox appliance.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipAddress set the ipAddress.
     */
    public void setIpAddress(IpAddr ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Network view used for infoblox host record creation, if this field is not configured by the user, then its value will be set to 'default'.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networkView
     */
    public String getNetworkView() {
        return networkView;
    }

    /**
     * This is the setter method to the attribute.
     * Network view used for infoblox host record creation, if this field is not configured by the user, then its value will be set to 'default'.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param networkView set the networkView.
     */
    public void setNetworkView(String  networkView) {
        this.networkView = networkView;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Password for api access for infoblox appliance.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This is the setter method to the attribute.
     * Password for api access for infoblox appliance.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param password set the password.
     */
    public void setPassword(String  password) {
        this.password = password;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Subnets to use for infoblox ip allocation.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return usableAllocSubnets
     */
    public List<InfobloxSubnet> getUsableAllocSubnets() {
        return usableAllocSubnets;
    }

    /**
     * This is the setter method. this will set the usableAllocSubnets
     * Subnets to use for infoblox ip allocation.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return usableAllocSubnets
     */
    public void setUsableAllocSubnets(List<InfobloxSubnet>  usableAllocSubnets) {
        this.usableAllocSubnets = usableAllocSubnets;
    }

    /**
     * This is the setter method this will set the usableAllocSubnets
     * Subnets to use for infoblox ip allocation.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return usableAllocSubnets
     */
    public IpamDnsInfobloxProfile addUsableAllocSubnetsItem(InfobloxSubnet usableAllocSubnetsItem) {
      if (this.usableAllocSubnets == null) {
        this.usableAllocSubnets = new ArrayList<InfobloxSubnet>();
      }
      this.usableAllocSubnets.add(usableAllocSubnetsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Usable domains to pick from infoblox.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return usableDomains
     */
    public List<String> getUsableDomains() {
        return usableDomains;
    }

    /**
     * This is the setter method. this will set the usableDomains
     * Usable domains to pick from infoblox.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return usableDomains
     */
    public void setUsableDomains(List<String>  usableDomains) {
        this.usableDomains = usableDomains;
    }

    /**
     * This is the setter method this will set the usableDomains
     * Usable domains to pick from infoblox.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return usableDomains
     */
    public IpamDnsInfobloxProfile addUsableDomainsItem(String usableDomainsItem) {
      if (this.usableDomains == null) {
        this.usableDomains = new ArrayList<String>();
      }
      this.usableDomains.add(usableDomainsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Username for api access for infoblox appliance.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * This is the setter method to the attribute.
     * Username for api access for infoblox appliance.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param username set the username.
     */
    public void setUsername(String  username) {
        this.username = username;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Wapi version.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "2.0".
     * @return wapiVersion
     */
    public String getWapiVersion() {
        return wapiVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Wapi version.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "2.0".
     * @param wapiVersion set the wapiVersion.
     */
    public void setWapiVersion(String  wapiVersion) {
        this.wapiVersion = wapiVersion;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      IpamDnsInfobloxProfile objIpamDnsInfobloxProfile = (IpamDnsInfobloxProfile) o;
      return   Objects.equals(this.ipAddress, objIpamDnsInfobloxProfile.ipAddress)&&
  Objects.equals(this.username, objIpamDnsInfobloxProfile.username)&&
  Objects.equals(this.password, objIpamDnsInfobloxProfile.password)&&
  Objects.equals(this.wapiVersion, objIpamDnsInfobloxProfile.wapiVersion)&&
  Objects.equals(this.dnsView, objIpamDnsInfobloxProfile.dnsView)&&
  Objects.equals(this.networkView, objIpamDnsInfobloxProfile.networkView)&&
  Objects.equals(this.usableDomains, objIpamDnsInfobloxProfile.usableDomains)&&
  Objects.equals(this.extensibleAttributes, objIpamDnsInfobloxProfile.extensibleAttributes)&&
  Objects.equals(this.usableAllocSubnets, objIpamDnsInfobloxProfile.usableAllocSubnets)&&
  Objects.equals(this.ip6Address, objIpamDnsInfobloxProfile.ip6Address);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IpamDnsInfobloxProfile {\n");
                  sb.append("    dnsView: ").append(toIndentedString(dnsView)).append("\n");
                        sb.append("    extensibleAttributes: ").append(toIndentedString(extensibleAttributes)).append("\n");
                        sb.append("    ip6Address: ").append(toIndentedString(ip6Address)).append("\n");
                        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
                        sb.append("    networkView: ").append(toIndentedString(networkView)).append("\n");
                        sb.append("    password: ").append(toIndentedString(password)).append("\n");
                        sb.append("    usableAllocSubnets: ").append(toIndentedString(usableAllocSubnets)).append("\n");
                        sb.append("    usableDomains: ").append(toIndentedString(usableDomains)).append("\n");
                        sb.append("    username: ").append(toIndentedString(username)).append("\n");
                        sb.append("    wapiVersion: ").append(toIndentedString(wapiVersion)).append("\n");
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
