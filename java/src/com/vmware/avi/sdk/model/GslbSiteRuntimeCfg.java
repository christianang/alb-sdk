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
 * The GslbSiteRuntimeCfg is a POJO class extends AviRestResource that used for creating
 * GslbSiteRuntimeCfg.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbSiteRuntimeCfg  {
    @JsonProperty("fd_info")
    private ConfigInfo fdInfo;

    @JsonProperty("gap_info")
    private ConfigInfo gapInfo;

    @JsonProperty("geo_info")
    private ConfigInfo geoInfo;

    @JsonProperty("ghm_info")
    private ConfigInfo ghmInfo;

    @JsonProperty("gjwt_info")
    private ConfigInfo gjwtInfo;

    @JsonProperty("glb_info")
    private ConfigInfo glbInfo;

    @JsonProperty("gpki_info")
    private ConfigInfo gpkiInfo;

    @JsonProperty("gs_info")
    private ConfigInfo gsInfo;

    @JsonProperty("mm_info")
    private ConfigInfo mmInfo;

    @JsonProperty("repl_queue")
    private ConfigInfo replQueue;

    @JsonProperty("sync_info")
    private GslbSiteCfgSyncInfo syncInfo;



    /**
     * This is the getter method this will return the attribute value.
     * Gslb geodb files published for a site.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fdInfo
     */
    public ConfigInfo getFdInfo() {
        return fdInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb geodb files published for a site.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fdInfo set the fdInfo.
     */
    public void setFdInfo(ConfigInfo fdInfo) {
        this.fdInfo = fdInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb application persistence info published for a site.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gapInfo
     */
    public ConfigInfo getGapInfo() {
        return gapInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb application persistence info published for a site.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gapInfo set the gapInfo.
     */
    public void setGapInfo(ConfigInfo gapInfo) {
        this.gapInfo = gapInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb geodb info published for a site.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return geoInfo
     */
    public ConfigInfo getGeoInfo() {
        return geoInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb geodb info published for a site.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param geoInfo set the geoInfo.
     */
    public void setGeoInfo(ConfigInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ghm info published for a site.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ghmInfo
     */
    public ConfigInfo getGhmInfo() {
        return ghmInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Ghm info published for a site.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ghmInfo set the ghmInfo.
     */
    public void setGhmInfo(ConfigInfo ghmInfo) {
        this.ghmInfo = ghmInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb jwtprofile info published for a site.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gjwtInfo
     */
    public ConfigInfo getGjwtInfo() {
        return gjwtInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb jwtprofile info published for a site.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gjwtInfo set the gjwtInfo.
     */
    public void setGjwtInfo(ConfigInfo gjwtInfo) {
        this.gjwtInfo = gjwtInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb info published for a site.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return glbInfo
     */
    public ConfigInfo getGlbInfo() {
        return glbInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb info published for a site.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param glbInfo set the glbInfo.
     */
    public void setGlbInfo(ConfigInfo glbInfo) {
        this.glbInfo = glbInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb pki info published for a site.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gpkiInfo
     */
    public ConfigInfo getGpkiInfo() {
        return gpkiInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb pki info published for a site.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gpkiInfo set the gpkiInfo.
     */
    public void setGpkiInfo(ConfigInfo gpkiInfo) {
        this.gpkiInfo = gpkiInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gs info published for a site.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gsInfo
     */
    public ConfigInfo getGsInfo() {
        return gsInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Gs info published for a site.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gsInfo set the gsInfo.
     */
    public void setGsInfo(ConfigInfo gsInfo) {
        this.gsInfo = gsInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maintenance mode info published for a site.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mmInfo
     */
    public ConfigInfo getMmInfo() {
        return mmInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Maintenance mode info published for a site.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mmInfo set the mmInfo.
     */
    public void setMmInfo(ConfigInfo mmInfo) {
        this.mmInfo = mmInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The replication queue for all object-types for a site.
     * Field introduced in 17.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return replQueue
     */
    public ConfigInfo getReplQueue() {
        return replQueue;
    }

    /**
     * This is the setter method to the attribute.
     * The replication queue for all object-types for a site.
     * Field introduced in 17.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param replQueue set the replQueue.
     */
    public void setReplQueue(ConfigInfo replQueue) {
        this.replQueue = replQueue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configuration sync-info of the site.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return syncInfo
     */
    public GslbSiteCfgSyncInfo getSyncInfo() {
        return syncInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Configuration sync-info of the site.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param syncInfo set the syncInfo.
     */
    public void setSyncInfo(GslbSiteCfgSyncInfo syncInfo) {
        this.syncInfo = syncInfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GslbSiteRuntimeCfg objGslbSiteRuntimeCfg = (GslbSiteRuntimeCfg) o;
      return   Objects.equals(this.glbInfo, objGslbSiteRuntimeCfg.glbInfo)&&
  Objects.equals(this.ghmInfo, objGslbSiteRuntimeCfg.ghmInfo)&&
  Objects.equals(this.gsInfo, objGslbSiteRuntimeCfg.gsInfo)&&
  Objects.equals(this.mmInfo, objGslbSiteRuntimeCfg.mmInfo)&&
  Objects.equals(this.gapInfo, objGslbSiteRuntimeCfg.gapInfo)&&
  Objects.equals(this.geoInfo, objGslbSiteRuntimeCfg.geoInfo)&&
  Objects.equals(this.fdInfo, objGslbSiteRuntimeCfg.fdInfo)&&
  Objects.equals(this.gpkiInfo, objGslbSiteRuntimeCfg.gpkiInfo)&&
  Objects.equals(this.replQueue, objGslbSiteRuntimeCfg.replQueue)&&
  Objects.equals(this.syncInfo, objGslbSiteRuntimeCfg.syncInfo)&&
  Objects.equals(this.gjwtInfo, objGslbSiteRuntimeCfg.gjwtInfo);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbSiteRuntimeCfg {\n");
                  sb.append("    fdInfo: ").append(toIndentedString(fdInfo)).append("\n");
                        sb.append("    gapInfo: ").append(toIndentedString(gapInfo)).append("\n");
                        sb.append("    geoInfo: ").append(toIndentedString(geoInfo)).append("\n");
                        sb.append("    ghmInfo: ").append(toIndentedString(ghmInfo)).append("\n");
                        sb.append("    gjwtInfo: ").append(toIndentedString(gjwtInfo)).append("\n");
                        sb.append("    glbInfo: ").append(toIndentedString(glbInfo)).append("\n");
                        sb.append("    gpkiInfo: ").append(toIndentedString(gpkiInfo)).append("\n");
                        sb.append("    gsInfo: ").append(toIndentedString(gsInfo)).append("\n");
                        sb.append("    mmInfo: ").append(toIndentedString(mmInfo)).append("\n");
                        sb.append("    replQueue: ").append(toIndentedString(replQueue)).append("\n");
                        sb.append("    syncInfo: ").append(toIndentedString(syncInfo)).append("\n");
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
