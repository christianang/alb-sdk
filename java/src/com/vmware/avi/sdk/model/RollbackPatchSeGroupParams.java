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
 * The RollbackPatchSeGroupParams is a POJO class extends AviRestResource that used for creating
 * RollbackPatchSeGroupParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RollbackPatchSeGroupParams  {
    @JsonProperty("prechecks_only")
    private Boolean prechecksOnly = false;

    @JsonProperty("se_group_options")
    private SeGroupOptions seGroupOptions;

    @JsonProperty("se_group_refs")
    private List<String> seGroupRefs;

    @JsonProperty("skip_warnings")
    private Boolean skipWarnings = false;



    /**
     * This is the getter method this will return the attribute value.
     * This flag is set to run the pre-checks without the subsequent upgrade operations.
     * Field introduced in 22.1.6, 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return prechecksOnly
     */
    public Boolean getPrechecksOnly() {
        return prechecksOnly;
    }

    /**
     * This is the setter method to the attribute.
     * This flag is set to run the pre-checks without the subsequent upgrade operations.
     * Field introduced in 22.1.6, 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param prechecksOnly set the prechecksOnly.
     */
    public void setPrechecksOnly(Boolean  prechecksOnly) {
        this.prechecksOnly = prechecksOnly;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field identifies se group options that need to be applied during the rollback operations.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupOptions
     */
    public SeGroupOptions getSeGroupOptions() {
        return seGroupOptions;
    }

    /**
     * This is the setter method to the attribute.
     * This field identifies se group options that need to be applied during the rollback operations.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroupOptions set the seGroupOptions.
     */
    public void setSeGroupOptions(SeGroupOptions seGroupOptions) {
        this.seGroupOptions = seGroupOptions;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Se group uuids for applying rollback patch operations.
     * It is a reference to an object of type serviceenginegroup.
     * Field introduced in 18.2.6.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupRefs
     */
    public List<String> getSeGroupRefs() {
        return seGroupRefs;
    }

    /**
     * This is the setter method. this will set the seGroupRefs
     * Se group uuids for applying rollback patch operations.
     * It is a reference to an object of type serviceenginegroup.
     * Field introduced in 18.2.6.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupRefs
     */
    public void setSeGroupRefs(List<String>  seGroupRefs) {
        this.seGroupRefs = seGroupRefs;
    }

    /**
     * This is the setter method this will set the seGroupRefs
     * Se group uuids for applying rollback patch operations.
     * It is a reference to an object of type serviceenginegroup.
     * Field introduced in 18.2.6.
     * Minimum of 1 items required.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupRefs
     */
    public RollbackPatchSeGroupParams addSeGroupRefsItem(String seGroupRefsItem) {
      if (this.seGroupRefs == null) {
        this.seGroupRefs = new ArrayList<String>();
      }
      this.seGroupRefs.add(seGroupRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This is flag when set as true skips few optional must checks.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return skipWarnings
     */
    public Boolean getSkipWarnings() {
        return skipWarnings;
    }

    /**
     * This is the setter method to the attribute.
     * This is flag when set as true skips few optional must checks.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param skipWarnings set the skipWarnings.
     */
    public void setSkipWarnings(Boolean  skipWarnings) {
        this.skipWarnings = skipWarnings;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RollbackPatchSeGroupParams objRollbackPatchSeGroupParams = (RollbackPatchSeGroupParams) o;
      return   Objects.equals(this.seGroupRefs, objRollbackPatchSeGroupParams.seGroupRefs)&&
  Objects.equals(this.skipWarnings, objRollbackPatchSeGroupParams.skipWarnings)&&
  Objects.equals(this.seGroupOptions, objRollbackPatchSeGroupParams.seGroupOptions)&&
  Objects.equals(this.prechecksOnly, objRollbackPatchSeGroupParams.prechecksOnly);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RollbackPatchSeGroupParams {\n");
                  sb.append("    prechecksOnly: ").append(toIndentedString(prechecksOnly)).append("\n");
                        sb.append("    seGroupOptions: ").append(toIndentedString(seGroupOptions)).append("\n");
                        sb.append("    seGroupRefs: ").append(toIndentedString(seGroupRefs)).append("\n");
                        sb.append("    skipWarnings: ").append(toIndentedString(skipWarnings)).append("\n");
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
