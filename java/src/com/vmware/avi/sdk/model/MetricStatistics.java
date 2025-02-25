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
 * The MetricStatistics is a POJO class extends AviRestResource that used for creating
 * MetricStatistics.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricStatistics  {
    @JsonProperty("last_sample")
    private Float lastSample;

    @JsonProperty("max")
    private Float max;

    @JsonProperty("max_ts")
    private String maxTs;

    @JsonProperty("mean")
    private Float mean;

    @JsonProperty("min")
    private Float min;

    @JsonProperty("min_ts")
    private String minTs;

    @JsonProperty("num_samples")
    private Integer numSamples;

    @JsonProperty("sum")
    private Float sum;

    @JsonProperty("trend")
    private Float trend;



    /**
     * This is the getter method this will return the attribute value.
     * Value of the last sample.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastSample
     */
    public Float getLastSample() {
        return lastSample;
    }

    /**
     * This is the setter method to the attribute.
     * Value of the last sample.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastSample set the lastSample.
     */
    public void setLastSample(Float  lastSample) {
        this.lastSample = lastSample;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum value in time series requested.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return max
     */
    public Float getMax() {
        return max;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum value in time series requested.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param max set the max.
     */
    public void setMax(Float  max) {
        this.max = max;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timestamp of the minimum value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxTs
     */
    public String getMaxTs() {
        return maxTs;
    }

    /**
     * This is the setter method to the attribute.
     * Timestamp of the minimum value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxTs set the maxTs.
     */
    public void setMaxTs(String  maxTs) {
        this.maxTs = maxTs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Arithmetic mean.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mean
     */
    public Float getMean() {
        return mean;
    }

    /**
     * This is the setter method to the attribute.
     * Arithmetic mean.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mean set the mean.
     */
    public void setMean(Float  mean) {
        this.mean = mean;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum value in time series requested.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return min
     */
    public Float getMin() {
        return min;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum value in time series requested.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param min set the min.
     */
    public void setMin(Float  min) {
        this.min = min;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timestamp of the minimum value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minTs
     */
    public String getMinTs() {
        return minTs;
    }

    /**
     * This is the setter method to the attribute.
     * Timestamp of the minimum value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minTs set the minTs.
     */
    public void setMinTs(String  minTs) {
        this.minTs = minTs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of actual data samples.
     * It excludes fake data.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSamples
     */
    public Integer getNumSamples() {
        return numSamples;
    }

    /**
     * This is the setter method to the attribute.
     * Number of actual data samples.
     * It excludes fake data.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSamples set the numSamples.
     */
    public void setNumSamples(Integer  numSamples) {
        this.numSamples = numSamples;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Summation of all values.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sum
     */
    public Float getSum() {
        return sum;
    }

    /**
     * This is the setter method to the attribute.
     * Summation of all values.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sum set the sum.
     */
    public void setSum(Float  sum) {
        this.sum = sum;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Slope of the data points across the time series requested.
     * Trend = (last_value - avg)/avg.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return trend
     */
    public Float getTrend() {
        return trend;
    }

    /**
     * This is the setter method to the attribute.
     * Slope of the data points across the time series requested.
     * Trend = (last_value - avg)/avg.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param trend set the trend.
     */
    public void setTrend(Float  trend) {
        this.trend = trend;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MetricStatistics objMetricStatistics = (MetricStatistics) o;
      return   Objects.equals(this.mean, objMetricStatistics.mean)&&
  Objects.equals(this.min, objMetricStatistics.min)&&
  Objects.equals(this.minTs, objMetricStatistics.minTs)&&
  Objects.equals(this.max, objMetricStatistics.max)&&
  Objects.equals(this.maxTs, objMetricStatistics.maxTs)&&
  Objects.equals(this.trend, objMetricStatistics.trend)&&
  Objects.equals(this.numSamples, objMetricStatistics.numSamples)&&
  Objects.equals(this.lastSample, objMetricStatistics.lastSample)&&
  Objects.equals(this.sum, objMetricStatistics.sum);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricStatistics {\n");
                  sb.append("    lastSample: ").append(toIndentedString(lastSample)).append("\n");
                        sb.append("    max: ").append(toIndentedString(max)).append("\n");
                        sb.append("    maxTs: ").append(toIndentedString(maxTs)).append("\n");
                        sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
                        sb.append("    min: ").append(toIndentedString(min)).append("\n");
                        sb.append("    minTs: ").append(toIndentedString(minTs)).append("\n");
                        sb.append("    numSamples: ").append(toIndentedString(numSamples)).append("\n");
                        sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
                        sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
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
