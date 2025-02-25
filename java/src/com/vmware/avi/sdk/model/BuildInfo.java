/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The BuildInfo is a POJO class extends AviRestResource that used for creating
 * BuildInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BuildInfo  {
    @JsonProperty("build_no")
    private Integer buildNo;

    @JsonProperty("date")
    private String date;

    @JsonProperty("min_version")
    private String minVersion;

    @JsonProperty("patch_version")
    private String patchVersion;

    @JsonProperty("product")
    private String product;

    @JsonProperty("product_name")
    private String productName;

    @JsonIgnore
    private String remoteImageRef;

    @JsonProperty("tag")
    private String tag;

    @JsonProperty("version")
    private String version;



    /**
     * This is the getter method this will return the attribute value.
     * Build number for easy identification.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return buildNo
     */
    public Integer getBuildNo() {
        return buildNo;
    }

    /**
     * This is the setter method to the attribute.
     * Build number for easy identification.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param buildNo set the buildNo.
     */
    public void setBuildNo(Integer  buildNo) {
        this.buildNo = buildNo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Date when the package created.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * This is the setter method to the attribute.
     * Date when the package created.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param date set the date.
     */
    public void setDate(String  date) {
        this.date = date;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Min version of the image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Min version of the image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minVersion set the minVersion.
     */
    public void setMinVersion(String  minVersion) {
        this.minVersion = minVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Patch version of the image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return patchVersion
     */
    public String getPatchVersion() {
        return patchVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Patch version of the image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param patchVersion set the patchVersion.
     */
    public void setPatchVersion(String  patchVersion) {
        this.patchVersion = patchVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Product type.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return product
     */
    public String getProduct() {
        return product;
    }

    /**
     * This is the setter method to the attribute.
     * Product type.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param product set the product.
     */
    public void setProduct(String  product) {
        this.product = product;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Product name.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This is the setter method to the attribute.
     * Product name.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param productName set the productName.
     */
    public void setProductName(String  productName) {
        this.productName = productName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Remote reference of the container image.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return remoteImageRef
     */
    public String getRemoteImageRef() {
        return remoteImageRef;
    }

    /**
     * This is the setter method to the attribute.
     * Remote reference of the container image.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param remoteImageRef set the remoteImageRef.
     */
    public void setRemoteImageRef(String  remoteImageRef) {
        this.remoteImageRef = remoteImageRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tag related to the package.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * This is the setter method to the attribute.
     * Tag related to the package.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tag set the tag.
     */
    public void setTag(String  tag) {
        this.tag = tag;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Major version of the image.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * Major version of the image.
     * Field introduced in 18.2.6.
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
      BuildInfo objBuildInfo = (BuildInfo) o;
      return   Objects.equals(this.date, objBuildInfo.date)&&
  Objects.equals(this.tag, objBuildInfo.tag)&&
  Objects.equals(this.version, objBuildInfo.version)&&
  Objects.equals(this.buildNo, objBuildInfo.buildNo)&&
  Objects.equals(this.minVersion, objBuildInfo.minVersion)&&
  Objects.equals(this.patchVersion, objBuildInfo.patchVersion)&&
  Objects.equals(this.product, objBuildInfo.product)&&
  Objects.equals(this.productName, objBuildInfo.productName)&&
  Objects.equals(this.remoteImageRef, objBuildInfo.remoteImageRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BuildInfo {\n");
                  sb.append("    buildNo: ").append(toIndentedString(buildNo)).append("\n");
                        sb.append("    date: ").append(toIndentedString(date)).append("\n");
                        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
                        sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
                        sb.append("    product: ").append(toIndentedString(product)).append("\n");
                        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
                        sb.append("    remoteImageRef: ").append(toIndentedString(remoteImageRef)).append("\n");
                        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
