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
 * The MetricsDbQueueHealthyEventDetails is a POJO class extends AviRestResource that used for creating
 * MetricsDbQueueHealthyEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricsDbQueueHealthyEventDetails  {
    @JsonProperty("high")
    private Integer high;

    @JsonProperty("instanceport")
    private Integer instanceport;

    @JsonProperty("low")
    private Integer low;

    @JsonProperty("nodeid")
    private String nodeid;

    @JsonProperty("period")
    private String period;

    @JsonProperty("runtime")
    private MetricsDbRuntime runtime;

    @JsonProperty("watermark")
    private Integer watermark;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return high
     */
    public Integer getHigh() {
        return high;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param high set the high.
     */
    public void setHigh(Integer  high) {
        this.high = high;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return instanceport
     */
    public Integer getInstanceport() {
        return instanceport;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param instanceport set the instanceport.
     */
    public void setInstanceport(Integer  instanceport) {
        this.instanceport = instanceport;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return low
     */
    public Integer getLow() {
        return low;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param low set the low.
     */
    public void setLow(Integer  low) {
        this.low = low;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nodeid
     */
    public String getNodeid() {
        return nodeid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nodeid set the nodeid.
     */
    public void setNodeid(String  nodeid) {
        this.nodeid = nodeid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param period set the period.
     */
    public void setPeriod(String  period) {
        this.period = period;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return runtime
     */
    public MetricsDbRuntime getRuntime() {
        return runtime;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param runtime set the runtime.
     */
    public void setRuntime(MetricsDbRuntime runtime) {
        this.runtime = runtime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return watermark
     */
    public Integer getWatermark() {
        return watermark;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param watermark set the watermark.
     */
    public void setWatermark(Integer  watermark) {
        this.watermark = watermark;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MetricsDbQueueHealthyEventDetails objMetricsDbQueueHealthyEventDetails = (MetricsDbQueueHealthyEventDetails) o;
      return   Objects.equals(this.low, objMetricsDbQueueHealthyEventDetails.low)&&
  Objects.equals(this.high, objMetricsDbQueueHealthyEventDetails.high)&&
  Objects.equals(this.watermark, objMetricsDbQueueHealthyEventDetails.watermark)&&
  Objects.equals(this.nodeid, objMetricsDbQueueHealthyEventDetails.nodeid)&&
  Objects.equals(this.instanceport, objMetricsDbQueueHealthyEventDetails.instanceport)&&
  Objects.equals(this.period, objMetricsDbQueueHealthyEventDetails.period)&&
  Objects.equals(this.runtime, objMetricsDbQueueHealthyEventDetails.runtime);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricsDbQueueHealthyEventDetails {\n");
                  sb.append("    high: ").append(toIndentedString(high)).append("\n");
                        sb.append("    instanceport: ").append(toIndentedString(instanceport)).append("\n");
                        sb.append("    low: ").append(toIndentedString(low)).append("\n");
                        sb.append("    nodeid: ").append(toIndentedString(nodeid)).append("\n");
                        sb.append("    period: ").append(toIndentedString(period)).append("\n");
                        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
                        sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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
