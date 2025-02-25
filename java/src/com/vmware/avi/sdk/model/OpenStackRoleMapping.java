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
 * The OpenStackRoleMapping is a POJO class extends AviRestResource that used for creating
 * OpenStackRoleMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenStackRoleMapping  {
    @JsonProperty("avi_role")
    private String aviRole;

    @JsonProperty("os_role")
    private String osRole;



    /**
     * This is the getter method this will return the attribute value.
     * Role name in avi.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return aviRole
     */
    public String getAviRole() {
        return aviRole;
    }

    /**
     * This is the setter method to the attribute.
     * Role name in avi.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param aviRole set the aviRole.
     */
    public void setAviRole(String  aviRole) {
        this.aviRole = aviRole;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Role name in openstack.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return osRole
     */
    public String getOsRole() {
        return osRole;
    }

    /**
     * This is the setter method to the attribute.
     * Role name in openstack.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param osRole set the osRole.
     */
    public void setOsRole(String  osRole) {
        this.osRole = osRole;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OpenStackRoleMapping objOpenStackRoleMapping = (OpenStackRoleMapping) o;
      return   Objects.equals(this.osRole, objOpenStackRoleMapping.osRole)&&
  Objects.equals(this.aviRole, objOpenStackRoleMapping.aviRole);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OpenStackRoleMapping {\n");
                  sb.append("    aviRole: ").append(toIndentedString(aviRole)).append("\n");
                        sb.append("    osRole: ").append(toIndentedString(osRole)).append("\n");
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
