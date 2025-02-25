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
 * The SeUpgradeEvents is a POJO class extends AviRestResource that used for creating
 * SeUpgradeEvents.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeUpgradeEvents  {
    @JsonProperty("from_se_ref")
    private String fromSeRef;

    @JsonProperty("num_se")
    private Integer numSe;

    @JsonProperty("num_se_group")
    private Integer numSeGroup;

    @JsonProperty("num_vs")
    private Integer numVs;

    @JsonProperty("reason")
    private List<String> reason;

    @JsonProperty("se_group_ha_mode")
    private String seGroupHaMode;

    @JsonProperty("se_group_ref")
    private String seGroupRef;

    @JsonProperty("se_ref")
    private String seRef;

    @JsonProperty("sub_tasks")
    private List<String> subTasks;

    @JsonProperty("task")
    private String task;

    @JsonProperty("to_se_ref")
    private String toSeRef;

    @JsonProperty("traffic_status")
    private String trafficStatus;

    @JsonProperty("vs_ref")
    private String vsRef;



    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fromSeRef
     */
    public String getFromSeRef() {
        return fromSeRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fromSeRef set the fromSeRef.
     */
    public void setFromSeRef(String  fromSeRef) {
        this.fromSeRef = fromSeRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSe
     */
    public Integer getNumSe() {
        return numSe;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSe set the numSe.
     */
    public void setNumSe(Integer  numSe) {
        this.numSe = numSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSeGroup
     */
    public Integer getNumSeGroup() {
        return numSeGroup;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSeGroup set the numSeGroup.
     */
    public void setNumSeGroup(Integer  numSeGroup) {
        this.numSeGroup = numSeGroup;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVs
     */
    public Integer getNumVs() {
        return numVs;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVs set the numVs.
     */
    public void setNumVs(Integer  numVs) {
        this.numVs = numVs;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public List<String> getReason() {
        return reason;
    }

    /**
     * This is the setter method. this will set the reason
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public void setReason(List<String>  reason) {
        this.reason = reason;
    }

    /**
     * This is the setter method this will set the reason
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public SeUpgradeEvents addReasonItem(String reasonItem) {
      if (this.reason == null) {
        this.reason = new ArrayList<String>();
      }
      this.reason.add(reasonItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupHaMode
     */
    public String getSeGroupHaMode() {
        return seGroupHaMode;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroupHaMode set the seGroupHaMode.
     */
    public void setSeGroupHaMode(String  seGroupHaMode) {
        this.seGroupHaMode = seGroupHaMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceenginegroup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupRef
     */
    public String getSeGroupRef() {
        return seGroupRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type serviceenginegroup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroupRef set the seGroupRef.
     */
    public void setSeGroupRef(String  seGroupRef) {
        this.seGroupRef = seGroupRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRef
     */
    public String getSeRef() {
        return seRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRef set the seRef.
     */
    public void setSeRef(String  seRef) {
        this.seRef = seRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of sub_tasks executed.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subTasks
     */
    public List<String> getSubTasks() {
        return subTasks;
    }

    /**
     * This is the setter method. this will set the subTasks
     * List of sub_tasks executed.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subTasks
     */
    public void setSubTasks(List<String>  subTasks) {
        this.subTasks = subTasks;
    }

    /**
     * This is the setter method this will set the subTasks
     * List of sub_tasks executed.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subTasks
     */
    public SeUpgradeEvents addSubTasksItem(String subTasksItem) {
      if (this.subTasks == null) {
        this.subTasks = new ArrayList<String>();
      }
      this.subTasks.add(subTasksItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - SE_UPGRADE_PREVIEW, SE_UPGRADE_IN_PROGRESS, SE_UPGRADE_COMPLETE, SE_UPGRADE_ERROR, SE_UPGRADE_PRE_CHECKS, SE_IMAGE_INSTALL,
     * SE_UPGRADE_IMAGE_NOT_FOUND, SE_ALREADY_UPGRADED, SE_REBOOT, SE_CONNECT_AFTER_REBOOT, SE_PRE_UPGRADE_TASKS, SE_POST_UPGRADE_TASKS,
     * SE_WAIT_FOR_SWITCHOVER, SE_CHECK_SCALEDOUT_VS_EXISTS, SE_UPGRADE_SEMGR_REQUEST, SE_UPGRADE_SEMGR_SE_UNREACHABLE, SE_PRE_UPGRADE_SCALE_IN_OPS,
     * SE_POST_UPGRADE_SCALE_OUT_OPS, SE_UPGRADE_SUSPENDED, SE_UPGRADE_START...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return task
     */
    public String getTask() {
        return task;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - SE_UPGRADE_PREVIEW, SE_UPGRADE_IN_PROGRESS, SE_UPGRADE_COMPLETE, SE_UPGRADE_ERROR, SE_UPGRADE_PRE_CHECKS, SE_IMAGE_INSTALL,
     * SE_UPGRADE_IMAGE_NOT_FOUND, SE_ALREADY_UPGRADED, SE_REBOOT, SE_CONNECT_AFTER_REBOOT, SE_PRE_UPGRADE_TASKS, SE_POST_UPGRADE_TASKS,
     * SE_WAIT_FOR_SWITCHOVER, SE_CHECK_SCALEDOUT_VS_EXISTS, SE_UPGRADE_SEMGR_REQUEST, SE_UPGRADE_SEMGR_SE_UNREACHABLE, SE_PRE_UPGRADE_SCALE_IN_OPS,
     * SE_POST_UPGRADE_SCALE_OUT_OPS, SE_UPGRADE_SUSPENDED, SE_UPGRADE_START...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param task set the task.
     */
    public void setTask(String  task) {
        this.task = task;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return toSeRef
     */
    public String getToSeRef() {
        return toSeRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param toSeRef set the toSeRef.
     */
    public void setToSeRef(String  toSeRef) {
        this.toSeRef = toSeRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - TRAFFIC_DISRUPTED, TRAFFIC_NOT_DISRUPTED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return trafficStatus
     */
    public String getTrafficStatus() {
        return trafficStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - TRAFFIC_DISRUPTED, TRAFFIC_NOT_DISRUPTED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param trafficStatus set the trafficStatus.
     */
    public void setTrafficStatus(String  trafficStatus) {
        this.trafficStatus = trafficStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsRef
     */
    public String getVsRef() {
        return vsRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsRef set the vsRef.
     */
    public void setVsRef(String  vsRef) {
        this.vsRef = vsRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeUpgradeEvents objSeUpgradeEvents = (SeUpgradeEvents) o;
      return   Objects.equals(this.task, objSeUpgradeEvents.task)&&
  Objects.equals(this.vsRef, objSeUpgradeEvents.vsRef)&&
  Objects.equals(this.seGroupRef, objSeUpgradeEvents.seGroupRef)&&
  Objects.equals(this.seGroupHaMode, objSeUpgradeEvents.seGroupHaMode)&&
  Objects.equals(this.seRef, objSeUpgradeEvents.seRef)&&
  Objects.equals(this.fromSeRef, objSeUpgradeEvents.fromSeRef)&&
  Objects.equals(this.toSeRef, objSeUpgradeEvents.toSeRef)&&
  Objects.equals(this.numSeGroup, objSeUpgradeEvents.numSeGroup)&&
  Objects.equals(this.numSe, objSeUpgradeEvents.numSe)&&
  Objects.equals(this.numVs, objSeUpgradeEvents.numVs)&&
  Objects.equals(this.trafficStatus, objSeUpgradeEvents.trafficStatus)&&
  Objects.equals(this.reason, objSeUpgradeEvents.reason)&&
  Objects.equals(this.subTasks, objSeUpgradeEvents.subTasks);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeUpgradeEvents {\n");
                  sb.append("    fromSeRef: ").append(toIndentedString(fromSeRef)).append("\n");
                        sb.append("    numSe: ").append(toIndentedString(numSe)).append("\n");
                        sb.append("    numSeGroup: ").append(toIndentedString(numSeGroup)).append("\n");
                        sb.append("    numVs: ").append(toIndentedString(numVs)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    seGroupHaMode: ").append(toIndentedString(seGroupHaMode)).append("\n");
                        sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
                        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
                        sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
                        sb.append("    task: ").append(toIndentedString(task)).append("\n");
                        sb.append("    toSeRef: ").append(toIndentedString(toSeRef)).append("\n");
                        sb.append("    trafficStatus: ").append(toIndentedString(trafficStatus)).append("\n");
                        sb.append("    vsRef: ").append(toIndentedString(vsRef)).append("\n");
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
