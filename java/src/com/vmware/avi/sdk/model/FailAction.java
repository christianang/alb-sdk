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
 * The FailAction is a POJO class extends AviRestResource that used for creating
 * FailAction.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FailAction  {
    @JsonProperty("local_rsp")
    private FailActionHTTPLocalResponse localRsp;

    @JsonProperty("redirect")
    private FailActionHTTPRedirect redirect;

    @JsonProperty("type")
    private String type = "FAIL_ACTION_CLOSE_CONN";



    /**
     * This is the getter method this will return the attribute value.
     * Local response to http requests when pool experiences a failure.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return localRsp
     */
    public FailActionHTTPLocalResponse getLocalRsp() {
        return localRsp;
    }

    /**
     * This is the setter method to the attribute.
     * Local response to http requests when pool experiences a failure.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param localRsp set the localRsp.
     */
    public void setLocalRsp(FailActionHTTPLocalResponse localRsp) {
        this.localRsp = localRsp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Url to redirect http requests to when pool experiences a failure.
     * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return redirect
     */
    public FailActionHTTPRedirect getRedirect() {
        return redirect;
    }

    /**
     * This is the setter method to the attribute.
     * Url to redirect http requests to when pool experiences a failure.
     * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param redirect set the redirect.
     */
    public void setRedirect(FailActionHTTPRedirect redirect) {
        this.redirect = redirect;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enables a response to client when pool experiences a failure.
     * By default tcp connection is closed.
     * Enum options - FAIL_ACTION_HTTP_REDIRECT, FAIL_ACTION_HTTP_LOCAL_RSP, FAIL_ACTION_CLOSE_CONN, FAIL_ACTION_BACKUP_POOL.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- fail_action_close_conn), basic edition(allowed values-
     * fail_action_close_conn,fail_action_http_redirect), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "FAIL_ACTION_CLOSE_CONN".
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Enables a response to client when pool experiences a failure.
     * By default tcp connection is closed.
     * Enum options - FAIL_ACTION_HTTP_REDIRECT, FAIL_ACTION_HTTP_LOCAL_RSP, FAIL_ACTION_CLOSE_CONN, FAIL_ACTION_BACKUP_POOL.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- fail_action_close_conn), basic edition(allowed values-
     * fail_action_close_conn,fail_action_http_redirect), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "FAIL_ACTION_CLOSE_CONN".
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      FailAction objFailAction = (FailAction) o;
      return   Objects.equals(this.type, objFailAction.type)&&
  Objects.equals(this.redirect, objFailAction.redirect)&&
  Objects.equals(this.localRsp, objFailAction.localRsp);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FailAction {\n");
                  sb.append("    localRsp: ").append(toIndentedString(localRsp)).append("\n");
                        sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
