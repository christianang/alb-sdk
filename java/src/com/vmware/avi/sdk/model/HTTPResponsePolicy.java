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
 * The HTTPResponsePolicy is a POJO class extends AviRestResource that used for creating
 * HTTPResponsePolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPResponsePolicy  {
    @JsonProperty("rules")
    private List<HTTPResponseRule> rules;


    /**
     * This is the getter method this will return the attribute value.
     * Add rules to the http response policy.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public List<HTTPResponseRule> getRules() {
        return rules;
    }

    /**
     * This is the setter method. this will set the rules
     * Add rules to the http response policy.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public void setRules(List<HTTPResponseRule>  rules) {
        this.rules = rules;
    }

    /**
     * This is the setter method this will set the rules
     * Add rules to the http response policy.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public HTTPResponsePolicy addRulesItem(HTTPResponseRule rulesItem) {
      if (this.rules == null) {
        this.rules = new ArrayList<HTTPResponseRule>();
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
      HTTPResponsePolicy objHTTPResponsePolicy = (HTTPResponsePolicy) o;
      return   Objects.equals(this.rules, objHTTPResponsePolicy.rules);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HTTPResponsePolicy {\n");
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
