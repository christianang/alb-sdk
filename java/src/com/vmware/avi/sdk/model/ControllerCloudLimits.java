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
 * The ControllerCloudLimits is a POJO class extends AviRestResource that used for creating
 * ControllerCloudLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerCloudLimits  {
    @JsonProperty("num_clouds")
    private Integer numClouds;

    @JsonProperty("t1_lrs_per_cloud")
    private Integer t1LrsPerCloud;

    @JsonProperty("type")
    private String type;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of clouds of a given type.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numClouds
     */
    public Integer getNumClouds() {
        return numClouds;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of clouds of a given type.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numClouds set the numClouds.
     */
    public void setNumClouds(Integer  numClouds) {
        this.numClouds = numClouds;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of tier1 logical routers allowed per cloud.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return t1LrsPerCloud
     */
    public Integer getT1LrsPerCloud() {
        return t1LrsPerCloud;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of tier1 logical routers allowed per cloud.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param t1LrsPerCloud set the t1LrsPerCloud.
     */
    public void setT1LrsPerCloud(Integer  t1LrsPerCloud) {
        this.t1LrsPerCloud = t1LrsPerCloud;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cloud type for the limit.
     * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
     * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Cloud type for the limit.
     * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
     * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ControllerCloudLimits objControllerCloudLimits = (ControllerCloudLimits) o;
      return   Objects.equals(this.type, objControllerCloudLimits.type)&&
  Objects.equals(this.numClouds, objControllerCloudLimits.numClouds)&&
  Objects.equals(this.t1LrsPerCloud, objControllerCloudLimits.t1LrsPerCloud);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControllerCloudLimits {\n");
                  sb.append("    numClouds: ").append(toIndentedString(numClouds)).append("\n");
                        sb.append("    t1LrsPerCloud: ").append(toIndentedString(t1LrsPerCloud)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
