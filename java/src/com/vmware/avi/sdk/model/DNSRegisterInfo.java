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
 * The DNSRegisterInfo is a POJO class extends AviRestResource that used for creating
 * DNSRegisterInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DNSRegisterInfo  {
    @JsonProperty("dns_info")
    private List<DnsInfo> dnsInfo;

    @JsonProperty("error")
    private String error;

    @JsonProperty("fip")
    private IpAddr fip;

    @JsonProperty("fip6")
    private IpAddr fip6;

    @JsonProperty("total_records")
    private Integer totalRecords;

    @JsonProperty("vip")
    private IpAddr vip;

    @JsonProperty("vip6")
    private IpAddr vip6;

    @JsonProperty("vip_id")
    private String vipId;

    @JsonProperty("vs_names")
    private List<String> vsNames;

    @JsonProperty("vs_uuids")
    private List<String> vsUuids;


    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsInfo
     */
    public List<DnsInfo> getDnsInfo() {
        return dnsInfo;
    }

    /**
     * This is the setter method. this will set the dnsInfo
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsInfo
     */
    public void setDnsInfo(List<DnsInfo>  dnsInfo) {
        this.dnsInfo = dnsInfo;
    }

    /**
     * This is the setter method this will set the dnsInfo
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsInfo
     */
    public DNSRegisterInfo addDnsInfoItem(DnsInfo dnsInfoItem) {
      if (this.dnsInfo == null) {
        this.dnsInfo = new ArrayList<DnsInfo>();
      }
      this.dnsInfo.add(dnsInfoItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return error
     */
    public String getError() {
        return error;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param error set the error.
     */
    public void setError(String  error) {
        this.error = error;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fip
     */
    public IpAddr getFip() {
        return fip;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fip set the fip.
     */
    public void setFip(IpAddr fip) {
        this.fip = fip;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fip6
     */
    public IpAddr getFip6() {
        return fip6;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fip6 set the fip6.
     */
    public void setFip6(IpAddr fip6) {
        this.fip6 = fip6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalRecords set the totalRecords.
     */
    public void setTotalRecords(Integer  totalRecords) {
        this.totalRecords = totalRecords;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vip
     */
    public IpAddr getVip() {
        return vip;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vip set the vip.
     */
    public void setVip(IpAddr vip) {
        this.vip = vip;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vip6
     */
    public IpAddr getVip6() {
        return vip6;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vip6 set the vip6.
     */
    public void setVip6(IpAddr vip6) {
        this.vip6 = vip6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipId
     */
    public String getVipId() {
        return vipId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipId set the vipId.
     */
    public void setVipId(String  vipId) {
        this.vipId = vipId;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsNames
     */
    public List<String> getVsNames() {
        return vsNames;
    }

    /**
     * This is the setter method. this will set the vsNames
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsNames
     */
    public void setVsNames(List<String>  vsNames) {
        this.vsNames = vsNames;
    }

    /**
     * This is the setter method this will set the vsNames
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsNames
     */
    public DNSRegisterInfo addVsNamesItem(String vsNamesItem) {
      if (this.vsNames == null) {
        this.vsNames = new ArrayList<String>();
      }
      this.vsNames.add(vsNamesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuids
     */
    public List<String> getVsUuids() {
        return vsUuids;
    }

    /**
     * This is the setter method. this will set the vsUuids
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuids
     */
    public void setVsUuids(List<String>  vsUuids) {
        this.vsUuids = vsUuids;
    }

    /**
     * This is the setter method this will set the vsUuids
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuids
     */
    public DNSRegisterInfo addVsUuidsItem(String vsUuidsItem) {
      if (this.vsUuids == null) {
        this.vsUuids = new ArrayList<String>();
      }
      this.vsUuids.add(vsUuidsItem);
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
      DNSRegisterInfo objDNSRegisterInfo = (DNSRegisterInfo) o;
      return   Objects.equals(this.vipId, objDNSRegisterInfo.vipId)&&
  Objects.equals(this.vsUuids, objDNSRegisterInfo.vsUuids)&&
  Objects.equals(this.vip, objDNSRegisterInfo.vip)&&
  Objects.equals(this.fip, objDNSRegisterInfo.fip)&&
  Objects.equals(this.dnsInfo, objDNSRegisterInfo.dnsInfo)&&
  Objects.equals(this.vsNames, objDNSRegisterInfo.vsNames)&&
  Objects.equals(this.error, objDNSRegisterInfo.error)&&
  Objects.equals(this.totalRecords, objDNSRegisterInfo.totalRecords)&&
  Objects.equals(this.vip6, objDNSRegisterInfo.vip6)&&
  Objects.equals(this.fip6, objDNSRegisterInfo.fip6);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DNSRegisterInfo {\n");
                  sb.append("    dnsInfo: ").append(toIndentedString(dnsInfo)).append("\n");
                        sb.append("    error: ").append(toIndentedString(error)).append("\n");
                        sb.append("    fip: ").append(toIndentedString(fip)).append("\n");
                        sb.append("    fip6: ").append(toIndentedString(fip6)).append("\n");
                        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
                        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
                        sb.append("    vip6: ").append(toIndentedString(vip6)).append("\n");
                        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
                        sb.append("    vsNames: ").append(toIndentedString(vsNames)).append("\n");
                        sb.append("    vsUuids: ").append(toIndentedString(vsUuids)).append("\n");
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
