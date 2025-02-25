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
 * The AzureClusterInfo is a POJO class extends AviRestResource that used for creating
 * AzureClusterInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AzureClusterInfo  {
    @JsonProperty("cloud_credential_ref")
    private String cloudCredentialRef;

    @JsonProperty("subscription_id")
    private String subscriptionId;



    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudCredentialRef
     */
    public String getCloudCredentialRef() {
        return cloudCredentialRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudCredentialRef set the cloudCredentialRef.
     */
    public void setCloudCredentialRef(String  cloudCredentialRef) {
        this.cloudCredentialRef = cloudCredentialRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subscriptionId set the subscriptionId.
     */
    public void setSubscriptionId(String  subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AzureClusterInfo objAzureClusterInfo = (AzureClusterInfo) o;
      return   Objects.equals(this.subscriptionId, objAzureClusterInfo.subscriptionId)&&
  Objects.equals(this.cloudCredentialRef, objAzureClusterInfo.cloudCredentialRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AzureClusterInfo {\n");
                  sb.append("    cloudCredentialRef: ").append(toIndentedString(cloudCredentialRef)).append("\n");
                        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
