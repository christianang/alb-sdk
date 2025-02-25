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
 * The GCPNetworkConfig is a POJO class extends AviRestResource that used for creating
 * GCPNetworkConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GCPNetworkConfig  {
    @JsonProperty("config")
    private String config;

    @JsonProperty("inband")
    private GCPInBandManagement inband;

    @JsonProperty("one_arm")
    private GCPOneArmMode oneArm;

    @JsonProperty("two_arm")
    private GCPTwoArmMode twoArm;



    /**
     * This is the getter method this will return the attribute value.
     * Config mode for google cloud network configuration.
     * Enum options - INBAND_MANAGEMENT, ONE_ARM_MODE, TWO_ARM_MODE.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return config
     */
    public String getConfig() {
        return config;
    }

    /**
     * This is the setter method to the attribute.
     * Config mode for google cloud network configuration.
     * Enum options - INBAND_MANAGEMENT, ONE_ARM_MODE, TWO_ARM_MODE.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param config set the config.
     */
    public void setConfig(String  config) {
        this.config = config;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure inband management as google cloud network configuration.
     * In this configuration the data network and management network for service engines will be same.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return inband
     */
    public GCPInBandManagement getInband() {
        return inband;
    }

    /**
     * This is the setter method to the attribute.
     * Configure inband management as google cloud network configuration.
     * In this configuration the data network and management network for service engines will be same.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param inband set the inband.
     */
    public void setInband(GCPInBandManagement inband) {
        this.inband = inband;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure one arm mode as google cloud network configuration.
     * In this configuration the data network and the management network for the service engines will be separated.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oneArm
     */
    public GCPOneArmMode getOneArm() {
        return oneArm;
    }

    /**
     * This is the setter method to the attribute.
     * Configure one arm mode as google cloud network configuration.
     * In this configuration the data network and the management network for the service engines will be separated.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param oneArm set the oneArm.
     */
    public void setOneArm(GCPOneArmMode oneArm) {
        this.oneArm = oneArm;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure two arm mode as google cloud network configuration.
     * In this configuration the frontend data network, backend data network and the management network for the service engines will be separated.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return twoArm
     */
    public GCPTwoArmMode getTwoArm() {
        return twoArm;
    }

    /**
     * This is the setter method to the attribute.
     * Configure two arm mode as google cloud network configuration.
     * In this configuration the frontend data network, backend data network and the management network for the service engines will be separated.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param twoArm set the twoArm.
     */
    public void setTwoArm(GCPTwoArmMode twoArm) {
        this.twoArm = twoArm;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GCPNetworkConfig objGCPNetworkConfig = (GCPNetworkConfig) o;
      return   Objects.equals(this.config, objGCPNetworkConfig.config)&&
  Objects.equals(this.inband, objGCPNetworkConfig.inband)&&
  Objects.equals(this.oneArm, objGCPNetworkConfig.oneArm)&&
  Objects.equals(this.twoArm, objGCPNetworkConfig.twoArm);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GCPNetworkConfig {\n");
                  sb.append("    config: ").append(toIndentedString(config)).append("\n");
                        sb.append("    inband: ").append(toIndentedString(inband)).append("\n");
                        sb.append("    oneArm: ").append(toIndentedString(oneArm)).append("\n");
                        sb.append("    twoArm: ").append(toIndentedString(twoArm)).append("\n");
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
