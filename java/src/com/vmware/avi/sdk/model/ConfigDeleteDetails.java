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
 * The ConfigDeleteDetails is a POJO class extends AviRestResource that used for creating
 * ConfigDeleteDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigDeleteDetails  {
    @JsonProperty("client_ip")
    private String clientIp;

    @JsonProperty("error_message")
    private String errorMessage;

    @JsonProperty("path")
    private String path;

    @JsonProperty("resource_data")
    private String resourceData;

    @JsonProperty("resource_name")
    private String resourceName;

    @JsonProperty("resource_type")
    private String resourceType;

    @JsonProperty("status")
    private String status;

    @JsonProperty("user")
    private String user;

    @JsonProperty("user_agent")
    private String userAgent;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientIp set the clientIp.
     */
    public void setClientIp(String  clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error message if request failed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * This is the setter method to the attribute.
     * Error message if request failed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorMessage set the errorMessage.
     */
    public void setErrorMessage(String  errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Api path.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * This is the setter method to the attribute.
     * Api path.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param path set the path.
     */
    public void setPath(String  path) {
        this.path = path;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deleted data of the resource.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resourceData
     */
    public String getResourceData() {
        return resourceData;
    }

    /**
     * This is the setter method to the attribute.
     * Deleted data of the resource.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resourceData set the resourceData.
     */
    public void setResourceData(String  resourceData) {
        this.resourceData = resourceData;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the deleted resource.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the deleted resource.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resourceName set the resourceName.
     */
    public void setResourceName(String  resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Config type of the deleted resource.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is the setter method to the attribute.
     * Config type of the deleted resource.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resourceType set the resourceType.
     */
    public void setResourceType(String  resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is the setter method to the attribute.
     * Status.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param status set the status.
     */
    public void setStatus(String  status) {
        this.status = status;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Request user.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * This is the setter method to the attribute.
     * Request user.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param user set the user.
     */
    public void setUser(String  user) {
        this.user = user;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userAgent set the userAgent.
     */
    public void setUserAgent(String  userAgent) {
        this.userAgent = userAgent;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ConfigDeleteDetails objConfigDeleteDetails = (ConfigDeleteDetails) o;
      return   Objects.equals(this.path, objConfigDeleteDetails.path)&&
  Objects.equals(this.user, objConfigDeleteDetails.user)&&
  Objects.equals(this.status, objConfigDeleteDetails.status)&&
  Objects.equals(this.resourceType, objConfigDeleteDetails.resourceType)&&
  Objects.equals(this.resourceName, objConfigDeleteDetails.resourceName)&&
  Objects.equals(this.errorMessage, objConfigDeleteDetails.errorMessage)&&
  Objects.equals(this.resourceData, objConfigDeleteDetails.resourceData)&&
  Objects.equals(this.userAgent, objConfigDeleteDetails.userAgent)&&
  Objects.equals(this.clientIp, objConfigDeleteDetails.clientIp);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ConfigDeleteDetails {\n");
                  sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
                        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
                        sb.append("    path: ").append(toIndentedString(path)).append("\n");
                        sb.append("    resourceData: ").append(toIndentedString(resourceData)).append("\n");
                        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
                        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
                        sb.append("    status: ").append(toIndentedString(status)).append("\n");
                        sb.append("    user: ").append(toIndentedString(user)).append("\n");
                        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
