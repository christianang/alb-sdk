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
 * The ClusterNodeRemoveEvent is a POJO class extends AviRestResource that used for creating
 * ClusterNodeRemoveEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterNodeRemoveEvent  {
    @JsonProperty("ip")
    private IpAddr ip;

    @JsonProperty("node_name")
    private String nodeName;

    @JsonProperty("role")
    private String role;



    /**
     * This is the getter method this will return the attribute value.
     * Ip address of the controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public IpAddr getIp() {
        return ip;
    }

    /**
     * This is the setter method to the attribute.
     * Ip address of the controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip set the ip.
     */
    public void setIp(IpAddr ip) {
        this.ip = ip;
    }

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
     * Role of the node when it left the controller cluster.
     * Enum options - CLUSTER_LEADER, CLUSTER_FOLLOWER.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * This is the setter method to the attribute.
     * Role of the node when it left the controller cluster.
     * Enum options - CLUSTER_LEADER, CLUSTER_FOLLOWER.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param role set the role.
     */
    public void setRole(String  role) {
        this.role = role;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ClusterNodeRemoveEvent objClusterNodeRemoveEvent = (ClusterNodeRemoveEvent) o;
      return   Objects.equals(this.nodeName, objClusterNodeRemoveEvent.nodeName)&&
  Objects.equals(this.ip, objClusterNodeRemoveEvent.ip)&&
  Objects.equals(this.role, objClusterNodeRemoveEvent.role);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ClusterNodeRemoveEvent {\n");
                  sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
                        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
