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
 * The WebApplicationSignatureServiceStatus is a POJO class extends AviRestResource that used for creating
 * WebApplicationSignatureServiceStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebApplicationSignatureServiceStatus  {
    @JsonProperty("error")
    private String error;

    @JsonProperty("last_successful_update_check")
    private TimeStamp lastSuccessfulUpdateCheck;

    @JsonProperty("upstream_sync_timestamp")
    private TimeStamp upstreamSyncTimestamp;



    /**
     * This is the getter method this will return the attribute value.
     * If the last attempted update failed, this is a more detailed error message.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return error
     */
    public String getError() {
        return error;
    }

    /**
     * This is the setter method to the attribute.
     * If the last attempted update failed, this is a more detailed error message.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param error set the error.
     */
    public void setError(String  error) {
        this.error = error;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The time when the application signature service last successfull attemped to update this object.
     * It will be not update, if an error occurs during an update attempt.
     * In this case, the error will be set.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastSuccessfulUpdateCheck
     */
    public TimeStamp getLastSuccessfulUpdateCheck() {
        return lastSuccessfulUpdateCheck;
    }

    /**
     * This is the setter method to the attribute.
     * The time when the application signature service last successfull attemped to update this object.
     * It will be not update, if an error occurs during an update attempt.
     * In this case, the error will be set.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastSuccessfulUpdateCheck set the lastSuccessfulUpdateCheck.
     */
    public void setLastSuccessfulUpdateCheck(TimeStamp lastSuccessfulUpdateCheck) {
        this.lastSuccessfulUpdateCheck = lastSuccessfulUpdateCheck;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A timestamp field.
     * It is used by the application signature sync service to keep track of the current version.
     * Field introduced in 21.1.1, 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return upstreamSyncTimestamp
     */
    public TimeStamp getUpstreamSyncTimestamp() {
        return upstreamSyncTimestamp;
    }

    /**
     * This is the setter method to the attribute.
     * A timestamp field.
     * It is used by the application signature sync service to keep track of the current version.
     * Field introduced in 21.1.1, 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param upstreamSyncTimestamp set the upstreamSyncTimestamp.
     */
    public void setUpstreamSyncTimestamp(TimeStamp upstreamSyncTimestamp) {
        this.upstreamSyncTimestamp = upstreamSyncTimestamp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WebApplicationSignatureServiceStatus objWebApplicationSignatureServiceStatus = (WebApplicationSignatureServiceStatus) o;
      return   Objects.equals(this.error, objWebApplicationSignatureServiceStatus.error)&&
  Objects.equals(this.lastSuccessfulUpdateCheck, objWebApplicationSignatureServiceStatus.lastSuccessfulUpdateCheck)&&
  Objects.equals(this.upstreamSyncTimestamp, objWebApplicationSignatureServiceStatus.upstreamSyncTimestamp);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WebApplicationSignatureServiceStatus {\n");
                  sb.append("    error: ").append(toIndentedString(error)).append("\n");
                        sb.append("    lastSuccessfulUpdateCheck: ").append(toIndentedString(lastSuccessfulUpdateCheck)).append("\n");
                        sb.append("    upstreamSyncTimestamp: ").append(toIndentedString(upstreamSyncTimestamp)).append("\n");
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
