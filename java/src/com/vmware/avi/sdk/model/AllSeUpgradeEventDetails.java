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
 * The AllSeUpgradeEventDetails is a POJO class extends AviRestResource that used for creating
 * AllSeUpgradeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllSeUpgradeEventDetails  {
    @JsonProperty("notes")
    private List<String> notes;

    @JsonProperty("num_se")
    private Integer numSe;

    @JsonProperty("num_vs")
    private Integer numVs;

    @JsonProperty("request")
    private SeUpgradeParams request;


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
    public AllSeUpgradeEventDetails addNotesItem(String notesItem) {
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
     * @return numSe
     */
    public Integer getNumSe() {
        return numSe;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSe set the numSe.
     */
    public void setNumSe(Integer  numSe) {
        this.numSe = numSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVs
     */
    public Integer getNumVs() {
        return numVs;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVs set the numVs.
     */
    public void setNumVs(Integer  numVs) {
        this.numVs = numVs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return request
     */
    public SeUpgradeParams getRequest() {
        return request;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param request set the request.
     */
    public void setRequest(SeUpgradeParams request) {
        this.request = request;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AllSeUpgradeEventDetails objAllSeUpgradeEventDetails = (AllSeUpgradeEventDetails) o;
      return   Objects.equals(this.numSe, objAllSeUpgradeEventDetails.numSe)&&
  Objects.equals(this.numVs, objAllSeUpgradeEventDetails.numVs)&&
  Objects.equals(this.notes, objAllSeUpgradeEventDetails.notes)&&
  Objects.equals(this.request, objAllSeUpgradeEventDetails.request);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AllSeUpgradeEventDetails {\n");
                  sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
                        sb.append("    numSe: ").append(toIndentedString(numSe)).append("\n");
                        sb.append("    numVs: ").append(toIndentedString(numVs)).append("\n");
                        sb.append("    request: ").append(toIndentedString(request)).append("\n");
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
