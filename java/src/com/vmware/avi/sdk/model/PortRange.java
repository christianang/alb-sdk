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
 * The PortRange is a POJO class extends AviRestResource that used for creating
 * PortRange.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortRange  {
    @JsonProperty("end")
    private Integer end;

    @JsonProperty("start")
    private Integer start;



    /**
     * This is the getter method this will return the attribute value.
     * Tcp/udp port range end (inclusive).
     * Allowed values are 1-65535.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return end
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp/udp port range end (inclusive).
     * Allowed values are 1-65535.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param end set the end.
     */
    public void setEnd(Integer  end) {
        this.end = end;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tcp/udp port range start (inclusive).
     * Allowed values are 1-65535.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp/udp port range start (inclusive).
     * Allowed values are 1-65535.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param start set the start.
     */
    public void setStart(Integer  start) {
        this.start = start;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PortRange objPortRange = (PortRange) o;
      return   Objects.equals(this.start, objPortRange.start)&&
  Objects.equals(this.end, objPortRange.end);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PortRange {\n");
                  sb.append("    end: ").append(toIndentedString(end)).append("\n");
                        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
