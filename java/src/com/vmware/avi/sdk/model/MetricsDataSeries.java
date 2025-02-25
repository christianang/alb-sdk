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
 * The MetricsDataSeries is a POJO class extends AviRestResource that used for creating
 * MetricsDataSeries.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricsDataSeries  {
    @JsonProperty("data")
    private List<MetricsData> data;

    @JsonProperty("header")
    private MetricsDataHeader header;


    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return data
     */
    public List<MetricsData> getData() {
        return data;
    }

    /**
     * This is the setter method. this will set the data
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return data
     */
    public void setData(List<MetricsData>  data) {
        this.data = data;
    }

    /**
     * This is the setter method this will set the data
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return data
     */
    public MetricsDataSeries addDataItem(MetricsData dataItem) {
      if (this.data == null) {
        this.data = new ArrayList<MetricsData>();
      }
      this.data.add(dataItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return header
     */
    public MetricsDataHeader getHeader() {
        return header;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param header set the header.
     */
    public void setHeader(MetricsDataHeader header) {
        this.header = header;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MetricsDataSeries objMetricsDataSeries = (MetricsDataSeries) o;
      return   Objects.equals(this.header, objMetricsDataSeries.header)&&
  Objects.equals(this.data, objMetricsDataSeries.data);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricsDataSeries {\n");
                  sb.append("    data: ").append(toIndentedString(data)).append("\n");
                        sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
