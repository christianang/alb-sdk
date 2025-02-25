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
 * The RollbackPatchControllerParams is a POJO class extends AviRestResource that used for creating
 * RollbackPatchControllerParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RollbackPatchControllerParams  {
    @JsonProperty("prechecks_only")
    private Boolean prechecksOnly = false;

    @JsonProperty("skip_warnings")
    private Boolean skipWarnings = false;



    /**
     * This is the getter method this will return the attribute value.
     * This flag is set to run the pre-checks without the subsequent upgrade operations.
     * Field introduced in 22.1.6, 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return prechecksOnly
     */
    public Boolean getPrechecksOnly() {
        return prechecksOnly;
    }

    /**
     * This is the setter method to the attribute.
     * This flag is set to run the pre-checks without the subsequent upgrade operations.
     * Field introduced in 22.1.6, 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param prechecksOnly set the prechecksOnly.
     */
    public void setPrechecksOnly(Boolean  prechecksOnly) {
        this.prechecksOnly = prechecksOnly;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This is flag when set as true skips few optional must checks.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return skipWarnings
     */
    public Boolean getSkipWarnings() {
        return skipWarnings;
    }

    /**
     * This is the setter method to the attribute.
     * This is flag when set as true skips few optional must checks.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param skipWarnings set the skipWarnings.
     */
    public void setSkipWarnings(Boolean  skipWarnings) {
        this.skipWarnings = skipWarnings;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RollbackPatchControllerParams objRollbackPatchControllerParams = (RollbackPatchControllerParams) o;
      return   Objects.equals(this.skipWarnings, objRollbackPatchControllerParams.skipWarnings)&&
  Objects.equals(this.prechecksOnly, objRollbackPatchControllerParams.prechecksOnly);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RollbackPatchControllerParams {\n");
                  sb.append("    prechecksOnly: ").append(toIndentedString(prechecksOnly)).append("\n");
                        sb.append("    skipWarnings: ").append(toIndentedString(skipWarnings)).append("\n");
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
