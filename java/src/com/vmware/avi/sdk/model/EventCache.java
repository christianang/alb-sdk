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
 * The EventCache is a POJO class extends AviRestResource that used for creating
 * EventCache.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventCache  {
    @JsonProperty("dns_state")
    private Boolean dnsState;

    @JsonProperty("exceptions")
    private List<String> exceptions;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsState
     */
    public Boolean getDnsState() {
        return dnsState;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsState set the dnsState.
     */
    public void setDnsState(Boolean  dnsState) {
        this.dnsState = dnsState;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Cache the exception strings in the system.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return exceptions
     */
    public List<String> getExceptions() {
        return exceptions;
    }

    /**
     * This is the setter method. this will set the exceptions
     * Cache the exception strings in the system.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return exceptions
     */
    public void setExceptions(List<String>  exceptions) {
        this.exceptions = exceptions;
    }

    /**
     * This is the setter method this will set the exceptions
     * Cache the exception strings in the system.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return exceptions
     */
    public EventCache addExceptionsItem(String exceptionsItem) {
      if (this.exceptions == null) {
        this.exceptions = new ArrayList<String>();
      }
      this.exceptions.add(exceptionsItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      EventCache objEventCache = (EventCache) o;
      return   Objects.equals(this.dnsState, objEventCache.dnsState)&&
  Objects.equals(this.exceptions, objEventCache.exceptions);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class EventCache {\n");
                  sb.append("    dnsState: ").append(toIndentedString(dnsState)).append("\n");
                        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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
