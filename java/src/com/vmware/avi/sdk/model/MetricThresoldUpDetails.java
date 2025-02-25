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
 * The MetricThresoldUpDetails is a POJO class extends AviRestResource that used for creating
 * MetricThresoldUpDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricThresoldUpDetails  {
    @JsonProperty("current_value")
    private Float currentValue;

    @JsonProperty("entity_uuid")
    private String entityUuid;

    @JsonProperty("metric_id")
    private String metricId;

    @JsonProperty("metric_name")
    private String metricName;

    @JsonProperty("pool_uuid")
    private String poolUuid;

    @JsonProperty("server")
    private String server;

    @JsonProperty("threshold")
    private Float threshold;

    @JsonProperty("vm_type")
    private String vmType;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return currentValue
     */
    public Float getCurrentValue() {
        return currentValue;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param currentValue set the currentValue.
     */
    public void setCurrentValue(Float  currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Id of the object whose metric has hit the threshold.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return entityUuid
     */
    public String getEntityUuid() {
        return entityUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Id of the object whose metric has hit the threshold.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param entityUuid set the entityUuid.
     */
    public void setEntityUuid(String  entityUuid) {
        this.entityUuid = entityUuid;
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
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricName set the metricName.
     */
    public void setMetricName(String  metricName) {
        this.metricName = metricName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Identity of the pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolUuid
     */
    public String getPoolUuid() {
        return poolUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Identity of the pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolUuid set the poolUuid.
     */
    public void setPoolUuid(String  poolUuid) {
        this.poolUuid = poolUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Server ip port on which event was generated.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return server
     */
    public String getServer() {
        return server;
    }

    /**
     * This is the setter method to the attribute.
     * Server ip port on which event was generated.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param server set the server.
     */
    public void setServer(String  server) {
        this.server = server;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return threshold
     */
    public Float getThreshold() {
        return threshold;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param threshold set the threshold.
     */
    public void setThreshold(Float  threshold) {
        this.threshold = threshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vm at which metric thresold details collected.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmType
     */
    public String getVmType() {
        return vmType;
    }

    /**
     * This is the setter method to the attribute.
     * Vm at which metric thresold details collected.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vmType set the vmType.
     */
    public void setVmType(String  vmType) {
        this.vmType = vmType;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MetricThresoldUpDetails objMetricThresoldUpDetails = (MetricThresoldUpDetails) o;
      return   Objects.equals(this.metricName, objMetricThresoldUpDetails.metricName)&&
  Objects.equals(this.metricId, objMetricThresoldUpDetails.metricId)&&
  Objects.equals(this.currentValue, objMetricThresoldUpDetails.currentValue)&&
  Objects.equals(this.threshold, objMetricThresoldUpDetails.threshold)&&
  Objects.equals(this.server, objMetricThresoldUpDetails.server)&&
  Objects.equals(this.poolUuid, objMetricThresoldUpDetails.poolUuid)&&
  Objects.equals(this.entityUuid, objMetricThresoldUpDetails.entityUuid)&&
  Objects.equals(this.vmType, objMetricThresoldUpDetails.vmType);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricThresoldUpDetails {\n");
                  sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
                        sb.append("    entityUuid: ").append(toIndentedString(entityUuid)).append("\n");
                        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
                        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
                        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
                        sb.append("    server: ").append(toIndentedString(server)).append("\n");
                        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
                        sb.append("    vmType: ").append(toIndentedString(vmType)).append("\n");
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
