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
 * The VsVip is a POJO class extends AviRestResource that used for creating
 * VsVip.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VsVip extends AviRestResource  {
    @JsonProperty("bgp_local_preference")
    private Integer bgpLocalPreference;

    @JsonProperty("bgp_num_as_path_prepend")
    private Integer bgpNumAsPathPrepend;

    @JsonProperty("bgp_peer_labels")
    private List<String> bgpPeerLabels;

    @JsonProperty("cloud_ref")
    private String cloudRef;

    @JsonProperty("dns_info")
    private List<DnsInfo> dnsInfo;

    @JsonProperty("east_west_placement")
    private Boolean eastWestPlacement = false;

    @JsonProperty("ipam_selector")
    private Selector ipamSelector;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("tier1_lr")
    private String tier1Lr;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("use_standard_alb")
    private Boolean useStandardAlb;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("vip")
    private List<Vip> vip;

    @JsonProperty("vrf_context_ref")
    private String vrfContextRef;

    @JsonProperty("vsvip_cloud_config_cksum")
    private String vsvipCloudConfigCksum;



    /**
     * This is the getter method this will return the attribute value.
     * Local_pref to be used for vsvip advertised.
     * Applicable only over ibgp.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return bgpLocalPreference
     */
    public Integer getBgpLocalPreference() {
        return bgpLocalPreference;
    }

    /**
     * This is the setter method to the attribute.
     * Local_pref to be used for vsvip advertised.
     * Applicable only over ibgp.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param bgpLocalPreference set the bgpLocalPreference.
     */
    public void setBgpLocalPreference(Integer  bgpLocalPreference) {
        this.bgpLocalPreference = bgpLocalPreference;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of times the local as should be prepended additionally to vsvip.
     * Applicable only over ebgp.
     * Allowed values are 1-10.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return bgpNumAsPathPrepend
     */
    public Integer getBgpNumAsPathPrepend() {
        return bgpNumAsPathPrepend;
    }

    /**
     * This is the setter method to the attribute.
     * Number of times the local as should be prepended additionally to vsvip.
     * Applicable only over ebgp.
     * Allowed values are 1-10.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param bgpNumAsPathPrepend set the bgpNumAsPathPrepend.
     */
    public void setBgpNumAsPathPrepend(Integer  bgpNumAsPathPrepend) {
        this.bgpNumAsPathPrepend = bgpNumAsPathPrepend;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Select bgp peers, using peer label, for vsvip advertisement.
     * Field introduced in 20.1.5.
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return bgpPeerLabels
     */
    public List<String> getBgpPeerLabels() {
        return bgpPeerLabels;
    }

    /**
     * This is the setter method. this will set the bgpPeerLabels
     * Select bgp peers, using peer label, for vsvip advertisement.
     * Field introduced in 20.1.5.
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return bgpPeerLabels
     */
    public void setBgpPeerLabels(List<String>  bgpPeerLabels) {
        this.bgpPeerLabels = bgpPeerLabels;
    }

    /**
     * This is the setter method this will set the bgpPeerLabels
     * Select bgp peers, using peer label, for vsvip advertisement.
     * Field introduced in 20.1.5.
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return bgpPeerLabels
     */
    public VsVip addBgpPeerLabelsItem(String bgpPeerLabelsItem) {
      if (this.bgpPeerLabels == null) {
        this.bgpPeerLabels = new ArrayList<String>();
      }
      this.bgpPeerLabels.add(bgpPeerLabelsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type cloud.
     * Field introduced in 17.1.1.
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
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudRef set the cloudRef.
     */
    public void setCloudRef(String  cloudRef) {
        this.cloudRef = cloudRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Service discovery specific data including fully qualified domain name, type and time-to-live of the dns record.
     * This takes effect only if dns profile isassociated with cloud.
     * Field introduced in 17.1.1.
     * Maximum of 1000 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsInfo
     */
    public List<DnsInfo> getDnsInfo() {
        return dnsInfo;
    }

    /**
     * This is the setter method. this will set the dnsInfo
     * Service discovery specific data including fully qualified domain name, type and time-to-live of the dns record.
     * This takes effect only if dns profile isassociated with cloud.
     * Field introduced in 17.1.1.
     * Maximum of 1000 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsInfo
     */
    public void setDnsInfo(List<DnsInfo>  dnsInfo) {
        this.dnsInfo = dnsInfo;
    }

    /**
     * This is the setter method this will set the dnsInfo
     * Service discovery specific data including fully qualified domain name, type and time-to-live of the dns record.
     * This takes effect only if dns profile isassociated with cloud.
     * Field introduced in 17.1.1.
     * Maximum of 1000 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsInfo
     */
    public VsVip addDnsInfoItem(DnsInfo dnsInfoItem) {
      if (this.dnsInfo == null) {
        this.dnsInfo = new ArrayList<DnsInfo>();
      }
      this.dnsInfo.add(dnsInfoItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Force placement on all service engines in the service engine group (container clouds only).
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return eastWestPlacement
     */
    public Boolean getEastWestPlacement() {
        return eastWestPlacement;
    }

    /**
     * This is the setter method to the attribute.
     * Force placement on all service engines in the service engine group (container clouds only).
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param eastWestPlacement set the eastWestPlacement.
     */
    public void setEastWestPlacement(Boolean  eastWestPlacement) {
        this.eastWestPlacement = eastWestPlacement;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Determines the set of ipam networks to use for this vsvip.
     * Selector type must be selector_ipam and only one label is supported.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipamSelector
     */
    public Selector getIpamSelector() {
        return ipamSelector;
    }

    /**
     * This is the setter method to the attribute.
     * Determines the set of ipam networks to use for this vsvip.
     * Selector type must be selector_ipam and only one label is supported.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipamSelector set the ipamSelector.
     */
    public void setIpamSelector(Selector ipamSelector) {
        this.ipamSelector = ipamSelector;
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
    public VsVip addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name for the vsvip object.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name for the vsvip object.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Field introduced in 17.1.1.
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
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This sets the placement scope of virtualservice to given tier1 logical router in nsx-t.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tier1Lr
     */
    public String getTier1Lr() {
        return tier1Lr;
    }

    /**
     * This is the setter method to the attribute.
     * This sets the placement scope of virtualservice to given tier1 logical router in nsx-t.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tier1Lr set the tier1Lr.
     */
    public void setTier1Lr(String  tier1Lr) {
        this.tier1Lr = tier1Lr;
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
     * This overrides the cloud level default and needs to match the se group value in which it will be used if the se group use_standard_alb value is
     * set.
     * This is only used when fip is used for vs on azure cloud.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return useStandardAlb
     */
    public Boolean getUseStandardAlb() {
        return useStandardAlb;
    }

    /**
     * This is the setter method to the attribute.
     * This overrides the cloud level default and needs to match the se group value in which it will be used if the se group use_standard_alb value is
     * set.
     * This is only used when fip is used for vs on azure cloud.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param useStandardAlb set the useStandardAlb.
     */
    public void setUseStandardAlb(Boolean  useStandardAlb) {
        this.useStandardAlb = useStandardAlb;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the vsvip object.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the vsvip object.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of virtual service ips and other shareable entities.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vip
     */
    public List<Vip> getVip() {
        return vip;
    }

    /**
     * This is the setter method. this will set the vip
     * List of virtual service ips and other shareable entities.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vip
     */
    public void setVip(List<Vip>  vip) {
        this.vip = vip;
    }

    /**
     * This is the setter method this will set the vip
     * List of virtual service ips and other shareable entities.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vip
     */
    public VsVip addVipItem(Vip vipItem) {
      if (this.vip == null) {
        this.vip = new ArrayList<Vip>();
      }
      this.vip.add(vipItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Virtual routing context that the virtual service is bound to.
     * This is used to provide the isolation of the set of networks the application is attached to.
     * It is a reference to an object of type vrfcontext.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vrfContextRef
     */
    public String getVrfContextRef() {
        return vrfContextRef;
    }

    /**
     * This is the setter method to the attribute.
     * Virtual routing context that the virtual service is bound to.
     * This is used to provide the isolation of the set of networks the application is attached to.
     * It is a reference to an object of type vrfcontext.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vrfContextRef set the vrfContextRef.
     */
    public void setVrfContextRef(String  vrfContextRef) {
        this.vrfContextRef = vrfContextRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Checksum of cloud configuration for vsvip.
     * Internally set by cloud connector.
     * Field introduced in 17.2.9, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsvipCloudConfigCksum
     */
    public String getVsvipCloudConfigCksum() {
        return vsvipCloudConfigCksum;
    }

    /**
     * This is the setter method to the attribute.
     * Checksum of cloud configuration for vsvip.
     * Internally set by cloud connector.
     * Field introduced in 17.2.9, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsvipCloudConfigCksum set the vsvipCloudConfigCksum.
     */
    public void setVsvipCloudConfigCksum(String  vsvipCloudConfigCksum) {
        this.vsvipCloudConfigCksum = vsvipCloudConfigCksum;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VsVip objVsVip = (VsVip) o;
      return   Objects.equals(this.uuid, objVsVip.uuid)&&
  Objects.equals(this.name, objVsVip.name)&&
  Objects.equals(this.vip, objVsVip.vip)&&
  Objects.equals(this.dnsInfo, objVsVip.dnsInfo)&&
  Objects.equals(this.vrfContextRef, objVsVip.vrfContextRef)&&
  Objects.equals(this.eastWestPlacement, objVsVip.eastWestPlacement)&&
  Objects.equals(this.useStandardAlb, objVsVip.useStandardAlb)&&
  Objects.equals(this.tier1Lr, objVsVip.tier1Lr)&&
  Objects.equals(this.ipamSelector, objVsVip.ipamSelector)&&
  Objects.equals(this.bgpPeerLabels, objVsVip.bgpPeerLabels)&&
  Objects.equals(this.markers, objVsVip.markers)&&
  Objects.equals(this.bgpLocalPreference, objVsVip.bgpLocalPreference)&&
  Objects.equals(this.bgpNumAsPathPrepend, objVsVip.bgpNumAsPathPrepend)&&
  Objects.equals(this.tenantRef, objVsVip.tenantRef)&&
  Objects.equals(this.cloudRef, objVsVip.cloudRef)&&
  Objects.equals(this.vsvipCloudConfigCksum, objVsVip.vsvipCloudConfigCksum);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VsVip {\n");
                  sb.append("    bgpLocalPreference: ").append(toIndentedString(bgpLocalPreference)).append("\n");
                        sb.append("    bgpNumAsPathPrepend: ").append(toIndentedString(bgpNumAsPathPrepend)).append("\n");
                        sb.append("    bgpPeerLabels: ").append(toIndentedString(bgpPeerLabels)).append("\n");
                        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
                        sb.append("    dnsInfo: ").append(toIndentedString(dnsInfo)).append("\n");
                        sb.append("    eastWestPlacement: ").append(toIndentedString(eastWestPlacement)).append("\n");
                        sb.append("    ipamSelector: ").append(toIndentedString(ipamSelector)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    tier1Lr: ").append(toIndentedString(tier1Lr)).append("\n");
                                    sb.append("    useStandardAlb: ").append(toIndentedString(useStandardAlb)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
                        sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
                        sb.append("    vsvipCloudConfigCksum: ").append(toIndentedString(vsvipCloudConfigCksum)).append("\n");
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
