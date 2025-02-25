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
 * The GCPOneArmMode is a POJO class extends AviRestResource that used for creating
 * GCPOneArmMode.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GCPOneArmMode  {
    @JsonProperty("data_vpc_network_name")
    private String dataVpcNetworkName;

    @JsonProperty("data_vpc_project_id")
    private String dataVpcProjectId;

    @JsonProperty("data_vpc_subnet_name")
    private String dataVpcSubnetName;

    @JsonProperty("management_vpc_network_name")
    private String managementVpcNetworkName;

    @JsonProperty("management_vpc_project_id")
    private String managementVpcProjectId;

    @JsonProperty("management_vpc_subnet_name")
    private String managementVpcSubnetName;



    /**
     * This is the getter method this will return the attribute value.
     * Service engine data network name.
     * Field introduced in 18.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dataVpcNetworkName
     */
    public String getDataVpcNetworkName() {
        return dataVpcNetworkName;
    }

    /**
     * This is the setter method to the attribute.
     * Service engine data network name.
     * Field introduced in 18.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dataVpcNetworkName set the dataVpcNetworkName.
     */
    public void setDataVpcNetworkName(String  dataVpcNetworkName) {
        this.dataVpcNetworkName = dataVpcNetworkName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Project id of the service engine data network.
     * By default, service engine project id will be used.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dataVpcProjectId
     */
    public String getDataVpcProjectId() {
        return dataVpcProjectId;
    }

    /**
     * This is the setter method to the attribute.
     * Project id of the service engine data network.
     * By default, service engine project id will be used.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dataVpcProjectId set the dataVpcProjectId.
     */
    public void setDataVpcProjectId(String  dataVpcProjectId) {
        this.dataVpcProjectId = dataVpcProjectId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service engine data network subnet name.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dataVpcSubnetName
     */
    public String getDataVpcSubnetName() {
        return dataVpcSubnetName;
    }

    /**
     * This is the setter method to the attribute.
     * Service engine data network subnet name.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dataVpcSubnetName set the dataVpcSubnetName.
     */
    public void setDataVpcSubnetName(String  dataVpcSubnetName) {
        this.dataVpcSubnetName = dataVpcSubnetName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service engine management network name.
     * Field introduced in 18.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return managementVpcNetworkName
     */
    public String getManagementVpcNetworkName() {
        return managementVpcNetworkName;
    }

    /**
     * This is the setter method to the attribute.
     * Service engine management network name.
     * Field introduced in 18.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param managementVpcNetworkName set the managementVpcNetworkName.
     */
    public void setManagementVpcNetworkName(String  managementVpcNetworkName) {
        this.managementVpcNetworkName = managementVpcNetworkName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Project id of the service engine management network.
     * By default, service engine project id will be used.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return managementVpcProjectId
     */
    public String getManagementVpcProjectId() {
        return managementVpcProjectId;
    }

    /**
     * This is the setter method to the attribute.
     * Project id of the service engine management network.
     * By default, service engine project id will be used.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param managementVpcProjectId set the managementVpcProjectId.
     */
    public void setManagementVpcProjectId(String  managementVpcProjectId) {
        this.managementVpcProjectId = managementVpcProjectId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service engine management network subnet name.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return managementVpcSubnetName
     */
    public String getManagementVpcSubnetName() {
        return managementVpcSubnetName;
    }

    /**
     * This is the setter method to the attribute.
     * Service engine management network subnet name.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param managementVpcSubnetName set the managementVpcSubnetName.
     */
    public void setManagementVpcSubnetName(String  managementVpcSubnetName) {
        this.managementVpcSubnetName = managementVpcSubnetName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GCPOneArmMode objGCPOneArmMode = (GCPOneArmMode) o;
      return   Objects.equals(this.dataVpcSubnetName, objGCPOneArmMode.dataVpcSubnetName)&&
  Objects.equals(this.dataVpcProjectId, objGCPOneArmMode.dataVpcProjectId)&&
  Objects.equals(this.managementVpcSubnetName, objGCPOneArmMode.managementVpcSubnetName)&&
  Objects.equals(this.dataVpcNetworkName, objGCPOneArmMode.dataVpcNetworkName)&&
  Objects.equals(this.managementVpcNetworkName, objGCPOneArmMode.managementVpcNetworkName)&&
  Objects.equals(this.managementVpcProjectId, objGCPOneArmMode.managementVpcProjectId);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GCPOneArmMode {\n");
                  sb.append("    dataVpcNetworkName: ").append(toIndentedString(dataVpcNetworkName)).append("\n");
                        sb.append("    dataVpcProjectId: ").append(toIndentedString(dataVpcProjectId)).append("\n");
                        sb.append("    dataVpcSubnetName: ").append(toIndentedString(dataVpcSubnetName)).append("\n");
                        sb.append("    managementVpcNetworkName: ").append(toIndentedString(managementVpcNetworkName)).append("\n");
                        sb.append("    managementVpcProjectId: ").append(toIndentedString(managementVpcProjectId)).append("\n");
                        sb.append("    managementVpcSubnetName: ").append(toIndentedString(managementVpcSubnetName)).append("\n");
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
