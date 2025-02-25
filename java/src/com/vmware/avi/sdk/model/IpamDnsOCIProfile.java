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
 * The IpamDnsOCIProfile is a POJO class extends AviRestResource that used for creating
 * IpamDnsOCIProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpamDnsOCIProfile  {
    @JsonProperty("cloud_credentials_ref")
    private String cloudCredentialsRef;

    @JsonProperty("region")
    private String region;

    @JsonProperty("tenancy")
    private String tenancy;

    @JsonProperty("vcn_compartment_id")
    private String vcnCompartmentId;

    @JsonProperty("vcn_id")
    private String vcnId;



    /**
     * This is the getter method this will return the attribute value.
     * Credentials to access oracle cloud.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudCredentialsRef
     */
    public String getCloudCredentialsRef() {
        return cloudCredentialsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Credentials to access oracle cloud.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudCredentialsRef set the cloudCredentialsRef.
     */
    public void setCloudCredentialsRef(String  cloudCredentialsRef) {
        this.cloudCredentialsRef = cloudCredentialsRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Region in which oracle cloud resource resides.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     * This is the setter method to the attribute.
     * Region in which oracle cloud resource resides.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param region set the region.
     */
    public void setRegion(String  region) {
        this.region = region;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Oracle cloud id for tenant aka root compartment.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenancy
     */
    public String getTenancy() {
        return tenancy;
    }

    /**
     * This is the setter method to the attribute.
     * Oracle cloud id for tenant aka root compartment.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenancy set the tenancy.
     */
    public void setTenancy(String  tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Oracle cloud compartment id in which vcn resides.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcnCompartmentId
     */
    public String getVcnCompartmentId() {
        return vcnCompartmentId;
    }

    /**
     * This is the setter method to the attribute.
     * Oracle cloud compartment id in which vcn resides.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcnCompartmentId set the vcnCompartmentId.
     */
    public void setVcnCompartmentId(String  vcnCompartmentId) {
        this.vcnCompartmentId = vcnCompartmentId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Virtual cloud network id where virtual ip will belong.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcnId
     */
    public String getVcnId() {
        return vcnId;
    }

    /**
     * This is the setter method to the attribute.
     * Virtual cloud network id where virtual ip will belong.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcnId set the vcnId.
     */
    public void setVcnId(String  vcnId) {
        this.vcnId = vcnId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      IpamDnsOCIProfile objIpamDnsOCIProfile = (IpamDnsOCIProfile) o;
      return   Objects.equals(this.tenancy, objIpamDnsOCIProfile.tenancy)&&
  Objects.equals(this.region, objIpamDnsOCIProfile.region)&&
  Objects.equals(this.cloudCredentialsRef, objIpamDnsOCIProfile.cloudCredentialsRef)&&
  Objects.equals(this.vcnCompartmentId, objIpamDnsOCIProfile.vcnCompartmentId)&&
  Objects.equals(this.vcnId, objIpamDnsOCIProfile.vcnId);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IpamDnsOCIProfile {\n");
                  sb.append("    cloudCredentialsRef: ").append(toIndentedString(cloudCredentialsRef)).append("\n");
                        sb.append("    region: ").append(toIndentedString(region)).append("\n");
                        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
                        sb.append("    vcnCompartmentId: ").append(toIndentedString(vcnCompartmentId)).append("\n");
                        sb.append("    vcnId: ").append(toIndentedString(vcnId)).append("\n");
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
