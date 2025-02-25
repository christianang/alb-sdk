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
 * The HTTPSwitchingAction is a POJO class extends AviRestResource that used for creating
 * HTTPSwitchingAction.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPSwitchingAction  {
    @JsonProperty("action")
    private String action;

    @JsonProperty("file")
    private HTTPLocalFile file;

    @JsonProperty("other_status_code")
    private Integer otherStatusCode;

    @JsonProperty("pool_group_ref")
    private String poolGroupRef;

    @JsonProperty("pool_ref")
    private String poolRef;

    @JsonProperty("server")
    private PoolServer server;

    @JsonProperty("status_code")
    private String statusCode;



    /**
     * This is the getter method this will return the attribute value.
     * Content switching action type.
     * Enum options - HTTP_SWITCHING_SELECT_POOL, HTTP_SWITCHING_SELECT_LOCAL, HTTP_SWITCHING_SELECT_POOLGROUP.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- http_switching_select_pool,http_switching_select_local), basic,
     * enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * This is the setter method to the attribute.
     * Content switching action type.
     * Enum options - HTTP_SWITCHING_SELECT_POOL, HTTP_SWITCHING_SELECT_LOCAL, HTTP_SWITCHING_SELECT_POOLGROUP.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- http_switching_select_pool,http_switching_select_local), basic,
     * enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param action set the action.
     */
    public void setAction(String  action) {
        this.action = action;
    }

    /**
     * This is the getter method this will return the attribute value.
     * File from which to serve local response to the request.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return file
     */
    public HTTPLocalFile getFile() {
        return file;
    }

    /**
     * This is the setter method to the attribute.
     * File from which to serve local response to the request.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param file set the file.
     */
    public void setFile(HTTPLocalFile file) {
        this.file = file;
    }

    /**
     * This is the getter method this will return the attribute value.
     * User-defined http status code to use when serving the local response.
     * Use this to provide codes not available in the list within status_code.
     * Allowed values are 200-599.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return otherStatusCode
     */
    public Integer getOtherStatusCode() {
        return otherStatusCode;
    }

    /**
     * This is the setter method to the attribute.
     * User-defined http status code to use when serving the local response.
     * Use this to provide codes not available in the list within status_code.
     * Allowed values are 200-599.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param otherStatusCode set the otherStatusCode.
     */
    public void setOtherStatusCode(Integer  otherStatusCode) {
        this.otherStatusCode = otherStatusCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the pool group to serve the request.
     * It is a reference to an object of type poolgroup.
     * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolGroupRef
     */
    public String getPoolGroupRef() {
        return poolGroupRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the pool group to serve the request.
     * It is a reference to an object of type poolgroup.
     * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolGroupRef set the poolGroupRef.
     */
    public void setPoolGroupRef(String  poolGroupRef) {
        this.poolGroupRef = poolGroupRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the pool of servers to serve the request.
     * It is a reference to an object of type pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolRef
     */
    public String getPoolRef() {
        return poolRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the pool of servers to serve the request.
     * It is a reference to an object of type pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolRef set the poolRef.
     */
    public void setPoolRef(String  poolRef) {
        this.poolRef = poolRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specific pool server to select.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return server
     */
    public PoolServer getServer() {
        return server;
    }

    /**
     * This is the setter method to the attribute.
     * Specific pool server to select.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param server set the server.
     */
    public void setServer(PoolServer server) {
        this.server = server;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http status code to use when serving local response.
     * Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403,
     * HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * This is the setter method to the attribute.
     * Http status code to use when serving local response.
     * Enum options - HTTP_LOCAL_RESPONSE_STATUS_CODE_200, HTTP_LOCAL_RESPONSE_STATUS_CODE_204, HTTP_LOCAL_RESPONSE_STATUS_CODE_403,
     * HTTP_LOCAL_RESPONSE_STATUS_CODE_404, HTTP_LOCAL_RESPONSE_STATUS_CODE_429, HTTP_LOCAL_RESPONSE_STATUS_CODE_501.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param statusCode set the statusCode.
     */
    public void setStatusCode(String  statusCode) {
        this.statusCode = statusCode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HTTPSwitchingAction objHTTPSwitchingAction = (HTTPSwitchingAction) o;
      return   Objects.equals(this.action, objHTTPSwitchingAction.action)&&
  Objects.equals(this.poolRef, objHTTPSwitchingAction.poolRef)&&
  Objects.equals(this.statusCode, objHTTPSwitchingAction.statusCode)&&
  Objects.equals(this.file, objHTTPSwitchingAction.file)&&
  Objects.equals(this.server, objHTTPSwitchingAction.server)&&
  Objects.equals(this.poolGroupRef, objHTTPSwitchingAction.poolGroupRef)&&
  Objects.equals(this.otherStatusCode, objHTTPSwitchingAction.otherStatusCode);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HTTPSwitchingAction {\n");
                  sb.append("    action: ").append(toIndentedString(action)).append("\n");
                        sb.append("    file: ").append(toIndentedString(file)).append("\n");
                        sb.append("    otherStatusCode: ").append(toIndentedString(otherStatusCode)).append("\n");
                        sb.append("    poolGroupRef: ").append(toIndentedString(poolGroupRef)).append("\n");
                        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
                        sb.append("    server: ").append(toIndentedString(server)).append("\n");
                        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
