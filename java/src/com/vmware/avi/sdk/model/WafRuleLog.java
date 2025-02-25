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
 * The WafRuleLog is a POJO class extends AviRestResource that used for creating
 * WafRuleLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafRuleLog  {
    @JsonProperty("matches")
    private List<WafRuleMatchData> matches;

    @JsonProperty("msg")
    private String msg;

    @JsonProperty("omitted_match_elements")
    private Integer omittedMatchElements = 0;

    @JsonProperty("phase")
    private String phase;

    @JsonProperty("rule_group")
    private String ruleGroup;

    @JsonProperty("rule_id")
    private Integer ruleId;

    @JsonProperty("rule_name")
    private String ruleName;

    @JsonProperty("tags")
    private List<String> tags;


    /**
     * This is the getter method this will return the attribute value.
     * Transaction data that matched the rule.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matches
     */
    public List<WafRuleMatchData> getMatches() {
        return matches;
    }

    /**
     * This is the setter method. this will set the matches
     * Transaction data that matched the rule.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matches
     */
    public void setMatches(List<WafRuleMatchData>  matches) {
        this.matches = matches;
    }

    /**
     * This is the setter method this will set the matches
     * Transaction data that matched the rule.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matches
     */
    public WafRuleLog addMatchesItem(WafRuleMatchData matchesItem) {
      if (this.matches == null) {
        this.matches = new ArrayList<WafRuleMatchData>();
      }
      this.matches.add(matchesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rule's msg string per modsec language.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * This is the setter method to the attribute.
     * Rule's msg string per modsec language.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param msg set the msg.
     */
    public void setMsg(String  msg) {
        this.msg = msg;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The count of omitted match element logs in the current rule.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return omittedMatchElements
     */
    public Integer getOmittedMatchElements() {
        return omittedMatchElements;
    }

    /**
     * This is the setter method to the attribute.
     * The count of omitted match element logs in the current rule.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param omittedMatchElements set the omittedMatchElements.
     */
    public void setOmittedMatchElements(Integer  omittedMatchElements) {
        this.omittedMatchElements = omittedMatchElements;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Phase in which transaction matched the rule - for instance, request header phase.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    /**
     * This is the setter method to the attribute.
     * Phase in which transaction matched the rule - for instance, request header phase.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param phase set the phase.
     */
    public void setPhase(String  phase) {
        this.phase = phase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rule group for the matching rule.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleGroup
     */
    public String getRuleGroup() {
        return ruleGroup;
    }

    /**
     * This is the setter method to the attribute.
     * Rule group for the matching rule.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ruleGroup set the ruleGroup.
     */
    public void setRuleGroup(String  ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Id of the matching rule per modsec language.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleId
     */
    public Integer getRuleId() {
        return ruleId;
    }

    /**
     * This is the setter method to the attribute.
     * Id of the matching rule per modsec language.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ruleId set the ruleId.
     */
    public void setRuleId(Integer  ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the rule.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the rule.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ruleName set the ruleName.
     */
    public void setRuleName(String  ruleName) {
        this.ruleName = ruleName;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Rule's tags per modsec language.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * This is the setter method. this will set the tags
     * Rule's tags per modsec language.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tags
     */
    public void setTags(List<String>  tags) {
        this.tags = tags;
    }

    /**
     * This is the setter method this will set the tags
     * Rule's tags per modsec language.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tags
     */
    public WafRuleLog addTagsItem(String tagsItem) {
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tagsItem);
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
      WafRuleLog objWafRuleLog = (WafRuleLog) o;
      return   Objects.equals(this.phase, objWafRuleLog.phase)&&
  Objects.equals(this.ruleId, objWafRuleLog.ruleId)&&
  Objects.equals(this.ruleGroup, objWafRuleLog.ruleGroup)&&
  Objects.equals(this.msg, objWafRuleLog.msg)&&
  Objects.equals(this.matches, objWafRuleLog.matches)&&
  Objects.equals(this.tags, objWafRuleLog.tags)&&
  Objects.equals(this.ruleName, objWafRuleLog.ruleName)&&
  Objects.equals(this.omittedMatchElements, objWafRuleLog.omittedMatchElements);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafRuleLog {\n");
                  sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
                        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
                        sb.append("    omittedMatchElements: ").append(toIndentedString(omittedMatchElements)).append("\n");
                        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
                        sb.append("    ruleGroup: ").append(toIndentedString(ruleGroup)).append("\n");
                        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
                        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
                        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
