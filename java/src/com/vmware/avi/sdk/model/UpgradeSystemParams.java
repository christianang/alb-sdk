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
 * The UpgradeSystemParams is a POJO class extends AviRestResource that used for creating
 * UpgradeSystemParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpgradeSystemParams  {
    @JsonProperty("controller_patch_ref")
    private String controllerPatchRef;

    @JsonProperty("image_ref")
    private String imageRef;

    @JsonProperty("prechecks_only")
    private Boolean prechecksOnly = false;

    @JsonProperty("se_group_options")
    private SeGroupOptions seGroupOptions;

    @JsonProperty("se_patch_ref")
    private String sePatchRef;

    @JsonProperty("skip_warnings")
    private Boolean skipWarnings = false;



    /**
     * This is the getter method this will return the attribute value.
     * Image uuid for identifying the controller patch image.
     * It is a reference to an object of type image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerPatchRef
     */
    public String getControllerPatchRef() {
        return controllerPatchRef;
    }

    /**
     * This is the setter method to the attribute.
     * Image uuid for identifying the controller patch image.
     * It is a reference to an object of type image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerPatchRef set the controllerPatchRef.
     */
    public void setControllerPatchRef(String  controllerPatchRef) {
        this.controllerPatchRef = controllerPatchRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Image uuid for identifying base image.
     * It is a reference to an object of type image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return imageRef
     */
    public String getImageRef() {
        return imageRef;
    }

    /**
     * This is the setter method to the attribute.
     * Image uuid for identifying base image.
     * It is a reference to an object of type image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param imageRef set the imageRef.
     */
    public void setImageRef(String  imageRef) {
        this.imageRef = imageRef;
    }

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
     * Se group options for the upgrade operations.
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
     * Se group options for the upgrade operations.
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
     * Image uuid for identifying the se patch image.
     * It is a reference to an object of type image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sePatchRef
     */
    public String getSePatchRef() {
        return sePatchRef;
    }

    /**
     * This is the setter method to the attribute.
     * Image uuid for identifying the se patch image.
     * It is a reference to an object of type image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sePatchRef set the sePatchRef.
     */
    public void setSePatchRef(String  sePatchRef) {
        this.sePatchRef = sePatchRef;
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
      UpgradeSystemParams objUpgradeSystemParams = (UpgradeSystemParams) o;
      return   Objects.equals(this.imageRef, objUpgradeSystemParams.imageRef)&&
  Objects.equals(this.controllerPatchRef, objUpgradeSystemParams.controllerPatchRef)&&
  Objects.equals(this.sePatchRef, objUpgradeSystemParams.sePatchRef)&&
  Objects.equals(this.seGroupOptions, objUpgradeSystemParams.seGroupOptions)&&
  Objects.equals(this.skipWarnings, objUpgradeSystemParams.skipWarnings)&&
  Objects.equals(this.prechecksOnly, objUpgradeSystemParams.prechecksOnly);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class UpgradeSystemParams {\n");
                  sb.append("    controllerPatchRef: ").append(toIndentedString(controllerPatchRef)).append("\n");
                        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
                        sb.append("    prechecksOnly: ").append(toIndentedString(prechecksOnly)).append("\n");
                        sb.append("    seGroupOptions: ").append(toIndentedString(seGroupOptions)).append("\n");
                        sb.append("    sePatchRef: ").append(toIndentedString(sePatchRef)).append("\n");
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
