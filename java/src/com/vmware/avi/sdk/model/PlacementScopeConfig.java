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
 * The PlacementScopeConfig is a POJO class extends AviRestResource that used for creating
 * PlacementScopeConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlacementScopeConfig  {
    @JsonProperty("clusters")
    private List<ClusterHAConfig> clusters;

    @JsonProperty("nsxt_clusters")
    private NsxtClusters nsxtClusters;

    @JsonProperty("nsxt_datastores")
    private NsxtDatastores nsxtDatastores;

    @JsonProperty("nsxt_hosts")
    private NsxtHosts nsxtHosts;

    @JsonProperty("vcenter_folder")
    private String vcenterFolder;

    @JsonProperty("vcenter_ref")
    private String vcenterRef;


    /**
     * This is the getter method this will return the attribute value.
     * Cluster vsphere ha configuration.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusters
     */
    public List<ClusterHAConfig> getClusters() {
        return clusters;
    }

    /**
     * This is the setter method. this will set the clusters
     * Cluster vsphere ha configuration.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusters
     */
    public void setClusters(List<ClusterHAConfig>  clusters) {
        this.clusters = clusters;
    }

    /**
     * This is the setter method this will set the clusters
     * Cluster vsphere ha configuration.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusters
     */
    public PlacementScopeConfig addClustersItem(ClusterHAConfig clustersItem) {
      if (this.clusters == null) {
        this.clusters = new ArrayList<ClusterHAConfig>();
      }
      this.clusters.add(clustersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of transport node clusters include or exclude.
     * Field introduced in 20.1.6.
     * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtClusters
     */
    public NsxtClusters getNsxtClusters() {
        return nsxtClusters;
    }

    /**
     * This is the setter method to the attribute.
     * List of transport node clusters include or exclude.
     * Field introduced in 20.1.6.
     * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtClusters set the nsxtClusters.
     */
    public void setNsxtClusters(NsxtClusters nsxtClusters) {
        this.nsxtClusters = nsxtClusters;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of shared datastores to include or exclude.
     * Field introduced in 20.1.2.
     * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtDatastores
     */
    public NsxtDatastores getNsxtDatastores() {
        return nsxtDatastores;
    }

    /**
     * This is the setter method to the attribute.
     * List of shared datastores to include or exclude.
     * Field introduced in 20.1.2.
     * Allowed in enterprise edition with any value, basic edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtDatastores set the nsxtDatastores.
     */
    public void setNsxtDatastores(NsxtDatastores nsxtDatastores) {
        this.nsxtDatastores = nsxtDatastores;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of transport nodes include or exclude.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtHosts
     */
    public NsxtHosts getNsxtHosts() {
        return nsxtHosts;
    }

    /**
     * This is the setter method to the attribute.
     * List of transport nodes include or exclude.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtHosts set the nsxtHosts.
     */
    public void setNsxtHosts(NsxtHosts nsxtHosts) {
        this.nsxtHosts = nsxtHosts;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Folder to place all the service engine virtual machines in vcenter.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterFolder
     */
    public String getVcenterFolder() {
        return vcenterFolder;
    }

    /**
     * This is the setter method to the attribute.
     * Folder to place all the service engine virtual machines in vcenter.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterFolder set the vcenterFolder.
     */
    public void setVcenterFolder(String  vcenterFolder) {
        this.vcenterFolder = vcenterFolder;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vcenter server configuration.
     * It is a reference to an object of type vcenterserver.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterRef
     */
    public String getVcenterRef() {
        return vcenterRef;
    }

    /**
     * This is the setter method to the attribute.
     * Vcenter server configuration.
     * It is a reference to an object of type vcenterserver.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterRef set the vcenterRef.
     */
    public void setVcenterRef(String  vcenterRef) {
        this.vcenterRef = vcenterRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PlacementScopeConfig objPlacementScopeConfig = (PlacementScopeConfig) o;
      return   Objects.equals(this.vcenterRef, objPlacementScopeConfig.vcenterRef)&&
  Objects.equals(this.vcenterFolder, objPlacementScopeConfig.vcenterFolder)&&
  Objects.equals(this.nsxtHosts, objPlacementScopeConfig.nsxtHosts)&&
  Objects.equals(this.nsxtDatastores, objPlacementScopeConfig.nsxtDatastores)&&
  Objects.equals(this.nsxtClusters, objPlacementScopeConfig.nsxtClusters)&&
  Objects.equals(this.clusters, objPlacementScopeConfig.clusters);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PlacementScopeConfig {\n");
                  sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
                        sb.append("    nsxtClusters: ").append(toIndentedString(nsxtClusters)).append("\n");
                        sb.append("    nsxtDatastores: ").append(toIndentedString(nsxtDatastores)).append("\n");
                        sb.append("    nsxtHosts: ").append(toIndentedString(nsxtHosts)).append("\n");
                        sb.append("    vcenterFolder: ").append(toIndentedString(vcenterFolder)).append("\n");
                        sb.append("    vcenterRef: ").append(toIndentedString(vcenterRef)).append("\n");
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
