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
 * The SeResources is a POJO class extends AviRestResource that used for creating
 * SeResources.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeResources  {
    @JsonProperty("cores_per_socket")
    private Integer coresPerSocket;

    @JsonProperty("disk")
    private Integer disk;

    @JsonProperty("hyper_threading")
    private Boolean hyperThreading;

    @JsonProperty("hypervisor_mode")
    private Boolean hypervisorMode;

    @JsonProperty("memory")
    private Integer memory;

    @JsonProperty("num_datapath_processes")
    private Integer numDatapathProcesses;

    @JsonProperty("num_vcpus")
    private Integer numVcpus;

    @JsonProperty("sockets")
    private Integer sockets;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return coresPerSocket
     */
    public Integer getCoresPerSocket() {
        return coresPerSocket;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param coresPerSocket set the coresPerSocket.
     */
    public void setCoresPerSocket(Integer  coresPerSocket) {
        this.coresPerSocket = coresPerSocket;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return disk
     */
    public Integer getDisk() {
        return disk;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param disk set the disk.
     */
    public void setDisk(Integer  disk) {
        this.disk = disk;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hyperThreading
     */
    public Boolean getHyperThreading() {
        return hyperThreading;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hyperThreading set the hyperThreading.
     */
    public void setHyperThreading(Boolean  hyperThreading) {
        this.hyperThreading = hyperThreading;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates that the se is running on a virtual machine.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hypervisorMode
     */
    public Boolean getHypervisorMode() {
        return hypervisorMode;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates that the se is running on a virtual machine.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hypervisorMode set the hypervisorMode.
     */
    public void setHypervisorMode(Boolean  hypervisorMode) {
        this.hypervisorMode = hypervisorMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param memory set the memory.
     */
    public void setMemory(Integer  memory) {
        this.memory = memory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates the number of active datapath processes.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numDatapathProcesses
     */
    public Integer getNumDatapathProcesses() {
        return numDatapathProcesses;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates the number of active datapath processes.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numDatapathProcesses set the numDatapathProcesses.
     */
    public void setNumDatapathProcesses(Integer  numDatapathProcesses) {
        this.numDatapathProcesses = numDatapathProcesses;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVcpus
     */
    public Integer getNumVcpus() {
        return numVcpus;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVcpus set the numVcpus.
     */
    public void setNumVcpus(Integer  numVcpus) {
        this.numVcpus = numVcpus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sockets
     */
    public Integer getSockets() {
        return sockets;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sockets set the sockets.
     */
    public void setSockets(Integer  sockets) {
        this.sockets = sockets;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeResources objSeResources = (SeResources) o;
      return   Objects.equals(this.numVcpus, objSeResources.numVcpus)&&
  Objects.equals(this.memory, objSeResources.memory)&&
  Objects.equals(this.disk, objSeResources.disk)&&
  Objects.equals(this.hyperThreading, objSeResources.hyperThreading)&&
  Objects.equals(this.sockets, objSeResources.sockets)&&
  Objects.equals(this.coresPerSocket, objSeResources.coresPerSocket)&&
  Objects.equals(this.hypervisorMode, objSeResources.hypervisorMode)&&
  Objects.equals(this.numDatapathProcesses, objSeResources.numDatapathProcesses);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeResources {\n");
                  sb.append("    coresPerSocket: ").append(toIndentedString(coresPerSocket)).append("\n");
                        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
                        sb.append("    hyperThreading: ").append(toIndentedString(hyperThreading)).append("\n");
                        sb.append("    hypervisorMode: ").append(toIndentedString(hypervisorMode)).append("\n");
                        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
                        sb.append("    numDatapathProcesses: ").append(toIndentedString(numDatapathProcesses)).append("\n");
                        sb.append("    numVcpus: ").append(toIndentedString(numVcpus)).append("\n");
                        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
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
