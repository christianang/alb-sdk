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
 * The GslbSiteDnsVs is a POJO class extends AviRestResource that used for creating
 * GslbSiteDnsVs.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbSiteDnsVs  {
    @JsonProperty("dns_vs_uuid")
    private String dnsVsUuid;

    @JsonProperty("domain_names")
    private List<String> domainNames;



    /**
     * This is the getter method this will return the attribute value.
     * This field identifies the dns vs uuid for this site.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsVsUuid
     */
    public String getDnsVsUuid() {
        return dnsVsUuid;
    }

    /**
     * This is the setter method to the attribute.
     * This field identifies the dns vs uuid for this site.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsVsUuid set the dnsVsUuid.
     */
    public void setDnsVsUuid(String  dnsVsUuid) {
        this.dnsVsUuid = dnsVsUuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * This field identifies the subdomains that are hosted on the dns vs.
     * Gslbservice(s) whose fqdns map to one of the subdomains will be hosted on this dns vs.
     * If no subdomains are configured, then the default behavior is to host all the gslbservices on this dns vs.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return domainNames
     */
    public List<String> getDomainNames() {
        return domainNames;
    }

    /**
     * This is the setter method. this will set the domainNames
     * This field identifies the subdomains that are hosted on the dns vs.
     * Gslbservice(s) whose fqdns map to one of the subdomains will be hosted on this dns vs.
     * If no subdomains are configured, then the default behavior is to host all the gslbservices on this dns vs.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return domainNames
     */
    public void setDomainNames(List<String>  domainNames) {
        this.domainNames = domainNames;
    }

    /**
     * This is the setter method this will set the domainNames
     * This field identifies the subdomains that are hosted on the dns vs.
     * Gslbservice(s) whose fqdns map to one of the subdomains will be hosted on this dns vs.
     * If no subdomains are configured, then the default behavior is to host all the gslbservices on this dns vs.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return domainNames
     */
    public GslbSiteDnsVs addDomainNamesItem(String domainNamesItem) {
      if (this.domainNames == null) {
        this.domainNames = new ArrayList<String>();
      }
      this.domainNames.add(domainNamesItem);
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
      GslbSiteDnsVs objGslbSiteDnsVs = (GslbSiteDnsVs) o;
      return   Objects.equals(this.dnsVsUuid, objGslbSiteDnsVs.dnsVsUuid)&&
  Objects.equals(this.domainNames, objGslbSiteDnsVs.domainNames);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbSiteDnsVs {\n");
                  sb.append("    dnsVsUuid: ").append(toIndentedString(dnsVsUuid)).append("\n");
                        sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
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
