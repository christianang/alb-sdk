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
 * The QueryMatch is a POJO class extends AviRestResource that used for creating
 * QueryMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryMatch  {
    @JsonProperty("match_case")
    private String matchCase = "INSENSITIVE";

    @JsonProperty("match_criteria")
    private String matchCriteria;

    @JsonProperty("match_decoded_string")
    private Boolean matchDecodedString = true;

    @JsonProperty("match_str")
    private List<String> matchStr;

    @JsonProperty("string_group_refs")
    private List<String> stringGroupRefs;



    /**
     * This is the getter method this will return the attribute value.
     * Case sensitivity to use for the match.
     * Enum options - SENSITIVE, INSENSITIVE.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "INSENSITIVE".
     * @return matchCase
     */
    public String getMatchCase() {
        return matchCase;
    }

    /**
     * This is the setter method to the attribute.
     * Case sensitivity to use for the match.
     * Enum options - SENSITIVE, INSENSITIVE.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "INSENSITIVE".
     * @param matchCase set the matchCase.
     */
    public void setMatchCase(String  matchCase) {
        this.matchCase = matchCase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Criterion to use for matching the query in http request uri.
     * Enum options - QUERY_MATCH_CONTAINS, QUERY_MATCH_DOES_NOT_CONTAIN, QUERY_MATCH_EXISTS, QUERY_MATCH_DOES_NOT_EXIST, QUERY_MATCH_BEGINS_WITH,
     * QUERY_MATCH_DOES_NOT_BEGIN_WITH, QUERY_MATCH_ENDS_WITH, QUERY_MATCH_DOES_NOT_END_WITH, QUERY_MATCH_EQUALS, QUERY_MATCH_DOES_NOT_EQUAL,
     * QUERY_MATCH_REGEX_MATCH, QUERY_MATCH_REGEX_DOES_NOT_MATCH.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchCriteria
     */
    public String getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * This is the setter method to the attribute.
     * Criterion to use for matching the query in http request uri.
     * Enum options - QUERY_MATCH_CONTAINS, QUERY_MATCH_DOES_NOT_CONTAIN, QUERY_MATCH_EXISTS, QUERY_MATCH_DOES_NOT_EXIST, QUERY_MATCH_BEGINS_WITH,
     * QUERY_MATCH_DOES_NOT_BEGIN_WITH, QUERY_MATCH_ENDS_WITH, QUERY_MATCH_DOES_NOT_END_WITH, QUERY_MATCH_EQUALS, QUERY_MATCH_DOES_NOT_EQUAL,
     * QUERY_MATCH_REGEX_MATCH, QUERY_MATCH_REGEX_DOES_NOT_MATCH.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param matchCriteria set the matchCriteria.
     */
    public void setMatchCriteria(String  matchCriteria) {
        this.matchCriteria = matchCriteria;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Match against the decoded uri query.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return matchDecodedString
     */
    public Boolean getMatchDecodedString() {
        return matchDecodedString;
    }

    /**
     * This is the setter method to the attribute.
     * Match against the decoded uri query.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param matchDecodedString set the matchDecodedString.
     */
    public void setMatchDecodedString(Boolean  matchDecodedString) {
        this.matchDecodedString = matchDecodedString;
    }
    /**
     * This is the getter method this will return the attribute value.
     * String value(s).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchStr
     */
    public List<String> getMatchStr() {
        return matchStr;
    }

    /**
     * This is the setter method. this will set the matchStr
     * String value(s).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchStr
     */
    public void setMatchStr(List<String>  matchStr) {
        this.matchStr = matchStr;
    }

    /**
     * This is the setter method this will set the matchStr
     * String value(s).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchStr
     */
    public QueryMatch addMatchStrItem(String matchStrItem) {
      if (this.matchStr == null) {
        this.matchStr = new ArrayList<String>();
      }
      this.matchStr.add(matchStrItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the string group(s).
     * It is a reference to an object of type stringgroup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringGroupRefs
     */
    public List<String> getStringGroupRefs() {
        return stringGroupRefs;
    }

    /**
     * This is the setter method. this will set the stringGroupRefs
     * Uuid of the string group(s).
     * It is a reference to an object of type stringgroup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringGroupRefs
     */
    public void setStringGroupRefs(List<String>  stringGroupRefs) {
        this.stringGroupRefs = stringGroupRefs;
    }

    /**
     * This is the setter method this will set the stringGroupRefs
     * Uuid of the string group(s).
     * It is a reference to an object of type stringgroup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringGroupRefs
     */
    public QueryMatch addStringGroupRefsItem(String stringGroupRefsItem) {
      if (this.stringGroupRefs == null) {
        this.stringGroupRefs = new ArrayList<String>();
      }
      this.stringGroupRefs.add(stringGroupRefsItem);
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
      QueryMatch objQueryMatch = (QueryMatch) o;
      return   Objects.equals(this.matchCriteria, objQueryMatch.matchCriteria)&&
  Objects.equals(this.matchCase, objQueryMatch.matchCase)&&
  Objects.equals(this.matchStr, objQueryMatch.matchStr)&&
  Objects.equals(this.stringGroupRefs, objQueryMatch.stringGroupRefs)&&
  Objects.equals(this.matchDecodedString, objQueryMatch.matchDecodedString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class QueryMatch {\n");
                  sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
                        sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
                        sb.append("    matchDecodedString: ").append(toIndentedString(matchDecodedString)).append("\n");
                        sb.append("    matchStr: ").append(toIndentedString(matchStr)).append("\n");
                        sb.append("    stringGroupRefs: ").append(toIndentedString(stringGroupRefs)).append("\n");
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
