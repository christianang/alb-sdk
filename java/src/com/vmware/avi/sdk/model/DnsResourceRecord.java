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
 * The DnsResourceRecord is a POJO class extends AviRestResource that used for creating
 * DnsResourceRecord.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsResourceRecord  {
    @JsonProperty("addr6_ip_str")
    private String addr6IpStr;

    @JsonProperty("addr_ip")
    private Integer addrIp;

    @JsonProperty("cname")
    private String cname;

    @JsonProperty("dclass")
    private Integer dclass;

    @JsonProperty("location")
    private GeoLocation location;

    @JsonProperty("mail_server")
    private String mailServer;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nsname")
    private String nsname;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("site_name")
    private String siteName;

    @JsonProperty("text_rdata")
    private String textRdata;

    @JsonProperty("ttl")
    private Integer ttl;

    @JsonProperty("type")
    private String type;

    @JsonProperty("vs_name")
    private String vsName;



    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 address of the requested fqdn.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return addr6IpStr
     */
    public String getAddr6IpStr() {
        return addr6IpStr;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 address of the requested fqdn.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param addr6IpStr set the addr6IpStr.
     */
    public void setAddr6IpStr(String  addr6IpStr) {
        this.addr6IpStr = addr6IpStr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv4 address of the requested fqdn.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return addrIp
     */
    public Integer getAddrIp() {
        return addrIp;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv4 address of the requested fqdn.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param addrIp set the addrIp.
     */
    public void setAddrIp(Integer  addrIp) {
        this.addrIp = addrIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Canonical (real) name of the requested fqdn.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * This is the setter method to the attribute.
     * Canonical (real) name of the requested fqdn.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cname set the cname.
     */
    public void setCname(String  cname) {
        this.cname = cname;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Class of the data in the resource record.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dclass
     */
    public Integer getDclass() {
        return dclass;
    }

    /**
     * This is the setter method to the attribute.
     * Class of the data in the resource record.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dclass set the dclass.
     */
    public void setDclass(Integer  dclass) {
        this.dclass = dclass;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Geo location of member.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return location
     */
    public GeoLocation getLocation() {
        return location;
    }

    /**
     * This is the setter method to the attribute.
     * Geo location of member.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param location set the location.
     */
    public void setLocation(GeoLocation location) {
        this.location = location;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fully qualified domain name of a mail server in the mx record.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mailServer
     */
    public String getMailServer() {
        return mailServer;
    }

    /**
     * This is the setter method to the attribute.
     * Fully qualified domain name of a mail server in the mx record.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mailServer set the mailServer.
     */
    public void setMailServer(String  mailServer) {
        this.mailServer = mailServer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Domain name of the resource record.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Domain name of the resource record.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Domain name of the name server that is authoritative for the requested fqdn.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsname
     */
    public String getNsname() {
        return nsname;
    }

    /**
     * This is the setter method to the attribute.
     * Domain name of the name server that is authoritative for the requested fqdn.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsname set the nsname.
     */
    public void setNsname(String  nsname) {
        this.nsname = nsname;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service port.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This is the setter method to the attribute.
     * Service port.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param port set the port.
     */
    public void setPort(Integer  port) {
        this.port = port;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The priority field identifies which mail server should be preferred.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This is the setter method to the attribute.
     * The priority field identifies which mail server should be preferred.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param priority set the priority.
     */
    public void setPriority(Integer  priority) {
        this.priority = priority;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Site controller cluster name - applicable only for avi vs gslb member.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return siteName
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * This is the setter method to the attribute.
     * Site controller cluster name - applicable only for avi vs gslb member.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param siteName set the siteName.
     */
    public void setSiteName(String  siteName) {
        this.siteName = siteName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Text resource record.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return textRdata
     */
    public String getTextRdata() {
        return textRdata;
    }

    /**
     * This is the setter method to the attribute.
     * Text resource record.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param textRdata set the textRdata.
     */
    public void setTextRdata(String  textRdata) {
        this.textRdata = textRdata;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of seconds the resource record can be cached.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * This is the setter method to the attribute.
     * Number of seconds the resource record can be cached.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ttl set the ttl.
     */
    public void setTtl(Integer  ttl) {
        this.ttl = ttl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Type of resource record.
     * Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX,
     * DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR,
     * DNS_RECORD_ANY.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Type of resource record.
     * Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX,
     * DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR,
     * DNS_RECORD_ANY.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Virtual service name - applicable only for avi vs gslb member.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public String getVsName() {
        return vsName;
    }

    /**
     * This is the setter method to the attribute.
     * Virtual service name - applicable only for avi vs gslb member.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsName set the vsName.
     */
    public void setVsName(String  vsName) {
        this.vsName = vsName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DnsResourceRecord objDnsResourceRecord = (DnsResourceRecord) o;
      return   Objects.equals(this.type, objDnsResourceRecord.type)&&
  Objects.equals(this.ttl, objDnsResourceRecord.ttl)&&
  Objects.equals(this.dclass, objDnsResourceRecord.dclass)&&
  Objects.equals(this.addrIp, objDnsResourceRecord.addrIp)&&
  Objects.equals(this.nsname, objDnsResourceRecord.nsname)&&
  Objects.equals(this.cname, objDnsResourceRecord.cname)&&
  Objects.equals(this.port, objDnsResourceRecord.port)&&
  Objects.equals(this.siteName, objDnsResourceRecord.siteName)&&
  Objects.equals(this.vsName, objDnsResourceRecord.vsName)&&
  Objects.equals(this.location, objDnsResourceRecord.location)&&
  Objects.equals(this.addr6IpStr, objDnsResourceRecord.addr6IpStr)&&
  Objects.equals(this.mailServer, objDnsResourceRecord.mailServer)&&
  Objects.equals(this.priority, objDnsResourceRecord.priority)&&
  Objects.equals(this.textRdata, objDnsResourceRecord.textRdata)&&
  Objects.equals(this.name, objDnsResourceRecord.name);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DnsResourceRecord {\n");
                  sb.append("    addr6IpStr: ").append(toIndentedString(addr6IpStr)).append("\n");
                        sb.append("    addrIp: ").append(toIndentedString(addrIp)).append("\n");
                        sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
                        sb.append("    dclass: ").append(toIndentedString(dclass)).append("\n");
                        sb.append("    location: ").append(toIndentedString(location)).append("\n");
                        sb.append("    mailServer: ").append(toIndentedString(mailServer)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    nsname: ").append(toIndentedString(nsname)).append("\n");
                        sb.append("    port: ").append(toIndentedString(port)).append("\n");
                        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
                        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
                        sb.append("    textRdata: ").append(toIndentedString(textRdata)).append("\n");
                        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
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
