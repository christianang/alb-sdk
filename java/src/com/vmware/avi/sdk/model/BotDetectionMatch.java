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
 * The BotDetectionMatch is a POJO class extends AviRestResource that used for creating
 * BotDetectionMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BotDetectionMatch  {
    @JsonProperty("classifications")
    private List<BotClassification> classifications;

    @JsonProperty("match_operation")
    private String matchOperation;


    /**
     * This is the getter method this will return the attribute value.
     * Bot classification types.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return classifications
     */
    public List<BotClassification> getClassifications() {
        return classifications;
    }

    /**
     * This is the setter method. this will set the classifications
     * Bot classification types.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return classifications
     */
    public void setClassifications(List<BotClassification>  classifications) {
        this.classifications = classifications;
    }

    /**
     * This is the setter method this will set the classifications
     * Bot classification types.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return classifications
     */
    public BotDetectionMatch addClassificationsItem(BotClassification classificationsItem) {
      if (this.classifications == null) {
        this.classifications = new ArrayList<BotClassification>();
      }
      this.classifications.add(classificationsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Match criteria.
     * Enum options - IS_IN, IS_NOT_IN.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchOperation
     */
    public String getMatchOperation() {
        return matchOperation;
    }

    /**
     * This is the setter method to the attribute.
     * Match criteria.
     * Enum options - IS_IN, IS_NOT_IN.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param matchOperation set the matchOperation.
     */
    public void setMatchOperation(String  matchOperation) {
        this.matchOperation = matchOperation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      BotDetectionMatch objBotDetectionMatch = (BotDetectionMatch) o;
      return   Objects.equals(this.matchOperation, objBotDetectionMatch.matchOperation)&&
  Objects.equals(this.classifications, objBotDetectionMatch.classifications);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BotDetectionMatch {\n");
                  sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
                        sb.append("    matchOperation: ").append(toIndentedString(matchOperation)).append("\n");
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
