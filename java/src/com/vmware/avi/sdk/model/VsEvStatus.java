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
 * The VsEvStatus is a POJO class extends AviRestResource that used for creating
 * VsEvStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VsEvStatus  {
    @JsonProperty("notes")
    private List<String> notes;

    @JsonProperty("request")
    private String request;

    @JsonProperty("result")
    private String result;


    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return notes
     */
    public List<String> getNotes() {
        return notes;
    }

    /**
     * This is the setter method. this will set the notes
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return notes
     */
    public void setNotes(List<String>  notes) {
        this.notes = notes;
    }

    /**
     * This is the setter method this will set the notes
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return notes
     */
    public VsEvStatus addNotesItem(String notesItem) {
      if (this.notes == null) {
        this.notes = new ArrayList<String>();
      }
      this.notes.add(notesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return request
     */
    public String getRequest() {
        return request;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param request set the request.
     */
    public void setRequest(String  request) {
        this.request = request;
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


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VsEvStatus objVsEvStatus = (VsEvStatus) o;
      return   Objects.equals(this.request, objVsEvStatus.request)&&
  Objects.equals(this.result, objVsEvStatus.result)&&
  Objects.equals(this.notes, objVsEvStatus.notes);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VsEvStatus {\n");
                  sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
                        sb.append("    request: ").append(toIndentedString(request)).append("\n");
                        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
