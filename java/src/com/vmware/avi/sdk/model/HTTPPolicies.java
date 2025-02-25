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
 * The HTTPPolicies is a POJO class extends AviRestResource that used for creating
 * HTTPPolicies.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPPolicies  {
    @JsonProperty("http_policy_set_ref")
    private String httpPolicySetRef;

    @JsonProperty("index")
    private Integer index;



    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the virtual service http policy collection.
     * It is a reference to an object of type httppolicyset.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpPolicySetRef
     */
    public String getHttpPolicySetRef() {
        return httpPolicySetRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the virtual service http policy collection.
     * It is a reference to an object of type httppolicyset.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpPolicySetRef set the httpPolicySetRef.
     */
    public void setHttpPolicySetRef(String  httpPolicySetRef) {
        this.httpPolicySetRef = httpPolicySetRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Index of the virtual service http policy collection.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * This is the setter method to the attribute.
     * Index of the virtual service http policy collection.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param index set the index.
     */
    public void setIndex(Integer  index) {
        this.index = index;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HTTPPolicies objHTTPPolicies = (HTTPPolicies) o;
      return   Objects.equals(this.index, objHTTPPolicies.index)&&
  Objects.equals(this.httpPolicySetRef, objHTTPPolicies.httpPolicySetRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HTTPPolicies {\n");
                  sb.append("    httpPolicySetRef: ").append(toIndentedString(httpPolicySetRef)).append("\n");
                        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
