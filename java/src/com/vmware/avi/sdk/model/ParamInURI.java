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
 * The ParamInURI is a POJO class extends AviRestResource that used for creating
 * ParamInURI.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParamInURI  {
    @JsonProperty("param_name")
    private String paramName;

    @JsonProperty("value")
    private String value;



    /**
     * This is the getter method this will return the attribute value.
     * Param name in hitted signature rule match_element.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * This is the setter method to the attribute.
     * Param name in hitted signature rule match_element.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param paramName set the paramName.
     */
    public void setParamName(String  paramName) {
        this.paramName = paramName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Param value in hitted signature rule match_element.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * This is the setter method to the attribute.
     * Param value in hitted signature rule match_element.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param value set the value.
     */
    public void setValue(String  value) {
        this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ParamInURI objParamInURI = (ParamInURI) o;
      return   Objects.equals(this.paramName, objParamInURI.paramName)&&
  Objects.equals(this.value, objParamInURI.value);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ParamInURI {\n");
                  sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
                        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
