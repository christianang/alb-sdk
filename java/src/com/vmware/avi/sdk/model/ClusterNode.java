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
 * The ClusterNode is a POJO class extends AviRestResource that used for creating
 * ClusterNode.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterNode  {
    @JsonProperty("categories")
    private List<String> categories;

    @JsonProperty("interfaces")
    private List<ControllerInterface> interfaces;

    @JsonProperty("ip")
    private IpAddr ip;

    @JsonProperty("ip6")
    private IpAddr ip6;

    @JsonProperty("name")
    private String name = "node";

    @JsonProperty("password")
    private String password;

    @JsonProperty("public_ip_or_name")
    private IpAddr publicIpOrName;

    @JsonProperty("static_routes")
    private List<StaticRoute> staticRoutes;

    @JsonProperty("vm_hostname")
    private String vmHostname;

    @JsonProperty("vm_mor")
    private String vmMor;

    @JsonProperty("vm_name")
    private String vmName;

    @JsonProperty("vm_uuid")
    private String vmUuid;


    /**
     * This is the getter method this will return the attribute value.
     * Optional service categories that a node can be assigned (e.g.
     * System, infrastructure or analytics).
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return categories
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     * This is the setter method. this will set the categories
     * Optional service categories that a node can be assigned (e.g.
     * System, infrastructure or analytics).
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return categories
     */
    public void setCategories(List<String>  categories) {
        this.categories = categories;
    }

    /**
     * This is the setter method this will set the categories
     * Optional service categories that a node can be assigned (e.g.
     * System, infrastructure or analytics).
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return categories
     */
    public ClusterNode addCategoriesItem(String categoriesItem) {
      if (this.categories == null) {
        this.categories = new ArrayList<String>();
      }
      this.categories.add(categoriesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Interface details of the controller node.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return interfaces
     */
    public List<ControllerInterface> getInterfaces() {
        return interfaces;
    }

    /**
     * This is the setter method. this will set the interfaces
     * Interface details of the controller node.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return interfaces
     */
    public void setInterfaces(List<ControllerInterface>  interfaces) {
        this.interfaces = interfaces;
    }

    /**
     * This is the setter method this will set the interfaces
     * Interface details of the controller node.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return interfaces
     */
    public ClusterNode addInterfacesItem(ControllerInterface interfacesItem) {
      if (this.interfaces == null) {
        this.interfaces = new ArrayList<ControllerInterface>();
      }
      this.interfaces.add(interfacesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * V4 ip address of controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public IpAddr getIp() {
        return ip;
    }

    /**
     * This is the setter method to the attribute.
     * V4 ip address of controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip set the ip.
     */
    public void setIp(IpAddr ip) {
        this.ip = ip;
    }

    /**
     * This is the getter method this will return the attribute value.
     * V6 ip address of controller vm.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip6
     */
    public IpAddr getIp6() {
        return ip6;
    }

    /**
     * This is the setter method to the attribute.
     * V6 ip address of controller vm.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip6 set the ip6.
     */
    public void setIp6(IpAddr ip6) {
        this.ip6 = ip6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "node".
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "node".
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The password we will use when authenticating with this node (not persisted).
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This is the setter method to the attribute.
     * The password we will use when authenticating with this node (not persisted).
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param password set the password.
     */
    public void setPassword(String  password) {
        this.password = password;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Public ip address or hostname of the controller vm.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return publicIpOrName
     */
    public IpAddr getPublicIpOrName() {
        return publicIpOrName;
    }

    /**
     * This is the setter method to the attribute.
     * Public ip address or hostname of the controller vm.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param publicIpOrName set the publicIpOrName.
     */
    public void setPublicIpOrName(IpAddr publicIpOrName) {
        this.publicIpOrName = publicIpOrName;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Static routes configured on the controller node.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return staticRoutes
     */
    public List<StaticRoute> getStaticRoutes() {
        return staticRoutes;
    }

    /**
     * This is the setter method. this will set the staticRoutes
     * Static routes configured on the controller node.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return staticRoutes
     */
    public void setStaticRoutes(List<StaticRoute>  staticRoutes) {
        this.staticRoutes = staticRoutes;
    }

    /**
     * This is the setter method this will set the staticRoutes
     * Static routes configured on the controller node.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return staticRoutes
     */
    public ClusterNode addStaticRoutesItem(StaticRoute staticRoutesItem) {
      if (this.staticRoutes == null) {
        this.staticRoutes = new ArrayList<StaticRoute>();
      }
      this.staticRoutes.add(staticRoutesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Hostname assigned to this controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmHostname
     */
    public String getVmHostname() {
        return vmHostname;
    }

    /**
     * This is the setter method to the attribute.
     * Hostname assigned to this controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vmHostname set the vmHostname.
     */
    public void setVmHostname(String  vmHostname) {
        this.vmHostname = vmHostname;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Managed object reference of this controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmMor
     */
    public String getVmMor() {
        return vmMor;
    }

    /**
     * This is the setter method to the attribute.
     * Managed object reference of this controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vmMor set the vmMor.
     */
    public void setVmMor(String  vmMor) {
        this.vmMor = vmMor;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmName
     */
    public String getVmName() {
        return vmName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vmName set the vmName.
     */
    public void setVmName(String  vmName) {
        this.vmName = vmName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid on the controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmUuid
     */
    public String getVmUuid() {
        return vmUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid on the controller vm.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vmUuid set the vmUuid.
     */
    public void setVmUuid(String  vmUuid) {
        this.vmUuid = vmUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ClusterNode objClusterNode = (ClusterNode) o;
      return   Objects.equals(this.name, objClusterNode.name)&&
  Objects.equals(this.ip, objClusterNode.ip)&&
  Objects.equals(this.vmUuid, objClusterNode.vmUuid)&&
  Objects.equals(this.vmName, objClusterNode.vmName)&&
  Objects.equals(this.vmMor, objClusterNode.vmMor)&&
  Objects.equals(this.vmHostname, objClusterNode.vmHostname)&&
  Objects.equals(this.publicIpOrName, objClusterNode.publicIpOrName)&&
  Objects.equals(this.categories, objClusterNode.categories)&&
  Objects.equals(this.password, objClusterNode.password)&&
  Objects.equals(this.interfaces, objClusterNode.interfaces)&&
  Objects.equals(this.staticRoutes, objClusterNode.staticRoutes)&&
  Objects.equals(this.ip6, objClusterNode.ip6);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ClusterNode {\n");
                  sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
                        sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
                        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    ip6: ").append(toIndentedString(ip6)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    password: ").append(toIndentedString(password)).append("\n");
                        sb.append("    publicIpOrName: ").append(toIndentedString(publicIpOrName)).append("\n");
                        sb.append("    staticRoutes: ").append(toIndentedString(staticRoutes)).append("\n");
                        sb.append("    vmHostname: ").append(toIndentedString(vmHostname)).append("\n");
                        sb.append("    vmMor: ").append(toIndentedString(vmMor)).append("\n");
                        sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
                        sb.append("    vmUuid: ").append(toIndentedString(vmUuid)).append("\n");
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
