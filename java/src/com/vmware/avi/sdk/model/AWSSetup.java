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
 * The AWSSetup is a POJO class extends AviRestResource that used for creating
 * AWSSetup.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AWSSetup  {
    @JsonProperty("access_key_id")
    private String accessKeyId;

    @JsonProperty("cc_id")
    private String ccId;

    @JsonProperty("error_string")
    private String errorString;

    @JsonProperty("privilege")
    private String privilege;

    @JsonProperty("region")
    private String region;

    @JsonProperty("vpc_id")
    private String vpcId;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param accessKeyId set the accessKeyId.
     */
    public void setAccessKeyId(String  accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccId
     */
    public String getCcId() {
        return ccId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccId set the ccId.
     */
    public void setCcId(String  ccId) {
        this.ccId = ccId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param privilege set the privilege.
     */
    public void setPrivilege(String  privilege) {
        this.privilege = privilege;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param region set the region.
     */
    public void setRegion(String  region) {
        this.region = region;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vpcId set the vpcId.
     */
    public void setVpcId(String  vpcId) {
        this.vpcId = vpcId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AWSSetup objAWSSetup = (AWSSetup) o;
      return   Objects.equals(this.ccId, objAWSSetup.ccId)&&
  Objects.equals(this.region, objAWSSetup.region)&&
  Objects.equals(this.accessKeyId, objAWSSetup.accessKeyId)&&
  Objects.equals(this.privilege, objAWSSetup.privilege)&&
  Objects.equals(this.errorString, objAWSSetup.errorString)&&
  Objects.equals(this.vpcId, objAWSSetup.vpcId);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AWSSetup {\n");
                  sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
                        sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
                        sb.append("    region: ").append(toIndentedString(region)).append("\n");
                        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
