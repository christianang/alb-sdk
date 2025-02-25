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
 * The FalsePositiveDetails is a POJO class extends AviRestResource that used for creating
 * FalsePositiveDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FalsePositiveDetails  {
    @JsonProperty("false_positive_results")
    private List<FalsePositiveResult> falsePositiveResults;

    @JsonProperty("vs_name")
    private String vsName;

    @JsonProperty("vs_uuid")
    private String vsUuid;


    /**
     * This is the getter method this will return the attribute value.
     * False positive result details.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return falsePositiveResults
     */
    public List<FalsePositiveResult> getFalsePositiveResults() {
        return falsePositiveResults;
    }

    /**
     * This is the setter method. this will set the falsePositiveResults
     * False positive result details.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return falsePositiveResults
     */
    public void setFalsePositiveResults(List<FalsePositiveResult>  falsePositiveResults) {
        this.falsePositiveResults = falsePositiveResults;
    }

    /**
     * This is the setter method this will set the falsePositiveResults
     * False positive result details.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return falsePositiveResults
     */
    public FalsePositiveDetails addFalsePositiveResultsItem(FalsePositiveResult falsePositiveResultsItem) {
      if (this.falsePositiveResults == null) {
        this.falsePositiveResults = new ArrayList<FalsePositiveResult>();
      }
      this.falsePositiveResults.add(falsePositiveResultsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Virtualservice name for which false positive is being generated.
     * Field introduced in 30.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public String getVsName() {
        return vsName;
    }

    /**
     * This is the setter method to the attribute.
     * Virtualservice name for which false positive is being generated.
     * Field introduced in 30.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsName set the vsName.
     */
    public void setVsName(String  vsName) {
        this.vsName = vsName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Virtualservice uuid for which false positive is being generated.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public String getVsUuid() {
        return vsUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Virtualservice uuid for which false positive is being generated.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsUuid set the vsUuid.
     */
    public void setVsUuid(String  vsUuid) {
        this.vsUuid = vsUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      FalsePositiveDetails objFalsePositiveDetails = (FalsePositiveDetails) o;
      return   Objects.equals(this.vsUuid, objFalsePositiveDetails.vsUuid)&&
  Objects.equals(this.falsePositiveResults, objFalsePositiveDetails.falsePositiveResults)&&
  Objects.equals(this.vsName, objFalsePositiveDetails.vsName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FalsePositiveDetails {\n");
                  sb.append("    falsePositiveResults: ").append(toIndentedString(falsePositiveResults)).append("\n");
                        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
                        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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
