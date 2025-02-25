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
 * The PoolGroupMember is a POJO class extends AviRestResource that used for creating
 * PoolGroupMember.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PoolGroupMember  {
    @JsonProperty("deployment_state")
    private String deploymentState;

    @JsonProperty("pool_ref")
    private String poolRef;

    @JsonProperty("priority_label")
    private String priorityLabel;

    @JsonProperty("ratio")
    private Integer ratio = 1;



    /**
     * This is the getter method this will return the attribute value.
     * Pool deployment state used with the pg deployment policy.
     * Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return deploymentState
     */
    public String getDeploymentState() {
        return deploymentState;
    }

    /**
     * This is the setter method to the attribute.
     * Pool deployment state used with the pg deployment policy.
     * Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param deploymentState set the deploymentState.
     */
    public void setDeploymentState(String  deploymentState) {
        this.deploymentState = deploymentState;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the pool.
     * It is a reference to an object of type pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolRef
     */
    public String getPoolRef() {
        return poolRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the pool.
     * It is a reference to an object of type pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolRef set the poolRef.
     */
    public void setPoolRef(String  poolRef) {
        this.poolRef = poolRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * All pools with same priority are treated similarly in a pool group.
     * The higher the number, the higher the priority.a pool with a higher priority is selected, as long as the pool is eligible or an explicit policy
     * chooses a different pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return priorityLabel
     */
    public String getPriorityLabel() {
        return priorityLabel;
    }

    /**
     * This is the setter method to the attribute.
     * All pools with same priority are treated similarly in a pool group.
     * The higher the number, the higher the priority.a pool with a higher priority is selected, as long as the pool is eligible or an explicit policy
     * chooses a different pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param priorityLabel set the priorityLabel.
     */
    public void setPriorityLabel(String  priorityLabel) {
        this.priorityLabel = priorityLabel;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ratio of selecting eligible pools in the pool group.
     * Allowed values are 1-1000.
     * Special values are 0 - do not select this pool for new connections.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1), basic edition(allowed values- 1), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return ratio
     */
    public Integer getRatio() {
        return ratio;
    }

    /**
     * This is the setter method to the attribute.
     * Ratio of selecting eligible pools in the pool group.
     * Allowed values are 1-1000.
     * Special values are 0 - do not select this pool for new connections.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1), basic edition(allowed values- 1), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param ratio set the ratio.
     */
    public void setRatio(Integer  ratio) {
        this.ratio = ratio;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PoolGroupMember objPoolGroupMember = (PoolGroupMember) o;
      return   Objects.equals(this.poolRef, objPoolGroupMember.poolRef)&&
  Objects.equals(this.ratio, objPoolGroupMember.ratio)&&
  Objects.equals(this.priorityLabel, objPoolGroupMember.priorityLabel)&&
  Objects.equals(this.deploymentState, objPoolGroupMember.deploymentState);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PoolGroupMember {\n");
                  sb.append("    deploymentState: ").append(toIndentedString(deploymentState)).append("\n");
                        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
                        sb.append("    priorityLabel: ").append(toIndentedString(priorityLabel)).append("\n");
                        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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
