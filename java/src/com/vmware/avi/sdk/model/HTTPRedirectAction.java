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
 * The HTTPRedirectAction is a POJO class extends AviRestResource that used for creating
 * HTTPRedirectAction.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPRedirectAction  {
    @JsonProperty("add_string")
    private String addString;

    @JsonProperty("host")
    private URIParam host;

    @JsonProperty("keep_query")
    private Boolean keepQuery = true;

    @JsonProperty("path")
    private URIParam path;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("status_code")
    private String statusCode = "HTTP_REDIRECT_STATUS_CODE_302";



    /**
     * This is the getter method this will return the attribute value.
     * Add a query string to the redirect uri.
     * If keep_query is set, concatenates the add_string to the query of the incoming request.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return addString
     */
    public String getAddString() {
        return addString;
    }

    /**
     * This is the setter method to the attribute.
     * Add a query string to the redirect uri.
     * If keep_query is set, concatenates the add_string to the query of the incoming request.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param addString set the addString.
     */
    public void setAddString(String  addString) {
        this.addString = addString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Host config.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return host
     */
    public URIParam getHost() {
        return host;
    }

    /**
     * This is the setter method to the attribute.
     * Host config.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param host set the host.
     */
    public void setHost(URIParam host) {
        this.host = host;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Keep or drop the query of the incoming request uri in the redirected uri.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return keepQuery
     */
    public Boolean getKeepQuery() {
        return keepQuery;
    }

    /**
     * This is the setter method to the attribute.
     * Keep or drop the query of the incoming request uri in the redirected uri.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param keepQuery set the keepQuery.
     */
    public void setKeepQuery(Boolean  keepQuery) {
        this.keepQuery = keepQuery;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Path config.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return path
     */
    public URIParam getPath() {
        return path;
    }

    /**
     * This is the setter method to the attribute.
     * Path config.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param path set the path.
     */
    public void setPath(URIParam path) {
        this.path = path;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Port to which redirect the request.
     * Allowed values are 1-65535.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This is the setter method to the attribute.
     * Port to which redirect the request.
     * Allowed values are 1-65535.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param port set the port.
     */
    public void setPort(Integer  port) {
        this.port = port;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Protocol type.
     * Enum options - HTTP, HTTPS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * This is the setter method to the attribute.
     * Protocol type.
     * Enum options - HTTP, HTTPS.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param protocol set the protocol.
     */
    public void setProtocol(String  protocol) {
        this.protocol = protocol;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http redirect status code.
     * Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "HTTP_REDIRECT_STATUS_CODE_302".
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * This is the setter method to the attribute.
     * Http redirect status code.
     * Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "HTTP_REDIRECT_STATUS_CODE_302".
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
      HTTPRedirectAction objHTTPRedirectAction = (HTTPRedirectAction) o;
      return   Objects.equals(this.protocol, objHTTPRedirectAction.protocol)&&
  Objects.equals(this.host, objHTTPRedirectAction.host)&&
  Objects.equals(this.port, objHTTPRedirectAction.port)&&
  Objects.equals(this.path, objHTTPRedirectAction.path)&&
  Objects.equals(this.keepQuery, objHTTPRedirectAction.keepQuery)&&
  Objects.equals(this.statusCode, objHTTPRedirectAction.statusCode)&&
  Objects.equals(this.addString, objHTTPRedirectAction.addString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HTTPRedirectAction {\n");
                  sb.append("    addString: ").append(toIndentedString(addString)).append("\n");
                        sb.append("    host: ").append(toIndentedString(host)).append("\n");
                        sb.append("    keepQuery: ").append(toIndentedString(keepQuery)).append("\n");
                        sb.append("    path: ").append(toIndentedString(path)).append("\n");
                        sb.append("    port: ").append(toIndentedString(port)).append("\n");
                        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
