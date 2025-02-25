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
 * The SeRuntimeProperties is a POJO class extends AviRestResource that used for creating
 * SeRuntimeProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeRuntimeProperties  {
    @JsonProperty("admin_ssh_enabled")
    private Boolean adminSshEnabled = true;

    @JsonProperty("app_headers")
    private List<AppHdr> appHeaders;

    @JsonProperty("baremetal_dispatcher_handles_flows")
    private Boolean baremetalDispatcherHandlesFlows = false;

    @JsonProperty("connections_lossy_log_rate_limiter_threshold")
    private Integer connectionsLossyLogRateLimiterThreshold = 1000;

    @JsonProperty("connections_udfnf_log_rate_limiter_threshold")
    private Integer connectionsUdfnfLogRateLimiterThreshold = 1000;

    @JsonProperty("disable_flow_probes")
    private Boolean disableFlowProbes = false;

    @JsonProperty("dos_profile")
    private DosThresholdProfile dosProfile;

    @JsonProperty("downstream_send_timeout")
    private Integer downstreamSendTimeout = 3600000;

    @JsonProperty("dp_aggressive_hb_frequency")
    private Integer dpAggressiveHbFrequency = 100;

    @JsonProperty("dp_aggressive_hb_timeout_count")
    private Integer dpAggressiveHbTimeoutCount = 10;

    @JsonProperty("dp_hb_frequency")
    private Integer dpHbFrequency = 100;

    @JsonProperty("dp_hb_timeout_count")
    private Integer dpHbTimeoutCount = 10;

    @JsonProperty("dupip_frequency")
    private Integer dupipFrequency = 0;

    @JsonProperty("dupip_timeout_count")
    private Integer dupipTimeoutCount = 5;

    @JsonProperty("enable_hsm_log")
    private Boolean enableHsmLog = false;

    @JsonProperty("feproxy_vips_enable_proxy_arp")
    private Boolean feproxyVipsEnableProxyArp = true;

    @JsonProperty("flow_table_batch_push_frequency")
    private Integer flowTableBatchPushFrequency = 5;

    @JsonProperty("global_mtu")
    private Integer globalMtu = 0;

    @JsonProperty("http_rum_console_log")
    private Boolean httpRumConsoleLog = false;

    @JsonProperty("http_rum_min_content_length")
    private Integer httpRumMinContentLength = 64;

    @JsonProperty("lbaction_num_requests_to_dispatch")
    private Integer lbactionNumRequestsToDispatch = 4;

    @JsonProperty("lbaction_rq_per_request_max_retries")
    private Integer lbactionRqPerRequestMaxRetries = 22;

    @JsonProperty("log_agent_compress_logs")
    private Boolean logAgentCompressLogs = true;

    @JsonProperty("log_agent_file_sz_appl")
    private Integer logAgentFileSzAppl = 4;

    @JsonProperty("log_agent_file_sz_conn")
    private Integer logAgentFileSzConn = 4;

    @JsonProperty("log_agent_file_sz_debug")
    private Integer logAgentFileSzDebug = 4;

    @JsonProperty("log_agent_file_sz_event")
    private Integer logAgentFileSzEvent = 4;

    @JsonProperty("log_agent_log_storage_min_sz")
    private Integer logAgentLogStorageMinSz = 1024;

    @JsonProperty("log_agent_max_concurrent_rsync")
    private Integer logAgentMaxConcurrentRsync = 1024;

    @JsonProperty("log_agent_max_storage_excess_percent")
    private Integer logAgentMaxStorageExcessPercent = 110;

    @JsonProperty("log_agent_max_storage_ignore_percent")
    private Float logAgentMaxStorageIgnorePercent = 20.0f;

    @JsonProperty("log_agent_min_storage_per_vs")
    private Integer logAgentMinStoragePerVs = 10;

    @JsonProperty("log_agent_sleep_interval")
    private Integer logAgentSleepInterval = 10;

    @JsonProperty("log_agent_unknown_vs_timer")
    private Integer logAgentUnknownVsTimer = 1800;

    @JsonProperty("log_message_max_file_list_size")
    private Integer logMessageMaxFileListSize = 64;

    @JsonProperty("ngx_free_connection_stack")
    private Boolean ngxFreeConnectionStack = false;

    @JsonProperty("persistence_mem_max")
    private Integer persistenceMemMax = 0;

    @JsonProperty("scaleout_udp_per_pkt")
    private Boolean scaleoutUdpPerPkt = true;

    @JsonProperty("se_auth_ldap_bind_timeout")
    private Integer seAuthLdapBindTimeout = 5000;

    @JsonProperty("se_auth_ldap_cache_size")
    private Integer seAuthLdapCacheSize = 100000;

    @JsonProperty("se_auth_ldap_connect_timeout")
    private Integer seAuthLdapConnectTimeout = 10000;

    @JsonProperty("se_auth_ldap_conns_per_server")
    private Integer seAuthLdapConnsPerServer = 1;

    @JsonProperty("se_auth_ldap_reconnect_timeout")
    private Integer seAuthLdapReconnectTimeout = 10000;

    @JsonProperty("se_auth_ldap_request_timeout")
    private Integer seAuthLdapRequestTimeout = 10000;

    @JsonProperty("se_auth_ldap_servers_failover_only")
    private Boolean seAuthLdapServersFailoverOnly = false;

    @JsonProperty("se_dp_compression")
    private SeRuntimeCompressionProperties seDpCompression;

    @JsonProperty("se_dp_hm_drops")
    private Integer seDpHmDrops = 0;

    @JsonProperty("se_dp_if_state_poll_interval")
    private Integer seDpIfStatePollInterval = 10;

    @JsonProperty("se_dp_log_nf_enqueue_percent")
    private Integer seDpLogNfEnqueuePercent = 70;

    @JsonProperty("se_dp_log_udf_enqueue_percent")
    private Integer seDpLogUdfEnqueuePercent = 90;

    @JsonProperty("se_dump_core_on_assert")
    private Boolean seDumpCoreOnAssert = false;

    @JsonProperty("se_handle_interface_routes")
    private Boolean seHandleInterfaceRoutes = false;

    @JsonProperty("se_hb_persist_fudge_bits")
    private Integer seHbPersistFudgeBits = 3;

    @JsonProperty("se_mac_error_threshold_to_disable_promiscious")
    private Integer seMacErrorThresholdToDisablePromiscious = 1000;

    @JsonProperty("se_memory_poison")
    private Boolean seMemoryPoison = true;

    @JsonProperty("se_metrics_interval")
    private Integer seMetricsInterval = 60000;

    @JsonProperty("se_metrics_rt_enabled")
    private Boolean seMetricsRtEnabled;

    @JsonProperty("se_metrics_rt_interval")
    private Integer seMetricsRtInterval = 1000;

    @JsonProperty("se_packet_buffer_max")
    private Integer sePacketBufferMax = 0;

    @JsonProperty("se_random_tcp_drops")
    private Boolean seRandomTcpDrops = false;

    @JsonProperty("se_rate_limiters")
    private SeRateLimiters seRateLimiters;

    @JsonProperty("service_ip_subnets")
    private List<IpAddrPrefix> serviceIpSubnets;

    @JsonProperty("service_port_ranges")
    private List<PortRange> servicePortRanges;

    @JsonProperty("services_accessible_all_interfaces")
    private Boolean servicesAccessibleAllInterfaces = false;

    @JsonProperty("tcp_syncache_max_retransmit_default")
    private Integer tcpSyncacheMaxRetransmitDefault = 4;

    @JsonProperty("upstream_connect_timeout")
    private Integer upstreamConnectTimeout = 3600000;

    @JsonProperty("upstream_connpool_cache_thresh")
    private Integer upstreamConnpoolCacheThresh = -1;

    @JsonProperty("upstream_connpool_conn_idle_thresh_tmo")
    private Integer upstreamConnpoolConnIdleThreshTmo = -1;

    @JsonProperty("upstream_connpool_core_max_cache")
    private Integer upstreamConnpoolCoreMaxCache = -1;

    @JsonProperty("upstream_connpool_enable")
    private Boolean upstreamConnpoolEnable = true;

    @JsonProperty("upstream_keepalive")
    private Boolean upstreamKeepalive = false;

    @JsonProperty("upstream_read_timeout")
    private Integer upstreamReadTimeout = 3600000;

    @JsonProperty("upstream_send_timeout")
    private Integer upstreamSendTimeout = 3600000;

    @JsonProperty("user_defined_metric_age")
    private Integer userDefinedMetricAge = 60;



    /**
     * This is the getter method this will return the attribute value.
     * Allow admin user ssh access to se.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return adminSshEnabled
     */
    public Boolean getAdminSshEnabled() {
        return adminSshEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Allow admin user ssh access to se.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param adminSshEnabled set the adminSshEnabled.
     */
    public void setAdminSshEnabled(Boolean  adminSshEnabled) {
        this.adminSshEnabled = adminSshEnabled;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appHeaders
     */
    public List<AppHdr> getAppHeaders() {
        return appHeaders;
    }

    /**
     * This is the setter method. this will set the appHeaders
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appHeaders
     */
    public void setAppHeaders(List<AppHdr>  appHeaders) {
        this.appHeaders = appHeaders;
    }

    /**
     * This is the setter method this will set the appHeaders
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appHeaders
     */
    public SeRuntimeProperties addAppHeadersItem(AppHdr appHeadersItem) {
      if (this.appHeaders == null) {
        this.appHeaders = new ArrayList<AppHdr>();
      }
      this.appHeaders.add(appHeadersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.3.
     * Use config in serviceenginegroup instead.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return baremetalDispatcherHandlesFlows
     */
    public Boolean getBaremetalDispatcherHandlesFlows() {
        return baremetalDispatcherHandlesFlows;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.3.
     * Use config in serviceenginegroup instead.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param baremetalDispatcherHandlesFlows set the baremetalDispatcherHandlesFlows.
     */
    public void setBaremetalDispatcherHandlesFlows(Boolean  baremetalDispatcherHandlesFlows) {
        this.baremetalDispatcherHandlesFlows = baremetalDispatcherHandlesFlows;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rate limit on maximum adf lossy log to pushper second.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1000), basic edition(allowed values- 1000), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @return connectionsLossyLogRateLimiterThreshold
     */
    public Integer getConnectionsLossyLogRateLimiterThreshold() {
        return connectionsLossyLogRateLimiterThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Rate limit on maximum adf lossy log to pushper second.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1000), basic edition(allowed values- 1000), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @param connectionsLossyLogRateLimiterThreshold set the connectionsLossyLogRateLimiterThreshold.
     */
    public void setConnectionsLossyLogRateLimiterThreshold(Integer  connectionsLossyLogRateLimiterThreshold) {
        this.connectionsLossyLogRateLimiterThreshold = connectionsLossyLogRateLimiterThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rate limit on maximum adf udf or nf log to pushper second.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1000), basic edition(allowed values- 1000), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @return connectionsUdfnfLogRateLimiterThreshold
     */
    public Integer getConnectionsUdfnfLogRateLimiterThreshold() {
        return connectionsUdfnfLogRateLimiterThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Rate limit on maximum adf udf or nf log to pushper second.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1000), basic edition(allowed values- 1000), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @param connectionsUdfnfLogRateLimiterThreshold set the connectionsUdfnfLogRateLimiterThreshold.
     */
    public void setConnectionsUdfnfLogRateLimiterThreshold(Integer  connectionsUdfnfLogRateLimiterThreshold) {
        this.connectionsUdfnfLogRateLimiterThreshold = connectionsUdfnfLogRateLimiterThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Disable flow probes for scaled out vs'es.
     * (this field has been moved to se_group properties 20.1.3 onwards.).
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return disableFlowProbes
     */
    public Boolean getDisableFlowProbes() {
        return disableFlowProbes;
    }

    /**
     * This is the setter method to the attribute.
     * Disable flow probes for scaled out vs'es.
     * (this field has been moved to se_group properties 20.1.3 onwards.).
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param disableFlowProbes set the disableFlowProbes.
     */
    public void setDisableFlowProbes(Boolean  disableFlowProbes) {
        this.disableFlowProbes = disableFlowProbes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dosProfile
     */
    public DosThresholdProfile getDosProfile() {
        return dosProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dosProfile set the dosProfile.
     */
    public void setDosProfile(DosThresholdProfile dosProfile) {
        this.dosProfile = dosProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for downstream to become writable.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @return downstreamSendTimeout
     */
    public Integer getDownstreamSendTimeout() {
        return downstreamSendTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout for downstream to become writable.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @param downstreamSendTimeout set the downstreamSendTimeout.
     */
    public void setDownstreamSendTimeout(Integer  downstreamSendTimeout) {
        this.downstreamSendTimeout = downstreamSendTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Frequency of se - se hb messages when aggressive failure mode detection is enabled.
     * (this field has been moved to se_group properties 20.1.3 onwards).
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 100), basic edition(allowed values- 100), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return dpAggressiveHbFrequency
     */
    public Integer getDpAggressiveHbFrequency() {
        return dpAggressiveHbFrequency;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency of se - se hb messages when aggressive failure mode detection is enabled.
     * (this field has been moved to se_group properties 20.1.3 onwards).
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 100), basic edition(allowed values- 100), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param dpAggressiveHbFrequency set the dpAggressiveHbFrequency.
     */
    public void setDpAggressiveHbFrequency(Integer  dpAggressiveHbFrequency) {
        this.dpAggressiveHbFrequency = dpAggressiveHbFrequency;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Consecutive hb failures after which failure is reported to controller,when aggressive failure mode detection is enabled.
     * (this field has been moved to se_group properties 20.1.3 onwards).
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 10), basic edition(allowed values- 10), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return dpAggressiveHbTimeoutCount
     */
    public Integer getDpAggressiveHbTimeoutCount() {
        return dpAggressiveHbTimeoutCount;
    }

    /**
     * This is the setter method to the attribute.
     * Consecutive hb failures after which failure is reported to controller,when aggressive failure mode detection is enabled.
     * (this field has been moved to se_group properties 20.1.3 onwards).
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 10), basic edition(allowed values- 10), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param dpAggressiveHbTimeoutCount set the dpAggressiveHbTimeoutCount.
     */
    public void setDpAggressiveHbTimeoutCount(Integer  dpAggressiveHbTimeoutCount) {
        this.dpAggressiveHbTimeoutCount = dpAggressiveHbTimeoutCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Frequency of se - se hb messages when aggressive failure mode detection is not enabled.
     * (this field has been moved to se_group properties 20.1.3 onwards).
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return dpHbFrequency
     */
    public Integer getDpHbFrequency() {
        return dpHbFrequency;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency of se - se hb messages when aggressive failure mode detection is not enabled.
     * (this field has been moved to se_group properties 20.1.3 onwards).
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param dpHbFrequency set the dpHbFrequency.
     */
    public void setDpHbFrequency(Integer  dpHbFrequency) {
        this.dpHbFrequency = dpHbFrequency;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Consecutive hb failures after which failure is reported to controller, when aggressive failure mode detection is not enabled.
     * (this field has been moved to se_group properties 20.1.3 onwards).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return dpHbTimeoutCount
     */
    public Integer getDpHbTimeoutCount() {
        return dpHbTimeoutCount;
    }

    /**
     * This is the setter method to the attribute.
     * Consecutive hb failures after which failure is reported to controller, when aggressive failure mode detection is not enabled.
     * (this field has been moved to se_group properties 20.1.3 onwards).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param dpHbTimeoutCount set the dpHbTimeoutCount.
     */
    public void setDpHbTimeoutCount(Integer  dpHbTimeoutCount) {
        this.dpHbTimeoutCount = dpHbTimeoutCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Frequency of arp requests sent by se for each vip to detect duplicate ip when it loses conectivity to controller.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return dupipFrequency
     */
    public Integer getDupipFrequency() {
        return dupipFrequency;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency of arp requests sent by se for each vip to detect duplicate ip when it loses conectivity to controller.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param dupipFrequency set the dupipFrequency.
     */
    public void setDupipFrequency(Integer  dupipFrequency) {
        this.dupipFrequency = dupipFrequency;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of arp responses received for the vip after which se decides that the vip has been moved and disables the vip.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return dupipTimeoutCount
     */
    public Integer getDupipTimeoutCount() {
        return dupipTimeoutCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of arp responses received for the vip after which se decides that the vip has been moved and disables the vip.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param dupipTimeoutCount set the dupipTimeoutCount.
     */
    public void setDupipTimeoutCount(Integer  dupipTimeoutCount) {
        this.dupipTimeoutCount = dupipTimeoutCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable hsm luna engine logs.
     * Field introduced in 16.4.8, 17.1.11, 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableHsmLog
     */
    public Boolean getEnableHsmLog() {
        return enableHsmLog;
    }

    /**
     * This is the setter method to the attribute.
     * Enable hsm luna engine logs.
     * Field introduced in 16.4.8, 17.1.11, 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableHsmLog set the enableHsmLog.
     */
    public void setEnableHsmLog(Boolean  enableHsmLog) {
        this.enableHsmLog = enableHsmLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable proxy arp from host interface for front end  proxies.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return feproxyVipsEnableProxyArp
     */
    public Boolean getFeproxyVipsEnableProxyArp() {
        return feproxyVipsEnableProxyArp;
    }

    /**
     * This is the setter method to the attribute.
     * Enable proxy arp from host interface for front end  proxies.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param feproxyVipsEnableProxyArp set the feproxyVipsEnableProxyArp.
     */
    public void setFeproxyVipsEnableProxyArp(Boolean  feproxyVipsEnableProxyArp) {
        this.feproxyVipsEnableProxyArp = feproxyVipsEnableProxyArp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * How often to push the flow table ipc messages in the main loop.
     * The value is the number of times through the loop before pushing the batch.
     * I.e, a value of 1 means every time through the loop.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return flowTableBatchPushFrequency
     */
    public Integer getFlowTableBatchPushFrequency() {
        return flowTableBatchPushFrequency;
    }

    /**
     * This is the setter method to the attribute.
     * How often to push the flow table ipc messages in the main loop.
     * The value is the number of times through the loop before pushing the batch.
     * I.e, a value of 1 means every time through the loop.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param flowTableBatchPushFrequency set the flowTableBatchPushFrequency.
     */
    public void setFlowTableBatchPushFrequency(Integer  flowTableBatchPushFrequency) {
        this.flowTableBatchPushFrequency = flowTableBatchPushFrequency;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Overrides the mtu value received via dhcp or some other means.
     * Use this when the infrastructure advertises an mtu that is not supported by all devices in the network.
     * For example, in aws or when an overlay is used.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return globalMtu
     */
    public Integer getGlobalMtu() {
        return globalMtu;
    }

    /**
     * This is the setter method to the attribute.
     * Overrides the mtu value received via dhcp or some other means.
     * Use this when the infrastructure advertises an mtu that is not supported by all devices in the network.
     * For example, in aws or when an overlay is used.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param globalMtu set the globalMtu.
     */
    public void setGlobalMtu(Integer  globalMtu) {
        this.globalMtu = globalMtu;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable javascript console logs on the client browser when collecting client insights.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return httpRumConsoleLog
     */
    public Boolean getHttpRumConsoleLog() {
        return httpRumConsoleLog;
    }

    /**
     * This is the setter method to the attribute.
     * Enable javascript console logs on the client browser when collecting client insights.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param httpRumConsoleLog set the httpRumConsoleLog.
     */
    public void setHttpRumConsoleLog(Boolean  httpRumConsoleLog) {
        this.httpRumConsoleLog = httpRumConsoleLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum response size content length to sample for client insights.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 64), basic edition(allowed values- 64), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @return httpRumMinContentLength
     */
    public Integer getHttpRumMinContentLength() {
        return httpRumMinContentLength;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum response size content length to sample for client insights.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 64), basic edition(allowed values- 64), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @param httpRumMinContentLength set the httpRumMinContentLength.
     */
    public void setHttpRumMinContentLength(Integer  httpRumMinContentLength) {
        this.httpRumMinContentLength = httpRumMinContentLength;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of requests to dispatch from the request queue at a regular interval.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return lbactionNumRequestsToDispatch
     */
    public Integer getLbactionNumRequestsToDispatch() {
        return lbactionNumRequestsToDispatch;
    }

    /**
     * This is the setter method to the attribute.
     * Number of requests to dispatch from the request queue at a regular interval.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param lbactionNumRequestsToDispatch set the lbactionNumRequestsToDispatch.
     */
    public void setLbactionNumRequestsToDispatch(Integer  lbactionNumRequestsToDispatch) {
        this.lbactionNumRequestsToDispatch = lbactionNumRequestsToDispatch;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum retries per request in the request queue.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 22.
     * @return lbactionRqPerRequestMaxRetries
     */
    public Integer getLbactionRqPerRequestMaxRetries() {
        return lbactionRqPerRequestMaxRetries;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum retries per request in the request queue.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 22.
     * @param lbactionRqPerRequestMaxRetries set the lbactionRqPerRequestMaxRetries.
     */
    public void setLbactionRqPerRequestMaxRetries(Integer  lbactionRqPerRequestMaxRetries) {
        this.lbactionRqPerRequestMaxRetries = lbactionRqPerRequestMaxRetries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Flag to indicate if log files are compressed upon full on the service engine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return logAgentCompressLogs
     */
    public Boolean getLogAgentCompressLogs() {
        return logAgentCompressLogs;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Flag to indicate if log files are compressed upon full on the service engine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param logAgentCompressLogs set the logAgentCompressLogs.
     */
    public void setLogAgentCompressLogs(Boolean  logAgentCompressLogs) {
        this.logAgentCompressLogs = logAgentCompressLogs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Maximum application log file size before rollover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return logAgentFileSzAppl
     */
    public Integer getLogAgentFileSzAppl() {
        return logAgentFileSzAppl;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Maximum application log file size before rollover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param logAgentFileSzAppl set the logAgentFileSzAppl.
     */
    public void setLogAgentFileSzAppl(Integer  logAgentFileSzAppl) {
        this.logAgentFileSzAppl = logAgentFileSzAppl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Maximum connection log file size before rollover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return logAgentFileSzConn
     */
    public Integer getLogAgentFileSzConn() {
        return logAgentFileSzConn;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Maximum connection log file size before rollover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param logAgentFileSzConn set the logAgentFileSzConn.
     */
    public void setLogAgentFileSzConn(Integer  logAgentFileSzConn) {
        this.logAgentFileSzConn = logAgentFileSzConn;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Maximum debug log file size before rollover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return logAgentFileSzDebug
     */
    public Integer getLogAgentFileSzDebug() {
        return logAgentFileSzDebug;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Maximum debug log file size before rollover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param logAgentFileSzDebug set the logAgentFileSzDebug.
     */
    public void setLogAgentFileSzDebug(Integer  logAgentFileSzDebug) {
        this.logAgentFileSzDebug = logAgentFileSzDebug;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Maximum event log file size before rollover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return logAgentFileSzEvent
     */
    public Integer getLogAgentFileSzEvent() {
        return logAgentFileSzEvent;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Maximum event log file size before rollover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param logAgentFileSzEvent set the logAgentFileSzEvent.
     */
    public void setLogAgentFileSzEvent(Integer  logAgentFileSzEvent) {
        this.logAgentFileSzEvent = logAgentFileSzEvent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Minimum storage allocated for logs irrespective of memory and cores.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @return logAgentLogStorageMinSz
     */
    public Integer getLogAgentLogStorageMinSz() {
        return logAgentLogStorageMinSz;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Minimum storage allocated for logs irrespective of memory and cores.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @param logAgentLogStorageMinSz set the logAgentLogStorageMinSz.
     */
    public void setLogAgentLogStorageMinSz(Integer  logAgentLogStorageMinSz) {
        this.logAgentLogStorageMinSz = logAgentLogStorageMinSz;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Maximum concurrent rsync requests initiated from log-agent to the controller.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @return logAgentMaxConcurrentRsync
     */
    public Integer getLogAgentMaxConcurrentRsync() {
        return logAgentMaxConcurrentRsync;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Maximum concurrent rsync requests initiated from log-agent to the controller.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @param logAgentMaxConcurrentRsync set the logAgentMaxConcurrentRsync.
     */
    public void setLogAgentMaxConcurrentRsync(Integer  logAgentMaxConcurrentRsync) {
        this.logAgentMaxConcurrentRsync = logAgentMaxConcurrentRsync;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Excess percentage threshold of disk size to trigger cleanup of logs on the service engine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 110.
     * @return logAgentMaxStorageExcessPercent
     */
    public Integer getLogAgentMaxStorageExcessPercent() {
        return logAgentMaxStorageExcessPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Excess percentage threshold of disk size to trigger cleanup of logs on the service engine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 110.
     * @param logAgentMaxStorageExcessPercent set the logAgentMaxStorageExcessPercent.
     */
    public void setLogAgentMaxStorageExcessPercent(Integer  logAgentMaxStorageExcessPercent) {
        this.logAgentMaxStorageExcessPercent = logAgentMaxStorageExcessPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Maximum storage on the disk not allocated for logs on the service engine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.0f.
     * @return logAgentMaxStorageIgnorePercent
     */
    public Float getLogAgentMaxStorageIgnorePercent() {
        return logAgentMaxStorageIgnorePercent;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Maximum storage on the disk not allocated for logs on the service engine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.0f.
     * @param logAgentMaxStorageIgnorePercent set the logAgentMaxStorageIgnorePercent.
     */
    public void setLogAgentMaxStorageIgnorePercent(Float  logAgentMaxStorageIgnorePercent) {
        this.logAgentMaxStorageIgnorePercent = logAgentMaxStorageIgnorePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Minimum storage allocated to any given virtualservice on the service engine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return logAgentMinStoragePerVs
     */
    public Integer getLogAgentMinStoragePerVs() {
        return logAgentMinStoragePerVs;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Minimum storage allocated to any given virtualservice on the service engine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param logAgentMinStoragePerVs set the logAgentMinStoragePerVs.
     */
    public void setLogAgentMinStoragePerVs(Integer  logAgentMinStoragePerVs) {
        this.logAgentMinStoragePerVs = logAgentMinStoragePerVs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Internal timer to stall log-agent and prevent it from hogging cpu cycles on the service engine.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return logAgentSleepInterval
     */
    public Integer getLogAgentSleepInterval() {
        return logAgentSleepInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Internal timer to stall log-agent and prevent it from hogging cpu cycles on the service engine.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param logAgentSleepInterval set the logAgentSleepInterval.
     */
    public void setLogAgentSleepInterval(Integer  logAgentSleepInterval) {
        this.logAgentSleepInterval = logAgentSleepInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Timeout to purge unknown virtual service logs from the service engine.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1800.
     * @return logAgentUnknownVsTimer
     */
    public Integer getLogAgentUnknownVsTimer() {
        return logAgentUnknownVsTimer;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Timeout to purge unknown virtual service logs from the service engine.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1800.
     * @param logAgentUnknownVsTimer set the logAgentUnknownVsTimer.
     */
    public void setLogAgentUnknownVsTimer(Integer  logAgentUnknownVsTimer) {
        this.logAgentUnknownVsTimer = logAgentUnknownVsTimer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Maximum number of file names in a log message.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @return logMessageMaxFileListSize
     */
    public Integer getLogMessageMaxFileListSize() {
        return logMessageMaxFileListSize;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Maximum number of file names in a log message.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @param logMessageMaxFileListSize set the logMessageMaxFileListSize.
     */
    public void setLogMessageMaxFileListSize(Integer  logMessageMaxFileListSize) {
        this.logMessageMaxFileListSize = logMessageMaxFileListSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return ngxFreeConnectionStack
     */
    public Boolean getNgxFreeConnectionStack() {
        return ngxFreeConnectionStack;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param ngxFreeConnectionStack set the ngxFreeConnectionStack.
     */
    public void setNgxFreeConnectionStack(Boolean  ngxFreeConnectionStack) {
        this.ngxFreeConnectionStack = ngxFreeConnectionStack;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum memory in bytes allocated for persistence entries.
     * Allowed values are 0-33554432.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return persistenceMemMax
     */
    public Integer getPersistenceMemMax() {
        return persistenceMemMax;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum memory in bytes allocated for persistence entries.
     * Allowed values are 0-33554432.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param persistenceMemMax set the persistenceMemMax.
     */
    public void setPersistenceMemMax(Integer  persistenceMemMax) {
        this.persistenceMemMax = persistenceMemMax;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable punting of udp packets from primary to other service engines.
     * This applies to virtual services with per-packet loadbalancing enabled.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return scaleoutUdpPerPkt
     */
    public Boolean getScaleoutUdpPerPkt() {
        return scaleoutUdpPerPkt;
    }

    /**
     * This is the setter method to the attribute.
     * Enable punting of udp packets from primary to other service engines.
     * This applies to virtual services with per-packet loadbalancing enabled.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param scaleoutUdpPerPkt set the scaleoutUdpPerPkt.
     */
    public void setScaleoutUdpPerPkt(Boolean  scaleoutUdpPerPkt) {
        this.scaleoutUdpPerPkt = scaleoutUdpPerPkt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ldap basicauth default bind timeout enforced on connections to ldap server.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5000.
     * @return seAuthLdapBindTimeout
     */
    public Integer getSeAuthLdapBindTimeout() {
        return seAuthLdapBindTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Ldap basicauth default bind timeout enforced on connections to ldap server.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5000.
     * @param seAuthLdapBindTimeout set the seAuthLdapBindTimeout.
     */
    public void setSeAuthLdapBindTimeout(Integer  seAuthLdapBindTimeout) {
        this.seAuthLdapBindTimeout = seAuthLdapBindTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Size of ldap basicauth credentials cache used on the dataplane.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100000.
     * @return seAuthLdapCacheSize
     */
    public Integer getSeAuthLdapCacheSize() {
        return seAuthLdapCacheSize;
    }

    /**
     * This is the setter method to the attribute.
     * Size of ldap basicauth credentials cache used on the dataplane.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100000.
     * @param seAuthLdapCacheSize set the seAuthLdapCacheSize.
     */
    public void setSeAuthLdapCacheSize(Integer  seAuthLdapCacheSize) {
        this.seAuthLdapCacheSize = seAuthLdapCacheSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ldap basicauth default connection timeout enforced on connections to ldap server.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @return seAuthLdapConnectTimeout
     */
    public Integer getSeAuthLdapConnectTimeout() {
        return seAuthLdapConnectTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Ldap basicauth default connection timeout enforced on connections to ldap server.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @param seAuthLdapConnectTimeout set the seAuthLdapConnectTimeout.
     */
    public void setSeAuthLdapConnectTimeout(Integer  seAuthLdapConnectTimeout) {
        this.seAuthLdapConnectTimeout = seAuthLdapConnectTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of concurrent connections to ldap server by a single basic auth ldap process.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return seAuthLdapConnsPerServer
     */
    public Integer getSeAuthLdapConnsPerServer() {
        return seAuthLdapConnsPerServer;
    }

    /**
     * This is the setter method to the attribute.
     * Number of concurrent connections to ldap server by a single basic auth ldap process.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param seAuthLdapConnsPerServer set the seAuthLdapConnsPerServer.
     */
    public void setSeAuthLdapConnsPerServer(Integer  seAuthLdapConnsPerServer) {
        this.seAuthLdapConnsPerServer = seAuthLdapConnsPerServer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ldap basicauth default reconnect timeout enforced on connections to ldap server.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @return seAuthLdapReconnectTimeout
     */
    public Integer getSeAuthLdapReconnectTimeout() {
        return seAuthLdapReconnectTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Ldap basicauth default reconnect timeout enforced on connections to ldap server.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @param seAuthLdapReconnectTimeout set the seAuthLdapReconnectTimeout.
     */
    public void setSeAuthLdapReconnectTimeout(Integer  seAuthLdapReconnectTimeout) {
        this.seAuthLdapReconnectTimeout = seAuthLdapReconnectTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ldap basicauth default login or group search request timeout enforced on connections to ldap server.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @return seAuthLdapRequestTimeout
     */
    public Integer getSeAuthLdapRequestTimeout() {
        return seAuthLdapRequestTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Ldap basicauth default login or group search request timeout enforced on connections to ldap server.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @param seAuthLdapRequestTimeout set the seAuthLdapRequestTimeout.
     */
    public void setSeAuthLdapRequestTimeout(Integer  seAuthLdapRequestTimeout) {
        this.seAuthLdapRequestTimeout = seAuthLdapRequestTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ldap basicauth uses multiple ldap servers in the event of a failover only.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seAuthLdapServersFailoverOnly
     */
    public Boolean getSeAuthLdapServersFailoverOnly() {
        return seAuthLdapServersFailoverOnly;
    }

    /**
     * This is the setter method to the attribute.
     * Ldap basicauth uses multiple ldap servers in the event of a failover only.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seAuthLdapServersFailoverOnly set the seAuthLdapServersFailoverOnly.
     */
    public void setSeAuthLdapServersFailoverOnly(Boolean  seAuthLdapServersFailoverOnly) {
        this.seAuthLdapServersFailoverOnly = seAuthLdapServersFailoverOnly;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDpCompression
     */
    public SeRuntimeCompressionProperties getSeDpCompression() {
        return seDpCompression;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seDpCompression set the seDpCompression.
     */
    public void setSeDpCompression(SeRuntimeCompressionProperties seDpCompression) {
        this.seDpCompression = seDpCompression;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated - this field has been moved to se_group properties 20.1.3 onwards.
     * Internal only.
     * Used to simulate se - se hb failure.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seDpHmDrops
     */
    public Integer getSeDpHmDrops() {
        return seDpHmDrops;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated - this field has been moved to se_group properties 20.1.3 onwards.
     * Internal only.
     * Used to simulate se - se hb failure.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seDpHmDrops set the seDpHmDrops.
     */
    public void setSeDpHmDrops(Integer  seDpHmDrops) {
        this.seDpHmDrops = seDpHmDrops;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.3.
     * Use config in serviceenginegroup instead.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return seDpIfStatePollInterval
     */
    public Integer getSeDpIfStatePollInterval() {
        return seDpIfStatePollInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.3.
     * Use config in serviceenginegroup instead.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param seDpIfStatePollInterval set the seDpIfStatePollInterval.
     */
    public void setSeDpIfStatePollInterval(Integer  seDpIfStatePollInterval) {
        this.seDpIfStatePollInterval = seDpIfStatePollInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Internal buffer full indicator on the service engine beyond which the unfiltered logs are abandoned.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 70.
     * @return seDpLogNfEnqueuePercent
     */
    public Integer getSeDpLogNfEnqueuePercent() {
        return seDpLogNfEnqueuePercent;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Internal buffer full indicator on the service engine beyond which the unfiltered logs are abandoned.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 70.
     * @param seDpLogNfEnqueuePercent set the seDpLogNfEnqueuePercent.
     */
    public void setSeDpLogNfEnqueuePercent(Integer  seDpLogNfEnqueuePercent) {
        this.seDpLogNfEnqueuePercent = seDpLogNfEnqueuePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Internal buffer full indicator on the service engine beyond which the user filtered logs are abandoned.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 90.
     * @return seDpLogUdfEnqueuePercent
     */
    public Integer getSeDpLogUdfEnqueuePercent() {
        return seDpLogUdfEnqueuePercent;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Internal buffer full indicator on the service engine beyond which the user filtered logs are abandoned.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 90.
     * @param seDpLogUdfEnqueuePercent set the seDpLogUdfEnqueuePercent.
     */
    public void setSeDpLogUdfEnqueuePercent(Integer  seDpLogUdfEnqueuePercent) {
        this.seDpLogUdfEnqueuePercent = seDpLogUdfEnqueuePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.3.
     * Use config in serviceenginegroup instead.
     * Field introduced in 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seDumpCoreOnAssert
     */
    public Boolean getSeDumpCoreOnAssert() {
        return seDumpCoreOnAssert;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.3.
     * Use config in serviceenginegroup instead.
     * Field introduced in 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seDumpCoreOnAssert set the seDumpCoreOnAssert.
     */
    public void setSeDumpCoreOnAssert(Boolean  seDumpCoreOnAssert) {
        this.seDumpCoreOnAssert = seDumpCoreOnAssert;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Accept/ignore interface routes (i.e, no next hop ip address).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seHandleInterfaceRoutes
     */
    public Boolean getSeHandleInterfaceRoutes() {
        return seHandleInterfaceRoutes;
    }

    /**
     * This is the setter method to the attribute.
     * Accept/ignore interface routes (i.e, no next hop ip address).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seHandleInterfaceRoutes set the seHandleInterfaceRoutes.
     */
    public void setSeHandleInterfaceRoutes(Boolean  seHandleInterfaceRoutes) {
        this.seHandleInterfaceRoutes = seHandleInterfaceRoutes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal use only.
     * Allowed values are 0-7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3.
     * @return seHbPersistFudgeBits
     */
    public Integer getSeHbPersistFudgeBits() {
        return seHbPersistFudgeBits;
    }

    /**
     * This is the setter method to the attribute.
     * Internal use only.
     * Allowed values are 0-7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3.
     * @param seHbPersistFudgeBits set the seHbPersistFudgeBits.
     */
    public void setSeHbPersistFudgeBits(Integer  seHbPersistFudgeBits) {
        this.seHbPersistFudgeBits = seHbPersistFudgeBits;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of packets with wrong mac after which se attempts to disable promiscious mode.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @return seMacErrorThresholdToDisablePromiscious
     */
    public Integer getSeMacErrorThresholdToDisablePromiscious() {
        return seMacErrorThresholdToDisablePromiscious;
    }

    /**
     * This is the setter method to the attribute.
     * Number of packets with wrong mac after which se attempts to disable promiscious mode.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @param seMacErrorThresholdToDisablePromiscious set the seMacErrorThresholdToDisablePromiscious.
     */
    public void setSeMacErrorThresholdToDisablePromiscious(Integer  seMacErrorThresholdToDisablePromiscious) {
        this.seMacErrorThresholdToDisablePromiscious = seMacErrorThresholdToDisablePromiscious;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal use only.
     * Enables poisoning of freed memory blocks.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return seMemoryPoison
     */
    public Boolean getSeMemoryPoison() {
        return seMemoryPoison;
    }

    /**
     * This is the setter method to the attribute.
     * Internal use only.
     * Enables poisoning of freed memory blocks.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param seMemoryPoison set the seMemoryPoison.
     */
    public void setSeMemoryPoison(Boolean  seMemoryPoison) {
        this.seMemoryPoison = seMemoryPoison;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal use only.
     * Frequency (ms) of metrics updates from se to controller.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 60000), basic edition(allowed values- 60000), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60000.
     * @return seMetricsInterval
     */
    public Integer getSeMetricsInterval() {
        return seMetricsInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Internal use only.
     * Frequency (ms) of metrics updates from se to controller.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 60000), basic edition(allowed values- 60000), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60000.
     * @param seMetricsInterval set the seMetricsInterval.
     */
    public void setSeMetricsInterval(Integer  seMetricsInterval) {
        this.seMetricsInterval = seMetricsInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal use only.
     * Enable or disable real time metrics irrespective of virtualservice or se group configuration.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Special default for essentials edition is false, basic edition is false, enterprise is true.
     * @return seMetricsRtEnabled
     */
    public Boolean getSeMetricsRtEnabled() {
        return seMetricsRtEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Internal use only.
     * Enable or disable real time metrics irrespective of virtualservice or se group configuration.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Special default for essentials edition is false, basic edition is false, enterprise is true.
     * @param seMetricsRtEnabled set the seMetricsRtEnabled.
     */
    public void setSeMetricsRtEnabled(Boolean  seMetricsRtEnabled) {
        this.seMetricsRtEnabled = seMetricsRtEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal use only.
     * Frequency (ms) of realtime metrics updates from se to controller.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @return seMetricsRtInterval
     */
    public Integer getSeMetricsRtInterval() {
        return seMetricsRtInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Internal use only.
     * Frequency (ms) of realtime metrics updates from se to controller.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @param seMetricsRtInterval set the seMetricsRtInterval.
     */
    public void setSeMetricsRtInterval(Integer  seMetricsRtInterval) {
        this.seMetricsRtInterval = seMetricsRtInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.3.
     * Use config in serviceenginegroup instead.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return sePacketBufferMax
     */
    public Integer getSePacketBufferMax() {
        return sePacketBufferMax;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.3.
     * Use config in serviceenginegroup instead.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param sePacketBufferMax set the sePacketBufferMax.
     */
    public void setSePacketBufferMax(Integer  sePacketBufferMax) {
        this.sePacketBufferMax = sePacketBufferMax;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal use only.
     * If enabled, randomly packets are dropped.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seRandomTcpDrops
     */
    public Boolean getSeRandomTcpDrops() {
        return seRandomTcpDrops;
    }

    /**
     * This is the setter method to the attribute.
     * Internal use only.
     * If enabled, randomly packets are dropped.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seRandomTcpDrops set the seRandomTcpDrops.
     */
    public void setSeRandomTcpDrops(Boolean  seRandomTcpDrops) {
        this.seRandomTcpDrops = seRandomTcpDrops;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se rate limiters.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRateLimiters
     */
    public SeRateLimiters getSeRateLimiters() {
        return seRateLimiters;
    }

    /**
     * This is the setter method to the attribute.
     * Se rate limiters.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRateLimiters set the seRateLimiters.
     */
    public void setSeRateLimiters(SeRateLimiters seRateLimiters) {
        this.seRateLimiters = seRateLimiters;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Ip ranges on which there may be virtual services (for configuring iptables/routes).
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceIpSubnets
     */
    public List<IpAddrPrefix> getServiceIpSubnets() {
        return serviceIpSubnets;
    }

    /**
     * This is the setter method. this will set the serviceIpSubnets
     * Ip ranges on which there may be virtual services (for configuring iptables/routes).
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceIpSubnets
     */
    public void setServiceIpSubnets(List<IpAddrPrefix>  serviceIpSubnets) {
        this.serviceIpSubnets = serviceIpSubnets;
    }

    /**
     * This is the setter method this will set the serviceIpSubnets
     * Ip ranges on which there may be virtual services (for configuring iptables/routes).
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceIpSubnets
     */
    public SeRuntimeProperties addServiceIpSubnetsItem(IpAddrPrefix serviceIpSubnetsItem) {
      if (this.serviceIpSubnets == null) {
        this.serviceIpSubnets = new ArrayList<IpAddrPrefix>();
      }
      this.serviceIpSubnets.add(serviceIpSubnetsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Port ranges on which there may be virtual services (for configuring iptables).
     * Applicable in container ecosystems like mesos.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servicePortRanges
     */
    public List<PortRange> getServicePortRanges() {
        return servicePortRanges;
    }

    /**
     * This is the setter method. this will set the servicePortRanges
     * Port ranges on which there may be virtual services (for configuring iptables).
     * Applicable in container ecosystems like mesos.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servicePortRanges
     */
    public void setServicePortRanges(List<PortRange>  servicePortRanges) {
        this.servicePortRanges = servicePortRanges;
    }

    /**
     * This is the setter method this will set the servicePortRanges
     * Port ranges on which there may be virtual services (for configuring iptables).
     * Applicable in container ecosystems like mesos.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servicePortRanges
     */
    public SeRuntimeProperties addServicePortRangesItem(PortRange servicePortRangesItem) {
      if (this.servicePortRanges == null) {
        this.servicePortRanges = new ArrayList<PortRange>();
      }
      this.servicePortRanges.add(servicePortRangesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Make service ports accessible on all host interfaces in addition to east-west vip and/or bridge ip.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return servicesAccessibleAllInterfaces
     */
    public Boolean getServicesAccessibleAllInterfaces() {
        return servicesAccessibleAllInterfaces;
    }

    /**
     * This is the setter method to the attribute.
     * Make service ports accessible on all host interfaces in addition to east-west vip and/or bridge ip.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param servicesAccessibleAllInterfaces set the servicesAccessibleAllInterfaces.
     */
    public void setServicesAccessibleAllInterfaces(Boolean  servicesAccessibleAllInterfaces) {
        this.servicesAccessibleAllInterfaces = servicesAccessibleAllInterfaces;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default value for max number of retransmissions for a syn packet.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return tcpSyncacheMaxRetransmitDefault
     */
    public Integer getTcpSyncacheMaxRetransmitDefault() {
        return tcpSyncacheMaxRetransmitDefault;
    }

    /**
     * This is the setter method to the attribute.
     * Default value for max number of retransmissions for a syn packet.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param tcpSyncacheMaxRetransmitDefault set the tcpSyncacheMaxRetransmitDefault.
     */
    public void setTcpSyncacheMaxRetransmitDefault(Integer  tcpSyncacheMaxRetransmitDefault) {
        this.tcpSyncacheMaxRetransmitDefault = tcpSyncacheMaxRetransmitDefault;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for backend connection.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @return upstreamConnectTimeout
     */
    public Integer getUpstreamConnectTimeout() {
        return upstreamConnectTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout for backend connection.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @param upstreamConnectTimeout set the upstreamConnectTimeout.
     */
    public void setUpstreamConnectTimeout(Integer  upstreamConnectTimeout) {
        this.upstreamConnectTimeout = upstreamConnectTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * L7 upstream connection pool cache threshold in percentage.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as -1.
     * @return upstreamConnpoolCacheThresh
     */
    public Integer getUpstreamConnpoolCacheThresh() {
        return upstreamConnpoolCacheThresh;
    }

    /**
     * This is the setter method to the attribute.
     * L7 upstream connection pool cache threshold in percentage.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as -1.
     * @param upstreamConnpoolCacheThresh set the upstreamConnpoolCacheThresh.
     */
    public void setUpstreamConnpoolCacheThresh(Integer  upstreamConnpoolCacheThresh) {
        this.upstreamConnpoolCacheThresh = upstreamConnpoolCacheThresh;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Idle timeout value for a connection in the upstream connection pool, when the current cache size is above the threshold.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as -1.
     * @return upstreamConnpoolConnIdleThreshTmo
     */
    public Integer getUpstreamConnpoolConnIdleThreshTmo() {
        return upstreamConnpoolConnIdleThreshTmo;
    }

    /**
     * This is the setter method to the attribute.
     * Idle timeout value for a connection in the upstream connection pool, when the current cache size is above the threshold.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as -1.
     * @param upstreamConnpoolConnIdleThreshTmo set the upstreamConnpoolConnIdleThreshTmo.
     */
    public void setUpstreamConnpoolConnIdleThreshTmo(Integer  upstreamConnpoolConnIdleThreshTmo) {
        this.upstreamConnpoolConnIdleThreshTmo = upstreamConnpoolConnIdleThreshTmo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * L7 upstream connection pool max cache size per core.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as -1.
     * @return upstreamConnpoolCoreMaxCache
     */
    public Integer getUpstreamConnpoolCoreMaxCache() {
        return upstreamConnpoolCoreMaxCache;
    }

    /**
     * This is the setter method to the attribute.
     * L7 upstream connection pool max cache size per core.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as -1.
     * @param upstreamConnpoolCoreMaxCache set the upstreamConnpoolCoreMaxCache.
     */
    public void setUpstreamConnpoolCoreMaxCache(Integer  upstreamConnpoolCoreMaxCache) {
        this.upstreamConnpoolCoreMaxCache = upstreamConnpoolCoreMaxCache;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable upstream connection pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return upstreamConnpoolEnable
     */
    public Boolean getUpstreamConnpoolEnable() {
        return upstreamConnpoolEnable;
    }

    /**
     * This is the setter method to the attribute.
     * Enable upstream connection pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param upstreamConnpoolEnable set the upstreamConnpoolEnable.
     */
    public void setUpstreamConnpoolEnable(Boolean  upstreamConnpoolEnable) {
        this.upstreamConnpoolEnable = upstreamConnpoolEnable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return upstreamKeepalive
     */
    public Boolean getUpstreamKeepalive() {
        return upstreamKeepalive;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param upstreamKeepalive set the upstreamKeepalive.
     */
    public void setUpstreamKeepalive(Boolean  upstreamKeepalive) {
        this.upstreamKeepalive = upstreamKeepalive;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for data to be received from backend.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @return upstreamReadTimeout
     */
    public Integer getUpstreamReadTimeout() {
        return upstreamReadTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout for data to be received from backend.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @param upstreamReadTimeout set the upstreamReadTimeout.
     */
    public void setUpstreamReadTimeout(Integer  upstreamReadTimeout) {
        this.upstreamReadTimeout = upstreamReadTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for upstream to become writable.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 3600000), basic edition(allowed values- 3600000), enterprise
     * with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @return upstreamSendTimeout
     */
    public Integer getUpstreamSendTimeout() {
        return upstreamSendTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout for upstream to become writable.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 3600000), basic edition(allowed values- 3600000), enterprise
     * with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @param upstreamSendTimeout set the upstreamSendTimeout.
     */
    public void setUpstreamSendTimeout(Integer  upstreamSendTimeout) {
        this.upstreamSendTimeout = upstreamSendTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Defines in seconds how long before an unused user-defined-metric is garbage collected.
     * Field introduced in 17.1.5.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return userDefinedMetricAge
     */
    public Integer getUserDefinedMetricAge() {
        return userDefinedMetricAge;
    }

    /**
     * This is the setter method to the attribute.
     * Defines in seconds how long before an unused user-defined-metric is garbage collected.
     * Field introduced in 17.1.5.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param userDefinedMetricAge set the userDefinedMetricAge.
     */
    public void setUserDefinedMetricAge(Integer  userDefinedMetricAge) {
        this.userDefinedMetricAge = userDefinedMetricAge;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeRuntimeProperties objSeRuntimeProperties = (SeRuntimeProperties) o;
      return   Objects.equals(this.persistenceMemMax, objSeRuntimeProperties.persistenceMemMax)&&
  Objects.equals(this.upstreamKeepalive, objSeRuntimeProperties.upstreamKeepalive)&&
  Objects.equals(this.sePacketBufferMax, objSeRuntimeProperties.sePacketBufferMax)&&
  Objects.equals(this.tcpSyncacheMaxRetransmitDefault, objSeRuntimeProperties.tcpSyncacheMaxRetransmitDefault)&&
  Objects.equals(this.logAgentFileSzDebug, objSeRuntimeProperties.logAgentFileSzDebug)&&
  Objects.equals(this.logAgentFileSzConn, objSeRuntimeProperties.logAgentFileSzConn)&&
  Objects.equals(this.logAgentFileSzAppl, objSeRuntimeProperties.logAgentFileSzAppl)&&
  Objects.equals(this.logAgentFileSzEvent, objSeRuntimeProperties.logAgentFileSzEvent)&&
  Objects.equals(this.logAgentMinStoragePerVs, objSeRuntimeProperties.logAgentMinStoragePerVs)&&
  Objects.equals(this.logAgentMaxStorageIgnorePercent, objSeRuntimeProperties.logAgentMaxStorageIgnorePercent)&&
  Objects.equals(this.logAgentMaxStorageExcessPercent, objSeRuntimeProperties.logAgentMaxStorageExcessPercent)&&
  Objects.equals(this.seRandomTcpDrops, objSeRuntimeProperties.seRandomTcpDrops)&&
  Objects.equals(this.seDpLogNfEnqueuePercent, objSeRuntimeProperties.seDpLogNfEnqueuePercent)&&
  Objects.equals(this.seDpLogUdfEnqueuePercent, objSeRuntimeProperties.seDpLogUdfEnqueuePercent)&&
  Objects.equals(this.logAgentCompressLogs, objSeRuntimeProperties.logAgentCompressLogs)&&
  Objects.equals(this.upstreamConnpoolEnable, objSeRuntimeProperties.upstreamConnpoolEnable)&&
  Objects.equals(this.upstreamConnpoolCoreMaxCache, objSeRuntimeProperties.upstreamConnpoolCoreMaxCache)&&
  Objects.equals(this.upstreamConnpoolCacheThresh, objSeRuntimeProperties.upstreamConnpoolCacheThresh)&&
  Objects.equals(this.upstreamConnpoolConnIdleThreshTmo, objSeRuntimeProperties.upstreamConnpoolConnIdleThreshTmo)&&
  Objects.equals(this.logAgentSleepInterval, objSeRuntimeProperties.logAgentSleepInterval)&&
  Objects.equals(this.ngxFreeConnectionStack, objSeRuntimeProperties.ngxFreeConnectionStack)&&
  Objects.equals(this.seMacErrorThresholdToDisablePromiscious, objSeRuntimeProperties.seMacErrorThresholdToDisablePromiscious)&&
  Objects.equals(this.seMetricsRtInterval, objSeRuntimeProperties.seMetricsRtInterval)&&
  Objects.equals(this.seMetricsRtEnabled, objSeRuntimeProperties.seMetricsRtEnabled)&&
  Objects.equals(this.appHeaders, objSeRuntimeProperties.appHeaders)&&
  Objects.equals(this.connectionsLossyLogRateLimiterThreshold, objSeRuntimeProperties.connectionsLossyLogRateLimiterThreshold)&&
  Objects.equals(this.connectionsUdfnfLogRateLimiterThreshold, objSeRuntimeProperties.connectionsUdfnfLogRateLimiterThreshold)&&
  Objects.equals(this.httpRumConsoleLog, objSeRuntimeProperties.httpRumConsoleLog)&&
  Objects.equals(this.httpRumMinContentLength, objSeRuntimeProperties.httpRumMinContentLength)&&
  Objects.equals(this.seDpCompression, objSeRuntimeProperties.seDpCompression)&&
  Objects.equals(this.seDpHmDrops, objSeRuntimeProperties.seDpHmDrops)&&
  Objects.equals(this.upstreamConnectTimeout, objSeRuntimeProperties.upstreamConnectTimeout)&&
  Objects.equals(this.upstreamSendTimeout, objSeRuntimeProperties.upstreamSendTimeout)&&
  Objects.equals(this.upstreamReadTimeout, objSeRuntimeProperties.upstreamReadTimeout)&&
  Objects.equals(this.dpHbFrequency, objSeRuntimeProperties.dpHbFrequency)&&
  Objects.equals(this.dpHbTimeoutCount, objSeRuntimeProperties.dpHbTimeoutCount)&&
  Objects.equals(this.dupipFrequency, objSeRuntimeProperties.dupipFrequency)&&
  Objects.equals(this.dupipTimeoutCount, objSeRuntimeProperties.dupipTimeoutCount)&&
  Objects.equals(this.seHbPersistFudgeBits, objSeRuntimeProperties.seHbPersistFudgeBits)&&
  Objects.equals(this.logAgentUnknownVsTimer, objSeRuntimeProperties.logAgentUnknownVsTimer)&&
  Objects.equals(this.globalMtu, objSeRuntimeProperties.globalMtu)&&
  Objects.equals(this.logAgentMaxConcurrentRsync, objSeRuntimeProperties.logAgentMaxConcurrentRsync)&&
  Objects.equals(this.downstreamSendTimeout, objSeRuntimeProperties.downstreamSendTimeout)&&
  Objects.equals(this.seAuthLdapCacheSize, objSeRuntimeProperties.seAuthLdapCacheSize)&&
  Objects.equals(this.seAuthLdapConnsPerServer, objSeRuntimeProperties.seAuthLdapConnsPerServer)&&
  Objects.equals(this.seAuthLdapConnectTimeout, objSeRuntimeProperties.seAuthLdapConnectTimeout)&&
  Objects.equals(this.seAuthLdapReconnectTimeout, objSeRuntimeProperties.seAuthLdapReconnectTimeout)&&
  Objects.equals(this.seAuthLdapBindTimeout, objSeRuntimeProperties.seAuthLdapBindTimeout)&&
  Objects.equals(this.seAuthLdapRequestTimeout, objSeRuntimeProperties.seAuthLdapRequestTimeout)&&
  Objects.equals(this.dosProfile, objSeRuntimeProperties.dosProfile)&&
  Objects.equals(this.seAuthLdapServersFailoverOnly, objSeRuntimeProperties.seAuthLdapServersFailoverOnly)&&
  Objects.equals(this.seMemoryPoison, objSeRuntimeProperties.seMemoryPoison)&&
  Objects.equals(this.dpAggressiveHbFrequency, objSeRuntimeProperties.dpAggressiveHbFrequency)&&
  Objects.equals(this.dpAggressiveHbTimeoutCount, objSeRuntimeProperties.dpAggressiveHbTimeoutCount)&&
  Objects.equals(this.seRateLimiters, objSeRuntimeProperties.seRateLimiters)&&
  Objects.equals(this.seMetricsInterval, objSeRuntimeProperties.seMetricsInterval)&&
  Objects.equals(this.servicePortRanges, objSeRuntimeProperties.servicePortRanges)&&
  Objects.equals(this.seHandleInterfaceRoutes, objSeRuntimeProperties.seHandleInterfaceRoutes)&&
  Objects.equals(this.servicesAccessibleAllInterfaces, objSeRuntimeProperties.servicesAccessibleAllInterfaces)&&
  Objects.equals(this.feproxyVipsEnableProxyArp, objSeRuntimeProperties.feproxyVipsEnableProxyArp)&&
  Objects.equals(this.baremetalDispatcherHandlesFlows, objSeRuntimeProperties.baremetalDispatcherHandlesFlows)&&
  Objects.equals(this.logAgentLogStorageMinSz, objSeRuntimeProperties.logAgentLogStorageMinSz)&&
  Objects.equals(this.lbactionNumRequestsToDispatch, objSeRuntimeProperties.lbactionNumRequestsToDispatch)&&
  Objects.equals(this.lbactionRqPerRequestMaxRetries, objSeRuntimeProperties.lbactionRqPerRequestMaxRetries)&&
  Objects.equals(this.serviceIpSubnets, objSeRuntimeProperties.serviceIpSubnets)&&
  Objects.equals(this.seDpIfStatePollInterval, objSeRuntimeProperties.seDpIfStatePollInterval)&&
  Objects.equals(this.logMessageMaxFileListSize, objSeRuntimeProperties.logMessageMaxFileListSize)&&
  Objects.equals(this.scaleoutUdpPerPkt, objSeRuntimeProperties.scaleoutUdpPerPkt)&&
  Objects.equals(this.flowTableBatchPushFrequency, objSeRuntimeProperties.flowTableBatchPushFrequency)&&
  Objects.equals(this.disableFlowProbes, objSeRuntimeProperties.disableFlowProbes)&&
  Objects.equals(this.userDefinedMetricAge, objSeRuntimeProperties.userDefinedMetricAge)&&
  Objects.equals(this.enableHsmLog, objSeRuntimeProperties.enableHsmLog)&&
  Objects.equals(this.seDumpCoreOnAssert, objSeRuntimeProperties.seDumpCoreOnAssert)&&
  Objects.equals(this.adminSshEnabled, objSeRuntimeProperties.adminSshEnabled);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeRuntimeProperties {\n");
                  sb.append("    adminSshEnabled: ").append(toIndentedString(adminSshEnabled)).append("\n");
                        sb.append("    appHeaders: ").append(toIndentedString(appHeaders)).append("\n");
                        sb.append("    baremetalDispatcherHandlesFlows: ").append(toIndentedString(baremetalDispatcherHandlesFlows)).append("\n");
                        sb.append("    connectionsLossyLogRateLimiterThreshold: ").append(toIndentedString(connectionsLossyLogRateLimiterThreshold)).append("\n");
                        sb.append("    connectionsUdfnfLogRateLimiterThreshold: ").append(toIndentedString(connectionsUdfnfLogRateLimiterThreshold)).append("\n");
                        sb.append("    disableFlowProbes: ").append(toIndentedString(disableFlowProbes)).append("\n");
                        sb.append("    dosProfile: ").append(toIndentedString(dosProfile)).append("\n");
                        sb.append("    downstreamSendTimeout: ").append(toIndentedString(downstreamSendTimeout)).append("\n");
                        sb.append("    dpAggressiveHbFrequency: ").append(toIndentedString(dpAggressiveHbFrequency)).append("\n");
                        sb.append("    dpAggressiveHbTimeoutCount: ").append(toIndentedString(dpAggressiveHbTimeoutCount)).append("\n");
                        sb.append("    dpHbFrequency: ").append(toIndentedString(dpHbFrequency)).append("\n");
                        sb.append("    dpHbTimeoutCount: ").append(toIndentedString(dpHbTimeoutCount)).append("\n");
                        sb.append("    dupipFrequency: ").append(toIndentedString(dupipFrequency)).append("\n");
                        sb.append("    dupipTimeoutCount: ").append(toIndentedString(dupipTimeoutCount)).append("\n");
                        sb.append("    enableHsmLog: ").append(toIndentedString(enableHsmLog)).append("\n");
                        sb.append("    feproxyVipsEnableProxyArp: ").append(toIndentedString(feproxyVipsEnableProxyArp)).append("\n");
                        sb.append("    flowTableBatchPushFrequency: ").append(toIndentedString(flowTableBatchPushFrequency)).append("\n");
                        sb.append("    globalMtu: ").append(toIndentedString(globalMtu)).append("\n");
                        sb.append("    httpRumConsoleLog: ").append(toIndentedString(httpRumConsoleLog)).append("\n");
                        sb.append("    httpRumMinContentLength: ").append(toIndentedString(httpRumMinContentLength)).append("\n");
                        sb.append("    lbactionNumRequestsToDispatch: ").append(toIndentedString(lbactionNumRequestsToDispatch)).append("\n");
                        sb.append("    lbactionRqPerRequestMaxRetries: ").append(toIndentedString(lbactionRqPerRequestMaxRetries)).append("\n");
                        sb.append("    logAgentCompressLogs: ").append(toIndentedString(logAgentCompressLogs)).append("\n");
                        sb.append("    logAgentFileSzAppl: ").append(toIndentedString(logAgentFileSzAppl)).append("\n");
                        sb.append("    logAgentFileSzConn: ").append(toIndentedString(logAgentFileSzConn)).append("\n");
                        sb.append("    logAgentFileSzDebug: ").append(toIndentedString(logAgentFileSzDebug)).append("\n");
                        sb.append("    logAgentFileSzEvent: ").append(toIndentedString(logAgentFileSzEvent)).append("\n");
                        sb.append("    logAgentLogStorageMinSz: ").append(toIndentedString(logAgentLogStorageMinSz)).append("\n");
                        sb.append("    logAgentMaxConcurrentRsync: ").append(toIndentedString(logAgentMaxConcurrentRsync)).append("\n");
                        sb.append("    logAgentMaxStorageExcessPercent: ").append(toIndentedString(logAgentMaxStorageExcessPercent)).append("\n");
                        sb.append("    logAgentMaxStorageIgnorePercent: ").append(toIndentedString(logAgentMaxStorageIgnorePercent)).append("\n");
                        sb.append("    logAgentMinStoragePerVs: ").append(toIndentedString(logAgentMinStoragePerVs)).append("\n");
                        sb.append("    logAgentSleepInterval: ").append(toIndentedString(logAgentSleepInterval)).append("\n");
                        sb.append("    logAgentUnknownVsTimer: ").append(toIndentedString(logAgentUnknownVsTimer)).append("\n");
                        sb.append("    logMessageMaxFileListSize: ").append(toIndentedString(logMessageMaxFileListSize)).append("\n");
                        sb.append("    ngxFreeConnectionStack: ").append(toIndentedString(ngxFreeConnectionStack)).append("\n");
                        sb.append("    persistenceMemMax: ").append(toIndentedString(persistenceMemMax)).append("\n");
                        sb.append("    scaleoutUdpPerPkt: ").append(toIndentedString(scaleoutUdpPerPkt)).append("\n");
                        sb.append("    seAuthLdapBindTimeout: ").append(toIndentedString(seAuthLdapBindTimeout)).append("\n");
                        sb.append("    seAuthLdapCacheSize: ").append(toIndentedString(seAuthLdapCacheSize)).append("\n");
                        sb.append("    seAuthLdapConnectTimeout: ").append(toIndentedString(seAuthLdapConnectTimeout)).append("\n");
                        sb.append("    seAuthLdapConnsPerServer: ").append(toIndentedString(seAuthLdapConnsPerServer)).append("\n");
                        sb.append("    seAuthLdapReconnectTimeout: ").append(toIndentedString(seAuthLdapReconnectTimeout)).append("\n");
                        sb.append("    seAuthLdapRequestTimeout: ").append(toIndentedString(seAuthLdapRequestTimeout)).append("\n");
                        sb.append("    seAuthLdapServersFailoverOnly: ").append(toIndentedString(seAuthLdapServersFailoverOnly)).append("\n");
                        sb.append("    seDpCompression: ").append(toIndentedString(seDpCompression)).append("\n");
                        sb.append("    seDpHmDrops: ").append(toIndentedString(seDpHmDrops)).append("\n");
                        sb.append("    seDpIfStatePollInterval: ").append(toIndentedString(seDpIfStatePollInterval)).append("\n");
                        sb.append("    seDpLogNfEnqueuePercent: ").append(toIndentedString(seDpLogNfEnqueuePercent)).append("\n");
                        sb.append("    seDpLogUdfEnqueuePercent: ").append(toIndentedString(seDpLogUdfEnqueuePercent)).append("\n");
                        sb.append("    seDumpCoreOnAssert: ").append(toIndentedString(seDumpCoreOnAssert)).append("\n");
                        sb.append("    seHandleInterfaceRoutes: ").append(toIndentedString(seHandleInterfaceRoutes)).append("\n");
                        sb.append("    seHbPersistFudgeBits: ").append(toIndentedString(seHbPersistFudgeBits)).append("\n");
                        sb.append("    seMacErrorThresholdToDisablePromiscious: ").append(toIndentedString(seMacErrorThresholdToDisablePromiscious)).append("\n");
                        sb.append("    seMemoryPoison: ").append(toIndentedString(seMemoryPoison)).append("\n");
                        sb.append("    seMetricsInterval: ").append(toIndentedString(seMetricsInterval)).append("\n");
                        sb.append("    seMetricsRtEnabled: ").append(toIndentedString(seMetricsRtEnabled)).append("\n");
                        sb.append("    seMetricsRtInterval: ").append(toIndentedString(seMetricsRtInterval)).append("\n");
                        sb.append("    sePacketBufferMax: ").append(toIndentedString(sePacketBufferMax)).append("\n");
                        sb.append("    seRandomTcpDrops: ").append(toIndentedString(seRandomTcpDrops)).append("\n");
                        sb.append("    seRateLimiters: ").append(toIndentedString(seRateLimiters)).append("\n");
                        sb.append("    serviceIpSubnets: ").append(toIndentedString(serviceIpSubnets)).append("\n");
                        sb.append("    servicePortRanges: ").append(toIndentedString(servicePortRanges)).append("\n");
                        sb.append("    servicesAccessibleAllInterfaces: ").append(toIndentedString(servicesAccessibleAllInterfaces)).append("\n");
                        sb.append("    tcpSyncacheMaxRetransmitDefault: ").append(toIndentedString(tcpSyncacheMaxRetransmitDefault)).append("\n");
                        sb.append("    upstreamConnectTimeout: ").append(toIndentedString(upstreamConnectTimeout)).append("\n");
                        sb.append("    upstreamConnpoolCacheThresh: ").append(toIndentedString(upstreamConnpoolCacheThresh)).append("\n");
                        sb.append("    upstreamConnpoolConnIdleThreshTmo: ").append(toIndentedString(upstreamConnpoolConnIdleThreshTmo)).append("\n");
                        sb.append("    upstreamConnpoolCoreMaxCache: ").append(toIndentedString(upstreamConnpoolCoreMaxCache)).append("\n");
                        sb.append("    upstreamConnpoolEnable: ").append(toIndentedString(upstreamConnpoolEnable)).append("\n");
                        sb.append("    upstreamKeepalive: ").append(toIndentedString(upstreamKeepalive)).append("\n");
                        sb.append("    upstreamReadTimeout: ").append(toIndentedString(upstreamReadTimeout)).append("\n");
                        sb.append("    upstreamSendTimeout: ").append(toIndentedString(upstreamSendTimeout)).append("\n");
                        sb.append("    userDefinedMetricAge: ").append(toIndentedString(userDefinedMetricAge)).append("\n");
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
