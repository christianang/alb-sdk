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
 * The AuthTacacsPlusAttributeValuePair is a POJO class extends AviRestResource that used for creating
 * AuthTacacsPlusAttributeValuePair.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthTacacsPlusAttributeValuePair  {
    @JsonProperty("mandatory")
    private Boolean mandatory;

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private String value;



    /**
     * This is the getter method this will return the attribute value.
     * Mandatory.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mandatory
     */
    public Boolean getMandatory() {
        return mandatory;
    }

    /**
     * This is the setter method to the attribute.
     * Mandatory.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mandatory set the mandatory.
     */
    public void setMandatory(Boolean  mandatory) {
        this.mandatory = mandatory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Attribute name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Attribute name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * This is the setter method to the attribute.
     * Attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
      AuthTacacsPlusAttributeValuePair objAuthTacacsPlusAttributeValuePair = (AuthTacacsPlusAttributeValuePair) o;
      return   Objects.equals(this.name, objAuthTacacsPlusAttributeValuePair.name)&&
  Objects.equals(this.value, objAuthTacacsPlusAttributeValuePair.value)&&
  Objects.equals(this.mandatory, objAuthTacacsPlusAttributeValuePair.mandatory);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AuthTacacsPlusAttributeValuePair {\n");
                  sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
