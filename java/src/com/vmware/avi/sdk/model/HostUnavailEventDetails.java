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
 * The HostUnavailEventDetails is a POJO class extends AviRestResource that used for creating
 * HostUnavailEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HostUnavailEventDetails  {
    @JsonProperty("name")
    private String name;

    @JsonProperty("reasons")
    private List<String> reasons;

    @JsonProperty("vs_name")
    private String vsName;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reasons
     */
    public List<String> getReasons() {
        return reasons;
    }

    /**
     * This is the setter method. this will set the reasons
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reasons
     */
    public void setReasons(List<String>  reasons) {
        this.reasons = reasons;
    }

    /**
     * This is the setter method this will set the reasons
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reasons
     */
    public HostUnavailEventDetails addReasonsItem(String reasonsItem) {
      if (this.reasons == null) {
        this.reasons = new ArrayList<String>();
      }
      this.reasons.add(reasonsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public String getVsName() {
        return vsName;
    }

    /**
     * This is the setter method to the attribute.
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
      HostUnavailEventDetails objHostUnavailEventDetails = (HostUnavailEventDetails) o;
      return   Objects.equals(this.reasons, objHostUnavailEventDetails.reasons)&&
  Objects.equals(this.vsName, objHostUnavailEventDetails.vsName)&&
  Objects.equals(this.name, objHostUnavailEventDetails.name);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HostUnavailEventDetails {\n");
                  sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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
