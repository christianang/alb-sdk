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
 * The CloudConnectorDebugFilter is a POJO class extends AviRestResource that used for creating
 * CloudConnectorDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CloudConnectorDebugFilter  {
    @JsonProperty("app_id")
    private String appId;

    @JsonProperty("disable_se_reboot")
    private Boolean disableSeReboot;

    @JsonProperty("se_id")
    private String seId;



    /**
     * This is the getter method this will return the attribute value.
     * Filter debugs for an app.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This is the setter method to the attribute.
     * Filter debugs for an app.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param appId set the appId.
     */
    public void setAppId(String  appId) {
        this.appId = appId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Disable se reboot via cloud connector on hb miss.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return disableSeReboot
     */
    public Boolean getDisableSeReboot() {
        return disableSeReboot;
    }

    /**
     * This is the setter method to the attribute.
     * Disable se reboot via cloud connector on hb miss.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param disableSeReboot set the disableSeReboot.
     */
    public void setDisableSeReboot(Boolean  disableSeReboot) {
        this.disableSeReboot = disableSeReboot;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Filter debugs for a se.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seId
     */
    public String getSeId() {
        return seId;
    }

    /**
     * This is the setter method to the attribute.
     * Filter debugs for a se.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seId set the seId.
     */
    public void setSeId(String  seId) {
        this.seId = seId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CloudConnectorDebugFilter objCloudConnectorDebugFilter = (CloudConnectorDebugFilter) o;
      return   Objects.equals(this.seId, objCloudConnectorDebugFilter.seId)&&
  Objects.equals(this.appId, objCloudConnectorDebugFilter.appId)&&
  Objects.equals(this.disableSeReboot, objCloudConnectorDebugFilter.disableSeReboot);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CloudConnectorDebugFilter {\n");
                  sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
                        sb.append("    disableSeReboot: ").append(toIndentedString(disableSeReboot)).append("\n");
                        sb.append("    seId: ").append(toIndentedString(seId)).append("\n");
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
