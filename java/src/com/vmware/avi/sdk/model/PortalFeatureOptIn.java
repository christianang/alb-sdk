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
 * The PortalFeatureOptIn is a POJO class extends AviRestResource that used for creating
 * PortalFeatureOptIn.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortalFeatureOptIn  {
    @JsonProperty("enable_appsignature_sync")
    private Boolean enableAppsignatureSync = false;

    @JsonProperty("enable_ip_reputation")
    private Boolean enableIpReputation = false;

    @JsonProperty("enable_pulse_case_management")
    private Boolean enablePulseCaseManagement;

    @JsonProperty("enable_pulse_inventory")
    private Boolean enablePulseInventory;

    @JsonProperty("enable_pulse_waf_management")
    private Boolean enablePulseWafManagement;

    @JsonProperty("enable_search_info")
    private Boolean enableSearchInfo = false;

    @JsonProperty("enable_user_agent_db_sync")
    private Boolean enableUserAgentDbSync = false;



    /**
     * This is the getter method this will return the attribute value.
     * Enable to receive application specific signature updates.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableAppsignatureSync
     */
    public Boolean getEnableAppsignatureSync() {
        return enableAppsignatureSync;
    }

    /**
     * This is the setter method to the attribute.
     * Enable to receive application specific signature updates.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableAppsignatureSync set the enableAppsignatureSync.
     */
    public void setEnableAppsignatureSync(Boolean  enableAppsignatureSync) {
        this.enableAppsignatureSync = enableAppsignatureSync;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable to receive ip reputation updates.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableIpReputation
     */
    public Boolean getEnableIpReputation() {
        return enableIpReputation;
    }

    /**
     * This is the setter method to the attribute.
     * Enable to receive ip reputation updates.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableIpReputation set the enableIpReputation.
     */
    public void setEnableIpReputation(Boolean  enableIpReputation) {
        this.enableIpReputation = enableIpReputation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable pulse cloud services case management.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Special default for essentials edition is false, basic edition is false, enterprise is true.
     * @return enablePulseCaseManagement
     */
    public Boolean getEnablePulseCaseManagement() {
        return enablePulseCaseManagement;
    }

    /**
     * This is the setter method to the attribute.
     * Enable pulse cloud services case management.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Special default for essentials edition is false, basic edition is false, enterprise is true.
     * @param enablePulseCaseManagement set the enablePulseCaseManagement.
     */
    public void setEnablePulseCaseManagement(Boolean  enablePulseCaseManagement) {
        this.enablePulseCaseManagement = enablePulseCaseManagement;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable pulse cloud services inventory.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Special default for essentials edition is false, basic edition is false, enterprise is false.
     * @return enablePulseInventory
     */
    public Boolean getEnablePulseInventory() {
        return enablePulseInventory;
    }

    /**
     * This is the setter method to the attribute.
     * Enable pulse cloud services inventory.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Special default for essentials edition is false, basic edition is false, enterprise is false.
     * @param enablePulseInventory set the enablePulseInventory.
     */
    public void setEnablePulseInventory(Boolean  enablePulseInventory) {
        this.enablePulseInventory = enablePulseInventory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable to receive waf crs updates.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Special default for essentials edition is false, basic edition is false, enterprise is true.
     * @return enablePulseWafManagement
     */
    public Boolean getEnablePulseWafManagement() {
        return enablePulseWafManagement;
    }

    /**
     * This is the setter method to the attribute.
     * Enable to receive waf crs updates.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Special default for essentials edition is false, basic edition is false, enterprise is true.
     * @param enablePulseWafManagement set the enablePulseWafManagement.
     */
    public void setEnablePulseWafManagement(Boolean  enablePulseWafManagement) {
        this.enablePulseWafManagement = enablePulseWafManagement;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Names, ip's of vs, pool(poolgroup) servers would be searchable on cloud console.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableSearchInfo
     */
    public Boolean getEnableSearchInfo() {
        return enableSearchInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Names, ip's of vs, pool(poolgroup) servers would be searchable on cloud console.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableSearchInfo set the enableSearchInfo.
     */
    public void setEnableSearchInfo(Boolean  enableSearchInfo) {
        this.enableSearchInfo = enableSearchInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable to receive bot management updates.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableUserAgentDbSync
     */
    public Boolean getEnableUserAgentDbSync() {
        return enableUserAgentDbSync;
    }

    /**
     * This is the setter method to the attribute.
     * Enable to receive bot management updates.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableUserAgentDbSync set the enableUserAgentDbSync.
     */
    public void setEnableUserAgentDbSync(Boolean  enableUserAgentDbSync) {
        this.enableUserAgentDbSync = enableUserAgentDbSync;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PortalFeatureOptIn objPortalFeatureOptIn = (PortalFeatureOptIn) o;
      return   Objects.equals(this.enableIpReputation, objPortalFeatureOptIn.enableIpReputation)&&
  Objects.equals(this.enableAppsignatureSync, objPortalFeatureOptIn.enableAppsignatureSync)&&
  Objects.equals(this.enableUserAgentDbSync, objPortalFeatureOptIn.enableUserAgentDbSync)&&
  Objects.equals(this.enablePulseWafManagement, objPortalFeatureOptIn.enablePulseWafManagement)&&
  Objects.equals(this.enablePulseCaseManagement, objPortalFeatureOptIn.enablePulseCaseManagement)&&
  Objects.equals(this.enablePulseInventory, objPortalFeatureOptIn.enablePulseInventory)&&
  Objects.equals(this.enableSearchInfo, objPortalFeatureOptIn.enableSearchInfo);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PortalFeatureOptIn {\n");
                  sb.append("    enableAppsignatureSync: ").append(toIndentedString(enableAppsignatureSync)).append("\n");
                        sb.append("    enableIpReputation: ").append(toIndentedString(enableIpReputation)).append("\n");
                        sb.append("    enablePulseCaseManagement: ").append(toIndentedString(enablePulseCaseManagement)).append("\n");
                        sb.append("    enablePulseInventory: ").append(toIndentedString(enablePulseInventory)).append("\n");
                        sb.append("    enablePulseWafManagement: ").append(toIndentedString(enablePulseWafManagement)).append("\n");
                        sb.append("    enableSearchInfo: ").append(toIndentedString(enableSearchInfo)).append("\n");
                        sb.append("    enableUserAgentDbSync: ").append(toIndentedString(enableUserAgentDbSync)).append("\n");
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
