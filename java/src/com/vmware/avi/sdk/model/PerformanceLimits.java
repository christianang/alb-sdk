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
 * The PerformanceLimits is a POJO class extends AviRestResource that used for creating
 * PerformanceLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PerformanceLimits  {
    @JsonProperty("max_concurrent_connections")
    private Integer maxConcurrentConnections;

    @JsonProperty("max_throughput")
    private Integer maxThroughput;



    /**
     * This is the getter method this will return the attribute value.
     * The maximum number of concurrent client conections allowed to the virtual service.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxConcurrentConnections
     */
    public Integer getMaxConcurrentConnections() {
        return maxConcurrentConnections;
    }

    /**
     * This is the setter method to the attribute.
     * The maximum number of concurrent client conections allowed to the virtual service.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxConcurrentConnections set the maxConcurrentConnections.
     */
    public void setMaxConcurrentConnections(Integer  maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The maximum throughput per second for all clients allowed through the client side of the virtual service per se.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxThroughput
     */
    public Integer getMaxThroughput() {
        return maxThroughput;
    }

    /**
     * This is the setter method to the attribute.
     * The maximum throughput per second for all clients allowed through the client side of the virtual service per se.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxThroughput set the maxThroughput.
     */
    public void setMaxThroughput(Integer  maxThroughput) {
        this.maxThroughput = maxThroughput;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PerformanceLimits objPerformanceLimits = (PerformanceLimits) o;
      return   Objects.equals(this.maxConcurrentConnections, objPerformanceLimits.maxConcurrentConnections)&&
  Objects.equals(this.maxThroughput, objPerformanceLimits.maxThroughput);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PerformanceLimits {\n");
                  sb.append("    maxConcurrentConnections: ").append(toIndentedString(maxConcurrentConnections)).append("\n");
                        sb.append("    maxThroughput: ").append(toIndentedString(maxThroughput)).append("\n");
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
