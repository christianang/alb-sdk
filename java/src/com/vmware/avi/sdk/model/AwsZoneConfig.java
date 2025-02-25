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
 * The AwsZoneConfig is a POJO class extends AviRestResource that used for creating
 * AwsZoneConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AwsZoneConfig  {
    @JsonProperty("availability_zone")
    private String availabilityZone;

    @JsonProperty("mgmt_network_name")
    private String mgmtNetworkName;

    @JsonProperty("mgmt_network_uuid")
    private String mgmtNetworkUuid;



    /**
     * This is the getter method this will return the attribute value.
     * Availability zone.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * This is the setter method to the attribute.
     * Availability zone.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param availabilityZone set the availabilityZone.
     */
    public void setAvailabilityZone(String  availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name or cidr of the network in the availability zone that will be used as management network.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtNetworkName
     */
    public String getMgmtNetworkName() {
        return mgmtNetworkName;
    }

    /**
     * This is the setter method to the attribute.
     * Name or cidr of the network in the availability zone that will be used as management network.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtNetworkName set the mgmtNetworkName.
     */
    public void setMgmtNetworkName(String  mgmtNetworkName) {
        this.mgmtNetworkName = mgmtNetworkName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the network in the availability zone that will be used as management network.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtNetworkUuid
     */
    public String getMgmtNetworkUuid() {
        return mgmtNetworkUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the network in the availability zone that will be used as management network.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtNetworkUuid set the mgmtNetworkUuid.
     */
    public void setMgmtNetworkUuid(String  mgmtNetworkUuid) {
        this.mgmtNetworkUuid = mgmtNetworkUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AwsZoneConfig objAwsZoneConfig = (AwsZoneConfig) o;
      return   Objects.equals(this.availabilityZone, objAwsZoneConfig.availabilityZone)&&
  Objects.equals(this.mgmtNetworkName, objAwsZoneConfig.mgmtNetworkName)&&
  Objects.equals(this.mgmtNetworkUuid, objAwsZoneConfig.mgmtNetworkUuid);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AwsZoneConfig {\n");
                  sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
                        sb.append("    mgmtNetworkName: ").append(toIndentedString(mgmtNetworkName)).append("\n");
                        sb.append("    mgmtNetworkUuid: ").append(toIndentedString(mgmtNetworkUuid)).append("\n");
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
