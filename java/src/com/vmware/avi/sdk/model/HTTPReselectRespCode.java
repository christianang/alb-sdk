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
 * The HTTPReselectRespCode is a POJO class extends AviRestResource that used for creating
 * HTTPReselectRespCode.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPReselectRespCode  {
    @JsonProperty("codes")
    private List<Integer> codes;

    @JsonProperty("ranges")
    private List<HTTPStatusRange> ranges;

    @JsonProperty("resp_code_block")
    private List<String> respCodeBlock;


    /**
     * This is the getter method this will return the attribute value.
     * Http response code to be matched.
     * Allowed values are 400-599.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return codes
     */
    public List<Integer> getCodes() {
        return codes;
    }

    /**
     * This is the setter method. this will set the codes
     * Http response code to be matched.
     * Allowed values are 400-599.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return codes
     */
    public void setCodes(List<Integer>  codes) {
        this.codes = codes;
    }

    /**
     * This is the setter method this will set the codes
     * Http response code to be matched.
     * Allowed values are 400-599.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return codes
     */
    public HTTPReselectRespCode addCodesItem(Integer codesItem) {
      if (this.codes == null) {
        this.codes = new ArrayList<Integer>();
      }
      this.codes.add(codesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Http response code ranges to match.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ranges
     */
    public List<HTTPStatusRange> getRanges() {
        return ranges;
    }

    /**
     * This is the setter method. this will set the ranges
     * Http response code ranges to match.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ranges
     */
    public void setRanges(List<HTTPStatusRange>  ranges) {
        this.ranges = ranges;
    }

    /**
     * This is the setter method this will set the ranges
     * Http response code ranges to match.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ranges
     */
    public HTTPReselectRespCode addRangesItem(HTTPStatusRange rangesItem) {
      if (this.ranges == null) {
        this.ranges = new ArrayList<HTTPStatusRange>();
      }
      this.ranges.add(rangesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Block of http response codes to match for server reselect.
     * Enum options - HTTP_RSP_4XX, HTTP_RSP_5XX.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return respCodeBlock
     */
    public List<String> getRespCodeBlock() {
        return respCodeBlock;
    }

    /**
     * This is the setter method. this will set the respCodeBlock
     * Block of http response codes to match for server reselect.
     * Enum options - HTTP_RSP_4XX, HTTP_RSP_5XX.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return respCodeBlock
     */
    public void setRespCodeBlock(List<String>  respCodeBlock) {
        this.respCodeBlock = respCodeBlock;
    }

    /**
     * This is the setter method this will set the respCodeBlock
     * Block of http response codes to match for server reselect.
     * Enum options - HTTP_RSP_4XX, HTTP_RSP_5XX.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return respCodeBlock
     */
    public HTTPReselectRespCode addRespCodeBlockItem(String respCodeBlockItem) {
      if (this.respCodeBlock == null) {
        this.respCodeBlock = new ArrayList<String>();
      }
      this.respCodeBlock.add(respCodeBlockItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HTTPReselectRespCode objHTTPReselectRespCode = (HTTPReselectRespCode) o;
      return   Objects.equals(this.codes, objHTTPReselectRespCode.codes)&&
  Objects.equals(this.ranges, objHTTPReselectRespCode.ranges)&&
  Objects.equals(this.respCodeBlock, objHTTPReselectRespCode.respCodeBlock);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HTTPReselectRespCode {\n");
                  sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
                        sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
                        sb.append("    respCodeBlock: ").append(toIndentedString(respCodeBlock)).append("\n");
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
