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
 * The VinfraVcenterNetworkLimit is a POJO class extends AviRestResource that used for creating
 * VinfraVcenterNetworkLimit.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VinfraVcenterNetworkLimit  {
    @JsonProperty("additional_reason")
    private String additionalReason;

    @JsonProperty("current")
    private Integer current;

    @JsonProperty("limit")
    private Integer limit;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return additionalReason
     */
    public String getAdditionalReason() {
        return additionalReason;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param additionalReason set the additionalReason.
     */
    public void setAdditionalReason(String  additionalReason) {
        this.additionalReason = additionalReason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return current
     */
    public Integer getCurrent() {
        return current;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param current set the current.
     */
    public void setCurrent(Integer  current) {
        this.current = current;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param limit set the limit.
     */
    public void setLimit(Integer  limit) {
        this.limit = limit;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VinfraVcenterNetworkLimit objVinfraVcenterNetworkLimit = (VinfraVcenterNetworkLimit) o;
      return   Objects.equals(this.current, objVinfraVcenterNetworkLimit.current)&&
  Objects.equals(this.limit, objVinfraVcenterNetworkLimit.limit)&&
  Objects.equals(this.additionalReason, objVinfraVcenterNetworkLimit.additionalReason);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VinfraVcenterNetworkLimit {\n");
                  sb.append("    additionalReason: ").append(toIndentedString(additionalReason)).append("\n");
                        sb.append("    current: ").append(toIndentedString(current)).append("\n");
                        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
