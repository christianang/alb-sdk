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
 * The CloudTenantCleanup is a POJO class extends AviRestResource that used for creating
 * CloudTenantCleanup.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CloudTenantCleanup  {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("num_ports")
    private Integer numPorts;

    @JsonProperty("num_se")
    private Integer numSe;

    @JsonProperty("num_secgrp")
    private Integer numSecgrp;

    @JsonProperty("num_svrgrp")
    private Integer numSvrgrp;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param id set the id.
     */
    public void setId(String  id) {
        this.id = id;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numPorts
     */
    public Integer getNumPorts() {
        return numPorts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numPorts set the numPorts.
     */
    public void setNumPorts(Integer  numPorts) {
        this.numPorts = numPorts;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSe
     */
    public Integer getNumSe() {
        return numSe;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSe set the numSe.
     */
    public void setNumSe(Integer  numSe) {
        this.numSe = numSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSecgrp
     */
    public Integer getNumSecgrp() {
        return numSecgrp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSecgrp set the numSecgrp.
     */
    public void setNumSecgrp(Integer  numSecgrp) {
        this.numSecgrp = numSecgrp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSvrgrp
     */
    public Integer getNumSvrgrp() {
        return numSvrgrp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSvrgrp set the numSvrgrp.
     */
    public void setNumSvrgrp(Integer  numSvrgrp) {
        this.numSvrgrp = numSvrgrp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CloudTenantCleanup objCloudTenantCleanup = (CloudTenantCleanup) o;
      return   Objects.equals(this.id, objCloudTenantCleanup.id)&&
  Objects.equals(this.name, objCloudTenantCleanup.name)&&
  Objects.equals(this.numSe, objCloudTenantCleanup.numSe)&&
  Objects.equals(this.numSvrgrp, objCloudTenantCleanup.numSvrgrp)&&
  Objects.equals(this.numSecgrp, objCloudTenantCleanup.numSecgrp)&&
  Objects.equals(this.numPorts, objCloudTenantCleanup.numPorts);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CloudTenantCleanup {\n");
                  sb.append("    id: ").append(toIndentedString(id)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    numPorts: ").append(toIndentedString(numPorts)).append("\n");
                        sb.append("    numSe: ").append(toIndentedString(numSe)).append("\n");
                        sb.append("    numSecgrp: ").append(toIndentedString(numSecgrp)).append("\n");
                        sb.append("    numSvrgrp: ").append(toIndentedString(numSvrgrp)).append("\n");
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
