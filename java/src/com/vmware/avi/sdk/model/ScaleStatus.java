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
 * The ScaleStatus is a POJO class extends AviRestResource that used for creating
 * ScaleStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScaleStatus  {
    @JsonProperty("action")
    private String action;

    @JsonProperty("action_success")
    private Boolean actionSuccess;

    @JsonProperty("end_time_str")
    private String endTimeStr;

    @JsonProperty("num_se_assigned")
    private Integer numSeAssigned;

    @JsonProperty("num_se_requested")
    private Integer numSeRequested;

    @JsonProperty("reason")
    private List<String> reason;

    @JsonProperty("reason_code")
    private Integer reasonCode;

    @JsonProperty("reason_code_string")
    private String reasonCodeString;

    @JsonProperty("scale_se")
    private String scaleSe;

    @JsonProperty("start_time_str")
    private String startTimeStr;

    @JsonProperty("state")
    private String state;

    @JsonProperty("vip_placement_resolution_info")
    private VipPlacementResolutionInfo vipPlacementResolutionInfo;



    /**
     * This is the getter method this will return the attribute value.
     * Enum options - OTHER, CREATE, READ, UPDATE, DELETE, SCALE_OUT, SCALE_IN, SE_REMOVED, SE_DISCONNECT, SE_RECONNECT, WARM_RESTART, COLD_RESTART,
     * UPDATE_LOGMGR_MAP, MIGRATE_SCALEOUT, MIGRATE_SCALEIN, INITIAL_PLACEMENT, ROTATE_KEYS, GLB_MGR_UPDATE, UPDATE_DNS_RECORDS, SCALEOUT_ADMINUP...
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - OTHER, CREATE, READ, UPDATE, DELETE, SCALE_OUT, SCALE_IN, SE_REMOVED, SE_DISCONNECT, SE_RECONNECT, WARM_RESTART, COLD_RESTART,
     * UPDATE_LOGMGR_MAP, MIGRATE_SCALEOUT, MIGRATE_SCALEIN, INITIAL_PLACEMENT, ROTATE_KEYS, GLB_MGR_UPDATE, UPDATE_DNS_RECORDS, SCALEOUT_ADMINUP...
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param action set the action.
     */
    public void setAction(String  action) {
        this.action = action;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return actionSuccess
     */
    public Boolean getActionSuccess() {
        return actionSuccess;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param actionSuccess set the actionSuccess.
     */
    public void setActionSuccess(Boolean  actionSuccess) {
        this.actionSuccess = actionSuccess;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTimeStr
     */
    public String getEndTimeStr() {
        return endTimeStr;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTimeStr set the endTimeStr.
     */
    public void setEndTimeStr(String  endTimeStr) {
        this.endTimeStr = endTimeStr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSeAssigned
     */
    public Integer getNumSeAssigned() {
        return numSeAssigned;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSeAssigned set the numSeAssigned.
     */
    public void setNumSeAssigned(Integer  numSeAssigned) {
        this.numSeAssigned = numSeAssigned;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSeRequested
     */
    public Integer getNumSeRequested() {
        return numSeRequested;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSeRequested set the numSeRequested.
     */
    public void setNumSeRequested(Integer  numSeRequested) {
        this.numSeRequested = numSeRequested;
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
    public ScaleStatus addReasonItem(String reasonItem) {
      if (this.reason == null) {
        this.reason = new ArrayList<String>();
      }
      this.reason.add(reasonItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reasonCode
     */
    public Integer getReasonCode() {
        return reasonCode;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reasonCode set the reasonCode.
     */
    public void setReasonCode(Integer  reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reasonCodeString
     */
    public String getReasonCodeString() {
        return reasonCodeString;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reasonCodeString set the reasonCodeString.
     */
    public void setReasonCodeString(String  reasonCodeString) {
        this.reasonCodeString = reasonCodeString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return scaleSe
     */
    public String getScaleSe() {
        return scaleSe;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param scaleSe set the scaleSe.
     */
    public void setScaleSe(String  scaleSe) {
        this.scaleSe = scaleSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTimeStr
     */
    public String getStartTimeStr() {
        return startTimeStr;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTimeStr set the startTimeStr.
     */
    public void setStartTimeStr(String  startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - SCALEOUT_PROCESSING, SCALEOUT_AWAITING_SE_ASSIGNMENT, SCALEOUT_AWAITING_ADMINUP, SCALEOUT_CREATING_SE,
     * SCALEOUT_ADMINUP_AWAITING_CLOUD_ATTACH, SCALEOUT_RESOURCES, SCALEOUT_AWAITING_CLOUD_ATTACH, SCALEOUT_AWAITING_SE_PROGRAMMING,
     * SCALEOUT_AWAITING_SE_READY, SCALEOUT_WAIT_FOR_SE_READY, SCALEOUT_SUCCESS, SCALEOUT_ERROR, SCALEOUT_ROLLBACK, SCALEOUT_ERROR_DISABLED,
     * SCALEIN_AWAITING_SE_READY, SCALEIN_AWAITING_SE_PRE_RELEASE, SCALEIN_AWAITING_PRIMARY_SWITCHOVER, SCALEIN_AWAITING_SE_PROGRAMMING,
     * SCALEIN_AWAITING_CLOUD_DETACH, SCALEIN_WAIT_FOR_SE_READY...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - SCALEOUT_PROCESSING, SCALEOUT_AWAITING_SE_ASSIGNMENT, SCALEOUT_AWAITING_ADMINUP, SCALEOUT_CREATING_SE,
     * SCALEOUT_ADMINUP_AWAITING_CLOUD_ATTACH, SCALEOUT_RESOURCES, SCALEOUT_AWAITING_CLOUD_ATTACH, SCALEOUT_AWAITING_SE_PROGRAMMING,
     * SCALEOUT_AWAITING_SE_READY, SCALEOUT_WAIT_FOR_SE_READY, SCALEOUT_SUCCESS, SCALEOUT_ERROR, SCALEOUT_ROLLBACK, SCALEOUT_ERROR_DISABLED,
     * SCALEIN_AWAITING_SE_READY, SCALEIN_AWAITING_SE_PRE_RELEASE, SCALEIN_AWAITING_PRIMARY_SWITCHOVER, SCALEIN_AWAITING_SE_PROGRAMMING,
     * SCALEIN_AWAITING_CLOUD_DETACH, SCALEIN_WAIT_FOR_SE_READY...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(String  state) {
        this.state = state;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipPlacementResolutionInfo
     */
    public VipPlacementResolutionInfo getVipPlacementResolutionInfo() {
        return vipPlacementResolutionInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipPlacementResolutionInfo set the vipPlacementResolutionInfo.
     */
    public void setVipPlacementResolutionInfo(VipPlacementResolutionInfo vipPlacementResolutionInfo) {
        this.vipPlacementResolutionInfo = vipPlacementResolutionInfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ScaleStatus objScaleStatus = (ScaleStatus) o;
      return   Objects.equals(this.state, objScaleStatus.state)&&
  Objects.equals(this.reason, objScaleStatus.reason)&&
  Objects.equals(this.reasonCode, objScaleStatus.reasonCode)&&
  Objects.equals(this.scaleSe, objScaleStatus.scaleSe)&&
  Objects.equals(this.numSeRequested, objScaleStatus.numSeRequested)&&
  Objects.equals(this.numSeAssigned, objScaleStatus.numSeAssigned)&&
  Objects.equals(this.reasonCodeString, objScaleStatus.reasonCodeString)&&
  Objects.equals(this.vipPlacementResolutionInfo, objScaleStatus.vipPlacementResolutionInfo)&&
  Objects.equals(this.startTimeStr, objScaleStatus.startTimeStr)&&
  Objects.equals(this.endTimeStr, objScaleStatus.endTimeStr)&&
  Objects.equals(this.action, objScaleStatus.action)&&
  Objects.equals(this.actionSuccess, objScaleStatus.actionSuccess);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ScaleStatus {\n");
                  sb.append("    action: ").append(toIndentedString(action)).append("\n");
                        sb.append("    actionSuccess: ").append(toIndentedString(actionSuccess)).append("\n");
                        sb.append("    endTimeStr: ").append(toIndentedString(endTimeStr)).append("\n");
                        sb.append("    numSeAssigned: ").append(toIndentedString(numSeAssigned)).append("\n");
                        sb.append("    numSeRequested: ").append(toIndentedString(numSeRequested)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
                        sb.append("    reasonCodeString: ").append(toIndentedString(reasonCodeString)).append("\n");
                        sb.append("    scaleSe: ").append(toIndentedString(scaleSe)).append("\n");
                        sb.append("    startTimeStr: ").append(toIndentedString(startTimeStr)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    vipPlacementResolutionInfo: ").append(toIndentedString(vipPlacementResolutionInfo)).append("\n");
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
