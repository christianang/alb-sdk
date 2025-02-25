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
 * The CaptureIPC is a POJO class extends AviRestResource that used for creating
 * CaptureIPC.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaptureIPC  {
    @JsonProperty("flow_del_probe")
    private Boolean flowDelProbe;

    @JsonProperty("flow_mirror_add")
    private Boolean flowMirrorAdd;

    @JsonProperty("flow_mirror_all")
    private Boolean flowMirrorAll;

    @JsonProperty("flow_mirror_del")
    private Boolean flowMirrorDel;

    @JsonProperty("flow_probe")
    private Boolean flowProbe;

    @JsonProperty("flow_probe_all")
    private Boolean flowProbeAll;

    @JsonProperty("ipc_batched")
    private Boolean ipcBatched;

    @JsonProperty("ipc_rx_req")
    private Boolean ipcRxReq;

    @JsonProperty("ipc_rx_res")
    private Boolean ipcRxRes;

    @JsonProperty("ipc_tx_req")
    private Boolean ipcTxReq;

    @JsonProperty("ipc_tx_res")
    private Boolean ipcTxRes;

    @JsonProperty("vs_hb")
    private Boolean vsHb;



    /**
     * This is the getter method this will return the attribute value.
     * Flow del probe filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flowDelProbe
     */
    public Boolean getFlowDelProbe() {
        return flowDelProbe;
    }

    /**
     * This is the setter method to the attribute.
     * Flow del probe filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param flowDelProbe set the flowDelProbe.
     */
    public void setFlowDelProbe(Boolean  flowDelProbe) {
        this.flowDelProbe = flowDelProbe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flow mirror add filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flowMirrorAdd
     */
    public Boolean getFlowMirrorAdd() {
        return flowMirrorAdd;
    }

    /**
     * This is the setter method to the attribute.
     * Flow mirror add filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param flowMirrorAdd set the flowMirrorAdd.
     */
    public void setFlowMirrorAdd(Boolean  flowMirrorAdd) {
        this.flowMirrorAdd = flowMirrorAdd;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Filter for all flow mirror se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flowMirrorAll
     */
    public Boolean getFlowMirrorAll() {
        return flowMirrorAll;
    }

    /**
     * This is the setter method to the attribute.
     * Filter for all flow mirror se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param flowMirrorAll set the flowMirrorAll.
     */
    public void setFlowMirrorAll(Boolean  flowMirrorAll) {
        this.flowMirrorAll = flowMirrorAll;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flow mirror del filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flowMirrorDel
     */
    public Boolean getFlowMirrorDel() {
        return flowMirrorDel;
    }

    /**
     * This is the setter method to the attribute.
     * Flow mirror del filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param flowMirrorDel set the flowMirrorDel.
     */
    public void setFlowMirrorDel(Boolean  flowMirrorDel) {
        this.flowMirrorDel = flowMirrorDel;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flow probe filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flowProbe
     */
    public Boolean getFlowProbe() {
        return flowProbe;
    }

    /**
     * This is the setter method to the attribute.
     * Flow probe filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param flowProbe set the flowProbe.
     */
    public void setFlowProbe(Boolean  flowProbe) {
        this.flowProbe = flowProbe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Filter for all flow probe se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return flowProbeAll
     */
    public Boolean getFlowProbeAll() {
        return flowProbeAll;
    }

    /**
     * This is the setter method to the attribute.
     * Filter for all flow probe se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param flowProbeAll set the flowProbeAll.
     */
    public void setFlowProbeAll(Boolean  flowProbeAll) {
        this.flowProbeAll = flowProbeAll;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipc batched filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipcBatched
     */
    public Boolean getIpcBatched() {
        return ipcBatched;
    }

    /**
     * This is the setter method to the attribute.
     * Ipc batched filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipcBatched set the ipcBatched.
     */
    public void setIpcBatched(Boolean  ipcBatched) {
        this.ipcBatched = ipcBatched;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Filter for incoming ipc request.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipcRxReq
     */
    public Boolean getIpcRxReq() {
        return ipcRxReq;
    }

    /**
     * This is the setter method to the attribute.
     * Filter for incoming ipc request.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipcRxReq set the ipcRxReq.
     */
    public void setIpcRxReq(Boolean  ipcRxReq) {
        this.ipcRxReq = ipcRxReq;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Filter for incoming ipc response.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipcRxRes
     */
    public Boolean getIpcRxRes() {
        return ipcRxRes;
    }

    /**
     * This is the setter method to the attribute.
     * Filter for incoming ipc response.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipcRxRes set the ipcRxRes.
     */
    public void setIpcRxRes(Boolean  ipcRxRes) {
        this.ipcRxRes = ipcRxRes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Filter for outgoing ipc request.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipcTxReq
     */
    public Boolean getIpcTxReq() {
        return ipcTxReq;
    }

    /**
     * This is the setter method to the attribute.
     * Filter for outgoing ipc request.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipcTxReq set the ipcTxReq.
     */
    public void setIpcTxReq(Boolean  ipcTxReq) {
        this.ipcTxReq = ipcTxReq;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Filter for outgoing ipc response.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipcTxRes
     */
    public Boolean getIpcTxRes() {
        return ipcTxRes;
    }

    /**
     * This is the setter method to the attribute.
     * Filter for outgoing ipc response.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipcTxRes set the ipcTxRes.
     */
    public void setIpcTxRes(Boolean  ipcTxRes) {
        this.ipcTxRes = ipcTxRes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vs heart beat filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsHb
     */
    public Boolean getVsHb() {
        return vsHb;
    }

    /**
     * This is the setter method to the attribute.
     * Vs heart beat filter for se ipc.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsHb set the vsHb.
     */
    public void setVsHb(Boolean  vsHb) {
        this.vsHb = vsHb;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CaptureIPC objCaptureIPC = (CaptureIPC) o;
      return   Objects.equals(this.flowProbe, objCaptureIPC.flowProbe)&&
  Objects.equals(this.flowDelProbe, objCaptureIPC.flowDelProbe)&&
  Objects.equals(this.flowProbeAll, objCaptureIPC.flowProbeAll)&&
  Objects.equals(this.vsHb, objCaptureIPC.vsHb)&&
  Objects.equals(this.flowMirrorAdd, objCaptureIPC.flowMirrorAdd)&&
  Objects.equals(this.flowMirrorDel, objCaptureIPC.flowMirrorDel)&&
  Objects.equals(this.flowMirrorAll, objCaptureIPC.flowMirrorAll)&&
  Objects.equals(this.ipcRxReq, objCaptureIPC.ipcRxReq)&&
  Objects.equals(this.ipcRxRes, objCaptureIPC.ipcRxRes)&&
  Objects.equals(this.ipcTxReq, objCaptureIPC.ipcTxReq)&&
  Objects.equals(this.ipcTxRes, objCaptureIPC.ipcTxRes)&&
  Objects.equals(this.ipcBatched, objCaptureIPC.ipcBatched);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CaptureIPC {\n");
                  sb.append("    flowDelProbe: ").append(toIndentedString(flowDelProbe)).append("\n");
                        sb.append("    flowMirrorAdd: ").append(toIndentedString(flowMirrorAdd)).append("\n");
                        sb.append("    flowMirrorAll: ").append(toIndentedString(flowMirrorAll)).append("\n");
                        sb.append("    flowMirrorDel: ").append(toIndentedString(flowMirrorDel)).append("\n");
                        sb.append("    flowProbe: ").append(toIndentedString(flowProbe)).append("\n");
                        sb.append("    flowProbeAll: ").append(toIndentedString(flowProbeAll)).append("\n");
                        sb.append("    ipcBatched: ").append(toIndentedString(ipcBatched)).append("\n");
                        sb.append("    ipcRxReq: ").append(toIndentedString(ipcRxReq)).append("\n");
                        sb.append("    ipcRxRes: ").append(toIndentedString(ipcRxRes)).append("\n");
                        sb.append("    ipcTxReq: ").append(toIndentedString(ipcTxReq)).append("\n");
                        sb.append("    ipcTxRes: ").append(toIndentedString(ipcTxRes)).append("\n");
                        sb.append("    vsHb: ").append(toIndentedString(vsHb)).append("\n");
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
