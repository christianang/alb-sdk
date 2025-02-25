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
 * The L4ConnectionPolicy is a POJO class extends AviRestResource that used for creating
 * L4ConnectionPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class L4ConnectionPolicy  {
    @JsonProperty("rules")
    private List<L4Rule> rules;


    /**
     * This is the getter method this will return the attribute value.
     * Rules to apply when a new transport connection is setup.
     * Field introduced in 17.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public List<L4Rule> getRules() {
        return rules;
    }

    /**
     * This is the setter method. this will set the rules
     * Rules to apply when a new transport connection is setup.
     * Field introduced in 17.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public void setRules(List<L4Rule>  rules) {
        this.rules = rules;
    }

    /**
     * This is the setter method this will set the rules
     * Rules to apply when a new transport connection is setup.
     * Field introduced in 17.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public L4ConnectionPolicy addRulesItem(L4Rule rulesItem) {
      if (this.rules == null) {
        this.rules = new ArrayList<L4Rule>();
      }
      this.rules.add(rulesItem);
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
      L4ConnectionPolicy objL4ConnectionPolicy = (L4ConnectionPolicy) o;
      return   Objects.equals(this.rules, objL4ConnectionPolicy.rules);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class L4ConnectionPolicy {\n");
                  sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
