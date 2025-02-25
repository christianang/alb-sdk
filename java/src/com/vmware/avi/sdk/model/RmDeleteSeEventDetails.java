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
 * The RmDeleteSeEventDetails is a POJO class extends AviRestResource that used for creating
 * RmDeleteSeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RmDeleteSeEventDetails  {
    @JsonProperty("cloud_name")
    private String cloudName;

    @JsonProperty("cloud_uuid")
    private String cloudUuid;

    @JsonProperty("host_name")
    private String hostName;

    @JsonProperty("host_uuid")
    private String hostUuid;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("se_cookie")
    private String seCookie;

    @JsonProperty("se_grp_name")
    private String seGrpName;

    @JsonProperty("se_grp_uuid")
    private String seGrpUuid;

    @JsonProperty("se_name")
    private String seName;

    @JsonProperty("se_uuid")
    private String seUuid;

    @JsonProperty("status_code")
    private Integer statusCode;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudName
     */
    public String getCloudName() {
        return cloudName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudName set the cloudName.
     */
    public void setCloudName(String  cloudName) {
        this.cloudName = cloudName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudUuid
     */
    public String getCloudUuid() {
        return cloudUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudUuid set the cloudUuid.
     */
    public void setCloudUuid(String  cloudUuid) {
        this.cloudUuid = cloudUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostName set the hostName.
     */
    public void setHostName(String  hostName) {
        this.hostName = hostName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostUuid
     */
    public String getHostUuid() {
        return hostUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostUuid set the hostUuid.
     */
    public void setHostUuid(String  hostUuid) {
        this.hostUuid = hostUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seCookie
     */
    public String getSeCookie() {
        return seCookie;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seCookie set the seCookie.
     */
    public void setSeCookie(String  seCookie) {
        this.seCookie = seCookie;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGrpName
     */
    public String getSeGrpName() {
        return seGrpName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGrpName set the seGrpName.
     */
    public void setSeGrpName(String  seGrpName) {
        this.seGrpName = seGrpName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGrpUuid
     */
    public String getSeGrpUuid() {
        return seGrpUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGrpUuid set the seGrpUuid.
     */
    public void setSeGrpUuid(String  seGrpUuid) {
        this.seGrpUuid = seGrpUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seName
     */
    public String getSeName() {
        return seName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seName set the seName.
     */
    public void setSeName(String  seName) {
        this.seName = seName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUuid
     */
    public String getSeUuid() {
        return seUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seUuid set the seUuid.
     */
    public void setSeUuid(String  seUuid) {
        this.seUuid = seUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param statusCode set the statusCode.
     */
    public void setStatusCode(Integer  statusCode) {
        this.statusCode = statusCode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RmDeleteSeEventDetails objRmDeleteSeEventDetails = (RmDeleteSeEventDetails) o;
      return   Objects.equals(this.seName, objRmDeleteSeEventDetails.seName)&&
  Objects.equals(this.seCookie, objRmDeleteSeEventDetails.seCookie)&&
  Objects.equals(this.seUuid, objRmDeleteSeEventDetails.seUuid)&&
  Objects.equals(this.hostUuid, objRmDeleteSeEventDetails.hostUuid)&&
  Objects.equals(this.hostName, objRmDeleteSeEventDetails.hostName)&&
  Objects.equals(this.statusCode, objRmDeleteSeEventDetails.statusCode)&&
  Objects.equals(this.reason, objRmDeleteSeEventDetails.reason)&&
  Objects.equals(this.seGrpUuid, objRmDeleteSeEventDetails.seGrpUuid)&&
  Objects.equals(this.seGrpName, objRmDeleteSeEventDetails.seGrpName)&&
  Objects.equals(this.cloudUuid, objRmDeleteSeEventDetails.cloudUuid)&&
  Objects.equals(this.cloudName, objRmDeleteSeEventDetails.cloudName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RmDeleteSeEventDetails {\n");
                  sb.append("    cloudName: ").append(toIndentedString(cloudName)).append("\n");
                        sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
                        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
                        sb.append("    hostUuid: ").append(toIndentedString(hostUuid)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    seCookie: ").append(toIndentedString(seCookie)).append("\n");
                        sb.append("    seGrpName: ").append(toIndentedString(seGrpName)).append("\n");
                        sb.append("    seGrpUuid: ").append(toIndentedString(seGrpUuid)).append("\n");
                        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
                        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
                        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
