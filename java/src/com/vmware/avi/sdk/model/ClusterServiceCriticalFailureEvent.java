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
 * The ClusterServiceCriticalFailureEvent is a POJO class extends AviRestResource that used for creating
 * ClusterServiceCriticalFailureEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterServiceCriticalFailureEvent  {
    @JsonProperty("node_name")
    private String nodeName;

    @JsonProperty("service_name")
    private String serviceName;



    /**
     * This is the getter method this will return the attribute value.
     * Name of controller node.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of controller node.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nodeName set the nodeName.
     */
    public void setNodeName(String  nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the controller service.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the controller service.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceName set the serviceName.
     */
    public void setServiceName(String  serviceName) {
        this.serviceName = serviceName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ClusterServiceCriticalFailureEvent objClusterServiceCriticalFailureEvent = (ClusterServiceCriticalFailureEvent) o;
      return   Objects.equals(this.serviceName, objClusterServiceCriticalFailureEvent.serviceName)&&
  Objects.equals(this.nodeName, objClusterServiceCriticalFailureEvent.nodeName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ClusterServiceCriticalFailureEvent {\n");
                  sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
                        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
