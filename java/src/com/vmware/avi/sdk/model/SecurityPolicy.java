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
 * The SecurityPolicy is a POJO class extends AviRestResource that used for creating
 * SecurityPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecurityPolicy extends AviRestResource  {
    @JsonProperty("description")
    private String description;

    @JsonProperty("dns_amplification_denyports")
    private PortMatchGeneric dnsAmplificationDenyports;

    @JsonProperty("dns_attacks")
    private DnsAttacks dnsAttacks;

    @JsonProperty("dns_policy_index")
    private Integer dnsPolicyIndex = 0;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("network_security_policy_index")
    private Integer networkSecurityPolicyIndex = 0;

    @JsonProperty("oper_mode")
    private String operMode = "DETECTION";

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Security policy is used to specify various configuration information used to perform distributed denial of service (ddos) attacks detection and
     * mitigation.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Security policy is used to specify various configuration information used to perform distributed denial of service (ddos) attacks detection and
     * mitigation.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Source ports and port ranges to deny in dns amplification attacks.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsAmplificationDenyports
     */
    public PortMatchGeneric getDnsAmplificationDenyports() {
        return dnsAmplificationDenyports;
    }

    /**
     * This is the setter method to the attribute.
     * Source ports and port ranges to deny in dns amplification attacks.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsAmplificationDenyports set the dnsAmplificationDenyports.
     */
    public void setDnsAmplificationDenyports(PortMatchGeneric dnsAmplificationDenyports) {
        this.dnsAmplificationDenyports = dnsAmplificationDenyports;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Attacks utilizing the dns protocol operations.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsAttacks
     */
    public DnsAttacks getDnsAttacks() {
        return dnsAttacks;
    }

    /**
     * This is the setter method to the attribute.
     * Attacks utilizing the dns protocol operations.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsAttacks set the dnsAttacks.
     */
    public void setDnsAttacks(DnsAttacks dnsAttacks) {
        this.dnsAttacks = dnsAttacks;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Index of the dns policy to use for the mitigation rules applied to the dns attacks.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return dnsPolicyIndex
     */
    public Integer getDnsPolicyIndex() {
        return dnsPolicyIndex;
    }

    /**
     * This is the setter method to the attribute.
     * Index of the dns policy to use for the mitigation rules applied to the dns attacks.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param dnsPolicyIndex set the dnsPolicyIndex.
     */
    public void setDnsPolicyIndex(Integer  dnsPolicyIndex) {
        this.dnsPolicyIndex = dnsPolicyIndex;
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
    public SecurityPolicy addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the security policy.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the security policy.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Index of the network security policy to use for the mitigation rules applied to the attacks.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return networkSecurityPolicyIndex
     */
    public Integer getNetworkSecurityPolicyIndex() {
        return networkSecurityPolicyIndex;
    }

    /**
     * This is the setter method to the attribute.
     * Index of the network security policy to use for the mitigation rules applied to the attacks.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param networkSecurityPolicyIndex set the networkSecurityPolicyIndex.
     */
    public void setNetworkSecurityPolicyIndex(Integer  networkSecurityPolicyIndex) {
        this.networkSecurityPolicyIndex = networkSecurityPolicyIndex;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks.
     * Enum options - DETECTION, MITIGATION.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "DETECTION".
     * @return operMode
     */
    public String getOperMode() {
        return operMode;
    }

    /**
     * This is the setter method to the attribute.
     * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks.
     * Enum options - DETECTION, MITIGATION.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "DETECTION".
     * @param operMode set the operMode.
     */
    public void setOperMode(String  operMode) {
        this.operMode = operMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenancy of the security policy.
     * It is a reference to an object of type tenant.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenancy of the security policy.
     * It is a reference to an object of type tenant.
     * Field introduced in 18.2.1.
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
     * The uuid of the security policy.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * The uuid of the security policy.
     * Field introduced in 18.2.1.
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
      SecurityPolicy objSecurityPolicy = (SecurityPolicy) o;
      return   Objects.equals(this.uuid, objSecurityPolicy.uuid)&&
  Objects.equals(this.name, objSecurityPolicy.name)&&
  Objects.equals(this.operMode, objSecurityPolicy.operMode)&&
  Objects.equals(this.dnsAttacks, objSecurityPolicy.dnsAttacks)&&
  Objects.equals(this.networkSecurityPolicyIndex, objSecurityPolicy.networkSecurityPolicyIndex)&&
  Objects.equals(this.dnsPolicyIndex, objSecurityPolicy.dnsPolicyIndex)&&
  Objects.equals(this.dnsAmplificationDenyports, objSecurityPolicy.dnsAmplificationDenyports)&&
  Objects.equals(this.markers, objSecurityPolicy.markers)&&
  Objects.equals(this.description, objSecurityPolicy.description)&&
  Objects.equals(this.tenantRef, objSecurityPolicy.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SecurityPolicy {\n");
                  sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    dnsAmplificationDenyports: ").append(toIndentedString(dnsAmplificationDenyports)).append("\n");
                        sb.append("    dnsAttacks: ").append(toIndentedString(dnsAttacks)).append("\n");
                        sb.append("    dnsPolicyIndex: ").append(toIndentedString(dnsPolicyIndex)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    networkSecurityPolicyIndex: ").append(toIndentedString(networkSecurityPolicyIndex)).append("\n");
                        sb.append("    operMode: ").append(toIndentedString(operMode)).append("\n");
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
