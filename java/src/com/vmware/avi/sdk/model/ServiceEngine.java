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
 * The ServiceEngine is a POJO class extends AviRestResource that used for creating
 * ServiceEngine.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEngine extends AviRestResource  {
    @JsonProperty("availability_zone")
    private String availabilityZone;

    @JsonProperty("cloud_ref")
    private String cloudRef;

    @JsonProperty("container_mode")
    private Boolean containerMode = false;

    @JsonProperty("container_type")
    private String containerType = "CONTAINER_TYPE_HOST";

    @JsonProperty("controller_created")
    private Boolean controllerCreated = false;

    @JsonProperty("controller_ip")
    private String controllerIp;

    @JsonProperty("data_vnics")
    private List<vNIC> dataVnics;

    @JsonProperty("enable_state")
    private String enableState = "SE_STATE_ENABLED";

    @JsonProperty("flavor")
    private String flavor;

    @JsonProperty("host_ref")
    private String hostRef;

    @JsonProperty("hypervisor")
    private String hypervisor;

    @JsonProperty("mgmt_vnic")
    private vNIC mgmtVnic;

    @JsonProperty("name")
    private String name = "VM name unknown";

    @JsonProperty("nsxt_no_hotplug")
    private Boolean nsxtNoHotplug;

    @JsonProperty("resources")
    private SeResources resources;

    @JsonProperty("se_group_ref")
    private String seGroupRef;

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
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param availabilityZone set the availabilityZone.
     */
    public void setAvailabilityZone(String  availabilityZone) {
        this.availabilityZone = availabilityZone;
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return containerMode
     */
    public Boolean getContainerMode() {
        return containerMode;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param containerMode set the containerMode.
     */
    public void setContainerMode(Boolean  containerMode) {
        this.containerMode = containerMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - CONTAINER_TYPE_BRIDGE, CONTAINER_TYPE_HOST, CONTAINER_TYPE_HOST_DPDK.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "CONTAINER_TYPE_HOST".
     * @return containerType
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - CONTAINER_TYPE_BRIDGE, CONTAINER_TYPE_HOST, CONTAINER_TYPE_HOST_DPDK.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "CONTAINER_TYPE_HOST".
     * @param containerType set the containerType.
     */
    public void setContainerType(String  containerType) {
        this.containerType = containerType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return controllerCreated
     */
    public Boolean getControllerCreated() {
        return controllerCreated;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param controllerCreated set the controllerCreated.
     */
    public void setControllerCreated(Boolean  controllerCreated) {
        this.controllerCreated = controllerCreated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerIp
     */
    public String getControllerIp() {
        return controllerIp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerIp set the controllerIp.
     */
    public void setControllerIp(String  controllerIp) {
        this.controllerIp = controllerIp;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dataVnics
     */
    public List<vNIC> getDataVnics() {
        return dataVnics;
    }

    /**
     * This is the setter method. this will set the dataVnics
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dataVnics
     */
    public void setDataVnics(List<vNIC>  dataVnics) {
        this.dataVnics = dataVnics;
    }

    /**
     * This is the setter method this will set the dataVnics
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dataVnics
     */
    public ServiceEngine addDataVnicsItem(vNIC dataVnicsItem) {
      if (this.dataVnics == null) {
        this.dataVnics = new ArrayList<vNIC>();
      }
      this.dataVnics.add(dataVnicsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Inorder to disable se set this field appropriately.
     * Enum options - SE_STATE_ENABLED, SE_STATE_DISABLED_FOR_PLACEMENT, SE_STATE_DISABLED, SE_STATE_DISABLED_FORCE.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SE_STATE_ENABLED".
     * @return enableState
     */
    public String getEnableState() {
        return enableState;
    }

    /**
     * This is the setter method to the attribute.
     * Inorder to disable se set this field appropriately.
     * Enum options - SE_STATE_ENABLED, SE_STATE_DISABLED_FOR_PLACEMENT, SE_STATE_DISABLED, SE_STATE_DISABLED_FORCE.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SE_STATE_ENABLED".
     * @param enableState set the enableState.
     */
    public void setEnableState(String  enableState) {
        this.enableState = enableState;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param flavor set the flavor.
     */
    public void setFlavor(String  flavor) {
        this.flavor = flavor;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type vimgrhostruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostRef
     */
    public String getHostRef() {
        return hostRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type vimgrhostruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostRef set the hostRef.
     */
    public void setHostRef(String  hostRef) {
        this.hostRef = hostRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hypervisor
     */
    public String getHypervisor() {
        return hypervisor;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hypervisor set the hypervisor.
     */
    public void setHypervisor(String  hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtVnic
     */
    public vNIC getMgmtVnic() {
        return mgmtVnic;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtVnic set the mgmtVnic.
     */
    public void setMgmtVnic(vNIC mgmtVnic) {
        this.mgmtVnic = mgmtVnic;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "VM name unknown".
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "VM name unknown".
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If set to true, controller does not hotplugg the vnics.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtNoHotplug
     */
    public Boolean getNsxtNoHotplug() {
        return nsxtNoHotplug;
    }

    /**
     * This is the setter method to the attribute.
     * If set to true, controller does not hotplugg the vnics.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtNoHotplug set the nsxtNoHotplug.
     */
    public void setNsxtNoHotplug(Boolean  nsxtNoHotplug) {
        this.nsxtNoHotplug = nsxtNoHotplug;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resources
     */
    public SeResources getResources() {
        return resources;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resources set the resources.
     */
    public void setResources(SeResources resources) {
        this.resources = resources;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceenginegroup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupRef
     */
    public String getSeGroupRef() {
        return seGroupRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type serviceenginegroup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroupRef set the seGroupRef.
     */
    public void setSeGroupRef(String  seGroupRef) {
        this.seGroupRef = seGroupRef;
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
      ServiceEngine objServiceEngine = (ServiceEngine) o;
      return   Objects.equals(this.uuid, objServiceEngine.uuid)&&
  Objects.equals(this.name, objServiceEngine.name)&&
  Objects.equals(this.tenantRef, objServiceEngine.tenantRef)&&
  Objects.equals(this.cloudRef, objServiceEngine.cloudRef)&&
  Objects.equals(this.mgmtVnic, objServiceEngine.mgmtVnic)&&
  Objects.equals(this.resources, objServiceEngine.resources)&&
  Objects.equals(this.dataVnics, objServiceEngine.dataVnics)&&
  Objects.equals(this.controllerIp, objServiceEngine.controllerIp)&&
  Objects.equals(this.hostRef, objServiceEngine.hostRef)&&
  Objects.equals(this.controllerCreated, objServiceEngine.controllerCreated)&&
  Objects.equals(this.seGroupRef, objServiceEngine.seGroupRef)&&
  Objects.equals(this.containerMode, objServiceEngine.containerMode)&&
  Objects.equals(this.flavor, objServiceEngine.flavor)&&
  Objects.equals(this.hypervisor, objServiceEngine.hypervisor)&&
  Objects.equals(this.availabilityZone, objServiceEngine.availabilityZone)&&
  Objects.equals(this.enableState, objServiceEngine.enableState)&&
  Objects.equals(this.containerType, objServiceEngine.containerType)&&
  Objects.equals(this.nsxtNoHotplug, objServiceEngine.nsxtNoHotplug);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ServiceEngine {\n");
                  sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
                        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
                        sb.append("    containerMode: ").append(toIndentedString(containerMode)).append("\n");
                        sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
                        sb.append("    controllerCreated: ").append(toIndentedString(controllerCreated)).append("\n");
                        sb.append("    controllerIp: ").append(toIndentedString(controllerIp)).append("\n");
                        sb.append("    dataVnics: ").append(toIndentedString(dataVnics)).append("\n");
                        sb.append("    enableState: ").append(toIndentedString(enableState)).append("\n");
                        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
                        sb.append("    hostRef: ").append(toIndentedString(hostRef)).append("\n");
                        sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
                        sb.append("    mgmtVnic: ").append(toIndentedString(mgmtVnic)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    nsxtNoHotplug: ").append(toIndentedString(nsxtNoHotplug)).append("\n");
                        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
                        sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
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
