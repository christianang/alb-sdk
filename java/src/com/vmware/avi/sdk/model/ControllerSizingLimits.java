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
 * The ControllerSizingLimits is a POJO class extends AviRestResource that used for creating
 * ControllerSizingLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerSizingLimits  {
    @JsonProperty("controller_sizing_cloud_limits")
    private List<ControllerSizingCloudLimits> controllerSizingCloudLimits;

    @JsonProperty("flavor")
    private String flavor;

    @JsonProperty("num_clouds")
    private Integer numClouds;

    @JsonProperty("num_east_west_virtualservices")
    private Integer numEastWestVirtualservices;

    @JsonProperty("num_servers")
    private Integer numServers;

    @JsonProperty("num_serviceengines")
    private Integer numServiceengines;

    @JsonProperty("num_tenants")
    private Integer numTenants;

    @JsonProperty("num_virtualservices")
    private Integer numVirtualservices;

    @JsonProperty("num_virtualservices_rt_metrics")
    private Integer numVirtualservicesRtMetrics;

    @JsonProperty("num_vrfs")
    private Integer numVrfs;

    @JsonProperty("num_waf_virtualservices")
    private Integer numWafVirtualservices;


    /**
     * This is the getter method this will return the attribute value.
     * Controller system limits specific to cloud type for this controller sizing.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerSizingCloudLimits
     */
    public List<ControllerSizingCloudLimits> getControllerSizingCloudLimits() {
        return controllerSizingCloudLimits;
    }

    /**
     * This is the setter method. this will set the controllerSizingCloudLimits
     * Controller system limits specific to cloud type for this controller sizing.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerSizingCloudLimits
     */
    public void setControllerSizingCloudLimits(List<ControllerSizingCloudLimits>  controllerSizingCloudLimits) {
        this.controllerSizingCloudLimits = controllerSizingCloudLimits;
    }

    /**
     * This is the setter method this will set the controllerSizingCloudLimits
     * Controller system limits specific to cloud type for this controller sizing.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerSizingCloudLimits
     */
    public ControllerSizingLimits addControllerSizingCloudLimitsItem(ControllerSizingCloudLimits controllerSizingCloudLimitsItem) {
      if (this.controllerSizingCloudLimits == null) {
        this.controllerSizingCloudLimits = new ArrayList<ControllerSizingCloudLimits>();
      }
      this.controllerSizingCloudLimits.add(controllerSizingCloudLimitsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Controller flavor (s/m/l) for this sizing limit.
     * Enum options - CONTROLLER_ESSENTIALS, CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * This is the setter method to the attribute.
     * Controller flavor (s/m/l) for this sizing limit.
     * Enum options - CONTROLLER_ESSENTIALS, CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param flavor set the flavor.
     */
    public void setFlavor(String  flavor) {
        this.flavor = flavor;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of clouds.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numClouds
     */
    public Integer getNumClouds() {
        return numClouds;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of clouds.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numClouds set the numClouds.
     */
    public void setNumClouds(Integer  numClouds) {
        this.numClouds = numClouds;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of east-west virtualservices.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numEastWestVirtualservices
     */
    public Integer getNumEastWestVirtualservices() {
        return numEastWestVirtualservices;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of east-west virtualservices.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numEastWestVirtualservices set the numEastWestVirtualservices.
     */
    public void setNumEastWestVirtualservices(Integer  numEastWestVirtualservices) {
        this.numEastWestVirtualservices = numEastWestVirtualservices;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of servers.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numServers
     */
    public Integer getNumServers() {
        return numServers;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of servers.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numServers set the numServers.
     */
    public void setNumServers(Integer  numServers) {
        this.numServers = numServers;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of serviceengines.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numServiceengines
     */
    public Integer getNumServiceengines() {
        return numServiceengines;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of serviceengines.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numServiceengines set the numServiceengines.
     */
    public void setNumServiceengines(Integer  numServiceengines) {
        this.numServiceengines = numServiceengines;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of tenants.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numTenants
     */
    public Integer getNumTenants() {
        return numTenants;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of tenants.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numTenants set the numTenants.
     */
    public void setNumTenants(Integer  numTenants) {
        this.numTenants = numTenants;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of virtualservices.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVirtualservices
     */
    public Integer getNumVirtualservices() {
        return numVirtualservices;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of virtualservices.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVirtualservices set the numVirtualservices.
     */
    public void setNumVirtualservices(Integer  numVirtualservices) {
        this.numVirtualservices = numVirtualservices;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of virtualservices with realtime metrics enabled.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVirtualservicesRtMetrics
     */
    public Integer getNumVirtualservicesRtMetrics() {
        return numVirtualservicesRtMetrics;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of virtualservices with realtime metrics enabled.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVirtualservicesRtMetrics set the numVirtualservicesRtMetrics.
     */
    public void setNumVirtualservicesRtMetrics(Integer  numVirtualservicesRtMetrics) {
        this.numVirtualservicesRtMetrics = numVirtualservicesRtMetrics;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of vrfcontexts.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVrfs
     */
    public Integer getNumVrfs() {
        return numVrfs;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of vrfcontexts.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVrfs set the numVrfs.
     */
    public void setNumVrfs(Integer  numVrfs) {
        this.numVrfs = numVrfs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of virtualservices configured with waf.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numWafVirtualservices
     */
    public Integer getNumWafVirtualservices() {
        return numWafVirtualservices;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of virtualservices configured with waf.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numWafVirtualservices set the numWafVirtualservices.
     */
    public void setNumWafVirtualservices(Integer  numWafVirtualservices) {
        this.numWafVirtualservices = numWafVirtualservices;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ControllerSizingLimits objControllerSizingLimits = (ControllerSizingLimits) o;
      return   Objects.equals(this.flavor, objControllerSizingLimits.flavor)&&
  Objects.equals(this.numVirtualservices, objControllerSizingLimits.numVirtualservices)&&
  Objects.equals(this.numVirtualservicesRtMetrics, objControllerSizingLimits.numVirtualservicesRtMetrics)&&
  Objects.equals(this.numEastWestVirtualservices, objControllerSizingLimits.numEastWestVirtualservices)&&
  Objects.equals(this.numServers, objControllerSizingLimits.numServers)&&
  Objects.equals(this.numServiceengines, objControllerSizingLimits.numServiceengines)&&
  Objects.equals(this.numVrfs, objControllerSizingLimits.numVrfs)&&
  Objects.equals(this.numClouds, objControllerSizingLimits.numClouds)&&
  Objects.equals(this.numTenants, objControllerSizingLimits.numTenants)&&
  Objects.equals(this.numWafVirtualservices, objControllerSizingLimits.numWafVirtualservices)&&
  Objects.equals(this.controllerSizingCloudLimits, objControllerSizingLimits.controllerSizingCloudLimits);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControllerSizingLimits {\n");
                  sb.append("    controllerSizingCloudLimits: ").append(toIndentedString(controllerSizingCloudLimits)).append("\n");
                        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
                        sb.append("    numClouds: ").append(toIndentedString(numClouds)).append("\n");
                        sb.append("    numEastWestVirtualservices: ").append(toIndentedString(numEastWestVirtualservices)).append("\n");
                        sb.append("    numServers: ").append(toIndentedString(numServers)).append("\n");
                        sb.append("    numServiceengines: ").append(toIndentedString(numServiceengines)).append("\n");
                        sb.append("    numTenants: ").append(toIndentedString(numTenants)).append("\n");
                        sb.append("    numVirtualservices: ").append(toIndentedString(numVirtualservices)).append("\n");
                        sb.append("    numVirtualservicesRtMetrics: ").append(toIndentedString(numVirtualservicesRtMetrics)).append("\n");
                        sb.append("    numVrfs: ").append(toIndentedString(numVrfs)).append("\n");
                        sb.append("    numWafVirtualservices: ").append(toIndentedString(numWafVirtualservices)).append("\n");
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
