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
 * The DebugFilterUnion is a POJO class extends AviRestResource that used for creating
 * DebugFilterUnion.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebugFilterUnion  {
    @JsonProperty("alert_debug_filter")
    private AlertMgrDebugFilter alertDebugFilter;

    @JsonProperty("autoscale_mgr_debug_filter")
    private AutoScaleMgrDebugFilter autoscaleMgrDebugFilter;

    @JsonProperty("cloud_connector_debug_filter")
    private CloudConnectorDebugFilter cloudConnectorDebugFilter;

    @JsonProperty("hs_debug_filter")
    private HSMgrDebugFilter hsDebugFilter;

    @JsonProperty("logmanager_debug_filter")
    private LogManagerDebugFilter logmanagerDebugFilter;

    @JsonProperty("mesos_metrics_debug_filter")
    private MesosMetricsDebugFilter mesosMetricsDebugFilter;

    @JsonProperty("metrics_debug_filter")
    private MetricsMgrDebugFilter metricsDebugFilter;

    @JsonProperty("metricsapi_srv_debug_filter")
    private MetricsApiSrvDebugFilter metricsapiSrvDebugFilter;

    @JsonProperty("se_mgr_debug_filter")
    private SeMgrDebugFilter seMgrDebugFilter;

    @JsonProperty("se_rpc_proxy_filter")
    private SeRpcProxyDebugFilter seRpcProxyFilter;

    @JsonProperty("securitymgr_debug_filter")
    private SecurityMgrDebugFilter securitymgrDebugFilter;

    @JsonProperty("state_cache_mgr_debug_filter")
    private StateCacheMgrDebugFilter stateCacheMgrDebugFilter;

    @JsonProperty("type")
    private String type;

    @JsonProperty("vs_debug_filter")
    private VsDebugFilter vsDebugFilter;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return alertDebugFilter
     */
    public AlertMgrDebugFilter getAlertDebugFilter() {
        return alertDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param alertDebugFilter set the alertDebugFilter.
     */
    public void setAlertDebugFilter(AlertMgrDebugFilter alertDebugFilter) {
        this.alertDebugFilter = alertDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return autoscaleMgrDebugFilter
     */
    public AutoScaleMgrDebugFilter getAutoscaleMgrDebugFilter() {
        return autoscaleMgrDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param autoscaleMgrDebugFilter set the autoscaleMgrDebugFilter.
     */
    public void setAutoscaleMgrDebugFilter(AutoScaleMgrDebugFilter autoscaleMgrDebugFilter) {
        this.autoscaleMgrDebugFilter = autoscaleMgrDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudConnectorDebugFilter
     */
    public CloudConnectorDebugFilter getCloudConnectorDebugFilter() {
        return cloudConnectorDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudConnectorDebugFilter set the cloudConnectorDebugFilter.
     */
    public void setCloudConnectorDebugFilter(CloudConnectorDebugFilter cloudConnectorDebugFilter) {
        this.cloudConnectorDebugFilter = cloudConnectorDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hsDebugFilter
     */
    public HSMgrDebugFilter getHsDebugFilter() {
        return hsDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hsDebugFilter set the hsDebugFilter.
     */
    public void setHsDebugFilter(HSMgrDebugFilter hsDebugFilter) {
        this.hsDebugFilter = hsDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Add filter to log manager debug.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return logmanagerDebugFilter
     */
    public LogManagerDebugFilter getLogmanagerDebugFilter() {
        return logmanagerDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Add filter to log manager debug.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param logmanagerDebugFilter set the logmanagerDebugFilter.
     */
    public void setLogmanagerDebugFilter(LogManagerDebugFilter logmanagerDebugFilter) {
        this.logmanagerDebugFilter = logmanagerDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mesosMetricsDebugFilter
     */
    public MesosMetricsDebugFilter getMesosMetricsDebugFilter() {
        return mesosMetricsDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mesosMetricsDebugFilter set the mesosMetricsDebugFilter.
     */
    public void setMesosMetricsDebugFilter(MesosMetricsDebugFilter mesosMetricsDebugFilter) {
        this.mesosMetricsDebugFilter = mesosMetricsDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsDebugFilter
     */
    public MetricsMgrDebugFilter getMetricsDebugFilter() {
        return metricsDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsDebugFilter set the metricsDebugFilter.
     */
    public void setMetricsDebugFilter(MetricsMgrDebugFilter metricsDebugFilter) {
        this.metricsDebugFilter = metricsDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Add metricsapi server filter.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsapiSrvDebugFilter
     */
    public MetricsApiSrvDebugFilter getMetricsapiSrvDebugFilter() {
        return metricsapiSrvDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Add metricsapi server filter.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsapiSrvDebugFilter set the metricsapiSrvDebugFilter.
     */
    public void setMetricsapiSrvDebugFilter(MetricsApiSrvDebugFilter metricsapiSrvDebugFilter) {
        this.metricsapiSrvDebugFilter = metricsapiSrvDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seMgrDebugFilter
     */
    public SeMgrDebugFilter getSeMgrDebugFilter() {
        return seMgrDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seMgrDebugFilter set the seMgrDebugFilter.
     */
    public void setSeMgrDebugFilter(SeMgrDebugFilter seMgrDebugFilter) {
        this.seMgrDebugFilter = seMgrDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Add se rpc proxy filter.
     * Field introduced in 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRpcProxyFilter
     */
    public SeRpcProxyDebugFilter getSeRpcProxyFilter() {
        return seRpcProxyFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Add se rpc proxy filter.
     * Field introduced in 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRpcProxyFilter set the seRpcProxyFilter.
     */
    public void setSeRpcProxyFilter(SeRpcProxyDebugFilter seRpcProxyFilter) {
        this.seRpcProxyFilter = seRpcProxyFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Add metricsapi server filter.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return securitymgrDebugFilter
     */
    public SecurityMgrDebugFilter getSecuritymgrDebugFilter() {
        return securitymgrDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Add metricsapi server filter.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param securitymgrDebugFilter set the securitymgrDebugFilter.
     */
    public void setSecuritymgrDebugFilter(SecurityMgrDebugFilter securitymgrDebugFilter) {
        this.securitymgrDebugFilter = securitymgrDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stateCacheMgrDebugFilter
     */
    public StateCacheMgrDebugFilter getStateCacheMgrDebugFilter() {
        return stateCacheMgrDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param stateCacheMgrDebugFilter set the stateCacheMgrDebugFilter.
     */
    public void setStateCacheMgrDebugFilter(StateCacheMgrDebugFilter stateCacheMgrDebugFilter) {
        this.stateCacheMgrDebugFilter = stateCacheMgrDebugFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - TASK_QUEUE_DEBUG, RPC_INFRA_DEBUG, JOB_MGR_DEBUG, TRANSACTION_DEBUG, SE_AGENT_DEBUG, SE_AGENT_METRICS_DEBUG, VIRTUALSERVICE_DEBUG,
     * RES_MGR_DEBUG, SE_MGR_DEBUG, VI_MGR_DEBUG, METRICS_MANAGER_DEBUG, METRICS_MGR_DEBUG, EVENT_API_DEBUG, HS_MGR_DEBUG, ALERT_MGR_DEBUG,
     * AUTOSCALE_MGR_DEBUG, APIC_AGENT_DEBUG, REDIS_INFRA_DEBUG, CLOUD_CONNECTOR_DEBUG, MESOS_METRICS_DEBUG...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - TASK_QUEUE_DEBUG, RPC_INFRA_DEBUG, JOB_MGR_DEBUG, TRANSACTION_DEBUG, SE_AGENT_DEBUG, SE_AGENT_METRICS_DEBUG, VIRTUALSERVICE_DEBUG,
     * RES_MGR_DEBUG, SE_MGR_DEBUG, VI_MGR_DEBUG, METRICS_MANAGER_DEBUG, METRICS_MGR_DEBUG, EVENT_API_DEBUG, HS_MGR_DEBUG, ALERT_MGR_DEBUG,
     * AUTOSCALE_MGR_DEBUG, APIC_AGENT_DEBUG, REDIS_INFRA_DEBUG, CLOUD_CONNECTOR_DEBUG, MESOS_METRICS_DEBUG...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsDebugFilter
     */
    public VsDebugFilter getVsDebugFilter() {
        return vsDebugFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsDebugFilter set the vsDebugFilter.
     */
    public void setVsDebugFilter(VsDebugFilter vsDebugFilter) {
        this.vsDebugFilter = vsDebugFilter;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DebugFilterUnion objDebugFilterUnion = (DebugFilterUnion) o;
      return   Objects.equals(this.type, objDebugFilterUnion.type)&&
  Objects.equals(this.seMgrDebugFilter, objDebugFilterUnion.seMgrDebugFilter)&&
  Objects.equals(this.vsDebugFilter, objDebugFilterUnion.vsDebugFilter)&&
  Objects.equals(this.metricsDebugFilter, objDebugFilterUnion.metricsDebugFilter)&&
  Objects.equals(this.hsDebugFilter, objDebugFilterUnion.hsDebugFilter)&&
  Objects.equals(this.alertDebugFilter, objDebugFilterUnion.alertDebugFilter)&&
  Objects.equals(this.autoscaleMgrDebugFilter, objDebugFilterUnion.autoscaleMgrDebugFilter)&&
  Objects.equals(this.cloudConnectorDebugFilter, objDebugFilterUnion.cloudConnectorDebugFilter)&&
  Objects.equals(this.mesosMetricsDebugFilter, objDebugFilterUnion.mesosMetricsDebugFilter)&&
  Objects.equals(this.stateCacheMgrDebugFilter, objDebugFilterUnion.stateCacheMgrDebugFilter)&&
  Objects.equals(this.seRpcProxyFilter, objDebugFilterUnion.seRpcProxyFilter)&&
  Objects.equals(this.metricsapiSrvDebugFilter, objDebugFilterUnion.metricsapiSrvDebugFilter)&&
  Objects.equals(this.securitymgrDebugFilter, objDebugFilterUnion.securitymgrDebugFilter)&&
  Objects.equals(this.logmanagerDebugFilter, objDebugFilterUnion.logmanagerDebugFilter);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DebugFilterUnion {\n");
                  sb.append("    alertDebugFilter: ").append(toIndentedString(alertDebugFilter)).append("\n");
                        sb.append("    autoscaleMgrDebugFilter: ").append(toIndentedString(autoscaleMgrDebugFilter)).append("\n");
                        sb.append("    cloudConnectorDebugFilter: ").append(toIndentedString(cloudConnectorDebugFilter)).append("\n");
                        sb.append("    hsDebugFilter: ").append(toIndentedString(hsDebugFilter)).append("\n");
                        sb.append("    logmanagerDebugFilter: ").append(toIndentedString(logmanagerDebugFilter)).append("\n");
                        sb.append("    mesosMetricsDebugFilter: ").append(toIndentedString(mesosMetricsDebugFilter)).append("\n");
                        sb.append("    metricsDebugFilter: ").append(toIndentedString(metricsDebugFilter)).append("\n");
                        sb.append("    metricsapiSrvDebugFilter: ").append(toIndentedString(metricsapiSrvDebugFilter)).append("\n");
                        sb.append("    seMgrDebugFilter: ").append(toIndentedString(seMgrDebugFilter)).append("\n");
                        sb.append("    seRpcProxyFilter: ").append(toIndentedString(seRpcProxyFilter)).append("\n");
                        sb.append("    securitymgrDebugFilter: ").append(toIndentedString(securitymgrDebugFilter)).append("\n");
                        sb.append("    stateCacheMgrDebugFilter: ").append(toIndentedString(stateCacheMgrDebugFilter)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                        sb.append("    vsDebugFilter: ").append(toIndentedString(vsDebugFilter)).append("\n");
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
