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
 * The StateCacheMgrDebugFilter is a POJO class extends AviRestResource that used for creating
 * StateCacheMgrDebugFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StateCacheMgrDebugFilter  {
    @JsonProperty("pool_ref")
    private String poolRef;

    @JsonProperty("vs_ref")
    private String vsRef;



    /**
     * This is the getter method this will return the attribute value.
     * Pool uuid.
     * It is a reference to an object of type pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolRef
     */
    public String getPoolRef() {
        return poolRef;
    }

    /**
     * This is the setter method to the attribute.
     * Pool uuid.
     * It is a reference to an object of type pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolRef set the poolRef.
     */
    public void setPoolRef(String  poolRef) {
        this.poolRef = poolRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Virtualservice uuid.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsRef
     */
    public String getVsRef() {
        return vsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Virtualservice uuid.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsRef set the vsRef.
     */
    public void setVsRef(String  vsRef) {
        this.vsRef = vsRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      StateCacheMgrDebugFilter objStateCacheMgrDebugFilter = (StateCacheMgrDebugFilter) o;
      return   Objects.equals(this.vsRef, objStateCacheMgrDebugFilter.vsRef)&&
  Objects.equals(this.poolRef, objStateCacheMgrDebugFilter.poolRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class StateCacheMgrDebugFilter {\n");
                  sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
                        sb.append("    vsRef: ").append(toIndentedString(vsRef)).append("\n");
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
