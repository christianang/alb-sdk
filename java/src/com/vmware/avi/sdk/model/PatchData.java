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
 * The PatchData is a POJO class extends AviRestResource that used for creating
 * PatchData.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatchData  {
    @JsonProperty("patch_image_path")
    private String patchImagePath;

    @JsonProperty("patch_image_ref")
    private String patchImageRef;

    @JsonProperty("patch_version")
    private String patchVersion;



    /**
     * This is the getter method this will return the attribute value.
     * Image path of current patch image.
     * Field introduced in 18.2.10, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return patchImagePath
     */
    public String getPatchImagePath() {
        return patchImagePath;
    }

    /**
     * This is the setter method to the attribute.
     * Image path of current patch image.
     * Field introduced in 18.2.10, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param patchImagePath set the patchImagePath.
     */
    public void setPatchImagePath(String  patchImagePath) {
        this.patchImagePath = patchImagePath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Image uuid for identifying the patch.
     * It is a reference to an object of type image.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return patchImageRef
     */
    public String getPatchImageRef() {
        return patchImageRef;
    }

    /**
     * This is the setter method to the attribute.
     * Image uuid for identifying the patch.
     * It is a reference to an object of type image.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param patchImageRef set the patchImageRef.
     */
    public void setPatchImageRef(String  patchImageRef) {
        this.patchImageRef = patchImageRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Patch version.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return patchVersion
     */
    public String getPatchVersion() {
        return patchVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Patch version.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param patchVersion set the patchVersion.
     */
    public void setPatchVersion(String  patchVersion) {
        this.patchVersion = patchVersion;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PatchData objPatchData = (PatchData) o;
      return   Objects.equals(this.patchVersion, objPatchData.patchVersion)&&
  Objects.equals(this.patchImageRef, objPatchData.patchImageRef)&&
  Objects.equals(this.patchImagePath, objPatchData.patchImagePath);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PatchData {\n");
                  sb.append("    patchImagePath: ").append(toIndentedString(patchImagePath)).append("\n");
                        sb.append("    patchImageRef: ").append(toIndentedString(patchImageRef)).append("\n");
                        sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
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
