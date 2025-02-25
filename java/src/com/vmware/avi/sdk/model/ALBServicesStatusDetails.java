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
 * The ALBServicesStatusDetails is a POJO class extends AviRestResource that used for creating
 * ALBServicesStatusDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ALBServicesStatusDetails  {
    @JsonProperty("connectivity")
    private String connectivity;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("registration")
    private String registration;



    /**
     * This is the getter method this will return the attribute value.
     * Connection status of the controller cluster to albservices.
     * Enum options - ALBSERVICES_CONNECTIVITY_UNKNOWN, ALBSERVICES_DISCONNECTED, ALBSERVICES_CONNECTED.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connectivity
     */
    public String getConnectivity() {
        return connectivity;
    }

    /**
     * This is the setter method to the attribute.
     * Connection status of the controller cluster to albservices.
     * Enum options - ALBSERVICES_CONNECTIVITY_UNKNOWN, ALBSERVICES_DISCONNECTED, ALBSERVICES_CONNECTED.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connectivity set the connectivity.
     */
    public void setConnectivity(String  connectivity) {
        this.connectivity = connectivity;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status change reason.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Status change reason.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Registration status of the controller cluster to albservices.
     * Enum options - ALBSERVICES_REGISTRATION_UNKNOWN, ALBSERVICES_REGISTERED, ALBSERVICES_DEREGISTERED.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return registration
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * This is the setter method to the attribute.
     * Registration status of the controller cluster to albservices.
     * Enum options - ALBSERVICES_REGISTRATION_UNKNOWN, ALBSERVICES_REGISTERED, ALBSERVICES_DEREGISTERED.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param registration set the registration.
     */
    public void setRegistration(String  registration) {
        this.registration = registration;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ALBServicesStatusDetails objALBServicesStatusDetails = (ALBServicesStatusDetails) o;
      return   Objects.equals(this.registration, objALBServicesStatusDetails.registration)&&
  Objects.equals(this.connectivity, objALBServicesStatusDetails.connectivity)&&
  Objects.equals(this.reason, objALBServicesStatusDetails.reason);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ALBServicesStatusDetails {\n");
                  sb.append("    connectivity: ").append(toIndentedString(connectivity)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
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
