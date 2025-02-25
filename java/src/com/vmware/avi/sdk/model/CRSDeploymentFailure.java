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
 * The CRSDeploymentFailure is a POJO class extends AviRestResource that used for creating
 * CRSDeploymentFailure.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CRSDeploymentFailure  {
    @JsonProperty("crs_info")
    private List<CRSDetails> crsInfo;

    @JsonProperty("message")
    private String message;


    /**
     * This is the getter method this will return the attribute value.
     * List of all crs updates that failed to install.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crsInfo
     */
    public List<CRSDetails> getCrsInfo() {
        return crsInfo;
    }

    /**
     * This is the setter method. this will set the crsInfo
     * List of all crs updates that failed to install.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crsInfo
     */
    public void setCrsInfo(List<CRSDetails>  crsInfo) {
        this.crsInfo = crsInfo;
    }

    /**
     * This is the setter method this will set the crsInfo
     * List of all crs updates that failed to install.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crsInfo
     */
    public CRSDeploymentFailure addCrsInfoItem(CRSDetails crsInfoItem) {
      if (this.crsInfo == null) {
        this.crsInfo = new ArrayList<CRSDetails>();
      }
      this.crsInfo.add(crsInfoItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error message to be conveyed to controller ui.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * This is the setter method to the attribute.
     * Error message to be conveyed to controller ui.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param message set the message.
     */
    public void setMessage(String  message) {
        this.message = message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CRSDeploymentFailure objCRSDeploymentFailure = (CRSDeploymentFailure) o;
      return   Objects.equals(this.crsInfo, objCRSDeploymentFailure.crsInfo)&&
  Objects.equals(this.message, objCRSDeploymentFailure.message);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CRSDeploymentFailure {\n");
                  sb.append("    crsInfo: ").append(toIndentedString(crsInfo)).append("\n");
                        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
