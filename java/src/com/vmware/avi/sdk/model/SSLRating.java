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
 * The SSLRating is a POJO class extends AviRestResource that used for creating
 * SSLRating.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSLRating  {
    @JsonProperty("compatibility_rating")
    private String compatibilityRating;

    @JsonProperty("performance_rating")
    private String performanceRating;

    @JsonProperty("security_score")
    private String securityScore;



    /**
     * This is the getter method this will return the attribute value.
     * Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return compatibilityRating
     */
    public String getCompatibilityRating() {
        return compatibilityRating;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param compatibilityRating set the compatibilityRating.
     */
    public void setCompatibilityRating(String  compatibilityRating) {
        this.compatibilityRating = compatibilityRating;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return performanceRating
     */
    public String getPerformanceRating() {
        return performanceRating;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param performanceRating set the performanceRating.
     */
    public void setPerformanceRating(String  performanceRating) {
        this.performanceRating = performanceRating;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return securityScore
     */
    public String getSecurityScore() {
        return securityScore;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param securityScore set the securityScore.
     */
    public void setSecurityScore(String  securityScore) {
        this.securityScore = securityScore;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SSLRating objSSLRating = (SSLRating) o;
      return   Objects.equals(this.securityScore, objSSLRating.securityScore)&&
  Objects.equals(this.performanceRating, objSSLRating.performanceRating)&&
  Objects.equals(this.compatibilityRating, objSSLRating.compatibilityRating);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SSLRating {\n");
                  sb.append("    compatibilityRating: ").append(toIndentedString(compatibilityRating)).append("\n");
                        sb.append("    performanceRating: ").append(toIndentedString(performanceRating)).append("\n");
                        sb.append("    securityScore: ").append(toIndentedString(securityScore)).append("\n");
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
