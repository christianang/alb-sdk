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
 * The DnsEdnsOption is a POJO class extends AviRestResource that used for creating
 * DnsEdnsOption.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsEdnsOption  {
    @JsonProperty("addr_family")
    private Integer addrFamily;

    @JsonProperty("code")
    private String code;

    @JsonProperty("scope_prefix_len")
    private Integer scopePrefixLen;

    @JsonProperty("source_prefix_len")
    private Integer sourcePrefixLen;

    @JsonProperty("subnet_ip")
    private Integer subnetIp;

    @JsonProperty("subnet_ip6")
    private String subnetIp6;



    /**
     * This is the getter method this will return the attribute value.
     * Address family.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return addrFamily
     */
    public Integer getAddrFamily() {
        return addrFamily;
    }

    /**
     * This is the setter method to the attribute.
     * Address family.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param addrFamily set the addrFamily.
     */
    public void setAddrFamily(Integer  addrFamily) {
        this.addrFamily = addrFamily;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Edns option code.
     * Enum options - EDNS_OPTION_CODE_NSID, EDNS_OPTION_CODE_DNSSEC_DAU, EDNS_OPTION_CODE_DNSSEC_DHU, EDNS_OPTION_CODE_DNSSEC_N3U,
     * EDNS_OPTION_CODE_CLIENT_SUBNET, EDNS_OPTION_CODE_EXPIRE, EDNS_OPTION_CODE_COOKIE, EDNS_OPTION_CODE_TCP_KEEPALIVE, EDNS_OPTION_CODE_PADDING,
     * EDNS_OPTION_CODE_CHAIN.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * This is the setter method to the attribute.
     * Edns option code.
     * Enum options - EDNS_OPTION_CODE_NSID, EDNS_OPTION_CODE_DNSSEC_DAU, EDNS_OPTION_CODE_DNSSEC_DHU, EDNS_OPTION_CODE_DNSSEC_N3U,
     * EDNS_OPTION_CODE_CLIENT_SUBNET, EDNS_OPTION_CODE_EXPIRE, EDNS_OPTION_CODE_COOKIE, EDNS_OPTION_CODE_TCP_KEEPALIVE, EDNS_OPTION_CODE_PADDING,
     * EDNS_OPTION_CODE_CHAIN.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param code set the code.
     */
    public void setCode(String  code) {
        this.code = code;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Scope prefix length of address.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return scopePrefixLen
     */
    public Integer getScopePrefixLen() {
        return scopePrefixLen;
    }

    /**
     * This is the setter method to the attribute.
     * Scope prefix length of address.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param scopePrefixLen set the scopePrefixLen.
     */
    public void setScopePrefixLen(Integer  scopePrefixLen) {
        this.scopePrefixLen = scopePrefixLen;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Source prefix length of address.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sourcePrefixLen
     */
    public Integer getSourcePrefixLen() {
        return sourcePrefixLen;
    }

    /**
     * This is the setter method to the attribute.
     * Source prefix length of address.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sourcePrefixLen set the sourcePrefixLen.
     */
    public void setSourcePrefixLen(Integer  sourcePrefixLen) {
        this.sourcePrefixLen = sourcePrefixLen;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv4 address of the client subnet.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subnetIp
     */
    public Integer getSubnetIp() {
        return subnetIp;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv4 address of the client subnet.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subnetIp set the subnetIp.
     */
    public void setSubnetIp(Integer  subnetIp) {
        this.subnetIp = subnetIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 address of the client subnet.
     * Field introduced in 18.2.12, 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subnetIp6
     */
    public String getSubnetIp6() {
        return subnetIp6;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 address of the client subnet.
     * Field introduced in 18.2.12, 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subnetIp6 set the subnetIp6.
     */
    public void setSubnetIp6(String  subnetIp6) {
        this.subnetIp6 = subnetIp6;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DnsEdnsOption objDnsEdnsOption = (DnsEdnsOption) o;
      return   Objects.equals(this.code, objDnsEdnsOption.code)&&
  Objects.equals(this.addrFamily, objDnsEdnsOption.addrFamily)&&
  Objects.equals(this.sourcePrefixLen, objDnsEdnsOption.sourcePrefixLen)&&
  Objects.equals(this.scopePrefixLen, objDnsEdnsOption.scopePrefixLen)&&
  Objects.equals(this.subnetIp, objDnsEdnsOption.subnetIp)&&
  Objects.equals(this.subnetIp6, objDnsEdnsOption.subnetIp6);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DnsEdnsOption {\n");
                  sb.append("    addrFamily: ").append(toIndentedString(addrFamily)).append("\n");
                        sb.append("    code: ").append(toIndentedString(code)).append("\n");
                        sb.append("    scopePrefixLen: ").append(toIndentedString(scopePrefixLen)).append("\n");
                        sb.append("    sourcePrefixLen: ").append(toIndentedString(sourcePrefixLen)).append("\n");
                        sb.append("    subnetIp: ").append(toIndentedString(subnetIp)).append("\n");
                        sb.append("    subnetIp6: ").append(toIndentedString(subnetIp6)).append("\n");
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
