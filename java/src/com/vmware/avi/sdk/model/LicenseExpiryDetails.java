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
 * The LicenseExpiryDetails is a POJO class extends AviRestResource that used for creating
 * LicenseExpiryDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseExpiryDetails  {
    @JsonProperty("backend_servers")
    private Integer backendServers;

    @JsonProperty("burst_cores")
    private Integer burstCores;

    @JsonProperty("cores")
    private Integer cores;

    @JsonProperty("cpu_cores")
    private Float cpuCores;

    @JsonProperty("expiry_at")
    private String expiryAt;

    @JsonProperty("license_id")
    private String licenseId;

    @JsonProperty("license_tier")
    private List<String> licenseTier;

    @JsonProperty("license_type")
    private String licenseType;

    @JsonProperty("max_apps")
    private Integer maxApps;

    @JsonProperty("max_ses")
    private Integer maxSes;

    @JsonProperty("name")
    private String name;

    @JsonProperty("service_cores")
    private Float serviceCores;

    @JsonProperty("sockets")
    private Integer sockets;

    @JsonProperty("throughput")
    private Integer throughput;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return backendServers
     */
    public Integer getBackendServers() {
        return backendServers;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param backendServers set the backendServers.
     */
    public void setBackendServers(Integer  backendServers) {
        this.backendServers = backendServers;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return burstCores
     */
    public Integer getBurstCores() {
        return burstCores;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param burstCores set the burstCores.
     */
    public void setBurstCores(Integer  burstCores) {
        this.burstCores = burstCores;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cores
     */
    public Integer getCores() {
        return cores;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cores set the cores.
     */
    public void setCores(Integer  cores) {
        this.cores = cores;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cpuCores
     */
    public Float getCpuCores() {
        return cpuCores;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cpuCores set the cpuCores.
     */
    public void setCpuCores(Float  cpuCores) {
        this.cpuCores = cpuCores;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return expiryAt
     */
    public String getExpiryAt() {
        return expiryAt;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param expiryAt set the expiryAt.
     */
    public void setExpiryAt(String  expiryAt) {
        this.expiryAt = expiryAt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseId
     */
    public String getLicenseId() {
        return licenseId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseId set the licenseId.
     */
    public void setLicenseId(String  licenseId) {
        this.licenseId = licenseId;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseTier
     */
    public List<String> getLicenseTier() {
        return licenseTier;
    }

    /**
     * This is the setter method. this will set the licenseTier
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseTier
     */
    public void setLicenseTier(List<String>  licenseTier) {
        this.licenseTier = licenseTier;
    }

    /**
     * This is the setter method this will set the licenseTier
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseTier
     */
    public LicenseExpiryDetails addLicenseTierItem(String licenseTierItem) {
      if (this.licenseTier == null) {
        this.licenseTier = new ArrayList<String>();
      }
      this.licenseTier.add(licenseTierItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseType
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseType set the licenseType.
     */
    public void setLicenseType(String  licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxApps
     */
    public Integer getMaxApps() {
        return maxApps;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxApps set the maxApps.
     */
    public void setMaxApps(Integer  maxApps) {
        this.maxApps = maxApps;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxSes
     */
    public Integer getMaxSes() {
        return maxSes;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxSes set the maxSes.
     */
    public void setMaxSes(Integer  maxSes) {
        this.maxSes = maxSes;
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
     * @return serviceCores
     */
    public Float getServiceCores() {
        return serviceCores;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceCores set the serviceCores.
     */
    public void setServiceCores(Float  serviceCores) {
        this.serviceCores = serviceCores;
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

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return throughput
     */
    public Integer getThroughput() {
        return throughput;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param throughput set the throughput.
     */
    public void setThroughput(Integer  throughput) {
        this.throughput = throughput;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LicenseExpiryDetails objLicenseExpiryDetails = (LicenseExpiryDetails) o;
      return   Objects.equals(this.name, objLicenseExpiryDetails.name)&&
  Objects.equals(this.expiryAt, objLicenseExpiryDetails.expiryAt)&&
  Objects.equals(this.throughput, objLicenseExpiryDetails.throughput)&&
  Objects.equals(this.cores, objLicenseExpiryDetails.cores)&&
  Objects.equals(this.maxSes, objLicenseExpiryDetails.maxSes)&&
  Objects.equals(this.backendServers, objLicenseExpiryDetails.backendServers)&&
  Objects.equals(this.maxApps, objLicenseExpiryDetails.maxApps)&&
  Objects.equals(this.licenseTier, objLicenseExpiryDetails.licenseTier)&&
  Objects.equals(this.licenseId, objLicenseExpiryDetails.licenseId)&&
  Objects.equals(this.licenseType, objLicenseExpiryDetails.licenseType)&&
  Objects.equals(this.sockets, objLicenseExpiryDetails.sockets)&&
  Objects.equals(this.burstCores, objLicenseExpiryDetails.burstCores)&&
  Objects.equals(this.serviceCores, objLicenseExpiryDetails.serviceCores)&&
  Objects.equals(this.cpuCores, objLicenseExpiryDetails.cpuCores);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LicenseExpiryDetails {\n");
                  sb.append("    backendServers: ").append(toIndentedString(backendServers)).append("\n");
                        sb.append("    burstCores: ").append(toIndentedString(burstCores)).append("\n");
                        sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
                        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
                        sb.append("    expiryAt: ").append(toIndentedString(expiryAt)).append("\n");
                        sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
                        sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
                        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
                        sb.append("    maxApps: ").append(toIndentedString(maxApps)).append("\n");
                        sb.append("    maxSes: ").append(toIndentedString(maxSes)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    serviceCores: ").append(toIndentedString(serviceCores)).append("\n");
                        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
                        sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
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
