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
 * The WafContentTypeMapping is a POJO class extends AviRestResource that used for creating
 * WafContentTypeMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafContentTypeMapping  {
    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("match_op")
    private String matchOp = "EQUALS";

    @JsonProperty("request_body_parser")
    private String requestBodyParser;



    /**
     * This is the getter method this will return the attribute value.
     * Request content-type.
     * When it is equal to request content-type header value, the specified request_body_parser is used.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * This is the setter method to the attribute.
     * Request content-type.
     * When it is equal to request content-type header value, the specified request_body_parser is used.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param contentType set the contentType.
     */
    public void setContentType(String  contentType) {
        this.contentType = contentType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * String operation to use for matching the content_type.
     * Only equals and regex_match are supported string operations here.
     * All equals matches are checked before regex_match matches.
     * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
     * REGEX_DOES_NOT_MATCH.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "EQUALS".
     * @return matchOp
     */
    public String getMatchOp() {
        return matchOp;
    }

    /**
     * This is the setter method to the attribute.
     * String operation to use for matching the content_type.
     * Only equals and regex_match are supported string operations here.
     * All equals matches are checked before regex_match matches.
     * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
     * REGEX_DOES_NOT_MATCH.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "EQUALS".
     * @param matchOp set the matchOp.
     */
    public void setMatchOp(String  matchOp) {
        this.matchOp = matchOp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Request body parser.
     * Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML,
     * WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestBodyParser
     */
    public String getRequestBodyParser() {
        return requestBodyParser;
    }

    /**
     * This is the setter method to the attribute.
     * Request body parser.
     * Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML,
     * WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestBodyParser set the requestBodyParser.
     */
    public void setRequestBodyParser(String  requestBodyParser) {
        this.requestBodyParser = requestBodyParser;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WafContentTypeMapping objWafContentTypeMapping = (WafContentTypeMapping) o;
      return   Objects.equals(this.contentType, objWafContentTypeMapping.contentType)&&
  Objects.equals(this.requestBodyParser, objWafContentTypeMapping.requestBodyParser)&&
  Objects.equals(this.matchOp, objWafContentTypeMapping.matchOp);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafContentTypeMapping {\n");
                  sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
                        sb.append("    matchOp: ").append(toIndentedString(matchOp)).append("\n");
                        sb.append("    requestBodyParser: ").append(toIndentedString(requestBodyParser)).append("\n");
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
