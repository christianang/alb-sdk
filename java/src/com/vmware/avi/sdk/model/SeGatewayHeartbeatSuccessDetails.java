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
 * The SeGatewayHeartbeatSuccessDetails is a POJO class extends AviRestResource that used for creating
 * SeGatewayHeartbeatSuccessDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeGatewayHeartbeatSuccessDetails  {
    @JsonProperty("gateway_ip")
    private String gatewayIp;

    @JsonProperty("vrf_name")
    private String vrfName;

    @JsonProperty("vrf_uuid")
    private String vrfUuid;



    /**
     * This is the getter method this will return the attribute value.
     * Ip address of gateway monitored.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    /**
     * This is the setter method to the attribute.
     * Ip address of gateway monitored.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gatewayIp set the gatewayIp.
     */
    public void setGatewayIp(String  gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of virtual routing context in which this gateway is present.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vrfName
     */
    public String getVrfName() {
        return vrfName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of virtual routing context in which this gateway is present.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vrfName set the vrfName.
     */
    public void setVrfName(String  vrfName) {
        this.vrfName = vrfName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the virtual routing context in which this gateway is present.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vrfUuid
     */
    public String getVrfUuid() {
        return vrfUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the virtual routing context in which this gateway is present.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vrfUuid set the vrfUuid.
     */
    public void setVrfUuid(String  vrfUuid) {
        this.vrfUuid = vrfUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeGatewayHeartbeatSuccessDetails objSeGatewayHeartbeatSuccessDetails = (SeGatewayHeartbeatSuccessDetails) o;
      return   Objects.equals(this.gatewayIp, objSeGatewayHeartbeatSuccessDetails.gatewayIp)&&
  Objects.equals(this.vrfName, objSeGatewayHeartbeatSuccessDetails.vrfName)&&
  Objects.equals(this.vrfUuid, objSeGatewayHeartbeatSuccessDetails.vrfUuid);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeGatewayHeartbeatSuccessDetails {\n");
                  sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
                        sb.append("    vrfName: ").append(toIndentedString(vrfName)).append("\n");
                        sb.append("    vrfUuid: ").append(toIndentedString(vrfUuid)).append("\n");
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
