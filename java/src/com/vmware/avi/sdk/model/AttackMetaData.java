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
 * The AttackMetaData is a POJO class extends AviRestResource that used for creating
 * AttackMetaData.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttackMetaData  {
    @JsonProperty("amplification")
    private AttackDnsAmplification amplification;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("max_resp_time")
    private Integer maxRespTime;

    @JsonProperty("url")
    private String url = "url";



    /**
     * This is the getter method this will return the attribute value.
     * Dns amplification attack record.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return amplification
     */
    public AttackDnsAmplification getAmplification() {
        return amplification;
    }

    /**
     * This is the setter method to the attribute.
     * Dns amplification attack record.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param amplification set the amplification.
     */
    public void setAmplification(AttackDnsAmplification amplification) {
        this.amplification = amplification;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip set the ip.
     */
    public void setIp(String  ip) {
        this.ip = ip;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxRespTime
     */
    public Integer getMaxRespTime() {
        return maxRespTime;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxRespTime set the maxRespTime.
     */
    public void setMaxRespTime(Integer  maxRespTime) {
        this.maxRespTime = maxRespTime;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
    * Default value when not specified in API or module is interpreted by Avi Controller as null.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AttackMetaData objAttackMetaData = (AttackMetaData) o;
      return   Objects.equals(this.ip, objAttackMetaData.ip)&&
  Objects.equals(this.maxRespTime, objAttackMetaData.maxRespTime)&&
  Objects.equals(this.amplification, objAttackMetaData.amplification);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AttackMetaData {\n");
                  sb.append("    amplification: ").append(toIndentedString(amplification)).append("\n");
                        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    maxRespTime: ").append(toIndentedString(maxRespTime)).append("\n");
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
