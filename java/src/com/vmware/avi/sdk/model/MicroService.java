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
 * The MicroService is a POJO class extends AviRestResource that used for creating
 * MicroService.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MicroService extends AviRestResource  {
    @JsonProperty("application_name")
    private String applicationName;

    @JsonProperty("cloud_config_cksum")
    private String cloudConfigCksum;

    @JsonProperty("containers")
    private List<MicroServiceContainer> containers;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("description")
    private String description;

    @JsonProperty("ip_list")
    private Boolean ipList;

    @JsonProperty("name")
    private String name;

    @JsonProperty("orchestrator_name")
    private String orchestratorName;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param applicationName set the applicationName.
     */
    public void setApplicationName(String  applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Checksum of cloud configuration for microservice.
     * Internally set by cloud connector.
     * Field introduced in 17.2.8.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudConfigCksum
     */
    public String getCloudConfigCksum() {
        return cloudConfigCksum;
    }

    /**
     * This is the setter method to the attribute.
     * Checksum of cloud configuration for microservice.
     * Internally set by cloud connector.
     * Field introduced in 17.2.8.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudConfigCksum set the cloudConfigCksum.
     */
    public void setCloudConfigCksum(String  cloudConfigCksum) {
        this.cloudConfigCksum = cloudConfigCksum;
    }
    /**
     * This is the getter method this will return the attribute value.
     * The list of containers for this microservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return containers
     */
    public List<MicroServiceContainer> getContainers() {
        return containers;
    }

    /**
     * This is the setter method. this will set the containers
     * The list of containers for this microservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return containers
     */
    public void setContainers(List<MicroServiceContainer>  containers) {
        this.containers = containers;
    }

    /**
     * This is the setter method this will set the containers
     * The list of containers for this microservice.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return containers
     */
    public MicroService addContainersItem(MicroServiceContainer containersItem) {
      if (this.containers == null) {
        this.containers = new ArrayList<MicroServiceContainer>();
      }
      this.containers.add(containersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Creator name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This is the setter method to the attribute.
     * Creator name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param createdBy set the createdBy.
     */
    public void setCreatedBy(String  createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flag to indicate if container ip list is provided by cloud connectorthis is applicable for overlay cases.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipList
     */
    public Boolean getIpList() {
        return ipList;
    }

    /**
     * This is the setter method to the attribute.
     * Flag to indicate if container ip list is provided by cloud connectorthis is applicable for overlay cases.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipList set the ipList.
     */
    public void setIpList(Boolean  ipList) {
        this.ipList = ipList;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return orchestratorName
     */
    public String getOrchestratorName() {
        return orchestratorName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param orchestratorName set the orchestratorName.
     */
    public void setOrchestratorName(String  orchestratorName) {
        this.orchestratorName = orchestratorName;
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
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
      MicroService objMicroService = (MicroService) o;
      return   Objects.equals(this.uuid, objMicroService.uuid)&&
  Objects.equals(this.name, objMicroService.name)&&
  Objects.equals(this.orchestratorName, objMicroService.orchestratorName)&&
  Objects.equals(this.applicationName, objMicroService.applicationName)&&
  Objects.equals(this.ipList, objMicroService.ipList)&&
  Objects.equals(this.containers, objMicroService.containers)&&
  Objects.equals(this.createdBy, objMicroService.createdBy)&&
  Objects.equals(this.cloudConfigCksum, objMicroService.cloudConfigCksum)&&
  Objects.equals(this.description, objMicroService.description)&&
  Objects.equals(this.tenantRef, objMicroService.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MicroService {\n");
                  sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
                        sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
                        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
                        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    orchestratorName: ").append(toIndentedString(orchestratorName)).append("\n");
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
