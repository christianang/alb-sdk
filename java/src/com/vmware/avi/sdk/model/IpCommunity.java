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
 * The IpCommunity is a POJO class extends AviRestResource that used for creating
 * IpCommunity.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpCommunity  {
    @JsonProperty("community")
    private List<String> community;

    @JsonProperty("ip_begin")
    private IpAddr ipBegin;

    @JsonProperty("ip_end")
    private IpAddr ipEnd;


    /**
     * This is the getter method this will return the attribute value.
     * Community string either in aa nn format where aa, nn is within [1,65535] or local-as|no-advertise|no-export|internet.
     * Field introduced in 17.1.3.
     * Minimum of 1 items required.
     * Maximum of 16 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return community
     */
    public List<String> getCommunity() {
        return community;
    }

    /**
     * This is the setter method. this will set the community
     * Community string either in aa nn format where aa, nn is within [1,65535] or local-as|no-advertise|no-export|internet.
     * Field introduced in 17.1.3.
     * Minimum of 1 items required.
     * Maximum of 16 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return community
     */
    public void setCommunity(List<String>  community) {
        this.community = community;
    }

    /**
     * This is the setter method this will set the community
     * Community string either in aa nn format where aa, nn is within [1,65535] or local-as|no-advertise|no-export|internet.
     * Field introduced in 17.1.3.
     * Minimum of 1 items required.
     * Maximum of 16 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return community
     */
    public IpCommunity addCommunityItem(String communityItem) {
      if (this.community == null) {
        this.community = new ArrayList<String>();
      }
      this.community.add(communityItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Beginning of ip address range.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipBegin
     */
    public IpAddr getIpBegin() {
        return ipBegin;
    }

    /**
     * This is the setter method to the attribute.
     * Beginning of ip address range.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipBegin set the ipBegin.
     */
    public void setIpBegin(IpAddr ipBegin) {
        this.ipBegin = ipBegin;
    }

    /**
     * This is the getter method this will return the attribute value.
     * End of ip address range.
     * Optional if ip_begin is the only ip address in specified ip range.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipEnd
     */
    public IpAddr getIpEnd() {
        return ipEnd;
    }

    /**
     * This is the setter method to the attribute.
     * End of ip address range.
     * Optional if ip_begin is the only ip address in specified ip range.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipEnd set the ipEnd.
     */
    public void setIpEnd(IpAddr ipEnd) {
        this.ipEnd = ipEnd;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      IpCommunity objIpCommunity = (IpCommunity) o;
      return   Objects.equals(this.ipBegin, objIpCommunity.ipBegin)&&
  Objects.equals(this.ipEnd, objIpCommunity.ipEnd)&&
  Objects.equals(this.community, objIpCommunity.community);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IpCommunity {\n");
                  sb.append("    community: ").append(toIndentedString(community)).append("\n");
                        sb.append("    ipBegin: ").append(toIndentedString(ipBegin)).append("\n");
                        sb.append("    ipEnd: ").append(toIndentedString(ipEnd)).append("\n");
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
