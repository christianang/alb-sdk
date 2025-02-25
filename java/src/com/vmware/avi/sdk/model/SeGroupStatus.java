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
 * The SeGroupStatus is a POJO class extends AviRestResource that used for creating
 * SeGroupStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeGroupStatus  {
    @JsonProperty("controller_version")
    private String controllerVersion;

    @JsonProperty("disrupted_vs_ref")
    private List<String> disruptedVsRef;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("enqueue_time")
    private String enqueueTime;

    @JsonProperty("ha_mode")
    private String haMode;

    @JsonProperty("in_progress")
    private Boolean inProgress;

    @JsonProperty("notes")
    private List<String> notes;

    @JsonProperty("num_se")
    private Integer numSe;

    @JsonProperty("num_se_with_no_vs")
    private Integer numSeWithNoVs;

    @JsonProperty("num_se_with_vs_not_scaledout")
    private Integer numSeWithVsNotScaledout;

    @JsonProperty("num_se_with_vs_scaledout")
    private Integer numSeWithVsScaledout;

    @JsonProperty("num_vs")
    private Integer numVs;

    @JsonProperty("num_vs_disrupted")
    private Integer numVsDisrupted;

    @JsonProperty("progress")
    private Integer progress;

    @JsonProperty("reason")
    private List<String> reason;

    @JsonProperty("request_time")
    private String requestTime;

    @JsonProperty("se_already_upgraded_at_start")
    private List<String> seAlreadyUpgradedAtStart;

    @JsonProperty("se_disconnected_at_start")
    private List<String> seDisconnectedAtStart;

    @JsonProperty("se_group_name")
    private String seGroupName;

    @JsonProperty("se_group_uuid")
    private String seGroupUuid;

    @JsonProperty("se_ip_missing_at_start")
    private List<String> seIpMissingAtStart;

    @JsonProperty("se_poweredoff_at_start")
    private List<String> sePoweredoffAtStart;

    @JsonProperty("se_reboot_in_progress_ref")
    private String seRebootInProgressRef;

    @JsonProperty("se_upgrade_completed")
    private List<String> seUpgradeCompleted;

    @JsonProperty("se_upgrade_errors")
    private List<SeUpgradeEvents> seUpgradeErrors;

    @JsonProperty("se_upgrade_failed")
    private List<String> seUpgradeFailed;

    @JsonProperty("se_upgrade_in_progress")
    private List<String> seUpgradeInProgress;

    @JsonProperty("se_upgrade_not_started")
    private List<String> seUpgradeNotStarted;

    @JsonProperty("se_upgrade_skip_suspended")
    private List<String> seUpgradeSkipSuspended;

    @JsonProperty("se_upgrade_suspended")
    private List<String> seUpgradeSuspended;

    @JsonProperty("se_with_no_vs")
    private List<String> seWithNoVs;

    @JsonProperty("se_with_vs_not_scaledout")
    private List<String> seWithVsNotScaledout;

    @JsonProperty("se_with_vs_scaledout")
    private List<String> seWithVsScaledout;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("state")
    private String state;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("thread")
    private String thread;

    @JsonProperty("traffic_status")
    private String trafficStatus;

    @JsonProperty("vs_errors")
    private List<VsError> vsErrors;

    @JsonProperty("vs_migrate_in_progress_ref")
    private List<String> vsMigrateInProgressRef;

    @JsonProperty("vs_scalein_in_progress_ref")
    private List<String> vsScaleinInProgressRef;

    @JsonProperty("vs_scaleout_in_progress_ref")
    private List<String> vsScaleoutInProgressRef;

    @JsonProperty("worker")
    private String worker;



    /**
     * This is the getter method this will return the attribute value.
     * Controller version.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerVersion
     */
    public String getControllerVersion() {
        return controllerVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Controller version.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerVersion set the controllerVersion.
     */
    public void setControllerVersion(String  controllerVersion) {
        this.controllerVersion = controllerVersion;
    }
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return disruptedVsRef
     */
    public List<String> getDisruptedVsRef() {
        return disruptedVsRef;
    }

    /**
     * This is the setter method. this will set the disruptedVsRef
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return disruptedVsRef
     */
    public void setDisruptedVsRef(List<String>  disruptedVsRef) {
        this.disruptedVsRef = disruptedVsRef;
    }

    /**
     * This is the setter method this will set the disruptedVsRef
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return disruptedVsRef
     */
    public SeGroupStatus addDisruptedVsRefItem(String disruptedVsRefItem) {
      if (this.disruptedVsRef == null) {
        this.disruptedVsRef = new ArrayList<String>();
      }
      this.disruptedVsRef.add(disruptedVsRefItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param duration set the duration.
     */
    public void setDuration(String  duration) {
        this.duration = duration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endTime set the endTime.
     */
    public void setEndTime(String  endTime) {
        this.endTime = endTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enqueueTime
     */
    public String getEnqueueTime() {
        return enqueueTime;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enqueueTime set the enqueueTime.
     */
    public void setEnqueueTime(String  enqueueTime) {
        this.enqueueTime = enqueueTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param haMode set the haMode.
     */
    public void setHaMode(String  haMode) {
        this.haMode = haMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Serviceenginegroup upgrade in progress.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return inProgress
     */
    public Boolean getInProgress() {
        return inProgress;
    }

    /**
     * This is the setter method to the attribute.
     * Serviceenginegroup upgrade in progress.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param inProgress set the inProgress.
     */
    public void setInProgress(Boolean  inProgress) {
        this.inProgress = inProgress;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return notes
     */
    public List<String> getNotes() {
        return notes;
    }

    /**
     * This is the setter method. this will set the notes
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return notes
     */
    public void setNotes(List<String>  notes) {
        this.notes = notes;
    }

    /**
     * This is the setter method this will set the notes
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return notes
     */
    public SeGroupStatus addNotesItem(String notesItem) {
      if (this.notes == null) {
        this.notes = new ArrayList<String>();
      }
      this.notes.add(notesItem);
      return this;
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
     * @return numSeWithNoVs
     */
    public Integer getNumSeWithNoVs() {
        return numSeWithNoVs;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSeWithNoVs set the numSeWithNoVs.
     */
    public void setNumSeWithNoVs(Integer  numSeWithNoVs) {
        this.numSeWithNoVs = numSeWithNoVs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSeWithVsNotScaledout
     */
    public Integer getNumSeWithVsNotScaledout() {
        return numSeWithVsNotScaledout;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSeWithVsNotScaledout set the numSeWithVsNotScaledout.
     */
    public void setNumSeWithVsNotScaledout(Integer  numSeWithVsNotScaledout) {
        this.numSeWithVsNotScaledout = numSeWithVsNotScaledout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSeWithVsScaledout
     */
    public Integer getNumSeWithVsScaledout() {
        return numSeWithVsScaledout;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSeWithVsScaledout set the numSeWithVsScaledout.
     */
    public void setNumSeWithVsScaledout(Integer  numSeWithVsScaledout) {
        this.numSeWithVsScaledout = numSeWithVsScaledout;
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
     * @return numVsDisrupted
     */
    public Integer getNumVsDisrupted() {
        return numVsDisrupted;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVsDisrupted set the numVsDisrupted.
     */
    public void setNumVsDisrupted(Integer  numVsDisrupted) {
        this.numVsDisrupted = numVsDisrupted;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param progress set the progress.
     */
    public void setProgress(Integer  progress) {
        this.progress = progress;
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
    public SeGroupStatus addReasonItem(String reasonItem) {
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
     * @return requestTime
     */
    public String getRequestTime() {
        return requestTime;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestTime set the requestTime.
     */
    public void setRequestTime(String  requestTime) {
        this.requestTime = requestTime;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Serviceengines are already upgraded before the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seAlreadyUpgradedAtStart
     */
    public List<String> getSeAlreadyUpgradedAtStart() {
        return seAlreadyUpgradedAtStart;
    }

    /**
     * This is the setter method. this will set the seAlreadyUpgradedAtStart
     * Serviceengines are already upgraded before the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seAlreadyUpgradedAtStart
     */
    public void setSeAlreadyUpgradedAtStart(List<String>  seAlreadyUpgradedAtStart) {
        this.seAlreadyUpgradedAtStart = seAlreadyUpgradedAtStart;
    }

    /**
     * This is the setter method this will set the seAlreadyUpgradedAtStart
     * Serviceengines are already upgraded before the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seAlreadyUpgradedAtStart
     */
    public SeGroupStatus addSeAlreadyUpgradedAtStartItem(String seAlreadyUpgradedAtStartItem) {
      if (this.seAlreadyUpgradedAtStart == null) {
        this.seAlreadyUpgradedAtStart = new ArrayList<String>();
      }
      this.seAlreadyUpgradedAtStart.add(seAlreadyUpgradedAtStartItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Serviceengines in disconnected state before starting the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDisconnectedAtStart
     */
    public List<String> getSeDisconnectedAtStart() {
        return seDisconnectedAtStart;
    }

    /**
     * This is the setter method. this will set the seDisconnectedAtStart
     * Serviceengines in disconnected state before starting the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDisconnectedAtStart
     */
    public void setSeDisconnectedAtStart(List<String>  seDisconnectedAtStart) {
        this.seDisconnectedAtStart = seDisconnectedAtStart;
    }

    /**
     * This is the setter method this will set the seDisconnectedAtStart
     * Serviceengines in disconnected state before starting the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDisconnectedAtStart
     */
    public SeGroupStatus addSeDisconnectedAtStartItem(String seDisconnectedAtStartItem) {
      if (this.seDisconnectedAtStart == null) {
        this.seDisconnectedAtStart = new ArrayList<String>();
      }
      this.seDisconnectedAtStart.add(seDisconnectedAtStartItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupName
     */
    public String getSeGroupName() {
        return seGroupName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroupName set the seGroupName.
     */
    public void setSeGroupName(String  seGroupName) {
        this.seGroupName = seGroupName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupUuid
     */
    public String getSeGroupUuid() {
        return seGroupUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroupUuid set the seGroupUuid.
     */
    public void setSeGroupUuid(String  seGroupUuid) {
        this.seGroupUuid = seGroupUuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Serviceengines local ip not present before the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seIpMissingAtStart
     */
    public List<String> getSeIpMissingAtStart() {
        return seIpMissingAtStart;
    }

    /**
     * This is the setter method. this will set the seIpMissingAtStart
     * Serviceengines local ip not present before the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seIpMissingAtStart
     */
    public void setSeIpMissingAtStart(List<String>  seIpMissingAtStart) {
        this.seIpMissingAtStart = seIpMissingAtStart;
    }

    /**
     * This is the setter method this will set the seIpMissingAtStart
     * Serviceengines local ip not present before the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seIpMissingAtStart
     */
    public SeGroupStatus addSeIpMissingAtStartItem(String seIpMissingAtStartItem) {
      if (this.seIpMissingAtStart == null) {
        this.seIpMissingAtStart = new ArrayList<String>();
      }
      this.seIpMissingAtStart.add(seIpMissingAtStartItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Serviceengines in poweredoff state before the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sePoweredoffAtStart
     */
    public List<String> getSePoweredoffAtStart() {
        return sePoweredoffAtStart;
    }

    /**
     * This is the setter method. this will set the sePoweredoffAtStart
     * Serviceengines in poweredoff state before the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sePoweredoffAtStart
     */
    public void setSePoweredoffAtStart(List<String>  sePoweredoffAtStart) {
        this.sePoweredoffAtStart = sePoweredoffAtStart;
    }

    /**
     * This is the setter method this will set the sePoweredoffAtStart
     * Serviceengines in poweredoff state before the upgrade.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sePoweredoffAtStart
     */
    public SeGroupStatus addSePoweredoffAtStartItem(String sePoweredoffAtStartItem) {
      if (this.sePoweredoffAtStart == null) {
        this.sePoweredoffAtStart = new ArrayList<String>();
      }
      this.sePoweredoffAtStart.add(sePoweredoffAtStartItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRebootInProgressRef
     */
    public String getSeRebootInProgressRef() {
        return seRebootInProgressRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRebootInProgressRef set the seRebootInProgressRef.
     */
    public void setSeRebootInProgressRef(String  seRebootInProgressRef) {
        this.seRebootInProgressRef = seRebootInProgressRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Serviceengines upgrade completed.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeCompleted
     */
    public List<String> getSeUpgradeCompleted() {
        return seUpgradeCompleted;
    }

    /**
     * This is the setter method. this will set the seUpgradeCompleted
     * Serviceengines upgrade completed.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeCompleted
     */
    public void setSeUpgradeCompleted(List<String>  seUpgradeCompleted) {
        this.seUpgradeCompleted = seUpgradeCompleted;
    }

    /**
     * This is the setter method this will set the seUpgradeCompleted
     * Serviceengines upgrade completed.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeCompleted
     */
    public SeGroupStatus addSeUpgradeCompletedItem(String seUpgradeCompletedItem) {
      if (this.seUpgradeCompleted == null) {
        this.seUpgradeCompleted = new ArrayList<String>();
      }
      this.seUpgradeCompleted.add(seUpgradeCompletedItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Serviceenginegroup upgrade errors.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeErrors
     */
    public List<SeUpgradeEvents> getSeUpgradeErrors() {
        return seUpgradeErrors;
    }

    /**
     * This is the setter method. this will set the seUpgradeErrors
     * Serviceenginegroup upgrade errors.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeErrors
     */
    public void setSeUpgradeErrors(List<SeUpgradeEvents>  seUpgradeErrors) {
        this.seUpgradeErrors = seUpgradeErrors;
    }

    /**
     * This is the setter method this will set the seUpgradeErrors
     * Serviceenginegroup upgrade errors.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeErrors
     */
    public SeGroupStatus addSeUpgradeErrorsItem(SeUpgradeEvents seUpgradeErrorsItem) {
      if (this.seUpgradeErrors == null) {
        this.seUpgradeErrors = new ArrayList<SeUpgradeEvents>();
      }
      this.seUpgradeErrors.add(seUpgradeErrorsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Serviceengines upgrade failed.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeFailed
     */
    public List<String> getSeUpgradeFailed() {
        return seUpgradeFailed;
    }

    /**
     * This is the setter method. this will set the seUpgradeFailed
     * Serviceengines upgrade failed.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeFailed
     */
    public void setSeUpgradeFailed(List<String>  seUpgradeFailed) {
        this.seUpgradeFailed = seUpgradeFailed;
    }

    /**
     * This is the setter method this will set the seUpgradeFailed
     * Serviceengines upgrade failed.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeFailed
     */
    public SeGroupStatus addSeUpgradeFailedItem(String seUpgradeFailedItem) {
      if (this.seUpgradeFailed == null) {
        this.seUpgradeFailed = new ArrayList<String>();
      }
      this.seUpgradeFailed.add(seUpgradeFailedItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Serviceengines upgrade in progress.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeInProgress
     */
    public List<String> getSeUpgradeInProgress() {
        return seUpgradeInProgress;
    }

    /**
     * This is the setter method. this will set the seUpgradeInProgress
     * Serviceengines upgrade in progress.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeInProgress
     */
    public void setSeUpgradeInProgress(List<String>  seUpgradeInProgress) {
        this.seUpgradeInProgress = seUpgradeInProgress;
    }

    /**
     * This is the setter method this will set the seUpgradeInProgress
     * Serviceengines upgrade in progress.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeInProgress
     */
    public SeGroupStatus addSeUpgradeInProgressItem(String seUpgradeInProgressItem) {
      if (this.seUpgradeInProgress == null) {
        this.seUpgradeInProgress = new ArrayList<String>();
      }
      this.seUpgradeInProgress.add(seUpgradeInProgressItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Serviceengines upgrade not started.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeNotStarted
     */
    public List<String> getSeUpgradeNotStarted() {
        return seUpgradeNotStarted;
    }

    /**
     * This is the setter method. this will set the seUpgradeNotStarted
     * Serviceengines upgrade not started.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeNotStarted
     */
    public void setSeUpgradeNotStarted(List<String>  seUpgradeNotStarted) {
        this.seUpgradeNotStarted = seUpgradeNotStarted;
    }

    /**
     * This is the setter method this will set the seUpgradeNotStarted
     * Serviceengines upgrade not started.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeNotStarted
     */
    public SeGroupStatus addSeUpgradeNotStartedItem(String seUpgradeNotStartedItem) {
      if (this.seUpgradeNotStarted == null) {
        this.seUpgradeNotStarted = new ArrayList<String>();
      }
      this.seUpgradeNotStarted.add(seUpgradeNotStartedItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Service engines that were in suspended state and were skipped upon service engine group ugprade resumption.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeSkipSuspended
     */
    public List<String> getSeUpgradeSkipSuspended() {
        return seUpgradeSkipSuspended;
    }

    /**
     * This is the setter method. this will set the seUpgradeSkipSuspended
     * Service engines that were in suspended state and were skipped upon service engine group ugprade resumption.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeSkipSuspended
     */
    public void setSeUpgradeSkipSuspended(List<String>  seUpgradeSkipSuspended) {
        this.seUpgradeSkipSuspended = seUpgradeSkipSuspended;
    }

    /**
     * This is the setter method this will set the seUpgradeSkipSuspended
     * Service engines that were in suspended state and were skipped upon service engine group ugprade resumption.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeSkipSuspended
     */
    public SeGroupStatus addSeUpgradeSkipSuspendedItem(String seUpgradeSkipSuspendedItem) {
      if (this.seUpgradeSkipSuspended == null) {
        this.seUpgradeSkipSuspended = new ArrayList<String>();
      }
      this.seUpgradeSkipSuspended.add(seUpgradeSkipSuspendedItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Service engines which triggered service engine group to be in suspended state.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeSuspended
     */
    public List<String> getSeUpgradeSuspended() {
        return seUpgradeSuspended;
    }

    /**
     * This is the setter method. this will set the seUpgradeSuspended
     * Service engines which triggered service engine group to be in suspended state.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeSuspended
     */
    public void setSeUpgradeSuspended(List<String>  seUpgradeSuspended) {
        this.seUpgradeSuspended = seUpgradeSuspended;
    }

    /**
     * This is the setter method this will set the seUpgradeSuspended
     * Service engines which triggered service engine group to be in suspended state.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUpgradeSuspended
     */
    public SeGroupStatus addSeUpgradeSuspendedItem(String seUpgradeSuspendedItem) {
      if (this.seUpgradeSuspended == null) {
        this.seUpgradeSuspended = new ArrayList<String>();
      }
      this.seUpgradeSuspended.add(seUpgradeSuspendedItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seWithNoVs
     */
    public List<String> getSeWithNoVs() {
        return seWithNoVs;
    }

    /**
     * This is the setter method. this will set the seWithNoVs
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seWithNoVs
     */
    public void setSeWithNoVs(List<String>  seWithNoVs) {
        this.seWithNoVs = seWithNoVs;
    }

    /**
     * This is the setter method this will set the seWithNoVs
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seWithNoVs
     */
    public SeGroupStatus addSeWithNoVsItem(String seWithNoVsItem) {
      if (this.seWithNoVs == null) {
        this.seWithNoVs = new ArrayList<String>();
      }
      this.seWithNoVs.add(seWithNoVsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seWithVsNotScaledout
     */
    public List<String> getSeWithVsNotScaledout() {
        return seWithVsNotScaledout;
    }

    /**
     * This is the setter method. this will set the seWithVsNotScaledout
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seWithVsNotScaledout
     */
    public void setSeWithVsNotScaledout(List<String>  seWithVsNotScaledout) {
        this.seWithVsNotScaledout = seWithVsNotScaledout;
    }

    /**
     * This is the setter method this will set the seWithVsNotScaledout
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seWithVsNotScaledout
     */
    public SeGroupStatus addSeWithVsNotScaledoutItem(String seWithVsNotScaledoutItem) {
      if (this.seWithVsNotScaledout == null) {
        this.seWithVsNotScaledout = new ArrayList<String>();
      }
      this.seWithVsNotScaledout.add(seWithVsNotScaledoutItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seWithVsScaledout
     */
    public List<String> getSeWithVsScaledout() {
        return seWithVsScaledout;
    }

    /**
     * This is the setter method. this will set the seWithVsScaledout
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seWithVsScaledout
     */
    public void setSeWithVsScaledout(List<String>  seWithVsScaledout) {
        this.seWithVsScaledout = seWithVsScaledout;
    }

    /**
     * This is the setter method this will set the seWithVsScaledout
     * It is a reference to an object of type serviceengine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seWithVsScaledout
     */
    public SeGroupStatus addSeWithVsScaledoutItem(String seWithVsScaledoutItem) {
      if (this.seWithVsScaledout == null) {
        this.seWithVsScaledout = new ArrayList<String>();
      }
      this.seWithVsScaledout.add(seWithVsScaledoutItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTime set the startTime.
     */
    public void setStartTime(String  startTime) {
        this.startTime = startTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - SE_UPGRADE_PREVIEW, SE_UPGRADE_IN_PROGRESS, SE_UPGRADE_COMPLETE, SE_UPGRADE_ERROR, SE_UPGRADE_PRE_CHECKS, SE_IMAGE_INSTALL,
     * SE_UPGRADE_IMAGE_NOT_FOUND, SE_ALREADY_UPGRADED, SE_REBOOT, SE_CONNECT_AFTER_REBOOT, SE_PRE_UPGRADE_TASKS, SE_POST_UPGRADE_TASKS,
     * SE_WAIT_FOR_SWITCHOVER, SE_CHECK_SCALEDOUT_VS_EXISTS, SE_UPGRADE_SEMGR_REQUEST, SE_UPGRADE_SEMGR_SE_UNREACHABLE, SE_PRE_UPGRADE_SCALE_IN_OPS,
     * SE_POST_UPGRADE_SCALE_OUT_OPS, SE_UPGRADE_SUSPENDED, SE_UPGRADE_START...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - SE_UPGRADE_PREVIEW, SE_UPGRADE_IN_PROGRESS, SE_UPGRADE_COMPLETE, SE_UPGRADE_ERROR, SE_UPGRADE_PRE_CHECKS, SE_IMAGE_INSTALL,
     * SE_UPGRADE_IMAGE_NOT_FOUND, SE_ALREADY_UPGRADED, SE_REBOOT, SE_CONNECT_AFTER_REBOOT, SE_PRE_UPGRADE_TASKS, SE_POST_UPGRADE_TASKS,
     * SE_WAIT_FOR_SWITCHOVER, SE_CHECK_SCALEDOUT_VS_EXISTS, SE_UPGRADE_SEMGR_REQUEST, SE_UPGRADE_SEMGR_SE_UNREACHABLE, SE_PRE_UPGRADE_SCALE_IN_OPS,
     * SE_POST_UPGRADE_SCALE_OUT_OPS, SE_UPGRADE_SUSPENDED, SE_UPGRADE_START...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(String  state) {
        this.state = state;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return thread
     */
    public String getThread() {
        return thread;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param thread set the thread.
     */
    public void setThread(String  thread) {
        this.thread = thread;
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
     * Virtualservice errors during the segroup upgrade.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsErrors
     */
    public List<VsError> getVsErrors() {
        return vsErrors;
    }

    /**
     * This is the setter method. this will set the vsErrors
     * Virtualservice errors during the segroup upgrade.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsErrors
     */
    public void setVsErrors(List<VsError>  vsErrors) {
        this.vsErrors = vsErrors;
    }

    /**
     * This is the setter method this will set the vsErrors
     * Virtualservice errors during the segroup upgrade.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsErrors
     */
    public SeGroupStatus addVsErrorsItem(VsError vsErrorsItem) {
      if (this.vsErrors == null) {
        this.vsErrors = new ArrayList<VsError>();
      }
      this.vsErrors.add(vsErrorsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsMigrateInProgressRef
     */
    public List<String> getVsMigrateInProgressRef() {
        return vsMigrateInProgressRef;
    }

    /**
     * This is the setter method. this will set the vsMigrateInProgressRef
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsMigrateInProgressRef
     */
    public void setVsMigrateInProgressRef(List<String>  vsMigrateInProgressRef) {
        this.vsMigrateInProgressRef = vsMigrateInProgressRef;
    }

    /**
     * This is the setter method this will set the vsMigrateInProgressRef
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsMigrateInProgressRef
     */
    public SeGroupStatus addVsMigrateInProgressRefItem(String vsMigrateInProgressRefItem) {
      if (this.vsMigrateInProgressRef == null) {
        this.vsMigrateInProgressRef = new ArrayList<String>();
      }
      this.vsMigrateInProgressRef.add(vsMigrateInProgressRefItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsScaleinInProgressRef
     */
    public List<String> getVsScaleinInProgressRef() {
        return vsScaleinInProgressRef;
    }

    /**
     * This is the setter method. this will set the vsScaleinInProgressRef
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsScaleinInProgressRef
     */
    public void setVsScaleinInProgressRef(List<String>  vsScaleinInProgressRef) {
        this.vsScaleinInProgressRef = vsScaleinInProgressRef;
    }

    /**
     * This is the setter method this will set the vsScaleinInProgressRef
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsScaleinInProgressRef
     */
    public SeGroupStatus addVsScaleinInProgressRefItem(String vsScaleinInProgressRefItem) {
      if (this.vsScaleinInProgressRef == null) {
        this.vsScaleinInProgressRef = new ArrayList<String>();
      }
      this.vsScaleinInProgressRef.add(vsScaleinInProgressRefItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsScaleoutInProgressRef
     */
    public List<String> getVsScaleoutInProgressRef() {
        return vsScaleoutInProgressRef;
    }

    /**
     * This is the setter method. this will set the vsScaleoutInProgressRef
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsScaleoutInProgressRef
     */
    public void setVsScaleoutInProgressRef(List<String>  vsScaleoutInProgressRef) {
        this.vsScaleoutInProgressRef = vsScaleoutInProgressRef;
    }

    /**
     * This is the setter method this will set the vsScaleoutInProgressRef
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsScaleoutInProgressRef
     */
    public SeGroupStatus addVsScaleoutInProgressRefItem(String vsScaleoutInProgressRefItem) {
      if (this.vsScaleoutInProgressRef == null) {
        this.vsScaleoutInProgressRef = new ArrayList<String>();
      }
      this.vsScaleoutInProgressRef.add(vsScaleoutInProgressRefItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return worker
     */
    public String getWorker() {
        return worker;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param worker set the worker.
     */
    public void setWorker(String  worker) {
        this.worker = worker;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeGroupStatus objSeGroupStatus = (SeGroupStatus) o;
      return   Objects.equals(this.seGroupUuid, objSeGroupStatus.seGroupUuid)&&
  Objects.equals(this.seGroupName, objSeGroupStatus.seGroupName)&&
  Objects.equals(this.haMode, objSeGroupStatus.haMode)&&
  Objects.equals(this.numSe, objSeGroupStatus.numSe)&&
  Objects.equals(this.numVs, objSeGroupStatus.numVs)&&
  Objects.equals(this.trafficStatus, objSeGroupStatus.trafficStatus)&&
  Objects.equals(this.reason, objSeGroupStatus.reason)&&
  Objects.equals(this.tenantRef, objSeGroupStatus.tenantRef)&&
  Objects.equals(this.progress, objSeGroupStatus.progress)&&
  Objects.equals(this.requestTime, objSeGroupStatus.requestTime)&&
  Objects.equals(this.enqueueTime, objSeGroupStatus.enqueueTime)&&
  Objects.equals(this.startTime, objSeGroupStatus.startTime)&&
  Objects.equals(this.endTime, objSeGroupStatus.endTime)&&
  Objects.equals(this.duration, objSeGroupStatus.duration)&&
  Objects.equals(this.state, objSeGroupStatus.state)&&
  Objects.equals(this.notes, objSeGroupStatus.notes)&&
  Objects.equals(this.worker, objSeGroupStatus.worker)&&
  Objects.equals(this.thread, objSeGroupStatus.thread)&&
  Objects.equals(this.numVsDisrupted, objSeGroupStatus.numVsDisrupted)&&
  Objects.equals(this.disruptedVsRef, objSeGroupStatus.disruptedVsRef)&&
  Objects.equals(this.numSeWithNoVs, objSeGroupStatus.numSeWithNoVs)&&
  Objects.equals(this.seWithNoVs, objSeGroupStatus.seWithNoVs)&&
  Objects.equals(this.numSeWithVsNotScaledout, objSeGroupStatus.numSeWithVsNotScaledout)&&
  Objects.equals(this.seWithVsNotScaledout, objSeGroupStatus.seWithVsNotScaledout)&&
  Objects.equals(this.numSeWithVsScaledout, objSeGroupStatus.numSeWithVsScaledout)&&
  Objects.equals(this.seWithVsScaledout, objSeGroupStatus.seWithVsScaledout)&&
  Objects.equals(this.seRebootInProgressRef, objSeGroupStatus.seRebootInProgressRef)&&
  Objects.equals(this.vsScaleoutInProgressRef, objSeGroupStatus.vsScaleoutInProgressRef)&&
  Objects.equals(this.vsScaleinInProgressRef, objSeGroupStatus.vsScaleinInProgressRef)&&
  Objects.equals(this.vsMigrateInProgressRef, objSeGroupStatus.vsMigrateInProgressRef)&&
  Objects.equals(this.seUpgradeSuspended, objSeGroupStatus.seUpgradeSuspended)&&
  Objects.equals(this.seUpgradeSkipSuspended, objSeGroupStatus.seUpgradeSkipSuspended)&&
  Objects.equals(this.inProgress, objSeGroupStatus.inProgress)&&
  Objects.equals(this.controllerVersion, objSeGroupStatus.controllerVersion)&&
  Objects.equals(this.seUpgradeNotStarted, objSeGroupStatus.seUpgradeNotStarted)&&
  Objects.equals(this.seUpgradeInProgress, objSeGroupStatus.seUpgradeInProgress)&&
  Objects.equals(this.seUpgradeCompleted, objSeGroupStatus.seUpgradeCompleted)&&
  Objects.equals(this.seDisconnectedAtStart, objSeGroupStatus.seDisconnectedAtStart)&&
  Objects.equals(this.sePoweredoffAtStart, objSeGroupStatus.sePoweredoffAtStart)&&
  Objects.equals(this.seAlreadyUpgradedAtStart, objSeGroupStatus.seAlreadyUpgradedAtStart)&&
  Objects.equals(this.seIpMissingAtStart, objSeGroupStatus.seIpMissingAtStart)&&
  Objects.equals(this.seUpgradeFailed, objSeGroupStatus.seUpgradeFailed)&&
  Objects.equals(this.seUpgradeErrors, objSeGroupStatus.seUpgradeErrors)&&
  Objects.equals(this.vsErrors, objSeGroupStatus.vsErrors);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeGroupStatus {\n");
                  sb.append("    controllerVersion: ").append(toIndentedString(controllerVersion)).append("\n");
                        sb.append("    disruptedVsRef: ").append(toIndentedString(disruptedVsRef)).append("\n");
                        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
                        sb.append("    enqueueTime: ").append(toIndentedString(enqueueTime)).append("\n");
                        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
                        sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
                        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
                        sb.append("    numSe: ").append(toIndentedString(numSe)).append("\n");
                        sb.append("    numSeWithNoVs: ").append(toIndentedString(numSeWithNoVs)).append("\n");
                        sb.append("    numSeWithVsNotScaledout: ").append(toIndentedString(numSeWithVsNotScaledout)).append("\n");
                        sb.append("    numSeWithVsScaledout: ").append(toIndentedString(numSeWithVsScaledout)).append("\n");
                        sb.append("    numVs: ").append(toIndentedString(numVs)).append("\n");
                        sb.append("    numVsDisrupted: ").append(toIndentedString(numVsDisrupted)).append("\n");
                        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
                        sb.append("    seAlreadyUpgradedAtStart: ").append(toIndentedString(seAlreadyUpgradedAtStart)).append("\n");
                        sb.append("    seDisconnectedAtStart: ").append(toIndentedString(seDisconnectedAtStart)).append("\n");
                        sb.append("    seGroupName: ").append(toIndentedString(seGroupName)).append("\n");
                        sb.append("    seGroupUuid: ").append(toIndentedString(seGroupUuid)).append("\n");
                        sb.append("    seIpMissingAtStart: ").append(toIndentedString(seIpMissingAtStart)).append("\n");
                        sb.append("    sePoweredoffAtStart: ").append(toIndentedString(sePoweredoffAtStart)).append("\n");
                        sb.append("    seRebootInProgressRef: ").append(toIndentedString(seRebootInProgressRef)).append("\n");
                        sb.append("    seUpgradeCompleted: ").append(toIndentedString(seUpgradeCompleted)).append("\n");
                        sb.append("    seUpgradeErrors: ").append(toIndentedString(seUpgradeErrors)).append("\n");
                        sb.append("    seUpgradeFailed: ").append(toIndentedString(seUpgradeFailed)).append("\n");
                        sb.append("    seUpgradeInProgress: ").append(toIndentedString(seUpgradeInProgress)).append("\n");
                        sb.append("    seUpgradeNotStarted: ").append(toIndentedString(seUpgradeNotStarted)).append("\n");
                        sb.append("    seUpgradeSkipSuspended: ").append(toIndentedString(seUpgradeSkipSuspended)).append("\n");
                        sb.append("    seUpgradeSuspended: ").append(toIndentedString(seUpgradeSuspended)).append("\n");
                        sb.append("    seWithNoVs: ").append(toIndentedString(seWithNoVs)).append("\n");
                        sb.append("    seWithVsNotScaledout: ").append(toIndentedString(seWithVsNotScaledout)).append("\n");
                        sb.append("    seWithVsScaledout: ").append(toIndentedString(seWithVsScaledout)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
                        sb.append("    trafficStatus: ").append(toIndentedString(trafficStatus)).append("\n");
                        sb.append("    vsErrors: ").append(toIndentedString(vsErrors)).append("\n");
                        sb.append("    vsMigrateInProgressRef: ").append(toIndentedString(vsMigrateInProgressRef)).append("\n");
                        sb.append("    vsScaleinInProgressRef: ").append(toIndentedString(vsScaleinInProgressRef)).append("\n");
                        sb.append("    vsScaleoutInProgressRef: ").append(toIndentedString(vsScaleoutInProgressRef)).append("\n");
                        sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
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
