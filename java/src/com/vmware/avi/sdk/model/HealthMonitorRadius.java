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
 * The HealthMonitorRadius is a POJO class extends AviRestResource that used for creating
 * HealthMonitorRadius.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthMonitorRadius  {
    @JsonProperty("password")
    private String password;

    @JsonProperty("shared_secret")
    private String sharedSecret;

    @JsonProperty("username")
    private String username;



    /**
     * This is the getter method this will return the attribute value.
     * Radius monitor will query radius server with this password.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This is the setter method to the attribute.
     * Radius monitor will query radius server with this password.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param password set the password.
     */
    public void setPassword(String  password) {
        this.password = password;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Radius monitor will query radius server with this shared secret.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sharedSecret
     */
    public String getSharedSecret() {
        return sharedSecret;
    }

    /**
     * This is the setter method to the attribute.
     * Radius monitor will query radius server with this shared secret.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sharedSecret set the sharedSecret.
     */
    public void setSharedSecret(String  sharedSecret) {
        this.sharedSecret = sharedSecret;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Radius monitor will query radius server with this username.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * This is the setter method to the attribute.
     * Radius monitor will query radius server with this username.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param username set the username.
     */
    public void setUsername(String  username) {
        this.username = username;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HealthMonitorRadius objHealthMonitorRadius = (HealthMonitorRadius) o;
      return   Objects.equals(this.username, objHealthMonitorRadius.username)&&
  Objects.equals(this.password, objHealthMonitorRadius.password)&&
  Objects.equals(this.sharedSecret, objHealthMonitorRadius.sharedSecret);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HealthMonitorRadius {\n");
                  sb.append("    password: ").append(toIndentedString(password)).append("\n");
                        sb.append("    sharedSecret: ").append(toIndentedString(sharedSecret)).append("\n");
                        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
