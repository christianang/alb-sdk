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
 * The VinfraMgmtNwChangeDetails is a POJO class extends AviRestResource that used for creating
 * VinfraMgmtNwChangeDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VinfraMgmtNwChangeDetails  {
    @JsonProperty("existing_nw")
    private String existingNw;

    @JsonProperty("new_nw")
    private String newNw;

    @JsonProperty("vcenter")
    private String vcenter;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return existingNw
     */
    public String getExistingNw() {
        return existingNw;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param existingNw set the existingNw.
     */
    public void setExistingNw(String  existingNw) {
        this.existingNw = existingNw;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return newNw
     */
    public String getNewNw() {
        return newNw;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param newNw set the newNw.
     */
    public void setNewNw(String  newNw) {
        this.newNw = newNw;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenter
     */
    public String getVcenter() {
        return vcenter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenter set the vcenter.
     */
    public void setVcenter(String  vcenter) {
        this.vcenter = vcenter;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VinfraMgmtNwChangeDetails objVinfraMgmtNwChangeDetails = (VinfraMgmtNwChangeDetails) o;
      return   Objects.equals(this.vcenter, objVinfraMgmtNwChangeDetails.vcenter)&&
  Objects.equals(this.existingNw, objVinfraMgmtNwChangeDetails.existingNw)&&
  Objects.equals(this.newNw, objVinfraMgmtNwChangeDetails.newNw);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VinfraMgmtNwChangeDetails {\n");
                  sb.append("    existingNw: ").append(toIndentedString(existingNw)).append("\n");
                        sb.append("    newNw: ").append(toIndentedString(newNw)).append("\n");
                        sb.append("    vcenter: ").append(toIndentedString(vcenter)).append("\n");
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
