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
 * The MicroServiceMatch is a POJO class extends AviRestResource that used for creating
 * MicroServiceMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MicroServiceMatch  {
    @JsonProperty("group_ref")
    private String groupRef;

    @JsonProperty("match_criteria")
    private String matchCriteria;



    /**
     * This is the getter method this will return the attribute value.
     * Uuid of micro service group(s).
     * It is a reference to an object of type microservicegroup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return groupRef
     */
    public String getGroupRef() {
        return groupRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of micro service group(s).
     * It is a reference to an object of type microservicegroup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param groupRef set the groupRef.
     */
    public void setGroupRef(String  groupRef) {
        this.groupRef = groupRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Criterion to use for micro service matching the http request.
     * Enum options - IS_IN, IS_NOT_IN.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchCriteria
     */
    public String getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * This is the setter method to the attribute.
     * Criterion to use for micro service matching the http request.
     * Enum options - IS_IN, IS_NOT_IN.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param matchCriteria set the matchCriteria.
     */
    public void setMatchCriteria(String  matchCriteria) {
        this.matchCriteria = matchCriteria;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MicroServiceMatch objMicroServiceMatch = (MicroServiceMatch) o;
      return   Objects.equals(this.matchCriteria, objMicroServiceMatch.matchCriteria)&&
  Objects.equals(this.groupRef, objMicroServiceMatch.groupRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MicroServiceMatch {\n");
                  sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
                        sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
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
