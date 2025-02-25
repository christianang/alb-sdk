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
 * The AnomalyEventDetails is a POJO class extends AviRestResource that used for creating
 * AnomalyEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnomalyEventDetails  {
    @JsonProperty("deviation")
    private Float deviation = 0.0f;

    @JsonProperty("metric_id")
    private String metricId;

    @JsonProperty("metric_timestamp")
    private String metricTimestamp;

    @JsonProperty("model")
    private String model = "EXPONENTIAL_WEIGHTED_MOVING_AVG";

    @JsonProperty("models")
    private List<String> models;

    @JsonProperty("node_id")
    private String nodeId;

    @JsonProperty("obj_type")
    private String objType;

    @JsonProperty("pool_name")
    private String poolName;

    @JsonProperty("pool_uuid")
    private String poolUuid;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("server")
    private String server;

    @JsonProperty("value")
    private Float value;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
     * @return deviation
     */
    public Float getDeviation() {
        return deviation;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
     * @param deviation set the deviation.
     */
    public void setDeviation(Float  deviation) {
        this.deviation = deviation;
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
     * @return metricTimestamp
     */
    public String getMetricTimestamp() {
        return metricTimestamp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricTimestamp set the metricTimestamp.
     */
    public void setMetricTimestamp(String  metricTimestamp) {
        this.metricTimestamp = metricTimestamp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated.
     * Enum options - EXPONENTIAL_MOVING_AVG, EXPONENTIAL_WEIGHTED_MOVING_AVG, HOLTWINTERS_AT_AS, HOLTWINTERS_AT_MS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "EXPONENTIAL_WEIGHTED_MOVING_AVG".
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated.
     * Enum options - EXPONENTIAL_MOVING_AVG, EXPONENTIAL_WEIGHTED_MOVING_AVG, HOLTWINTERS_AT_AS, HOLTWINTERS_AT_MS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "EXPONENTIAL_WEIGHTED_MOVING_AVG".
     * @param model set the model.
     */
    public void setModel(String  model) {
        this.model = model;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Enum options - EXPONENTIAL_MOVING_AVG, EXPONENTIAL_WEIGHTED_MOVING_AVG, HOLTWINTERS_AT_AS, HOLTWINTERS_AT_MS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return models
     */
    public List<String> getModels() {
        return models;
    }

    /**
     * This is the setter method. this will set the models
     * Enum options - EXPONENTIAL_MOVING_AVG, EXPONENTIAL_WEIGHTED_MOVING_AVG, HOLTWINTERS_AT_AS, HOLTWINTERS_AT_MS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return models
     */
    public void setModels(List<String>  models) {
        this.models = models;
    }

    /**
     * This is the setter method this will set the models
     * Enum options - EXPONENTIAL_MOVING_AVG, EXPONENTIAL_WEIGHTED_MOVING_AVG, HOLTWINTERS_AT_AS, HOLTWINTERS_AT_MS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return models
     */
    public AnomalyEventDetails addModelsItem(String modelsItem) {
      if (this.models == null) {
        this.models = new ArrayList<String>();
      }
      this.models.add(modelsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nodeId set the nodeId.
     */
    public void setNodeId(String  nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - METRICS_OBJ_TYPE_UNKNOWN, VSERVER_L4_SERVER, VSERVER_L4_CLIENT, VSERVER_L7_SERVER, VSERVER_L7_CLIENT, VM_METRICS_OBJ,
     * SE_METRICS_OBJ, VSERVER_RUM, CONTROLLER_METRICS_OBJ, METRICS_COLLECTION, METRICS_RUM_PREAGG_BROWSER_OBJ, METRICS_RUM_PREAGG_COUNTRY_OBJ,
     * METRICS_RUM_PREAGG_DEVTYPE_OBJ, METRICS_RUM_PREAGG_LANG_OBJ, METRICS_RUM_PREAGG_OS_OBJ, METRICS_RUM_PREAGG_URL_OBJ, METRICS_ANOMALY_OBJ,
     * METRICS_HEALTHSCORE_OBJ, METRICS_RESOURCE_TIMING_BROWSER_OBJ, METRICS_RESOURCE_TIMING_OS_OBJ...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objType
     */
    public String getObjType() {
        return objType;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - METRICS_OBJ_TYPE_UNKNOWN, VSERVER_L4_SERVER, VSERVER_L4_CLIENT, VSERVER_L7_SERVER, VSERVER_L7_CLIENT, VM_METRICS_OBJ,
     * SE_METRICS_OBJ, VSERVER_RUM, CONTROLLER_METRICS_OBJ, METRICS_COLLECTION, METRICS_RUM_PREAGG_BROWSER_OBJ, METRICS_RUM_PREAGG_COUNTRY_OBJ,
     * METRICS_RUM_PREAGG_DEVTYPE_OBJ, METRICS_RUM_PREAGG_LANG_OBJ, METRICS_RUM_PREAGG_OS_OBJ, METRICS_RUM_PREAGG_URL_OBJ, METRICS_ANOMALY_OBJ,
     * METRICS_HEALTHSCORE_OBJ, METRICS_RESOURCE_TIMING_BROWSER_OBJ, METRICS_RESOURCE_TIMING_OS_OBJ...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objType set the objType.
     */
    public void setObjType(String  objType) {
        this.objType = objType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolName set the poolName.
     */
    public void setPoolName(String  poolName) {
        this.poolName = poolName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolUuid
     */
    public String getPoolUuid() {
        return poolUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolUuid set the poolUuid.
     */
    public void setPoolUuid(String  poolUuid) {
        this.poolUuid = poolUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - ANZ_PRIORITY_HIGH, ANZ_PRIORITY_MEDIUM, ANZ_PRIORITY_LOW.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - ANZ_PRIORITY_HIGH, ANZ_PRIORITY_MEDIUM, ANZ_PRIORITY_LOW.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param priority set the priority.
     */
    public void setPriority(String  priority) {
        this.priority = priority;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return server
     */
    public String getServer() {
        return server;
    }

    /**
     * This is the setter method to the attribute.
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
      AnomalyEventDetails objAnomalyEventDetails = (AnomalyEventDetails) o;
      return   Objects.equals(this.deviation, objAnomalyEventDetails.deviation)&&
  Objects.equals(this.value, objAnomalyEventDetails.value)&&
  Objects.equals(this.metricTimestamp, objAnomalyEventDetails.metricTimestamp)&&
  Objects.equals(this.model, objAnomalyEventDetails.model)&&
  Objects.equals(this.metricId, objAnomalyEventDetails.metricId)&&
  Objects.equals(this.priority, objAnomalyEventDetails.priority)&&
  Objects.equals(this.nodeId, objAnomalyEventDetails.nodeId)&&
  Objects.equals(this.objType, objAnomalyEventDetails.objType)&&
  Objects.equals(this.server, objAnomalyEventDetails.server)&&
  Objects.equals(this.poolUuid, objAnomalyEventDetails.poolUuid)&&
  Objects.equals(this.poolName, objAnomalyEventDetails.poolName)&&
  Objects.equals(this.models, objAnomalyEventDetails.models);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AnomalyEventDetails {\n");
                  sb.append("    deviation: ").append(toIndentedString(deviation)).append("\n");
                        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
                        sb.append("    metricTimestamp: ").append(toIndentedString(metricTimestamp)).append("\n");
                        sb.append("    model: ").append(toIndentedString(model)).append("\n");
                        sb.append("    models: ").append(toIndentedString(models)).append("\n");
                        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
                        sb.append("    objType: ").append(toIndentedString(objType)).append("\n");
                        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
                        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
                        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
                        sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
