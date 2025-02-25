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
 * The FailActionHTTPRedirect is a POJO class extends AviRestResource that used for creating
 * FailActionHTTPRedirect.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FailActionHTTPRedirect  {
    @JsonProperty("host")
    private String host;

    @JsonProperty("path")
    private String path;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("query")
    private String query;

    @JsonProperty("status_code")
    private String statusCode = "HTTP_REDIRECT_STATUS_CODE_302";



    /**
     * This is the getter method this will return the attribute value.
     * The host to which the redirect request is sent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * This is the setter method to the attribute.
     * The host to which the redirect request is sent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param host set the host.
     */
    public void setHost(String  host) {
        this.host = host;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Path configuration for the redirect request.
     * If not set the path from the original request's uri is preserved in the redirect on pool failure.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * This is the setter method to the attribute.
     * Path configuration for the redirect request.
     * If not set the path from the original request's uri is preserved in the redirect on pool failure.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param path set the path.
     */
    public void setPath(String  path) {
        this.path = path;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - HTTP, HTTPS.
     * Allowed in enterprise edition with any value, basic edition(allowed values- http), essentials, enterprise with cloud services edition.
     * Special default for basic edition is http, enterprise is https.
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - HTTP, HTTPS.
     * Allowed in enterprise edition with any value, basic edition(allowed values- http), essentials, enterprise with cloud services edition.
     * Special default for basic edition is http, enterprise is https.
     * @param protocol set the protocol.
     */
    public void setProtocol(String  protocol) {
        this.protocol = protocol;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Query configuration for the redirect request uri.
     * If not set, the query from the original request's uri is preserved in the redirect on pool failure.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return query
     */
    public String getQuery() {
        return query;
    }

    /**
     * This is the setter method to the attribute.
     * Query configuration for the redirect request uri.
     * If not set, the query from the original request's uri is preserved in the redirect on pool failure.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param query set the query.
     */
    public void setQuery(String  query) {
        this.query = query;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307.
     * Allowed in enterprise edition with any value, basic edition(allowed values- http_redirect_status_code_302), essentials, enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "HTTP_REDIRECT_STATUS_CODE_302".
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - HTTP_REDIRECT_STATUS_CODE_301, HTTP_REDIRECT_STATUS_CODE_302, HTTP_REDIRECT_STATUS_CODE_307.
     * Allowed in enterprise edition with any value, basic edition(allowed values- http_redirect_status_code_302), essentials, enterprise with cloud
     * services edition.
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
      FailActionHTTPRedirect objFailActionHTTPRedirect = (FailActionHTTPRedirect) o;
      return   Objects.equals(this.protocol, objFailActionHTTPRedirect.protocol)&&
  Objects.equals(this.host, objFailActionHTTPRedirect.host)&&
  Objects.equals(this.path, objFailActionHTTPRedirect.path)&&
  Objects.equals(this.query, objFailActionHTTPRedirect.query)&&
  Objects.equals(this.statusCode, objFailActionHTTPRedirect.statusCode);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FailActionHTTPRedirect {\n");
                  sb.append("    host: ").append(toIndentedString(host)).append("\n");
                        sb.append("    path: ").append(toIndentedString(path)).append("\n");
                        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
                        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
