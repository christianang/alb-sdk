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
 * The ReplaceStringVar is a POJO class extends AviRestResource that used for creating
 * ReplaceStringVar.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplaceStringVar  {
    @JsonProperty("type")
    private String type = "LITERAL_STRING";

    @JsonProperty("val")
    private String val;



    /**
     * This is the getter method this will return the attribute value.
     * Type of replacement string - can be a variable exposed from datascript, value of an http variable, a custom user-input literal string, or a
     * string with all three combined.
     * Enum options - DATASCRIPT_VAR, AVI_VAR, LITERAL_STRING, COMBINATION_STRING.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "LITERAL_STRING".
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Type of replacement string - can be a variable exposed from datascript, value of an http variable, a custom user-input literal string, or a
     * string with all three combined.
     * Enum options - DATASCRIPT_VAR, AVI_VAR, LITERAL_STRING, COMBINATION_STRING.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "LITERAL_STRING".
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Value of the replacement string - name of variable exposed from datascript, name of the http header, a custom user-input literal string, or a
     * string with all three combined.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return val
     */
    public String getVal() {
        return val;
    }

    /**
     * This is the setter method to the attribute.
     * Value of the replacement string - name of variable exposed from datascript, name of the http header, a custom user-input literal string, or a
     * string with all three combined.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param val set the val.
     */
    public void setVal(String  val) {
        this.val = val;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ReplaceStringVar objReplaceStringVar = (ReplaceStringVar) o;
      return   Objects.equals(this.type, objReplaceStringVar.type)&&
  Objects.equals(this.val, objReplaceStringVar.val);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReplaceStringVar {\n");
                  sb.append("    type: ").append(toIndentedString(type)).append("\n");
                        sb.append("    val: ").append(toIndentedString(val)).append("\n");
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
