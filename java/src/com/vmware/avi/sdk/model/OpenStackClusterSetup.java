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
 * The OpenStackClusterSetup is a POJO class extends AviRestResource that used for creating
 * OpenStackClusterSetup.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenStackClusterSetup  {
    @JsonProperty("admin_tenant")
    private String adminTenant;

    @JsonProperty("auth_url")
    private String authUrl;

    @JsonProperty("cc_id")
    private String ccId;

    @JsonProperty("error_string")
    private String errorString;

    @JsonProperty("keystone_host")
    private String keystoneHost;

    @JsonProperty("privilege")
    private String privilege;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return adminTenant
     */
    public String getAdminTenant() {
        return adminTenant;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param adminTenant set the adminTenant.
     */
    public void setAdminTenant(String  adminTenant) {
        this.adminTenant = adminTenant;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authUrl
     */
    public String getAuthUrl() {
        return authUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authUrl set the authUrl.
     */
    public void setAuthUrl(String  authUrl) {
        this.authUrl = authUrl;
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return keystoneHost
     */
    public String getKeystoneHost() {
        return keystoneHost;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param keystoneHost set the keystoneHost.
     */
    public void setKeystoneHost(String  keystoneHost) {
        this.keystoneHost = keystoneHost;
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


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OpenStackClusterSetup objOpenStackClusterSetup = (OpenStackClusterSetup) o;
      return   Objects.equals(this.ccId, objOpenStackClusterSetup.ccId)&&
  Objects.equals(this.keystoneHost, objOpenStackClusterSetup.keystoneHost)&&
  Objects.equals(this.adminTenant, objOpenStackClusterSetup.adminTenant)&&
  Objects.equals(this.privilege, objOpenStackClusterSetup.privilege)&&
  Objects.equals(this.errorString, objOpenStackClusterSetup.errorString)&&
  Objects.equals(this.authUrl, objOpenStackClusterSetup.authUrl);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OpenStackClusterSetup {\n");
                  sb.append("    adminTenant: ").append(toIndentedString(adminTenant)).append("\n");
                        sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
                        sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    keystoneHost: ").append(toIndentedString(keystoneHost)).append("\n");
                        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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
