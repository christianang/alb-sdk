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
 * The SeVersion is a POJO class extends AviRestResource that used for creating
 * SeVersion.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeVersion  {
    @JsonProperty("fips_mode")
    private Boolean fipsMode;

    @JsonProperty("name")
    private String name;

    @JsonProperty("patch")
    private String patch;

    @JsonProperty("version")
    private String version;



    /**
     * This is the getter method this will return the attribute value.
     * Fips mode for service engine.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fipsMode
     */
    public Boolean getFipsMode() {
        return fipsMode;
    }

    /**
     * This is the setter method to the attribute.
     * Fips mode for service engine.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fipsMode set the fipsMode.
     */
    public void setFipsMode(Boolean  fipsMode) {
        this.fipsMode = fipsMode;
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
     * Patch level for service engine.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return patch
     */
    public String getPatch() {
        return patch;
    }

    /**
     * This is the setter method to the attribute.
     * Patch level for service engine.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param patch set the patch.
     */
    public void setPatch(String  patch) {
        this.patch = patch;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param version set the version.
     */
    public void setVersion(String  version) {
        this.version = version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeVersion objSeVersion = (SeVersion) o;
      return   Objects.equals(this.name, objSeVersion.name)&&
  Objects.equals(this.version, objSeVersion.version)&&
  Objects.equals(this.patch, objSeVersion.patch)&&
  Objects.equals(this.fipsMode, objSeVersion.fipsMode);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeVersion {\n");
                  sb.append("    fipsMode: ").append(toIndentedString(fipsMode)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
                        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
