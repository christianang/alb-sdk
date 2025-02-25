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
 * The GslbServiceRuntime is a POJO class extends AviRestResource that used for creating
 * GslbServiceRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbServiceRuntime extends AviRestResource  {
    @JsonProperty("checksum")
    private String checksum;

    @JsonProperty("domain_names")
    private List<String> domainNames;

    @JsonProperty("flr_state")
    private List<CfgState> flrState;

    @JsonProperty("groups")
    private List<GslbPoolRuntime> groups;

    @JsonProperty("ldr_state")
    private CfgState ldrState;

    @JsonProperty("name")
    private String name;

    @JsonProperty("oper_status")
    private OperationalStatus operStatus;

    @JsonProperty("send_event")
    private Boolean sendEvent;

    @JsonProperty("send_status")
    private Boolean sendStatus;

    @JsonProperty("services_state")
    private String servicesState;

    @JsonProperty("sp_oper_status")
    private OperationalStatus spOperStatus;

    @JsonProperty("tenant_name")
    private String tenantName;

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return checksum
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param checksum set the checksum.
     */
    public void setChecksum(String  checksum) {
        this.checksum = checksum;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Fully qualified domain name of the gslbservice.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return domainNames
     */
    public List<String> getDomainNames() {
        return domainNames;
    }

    /**
     * This is the setter method. this will set the domainNames
     * Fully qualified domain name of the gslbservice.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return domainNames
     */
    public void setDomainNames(List<String>  domainNames) {
        this.domainNames = domainNames;
    }

    /**
     * This is the setter method this will set the domainNames
     * Fully qualified domain name of the gslbservice.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return domainNames
     */
    public GslbServiceRuntime addDomainNamesItem(String domainNamesItem) {
      if (this.domainNames == null) {
        this.domainNames = new ArrayList<String>();
      }
      this.domainNames.add(domainNamesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flrState
     */
    public List<CfgState> getFlrState() {
        return flrState;
    }

    /**
     * This is the setter method. this will set the flrState
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flrState
     */
    public void setFlrState(List<CfgState>  flrState) {
        this.flrState = flrState;
    }

    /**
     * This is the setter method this will set the flrState
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flrState
     */
    public GslbServiceRuntime addFlrStateItem(CfgState flrStateItem) {
      if (this.flrState == null) {
        this.flrState = new ArrayList<CfgState>();
      }
      this.flrState.add(flrStateItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return groups
     */
    public List<GslbPoolRuntime> getGroups() {
        return groups;
    }

    /**
     * This is the setter method. this will set the groups
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return groups
     */
    public void setGroups(List<GslbPoolRuntime>  groups) {
        this.groups = groups;
    }

    /**
     * This is the setter method this will set the groups
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return groups
     */
    public GslbServiceRuntime addGroupsItem(GslbPoolRuntime groupsItem) {
      if (this.groups == null) {
        this.groups = new ArrayList<GslbPoolRuntime>();
      }
      this.groups.add(groupsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ldrState
     */
    public CfgState getLdrState() {
        return ldrState;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ldrState set the ldrState.
     */
    public void setLdrState(CfgState ldrState) {
        this.ldrState = ldrState;
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
     * @return operStatus
     */
    public OperationalStatus getOperStatus() {
        return operStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param operStatus set the operStatus.
     */
    public void setOperStatus(OperationalStatus operStatus) {
        this.operStatus = operStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sendEvent
     */
    public Boolean getSendEvent() {
        return sendEvent;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sendEvent set the sendEvent.
     */
    public void setSendEvent(Boolean  sendEvent) {
        this.sendEvent = sendEvent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sendStatus
     */
    public Boolean getSendStatus() {
        return sendStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sendStatus set the sendStatus.
     */
    public void setSendStatus(Boolean  sendStatus) {
        this.sendStatus = sendStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servicesState
     */
    public String getServicesState() {
        return servicesState;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param servicesState set the servicesState.
     */
    public void setServicesState(String  servicesState) {
        this.servicesState = servicesState;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb site persistence consolidated status.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return spOperStatus
     */
    public OperationalStatus getSpOperStatus() {
        return spOperStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb site persistence consolidated status.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param spOperStatus set the spOperStatus.
     */
    public void setSpOperStatus(OperationalStatus spOperStatus) {
        this.spOperStatus = spOperStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant name (and not uuid) is required in logs/metrics generated by the se.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant name (and not uuid) is required in logs/metrics generated by the se.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantName set the tenantName.
     */
    public void setTenantName(String  tenantName) {
        this.tenantName = tenantName;
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
      GslbServiceRuntime objGslbServiceRuntime = (GslbServiceRuntime) o;
      return   Objects.equals(this.uuid, objGslbServiceRuntime.uuid)&&
  Objects.equals(this.name, objGslbServiceRuntime.name)&&
  Objects.equals(this.ldrState, objGslbServiceRuntime.ldrState)&&
  Objects.equals(this.flrState, objGslbServiceRuntime.flrState)&&
  Objects.equals(this.operStatus, objGslbServiceRuntime.operStatus)&&
  Objects.equals(this.groups, objGslbServiceRuntime.groups)&&
  Objects.equals(this.servicesState, objGslbServiceRuntime.servicesState)&&
  Objects.equals(this.tenantName, objGslbServiceRuntime.tenantName)&&
  Objects.equals(this.checksum, objGslbServiceRuntime.checksum)&&
  Objects.equals(this.spOperStatus, objGslbServiceRuntime.spOperStatus)&&
  Objects.equals(this.domainNames, objGslbServiceRuntime.domainNames)&&
  Objects.equals(this.sendStatus, objGslbServiceRuntime.sendStatus)&&
  Objects.equals(this.sendEvent, objGslbServiceRuntime.sendEvent);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbServiceRuntime {\n");
                  sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
                        sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
                        sb.append("    flrState: ").append(toIndentedString(flrState)).append("\n");
                        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
                        sb.append("    ldrState: ").append(toIndentedString(ldrState)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
                        sb.append("    sendEvent: ").append(toIndentedString(sendEvent)).append("\n");
                        sb.append("    sendStatus: ").append(toIndentedString(sendStatus)).append("\n");
                        sb.append("    servicesState: ").append(toIndentedString(servicesState)).append("\n");
                        sb.append("    spOperStatus: ").append(toIndentedString(spOperStatus)).append("\n");
                        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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
