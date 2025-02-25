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
 * The IptableRuleSet is a POJO class extends AviRestResource that used for creating
 * IptableRuleSet.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IptableRuleSet  {
    @JsonProperty("chain")
    private String chain;

    @JsonProperty("rules")
    private List<IptableRule> rules;

    @JsonProperty("table")
    private String table;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return chain
     */
    public String getChain() {
        return chain;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param chain set the chain.
     */
    public void setChain(String  chain) {
        this.chain = chain;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public List<IptableRule> getRules() {
        return rules;
    }

    /**
     * This is the setter method. this will set the rules
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public void setRules(List<IptableRule>  rules) {
        this.rules = rules;
    }

    /**
     * This is the setter method this will set the rules
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public IptableRuleSet addRulesItem(IptableRule rulesItem) {
      if (this.rules == null) {
        this.rules = new ArrayList<IptableRule>();
      }
      this.rules.add(rulesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return table
     */
    public String getTable() {
        return table;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param table set the table.
     */
    public void setTable(String  table) {
        this.table = table;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      IptableRuleSet objIptableRuleSet = (IptableRuleSet) o;
      return   Objects.equals(this.table, objIptableRuleSet.table)&&
  Objects.equals(this.chain, objIptableRuleSet.chain)&&
  Objects.equals(this.rules, objIptableRuleSet.rules);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IptableRuleSet {\n");
                  sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
                        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
                        sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
