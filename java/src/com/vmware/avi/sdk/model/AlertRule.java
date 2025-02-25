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
 * The AlertRule is a POJO class extends AviRestResource that used for creating
 * AlertRule.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertRule  {
    @JsonProperty("conn_app_log_rule")
    private AlertFilter connAppLogRule;

    @JsonProperty("event_match_filter")
    private String eventMatchFilter;

    @JsonProperty("metrics_rule")
    private List<AlertRuleMetric> metricsRule;

    @JsonProperty("operator")
    private String operator = "OPERATOR_AND";

    @JsonProperty("sys_event_rule")
    private List<AlertRuleEvent> sysEventRule;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connAppLogRule
     */
    public AlertFilter getConnAppLogRule() {
        return connAppLogRule;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connAppLogRule set the connAppLogRule.
     */
    public void setConnAppLogRule(AlertFilter connAppLogRule) {
        this.connAppLogRule = connAppLogRule;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventMatchFilter
     */
    public String getEventMatchFilter() {
        return eventMatchFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param eventMatchFilter set the eventMatchFilter.
     */
    public void setEventMatchFilter(String  eventMatchFilter) {
        this.eventMatchFilter = eventMatchFilter;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsRule
     */
    public List<AlertRuleMetric> getMetricsRule() {
        return metricsRule;
    }

    /**
     * This is the setter method. this will set the metricsRule
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsRule
     */
    public void setMetricsRule(List<AlertRuleMetric>  metricsRule) {
        this.metricsRule = metricsRule;
    }

    /**
     * This is the setter method this will set the metricsRule
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsRule
     */
    public AlertRule addMetricsRuleItem(AlertRuleMetric metricsRuleItem) {
      if (this.metricsRule == null) {
        this.metricsRule = new ArrayList<AlertRuleMetric>();
      }
      this.metricsRule.add(metricsRuleItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - OPERATOR_AND, OPERATOR_OR.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "OPERATOR_AND".
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - OPERATOR_AND, OPERATOR_OR.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "OPERATOR_AND".
     * @param operator set the operator.
     */
    public void setOperator(String  operator) {
        this.operator = operator;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sysEventRule
     */
    public List<AlertRuleEvent> getSysEventRule() {
        return sysEventRule;
    }

    /**
     * This is the setter method. this will set the sysEventRule
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sysEventRule
     */
    public void setSysEventRule(List<AlertRuleEvent>  sysEventRule) {
        this.sysEventRule = sysEventRule;
    }

    /**
     * This is the setter method this will set the sysEventRule
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sysEventRule
     */
    public AlertRule addSysEventRuleItem(AlertRuleEvent sysEventRuleItem) {
      if (this.sysEventRule == null) {
        this.sysEventRule = new ArrayList<AlertRuleEvent>();
      }
      this.sysEventRule.add(sysEventRuleItem);
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
      AlertRule objAlertRule = (AlertRule) o;
      return   Objects.equals(this.sysEventRule, objAlertRule.sysEventRule)&&
  Objects.equals(this.connAppLogRule, objAlertRule.connAppLogRule)&&
  Objects.equals(this.eventMatchFilter, objAlertRule.eventMatchFilter)&&
  Objects.equals(this.metricsRule, objAlertRule.metricsRule)&&
  Objects.equals(this.operator, objAlertRule.operator);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AlertRule {\n");
                  sb.append("    connAppLogRule: ").append(toIndentedString(connAppLogRule)).append("\n");
                        sb.append("    eventMatchFilter: ").append(toIndentedString(eventMatchFilter)).append("\n");
                        sb.append("    metricsRule: ").append(toIndentedString(metricsRule)).append("\n");
                        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
                        sb.append("    sysEventRule: ").append(toIndentedString(sysEventRule)).append("\n");
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
