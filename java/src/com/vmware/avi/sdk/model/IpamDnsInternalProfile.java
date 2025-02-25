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
 * The IpamDnsInternalProfile is a POJO class extends AviRestResource that used for creating
 * IpamDnsInternalProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpamDnsInternalProfile  {
    @JsonProperty("dns_service_domain")
    private List<DnsServiceDomain> dnsServiceDomain;

    @JsonProperty("dns_virtualservice_ref")
    private String dnsVirtualserviceRef;

    @JsonProperty("ttl")
    private Integer ttl = 30;

    @JsonProperty("usable_networks")
    private List<IpamUsableNetwork> usableNetworks;


    /**
     * This is the getter method this will return the attribute value.
     * List of service domains.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsServiceDomain
     */
    public List<DnsServiceDomain> getDnsServiceDomain() {
        return dnsServiceDomain;
    }

    /**
     * This is the setter method. this will set the dnsServiceDomain
     * List of service domains.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsServiceDomain
     */
    public void setDnsServiceDomain(List<DnsServiceDomain>  dnsServiceDomain) {
        this.dnsServiceDomain = dnsServiceDomain;
    }

    /**
     * This is the setter method this will set the dnsServiceDomain
     * List of service domains.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsServiceDomain
     */
    public IpamDnsInternalProfile addDnsServiceDomainItem(DnsServiceDomain dnsServiceDomainItem) {
      if (this.dnsServiceDomain == null) {
        this.dnsServiceDomain = new ArrayList<DnsServiceDomain>();
      }
      this.dnsServiceDomain.add(dnsServiceDomainItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Avi virtualservice to be used for serving dns records.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsVirtualserviceRef
     */
    public String getDnsVirtualserviceRef() {
        return dnsVirtualserviceRef;
    }

    /**
     * This is the setter method to the attribute.
     * Avi virtualservice to be used for serving dns records.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsVirtualserviceRef set the dnsVirtualserviceRef.
     */
    public void setDnsVirtualserviceRef(String  dnsVirtualserviceRef) {
        this.dnsVirtualserviceRef = dnsVirtualserviceRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default ttl for all records, overridden by ttl value for each service domain configured in dnsservicedomain.
     * Allowed values are 1-604800.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 30), basic edition(allowed values- 30), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * This is the setter method to the attribute.
     * Default ttl for all records, overridden by ttl value for each service domain configured in dnsservicedomain.
     * Allowed values are 1-604800.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 30), basic edition(allowed values- 30), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param ttl set the ttl.
     */
    public void setTtl(Integer  ttl) {
        this.ttl = ttl;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Usable networks for virtual ip.
     * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
     * allocation.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return usableNetworks
     */
    public List<IpamUsableNetwork> getUsableNetworks() {
        return usableNetworks;
    }

    /**
     * This is the setter method. this will set the usableNetworks
     * Usable networks for virtual ip.
     * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
     * allocation.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return usableNetworks
     */
    public void setUsableNetworks(List<IpamUsableNetwork>  usableNetworks) {
        this.usableNetworks = usableNetworks;
    }

    /**
     * This is the setter method this will set the usableNetworks
     * Usable networks for virtual ip.
     * If virtualservice does not specify a network and auto_allocate_ip is set, then the first available network from this list will be chosen for ip
     * allocation.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return usableNetworks
     */
    public IpamDnsInternalProfile addUsableNetworksItem(IpamUsableNetwork usableNetworksItem) {
      if (this.usableNetworks == null) {
        this.usableNetworks = new ArrayList<IpamUsableNetwork>();
      }
      this.usableNetworks.add(usableNetworksItem);
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
      IpamDnsInternalProfile objIpamDnsInternalProfile = (IpamDnsInternalProfile) o;
      return   Objects.equals(this.dnsServiceDomain, objIpamDnsInternalProfile.dnsServiceDomain)&&
  Objects.equals(this.ttl, objIpamDnsInternalProfile.ttl)&&
  Objects.equals(this.dnsVirtualserviceRef, objIpamDnsInternalProfile.dnsVirtualserviceRef)&&
  Objects.equals(this.usableNetworks, objIpamDnsInternalProfile.usableNetworks);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IpamDnsInternalProfile {\n");
                  sb.append("    dnsServiceDomain: ").append(toIndentedString(dnsServiceDomain)).append("\n");
                        sb.append("    dnsVirtualserviceRef: ").append(toIndentedString(dnsVirtualserviceRef)).append("\n");
                        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
                        sb.append("    usableNetworks: ").append(toIndentedString(usableNetworks)).append("\n");
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
