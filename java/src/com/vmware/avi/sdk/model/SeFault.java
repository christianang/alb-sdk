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
 * The SeFault is a POJO class extends AviRestResource that used for creating
 * SeFault.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeFault  {
    @JsonProperty("arg")
    private Integer arg;

    @JsonProperty("fault_name")
    private String faultName;

    @JsonProperty("function_name")
    private String functionName;

    @JsonProperty("num_executions")
    private Integer numExecutions = 1;

    @JsonProperty("num_skips")
    private Integer numSkips = 0;



    /**
     * This is the getter method this will return the attribute value.
     * Optional 64 bit unsigned integer that can be used within the enabled fault.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return arg
     */
    public Integer getArg() {
        return arg;
    }

    /**
     * This is the setter method to the attribute.
     * Optional 64 bit unsigned integer that can be used within the enabled fault.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param arg set the arg.
     */
    public void setArg(Integer  arg) {
        this.arg = arg;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the target fault.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return faultName
     */
    public String getFaultName() {
        return faultName;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the target fault.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param faultName set the faultName.
     */
    public void setFaultName(String  faultName) {
        this.faultName = faultName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the function that contains the target fault.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return functionName
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the function that contains the target fault.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param functionName set the functionName.
     */
    public void setFunctionName(String  functionName) {
        this.functionName = functionName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of times the fault should be executed.
     * Allowed values are 1-4294967295.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return numExecutions
     */
    public Integer getNumExecutions() {
        return numExecutions;
    }

    /**
     * This is the setter method to the attribute.
     * Number of times the fault should be executed.
     * Allowed values are 1-4294967295.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param numExecutions set the numExecutions.
     */
    public void setNumExecutions(Integer  numExecutions) {
        this.numExecutions = numExecutions;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of times the fault should be skipped before executing.
     * Field introduced in 18.2.9.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return numSkips
     */
    public Integer getNumSkips() {
        return numSkips;
    }

    /**
     * This is the setter method to the attribute.
     * Number of times the fault should be skipped before executing.
     * Field introduced in 18.2.9.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param numSkips set the numSkips.
     */
    public void setNumSkips(Integer  numSkips) {
        this.numSkips = numSkips;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeFault objSeFault = (SeFault) o;
      return   Objects.equals(this.faultName, objSeFault.faultName)&&
  Objects.equals(this.functionName, objSeFault.functionName)&&
  Objects.equals(this.numExecutions, objSeFault.numExecutions)&&
  Objects.equals(this.arg, objSeFault.arg)&&
  Objects.equals(this.numSkips, objSeFault.numSkips);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeFault {\n");
                  sb.append("    arg: ").append(toIndentedString(arg)).append("\n");
                        sb.append("    faultName: ").append(toIndentedString(faultName)).append("\n");
                        sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
                        sb.append("    numExecutions: ").append(toIndentedString(numExecutions)).append("\n");
                        sb.append("    numSkips: ").append(toIndentedString(numSkips)).append("\n");
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
