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
 * The HTTPSecurityActionRateProfile is a POJO class extends AviRestResource that used for creating
 * HTTPSecurityActionRateProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPSecurityActionRateProfile  {
    @JsonProperty("action")
    private RateLimiterAction action;

    @JsonProperty("per_client_ip")
    private Boolean perClientIp;

    @JsonProperty("per_uri_path")
    private Boolean perUriPath;

    @JsonProperty("rate_limiter")
    private RateLimiter rateLimiter;



    /**
     * This is the getter method this will return the attribute value.
     * The action to take when the rate limit has been reached.
     * Field introduced in 18.2.9.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return action
     */
    public RateLimiterAction getAction() {
        return action;
    }

    /**
     * This is the setter method to the attribute.
     * The action to take when the rate limit has been reached.
     * Field introduced in 18.2.9.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param action set the action.
     */
    public void setAction(RateLimiterAction action) {
        this.action = action;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rate limiting should be done on a per client ip basis.
     * Field introduced in 18.2.9.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return perClientIp
     */
    public Boolean getPerClientIp() {
        return perClientIp;
    }

    /**
     * This is the setter method to the attribute.
     * Rate limiting should be done on a per client ip basis.
     * Field introduced in 18.2.9.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param perClientIp set the perClientIp.
     */
    public void setPerClientIp(Boolean  perClientIp) {
        this.perClientIp = perClientIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rate limiting should be done on a per request uri path basis.
     * Field introduced in 18.2.9.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return perUriPath
     */
    public Boolean getPerUriPath() {
        return perUriPath;
    }

    /**
     * This is the setter method to the attribute.
     * Rate limiting should be done on a per request uri path basis.
     * Field introduced in 18.2.9.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param perUriPath set the perUriPath.
     */
    public void setPerUriPath(Boolean  perUriPath) {
        this.perUriPath = perUriPath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The rate limiter used when this action is triggered.
     * Field introduced in 18.2.9.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rateLimiter
     */
    public RateLimiter getRateLimiter() {
        return rateLimiter;
    }

    /**
     * This is the setter method to the attribute.
     * The rate limiter used when this action is triggered.
     * Field introduced in 18.2.9.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rateLimiter set the rateLimiter.
     */
    public void setRateLimiter(RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HTTPSecurityActionRateProfile objHTTPSecurityActionRateProfile = (HTTPSecurityActionRateProfile) o;
      return   Objects.equals(this.rateLimiter, objHTTPSecurityActionRateProfile.rateLimiter)&&
  Objects.equals(this.action, objHTTPSecurityActionRateProfile.action)&&
  Objects.equals(this.perClientIp, objHTTPSecurityActionRateProfile.perClientIp)&&
  Objects.equals(this.perUriPath, objHTTPSecurityActionRateProfile.perUriPath);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HTTPSecurityActionRateProfile {\n");
                  sb.append("    action: ").append(toIndentedString(action)).append("\n");
                        sb.append("    perClientIp: ").append(toIndentedString(perClientIp)).append("\n");
                        sb.append("    perUriPath: ").append(toIndentedString(perUriPath)).append("\n");
                        sb.append("    rateLimiter: ").append(toIndentedString(rateLimiter)).append("\n");
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
