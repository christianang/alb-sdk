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
 * The MetricLog is a POJO class extends AviRestResource that used for creating
 * MetricLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricLog  {
    @JsonProperty("end_timestamp")
    private Float endTimestamp;

    @JsonProperty("metric_id")
    private String metricId;

    @JsonProperty("report_timestamp")
    private Float reportTimestamp;

    @JsonProperty("step")
    private Integer step;

    @JsonProperty("time_series")
    private MetricsQueryResponse timeSeries;

    @JsonProperty("value")
    private Float value;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTimestamp
     */
    public Float getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTimestamp set the endTimestamp.
     */
    public void setEndTimestamp(Float  endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricId
     */
    public String getMetricId() {
        return metricId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricId set the metricId.
     */
    public void setMetricId(String  metricId) {
        this.metricId = metricId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reportTimestamp
     */
    public Float getReportTimestamp() {
        return reportTimestamp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reportTimestamp set the reportTimestamp.
     */
    public void setReportTimestamp(Float  reportTimestamp) {
        this.reportTimestamp = reportTimestamp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param step set the step.
     */
    public void setStep(Integer  step) {
        this.step = step;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timeSeries
     */
    public MetricsQueryResponse getTimeSeries() {
        return timeSeries;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param timeSeries set the timeSeries.
     */
    public void setTimeSeries(MetricsQueryResponse timeSeries) {
        this.timeSeries = timeSeries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return value
     */
    public Float getValue() {
        return value;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param value set the value.
     */
    public void setValue(Float  value) {
        this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MetricLog objMetricLog = (MetricLog) o;
      return   Objects.equals(this.metricId, objMetricLog.metricId)&&
  Objects.equals(this.value, objMetricLog.value)&&
  Objects.equals(this.reportTimestamp, objMetricLog.reportTimestamp)&&
  Objects.equals(this.endTimestamp, objMetricLog.endTimestamp)&&
  Objects.equals(this.step, objMetricLog.step)&&
  Objects.equals(this.timeSeries, objMetricLog.timeSeries);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricLog {\n");
                  sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
                        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
                        sb.append("    reportTimestamp: ").append(toIndentedString(reportTimestamp)).append("\n");
                        sb.append("    step: ").append(toIndentedString(step)).append("\n");
                        sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
                        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
