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
 * The EquivalentLabels is a POJO class extends AviRestResource that used for creating
 * EquivalentLabels.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquivalentLabels  {
    @JsonProperty("labels")
    private List<String> labels;


    /**
     * This is the getter method this will return the attribute value.
     * Equivalent labels.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    /**
     * This is the setter method. this will set the labels
     * Equivalent labels.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labels
     */
    public void setLabels(List<String>  labels) {
        this.labels = labels;
    }

    /**
     * This is the setter method this will set the labels
     * Equivalent labels.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labels
     */
    public EquivalentLabels addLabelsItem(String labelsItem) {
      if (this.labels == null) {
        this.labels = new ArrayList<String>();
      }
      this.labels.add(labelsItem);
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
      EquivalentLabels objEquivalentLabels = (EquivalentLabels) o;
      return   Objects.equals(this.labels, objEquivalentLabels.labels);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class EquivalentLabels {\n");
                  sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
