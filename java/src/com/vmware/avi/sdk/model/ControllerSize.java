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
 * The ControllerSize is a POJO class extends AviRestResource that used for creating
 * ControllerSize.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerSize  {
    @JsonProperty("flavor")
    private String flavor;

    @JsonProperty("min_cpus")
    private Integer minCpus;

    @JsonProperty("min_memory")
    private Integer minMemory;



    /**
     * This is the getter method this will return the attribute value.
     * Controller flavor (e/s/m/l) for this controller size.
     * Enum options - CONTROLLER_ESSENTIALS, CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * This is the setter method to the attribute.
     * Controller flavor (e/s/m/l) for this controller size.
     * Enum options - CONTROLLER_ESSENTIALS, CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param flavor set the flavor.
     */
    public void setFlavor(String  flavor) {
        this.flavor = flavor;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum number of cpu cores required.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minCpus
     */
    public Integer getMinCpus() {
        return minCpus;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum number of cpu cores required.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minCpus set the minCpus.
     */
    public void setMinCpus(Integer  minCpus) {
        this.minCpus = minCpus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum memory required.
     * Field introduced in 20.1.1.
     * Unit is gb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minMemory
     */
    public Integer getMinMemory() {
        return minMemory;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum memory required.
     * Field introduced in 20.1.1.
     * Unit is gb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minMemory set the minMemory.
     */
    public void setMinMemory(Integer  minMemory) {
        this.minMemory = minMemory;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ControllerSize objControllerSize = (ControllerSize) o;
      return   Objects.equals(this.flavor, objControllerSize.flavor)&&
  Objects.equals(this.minCpus, objControllerSize.minCpus)&&
  Objects.equals(this.minMemory, objControllerSize.minMemory);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControllerSize {\n");
                  sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
                        sb.append("    minCpus: ").append(toIndentedString(minCpus)).append("\n");
                        sb.append("    minMemory: ").append(toIndentedString(minMemory)).append("\n");
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
