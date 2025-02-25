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
 * The PoolGroup is a POJO class extends AviRestResource that used for creating
 * PoolGroup.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PoolGroup extends AviRestResource  {
    @JsonProperty("cloud_config_cksum")
    private String cloudConfigCksum;

    @JsonProperty("cloud_ref")
    private String cloudRef;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("deactivate_primary_pool_on_down")
    private Boolean deactivatePrimaryPoolOnDown = false;

    @JsonProperty("deployment_policy_ref")
    private String deploymentPolicyRef;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enable_http2")
    private Boolean enableHttp2;

    @JsonProperty("fail_action")
    private FailAction failAction;

    @JsonProperty("implicit_priority_labels")
    private Boolean implicitPriorityLabels = false;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("members")
    private List<PoolGroupMember> members;

    @JsonProperty("min_servers")
    private Integer minServers = 0;

    @JsonProperty("name")
    private String name;

    @JsonProperty("priority_labels_ref")
    private String priorityLabelsRef;

    @JsonProperty("service_metadata")
    private String serviceMetadata;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Checksum of cloud configuration for poolgroup.
     * Internally set by cloud connector.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudConfigCksum
     */
    public String getCloudConfigCksum() {
        return cloudConfigCksum;
    }

    /**
     * This is the setter method to the attribute.
     * Checksum of cloud configuration for poolgroup.
     * Internally set by cloud connector.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudConfigCksum set the cloudConfigCksum.
     */
    public void setCloudConfigCksum(String  cloudConfigCksum) {
        this.cloudConfigCksum = cloudConfigCksum;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudRef
     */
    public String getCloudRef() {
        return cloudRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudRef set the cloudRef.
     */
    public void setCloudRef(String  cloudRef) {
        this.cloudRef = cloudRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the user who created the object.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the user who created the object.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param createdBy set the createdBy.
     */
    public void setCreatedBy(String  createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deactivate primary pool for selection when down until it is activated by user via clear poolgroup command.
     * Field introduced in 20.1.7, 21.1.2, 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return deactivatePrimaryPoolOnDown
     */
    public Boolean getDeactivatePrimaryPoolOnDown() {
        return deactivatePrimaryPoolOnDown;
    }

    /**
     * This is the setter method to the attribute.
     * Deactivate primary pool for selection when down until it is activated by user via clear poolgroup command.
     * Field introduced in 20.1.7, 21.1.2, 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param deactivatePrimaryPoolOnDown set the deactivatePrimaryPoolOnDown.
     */
    public void setDeactivatePrimaryPoolOnDown(Boolean  deactivatePrimaryPoolOnDown) {
        this.deactivatePrimaryPoolOnDown = deactivatePrimaryPoolOnDown;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When setup autoscale manager will automatically promote new pools into production when deployment goals are met.
     * It is a reference to an object of type poolgroupdeploymentpolicy.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return deploymentPolicyRef
     */
    public String getDeploymentPolicyRef() {
        return deploymentPolicyRef;
    }

    /**
     * This is the setter method to the attribute.
     * When setup autoscale manager will automatically promote new pools into production when deployment goals are met.
     * It is a reference to an object of type poolgroupdeploymentpolicy.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param deploymentPolicyRef set the deploymentPolicyRef.
     */
    public void setDeploymentPolicyRef(String  deploymentPolicyRef) {
        this.deploymentPolicyRef = deploymentPolicyRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description of pool group.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Description of pool group.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable http/2 for traffic from virtualservice to all the backend servers in all the pools configured under this poolgroup.
     * Field deprecated in 30.2.1.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * @return enableHttp2
     */
    public Boolean getEnableHttp2() {
        return enableHttp2;
    }

    /**
     * This is the setter method to the attribute.
     * Enable http/2 for traffic from virtualservice to all the backend servers in all the pools configured under this poolgroup.
     * Field deprecated in 30.2.1.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * @param enableHttp2 set the enableHttp2.
     */
    public void setEnableHttp2(Boolean  enableHttp2) {
        this.enableHttp2 = enableHttp2;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable an action - close connection, http redirect, or local http response - when a pool group failure happens.
     * By default, a connection will be closed, in case the pool group experiences a failure.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return failAction
     */
    public FailAction getFailAction() {
        return failAction;
    }

    /**
     * This is the setter method to the attribute.
     * Enable an action - close connection, http redirect, or local http response - when a pool group failure happens.
     * By default, a connection will be closed, in case the pool group experiences a failure.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param failAction set the failAction.
     */
    public void setFailAction(FailAction failAction) {
        this.failAction = failAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Whether an implicit set of priority labels is generated.
     * Field introduced in 17.1.9,17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return implicitPriorityLabels
     */
    public Boolean getImplicitPriorityLabels() {
        return implicitPriorityLabels;
    }

    /**
     * This is the setter method to the attribute.
     * Whether an implicit set of priority labels is generated.
     * Field introduced in 17.1.9,17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param implicitPriorityLabels set the implicitPriorityLabels.
     */
    public void setImplicitPriorityLabels(Boolean  implicitPriorityLabels) {
        this.implicitPriorityLabels = implicitPriorityLabels;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public List<RoleFilterMatchLabel> getMarkers() {
        return markers;
    }

    /**
     * This is the setter method. this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public void setMarkers(List<RoleFilterMatchLabel>  markers) {
        this.markers = markers;
    }

    /**
     * This is the setter method this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public PoolGroup addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of pool group members object of type poolgroupmember.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return members
     */
    public List<PoolGroupMember> getMembers() {
        return members;
    }

    /**
     * This is the setter method. this will set the members
     * List of pool group members object of type poolgroupmember.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return members
     */
    public void setMembers(List<PoolGroupMember>  members) {
        this.members = members;
    }

    /**
     * This is the setter method this will set the members
     * List of pool group members object of type poolgroupmember.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return members
     */
    public PoolGroup addMembersItem(PoolGroupMember membersItem) {
      if (this.members == null) {
        this.members = new ArrayList<PoolGroupMember>();
      }
      this.members.add(membersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The minimum number of servers to distribute traffic to.
     * Allowed values are 1-65535.
     * Special values are 0 - disable.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return minServers
     */
    public Integer getMinServers() {
        return minServers;
    }

    /**
     * This is the setter method to the attribute.
     * The minimum number of servers to distribute traffic to.
     * Allowed values are 1-65535.
     * Special values are 0 - disable.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param minServers set the minServers.
     */
    public void setMinServers(Integer  minServers) {
        this.minServers = minServers;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the pool group.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the pool group.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the priority labels.
     * If not provided, pool group member priority label will be interpreted as a number with a larger number considered higher priority.
     * It is a reference to an object of type prioritylabels.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return priorityLabelsRef
     */
    public String getPriorityLabelsRef() {
        return priorityLabelsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the priority labels.
     * If not provided, pool group member priority label will be interpreted as a number with a larger number considered higher priority.
     * It is a reference to an object of type prioritylabels.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param priorityLabelsRef set the priorityLabelsRef.
     */
    public void setPriorityLabelsRef(String  priorityLabelsRef) {
        this.priorityLabelsRef = priorityLabelsRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Metadata pertaining to the service provided by this poolgroup.
     * In openshift/kubernetes environments, app metadata info is stored.
     * Any user input to this field will be overwritten by avi vantage.
     * Field introduced in 17.2.14,18.1.5,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceMetadata
     */
    public String getServiceMetadata() {
        return serviceMetadata;
    }

    /**
     * This is the setter method to the attribute.
     * Metadata pertaining to the service provided by this poolgroup.
     * In openshift/kubernetes environments, app metadata info is stored.
     * Any user input to this field will be overwritten by avi vantage.
     * Field introduced in 17.2.14,18.1.5,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceMetadata set the serviceMetadata.
     */
    public void setServiceMetadata(String  serviceMetadata) {
        this.serviceMetadata = serviceMetadata;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the pool group.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the pool group.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PoolGroup objPoolGroup = (PoolGroup) o;
      return   Objects.equals(this.uuid, objPoolGroup.uuid)&&
  Objects.equals(this.name, objPoolGroup.name)&&
  Objects.equals(this.members, objPoolGroup.members)&&
  Objects.equals(this.priorityLabelsRef, objPoolGroup.priorityLabelsRef)&&
  Objects.equals(this.minServers, objPoolGroup.minServers)&&
  Objects.equals(this.deploymentPolicyRef, objPoolGroup.deploymentPolicyRef)&&
  Objects.equals(this.failAction, objPoolGroup.failAction)&&
  Objects.equals(this.implicitPriorityLabels, objPoolGroup.implicitPriorityLabels)&&
  Objects.equals(this.serviceMetadata, objPoolGroup.serviceMetadata)&&
  Objects.equals(this.markers, objPoolGroup.markers)&&
  Objects.equals(this.createdBy, objPoolGroup.createdBy)&&
  Objects.equals(this.cloudConfigCksum, objPoolGroup.cloudConfigCksum)&&
  Objects.equals(this.description, objPoolGroup.description)&&
  Objects.equals(this.tenantRef, objPoolGroup.tenantRef)&&
  Objects.equals(this.cloudRef, objPoolGroup.cloudRef)&&
  Objects.equals(this.enableHttp2, objPoolGroup.enableHttp2)&&
  Objects.equals(this.deactivatePrimaryPoolOnDown, objPoolGroup.deactivatePrimaryPoolOnDown);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PoolGroup {\n");
                  sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
                        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
                        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
                        sb.append("    deactivatePrimaryPoolOnDown: ").append(toIndentedString(deactivatePrimaryPoolOnDown)).append("\n");
                        sb.append("    deploymentPolicyRef: ").append(toIndentedString(deploymentPolicyRef)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    enableHttp2: ").append(toIndentedString(enableHttp2)).append("\n");
                        sb.append("    failAction: ").append(toIndentedString(failAction)).append("\n");
                        sb.append("    implicitPriorityLabels: ").append(toIndentedString(implicitPriorityLabels)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    members: ").append(toIndentedString(members)).append("\n");
                        sb.append("    minServers: ").append(toIndentedString(minServers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    priorityLabelsRef: ").append(toIndentedString(priorityLabelsRef)).append("\n");
                        sb.append("    serviceMetadata: ").append(toIndentedString(serviceMetadata)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
