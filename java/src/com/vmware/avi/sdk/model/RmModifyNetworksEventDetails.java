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
 * The RmModifyNetworksEventDetails is a POJO class extends AviRestResource that used for creating
 * RmModifyNetworksEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RmModifyNetworksEventDetails  {
    @JsonProperty("networks")
    private List<RmModifyVnic> networks;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("se_name")
    private String seName;

    @JsonProperty("se_uuid")
    private String seUuid;

    @JsonProperty("vs_name")
    private List<String> vsName;

    @JsonProperty("vs_uuid")
    private List<String> vsUuid;


    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public List<RmModifyVnic> getNetworks() {
        return networks;
    }

    /**
     * This is the setter method. this will set the networks
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public void setNetworks(List<RmModifyVnic>  networks) {
        this.networks = networks;
    }

    /**
     * This is the setter method this will set the networks
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networks
     */
    public RmModifyNetworksEventDetails addNetworksItem(RmModifyVnic networksItem) {
      if (this.networks == null) {
        this.networks = new ArrayList<RmModifyVnic>();
      }
      this.networks.add(networksItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seName
     */
    public String getSeName() {
        return seName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seName set the seName.
     */
    public void setSeName(String  seName) {
        this.seName = seName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUuid
     */
    public String getSeUuid() {
        return seUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seUuid set the seUuid.
     */
    public void setSeUuid(String  seUuid) {
        this.seUuid = seUuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public List<String> getVsName() {
        return vsName;
    }

    /**
     * This is the setter method. this will set the vsName
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public void setVsName(List<String>  vsName) {
        this.vsName = vsName;
    }

    /**
     * This is the setter method this will set the vsName
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public RmModifyNetworksEventDetails addVsNameItem(String vsNameItem) {
      if (this.vsName == null) {
        this.vsName = new ArrayList<String>();
      }
      this.vsName.add(vsNameItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public List<String> getVsUuid() {
        return vsUuid;
    }

    /**
     * This is the setter method. this will set the vsUuid
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public void setVsUuid(List<String>  vsUuid) {
        this.vsUuid = vsUuid;
    }

    /**
     * This is the setter method this will set the vsUuid
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public RmModifyNetworksEventDetails addVsUuidItem(String vsUuidItem) {
      if (this.vsUuid == null) {
        this.vsUuid = new ArrayList<String>();
      }
      this.vsUuid.add(vsUuidItem);
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
      RmModifyNetworksEventDetails objRmModifyNetworksEventDetails = (RmModifyNetworksEventDetails) o;
      return   Objects.equals(this.seUuid, objRmModifyNetworksEventDetails.seUuid)&&
  Objects.equals(this.seName, objRmModifyNetworksEventDetails.seName)&&
  Objects.equals(this.networks, objRmModifyNetworksEventDetails.networks)&&
  Objects.equals(this.vsName, objRmModifyNetworksEventDetails.vsName)&&
  Objects.equals(this.vsUuid, objRmModifyNetworksEventDetails.vsUuid)&&
  Objects.equals(this.reason, objRmModifyNetworksEventDetails.reason);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RmModifyNetworksEventDetails {\n");
                  sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
                        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
                        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
                        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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
