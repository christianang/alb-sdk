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
 * The OpenStackLbProvAuditCheck is a POJO class extends AviRestResource that used for creating
 * OpenStackLbProvAuditCheck.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenStackLbProvAuditCheck  {
    @JsonProperty("cc_id")
    private String ccId;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("elapsed")
    private Integer elapsed;

    @JsonProperty("id")
    private String id;

    @JsonProperty("result")
    private String result;

    @JsonProperty("tenant")
    private String tenant;

    @JsonProperty("user")
    private String user;



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
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param detail set the detail.
     */
    public void setDetail(String  detail) {
        this.detail = detail;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return elapsed
     */
    public Integer getElapsed() {
        return elapsed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param elapsed set the elapsed.
     */
    public void setElapsed(Integer  elapsed) {
        this.elapsed = elapsed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param id set the id.
     */
    public void setId(String  id) {
        this.id = id;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param result set the result.
     */
    public void setResult(String  result) {
        this.result = result;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenant
     */
    public String getTenant() {
        return tenant;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenant set the tenant.
     */
    public void setTenant(String  tenant) {
        this.tenant = tenant;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param user set the user.
     */
    public void setUser(String  user) {
        this.user = user;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OpenStackLbProvAuditCheck objOpenStackLbProvAuditCheck = (OpenStackLbProvAuditCheck) o;
      return   Objects.equals(this.ccId, objOpenStackLbProvAuditCheck.ccId)&&
  Objects.equals(this.id, objOpenStackLbProvAuditCheck.id)&&
  Objects.equals(this.tenant, objOpenStackLbProvAuditCheck.tenant)&&
  Objects.equals(this.user, objOpenStackLbProvAuditCheck.user)&&
  Objects.equals(this.result, objOpenStackLbProvAuditCheck.result)&&
  Objects.equals(this.detail, objOpenStackLbProvAuditCheck.detail)&&
  Objects.equals(this.elapsed, objOpenStackLbProvAuditCheck.elapsed);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OpenStackLbProvAuditCheck {\n");
                  sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
                        sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
                        sb.append("    id: ").append(toIndentedString(id)).append("\n");
                        sb.append("    result: ").append(toIndentedString(result)).append("\n");
                        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
                        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
