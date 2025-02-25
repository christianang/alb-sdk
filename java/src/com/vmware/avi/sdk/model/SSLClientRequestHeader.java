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
 * The SSLClientRequestHeader is a POJO class extends AviRestResource that used for creating
 * SSLClientRequestHeader.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSLClientRequestHeader  {
    @JsonProperty("request_header")
    private String requestHeader;

    @JsonProperty("request_header_value")
    private String requestHeaderValue;



    /**
     * This is the getter method this will return the attribute value.
     * If this header exists, reset the connection.
     * If the ssl variable is specified, add a header with this value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestHeader
     */
    public String getRequestHeader() {
        return requestHeader;
    }

    /**
     * This is the setter method to the attribute.
     * If this header exists, reset the connection.
     * If the ssl variable is specified, add a header with this value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestHeader set the requestHeader.
     */
    public void setRequestHeader(String  requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set the request header with the value as indicated by this ssl variable.
     * Eg.
     * Send the whole certificate in pem format.
     * Enum options - HTTP_POLICY_VAR_CLIENT_IP, HTTP_POLICY_VAR_VS_PORT, HTTP_POLICY_VAR_VS_IP, HTTP_POLICY_VAR_HTTP_HDR,
     * HTTP_POLICY_VAR_SSL_CLIENT_FINGERPRINT, HTTP_POLICY_VAR_SSL_CLIENT_SERIAL, HTTP_POLICY_VAR_SSL_CLIENT_ISSUER, HTTP_POLICY_VAR_SSL_CLIENT_SUBJECT,
     * HTTP_POLICY_VAR_SSL_CLIENT_RAW, HTTP_POLICY_VAR_SSL_PROTOCOL, HTTP_POLICY_VAR_SSL_SERVER_NAME, HTTP_POLICY_VAR_USER_NAME,
     * HTTP_POLICY_VAR_SSL_CIPHER, HTTP_POLICY_VAR_REQUEST_ID, HTTP_POLICY_VAR_SSL_CLIENT_VERSION, HTTP_POLICY_VAR_SSL_CLIENT_SIGALG,
     * HTTP_POLICY_VAR_SSL_CLIENT_NOTVALIDBEFORE, HTTP_POLICY_VAR_SSL_CLIENT_NOTVALIDAFTER, HTTP_POLICY_VAR_SSL_CLIENT_ESCAPED,
     * HTTP_POLICY_VAR_SOURCE_IP.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestHeaderValue
     */
    public String getRequestHeaderValue() {
        return requestHeaderValue;
    }

    /**
     * This is the setter method to the attribute.
     * Set the request header with the value as indicated by this ssl variable.
     * Eg.
     * Send the whole certificate in pem format.
     * Enum options - HTTP_POLICY_VAR_CLIENT_IP, HTTP_POLICY_VAR_VS_PORT, HTTP_POLICY_VAR_VS_IP, HTTP_POLICY_VAR_HTTP_HDR,
     * HTTP_POLICY_VAR_SSL_CLIENT_FINGERPRINT, HTTP_POLICY_VAR_SSL_CLIENT_SERIAL, HTTP_POLICY_VAR_SSL_CLIENT_ISSUER, HTTP_POLICY_VAR_SSL_CLIENT_SUBJECT,
     * HTTP_POLICY_VAR_SSL_CLIENT_RAW, HTTP_POLICY_VAR_SSL_PROTOCOL, HTTP_POLICY_VAR_SSL_SERVER_NAME, HTTP_POLICY_VAR_USER_NAME,
     * HTTP_POLICY_VAR_SSL_CIPHER, HTTP_POLICY_VAR_REQUEST_ID, HTTP_POLICY_VAR_SSL_CLIENT_VERSION, HTTP_POLICY_VAR_SSL_CLIENT_SIGALG,
     * HTTP_POLICY_VAR_SSL_CLIENT_NOTVALIDBEFORE, HTTP_POLICY_VAR_SSL_CLIENT_NOTVALIDAFTER, HTTP_POLICY_VAR_SSL_CLIENT_ESCAPED,
     * HTTP_POLICY_VAR_SOURCE_IP.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestHeaderValue set the requestHeaderValue.
     */
    public void setRequestHeaderValue(String  requestHeaderValue) {
        this.requestHeaderValue = requestHeaderValue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SSLClientRequestHeader objSSLClientRequestHeader = (SSLClientRequestHeader) o;
      return   Objects.equals(this.requestHeader, objSSLClientRequestHeader.requestHeader)&&
  Objects.equals(this.requestHeaderValue, objSSLClientRequestHeader.requestHeaderValue);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SSLClientRequestHeader {\n");
                  sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
                        sb.append("    requestHeaderValue: ").append(toIndentedString(requestHeaderValue)).append("\n");
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
