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
 * The VIMgrHostRuntime is a POJO class extends AviRestResource that used for creating
 * VIMgrHostRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VIMgrHostRuntime extends AviRestResource  {
    @JsonProperty("cloud_ref")
    private String cloudRef;

    @JsonProperty("cluster_name")
    private String clusterName;

    @JsonProperty("cluster_uuid")
    private String clusterUuid;

    @JsonProperty("cntlr_accessible")
    private Boolean cntlrAccessible = true;

    @JsonProperty("connection_state")
    private String connectionState = "connected";

    @JsonProperty("cpu_hz")
    private Integer cpuHz;

    @JsonProperty("maintenance_mode")
    private Boolean maintenanceMode;

    @JsonProperty("managed_object_id")
    private String managedObjectId;

    @JsonProperty("mem")
    private Integer mem;

    @JsonProperty("mgmt_portgroup")
    private String mgmtPortgroup;

    @JsonProperty("name")
    private String name;

    @JsonProperty("network_uuids")
    private List<String> networkUuids;

    @JsonProperty("num_cpu_cores")
    private Integer numCpuCores;

    @JsonProperty("num_cpu_packages")
    private Integer numCpuPackages;

    @JsonProperty("num_cpu_threads")
    private Integer numCpuThreads;

    @JsonProperty("pnics")
    private List<CdpLldpInfo> pnics;

    @JsonProperty("powerstate")
    private String powerstate;

    @JsonProperty("quarantine_start_ts")
    private String quarantineStartTs;

    @JsonProperty("quarantined")
    private Boolean quarantined;

    @JsonProperty("quarantined_periods")
    private Integer quarantinedPeriods = 1;

    @JsonProperty("se_fail_cnt")
    private Integer seFailCnt;

    @JsonProperty("se_success_cnt")
    private Integer seSuccessCnt;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("type")
    private String type;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("vm_refs")
    private List<String> vmRefs;



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
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterName set the clusterName.
     */
    public void setClusterName(String  clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterUuid
     */
    public String getClusterUuid() {
        return clusterUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterUuid set the clusterUuid.
     */
    public void setClusterUuid(String  clusterUuid) {
        this.clusterUuid = clusterUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return cntlrAccessible
     */
    public Boolean getCntlrAccessible() {
        return cntlrAccessible;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param cntlrAccessible set the cntlrAccessible.
     */
    public void setCntlrAccessible(Boolean  cntlrAccessible) {
        this.cntlrAccessible = cntlrAccessible;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "connected".
     * @return connectionState
     */
    public String getConnectionState() {
        return connectionState;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "connected".
     * @param connectionState set the connectionState.
     */
    public void setConnectionState(String  connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cpuHz
     */
    public Integer getCpuHz() {
        return cpuHz;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cpuHz set the cpuHz.
     */
    public void setCpuHz(Integer  cpuHz) {
        this.cpuHz = cpuHz;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maintenanceMode
     */
    public Boolean getMaintenanceMode() {
        return maintenanceMode;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maintenanceMode set the maintenanceMode.
     */
    public void setMaintenanceMode(Boolean  maintenanceMode) {
        this.maintenanceMode = maintenanceMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return managedObjectId
     */
    public String getManagedObjectId() {
        return managedObjectId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param managedObjectId set the managedObjectId.
     */
    public void setManagedObjectId(String  managedObjectId) {
        this.managedObjectId = managedObjectId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mem
     */
    public Integer getMem() {
        return mem;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mem set the mem.
     */
    public void setMem(Integer  mem) {
        this.mem = mem;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtPortgroup
     */
    public String getMgmtPortgroup() {
        return mgmtPortgroup;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtPortgroup set the mgmtPortgroup.
     */
    public void setMgmtPortgroup(String  mgmtPortgroup) {
        this.mgmtPortgroup = mgmtPortgroup;
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
     * @return networkUuids
     */
    public List<String> getNetworkUuids() {
        return networkUuids;
    }

    /**
     * This is the setter method. this will set the networkUuids
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networkUuids
     */
    public void setNetworkUuids(List<String>  networkUuids) {
        this.networkUuids = networkUuids;
    }

    /**
     * This is the setter method this will set the networkUuids
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networkUuids
     */
    public VIMgrHostRuntime addNetworkUuidsItem(String networkUuidsItem) {
      if (this.networkUuids == null) {
        this.networkUuids = new ArrayList<String>();
      }
      this.networkUuids.add(networkUuidsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numCpuCores
     */
    public Integer getNumCpuCores() {
        return numCpuCores;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numCpuCores set the numCpuCores.
     */
    public void setNumCpuCores(Integer  numCpuCores) {
        this.numCpuCores = numCpuCores;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numCpuPackages
     */
    public Integer getNumCpuPackages() {
        return numCpuPackages;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numCpuPackages set the numCpuPackages.
     */
    public void setNumCpuPackages(Integer  numCpuPackages) {
        this.numCpuPackages = numCpuPackages;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numCpuThreads
     */
    public Integer getNumCpuThreads() {
        return numCpuThreads;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numCpuThreads set the numCpuThreads.
     */
    public void setNumCpuThreads(Integer  numCpuThreads) {
        this.numCpuThreads = numCpuThreads;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pnics
     */
    public List<CdpLldpInfo> getPnics() {
        return pnics;
    }

    /**
     * This is the setter method. this will set the pnics
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pnics
     */
    public void setPnics(List<CdpLldpInfo>  pnics) {
        this.pnics = pnics;
    }

    /**
     * This is the setter method this will set the pnics
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pnics
     */
    public VIMgrHostRuntime addPnicsItem(CdpLldpInfo pnicsItem) {
      if (this.pnics == null) {
        this.pnics = new ArrayList<CdpLldpInfo>();
      }
      this.pnics.add(pnicsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return powerstate
     */
    public String getPowerstate() {
        return powerstate;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param powerstate set the powerstate.
     */
    public void setPowerstate(String  powerstate) {
        this.powerstate = powerstate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return quarantineStartTs
     */
    public String getQuarantineStartTs() {
        return quarantineStartTs;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param quarantineStartTs set the quarantineStartTs.
     */
    public void setQuarantineStartTs(String  quarantineStartTs) {
        this.quarantineStartTs = quarantineStartTs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return quarantined
     */
    public Boolean getQuarantined() {
        return quarantined;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param quarantined set the quarantined.
     */
    public void setQuarantined(Boolean  quarantined) {
        this.quarantined = quarantined;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return quarantinedPeriods
     */
    public Integer getQuarantinedPeriods() {
        return quarantinedPeriods;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param quarantinedPeriods set the quarantinedPeriods.
     */
    public void setQuarantinedPeriods(Integer  quarantinedPeriods) {
        this.quarantinedPeriods = quarantinedPeriods;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seFailCnt
     */
    public Integer getSeFailCnt() {
        return seFailCnt;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seFailCnt set the seFailCnt.
     */
    public void setSeFailCnt(Integer  seFailCnt) {
        this.seFailCnt = seFailCnt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seSuccessCnt
     */
    public Integer getSeSuccessCnt() {
        return seSuccessCnt;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seSuccessCnt set the seSuccessCnt.
     */
    public void setSeSuccessCnt(Integer  seSuccessCnt) {
        this.seSuccessCnt = seSuccessCnt;
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
     * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
     * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
     * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
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
    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type vimgrvmruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmRefs
     */
    public List<String> getVmRefs() {
        return vmRefs;
    }

    /**
     * This is the setter method. this will set the vmRefs
     * It is a reference to an object of type vimgrvmruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmRefs
     */
    public void setVmRefs(List<String>  vmRefs) {
        this.vmRefs = vmRefs;
    }

    /**
     * This is the setter method this will set the vmRefs
     * It is a reference to an object of type vimgrvmruntime.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmRefs
     */
    public VIMgrHostRuntime addVmRefsItem(String vmRefsItem) {
      if (this.vmRefs == null) {
        this.vmRefs = new ArrayList<String>();
      }
      this.vmRefs.add(vmRefsItem);
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
      VIMgrHostRuntime objVIMgrHostRuntime = (VIMgrHostRuntime) o;
      return   Objects.equals(this.type, objVIMgrHostRuntime.type)&&
  Objects.equals(this.uuid, objVIMgrHostRuntime.uuid)&&
  Objects.equals(this.name, objVIMgrHostRuntime.name)&&
  Objects.equals(this.managedObjectId, objVIMgrHostRuntime.managedObjectId)&&
  Objects.equals(this.clusterName, objVIMgrHostRuntime.clusterName)&&
  Objects.equals(this.clusterUuid, objVIMgrHostRuntime.clusterUuid)&&
  Objects.equals(this.numCpuPackages, objVIMgrHostRuntime.numCpuPackages)&&
  Objects.equals(this.numCpuCores, objVIMgrHostRuntime.numCpuCores)&&
  Objects.equals(this.numCpuThreads, objVIMgrHostRuntime.numCpuThreads)&&
  Objects.equals(this.cpuHz, objVIMgrHostRuntime.cpuHz)&&
  Objects.equals(this.mem, objVIMgrHostRuntime.mem)&&
  Objects.equals(this.pnics, objVIMgrHostRuntime.pnics)&&
  Objects.equals(this.vmRefs, objVIMgrHostRuntime.vmRefs)&&
  Objects.equals(this.mgmtPortgroup, objVIMgrHostRuntime.mgmtPortgroup)&&
  Objects.equals(this.powerstate, objVIMgrHostRuntime.powerstate)&&
  Objects.equals(this.maintenanceMode, objVIMgrHostRuntime.maintenanceMode)&&
  Objects.equals(this.connectionState, objVIMgrHostRuntime.connectionState)&&
  Objects.equals(this.quarantined, objVIMgrHostRuntime.quarantined)&&
  Objects.equals(this.quarantineStartTs, objVIMgrHostRuntime.quarantineStartTs)&&
  Objects.equals(this.quarantinedPeriods, objVIMgrHostRuntime.quarantinedPeriods)&&
  Objects.equals(this.cntlrAccessible, objVIMgrHostRuntime.cntlrAccessible)&&
  Objects.equals(this.networkUuids, objVIMgrHostRuntime.networkUuids)&&
  Objects.equals(this.seFailCnt, objVIMgrHostRuntime.seFailCnt)&&
  Objects.equals(this.seSuccessCnt, objVIMgrHostRuntime.seSuccessCnt)&&
  Objects.equals(this.tenantRef, objVIMgrHostRuntime.tenantRef)&&
  Objects.equals(this.cloudRef, objVIMgrHostRuntime.cloudRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VIMgrHostRuntime {\n");
                  sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
                        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
                        sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
                        sb.append("    cntlrAccessible: ").append(toIndentedString(cntlrAccessible)).append("\n");
                        sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
                        sb.append("    cpuHz: ").append(toIndentedString(cpuHz)).append("\n");
                        sb.append("    maintenanceMode: ").append(toIndentedString(maintenanceMode)).append("\n");
                        sb.append("    managedObjectId: ").append(toIndentedString(managedObjectId)).append("\n");
                        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
                        sb.append("    mgmtPortgroup: ").append(toIndentedString(mgmtPortgroup)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    networkUuids: ").append(toIndentedString(networkUuids)).append("\n");
                        sb.append("    numCpuCores: ").append(toIndentedString(numCpuCores)).append("\n");
                        sb.append("    numCpuPackages: ").append(toIndentedString(numCpuPackages)).append("\n");
                        sb.append("    numCpuThreads: ").append(toIndentedString(numCpuThreads)).append("\n");
                        sb.append("    pnics: ").append(toIndentedString(pnics)).append("\n");
                        sb.append("    powerstate: ").append(toIndentedString(powerstate)).append("\n");
                        sb.append("    quarantineStartTs: ").append(toIndentedString(quarantineStartTs)).append("\n");
                        sb.append("    quarantined: ").append(toIndentedString(quarantined)).append("\n");
                        sb.append("    quarantinedPeriods: ").append(toIndentedString(quarantinedPeriods)).append("\n");
                        sb.append("    seFailCnt: ").append(toIndentedString(seFailCnt)).append("\n");
                        sb.append("    seSuccessCnt: ").append(toIndentedString(seSuccessCnt)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    vmRefs: ").append(toIndentedString(vmRefs)).append("\n");
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
