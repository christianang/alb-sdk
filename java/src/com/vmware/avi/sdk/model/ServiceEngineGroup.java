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
 * The ServiceEngineGroup is a POJO class extends AviRestResource that used for creating
 * ServiceEngineGroup.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEngineGroup extends AviRestResource  {
    @JsonProperty("accelerated_networking")
    private Boolean acceleratedNetworking;

    @JsonProperty("active_standby")
    private Boolean activeStandby = false;

    @JsonProperty("aggressive_failure_detection")
    private Boolean aggressiveFailureDetection = false;

    @JsonProperty("algo")
    private String algo = "PLACEMENT_ALGO_PACKED";

    @JsonProperty("allow_burst")
    private Boolean allowBurst;

    @JsonProperty("app_cache_percent")
    private Integer appCachePercent;

    @JsonProperty("app_cache_threshold")
    private Integer appCacheThreshold = 5;

    @JsonProperty("app_learning_memory_percent")
    private Integer appLearningMemoryPercent = 0;

    @JsonProperty("archive_shm_limit")
    private Integer archiveShmLimit = 8;

    @JsonProperty("async_ssl")
    private Boolean asyncSsl = false;

    @JsonProperty("async_ssl_threads")
    private Integer asyncSslThreads = 1;

    @JsonProperty("auto_rebalance")
    private Boolean autoRebalance = false;

    @JsonProperty("auto_rebalance_capacity_per_se")
    private List<Integer> autoRebalanceCapacityPerSe;

    @JsonProperty("auto_rebalance_criteria")
    private List<String> autoRebalanceCriteria;

    @JsonProperty("auto_rebalance_interval")
    private Integer autoRebalanceInterval = 300;

    @JsonProperty("auto_redistribute_active_standby_load")
    private Boolean autoRedistributeActiveStandbyLoad = false;

    @JsonProperty("availability_zone_refs")
    private List<String> availabilityZoneRefs;

    @JsonProperty("baremetal_dispatcher_handles_flows")
    private Boolean baremetalDispatcherHandlesFlows = false;

    @JsonProperty("bgp_peer_monitor_failover_enabled")
    private Boolean bgpPeerMonitorFailoverEnabled = false;

    @JsonProperty("bgp_state_update_interval")
    private Integer bgpStateUpdateInterval = 60;

    @JsonProperty("buffer_se")
    private Integer bufferSe = 1;

    @JsonProperty("cloud_ref")
    private String cloudRef;

    @JsonProperty("compress_ip_rules_for_each_ns_subnet")
    private Boolean compressIpRulesForEachNsSubnet = true;

    @JsonProperty("config_debugs_on_all_cores")
    private Boolean configDebugsOnAllCores = false;

    @JsonProperty("connection_memory_percentage")
    private Integer connectionMemoryPercentage = 50;

    @JsonProperty("core_shm_app_cache")
    private Boolean coreShmAppCache = false;

    @JsonProperty("core_shm_app_learning")
    private Boolean coreShmAppLearning = false;

    @JsonProperty("cpu_reserve")
    private Boolean cpuReserve = false;

    @JsonProperty("cpu_socket_affinity")
    private Boolean cpuSocketAffinity = false;

    @JsonProperty("custom_securitygroups_data")
    private List<String> customSecuritygroupsData;

    @JsonProperty("custom_securitygroups_mgmt")
    private List<String> customSecuritygroupsMgmt;

    @JsonProperty("custom_tag")
    private List<CustomTag> customTag;

    @JsonProperty("data_network_id")
    private String dataNetworkId;

    @JsonProperty("datascript_timeout")
    private Integer datascriptTimeout = 1000000;

    @JsonProperty("deactivate_ipv6_discovery")
    private Boolean deactivateIpv6Discovery;

    @JsonProperty("deactivate_kni_filtering_at_dispatcher")
    private Boolean deactivateKniFilteringAtDispatcher;

    @JsonProperty("dedicated_dispatcher_core")
    private Boolean dedicatedDispatcherCore;

    @JsonProperty("description")
    private String description;

    @JsonProperty("disable_avi_securitygroups")
    private Boolean disableAviSecuritygroups = false;

    @JsonProperty("disable_csum_offloads")
    private Boolean disableCsumOffloads = false;

    @JsonProperty("disable_flow_probes")
    private Boolean disableFlowProbes = false;

    @JsonProperty("disable_gro")
    private Boolean disableGro;

    @JsonProperty("disable_se_memory_check")
    private Boolean disableSeMemoryCheck = false;

    @JsonProperty("disable_tso")
    private Boolean disableTso = false;

    @JsonProperty("disk_per_se")
    private Integer diskPerSe = 15;

    @JsonProperty("distribute_load_active_standby")
    private Boolean distributeLoadActiveStandby = false;

    @JsonProperty("distribute_queues")
    private Boolean distributeQueues = false;

    @JsonProperty("distribute_vnics")
    private Boolean distributeVnics = false;

    @JsonProperty("downstream_send_timeout")
    private Integer downstreamSendTimeout = 3600000;

    @JsonProperty("dp_aggressive_deq_interval_msec")
    private Integer dpAggressiveDeqIntervalMsec = 1;

    @JsonProperty("dp_aggressive_enq_interval_msec")
    private Integer dpAggressiveEnqIntervalMsec = 1;

    @JsonProperty("dp_aggressive_hb_frequency")
    private Integer dpAggressiveHbFrequency = 100;

    @JsonProperty("dp_aggressive_hb_timeout_count")
    private Integer dpAggressiveHbTimeoutCount = 10;

    @JsonProperty("dp_deq_interval_msec")
    private Integer dpDeqIntervalMsec = 20;

    @JsonProperty("dp_enq_interval_msec")
    private Integer dpEnqIntervalMsec = 20;

    @JsonProperty("dp_hb_frequency")
    private Integer dpHbFrequency = 100;

    @JsonProperty("dp_hb_timeout_count")
    private Integer dpHbTimeoutCount = 10;

    @JsonProperty("dpdk_gro_timeout_interval")
    private Integer dpdkGroTimeoutInterval = 50;

    @JsonProperty("enable_gratarp_permanent")
    private Boolean enableGratarpPermanent = false;

    @JsonProperty("enable_hsm_log")
    private Boolean enableHsmLog = false;

    @JsonProperty("enable_hsm_priming")
    private Boolean enableHsmPriming = false;

    @JsonProperty("enable_multi_lb")
    private Boolean enableMultiLb = false;

    @JsonProperty("enable_pcap_tx_ring")
    private Boolean enablePcapTxRing;

    @JsonProperty("ephemeral_portrange_end")
    private Integer ephemeralPortrangeEnd;

    @JsonProperty("ephemeral_portrange_start")
    private Integer ephemeralPortrangeStart;

    @JsonProperty("extra_config_multiplier")
    private Float extraConfigMultiplier = 0.0f;

    @JsonProperty("extra_shared_config_memory")
    private Integer extraSharedConfigMemory = 0;

    @JsonProperty("flow_table_new_syn_max_entries")
    private Integer flowTableNewSynMaxEntries = 0;

    @JsonProperty("free_list_size")
    private Integer freeListSize = 1024;

    @JsonProperty("gcp_config")
    private GCPSeGroupConfig gcpConfig;

    @JsonProperty("gratarp_permanent_periodicity")
    private Integer gratarpPermanentPeriodicity = 10;

    @JsonProperty("grpc_channel_connect_timeout")
    private Integer grpcChannelConnectTimeout = 15;

    @JsonProperty("ha_mode")
    private String haMode;

    @JsonProperty("handle_per_pkt_attack")
    private Boolean handlePerPktAttack = true;

    @JsonProperty("hardwaresecuritymodulegroup_ref")
    private String hardwaresecuritymodulegroupRef;

    @JsonProperty("heap_minimum_config_memory")
    private Integer heapMinimumConfigMemory = 8;

    @JsonProperty("hm_on_standby")
    private Boolean hmOnStandby;

    @JsonProperty("host_attribute_key")
    private String hostAttributeKey;

    @JsonProperty("host_attribute_value")
    private String hostAttributeValue;

    @JsonProperty("host_gateway_monitor")
    private Boolean hostGatewayMonitor = false;

    @JsonProperty("http_rum_console_log")
    private Boolean httpRumConsoleLog = false;

    @JsonProperty("http_rum_min_content_length")
    private Integer httpRumMinContentLength = 64;

    @JsonProperty("hybrid_rss_mode")
    private Boolean hybridRssMode = false;

    @JsonProperty("hypervisor")
    private String hypervisor;

    @JsonProperty("ignore_docker_mac_change")
    private Boolean ignoreDockerMacChange = true;

    @JsonProperty("ignore_rtt_threshold")
    private Integer ignoreRttThreshold = 5000;

    @JsonProperty("ingress_access_data")
    private String ingressAccessData = "SG_INGRESS_ACCESS_ALL";

    @JsonProperty("ingress_access_mgmt")
    private String ingressAccessMgmt = "SG_INGRESS_ACCESS_ALL";

    @JsonProperty("instance_flavor")
    private String instanceFlavor;

    @JsonProperty("iptables")
    private List<IptableRuleSet> iptables;

    @JsonProperty("kni_allowed_server_ports")
    private List<KniPortRange> kniAllowedServerPorts;

    @JsonProperty("l7_conns_per_core")
    private Integer l7ConnsPerCore = 16384;

    @JsonProperty("l7_resvd_listen_conns_per_core")
    private Integer l7ResvdListenConnsPerCore = 256;

    @JsonProperty("labels")
    private List<KeyValue> labels;

    @JsonProperty("lbaction_num_requests_to_dispatch")
    private Integer lbactionNumRequestsToDispatch = 4;

    @JsonProperty("lbaction_rq_per_request_max_retries")
    private Integer lbactionRqPerRequestMaxRetries = 22;

    @JsonProperty("least_load_core_selection")
    private Boolean leastLoadCoreSelection = true;

    @JsonProperty("license_tier")
    private String licenseTier;

    @JsonProperty("license_type")
    private String licenseType;

    @JsonProperty("log_agent_compress_logs")
    private Boolean logAgentCompressLogs = true;

    @JsonProperty("log_agent_debug_enabled")
    private Boolean logAgentDebugEnabled = false;

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

    @JsonProperty("log_agent_trace_enabled")
    private Boolean logAgentTraceEnabled = true;

    @JsonProperty("log_agent_unknown_vs_timer")
    private Integer logAgentUnknownVsTimer = 1800;

    @JsonProperty("log_disksz")
    private Integer logDisksz = 10000;

    @JsonProperty("log_malloc_failure")
    private Boolean logMallocFailure = true;

    @JsonProperty("log_message_max_file_list_size")
    private Integer logMessageMaxFileListSize = 64;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("max_concurrent_external_hm")
    private Integer maxConcurrentExternalHm;

    @JsonProperty("max_cpu_usage")
    private Integer maxCpuUsage = 80;

    @JsonProperty("max_memory_per_mempool")
    private Integer maxMemoryPerMempool = 64;

    @JsonProperty("max_num_se_dps")
    private Integer maxNumSeDps;

    @JsonProperty("max_public_ips_per_lb")
    private Integer maxPublicIpsPerLb = 30;

    @JsonProperty("max_queues_per_vnic")
    private Integer maxQueuesPerVnic = 1;

    @JsonProperty("max_rules_per_lb")
    private Integer maxRulesPerLb = 150;

    @JsonProperty("max_scaleout_per_vs")
    private Integer maxScaleoutPerVs = 4;

    @JsonProperty("max_se")
    private Integer maxSe = 10;

    @JsonProperty("max_skb_frags")
    private Integer maxSkbFrags = 17;

    @JsonProperty("max_vs_per_se")
    private Integer maxVsPerSe = 10;

    @JsonProperty("mem_reserve")
    private Boolean memReserve = true;

    @JsonProperty("memory_for_config_update")
    private Integer memoryForConfigUpdate = 15;

    @JsonProperty("memory_per_se")
    private Integer memoryPerSe = 2048;

    @JsonProperty("metrics_collection_mode")
    private Integer metricsCollectionMode = 1;

    @JsonProperty("mgmt_network_ref")
    private String mgmtNetworkRef;

    @JsonProperty("mgmt_subnet")
    private IpAddrPrefix mgmtSubnet;

    @JsonProperty("min_cpu_usage")
    private Integer minCpuUsage = 30;

    @JsonProperty("min_scaleout_per_vs")
    private Integer minScaleoutPerVs = 1;

    @JsonProperty("min_se")
    private Integer minSe = 1;

    @JsonProperty("minimum_connection_memory")
    private Integer minimumConnectionMemory = 20;

    @JsonProperty("multicast_enable")
    private Boolean multicastEnable = true;

    @JsonProperty("n_log_streaming_threads")
    private Integer nLogStreamingThreads = 1;

    @JsonProperty("name")
    private String name;

    @JsonProperty("netlink_poller_threads")
    private Integer netlinkPollerThreads = 2;

    @JsonProperty("netlink_sock_buf_size")
    private Integer netlinkSockBufSize = 4;

    @JsonProperty("ngx_free_connection_stack")
    private Boolean ngxFreeConnectionStack = false;

    @JsonProperty("non_significant_log_throttle")
    private Integer nonSignificantLogThrottle = 100;

    @JsonProperty("ns_helper_deq_interval_msec")
    private Integer nsHelperDeqIntervalMsec = 20;

    @JsonProperty("ntp_sync_fail_event")
    private Boolean ntpSyncFailEvent = false;

    @JsonProperty("ntp_sync_status_interval")
    private Integer ntpSyncStatusInterval = 0;

    @JsonProperty("num_dispatcher_cores")
    private Integer numDispatcherCores = 0;

    @JsonProperty("num_dispatcher_queues")
    private Integer numDispatcherQueues = 1;

    @JsonProperty("num_flow_cores_sum_changes_to_ignore")
    private Integer numFlowCoresSumChangesToIgnore = 8;

    @JsonProperty("objsync_config")
    private ObjSyncConfig objsyncConfig;

    @JsonProperty("objsync_port")
    private Integer objsyncPort = 4001;

    @JsonProperty("openstack_availability_zones")
    private List<String> openstackAvailabilityZones;

    @JsonProperty("openstack_mgmt_network_name")
    private String openstackMgmtNetworkName;

    @JsonProperty("openstack_mgmt_network_uuid")
    private String openstackMgmtNetworkUuid;

    @JsonProperty("os_reserved_memory")
    private Integer osReservedMemory = 0;

    @JsonProperty("path_mtu_discovery_v4")
    private Boolean pathMtuDiscoveryV4 = true;

    @JsonProperty("path_mtu_discovery_v6")
    private Boolean pathMtuDiscoveryV6 = true;

    @JsonProperty("pcap_tx_mode")
    private String pcapTxMode = "PCAP_TX_AUTO";

    @JsonProperty("pcap_tx_ring_rd_balancing_factor")
    private Integer pcapTxRingRdBalancingFactor = 10;

    @JsonProperty("per_app")
    private Boolean perApp = false;

    @JsonProperty("per_vs_admission_control")
    private Boolean perVsAdmissionControl = false;

    @JsonProperty("placement_mode")
    private String placementMode = "PLACEMENT_MODE_AUTO";

    @JsonProperty("realtime_se_metrics")
    private MetricsRealTimeUpdate realtimeSeMetrics;

    @JsonProperty("reboot_on_panic")
    private Boolean rebootOnPanic = true;

    @JsonProperty("replay_vrf_routes_interval")
    private Integer replayVrfRoutesInterval = 1000;

    @JsonProperty("resync_time_interval")
    private Integer resyncTimeInterval = 65536;

    @JsonProperty("sdb_flush_interval")
    private Integer sdbFlushInterval = 100;

    @JsonProperty("sdb_pipeline_size")
    private Integer sdbPipelineSize = 100;

    @JsonProperty("sdb_scan_count")
    private Integer sdbScanCount = 1000;

    @JsonProperty("se_bandwidth_type")
    private String seBandwidthType;

    @JsonProperty("se_debug_trace_sz")
    private Integer seDebugTraceSz = 8;

    @JsonProperty("se_delayed_flow_delete")
    private Boolean seDelayedFlowDelete = true;

    @JsonProperty("se_deprovision_delay")
    private Integer seDeprovisionDelay = 120;

    @JsonProperty("se_dos_profile")
    private DosThresholdProfile seDosProfile;

    @JsonProperty("se_dp_hm_drops")
    private Integer seDpHmDrops = 0;

    @JsonProperty("se_dp_if_state_poll_interval")
    private Integer seDpIfStatePollInterval = 10;

    @JsonProperty("se_dp_isolation")
    private Boolean seDpIsolation = false;

    @JsonProperty("se_dp_isolation_num_non_dp_cpus")
    private Integer seDpIsolationNumNonDpCpus = 0;

    @JsonProperty("se_dp_log_nf_enqueue_percent")
    private Integer seDpLogNfEnqueuePercent = 70;

    @JsonProperty("se_dp_log_udf_enqueue_percent")
    private Integer seDpLogUdfEnqueuePercent = 90;

    @JsonProperty("se_dp_max_hb_version")
    private Integer seDpMaxHbVersion = 3;

    @JsonProperty("se_dp_vnic_queue_stall_event_sleep")
    private Integer seDpVnicQueueStallEventSleep = 0;

    @JsonProperty("se_dp_vnic_queue_stall_threshold")
    private Integer seDpVnicQueueStallThreshold = 2000;

    @JsonProperty("se_dp_vnic_queue_stall_timeout")
    private Integer seDpVnicQueueStallTimeout = 10000;

    @JsonProperty("se_dp_vnic_restart_on_queue_stall_count")
    private Integer seDpVnicRestartOnQueueStallCount = 3;

    @JsonProperty("se_dp_vnic_stall_se_restart_window")
    private Integer seDpVnicStallSeRestartWindow = 3600;

    @JsonProperty("se_dpdk_pmd")
    private Integer seDpdkPmd = 0;

    @JsonProperty("se_dump_core_on_assert")
    private Boolean seDumpCoreOnAssert = false;

    @JsonProperty("se_emulated_cores")
    private Integer seEmulatedCores = 0;

    @JsonProperty("se_flow_probe_retries")
    private Integer seFlowProbeRetries = 2;

    @JsonProperty("se_flow_probe_retry_timer")
    private Integer seFlowProbeRetryTimer = 40;

    @JsonProperty("se_group_analytics_policy")
    private SeGroupAnalyticsPolicy seGroupAnalyticsPolicy;

    @JsonProperty("se_hyperthreaded_mode")
    private String seHyperthreadedMode = "SE_CPU_HT_AUTO";

    @JsonProperty("se_ip_encap_ipc")
    private Integer seIpEncapIpc = 0;

    @JsonProperty("se_kni_burst_factor")
    private Integer seKniBurstFactor = 0;

    @JsonProperty("se_l3_encap_ipc")
    private Integer seL3EncapIpc = 0;

    @JsonProperty("se_log_buffer_app_blocking_dequeue")
    private Boolean seLogBufferAppBlockingDequeue = false;

    @JsonProperty("se_log_buffer_conn_blocking_dequeue")
    private Boolean seLogBufferConnBlockingDequeue = false;

    @JsonProperty("se_log_buffer_events_blocking_dequeue")
    private Boolean seLogBufferEventsBlockingDequeue = true;

    @JsonProperty("se_lro")
    private Boolean seLro;

    @JsonProperty("se_mp_ring_retry_count")
    private Integer seMpRingRetryCount = 500;

    @JsonProperty("se_mtu")
    private Integer seMtu;

    @JsonProperty("se_name_prefix")
    private String seNamePrefix = "Avi";

    @JsonProperty("se_packet_buffer_max")
    private Integer sePacketBufferMax = 0;

    @JsonProperty("se_pcap_lookahead")
    private Boolean sePcapLookahead = false;

    @JsonProperty("se_pcap_pkt_count")
    private Integer sePcapPktCount = 0;

    @JsonProperty("se_pcap_pkt_sz")
    private Integer sePcapPktSz = 69632;

    @JsonProperty("se_pcap_qdisc_bypass")
    private Boolean sePcapQdiscBypass = true;

    @JsonProperty("se_pcap_reinit_frequency")
    private Integer sePcapReinitFrequency = 0;

    @JsonProperty("se_pcap_reinit_threshold")
    private Integer sePcapReinitThreshold = 0;

    @JsonProperty("se_probe_port")
    private Integer seProbePort = 7;

    @JsonProperty("se_rl_prop")
    private RateLimiterProperties seRlProp;

    @JsonProperty("se_rum_sampling_nav_interval")
    private Integer seRumSamplingNavInterval = 1;

    @JsonProperty("se_rum_sampling_nav_percent")
    private Integer seRumSamplingNavPercent = 1;

    @JsonProperty("se_rum_sampling_res_interval")
    private Integer seRumSamplingResInterval = 2;

    @JsonProperty("se_rum_sampling_res_percent")
    private Integer seRumSamplingResPercent = 100;

    @JsonProperty("se_sb_dedicated_core")
    private Boolean seSbDedicatedCore = false;

    @JsonProperty("se_sb_threads")
    private Integer seSbThreads = 1;

    @JsonProperty("se_thread_multiplier")
    private Integer seThreadMultiplier = 1;

    @JsonProperty("se_time_tracker_props")
    private SETimeTrackerProperties seTimeTrackerProps;

    @JsonProperty("se_tracert_port_range")
    private PortRange seTracertPortRange;

    @JsonProperty("se_tunnel_mode")
    private Integer seTunnelMode = 0;

    @JsonProperty("se_tunnel_udp_port")
    private Integer seTunnelUdpPort = 1550;

    @JsonProperty("se_tx_batch_size")
    private Integer seTxBatchSize = 64;

    @JsonProperty("se_txq_threshold")
    private Integer seTxqThreshold = 2048;

    @JsonProperty("se_udp_encap_ipc")
    private Integer seUdpEncapIpc = 0;

    @JsonProperty("se_use_dpdk")
    private Integer seUseDpdk = 0;

    @JsonProperty("se_vnic_tx_sw_queue_flush_frequency")
    private Integer seVnicTxSwQueueFlushFrequency = 0;

    @JsonProperty("se_vnic_tx_sw_queue_size")
    private Integer seVnicTxSwQueueSize = 256;

    @JsonProperty("se_vs_hb_max_pkts_in_batch")
    private Integer seVsHbMaxPktsInBatch = 64;

    @JsonProperty("se_vs_hb_max_vs_in_pkt")
    private Integer seVsHbMaxVsInPkt = 256;

    @JsonProperty("self_se_election")
    private Boolean selfSeElection = false;

    @JsonProperty("send_se_ready_timeout")
    private Integer sendSeReadyTimeout = 300;

    @JsonProperty("service_ip6_subnets")
    private List<IpAddrPrefix> serviceIp6Subnets;

    @JsonProperty("service_ip_subnets")
    private List<IpAddrPrefix> serviceIpSubnets;

    @JsonProperty("shm_minimum_config_memory")
    private Integer shmMinimumConfigMemory = 4;

    @JsonProperty("significant_log_throttle")
    private Integer significantLogThrottle = 100;

    @JsonProperty("ssl_preprocess_sni_hostname")
    private Boolean sslPreprocessSniHostname = true;

    @JsonProperty("ssl_sess_cache_per_vs")
    private Integer sslSessCachePerVs = 4096;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("transient_shared_memory_max")
    private Integer transientSharedMemoryMax = 30;

    @JsonProperty("udf_log_throttle")
    private Integer udfLogThrottle = 100;

    @JsonProperty("upstream_connect_timeout")
    private Integer upstreamConnectTimeout = 3600000;

    @JsonProperty("upstream_connpool_enable")
    private Boolean upstreamConnpoolEnable = true;

    @JsonProperty("upstream_read_timeout")
    private Integer upstreamReadTimeout = 3600000;

    @JsonProperty("upstream_send_timeout")
    private Integer upstreamSendTimeout = 3600000;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("use_dp_util_for_scaleout")
    private Boolean useDpUtilForScaleout = false;

    @JsonProperty("use_hyperthreaded_cores")
    private Boolean useHyperthreadedCores = true;

    @JsonProperty("use_legacy_netlink")
    private Boolean useLegacyNetlink = false;

    @JsonProperty("use_objsync")
    private Boolean useObjsync = false;

    @JsonProperty("use_standard_alb")
    private Boolean useStandardAlb;

    @JsonProperty("user_agent_cache_config")
    private UserAgentCacheConfig userAgentCacheConfig;

    @JsonProperty("user_defined_metric_age")
    private Integer userDefinedMetricAge = 60;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("vcenter_clusters")
    private VcenterClusters vcenterClusters;

    @JsonProperty("vcenter_datastore_mode")
    private String vcenterDatastoreMode = "VCENTER_DATASTORE_ANY";

    @JsonProperty("vcenter_datastores")
    private List<VcenterDatastore> vcenterDatastores;

    @JsonProperty("vcenter_datastores_include")
    private Boolean vcenterDatastoresInclude = false;

    @JsonProperty("vcenter_folder")
    private String vcenterFolder = "AviSeFolder";

    @JsonProperty("vcenter_hosts")
    private VcenterHosts vcenterHosts;

    @JsonProperty("vcenter_parking_vnic_pg")
    private String vcenterParkingVnicPg;

    @JsonProperty("vcenters")
    private List<PlacementScopeConfig> vcenters;

    @JsonProperty("vcpus_per_se")
    private Integer vcpusPerSe = 1;

    @JsonProperty("vip_asg")
    private VipAutoscaleGroup vipAsg;

    @JsonProperty("vnic_dhcp_ip_check_interval")
    private Integer vnicDhcpIpCheckInterval = 6;

    @JsonProperty("vnic_dhcp_ip_max_retries")
    private Integer vnicDhcpIpMaxRetries = 10;

    @JsonProperty("vnic_ip_delete_interval")
    private Integer vnicIpDeleteInterval = 5;

    @JsonProperty("vnic_probe_interval")
    private Integer vnicProbeInterval = 5;

    @JsonProperty("vnic_rpc_retry_interval")
    private Integer vnicRpcRetryInterval = 5;

    @JsonProperty("vnicdb_cmd_history_size")
    private Integer vnicdbCmdHistorySize = 256;

    @JsonProperty("vs_host_redundancy")
    private Boolean vsHostRedundancy;

    @JsonProperty("vs_scalein_timeout")
    private Integer vsScaleinTimeout = 30;

    @JsonProperty("vs_scalein_timeout_for_upgrade")
    private Integer vsScaleinTimeoutForUpgrade = 30;

    @JsonProperty("vs_scaleout_timeout")
    private Integer vsScaleoutTimeout = 600;

    @JsonProperty("vs_se_primary_switchover_additional_wait_time")
    private Integer vsSePrimarySwitchoverAdditionalWaitTime = 0;

    @JsonProperty("vs_se_scalein_additional_wait_time")
    private Integer vsSeScaleinAdditionalWaitTime = 0;

    @JsonProperty("vs_se_scaleout_additional_wait_time")
    private Integer vsSeScaleoutAdditionalWaitTime = 0;

    @JsonProperty("vs_se_scaleout_ready_timeout")
    private Integer vsSeScaleoutReadyTimeout = 60;

    @JsonProperty("vs_switchover_timeout")
    private Integer vsSwitchoverTimeout = 300;

    @JsonProperty("vss_placement")
    private VssPlacement vssPlacement;

    @JsonProperty("vss_placement_enabled")
    private Boolean vssPlacementEnabled = false;

    @JsonProperty("waf_mempool")
    private Boolean wafMempool = true;

    @JsonProperty("waf_mempool_size")
    private Integer wafMempoolSize = 64;



    /**
     * This is the getter method this will return the attribute value.
     * Enable accelerated networking option for azure se.
     * Accelerated networking enables single root i/o virtualization (sr-iov) to a se vm.
     * This improves networking performance.
     * Field introduced in 17.2.14,18.1.5,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return acceleratedNetworking
     */
    public Boolean getAcceleratedNetworking() {
        return acceleratedNetworking;
    }

    /**
     * This is the setter method to the attribute.
     * Enable accelerated networking option for azure se.
     * Accelerated networking enables single root i/o virtualization (sr-iov) to a se vm.
     * This improves networking performance.
     * Field introduced in 17.2.14,18.1.5,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param acceleratedNetworking set the acceleratedNetworking.
     */
    public void setAcceleratedNetworking(Boolean  acceleratedNetworking) {
        this.acceleratedNetworking = acceleratedNetworking;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service engines in active/standby mode for ha failover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return activeStandby
     */
    public Boolean getActiveStandby() {
        return activeStandby;
    }

    /**
     * This is the setter method to the attribute.
     * Service engines in active/standby mode for ha failover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param activeStandby set the activeStandby.
     */
    public void setActiveStandby(Boolean  activeStandby) {
        this.activeStandby = activeStandby;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable aggressive failover configuration for ha.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return aggressiveFailureDetection
     */
    public Boolean getAggressiveFailureDetection() {
        return aggressiveFailureDetection;
    }

    /**
     * This is the setter method to the attribute.
     * Enable aggressive failover configuration for ha.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param aggressiveFailureDetection set the aggressiveFailureDetection.
     */
    public void setAggressiveFailureDetection(Boolean  aggressiveFailureDetection) {
        this.aggressiveFailureDetection = aggressiveFailureDetection;
    }

    /**
     * This is the getter method this will return the attribute value.
     * In compact placement, virtual services are placed on existing ses until max_vs_per_se limit is reached.
     * In distributed placement, virtual services are placed on new ses until max_se limit is reached.
     * Once this limit is reached, virtual services are placed on ses with least load.
     * Enum options - PLACEMENT_ALGO_PACKED, PLACEMENT_ALGO_DISTRIBUTED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "PLACEMENT_ALGO_PACKED".
     * @return algo
     */
    public String getAlgo() {
        return algo;
    }

    /**
     * This is the setter method to the attribute.
     * In compact placement, virtual services are placed on existing ses until max_vs_per_se limit is reached.
     * In distributed placement, virtual services are placed on new ses until max_se limit is reached.
     * Once this limit is reached, virtual services are placed on ses with least load.
     * Enum options - PLACEMENT_ALGO_PACKED, PLACEMENT_ALGO_DISTRIBUTED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "PLACEMENT_ALGO_PACKED".
     * @param algo set the algo.
     */
    public void setAlgo(String  algo) {
        this.algo = algo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allow ses to be created using burst license.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowBurst
     */
    public Boolean getAllowBurst() {
        return allowBurst;
    }

    /**
     * This is the setter method to the attribute.
     * Allow ses to be created using burst license.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param allowBurst set the allowBurst.
     */
    public void setAllowBurst(Boolean  allowBurst) {
        this.allowBurst = allowBurst;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A percent value of total se memory reserved for applicationcaching.
     * This is an se bootup property and requires se restart.requires se reboot.
     * Allowed values are 0 - 100.
     * Special values are 0- disable.
     * Field introduced in 18.2.3.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Special default for essentials edition is 0, basic edition is 0, enterprise is 10.
     * @return appCachePercent
     */
    public Integer getAppCachePercent() {
        return appCachePercent;
    }

    /**
     * This is the setter method to the attribute.
     * A percent value of total se memory reserved for applicationcaching.
     * This is an se bootup property and requires se restart.requires se reboot.
     * Allowed values are 0 - 100.
     * Special values are 0- disable.
     * Field introduced in 18.2.3.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Special default for essentials edition is 0, basic edition is 0, enterprise is 10.
     * @param appCachePercent set the appCachePercent.
     */
    public void setAppCachePercent(Integer  appCachePercent) {
        this.appCachePercent = appCachePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The max memory that can be allocated for the app cache.
     * This value will act as an upper bound on the cache size specified in app_cache_percent.
     * Special values are 0- disable.
     * Field introduced in 20.1.1.
     * Unit is gb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return appCacheThreshold
     */
    public Integer getAppCacheThreshold() {
        return appCacheThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * The max memory that can be allocated for the app cache.
     * This value will act as an upper bound on the cache size specified in app_cache_percent.
     * Special values are 0- disable.
     * Field introduced in 20.1.1.
     * Unit is gb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param appCacheThreshold set the appCacheThreshold.
     */
    public void setAppCacheThreshold(Integer  appCacheThreshold) {
        this.appCacheThreshold = appCacheThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A percent value of total se memory reserved for application learning.
     * This is an se bootup property and requires se restart.
     * Allowed values are 0 - 10.
     * Field introduced in 18.2.3.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return appLearningMemoryPercent
     */
    public Integer getAppLearningMemoryPercent() {
        return appLearningMemoryPercent;
    }

    /**
     * This is the setter method to the attribute.
     * A percent value of total se memory reserved for application learning.
     * This is an se bootup property and requires se restart.
     * Allowed values are 0 - 10.
     * Field introduced in 18.2.3.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param appLearningMemoryPercent set the appLearningMemoryPercent.
     */
    public void setAppLearningMemoryPercent(Integer  appLearningMemoryPercent) {
        this.appLearningMemoryPercent = appLearningMemoryPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Amount of se memory in gb until which shared memory is collected in core archive.
     * Field introduced in 17.1.3.
     * Unit is gb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return archiveShmLimit
     */
    public Integer getArchiveShmLimit() {
        return archiveShmLimit;
    }

    /**
     * This is the setter method to the attribute.
     * Amount of se memory in gb until which shared memory is collected in core archive.
     * Field introduced in 17.1.3.
     * Unit is gb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param archiveShmLimit set the archiveShmLimit.
     */
    public void setArchiveShmLimit(Integer  archiveShmLimit) {
        this.archiveShmLimit = archiveShmLimit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ssl handshakes will be handled by dedicated ssl threads.requires se reboot.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return asyncSsl
     */
    public Boolean getAsyncSsl() {
        return asyncSsl;
    }

    /**
     * This is the setter method to the attribute.
     * Ssl handshakes will be handled by dedicated ssl threads.requires se reboot.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param asyncSsl set the asyncSsl.
     */
    public void setAsyncSsl(Boolean  asyncSsl) {
        this.asyncSsl = asyncSsl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of async ssl threads per se_dp.requires se reboot.
     * Allowed values are 1-16.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return asyncSslThreads
     */
    public Integer getAsyncSslThreads() {
        return asyncSslThreads;
    }

    /**
     * This is the setter method to the attribute.
     * Number of async ssl threads per se_dp.requires se reboot.
     * Allowed values are 1-16.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param asyncSslThreads set the asyncSslThreads.
     */
    public void setAsyncSslThreads(Integer  asyncSslThreads) {
        this.asyncSslThreads = asyncSslThreads;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If set, virtual services will be automatically migrated when load on an se is less than minimum or more than maximum thresholds.
     * Only alerts are generated when the auto_rebalance is not set.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return autoRebalance
     */
    public Boolean getAutoRebalance() {
        return autoRebalance;
    }

    /**
     * This is the setter method to the attribute.
     * If set, virtual services will be automatically migrated when load on an se is less than minimum or more than maximum thresholds.
     * Only alerts are generated when the auto_rebalance is not set.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param autoRebalance set the autoRebalance.
     */
    public void setAutoRebalance(Boolean  autoRebalance) {
        this.autoRebalance = autoRebalance;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Capacities of se for auto rebalance for each criteria.
     * Field introduced in 17.2.4.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return autoRebalanceCapacityPerSe
     */
    public List<Integer> getAutoRebalanceCapacityPerSe() {
        return autoRebalanceCapacityPerSe;
    }

    /**
     * This is the setter method. this will set the autoRebalanceCapacityPerSe
     * Capacities of se for auto rebalance for each criteria.
     * Field introduced in 17.2.4.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return autoRebalanceCapacityPerSe
     */
    public void setAutoRebalanceCapacityPerSe(List<Integer>  autoRebalanceCapacityPerSe) {
        this.autoRebalanceCapacityPerSe = autoRebalanceCapacityPerSe;
    }

    /**
     * This is the setter method this will set the autoRebalanceCapacityPerSe
     * Capacities of se for auto rebalance for each criteria.
     * Field introduced in 17.2.4.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return autoRebalanceCapacityPerSe
     */
    public ServiceEngineGroup addAutoRebalanceCapacityPerSeItem(Integer autoRebalanceCapacityPerSeItem) {
      if (this.autoRebalanceCapacityPerSe == null) {
        this.autoRebalanceCapacityPerSe = new ArrayList<Integer>();
      }
      this.autoRebalanceCapacityPerSe.add(autoRebalanceCapacityPerSeItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Set of criteria for se auto rebalance.
     * Enum options - SE_AUTO_REBALANCE_CPU, SE_AUTO_REBALANCE_PPS, SE_AUTO_REBALANCE_MBPS, SE_AUTO_REBALANCE_OPEN_CONNS, SE_AUTO_REBALANCE_CPS.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return autoRebalanceCriteria
     */
    public List<String> getAutoRebalanceCriteria() {
        return autoRebalanceCriteria;
    }

    /**
     * This is the setter method. this will set the autoRebalanceCriteria
     * Set of criteria for se auto rebalance.
     * Enum options - SE_AUTO_REBALANCE_CPU, SE_AUTO_REBALANCE_PPS, SE_AUTO_REBALANCE_MBPS, SE_AUTO_REBALANCE_OPEN_CONNS, SE_AUTO_REBALANCE_CPS.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return autoRebalanceCriteria
     */
    public void setAutoRebalanceCriteria(List<String>  autoRebalanceCriteria) {
        this.autoRebalanceCriteria = autoRebalanceCriteria;
    }

    /**
     * This is the setter method this will set the autoRebalanceCriteria
     * Set of criteria for se auto rebalance.
     * Enum options - SE_AUTO_REBALANCE_CPU, SE_AUTO_REBALANCE_PPS, SE_AUTO_REBALANCE_MBPS, SE_AUTO_REBALANCE_OPEN_CONNS, SE_AUTO_REBALANCE_CPS.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return autoRebalanceCriteria
     */
    public ServiceEngineGroup addAutoRebalanceCriteriaItem(String autoRebalanceCriteriaItem) {
      if (this.autoRebalanceCriteria == null) {
        this.autoRebalanceCriteria = new ArrayList<String>();
      }
      this.autoRebalanceCriteria.add(autoRebalanceCriteriaItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Frequency of rebalance, if 'auto rebalance' is enabled.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @return autoRebalanceInterval
     */
    public Integer getAutoRebalanceInterval() {
        return autoRebalanceInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency of rebalance, if 'auto rebalance' is enabled.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @param autoRebalanceInterval set the autoRebalanceInterval.
     */
    public void setAutoRebalanceInterval(Integer  autoRebalanceInterval) {
        this.autoRebalanceInterval = autoRebalanceInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Redistribution of virtual services from the takeover se to the replacement se can cause momentary traffic loss.
     * If the auto-redistribute load option is left in its default off state, any desired rebalancing requires calls to rest api.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return autoRedistributeActiveStandbyLoad
     */
    public Boolean getAutoRedistributeActiveStandbyLoad() {
        return autoRedistributeActiveStandbyLoad;
    }

    /**
     * This is the setter method to the attribute.
     * Redistribution of virtual services from the takeover se to the replacement se can cause momentary traffic loss.
     * If the auto-redistribute load option is left in its default off state, any desired rebalancing requires calls to rest api.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param autoRedistributeActiveStandbyLoad set the autoRedistributeActiveStandbyLoad.
     */
    public void setAutoRedistributeActiveStandbyLoad(Boolean  autoRedistributeActiveStandbyLoad) {
        this.autoRedistributeActiveStandbyLoad = autoRedistributeActiveStandbyLoad;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Availability zones for virtual service high availability.
     * It is a reference to an object of type availabilityzone.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return availabilityZoneRefs
     */
    public List<String> getAvailabilityZoneRefs() {
        return availabilityZoneRefs;
    }

    /**
     * This is the setter method. this will set the availabilityZoneRefs
     * Availability zones for virtual service high availability.
     * It is a reference to an object of type availabilityzone.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return availabilityZoneRefs
     */
    public void setAvailabilityZoneRefs(List<String>  availabilityZoneRefs) {
        this.availabilityZoneRefs = availabilityZoneRefs;
    }

    /**
     * This is the setter method this will set the availabilityZoneRefs
     * Availability zones for virtual service high availability.
     * It is a reference to an object of type availabilityzone.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return availabilityZoneRefs
     */
    public ServiceEngineGroup addAvailabilityZoneRefsItem(String availabilityZoneRefsItem) {
      if (this.availabilityZoneRefs == null) {
        this.availabilityZoneRefs = new ArrayList<String>();
      }
      this.availabilityZoneRefs.add(availabilityZoneRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Control if dispatcher core also handles tcp flows in baremetal se.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return baremetalDispatcherHandlesFlows
     */
    public Boolean getBaremetalDispatcherHandlesFlows() {
        return baremetalDispatcherHandlesFlows;
    }

    /**
     * This is the setter method to the attribute.
     * Control if dispatcher core also handles tcp flows in baremetal se.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param baremetalDispatcherHandlesFlows set the baremetalDispatcherHandlesFlows.
     */
    public void setBaremetalDispatcherHandlesFlows(Boolean  baremetalDispatcherHandlesFlows) {
        this.baremetalDispatcherHandlesFlows = baremetalDispatcherHandlesFlows;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable bgp peer monitoring based failover.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return bgpPeerMonitorFailoverEnabled
     */
    public Boolean getBgpPeerMonitorFailoverEnabled() {
        return bgpPeerMonitorFailoverEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable bgp peer monitoring based failover.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param bgpPeerMonitorFailoverEnabled set the bgpPeerMonitorFailoverEnabled.
     */
    public void setBgpPeerMonitorFailoverEnabled(Boolean  bgpPeerMonitorFailoverEnabled) {
        this.bgpPeerMonitorFailoverEnabled = bgpPeerMonitorFailoverEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Bgp peer state update interval.
     * Allowed values are 5-100.
     * Field introduced in 17.2.14,18.1.5,18.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return bgpStateUpdateInterval
     */
    public Integer getBgpStateUpdateInterval() {
        return bgpStateUpdateInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Bgp peer state update interval.
     * Allowed values are 5-100.
     * Field introduced in 17.2.14,18.1.5,18.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param bgpStateUpdateInterval set the bgpStateUpdateInterval.
     */
    public void setBgpStateUpdateInterval(Integer  bgpStateUpdateInterval) {
        this.bgpStateUpdateInterval = bgpStateUpdateInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Excess service engine capacity provisioned for ha failover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return bufferSe
     */
    public Integer getBufferSe() {
        return bufferSe;
    }

    /**
     * This is the setter method to the attribute.
     * Excess service engine capacity provisioned for ha failover.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param bufferSe set the bufferSe.
     */
    public void setBufferSe(Integer  bufferSe) {
        this.bufferSe = bufferSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type cloud.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudRef set the cloudRef.
     */
    public void setCloudRef(String  cloudRef) {
        this.cloudRef = cloudRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Compress ip rules into a single subnet based ip rule for each north-south ipam subnet configured in pcap mode in openshift/kubernetes node.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return compressIpRulesForEachNsSubnet
     */
    public Boolean getCompressIpRulesForEachNsSubnet() {
        return compressIpRulesForEachNsSubnet;
    }

    /**
     * This is the setter method to the attribute.
     * Compress ip rules into a single subnet based ip rule for each north-south ipam subnet configured in pcap mode in openshift/kubernetes node.
     * Field introduced in 18.2.9, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param compressIpRulesForEachNsSubnet set the compressIpRulesForEachNsSubnet.
     */
    public void setCompressIpRulesForEachNsSubnet(Boolean  compressIpRulesForEachNsSubnet) {
        this.compressIpRulesForEachNsSubnet = compressIpRulesForEachNsSubnet;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable config debugs on all cores of se.
     * Field introduced in 17.2.13,18.1.5,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return configDebugsOnAllCores
     */
    public Boolean getConfigDebugsOnAllCores() {
        return configDebugsOnAllCores;
    }

    /**
     * This is the setter method to the attribute.
     * Enable config debugs on all cores of se.
     * Field introduced in 17.2.13,18.1.5,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param configDebugsOnAllCores set the configDebugsOnAllCores.
     */
    public void setConfigDebugsOnAllCores(Boolean  configDebugsOnAllCores) {
        this.configDebugsOnAllCores = configDebugsOnAllCores;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Percentage of memory for connection state.
     * This will come at the expense of memory used for http in-memory cache.
     * Allowed values are 10-90.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 50.
     * @return connectionMemoryPercentage
     */
    public Integer getConnectionMemoryPercentage() {
        return connectionMemoryPercentage;
    }

    /**
     * This is the setter method to the attribute.
     * Percentage of memory for connection state.
     * This will come at the expense of memory used for http in-memory cache.
     * Allowed values are 10-90.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 50.
     * @param connectionMemoryPercentage set the connectionMemoryPercentage.
     */
    public void setConnectionMemoryPercentage(Integer  connectionMemoryPercentage) {
        this.connectionMemoryPercentage = connectionMemoryPercentage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Include shared memory for app cache in core file.requires se reboot.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return coreShmAppCache
     */
    public Boolean getCoreShmAppCache() {
        return coreShmAppCache;
    }

    /**
     * This is the setter method to the attribute.
     * Include shared memory for app cache in core file.requires se reboot.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param coreShmAppCache set the coreShmAppCache.
     */
    public void setCoreShmAppCache(Boolean  coreShmAppCache) {
        this.coreShmAppCache = coreShmAppCache;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Include shared memory for app learning in core file.requires se reboot.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return coreShmAppLearning
     */
    public Boolean getCoreShmAppLearning() {
        return coreShmAppLearning;
    }

    /**
     * This is the setter method to the attribute.
     * Include shared memory for app learning in core file.requires se reboot.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param coreShmAppLearning set the coreShmAppLearning.
     */
    public void setCoreShmAppLearning(Boolean  coreShmAppLearning) {
        this.coreShmAppLearning = coreShmAppLearning;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return cpuReserve
     */
    public Boolean getCpuReserve() {
        return cpuReserve;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param cpuReserve set the cpuReserve.
     */
    public void setCpuReserve(Boolean  cpuReserve) {
        this.cpuReserve = cpuReserve;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allocate all the cpu cores for the service engine virtual machines  on the same cpu socket.
     * Applicable only for vcenter cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return cpuSocketAffinity
     */
    public Boolean getCpuSocketAffinity() {
        return cpuSocketAffinity;
    }

    /**
     * This is the setter method to the attribute.
     * Allocate all the cpu cores for the service engine virtual machines  on the same cpu socket.
     * Applicable only for vcenter cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param cpuSocketAffinity set the cpuSocketAffinity.
     */
    public void setCpuSocketAffinity(Boolean  cpuSocketAffinity) {
        this.cpuSocketAffinity = cpuSocketAffinity;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Custom security groups to be associated with data vnics for se instances in openstack and aws clouds.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customSecuritygroupsData
     */
    public List<String> getCustomSecuritygroupsData() {
        return customSecuritygroupsData;
    }

    /**
     * This is the setter method. this will set the customSecuritygroupsData
     * Custom security groups to be associated with data vnics for se instances in openstack and aws clouds.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customSecuritygroupsData
     */
    public void setCustomSecuritygroupsData(List<String>  customSecuritygroupsData) {
        this.customSecuritygroupsData = customSecuritygroupsData;
    }

    /**
     * This is the setter method this will set the customSecuritygroupsData
     * Custom security groups to be associated with data vnics for se instances in openstack and aws clouds.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customSecuritygroupsData
     */
    public ServiceEngineGroup addCustomSecuritygroupsDataItem(String customSecuritygroupsDataItem) {
      if (this.customSecuritygroupsData == null) {
        this.customSecuritygroupsData = new ArrayList<String>();
      }
      this.customSecuritygroupsData.add(customSecuritygroupsDataItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Custom security groups to be associated with management vnic for se instances in openstack and aws clouds.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customSecuritygroupsMgmt
     */
    public List<String> getCustomSecuritygroupsMgmt() {
        return customSecuritygroupsMgmt;
    }

    /**
     * This is the setter method. this will set the customSecuritygroupsMgmt
     * Custom security groups to be associated with management vnic for se instances in openstack and aws clouds.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customSecuritygroupsMgmt
     */
    public void setCustomSecuritygroupsMgmt(List<String>  customSecuritygroupsMgmt) {
        this.customSecuritygroupsMgmt = customSecuritygroupsMgmt;
    }

    /**
     * This is the setter method this will set the customSecuritygroupsMgmt
     * Custom security groups to be associated with management vnic for se instances in openstack and aws clouds.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customSecuritygroupsMgmt
     */
    public ServiceEngineGroup addCustomSecuritygroupsMgmtItem(String customSecuritygroupsMgmtItem) {
      if (this.customSecuritygroupsMgmt == null) {
        this.customSecuritygroupsMgmt = new ArrayList<String>();
      }
      this.customSecuritygroupsMgmt.add(customSecuritygroupsMgmtItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Custom tag will be used to create the tags for se instance in aws.
     * Note this is not the same as the prefix for se name.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customTag
     */
    public List<CustomTag> getCustomTag() {
        return customTag;
    }

    /**
     * This is the setter method. this will set the customTag
     * Custom tag will be used to create the tags for se instance in aws.
     * Note this is not the same as the prefix for se name.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customTag
     */
    public void setCustomTag(List<CustomTag>  customTag) {
        this.customTag = customTag;
    }

    /**
     * This is the setter method this will set the customTag
     * Custom tag will be used to create the tags for se instance in aws.
     * Note this is not the same as the prefix for se name.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customTag
     */
    public ServiceEngineGroup addCustomTagItem(CustomTag customTagItem) {
      if (this.customTag == null) {
        this.customTag = new ArrayList<CustomTag>();
      }
      this.customTag.add(customTagItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Subnet used to spin up the data nic for service engines, used only for azure cloud.
     * Overrides the cloud level setting for service engine subnet.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dataNetworkId
     */
    public String getDataNetworkId() {
        return dataNetworkId;
    }

    /**
     * This is the setter method to the attribute.
     * Subnet used to spin up the data nic for service engines, used only for azure cloud.
     * Overrides the cloud level setting for service engine subnet.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dataNetworkId set the dataNetworkId.
     */
    public void setDataNetworkId(String  dataNetworkId) {
        this.dataNetworkId = dataNetworkId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of instructions before datascript times out.
     * Allowed values are 0-100000000.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000000.
     * @return datascriptTimeout
     */
    public Integer getDatascriptTimeout() {
        return datascriptTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Number of instructions before datascript times out.
     * Allowed values are 0-100000000.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000000.
     * @param datascriptTimeout set the datascriptTimeout.
     */
    public void setDatascriptTimeout(Integer  datascriptTimeout) {
        this.datascriptTimeout = datascriptTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If activated, ipv6 address and route discovery are deactivated.requires se reboot.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return deactivateIpv6Discovery
     */
    public Boolean getDeactivateIpv6Discovery() {
        return deactivateIpv6Discovery;
    }

    /**
     * This is the setter method to the attribute.
     * If activated, ipv6 address and route discovery are deactivated.requires se reboot.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param deactivateIpv6Discovery set the deactivateIpv6Discovery.
     */
    public void setDeactivateIpv6Discovery(Boolean  deactivateIpv6Discovery) {
        this.deactivateIpv6Discovery = deactivateIpv6Discovery;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deactivate filtering of packets to kni interface.
     * To be used under surveillance of avi support.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return deactivateKniFilteringAtDispatcher
     */
    public Boolean getDeactivateKniFilteringAtDispatcher() {
        return deactivateKniFilteringAtDispatcher;
    }

    /**
     * This is the setter method to the attribute.
     * Deactivate filtering of packets to kni interface.
     * To be used under surveillance of avi support.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param deactivateKniFilteringAtDispatcher set the deactivateKniFilteringAtDispatcher.
     */
    public void setDeactivateKniFilteringAtDispatcher(Boolean  deactivateKniFilteringAtDispatcher) {
        this.deactivateKniFilteringAtDispatcher = deactivateKniFilteringAtDispatcher;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dedicate the core that handles packet receive/transmit from the network to just the dispatching function.
     * Don't use it for tcp/ip and ssl functions.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dedicatedDispatcherCore
     */
    public Boolean getDedicatedDispatcherCore() {
        return dedicatedDispatcherCore;
    }

    /**
     * This is the setter method to the attribute.
     * Dedicate the core that handles packet receive/transmit from the network to just the dispatching function.
     * Don't use it for tcp/ip and ssl functions.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dedicatedDispatcherCore set the dedicatedDispatcherCore.
     */
    public void setDedicatedDispatcherCore(Boolean  dedicatedDispatcherCore) {
        this.dedicatedDispatcherCore = dedicatedDispatcherCore;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * By default, avi creates and manages security groups along with custom sg provided by user.
     * Set this to true to disallow avi to create and manage new security groups.
     * Avi will only make use of custom security groups provided by user.
     * This option is supported for aws and openstack cloud types.
     * Field introduced in 17.2.13,18.1.4,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return disableAviSecuritygroups
     */
    public Boolean getDisableAviSecuritygroups() {
        return disableAviSecuritygroups;
    }

    /**
     * This is the setter method to the attribute.
     * By default, avi creates and manages security groups along with custom sg provided by user.
     * Set this to true to disallow avi to create and manage new security groups.
     * Avi will only make use of custom security groups provided by user.
     * This option is supported for aws and openstack cloud types.
     * Field introduced in 17.2.13,18.1.4,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param disableAviSecuritygroups set the disableAviSecuritygroups.
     */
    public void setDisableAviSecuritygroups(Boolean  disableAviSecuritygroups) {
        this.disableAviSecuritygroups = disableAviSecuritygroups;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Stop using tcp/udp and ip checksum offload features of nics.
     * Field introduced in 17.1.14, 17.2.5, 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return disableCsumOffloads
     */
    public Boolean getDisableCsumOffloads() {
        return disableCsumOffloads;
    }

    /**
     * This is the setter method to the attribute.
     * Stop using tcp/udp and ip checksum offload features of nics.
     * Field introduced in 17.1.14, 17.2.5, 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param disableCsumOffloads set the disableCsumOffloads.
     */
    public void setDisableCsumOffloads(Boolean  disableCsumOffloads) {
        this.disableCsumOffloads = disableCsumOffloads;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Disable flow probes for scaled out vs'es.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return disableFlowProbes
     */
    public Boolean getDisableFlowProbes() {
        return disableFlowProbes;
    }

    /**
     * This is the setter method to the attribute.
     * Disable flow probes for scaled out vs'es.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param disableFlowProbes set the disableFlowProbes.
     */
    public void setDisableFlowProbes(Boolean  disableFlowProbes) {
        this.disableFlowProbes = disableFlowProbes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Disable generic receive offload (gro) in dpdk poll-mode driver packet receive path.
     * Gro can be enabled on nics that do not support lro (large receive offload) or do not gain performance boost from lro.
     * Gro is on by default on nics in a system with 8 vcpus or higher.
     * Field introduced in 17.2.5, 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return disableGro
     */
    public Boolean getDisableGro() {
        return disableGro;
    }

    /**
     * This is the setter method to the attribute.
     * Disable generic receive offload (gro) in dpdk poll-mode driver packet receive path.
     * Gro can be enabled on nics that do not support lro (large receive offload) or do not gain performance boost from lro.
     * Gro is on by default on nics in a system with 8 vcpus or higher.
     * Field introduced in 17.2.5, 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param disableGro set the disableGro.
     */
    public void setDisableGro(Boolean  disableGro) {
        this.disableGro = disableGro;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If set, disable the config memory check done in service engine.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return disableSeMemoryCheck
     */
    public Boolean getDisableSeMemoryCheck() {
        return disableSeMemoryCheck;
    }

    /**
     * This is the setter method to the attribute.
     * If set, disable the config memory check done in service engine.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param disableSeMemoryCheck set the disableSeMemoryCheck.
     */
    public void setDisableSeMemoryCheck(Boolean  disableSeMemoryCheck) {
        this.disableSeMemoryCheck = disableSeMemoryCheck;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Disable tcp segmentation offload (tso) in dpdk poll-mode driver packet transmit path.
     * Tso is on by default on nics that support it.
     * Field introduced in 17.2.5, 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return disableTso
     */
    public Boolean getDisableTso() {
        return disableTso;
    }

    /**
     * This is the setter method to the attribute.
     * Disable tcp segmentation offload (tso) in dpdk poll-mode driver packet transmit path.
     * Tso is on by default on nics that support it.
     * Field introduced in 17.2.5, 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param disableTso set the disableTso.
     */
    public void setDisableTso(Boolean  disableTso) {
        this.disableTso = disableTso;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Amount of disk space for each of the service engine virtual machines.
     * Unit is gb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @return diskPerSe
     */
    public Integer getDiskPerSe() {
        return diskPerSe;
    }

    /**
     * This is the setter method to the attribute.
     * Amount of disk space for each of the service engine virtual machines.
     * Unit is gb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @param diskPerSe set the diskPerSe.
     */
    public void setDiskPerSe(Integer  diskPerSe) {
        this.diskPerSe = diskPerSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Use both the active and standby service engines for virtual service placement in the legacy active standby ha mode.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return distributeLoadActiveStandby
     */
    public Boolean getDistributeLoadActiveStandby() {
        return distributeLoadActiveStandby;
    }

    /**
     * This is the setter method to the attribute.
     * Use both the active and standby service engines for virtual service placement in the legacy active standby ha mode.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param distributeLoadActiveStandby set the distributeLoadActiveStandby.
     */
    public void setDistributeLoadActiveStandby(Boolean  distributeLoadActiveStandby) {
        this.distributeLoadActiveStandby = distributeLoadActiveStandby;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Distributes queue ownership among cores so multiple cores handle dispatcher duties.
     * Requires se reboot.
     * Deprecated from 18.2.8, instead use max_queues_per_vnic.
     * Field introduced in 17.2.8.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return distributeQueues
     */
    public Boolean getDistributeQueues() {
        return distributeQueues;
    }

    /**
     * This is the setter method to the attribute.
     * Distributes queue ownership among cores so multiple cores handle dispatcher duties.
     * Requires se reboot.
     * Deprecated from 18.2.8, instead use max_queues_per_vnic.
     * Field introduced in 17.2.8.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param distributeQueues set the distributeQueues.
     */
    public void setDistributeQueues(Boolean  distributeQueues) {
        this.distributeQueues = distributeQueues;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Distributes vnic ownership among cores so multiple cores handle dispatcher duties.requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return distributeVnics
     */
    public Boolean getDistributeVnics() {
        return distributeVnics;
    }

    /**
     * This is the setter method to the attribute.
     * Distributes vnic ownership among cores so multiple cores handle dispatcher duties.requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param distributeVnics set the distributeVnics.
     */
    public void setDistributeVnics(Boolean  distributeVnics) {
        this.distributeVnics = distributeVnics;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for downstream to become writable.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @return downstreamSendTimeout
     */
    public Integer getDownstreamSendTimeout() {
        return downstreamSendTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout for downstream to become writable.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @param downstreamSendTimeout set the downstreamSendTimeout.
     */
    public void setDownstreamSendTimeout(Integer  downstreamSendTimeout) {
        this.downstreamSendTimeout = downstreamSendTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dequeue interval for receive queue from se_dp in aggressive mode.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return dpAggressiveDeqIntervalMsec
     */
    public Integer getDpAggressiveDeqIntervalMsec() {
        return dpAggressiveDeqIntervalMsec;
    }

    /**
     * This is the setter method to the attribute.
     * Dequeue interval for receive queue from se_dp in aggressive mode.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param dpAggressiveDeqIntervalMsec set the dpAggressiveDeqIntervalMsec.
     */
    public void setDpAggressiveDeqIntervalMsec(Integer  dpAggressiveDeqIntervalMsec) {
        this.dpAggressiveDeqIntervalMsec = dpAggressiveDeqIntervalMsec;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enqueue interval for request queue to se_dp in aggressive mode.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return dpAggressiveEnqIntervalMsec
     */
    public Integer getDpAggressiveEnqIntervalMsec() {
        return dpAggressiveEnqIntervalMsec;
    }

    /**
     * This is the setter method to the attribute.
     * Enqueue interval for request queue to se_dp in aggressive mode.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param dpAggressiveEnqIntervalMsec set the dpAggressiveEnqIntervalMsec.
     */
    public void setDpAggressiveEnqIntervalMsec(Integer  dpAggressiveEnqIntervalMsec) {
        this.dpAggressiveEnqIntervalMsec = dpAggressiveEnqIntervalMsec;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Frequency of se - se hb messages when aggressive failure mode detection is enabled.
     * Field introduced in 20.1.3.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return dpAggressiveHbFrequency
     */
    public Integer getDpAggressiveHbFrequency() {
        return dpAggressiveHbFrequency;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency of se - se hb messages when aggressive failure mode detection is enabled.
     * Field introduced in 20.1.3.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param dpAggressiveHbFrequency set the dpAggressiveHbFrequency.
     */
    public void setDpAggressiveHbFrequency(Integer  dpAggressiveHbFrequency) {
        this.dpAggressiveHbFrequency = dpAggressiveHbFrequency;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Consecutive hb failures after which failure is reported to controller,when aggressive failure mode detection is enabled.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return dpAggressiveHbTimeoutCount
     */
    public Integer getDpAggressiveHbTimeoutCount() {
        return dpAggressiveHbTimeoutCount;
    }

    /**
     * This is the setter method to the attribute.
     * Consecutive hb failures after which failure is reported to controller,when aggressive failure mode detection is enabled.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param dpAggressiveHbTimeoutCount set the dpAggressiveHbTimeoutCount.
     */
    public void setDpAggressiveHbTimeoutCount(Integer  dpAggressiveHbTimeoutCount) {
        this.dpAggressiveHbTimeoutCount = dpAggressiveHbTimeoutCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dequeue interval for receive queue from se_dp.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @return dpDeqIntervalMsec
     */
    public Integer getDpDeqIntervalMsec() {
        return dpDeqIntervalMsec;
    }

    /**
     * This is the setter method to the attribute.
     * Dequeue interval for receive queue from se_dp.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @param dpDeqIntervalMsec set the dpDeqIntervalMsec.
     */
    public void setDpDeqIntervalMsec(Integer  dpDeqIntervalMsec) {
        this.dpDeqIntervalMsec = dpDeqIntervalMsec;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enqueue interval for request queue to se_dp.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @return dpEnqIntervalMsec
     */
    public Integer getDpEnqIntervalMsec() {
        return dpEnqIntervalMsec;
    }

    /**
     * This is the setter method to the attribute.
     * Enqueue interval for request queue to se_dp.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @param dpEnqIntervalMsec set the dpEnqIntervalMsec.
     */
    public void setDpEnqIntervalMsec(Integer  dpEnqIntervalMsec) {
        this.dpEnqIntervalMsec = dpEnqIntervalMsec;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Frequency of se - se hb messages when aggressive failure mode detection is not enabled.
     * Field introduced in 20.1.3.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return dpHbFrequency
     */
    public Integer getDpHbFrequency() {
        return dpHbFrequency;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency of se - se hb messages when aggressive failure mode detection is not enabled.
     * Field introduced in 20.1.3.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param dpHbFrequency set the dpHbFrequency.
     */
    public void setDpHbFrequency(Integer  dpHbFrequency) {
        this.dpHbFrequency = dpHbFrequency;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Consecutive hb failures after which failure is reported to controller, when aggressive failure mode detection is not enabled.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return dpHbTimeoutCount
     */
    public Integer getDpHbTimeoutCount() {
        return dpHbTimeoutCount;
    }

    /**
     * This is the setter method to the attribute.
     * Consecutive hb failures after which failure is reported to controller, when aggressive failure mode detection is not enabled.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param dpHbTimeoutCount set the dpHbTimeoutCount.
     */
    public void setDpHbTimeoutCount(Integer  dpHbTimeoutCount) {
        this.dpHbTimeoutCount = dpHbTimeoutCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The timeout for gro coalescing interval.
     * 0 indicates non-timer based gro.
     * Allowed values are 0-900.
     * Field introduced in 22.1.1.
     * Unit is microseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 50.
     * @return dpdkGroTimeoutInterval
     */
    public Integer getDpdkGroTimeoutInterval() {
        return dpdkGroTimeoutInterval;
    }

    /**
     * This is the setter method to the attribute.
     * The timeout for gro coalescing interval.
     * 0 indicates non-timer based gro.
     * Allowed values are 0-900.
     * Field introduced in 22.1.1.
     * Unit is microseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 50.
     * @param dpdkGroTimeoutInterval set the dpdkGroTimeoutInterval.
     */
    public void setDpdkGroTimeoutInterval(Integer  dpdkGroTimeoutInterval) {
        this.dpdkGroTimeoutInterval = dpdkGroTimeoutInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable gratarp for vip_ip.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableGratarpPermanent
     */
    public Boolean getEnableGratarpPermanent() {
        return enableGratarpPermanent;
    }

    /**
     * This is the setter method to the attribute.
     * Enable gratarp for vip_ip.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableGratarpPermanent set the enableGratarpPermanent.
     */
    public void setEnableGratarpPermanent(Boolean  enableGratarpPermanent) {
        this.enableGratarpPermanent = enableGratarpPermanent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable hsm luna engine logs.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableHsmLog
     */
    public Boolean getEnableHsmLog() {
        return enableHsmLog;
    }

    /**
     * This is the setter method to the attribute.
     * Enable hsm luna engine logs.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableHsmLog set the enableHsmLog.
     */
    public void setEnableHsmLog(Boolean  enableHsmLog) {
        this.enableHsmLog = enableHsmLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * (this is a beta feature).
     * Enable hsm key priming.
     * If enabled, key handles on the hsm will be synced to se before processing client connections.
     * Field introduced in 17.2.7, 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableHsmPriming
     */
    public Boolean getEnableHsmPriming() {
        return enableHsmPriming;
    }

    /**
     * This is the setter method to the attribute.
     * (this is a beta feature).
     * Enable hsm key priming.
     * If enabled, key handles on the hsm will be synced to se before processing client connections.
     * Field introduced in 17.2.7, 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableHsmPriming set the enableHsmPriming.
     */
    public void setEnableHsmPriming(Boolean  enableHsmPriming) {
        this.enableHsmPriming = enableHsmPriming;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Applicable only for azure cloud with basic sku lb.
     * If set, additional azure lbs will be automatically created if resources in existing lb are exhausted.
     * Field introduced in 17.2.10, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableMultiLb
     */
    public Boolean getEnableMultiLb() {
        return enableMultiLb;
    }

    /**
     * This is the setter method to the attribute.
     * Applicable only for azure cloud with basic sku lb.
     * If set, additional azure lbs will be automatically created if resources in existing lb are exhausted.
     * Field introduced in 17.2.10, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableMultiLb set the enableMultiLb.
     */
    public void setEnableMultiLb(Boolean  enableMultiLb) {
        this.enableMultiLb = enableMultiLb;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable tx ring support in pcap mode of operation.
     * Tso feature is not supported with tx ring enabled.
     * Deprecated from 18.2.8, instead use pcap_tx_mode.
     * Requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enablePcapTxRing
     */
    public Boolean getEnablePcapTxRing() {
        return enablePcapTxRing;
    }

    /**
     * This is the setter method to the attribute.
     * Enable tx ring support in pcap mode of operation.
     * Tso feature is not supported with tx ring enabled.
     * Deprecated from 18.2.8, instead use pcap_tx_mode.
     * Requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enablePcapTxRing set the enablePcapTxRing.
     */
    public void setEnablePcapTxRing(Boolean  enablePcapTxRing) {
        this.enablePcapTxRing = enablePcapTxRing;
    }

    /**
     * This is the getter method this will return the attribute value.
     * End local ephemeral port number for outbound connections.
     * Field introduced in 17.2.13, 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ephemeralPortrangeEnd
     */
    public Integer getEphemeralPortrangeEnd() {
        return ephemeralPortrangeEnd;
    }

    /**
     * This is the setter method to the attribute.
     * End local ephemeral port number for outbound connections.
     * Field introduced in 17.2.13, 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ephemeralPortrangeEnd set the ephemeralPortrangeEnd.
     */
    public void setEphemeralPortrangeEnd(Integer  ephemeralPortrangeEnd) {
        this.ephemeralPortrangeEnd = ephemeralPortrangeEnd;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Start local ephemeral port number for outbound connections.
     * Field introduced in 17.2.13, 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ephemeralPortrangeStart
     */
    public Integer getEphemeralPortrangeStart() {
        return ephemeralPortrangeStart;
    }

    /**
     * This is the setter method to the attribute.
     * Start local ephemeral port number for outbound connections.
     * Field introduced in 17.2.13, 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ephemeralPortrangeStart set the ephemeralPortrangeStart.
     */
    public void setEphemeralPortrangeStart(Integer  ephemeralPortrangeStart) {
        this.ephemeralPortrangeStart = ephemeralPortrangeStart;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Multiplier for extra config to support large vs/pool config.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
     * @return extraConfigMultiplier
     */
    public Float getExtraConfigMultiplier() {
        return extraConfigMultiplier;
    }

    /**
     * This is the setter method to the attribute.
     * Multiplier for extra config to support large vs/pool config.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.0f.
     * @param extraConfigMultiplier set the extraConfigMultiplier.
     */
    public void setExtraConfigMultiplier(Float  extraConfigMultiplier) {
        this.extraConfigMultiplier = extraConfigMultiplier;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Extra config memory to support large geo db configuration.
     * Field introduced in 17.1.1.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return extraSharedConfigMemory
     */
    public Integer getExtraSharedConfigMemory() {
        return extraSharedConfigMemory;
    }

    /**
     * This is the setter method to the attribute.
     * Extra config memory to support large geo db configuration.
     * Field introduced in 17.1.1.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param extraSharedConfigMemory set the extraSharedConfigMemory.
     */
    public void setExtraSharedConfigMemory(Integer  extraSharedConfigMemory) {
        this.extraSharedConfigMemory = extraSharedConfigMemory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of flow table entries that have not completed tcp three-way handshake yet.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return flowTableNewSynMaxEntries
     */
    public Integer getFlowTableNewSynMaxEntries() {
        return flowTableNewSynMaxEntries;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of flow table entries that have not completed tcp three-way handshake yet.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param flowTableNewSynMaxEntries set the flowTableNewSynMaxEntries.
     */
    public void setFlowTableNewSynMaxEntries(Integer  flowTableNewSynMaxEntries) {
        this.flowTableNewSynMaxEntries = flowTableNewSynMaxEntries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of entries in the free list.
     * Field introduced in 17.2.10, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @return freeListSize
     */
    public Integer getFreeListSize() {
        return freeListSize;
    }

    /**
     * This is the setter method to the attribute.
     * Number of entries in the free list.
     * Field introduced in 17.2.10, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @param freeListSize set the freeListSize.
     */
    public void setFreeListSize(Integer  freeListSize) {
        this.freeListSize = freeListSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Google cloud platform, service engine group configuration.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gcpConfig
     */
    public GCPSeGroupConfig getGcpConfig() {
        return gcpConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Google cloud platform, service engine group configuration.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gcpConfig set the gcpConfig.
     */
    public void setGcpConfig(GCPSeGroupConfig gcpConfig) {
        this.gcpConfig = gcpConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gratarp periodicity for vip-ip.
     * Allowed values are 5-30.
     * Field introduced in 18.2.3.
     * Unit is min.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return gratarpPermanentPeriodicity
     */
    public Integer getGratarpPermanentPeriodicity() {
        return gratarpPermanentPeriodicity;
    }

    /**
     * This is the setter method to the attribute.
     * Gratarp periodicity for vip-ip.
     * Allowed values are 5-30.
     * Field introduced in 18.2.3.
     * Unit is min.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param gratarpPermanentPeriodicity set the gratarpPermanentPeriodicity.
     */
    public void setGratarpPermanentPeriodicity(Integer  gratarpPermanentPeriodicity) {
        this.gratarpPermanentPeriodicity = gratarpPermanentPeriodicity;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout in seconds that se waits for a grpc channel to connect to server, before it retries.
     * Allowed values are 5-45.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @return grpcChannelConnectTimeout
     */
    public Integer getGrpcChannelConnectTimeout() {
        return grpcChannelConnectTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout in seconds that se waits for a grpc channel to connect to server, before it retries.
     * Allowed values are 5-45.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @param grpcChannelConnectTimeout set the grpcChannelConnectTimeout.
     */
    public void setGrpcChannelConnectTimeout(Integer  grpcChannelConnectTimeout) {
        this.grpcChannelConnectTimeout = grpcChannelConnectTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * High availability mode for all the virtual services using this service engine group.
     * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- ha_mode_legacy_active_standby), basic edition(allowed values-
     * ha_mode_legacy_active_standby), enterprise with cloud services edition.
     * Special default for essentials edition is ha_mode_legacy_active_standby, basic edition is ha_mode_legacy_active_standby, enterprise is
     * ha_mode_shared.
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    /**
     * This is the setter method to the attribute.
     * High availability mode for all the virtual services using this service engine group.
     * Enum options - HA_MODE_SHARED_PAIR, HA_MODE_SHARED, HA_MODE_LEGACY_ACTIVE_STANDBY.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- ha_mode_legacy_active_standby), basic edition(allowed values-
     * ha_mode_legacy_active_standby), enterprise with cloud services edition.
     * Special default for essentials edition is ha_mode_legacy_active_standby, basic edition is ha_mode_legacy_active_standby, enterprise is
     * ha_mode_shared.
     * @param haMode set the haMode.
     */
    public void setHaMode(String  haMode) {
        this.haMode = haMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configuration to handle per packet attack handling.for example, dns reflection attack is a type of attack where a response packet is sent to the
     * dns vs.this configuration tells if such packets should be dropped without further processing.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return handlePerPktAttack
     */
    public Boolean getHandlePerPktAttack() {
        return handlePerPktAttack;
    }

    /**
     * This is the setter method to the attribute.
     * Configuration to handle per packet attack handling.for example, dns reflection attack is a type of attack where a response packet is sent to the
     * dns vs.this configuration tells if such packets should be dropped without further processing.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param handlePerPktAttack set the handlePerPktAttack.
     */
    public void setHandlePerPktAttack(Boolean  handlePerPktAttack) {
        this.handlePerPktAttack = handlePerPktAttack;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type hardwaresecuritymodulegroup.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hardwaresecuritymodulegroupRef
     */
    public String getHardwaresecuritymodulegroupRef() {
        return hardwaresecuritymodulegroupRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type hardwaresecuritymodulegroup.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hardwaresecuritymodulegroupRef set the hardwaresecuritymodulegroupRef.
     */
    public void setHardwaresecuritymodulegroupRef(String  hardwaresecuritymodulegroupRef) {
        this.hardwaresecuritymodulegroupRef = hardwaresecuritymodulegroupRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum required heap memory to apply any configuration.
     * Allowed values are 0-100.
     * Field introduced in 18.1.2.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return heapMinimumConfigMemory
     */
    public Integer getHeapMinimumConfigMemory() {
        return heapMinimumConfigMemory;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum required heap memory to apply any configuration.
     * Allowed values are 0-100.
     * Field introduced in 18.1.2.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param heapMinimumConfigMemory set the heapMinimumConfigMemory.
     */
    public void setHeapMinimumConfigMemory(Integer  heapMinimumConfigMemory) {
        this.heapMinimumConfigMemory = heapMinimumConfigMemory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable active health monitoring from the standby se for all placed virtual services.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Special default for essentials edition is false, basic edition is false, enterprise is true.
     * @return hmOnStandby
     */
    public Boolean getHmOnStandby() {
        return hmOnStandby;
    }

    /**
     * This is the setter method to the attribute.
     * Enable active health monitoring from the standby se for all placed virtual services.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Special default for essentials edition is false, basic edition is false, enterprise is true.
     * @param hmOnStandby set the hmOnStandby.
     */
    public void setHmOnStandby(Boolean  hmOnStandby) {
        this.hmOnStandby = hmOnStandby;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Key of a (key, value) pair identifying a label for a set of nodes usually in container clouds.
     * Needs to be specified together with host_attribute_value.
     * Ses can be configured differently including ha modes across different se groups.
     * May also be used for isolation between different classes of virtualservices.
     * Virtualservices' se group may be specified via annotations/labels.
     * A openshift/kubernetes namespace maybe annotated with a matching se group label as openshift.io/node-selector  apptype=prod.
     * When multiple se groups are used in a cloud with host attributes specified,just a single se group can exist as a match-all se group without a
     * host_attribute_key.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostAttributeKey
     */
    public String getHostAttributeKey() {
        return hostAttributeKey;
    }

    /**
     * This is the setter method to the attribute.
     * Key of a (key, value) pair identifying a label for a set of nodes usually in container clouds.
     * Needs to be specified together with host_attribute_value.
     * Ses can be configured differently including ha modes across different se groups.
     * May also be used for isolation between different classes of virtualservices.
     * Virtualservices' se group may be specified via annotations/labels.
     * A openshift/kubernetes namespace maybe annotated with a matching se group label as openshift.io/node-selector  apptype=prod.
     * When multiple se groups are used in a cloud with host attributes specified,just a single se group can exist as a match-all se group without a
     * host_attribute_key.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostAttributeKey set the hostAttributeKey.
     */
    public void setHostAttributeKey(String  hostAttributeKey) {
        this.hostAttributeKey = hostAttributeKey;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Value of a (key, value) pair identifying a label for a set of nodes usually in container clouds.
     * Needs to be specified together with host_attribute_key.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostAttributeValue
     */
    public String getHostAttributeValue() {
        return hostAttributeValue;
    }

    /**
     * This is the setter method to the attribute.
     * Value of a (key, value) pair identifying a label for a set of nodes usually in container clouds.
     * Needs to be specified together with host_attribute_key.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostAttributeValue set the hostAttributeValue.
     */
    public void setHostAttributeValue(String  hostAttributeValue) {
        this.hostAttributeValue = hostAttributeValue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable the host gateway monitor when service engine is deployed as docker container.
     * Disabled by default.
     * Field introduced in 17.2.4.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return hostGatewayMonitor
     */
    public Boolean getHostGatewayMonitor() {
        return hostGatewayMonitor;
    }

    /**
     * This is the setter method to the attribute.
     * Enable the host gateway monitor when service engine is deployed as docker container.
     * Disabled by default.
     * Field introduced in 17.2.4.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param hostGatewayMonitor set the hostGatewayMonitor.
     */
    public void setHostGatewayMonitor(Boolean  hostGatewayMonitor) {
        this.hostGatewayMonitor = hostGatewayMonitor;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable javascript console logs on the client browser when collecting client insights.
     * Field introduced in 21.1.1.
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
     * Field introduced in 21.1.1.
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
     * Field introduced in 21.1.1.
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
     * Field introduced in 21.1.1.
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
     * Toggles se hybrid only mode of operation in dpdk mode with rss configured;where-in each se datapath instance operates as a standalone hybrid
     * instance performing both dispatcher and proxy function.
     * Requires reboot.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return hybridRssMode
     */
    public Boolean getHybridRssMode() {
        return hybridRssMode;
    }

    /**
     * This is the setter method to the attribute.
     * Toggles se hybrid only mode of operation in dpdk mode with rss configured;where-in each se datapath instance operates as a standalone hybrid
     * instance performing both dispatcher and proxy function.
     * Requires reboot.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param hybridRssMode set the hybridRssMode.
     */
    public void setHybridRssMode(Boolean  hybridRssMode) {
        this.hybridRssMode = hybridRssMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Override default hypervisor.
     * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hypervisor
     */
    public String getHypervisor() {
        return hypervisor;
    }

    /**
     * This is the setter method to the attribute.
     * Override default hypervisor.
     * Enum options - DEFAULT, VMWARE_ESX, KVM, VMWARE_VSAN, XEN.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hypervisor set the hypervisor.
     */
    public void setHypervisor(String  hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ignore docker mac change.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return ignoreDockerMacChange
     */
    public Boolean getIgnoreDockerMacChange() {
        return ignoreDockerMacChange;
    }

    /**
     * This is the setter method to the attribute.
     * Ignore docker mac change.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param ignoreDockerMacChange set the ignoreDockerMacChange.
     */
    public void setIgnoreDockerMacChange(Boolean  ignoreDockerMacChange) {
        this.ignoreDockerMacChange = ignoreDockerMacChange;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ignore rtt samples if it is above threshold.
     * Field introduced in 17.1.6,17.2.2.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5000.
     * @return ignoreRttThreshold
     */
    public Integer getIgnoreRttThreshold() {
        return ignoreRttThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Ignore rtt samples if it is above threshold.
     * Field introduced in 17.1.6,17.2.2.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5000.
     * @param ignoreRttThreshold set the ignoreRttThreshold.
     */
    public void setIgnoreRttThreshold(Integer  ignoreRttThreshold) {
        this.ignoreRttThreshold = ignoreRttThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Program se security group ingress rules to allow vip data access from remote cidr type.
     * Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC.
     * Field introduced in 17.1.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SG_INGRESS_ACCESS_ALL".
     * @return ingressAccessData
     */
    public String getIngressAccessData() {
        return ingressAccessData;
    }

    /**
     * This is the setter method to the attribute.
     * Program se security group ingress rules to allow vip data access from remote cidr type.
     * Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC.
     * Field introduced in 17.1.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SG_INGRESS_ACCESS_ALL".
     * @param ingressAccessData set the ingressAccessData.
     */
    public void setIngressAccessData(String  ingressAccessData) {
        this.ingressAccessData = ingressAccessData;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Program se security group ingress rules to allow ssh/icmp management access from remote cidr type.
     * Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC.
     * Field introduced in 17.1.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SG_INGRESS_ACCESS_ALL".
     * @return ingressAccessMgmt
     */
    public String getIngressAccessMgmt() {
        return ingressAccessMgmt;
    }

    /**
     * This is the setter method to the attribute.
     * Program se security group ingress rules to allow ssh/icmp management access from remote cidr type.
     * Enum options - SG_INGRESS_ACCESS_NONE, SG_INGRESS_ACCESS_ALL, SG_INGRESS_ACCESS_VPC.
     * Field introduced in 17.1.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SG_INGRESS_ACCESS_ALL".
     * @param ingressAccessMgmt set the ingressAccessMgmt.
     */
    public void setIngressAccessMgmt(String  ingressAccessMgmt) {
        this.ingressAccessMgmt = ingressAccessMgmt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Instance/flavor name for se instance.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return instanceFlavor
     */
    public String getInstanceFlavor() {
        return instanceFlavor;
    }

    /**
     * This is the setter method to the attribute.
     * Instance/flavor name for se instance.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param instanceFlavor set the instanceFlavor.
     */
    public void setInstanceFlavor(String  instanceFlavor) {
        this.instanceFlavor = instanceFlavor;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Iptable rules.
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return iptables
     */
    public List<IptableRuleSet> getIptables() {
        return iptables;
    }

    /**
     * This is the setter method. this will set the iptables
     * Iptable rules.
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return iptables
     */
    public void setIptables(List<IptableRuleSet>  iptables) {
        this.iptables = iptables;
    }

    /**
     * This is the setter method this will set the iptables
     * Iptable rules.
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return iptables
     */
    public ServiceEngineGroup addIptablesItem(IptableRuleSet iptablesItem) {
      if (this.iptables == null) {
        this.iptables = new ArrayList<IptableRuleSet>();
      }
      this.iptables.add(iptablesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Port ranges for any servers running in inband linuxserver clouds.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return kniAllowedServerPorts
     */
    public List<KniPortRange> getKniAllowedServerPorts() {
        return kniAllowedServerPorts;
    }

    /**
     * This is the setter method. this will set the kniAllowedServerPorts
     * Port ranges for any servers running in inband linuxserver clouds.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return kniAllowedServerPorts
     */
    public void setKniAllowedServerPorts(List<KniPortRange>  kniAllowedServerPorts) {
        this.kniAllowedServerPorts = kniAllowedServerPorts;
    }

    /**
     * This is the setter method this will set the kniAllowedServerPorts
     * Port ranges for any servers running in inband linuxserver clouds.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return kniAllowedServerPorts
     */
    public ServiceEngineGroup addKniAllowedServerPortsItem(KniPortRange kniAllowedServerPortsItem) {
      if (this.kniAllowedServerPorts == null) {
        this.kniAllowedServerPorts = new ArrayList<KniPortRange>();
      }
      this.kniAllowedServerPorts.add(kniAllowedServerPortsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of l7 connections that can be cached per core.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 16384.
     * @return l7ConnsPerCore
     */
    public Integer getL7ConnsPerCore() {
        return l7ConnsPerCore;
    }

    /**
     * This is the setter method to the attribute.
     * Number of l7 connections that can be cached per core.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 16384.
     * @param l7ConnsPerCore set the l7ConnsPerCore.
     */
    public void setL7ConnsPerCore(Integer  l7ConnsPerCore) {
        this.l7ConnsPerCore = l7ConnsPerCore;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of reserved l7 listener connections per core.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 256.
     * @return l7ResvdListenConnsPerCore
     */
    public Integer getL7ResvdListenConnsPerCore() {
        return l7ResvdListenConnsPerCore;
    }

    /**
     * This is the setter method to the attribute.
     * Number of reserved l7 listener connections per core.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 256.
     * @param l7ResvdListenConnsPerCore set the l7ResvdListenConnsPerCore.
     */
    public void setL7ResvdListenConnsPerCore(Integer  l7ResvdListenConnsPerCore) {
        this.l7ResvdListenConnsPerCore = l7ResvdListenConnsPerCore;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Labels associated with this se group.
     * Field introduced in 20.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labels
     */
    public List<KeyValue> getLabels() {
        return labels;
    }

    /**
     * This is the setter method. this will set the labels
     * Labels associated with this se group.
     * Field introduced in 20.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labels
     */
    public void setLabels(List<KeyValue>  labels) {
        this.labels = labels;
    }

    /**
     * This is the setter method this will set the labels
     * Labels associated with this se group.
     * Field introduced in 20.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labels
     */
    public ServiceEngineGroup addLabelsItem(KeyValue labelsItem) {
      if (this.labels == null) {
        this.labels = new ArrayList<KeyValue>();
      }
      this.labels.add(labelsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of requests to dispatch from the request.
     * Queue at a regular interval.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return lbactionNumRequestsToDispatch
     */
    public Integer getLbactionNumRequestsToDispatch() {
        return lbactionNumRequestsToDispatch;
    }

    /**
     * This is the setter method to the attribute.
     * Number of requests to dispatch from the request.
     * Queue at a regular interval.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param lbactionNumRequestsToDispatch set the lbactionNumRequestsToDispatch.
     */
    public void setLbactionNumRequestsToDispatch(Integer  lbactionNumRequestsToDispatch) {
        this.lbactionNumRequestsToDispatch = lbactionNumRequestsToDispatch;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum retries per request in the request queue.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 22.
     * @return lbactionRqPerRequestMaxRetries
     */
    public Integer getLbactionRqPerRequestMaxRetries() {
        return lbactionRqPerRequestMaxRetries;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum retries per request in the request queue.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 22.
     * @param lbactionRqPerRequestMaxRetries set the lbactionRqPerRequestMaxRetries.
     */
    public void setLbactionRqPerRequestMaxRetries(Integer  lbactionRqPerRequestMaxRetries) {
        this.lbactionRqPerRequestMaxRetries = lbactionRqPerRequestMaxRetries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Select core with least load for new flow.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return leastLoadCoreSelection
     */
    public Boolean getLeastLoadCoreSelection() {
        return leastLoadCoreSelection;
    }

    /**
     * This is the setter method to the attribute.
     * Select core with least load for new flow.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param leastLoadCoreSelection set the leastLoadCoreSelection.
     */
    public void setLeastLoadCoreSelection(Boolean  leastLoadCoreSelection) {
        this.leastLoadCoreSelection = leastLoadCoreSelection;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies the license tier which would be used.
     * This field by default inherits the value from cloud.
     * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseTier
     */
    public String getLicenseTier() {
        return licenseTier;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies the license tier which would be used.
     * This field by default inherits the value from cloud.
     * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseTier set the licenseTier.
     */
    public void setLicenseTier(String  licenseTier) {
        this.licenseTier = licenseTier;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If no license type is specified then default license enforcement for the cloud type is chosen.
     * Enum options - LIC_BACKEND_SERVERS, LIC_SOCKETS, LIC_CORES, LIC_HOSTS, LIC_SE_BANDWIDTH, LIC_METERED_SE_BANDWIDTH.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseType
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * This is the setter method to the attribute.
     * If no license type is specified then default license enforcement for the cloud type is chosen.
     * Enum options - LIC_BACKEND_SERVERS, LIC_SOCKETS, LIC_CORES, LIC_HOSTS, LIC_SE_BANDWIDTH, LIC_METERED_SE_BANDWIDTH.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseType set the licenseType.
     */
    public void setLicenseType(String  licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flag to indicate if log files are compressed upon full on the service engine.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return logAgentCompressLogs
     */
    public Boolean getLogAgentCompressLogs() {
        return logAgentCompressLogs;
    }

    /**
     * This is the setter method to the attribute.
     * Flag to indicate if log files are compressed upon full on the service engine.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param logAgentCompressLogs set the logAgentCompressLogs.
     */
    public void setLogAgentCompressLogs(Boolean  logAgentCompressLogs) {
        this.logAgentCompressLogs = logAgentCompressLogs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable debug logs by default on service engine.
     * This includes all other debugging logs.
     * Debug logs can also be explcitly enabled from the cli shell.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return logAgentDebugEnabled
     */
    public Boolean getLogAgentDebugEnabled() {
        return logAgentDebugEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable debug logs by default on service engine.
     * This includes all other debugging logs.
     * Debug logs can also be explcitly enabled from the cli shell.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param logAgentDebugEnabled set the logAgentDebugEnabled.
     */
    public void setLogAgentDebugEnabled(Boolean  logAgentDebugEnabled) {
        this.logAgentDebugEnabled = logAgentDebugEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum application log file size before rollover.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return logAgentFileSzAppl
     */
    public Integer getLogAgentFileSzAppl() {
        return logAgentFileSzAppl;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum application log file size before rollover.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param logAgentFileSzAppl set the logAgentFileSzAppl.
     */
    public void setLogAgentFileSzAppl(Integer  logAgentFileSzAppl) {
        this.logAgentFileSzAppl = logAgentFileSzAppl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum connection log file size before rollover.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return logAgentFileSzConn
     */
    public Integer getLogAgentFileSzConn() {
        return logAgentFileSzConn;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum connection log file size before rollover.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param logAgentFileSzConn set the logAgentFileSzConn.
     */
    public void setLogAgentFileSzConn(Integer  logAgentFileSzConn) {
        this.logAgentFileSzConn = logAgentFileSzConn;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum debug log file size before rollover.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return logAgentFileSzDebug
     */
    public Integer getLogAgentFileSzDebug() {
        return logAgentFileSzDebug;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum debug log file size before rollover.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param logAgentFileSzDebug set the logAgentFileSzDebug.
     */
    public void setLogAgentFileSzDebug(Integer  logAgentFileSzDebug) {
        this.logAgentFileSzDebug = logAgentFileSzDebug;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum event log file size before rollover.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return logAgentFileSzEvent
     */
    public Integer getLogAgentFileSzEvent() {
        return logAgentFileSzEvent;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum event log file size before rollover.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param logAgentFileSzEvent set the logAgentFileSzEvent.
     */
    public void setLogAgentFileSzEvent(Integer  logAgentFileSzEvent) {
        this.logAgentFileSzEvent = logAgentFileSzEvent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum storage allocated for logs irrespective of memory and cores.
     * Field introduced in 21.1.1.
     * Unit is mb.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @return logAgentLogStorageMinSz
     */
    public Integer getLogAgentLogStorageMinSz() {
        return logAgentLogStorageMinSz;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum storage allocated for logs irrespective of memory and cores.
     * Field introduced in 21.1.1.
     * Unit is mb.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @param logAgentLogStorageMinSz set the logAgentLogStorageMinSz.
     */
    public void setLogAgentLogStorageMinSz(Integer  logAgentLogStorageMinSz) {
        this.logAgentLogStorageMinSz = logAgentLogStorageMinSz;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum concurrent rsync requests initiated from log-agent to the controller.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @return logAgentMaxConcurrentRsync
     */
    public Integer getLogAgentMaxConcurrentRsync() {
        return logAgentMaxConcurrentRsync;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum concurrent rsync requests initiated from log-agent to the controller.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @param logAgentMaxConcurrentRsync set the logAgentMaxConcurrentRsync.
     */
    public void setLogAgentMaxConcurrentRsync(Integer  logAgentMaxConcurrentRsync) {
        this.logAgentMaxConcurrentRsync = logAgentMaxConcurrentRsync;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Excess percentage threshold of disk size to trigger cleanup of logs on the service engine.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 110.
     * @return logAgentMaxStorageExcessPercent
     */
    public Integer getLogAgentMaxStorageExcessPercent() {
        return logAgentMaxStorageExcessPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Excess percentage threshold of disk size to trigger cleanup of logs on the service engine.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 110.
     * @param logAgentMaxStorageExcessPercent set the logAgentMaxStorageExcessPercent.
     */
    public void setLogAgentMaxStorageExcessPercent(Integer  logAgentMaxStorageExcessPercent) {
        this.logAgentMaxStorageExcessPercent = logAgentMaxStorageExcessPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum storage on the disk not allocated for logs on the service engine.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.0f.
     * @return logAgentMaxStorageIgnorePercent
     */
    public Float getLogAgentMaxStorageIgnorePercent() {
        return logAgentMaxStorageIgnorePercent;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum storage on the disk not allocated for logs on the service engine.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.0f.
     * @param logAgentMaxStorageIgnorePercent set the logAgentMaxStorageIgnorePercent.
     */
    public void setLogAgentMaxStorageIgnorePercent(Float  logAgentMaxStorageIgnorePercent) {
        this.logAgentMaxStorageIgnorePercent = logAgentMaxStorageIgnorePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum storage allocated to any given virtualservice on the service engine.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return logAgentMinStoragePerVs
     */
    public Integer getLogAgentMinStoragePerVs() {
        return logAgentMinStoragePerVs;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum storage allocated to any given virtualservice on the service engine.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param logAgentMinStoragePerVs set the logAgentMinStoragePerVs.
     */
    public void setLogAgentMinStoragePerVs(Integer  logAgentMinStoragePerVs) {
        this.logAgentMinStoragePerVs = logAgentMinStoragePerVs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal timer to stall log-agent and prevent it from hogging cpu cycles on the service engine.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return logAgentSleepInterval
     */
    public Integer getLogAgentSleepInterval() {
        return logAgentSleepInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Internal timer to stall log-agent and prevent it from hogging cpu cycles on the service engine.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param logAgentSleepInterval set the logAgentSleepInterval.
     */
    public void setLogAgentSleepInterval(Integer  logAgentSleepInterval) {
        this.logAgentSleepInterval = logAgentSleepInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable trace logs by default on service engine.
     * Configuration operations are logged along with other important logs by service engine.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return logAgentTraceEnabled
     */
    public Boolean getLogAgentTraceEnabled() {
        return logAgentTraceEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable trace logs by default on service engine.
     * Configuration operations are logged along with other important logs by service engine.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param logAgentTraceEnabled set the logAgentTraceEnabled.
     */
    public void setLogAgentTraceEnabled(Boolean  logAgentTraceEnabled) {
        this.logAgentTraceEnabled = logAgentTraceEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout to purge unknown virtual service logs from the service engine.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1800.
     * @return logAgentUnknownVsTimer
     */
    public Integer getLogAgentUnknownVsTimer() {
        return logAgentUnknownVsTimer;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout to purge unknown virtual service logs from the service engine.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1800.
     * @param logAgentUnknownVsTimer set the logAgentUnknownVsTimer.
     */
    public void setLogAgentUnknownVsTimer(Integer  logAgentUnknownVsTimer) {
        this.logAgentUnknownVsTimer = logAgentUnknownVsTimer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum disk capacity (in mb) to be allocated to an se.
     * This is exclusively used for debug and log data.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @return logDisksz
     */
    public Integer getLogDisksz() {
        return logDisksz;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum disk capacity (in mb) to be allocated to an se.
     * This is exclusively used for debug and log data.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @param logDisksz set the logDisksz.
     */
    public void setLogDisksz(Integer  logDisksz) {
        this.logDisksz = logDisksz;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se will log memory allocation related failure to the se_trace file, wherever available.
     * Field introduced in 20.1.2.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return logMallocFailure
     */
    public Boolean getLogMallocFailure() {
        return logMallocFailure;
    }

    /**
     * This is the setter method to the attribute.
     * Se will log memory allocation related failure to the se_trace file, wherever available.
     * Field introduced in 20.1.2.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param logMallocFailure set the logMallocFailure.
     */
    public void setLogMallocFailure(Boolean  logMallocFailure) {
        this.logMallocFailure = logMallocFailure;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of file names in a log message.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @return logMessageMaxFileListSize
     */
    public Integer getLogMessageMaxFileListSize() {
        return logMessageMaxFileListSize;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of file names in a log message.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @param logMessageMaxFileListSize set the logMessageMaxFileListSize.
     */
    public void setLogMessageMaxFileListSize(Integer  logMessageMaxFileListSize) {
        this.logMessageMaxFileListSize = logMessageMaxFileListSize;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.7.
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
     * Field introduced in 20.1.7.
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
     * Field introduced in 20.1.7.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public ServiceEngineGroup addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of external health monitors that can run concurrently in a service engine.
     * This helps control the cpu and memory use by external health monitors.
     * Special values are 0- value will be internally calculated based on cpu and memory.
     * Field introduced in 18.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxConcurrentExternalHm
     */
    public Integer getMaxConcurrentExternalHm() {
        return maxConcurrentExternalHm;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of external health monitors that can run concurrently in a service engine.
     * This helps control the cpu and memory use by external health monitors.
     * Special values are 0- value will be internally calculated based on cpu and memory.
     * Field introduced in 18.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxConcurrentExternalHm set the maxConcurrentExternalHm.
     */
    public void setMaxConcurrentExternalHm(Integer  maxConcurrentExternalHm) {
        this.maxConcurrentExternalHm = maxConcurrentExternalHm;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When cpu usage on an se exceeds this threshold, virtual services hosted on this se may be rebalanced to other ses to reduce load.
     * A new se may be created as part of this process.
     * Allowed values are 40-90.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 80.
     * @return maxCpuUsage
     */
    public Integer getMaxCpuUsage() {
        return maxCpuUsage;
    }

    /**
     * This is the setter method to the attribute.
     * When cpu usage on an se exceeds this threshold, virtual services hosted on this se may be rebalanced to other ses to reduce load.
     * A new se may be created as part of this process.
     * Allowed values are 40-90.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 80.
     * @param maxCpuUsage set the maxCpuUsage.
     */
    public void setMaxCpuUsage(Integer  maxCpuUsage) {
        this.maxCpuUsage = maxCpuUsage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Max bytes that can be allocated in a single mempool.
     * Field introduced in 18.1.5.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @return maxMemoryPerMempool
     */
    public Integer getMaxMemoryPerMempool() {
        return maxMemoryPerMempool;
    }

    /**
     * This is the setter method to the attribute.
     * Max bytes that can be allocated in a single mempool.
     * Field introduced in 18.1.5.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @param maxMemoryPerMempool set the maxMemoryPerMempool.
     */
    public void setMaxMemoryPerMempool(Integer  maxMemoryPerMempool) {
        this.maxMemoryPerMempool = maxMemoryPerMempool;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configures the maximum number of se_dp processes that handles traffic.
     * If not configured, defaults to the number of cpus on the se.
     * If decreased, it will only take effect after se reboot.
     * Allowed values are 1-128.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxNumSeDps
     */
    public Integer getMaxNumSeDps() {
        return maxNumSeDps;
    }

    /**
     * This is the setter method to the attribute.
     * Configures the maximum number of se_dp processes that handles traffic.
     * If not configured, defaults to the number of cpus on the se.
     * If decreased, it will only take effect after se reboot.
     * Allowed values are 1-128.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxNumSeDps set the maxNumSeDps.
     */
    public void setMaxNumSeDps(Integer  maxNumSeDps) {
        this.maxNumSeDps = maxNumSeDps;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Applicable to azure platform only.
     * Maximum number of public ips per azure lb.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return maxPublicIpsPerLb
     */
    public Integer getMaxPublicIpsPerLb() {
        return maxPublicIpsPerLb;
    }

    /**
     * This is the setter method to the attribute.
     * Applicable to azure platform only.
     * Maximum number of public ips per azure lb.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param maxPublicIpsPerLb set the maxPublicIpsPerLb.
     */
    public void setMaxPublicIpsPerLb(Integer  maxPublicIpsPerLb) {
        this.maxPublicIpsPerLb = maxPublicIpsPerLb;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of queues per vnic setting to '0' utilises all queues that are distributed across dispatcher cores.
     * Allowed values are 0,1,2,4,8,16.
     * Field introduced in 18.2.7, 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1), basic edition(allowed values- 1), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return maxQueuesPerVnic
     */
    public Integer getMaxQueuesPerVnic() {
        return maxQueuesPerVnic;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of queues per vnic setting to '0' utilises all queues that are distributed across dispatcher cores.
     * Allowed values are 0,1,2,4,8,16.
     * Field introduced in 18.2.7, 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1), basic edition(allowed values- 1), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param maxQueuesPerVnic set the maxQueuesPerVnic.
     */
    public void setMaxQueuesPerVnic(Integer  maxQueuesPerVnic) {
        this.maxQueuesPerVnic = maxQueuesPerVnic;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Applicable to azure platform only.
     * Maximum number of rules per azure lb.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 150.
     * @return maxRulesPerLb
     */
    public Integer getMaxRulesPerLb() {
        return maxRulesPerLb;
    }

    /**
     * This is the setter method to the attribute.
     * Applicable to azure platform only.
     * Maximum number of rules per azure lb.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 150.
     * @param maxRulesPerLb set the maxRulesPerLb.
     */
    public void setMaxRulesPerLb(Integer  maxRulesPerLb) {
        this.maxRulesPerLb = maxRulesPerLb;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of active service engines for the virtual service.
     * Allowed values are 1-64.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return maxScaleoutPerVs
     */
    public Integer getMaxScaleoutPerVs() {
        return maxScaleoutPerVs;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of active service engines for the virtual service.
     * Allowed values are 1-64.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param maxScaleoutPerVs set the maxScaleoutPerVs.
     */
    public void setMaxScaleoutPerVs(Integer  maxScaleoutPerVs) {
        this.maxScaleoutPerVs = maxScaleoutPerVs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of services engines in this group.
     * Allowed values are 0-1000.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return maxSe
     */
    public Integer getMaxSe() {
        return maxSe;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of services engines in this group.
     * Allowed values are 0-1000.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param maxSe set the maxSe.
     */
    public void setMaxSe(Integer  maxSe) {
        this.maxSe = maxSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum of number of 4 kb pages allocated to the linux kernel gro subsystem for packet coalescing.
     * This parameter is limited to supported kernels only.
     * Requires se reboot.
     * Allowed values are 1-17.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 17.
     * @return maxSkbFrags
     */
    public Integer getMaxSkbFrags() {
        return maxSkbFrags;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum of number of 4 kb pages allocated to the linux kernel gro subsystem for packet coalescing.
     * This parameter is limited to supported kernels only.
     * Requires se reboot.
     * Allowed values are 1-17.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 17.
     * @param maxSkbFrags set the maxSkbFrags.
     */
    public void setMaxSkbFrags(Integer  maxSkbFrags) {
        this.maxSkbFrags = maxSkbFrags;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of virtual services that can be placed on a single service engine.
     * Allowed values are 1-1000.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return maxVsPerSe
     */
    public Integer getMaxVsPerSe() {
        return maxVsPerSe;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of virtual services that can be placed on a single service engine.
     * Allowed values are 1-1000.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param maxVsPerSe set the maxVsPerSe.
     */
    public void setMaxVsPerSe(Integer  maxVsPerSe) {
        this.maxVsPerSe = maxVsPerSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return memReserve
     */
    public Boolean getMemReserve() {
        return memReserve;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param memReserve set the memReserve.
     */
    public void setMemReserve(Boolean  memReserve) {
        this.memReserve = memReserve;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates the percent of memory reserved for config updates.
     * Allowed values are 0-100.
     * Field introduced in 18.1.2.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @return memoryForConfigUpdate
     */
    public Integer getMemoryForConfigUpdate() {
        return memoryForConfigUpdate;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates the percent of memory reserved for config updates.
     * Allowed values are 0-100.
     * Field introduced in 18.1.2.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @param memoryForConfigUpdate set the memoryForConfigUpdate.
     */
    public void setMemoryForConfigUpdate(Integer  memoryForConfigUpdate) {
        this.memoryForConfigUpdate = memoryForConfigUpdate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Amount of memory for each of the service engine virtual machines.
     * Changes to this setting do not affect existing ses.
     * Allowed values are 2048-262144.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
     * @return memoryPerSe
     */
    public Integer getMemoryPerSe() {
        return memoryPerSe;
    }

    /**
     * This is the setter method to the attribute.
     * Amount of memory for each of the service engine virtual machines.
     * Changes to this setting do not affect existing ses.
     * Allowed values are 2048-262144.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
     * @param memoryPerSe set the memoryPerSe.
     */
    public void setMemoryPerSe(Integer  memoryPerSe) {
        this.memoryPerSe = memoryPerSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Metrics collection mode, 0 = pull mode.
     * Se_agent pulls metrics from se_dp,  1 = push mode.
     * Se_dp pushes metrics to se_agent.
     * 9 = special value to reset collection state in push mode.
     * Allowed values are 0-1.
     * Special values are 9- reset metrics collection state.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return metricsCollectionMode
     */
    public Integer getMetricsCollectionMode() {
        return metricsCollectionMode;
    }

    /**
     * This is the setter method to the attribute.
     * Metrics collection mode, 0 = pull mode.
     * Se_agent pulls metrics from se_dp,  1 = push mode.
     * Se_dp pushes metrics to se_agent.
     * 9 = special value to reset collection state in push mode.
     * Allowed values are 0-1.
     * Special values are 9- reset metrics collection state.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param metricsCollectionMode set the metricsCollectionMode.
     */
    public void setMetricsCollectionMode(Integer  metricsCollectionMode) {
        this.metricsCollectionMode = metricsCollectionMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Management network to use for avi service engines.
     * It is a reference to an object of type network.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtNetworkRef
     */
    public String getMgmtNetworkRef() {
        return mgmtNetworkRef;
    }

    /**
     * This is the setter method to the attribute.
     * Management network to use for avi service engines.
     * It is a reference to an object of type network.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtNetworkRef set the mgmtNetworkRef.
     */
    public void setMgmtNetworkRef(String  mgmtNetworkRef) {
        this.mgmtNetworkRef = mgmtNetworkRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Management subnet to use for avi service engines.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtSubnet
     */
    public IpAddrPrefix getMgmtSubnet() {
        return mgmtSubnet;
    }

    /**
     * This is the setter method to the attribute.
     * Management subnet to use for avi service engines.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtSubnet set the mgmtSubnet.
     */
    public void setMgmtSubnet(IpAddrPrefix mgmtSubnet) {
        this.mgmtSubnet = mgmtSubnet;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When cpu usage on an se falls below the minimum threshold, virtual services hosted on the se may be consolidated onto other underutilized ses.
     * After consolidation, unused service engines may then be eligible for deletion.
     * Allowed values are 20-60.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return minCpuUsage
     */
    public Integer getMinCpuUsage() {
        return minCpuUsage;
    }

    /**
     * This is the setter method to the attribute.
     * When cpu usage on an se falls below the minimum threshold, virtual services hosted on the se may be consolidated onto other underutilized ses.
     * After consolidation, unused service engines may then be eligible for deletion.
     * Allowed values are 20-60.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param minCpuUsage set the minCpuUsage.
     */
    public void setMinCpuUsage(Integer  minCpuUsage) {
        this.minCpuUsage = minCpuUsage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum number of active service engines for the virtual service.
     * Allowed values are 1-64.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return minScaleoutPerVs
     */
    public Integer getMinScaleoutPerVs() {
        return minScaleoutPerVs;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum number of active service engines for the virtual service.
     * Allowed values are 1-64.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param minScaleoutPerVs set the minScaleoutPerVs.
     */
    public void setMinScaleoutPerVs(Integer  minScaleoutPerVs) {
        this.minScaleoutPerVs = minScaleoutPerVs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum number of services engines in this group (relevant for se autorebalance only).
     * Allowed values are 0-1000.
     * Field introduced in 17.2.13,18.1.3,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return minSe
     */
    public Integer getMinSe() {
        return minSe;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum number of services engines in this group (relevant for se autorebalance only).
     * Allowed values are 0-1000.
     * Field introduced in 17.2.13,18.1.3,18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param minSe set the minSe.
     */
    public void setMinSe(Integer  minSe) {
        this.minSe = minSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates the percent of memory reserved for connections.
     * Allowed values are 0-100.
     * Field introduced in 18.1.2.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @return minimumConnectionMemory
     */
    public Integer getMinimumConnectionMemory() {
        return minimumConnectionMemory;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates the percent of memory reserved for connections.
     * Allowed values are 0-100.
     * Field introduced in 18.1.2.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @param minimumConnectionMemory set the minimumConnectionMemory.
     */
    public void setMinimumConnectionMemory(Integer  minimumConnectionMemory) {
        this.minimumConnectionMemory = minimumConnectionMemory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This knob enables the service engine to process multicast traffic(for vmware hypervisor).
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return multicastEnable
     */
    public Boolean getMulticastEnable() {
        return multicastEnable;
    }

    /**
     * This is the setter method to the attribute.
     * This knob enables the service engine to process multicast traffic(for vmware hypervisor).
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param multicastEnable set the multicastEnable.
     */
    public void setMulticastEnable(Boolean  multicastEnable) {
        this.multicastEnable = multicastEnable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of threads to use for log streaming.
     * Allowed values are 1-100.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return nLogStreamingThreads
     */
    public Integer getNLogStreamingThreads() {
        return nLogStreamingThreads;
    }

    /**
     * This is the setter method to the attribute.
     * Number of threads to use for log streaming.
     * Allowed values are 1-100.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param nLogStreamingThreads set the nLogStreamingThreads.
     */
    public void setNLogStreamingThreads(Integer  nLogStreamingThreads) {
        this.nLogStreamingThreads = nLogStreamingThreads;
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
     * Number of threads to poll for netlink messages excluding the thread for default namespace.
     * Requires se reboot.
     * Allowed values are 1-32.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @return netlinkPollerThreads
     */
    public Integer getNetlinkPollerThreads() {
        return netlinkPollerThreads;
    }

    /**
     * This is the setter method to the attribute.
     * Number of threads to poll for netlink messages excluding the thread for default namespace.
     * Requires se reboot.
     * Allowed values are 1-32.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @param netlinkPollerThreads set the netlinkPollerThreads.
     */
    public void setNetlinkPollerThreads(Integer  netlinkPollerThreads) {
        this.netlinkPollerThreads = netlinkPollerThreads;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Socket buffer size for the netlink sockets.
     * Requires se reboot.
     * Allowed values are 1-128.
     * Field introduced in 21.1.1.
     * Unit is mega_bytes.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return netlinkSockBufSize
     */
    public Integer getNetlinkSockBufSize() {
        return netlinkSockBufSize;
    }

    /**
     * This is the setter method to the attribute.
     * Socket buffer size for the netlink sockets.
     * Requires se reboot.
     * Allowed values are 1-128.
     * Field introduced in 21.1.1.
     * Unit is mega_bytes.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param netlinkSockBufSize set the netlinkSockBufSize.
     */
    public void setNetlinkSockBufSize(Integer  netlinkSockBufSize) {
        this.netlinkSockBufSize = netlinkSockBufSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Free the connection stack.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return ngxFreeConnectionStack
     */
    public Boolean getNgxFreeConnectionStack() {
        return ngxFreeConnectionStack;
    }

    /**
     * This is the setter method to the attribute.
     * Free the connection stack.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param ngxFreeConnectionStack set the ngxFreeConnectionStack.
     */
    public void setNgxFreeConnectionStack(Boolean  ngxFreeConnectionStack) {
        this.ngxFreeConnectionStack = ngxFreeConnectionStack;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This setting limits the number of non-significant logs generated per second per core on this se.
     * Default is 100 logs per second.
     * Set it to zero (0) to deactivate throttling.
     * Field introduced in 17.1.3.
     * Unit is per_second.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return nonSignificantLogThrottle
     */
    public Integer getNonSignificantLogThrottle() {
        return nonSignificantLogThrottle;
    }

    /**
     * This is the setter method to the attribute.
     * This setting limits the number of non-significant logs generated per second per core on this se.
     * Default is 100 logs per second.
     * Set it to zero (0) to deactivate throttling.
     * Field introduced in 17.1.3.
     * Unit is per_second.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param nonSignificantLogThrottle set the nonSignificantLogThrottle.
     */
    public void setNonSignificantLogThrottle(Integer  nonSignificantLogThrottle) {
        this.nonSignificantLogThrottle = nonSignificantLogThrottle;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dequeue interval for receive queue from ns helper.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @return nsHelperDeqIntervalMsec
     */
    public Integer getNsHelperDeqIntervalMsec() {
        return nsHelperDeqIntervalMsec;
    }

    /**
     * This is the setter method to the attribute.
     * Dequeue interval for receive queue from ns helper.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20.
     * @param nsHelperDeqIntervalMsec set the nsHelperDeqIntervalMsec.
     */
    public void setNsHelperDeqIntervalMsec(Integer  nsHelperDeqIntervalMsec) {
        this.nsHelperDeqIntervalMsec = nsHelperDeqIntervalMsec;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Toggle se ntp synchronization failure events generation.
     * Disabled by default.
     * Field introduced in 22.1.2.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return ntpSyncFailEvent
     */
    public Boolean getNtpSyncFailEvent() {
        return ntpSyncFailEvent;
    }

    /**
     * This is the setter method to the attribute.
     * Toggle se ntp synchronization failure events generation.
     * Disabled by default.
     * Field introduced in 22.1.2.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param ntpSyncFailEvent set the ntpSyncFailEvent.
     */
    public void setNtpSyncFailEvent(Boolean  ntpSyncFailEvent) {
        this.ntpSyncFailEvent = ntpSyncFailEvent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configures the interval at which se synchronization status with ntp server(s) is verified.
     * A value of zero disables se ntp synchronization status validation.
     * Allowed values are 120-900.
     * Special values are 0- disable.
     * Field introduced in 22.1.2.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return ntpSyncStatusInterval
     */
    public Integer getNtpSyncStatusInterval() {
        return ntpSyncStatusInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Configures the interval at which se synchronization status with ntp server(s) is verified.
     * A value of zero disables se ntp synchronization status validation.
     * Allowed values are 120-900.
     * Special values are 0- disable.
     * Field introduced in 22.1.2.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param ntpSyncStatusInterval set the ntpSyncStatusInterval.
     */
    public void setNtpSyncStatusInterval(Integer  ntpSyncStatusInterval) {
        this.ntpSyncStatusInterval = ntpSyncStatusInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of dispatcher cores (0,1,2,4,8 or 16).
     * If set to 0, then number of dispatcher cores is deduced automatically.requires se reboot.
     * Allowed values are 0,1,2,4,8,16.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return numDispatcherCores
     */
    public Integer getNumDispatcherCores() {
        return numDispatcherCores;
    }

    /**
     * This is the setter method to the attribute.
     * Number of dispatcher cores (0,1,2,4,8 or 16).
     * If set to 0, then number of dispatcher cores is deduced automatically.requires se reboot.
     * Allowed values are 0,1,2,4,8,16.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param numDispatcherCores set the numDispatcherCores.
     */
    public void setNumDispatcherCores(Integer  numDispatcherCores) {
        this.numDispatcherCores = numDispatcherCores;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of queues to each dispatcher.
     * Allowed values are 1-2.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return numDispatcherQueues
     */
    public Integer getNumDispatcherQueues() {
        return numDispatcherQueues;
    }

    /**
     * This is the setter method to the attribute.
     * Number of queues to each dispatcher.
     * Allowed values are 1-2.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param numDispatcherQueues set the numDispatcherQueues.
     */
    public void setNumDispatcherQueues(Integer  numDispatcherQueues) {
        this.numDispatcherQueues = numDispatcherQueues;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of changes in num flow cores sum to ignore.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return numFlowCoresSumChangesToIgnore
     */
    public Integer getNumFlowCoresSumChangesToIgnore() {
        return numFlowCoresSumChangesToIgnore;
    }

    /**
     * This is the setter method to the attribute.
     * Number of changes in num flow cores sum to ignore.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param numFlowCoresSumChangesToIgnore set the numFlowCoresSumChangesToIgnore.
     */
    public void setNumFlowCoresSumChangesToIgnore(Integer  numFlowCoresSumChangesToIgnore) {
        this.numFlowCoresSumChangesToIgnore = numFlowCoresSumChangesToIgnore;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configuration knobs for interse object distribution.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objsyncConfig
     */
    public ObjSyncConfig getObjsyncConfig() {
        return objsyncConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Configuration knobs for interse object distribution.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objsyncConfig set the objsyncConfig.
     */
    public void setObjsyncConfig(ObjSyncConfig objsyncConfig) {
        this.objsyncConfig = objsyncConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tcp port on se management interface for interse object distribution.
     * Supported only for externally managed security groups.
     * Not supported on full access deployments.
     * Requires se reboot.
     * Allowed values are 1024-65535.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4001.
     * @return objsyncPort
     */
    public Integer getObjsyncPort() {
        return objsyncPort;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp port on se management interface for interse object distribution.
     * Supported only for externally managed security groups.
     * Not supported on full access deployments.
     * Requires se reboot.
     * Allowed values are 1024-65535.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4001.
     * @param objsyncPort set the objsyncPort.
     */
    public void setObjsyncPort(Integer  objsyncPort) {
        this.objsyncPort = objsyncPort;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Maximum of 5 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return openstackAvailabilityZones
     */
    public List<String> getOpenstackAvailabilityZones() {
        return openstackAvailabilityZones;
    }

    /**
     * This is the setter method. this will set the openstackAvailabilityZones
     * Field introduced in 17.1.1.
     * Maximum of 5 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return openstackAvailabilityZones
     */
    public void setOpenstackAvailabilityZones(List<String>  openstackAvailabilityZones) {
        this.openstackAvailabilityZones = openstackAvailabilityZones;
    }

    /**
     * This is the setter method this will set the openstackAvailabilityZones
     * Field introduced in 17.1.1.
     * Maximum of 5 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return openstackAvailabilityZones
     */
    public ServiceEngineGroup addOpenstackAvailabilityZonesItem(String openstackAvailabilityZonesItem) {
      if (this.openstackAvailabilityZones == null) {
        this.openstackAvailabilityZones = new ArrayList<String>();
      }
      this.openstackAvailabilityZones.add(openstackAvailabilityZonesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Avi management network name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return openstackMgmtNetworkName
     */
    public String getOpenstackMgmtNetworkName() {
        return openstackMgmtNetworkName;
    }

    /**
     * This is the setter method to the attribute.
     * Avi management network name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param openstackMgmtNetworkName set the openstackMgmtNetworkName.
     */
    public void setOpenstackMgmtNetworkName(String  openstackMgmtNetworkName) {
        this.openstackMgmtNetworkName = openstackMgmtNetworkName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Management network uuid.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return openstackMgmtNetworkUuid
     */
    public String getOpenstackMgmtNetworkUuid() {
        return openstackMgmtNetworkUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Management network uuid.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param openstackMgmtNetworkUuid set the openstackMgmtNetworkUuid.
     */
    public void setOpenstackMgmtNetworkUuid(String  openstackMgmtNetworkUuid) {
        this.openstackMgmtNetworkUuid = openstackMgmtNetworkUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Amount of extra memory to be reserved for use by the operating system on a service engine.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return osReservedMemory
     */
    public Integer getOsReservedMemory() {
        return osReservedMemory;
    }

    /**
     * This is the setter method to the attribute.
     * Amount of extra memory to be reserved for use by the operating system on a service engine.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param osReservedMemory set the osReservedMemory.
     */
    public void setOsReservedMemory(Integer  osReservedMemory) {
        this.osReservedMemory = osReservedMemory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable path mtu discovery feature for ipv4.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return pathMtuDiscoveryV4
     */
    public Boolean getPathMtuDiscoveryV4() {
        return pathMtuDiscoveryV4;
    }

    /**
     * This is the setter method to the attribute.
     * Enable path mtu discovery feature for ipv4.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param pathMtuDiscoveryV4 set the pathMtuDiscoveryV4.
     */
    public void setPathMtuDiscoveryV4(Boolean  pathMtuDiscoveryV4) {
        this.pathMtuDiscoveryV4 = pathMtuDiscoveryV4;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable path mtu discovery feature for ipv6.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return pathMtuDiscoveryV6
     */
    public Boolean getPathMtuDiscoveryV6() {
        return pathMtuDiscoveryV6;
    }

    /**
     * This is the setter method to the attribute.
     * Enable path mtu discovery feature for ipv6.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param pathMtuDiscoveryV6 set the pathMtuDiscoveryV6.
     */
    public void setPathMtuDiscoveryV6(Boolean  pathMtuDiscoveryV6) {
        this.pathMtuDiscoveryV6 = pathMtuDiscoveryV6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Determines the pcap transmit mode of operation.
     * Requires se reboot.
     * Enum options - PCAP_TX_AUTO, PCAP_TX_SOCKET, PCAP_TX_RING.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "PCAP_TX_AUTO".
     * @return pcapTxMode
     */
    public String getPcapTxMode() {
        return pcapTxMode;
    }

    /**
     * This is the setter method to the attribute.
     * Determines the pcap transmit mode of operation.
     * Requires se reboot.
     * Enum options - PCAP_TX_AUTO, PCAP_TX_SOCKET, PCAP_TX_RING.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "PCAP_TX_AUTO".
     * @param pcapTxMode set the pcapTxMode.
     */
    public void setPcapTxMode(String  pcapTxMode) {
        this.pcapTxMode = pcapTxMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * In pcap mode, reserve a configured portion of tx ring resources for itself and the remaining portion for the rx ring to achieve better balance in
     * terms of queue depth.
     * Requires se reboot.
     * Allowed values are 10-100.
     * Field introduced in 20.1.3.
     * Unit is percent.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return pcapTxRingRdBalancingFactor
     */
    public Integer getPcapTxRingRdBalancingFactor() {
        return pcapTxRingRdBalancingFactor;
    }

    /**
     * This is the setter method to the attribute.
     * In pcap mode, reserve a configured portion of tx ring resources for itself and the remaining portion for the rx ring to achieve better balance in
     * terms of queue depth.
     * Requires se reboot.
     * Allowed values are 10-100.
     * Field introduced in 20.1.3.
     * Unit is percent.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param pcapTxRingRdBalancingFactor set the pcapTxRingRdBalancingFactor.
     */
    public void setPcapTxRingRdBalancingFactor(Integer  pcapTxRingRdBalancingFactor) {
        this.pcapTxRingRdBalancingFactor = pcapTxRingRdBalancingFactor;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Per-app se mode is designed for deploying dedicated load balancers per app (vs).
     * In this mode, each se is limited to a max of 2 vss.
     * Vcpus in per-app ses count towards licensing usage at 25% rate.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return perApp
     */
    public Boolean getPerApp() {
        return perApp;
    }

    /**
     * This is the setter method to the attribute.
     * Per-app se mode is designed for deploying dedicated load balancers per app (vs).
     * In this mode, each se is limited to a max of 2 vss.
     * Vcpus in per-app ses count towards licensing usage at 25% rate.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param perApp set the perApp.
     */
    public void setPerApp(Boolean  perApp) {
        this.perApp = perApp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable/disable per vs level admission control.enabling this feature will cause the connection and packet throttling on a particular vs that has
     * high packet buffer consumption.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return perVsAdmissionControl
     */
    public Boolean getPerVsAdmissionControl() {
        return perVsAdmissionControl;
    }

    /**
     * This is the setter method to the attribute.
     * Enable/disable per vs level admission control.enabling this feature will cause the connection and packet throttling on a particular vs that has
     * high packet buffer consumption.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param perVsAdmissionControl set the perVsAdmissionControl.
     */
    public void setPerVsAdmissionControl(Boolean  perVsAdmissionControl) {
        this.perVsAdmissionControl = perVsAdmissionControl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If placement mode is 'auto', virtual services are automatically placed on service engines.
     * Enum options - PLACEMENT_MODE_AUTO.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "PLACEMENT_MODE_AUTO".
     * @return placementMode
     */
    public String getPlacementMode() {
        return placementMode;
    }

    /**
     * This is the setter method to the attribute.
     * If placement mode is 'auto', virtual services are automatically placed on service engines.
     * Enum options - PLACEMENT_MODE_AUTO.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "PLACEMENT_MODE_AUTO".
     * @param placementMode set the placementMode.
     */
    public void setPlacementMode(String  placementMode) {
        this.placementMode = placementMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable or deactivate real time se metrics.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return realtimeSeMetrics
     */
    public MetricsRealTimeUpdate getRealtimeSeMetrics() {
        return realtimeSeMetrics;
    }

    /**
     * This is the setter method to the attribute.
     * Enable or deactivate real time se metrics.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param realtimeSeMetrics set the realtimeSeMetrics.
     */
    public void setRealtimeSeMetrics(MetricsRealTimeUpdate realtimeSeMetrics) {
        this.realtimeSeMetrics = realtimeSeMetrics;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reboot the vm or host on kernel panic.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return rebootOnPanic
     */
    public Boolean getRebootOnPanic() {
        return rebootOnPanic;
    }

    /**
     * This is the setter method to the attribute.
     * Reboot the vm or host on kernel panic.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param rebootOnPanic set the rebootOnPanic.
     */
    public void setRebootOnPanic(Boolean  rebootOnPanic) {
        this.rebootOnPanic = rebootOnPanic;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Routes in vrf are replayed at the specified interval.
     * This should be increased if there are large number of routes.
     * Allowed values are 0-3000.
     * Field introduced in 22.1.3.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @return replayVrfRoutesInterval
     */
    public Integer getReplayVrfRoutesInterval() {
        return replayVrfRoutesInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Routes in vrf are replayed at the specified interval.
     * This should be increased if there are large number of routes.
     * Allowed values are 0-3000.
     * Field introduced in 22.1.3.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @param replayVrfRoutesInterval set the replayVrfRoutesInterval.
     */
    public void setReplayVrfRoutesInterval(Integer  replayVrfRoutesInterval) {
        this.replayVrfRoutesInterval = replayVrfRoutesInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time interval to re-sync se's time with wall clock time.
     * Allowed values are 8-600000.
     * Field introduced in 20.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 65536.
     * @return resyncTimeInterval
     */
    public Integer getResyncTimeInterval() {
        return resyncTimeInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Time interval to re-sync se's time with wall clock time.
     * Allowed values are 8-600000.
     * Field introduced in 20.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 65536.
     * @param resyncTimeInterval set the resyncTimeInterval.
     */
    public void setResyncTimeInterval(Integer  resyncTimeInterval) {
        this.resyncTimeInterval = resyncTimeInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sdb pipeline flush interval.
     * Allowed values are 1-10000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return sdbFlushInterval
     */
    public Integer getSdbFlushInterval() {
        return sdbFlushInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Sdb pipeline flush interval.
     * Allowed values are 1-10000.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param sdbFlushInterval set the sdbFlushInterval.
     */
    public void setSdbFlushInterval(Integer  sdbFlushInterval) {
        this.sdbFlushInterval = sdbFlushInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sdb pipeline size.
     * Allowed values are 1-10000.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return sdbPipelineSize
     */
    public Integer getSdbPipelineSize() {
        return sdbPipelineSize;
    }

    /**
     * This is the setter method to the attribute.
     * Sdb pipeline size.
     * Allowed values are 1-10000.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param sdbPipelineSize set the sdbPipelineSize.
     */
    public void setSdbPipelineSize(Integer  sdbPipelineSize) {
        this.sdbPipelineSize = sdbPipelineSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sdb scan count.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @return sdbScanCount
     */
    public Integer getSdbScanCount() {
        return sdbScanCount;
    }

    /**
     * This is the setter method to the attribute.
     * Sdb scan count.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1000.
     * @param sdbScanCount set the sdbScanCount.
     */
    public void setSdbScanCount(Integer  sdbScanCount) {
        this.sdbScanCount = sdbScanCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Select the se bandwidth for the bandwidth license.
     * Enum options - SE_BANDWIDTH_UNLIMITED, SE_BANDWIDTH_25M, SE_BANDWIDTH_200M, SE_BANDWIDTH_1000M, SE_BANDWIDTH_10000M.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- se_bandwidth_unlimited), basic edition(allowed values-
     * se_bandwidth_unlimited), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seBandwidthType
     */
    public String getSeBandwidthType() {
        return seBandwidthType;
    }

    /**
     * This is the setter method to the attribute.
     * Select the se bandwidth for the bandwidth license.
     * Enum options - SE_BANDWIDTH_UNLIMITED, SE_BANDWIDTH_25M, SE_BANDWIDTH_200M, SE_BANDWIDTH_1000M, SE_BANDWIDTH_10000M.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- se_bandwidth_unlimited), basic edition(allowed values-
     * se_bandwidth_unlimited), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seBandwidthType set the seBandwidthType.
     */
    public void setSeBandwidthType(String  seBandwidthType) {
        this.seBandwidthType = seBandwidthType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Use to cap the size of debug ring min(se_debug_trace_sz, num_dispatcher_cores).
     * Only applicable to > 8g systems.
     * Requires se reboot.
     * Allowed values are 1,2,4,8,255.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return seDebugTraceSz
     */
    public Integer getSeDebugTraceSz() {
        return seDebugTraceSz;
    }

    /**
     * This is the setter method to the attribute.
     * Use to cap the size of debug ring min(se_debug_trace_sz, num_dispatcher_cores).
     * Only applicable to > 8g systems.
     * Requires se reboot.
     * Allowed values are 1,2,4,8,255.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param seDebugTraceSz set the seDebugTraceSz.
     */
    public void setSeDebugTraceSz(Integer  seDebugTraceSz) {
        this.seDebugTraceSz = seDebugTraceSz;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Delay the cleanup of flowtable entry.
     * To be used under surveillance of avi support.
     * Field introduced in 20.1.2.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return seDelayedFlowDelete
     */
    public Boolean getSeDelayedFlowDelete() {
        return seDelayedFlowDelete;
    }

    /**
     * This is the setter method to the attribute.
     * Delay the cleanup of flowtable entry.
     * To be used under surveillance of avi support.
     * Field introduced in 20.1.2.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param seDelayedFlowDelete set the seDelayedFlowDelete.
     */
    public void setSeDelayedFlowDelete(Boolean  seDelayedFlowDelete) {
        this.seDelayedFlowDelete = seDelayedFlowDelete;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Duration to preserve unused service engine virtual machines before deleting them.
     * If traffic to a virtual service were to spike up abruptly, this se would still be available to be utilized again rather than creating a new se.
     * If this value is set to 0, controller will never delete any ses and administrator has to manually cleanup unused ses.
     * Allowed values are 0-525600.
     * Unit is min.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 120.
     * @return seDeprovisionDelay
     */
    public Integer getSeDeprovisionDelay() {
        return seDeprovisionDelay;
    }

    /**
     * This is the setter method to the attribute.
     * Duration to preserve unused service engine virtual machines before deleting them.
     * If traffic to a virtual service were to spike up abruptly, this se would still be available to be utilized again rather than creating a new se.
     * If this value is set to 0, controller will never delete any ses and administrator has to manually cleanup unused ses.
     * Allowed values are 0-525600.
     * Unit is min.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 120.
     * @param seDeprovisionDelay set the seDeprovisionDelay.
     */
    public void setSeDeprovisionDelay(Integer  seDeprovisionDelay) {
        this.seDeprovisionDelay = seDeprovisionDelay;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDosProfile
     */
    public DosThresholdProfile getSeDosProfile() {
        return seDosProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seDosProfile set the seDosProfile.
     */
    public void setSeDosProfile(DosThresholdProfile seDosProfile) {
        this.seDosProfile = seDosProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal only.
     * Used to simulate se - se hb failure.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seDpHmDrops
     */
    public Integer getSeDpHmDrops() {
        return seDpHmDrops;
    }

    /**
     * This is the setter method to the attribute.
     * Internal only.
     * Used to simulate se - se hb failure.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seDpHmDrops set the seDpHmDrops.
     */
    public void setSeDpHmDrops(Integer  seDpHmDrops) {
        this.seDpHmDrops = seDpHmDrops;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of jiffies between polling interface state.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return seDpIfStatePollInterval
     */
    public Integer getSeDpIfStatePollInterval() {
        return seDpIfStatePollInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Number of jiffies between polling interface state.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param seDpIfStatePollInterval set the seDpIfStatePollInterval.
     */
    public void setSeDpIfStatePollInterval(Integer  seDpIfStatePollInterval) {
        this.seDpIfStatePollInterval = seDpIfStatePollInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Toggle support to run se datapath instances in isolation on exclusive cpus.
     * This improves latency and performance.
     * However, this could reduce the total number of se_dp instances created on that se instance.
     * Supported for >= 8 cpus.
     * Requires se reboot.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seDpIsolation
     */
    public Boolean getSeDpIsolation() {
        return seDpIsolation;
    }

    /**
     * This is the setter method to the attribute.
     * Toggle support to run se datapath instances in isolation on exclusive cpus.
     * This improves latency and performance.
     * However, this could reduce the total number of se_dp instances created on that se instance.
     * Supported for >= 8 cpus.
     * Requires se reboot.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seDpIsolation set the seDpIsolation.
     */
    public void setSeDpIsolation(Boolean  seDpIsolation) {
        this.seDpIsolation = seDpIsolation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of cpus for non se-dp tasks in se datapath isolation mode.
     * Translates total cpus minus 'num_non_dp_cpus' for datapath use.
     * It is recommended to reserve an even number of cpus for hyper-threaded processors.
     * Requires se reboot.
     * Allowed values are 1-8.
     * Special values are 0- auto.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seDpIsolationNumNonDpCpus
     */
    public Integer getSeDpIsolationNumNonDpCpus() {
        return seDpIsolationNumNonDpCpus;
    }

    /**
     * This is the setter method to the attribute.
     * Number of cpus for non se-dp tasks in se datapath isolation mode.
     * Translates total cpus minus 'num_non_dp_cpus' for datapath use.
     * It is recommended to reserve an even number of cpus for hyper-threaded processors.
     * Requires se reboot.
     * Allowed values are 1-8.
     * Special values are 0- auto.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seDpIsolationNumNonDpCpus set the seDpIsolationNumNonDpCpus.
     */
    public void setSeDpIsolationNumNonDpCpus(Integer  seDpIsolationNumNonDpCpus) {
        this.seDpIsolationNumNonDpCpus = seDpIsolationNumNonDpCpus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal buffer full indicator on the service engine beyond which the unfiltered logs are abandoned.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 70.
     * @return seDpLogNfEnqueuePercent
     */
    public Integer getSeDpLogNfEnqueuePercent() {
        return seDpLogNfEnqueuePercent;
    }

    /**
     * This is the setter method to the attribute.
     * Internal buffer full indicator on the service engine beyond which the unfiltered logs are abandoned.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 70.
     * @param seDpLogNfEnqueuePercent set the seDpLogNfEnqueuePercent.
     */
    public void setSeDpLogNfEnqueuePercent(Integer  seDpLogNfEnqueuePercent) {
        this.seDpLogNfEnqueuePercent = seDpLogNfEnqueuePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal buffer full indicator on the service engine beyond which the user filtered logs are abandoned.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 90.
     * @return seDpLogUdfEnqueuePercent
     */
    public Integer getSeDpLogUdfEnqueuePercent() {
        return seDpLogUdfEnqueuePercent;
    }

    /**
     * This is the setter method to the attribute.
     * Internal buffer full indicator on the service engine beyond which the user filtered logs are abandoned.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 90.
     * @param seDpLogUdfEnqueuePercent set the seDpLogUdfEnqueuePercent.
     */
    public void setSeDpLogUdfEnqueuePercent(Integer  seDpLogUdfEnqueuePercent) {
        this.seDpLogUdfEnqueuePercent = seDpLogUdfEnqueuePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The highest supported se-se heartbeat protocol version.
     * This version is reported by secondary se to primary se in heartbeat response messages.
     * Allowed values are 1-3.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3.
     * @return seDpMaxHbVersion
     */
    public Integer getSeDpMaxHbVersion() {
        return seDpMaxHbVersion;
    }

    /**
     * This is the setter method to the attribute.
     * The highest supported se-se heartbeat protocol version.
     * This version is reported by secondary se to primary se in heartbeat response messages.
     * Allowed values are 1-3.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3.
     * @param seDpMaxHbVersion set the seDpMaxHbVersion.
     */
    public void setSeDpMaxHbVersion(Integer  seDpMaxHbVersion) {
        this.seDpMaxHbVersion = seDpMaxHbVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time (in seconds) service engine waits for after generating a vnic transmit queue stall event before resetting thenic.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seDpVnicQueueStallEventSleep
     */
    public Integer getSeDpVnicQueueStallEventSleep() {
        return seDpVnicQueueStallEventSleep;
    }

    /**
     * This is the setter method to the attribute.
     * Time (in seconds) service engine waits for after generating a vnic transmit queue stall event before resetting thenic.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seDpVnicQueueStallEventSleep set the seDpVnicQueueStallEventSleep.
     */
    public void setSeDpVnicQueueStallEventSleep(Integer  seDpVnicQueueStallEventSleep) {
        this.seDpVnicQueueStallEventSleep = seDpVnicQueueStallEventSleep;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of consecutive transmit failures to look for before generating a vnic transmit queue stall event.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
     * @return seDpVnicQueueStallThreshold
     */
    public Integer getSeDpVnicQueueStallThreshold() {
        return seDpVnicQueueStallThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Number of consecutive transmit failures to look for before generating a vnic transmit queue stall event.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2000.
     * @param seDpVnicQueueStallThreshold set the seDpVnicQueueStallThreshold.
     */
    public void setSeDpVnicQueueStallThreshold(Integer  seDpVnicQueueStallThreshold) {
        this.seDpVnicQueueStallThreshold = seDpVnicQueueStallThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time (in milliseconds) to wait for network/nic recovery on detecting a transmit queue stall after which service engine resets the nic.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @return seDpVnicQueueStallTimeout
     */
    public Integer getSeDpVnicQueueStallTimeout() {
        return seDpVnicQueueStallTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Time (in milliseconds) to wait for network/nic recovery on detecting a transmit queue stall after which service engine resets the nic.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
     * @param seDpVnicQueueStallTimeout set the seDpVnicQueueStallTimeout.
     */
    public void setSeDpVnicQueueStallTimeout(Integer  seDpVnicQueueStallTimeout) {
        this.seDpVnicQueueStallTimeout = seDpVnicQueueStallTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of consecutive transmit queue stall events in se_dp_vnic_stall_se_restart_window to look for before restarting se.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3.
     * @return seDpVnicRestartOnQueueStallCount
     */
    public Integer getSeDpVnicRestartOnQueueStallCount() {
        return seDpVnicRestartOnQueueStallCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of consecutive transmit queue stall events in se_dp_vnic_stall_se_restart_window to look for before restarting se.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3.
     * @param seDpVnicRestartOnQueueStallCount set the seDpVnicRestartOnQueueStallCount.
     */
    public void setSeDpVnicRestartOnQueueStallCount(Integer  seDpVnicRestartOnQueueStallCount) {
        this.seDpVnicRestartOnQueueStallCount = seDpVnicRestartOnQueueStallCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Window of time (in seconds) during which se_dp_vnic_restart_on_queue_stall_count number of consecutive stalls results in a se restart.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
     * @return seDpVnicStallSeRestartWindow
     */
    public Integer getSeDpVnicStallSeRestartWindow() {
        return seDpVnicStallSeRestartWindow;
    }

    /**
     * This is the setter method to the attribute.
     * Window of time (in seconds) during which se_dp_vnic_restart_on_queue_stall_count number of consecutive stalls results in a se restart.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600.
     * @param seDpVnicStallSeRestartWindow set the seDpVnicStallSeRestartWindow.
     */
    public void setSeDpVnicStallSeRestartWindow(Integer  seDpVnicStallSeRestartWindow) {
        this.seDpVnicStallSeRestartWindow = seDpVnicStallSeRestartWindow;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Determines if dpdk pool mode driver should be used or not   0  automatically determine based on hypervisor/nic type 1  unconditionally use dpdk
     * poll mode driver 2  don't use dpdk poll mode driver.requires se reboot.
     * Allowed values are 0-2.
     * Field introduced in 18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seDpdkPmd
     */
    public Integer getSeDpdkPmd() {
        return seDpdkPmd;
    }

    /**
     * This is the setter method to the attribute.
     * Determines if dpdk pool mode driver should be used or not   0  automatically determine based on hypervisor/nic type 1  unconditionally use dpdk
     * poll mode driver 2  don't use dpdk poll mode driver.requires se reboot.
     * Allowed values are 0-2.
     * Field introduced in 18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seDpdkPmd set the seDpdkPmd.
     */
    public void setSeDpdkPmd(Integer  seDpdkPmd) {
        this.seDpdkPmd = seDpdkPmd;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable core dump on assert.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seDumpCoreOnAssert
     */
    public Boolean getSeDumpCoreOnAssert() {
        return seDumpCoreOnAssert;
    }

    /**
     * This is the setter method to the attribute.
     * Enable core dump on assert.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seDumpCoreOnAssert set the seDumpCoreOnAssert.
     */
    public void setSeDumpCoreOnAssert(Boolean  seDumpCoreOnAssert) {
        this.seDumpCoreOnAssert = seDumpCoreOnAssert;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Use this to emulate more/less cpus than is actually available.
     * One datapath process is started for each core.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seEmulatedCores
     */
    public Integer getSeEmulatedCores() {
        return seEmulatedCores;
    }

    /**
     * This is the setter method to the attribute.
     * Use this to emulate more/less cpus than is actually available.
     * One datapath process is started for each core.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seEmulatedCores set the seEmulatedCores.
     */
    public void setSeEmulatedCores(Integer  seEmulatedCores) {
        this.seEmulatedCores = seEmulatedCores;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flow probe retry count if no replies are received.requires se reboot.
     * Allowed values are 0-5.
     * Field introduced in 18.1.4, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @return seFlowProbeRetries
     */
    public Integer getSeFlowProbeRetries() {
        return seFlowProbeRetries;
    }

    /**
     * This is the setter method to the attribute.
     * Flow probe retry count if no replies are received.requires se reboot.
     * Allowed values are 0-5.
     * Field introduced in 18.1.4, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @param seFlowProbeRetries set the seFlowProbeRetries.
     */
    public void setSeFlowProbeRetries(Integer  seFlowProbeRetries) {
        this.seFlowProbeRetries = seFlowProbeRetries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout in milliseconds for flow probe retries.requires se reboot.
     * Allowed values are 20-50.
     * Field introduced in 18.2.5.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 40.
     * @return seFlowProbeRetryTimer
     */
    public Integer getSeFlowProbeRetryTimer() {
        return seFlowProbeRetryTimer;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout in milliseconds for flow probe retries.requires se reboot.
     * Allowed values are 20-50.
     * Field introduced in 18.2.5.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 40.
     * @param seFlowProbeRetryTimer set the seFlowProbeRetryTimer.
     */
    public void setSeFlowProbeRetryTimer(Integer  seFlowProbeRetryTimer) {
        this.seFlowProbeRetryTimer = seFlowProbeRetryTimer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Analytics policy for serviceenginegroup.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupAnalyticsPolicy
     */
    public SeGroupAnalyticsPolicy getSeGroupAnalyticsPolicy() {
        return seGroupAnalyticsPolicy;
    }

    /**
     * This is the setter method to the attribute.
     * Analytics policy for serviceenginegroup.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroupAnalyticsPolicy set the seGroupAnalyticsPolicy.
     */
    public void setSeGroupAnalyticsPolicy(SeGroupAnalyticsPolicy seGroupAnalyticsPolicy) {
        this.seGroupAnalyticsPolicy = seGroupAnalyticsPolicy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Controls the distribution of se data path processes on cpus which support hyper-threading.
     * Requires hyper-threading to be enabled at host level.
     * Requires se reboot.
     * For more details please refer to se placement kb.
     * Enum options - SE_CPU_HT_AUTO, SE_CPU_HT_SPARSE_DISPATCHER_PRIORITY, SE_CPU_HT_SPARSE_PROXY_PRIORITY, SE_CPU_HT_PACKED_CORES.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SE_CPU_HT_AUTO".
     * @return seHyperthreadedMode
     */
    public String getSeHyperthreadedMode() {
        return seHyperthreadedMode;
    }

    /**
     * This is the setter method to the attribute.
     * Controls the distribution of se data path processes on cpus which support hyper-threading.
     * Requires hyper-threading to be enabled at host level.
     * Requires se reboot.
     * For more details please refer to se placement kb.
     * Enum options - SE_CPU_HT_AUTO, SE_CPU_HT_SPARSE_DISPATCHER_PRIORITY, SE_CPU_HT_SPARSE_PROXY_PRIORITY, SE_CPU_HT_PACKED_CORES.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SE_CPU_HT_AUTO".
     * @param seHyperthreadedMode set the seHyperthreadedMode.
     */
    public void setSeHyperthreadedMode(String  seHyperthreadedMode) {
        this.seHyperthreadedMode = seHyperthreadedMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Determines if se-se ipc messages are encapsulated in an ip header       0        automatically determine based on hypervisor type    1        use
     * ip encap unconditionally    ~[0,1]   don't use ip encaprequires se reboot.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seIpEncapIpc
     */
    public Integer getSeIpEncapIpc() {
        return seIpEncapIpc;
    }

    /**
     * This is the setter method to the attribute.
     * Determines if se-se ipc messages are encapsulated in an ip header       0        automatically determine based on hypervisor type    1        use
     * ip encap unconditionally    ~[0,1]   don't use ip encaprequires se reboot.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seIpEncapIpc set the seIpEncapIpc.
     */
    public void setSeIpEncapIpc(Integer  seIpEncapIpc) {
        this.seIpEncapIpc = seIpEncapIpc;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This knob controls the resource availability and burst size used between se datapath and kni.
     * This helps in minimising packet drops when there is higher kni traffic (non-vip traffic from and to linux).
     * The factor takes the following values      0-default.
     * 1-doubles the burst size and kni resources.
     * 2-quadruples the burst size and kni resources.
     * Allowed values are 0-2.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seKniBurstFactor
     */
    public Integer getSeKniBurstFactor() {
        return seKniBurstFactor;
    }

    /**
     * This is the setter method to the attribute.
     * This knob controls the resource availability and burst size used between se datapath and kni.
     * This helps in minimising packet drops when there is higher kni traffic (non-vip traffic from and to linux).
     * The factor takes the following values      0-default.
     * 1-doubles the burst size and kni resources.
     * 2-quadruples the burst size and kni resources.
     * Allowed values are 0-2.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seKniBurstFactor set the seKniBurstFactor.
     */
    public void setSeKniBurstFactor(Integer  seKniBurstFactor) {
        this.seKniBurstFactor = seKniBurstFactor;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Determines if se-se ipc messages use se interface ip instead of vip        0        automatically determine based on hypervisor type    1
     * use se interface ip unconditionally    ~[0,1]   don't use se interface iprequires se reboot.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seL3EncapIpc
     */
    public Integer getSeL3EncapIpc() {
        return seL3EncapIpc;
    }

    /**
     * This is the setter method to the attribute.
     * Determines if se-se ipc messages use se interface ip instead of vip        0        automatically determine based on hypervisor type    1
     * use se interface ip unconditionally    ~[0,1]   don't use se interface iprequires se reboot.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seL3EncapIpc set the seL3EncapIpc.
     */
    public void setSeL3EncapIpc(Integer  seL3EncapIpc) {
        this.seL3EncapIpc = seL3EncapIpc;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal flag that blocks dataplane until all application logs are flushed to log-agent process.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seLogBufferAppBlockingDequeue
     */
    public Boolean getSeLogBufferAppBlockingDequeue() {
        return seLogBufferAppBlockingDequeue;
    }

    /**
     * This is the setter method to the attribute.
     * Internal flag that blocks dataplane until all application logs are flushed to log-agent process.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seLogBufferAppBlockingDequeue set the seLogBufferAppBlockingDequeue.
     */
    public void setSeLogBufferAppBlockingDequeue(Boolean  seLogBufferAppBlockingDequeue) {
        this.seLogBufferAppBlockingDequeue = seLogBufferAppBlockingDequeue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal flag that blocks dataplane until all connection logs are flushed to log-agent process.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seLogBufferConnBlockingDequeue
     */
    public Boolean getSeLogBufferConnBlockingDequeue() {
        return seLogBufferConnBlockingDequeue;
    }

    /**
     * This is the setter method to the attribute.
     * Internal flag that blocks dataplane until all connection logs are flushed to log-agent process.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seLogBufferConnBlockingDequeue set the seLogBufferConnBlockingDequeue.
     */
    public void setSeLogBufferConnBlockingDequeue(Boolean  seLogBufferConnBlockingDequeue) {
        this.seLogBufferConnBlockingDequeue = seLogBufferConnBlockingDequeue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal flag that blocks dataplane until all outstanding events are flushed to log-agent process.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return seLogBufferEventsBlockingDequeue
     */
    public Boolean getSeLogBufferEventsBlockingDequeue() {
        return seLogBufferEventsBlockingDequeue;
    }

    /**
     * This is the setter method to the attribute.
     * Internal flag that blocks dataplane until all outstanding events are flushed to log-agent process.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param seLogBufferEventsBlockingDequeue set the seLogBufferEventsBlockingDequeue.
     */
    public void setSeLogBufferEventsBlockingDequeue(Boolean  seLogBufferEventsBlockingDequeue) {
        this.seLogBufferEventsBlockingDequeue = seLogBufferEventsBlockingDequeue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable or disable large receive optimization for vnics.supported on vmxnet3.requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seLro
     */
    public Boolean getSeLro() {
        return seLro;
    }

    /**
     * This is the setter method to the attribute.
     * Enable or disable large receive optimization for vnics.supported on vmxnet3.requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seLro set the seLro.
     */
    public void setSeLro(Boolean  seLro) {
        this.seLro = seLro;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The retry count for the multi-producer enqueue before yielding the cpu.
     * To be used under surveillance of avi support.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 500), basic edition(allowed values- 500), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @return seMpRingRetryCount
     */
    public Integer getSeMpRingRetryCount() {
        return seMpRingRetryCount;
    }

    /**
     * This is the setter method to the attribute.
     * The retry count for the multi-producer enqueue before yielding the cpu.
     * To be used under surveillance of avi support.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 500), basic edition(allowed values- 500), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @param seMpRingRetryCount set the seMpRingRetryCount.
     */
    public void setSeMpRingRetryCount(Integer  seMpRingRetryCount) {
        this.seMpRingRetryCount = seMpRingRetryCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Mtu for the vnics of ses in the se group.
     * Allowed values are 512-9000.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seMtu
     */
    public Integer getSeMtu() {
        return seMtu;
    }

    /**
     * This is the setter method to the attribute.
     * Mtu for the vnics of ses in the se group.
     * Allowed values are 512-9000.
     * Field introduced in 18.2.8, 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seMtu set the seMtu.
     */
    public void setSeMtu(Integer  seMtu) {
        this.seMtu = seMtu;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Prefix to use for virtual machine name of service engines.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "Avi".
     * @return seNamePrefix
     */
    public String getSeNamePrefix() {
        return seNamePrefix;
    }

    /**
     * This is the setter method to the attribute.
     * Prefix to use for virtual machine name of service engines.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "Avi".
     * @param seNamePrefix set the seNamePrefix.
     */
    public void setSeNamePrefix(String  seNamePrefix) {
        this.seNamePrefix = seNamePrefix;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal use only.
     * Used to artificially reduce the available number of packet buffers.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return sePacketBufferMax
     */
    public Integer getSePacketBufferMax() {
        return sePacketBufferMax;
    }

    /**
     * This is the setter method to the attribute.
     * Internal use only.
     * Used to artificially reduce the available number of packet buffers.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param sePacketBufferMax set the sePacketBufferMax.
     */
    public void setSePacketBufferMax(Integer  sePacketBufferMax) {
        this.sePacketBufferMax = sePacketBufferMax;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enables lookahead mode of packet receive in pcap mode.
     * Introduced to overcome an issue with hv_netvsc driver.
     * Lookahead mode attempts to ensure that application and kernel's view of the receive rings are consistent.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return sePcapLookahead
     */
    public Boolean getSePcapLookahead() {
        return sePcapLookahead;
    }

    /**
     * This is the setter method to the attribute.
     * Enables lookahead mode of packet receive in pcap mode.
     * Introduced to overcome an issue with hv_netvsc driver.
     * Lookahead mode attempts to ensure that application and kernel's view of the receive rings are consistent.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param sePcapLookahead set the sePcapLookahead.
     */
    public void setSePcapLookahead(Boolean  sePcapLookahead) {
        this.sePcapLookahead = sePcapLookahead;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Max number of packets the pcap interface can hold and if the value is 0 the optimum value will be chosen.
     * The optimum value will be chosen based on se-memory, cloud type and number of interfaces.requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return sePcapPktCount
     */
    public Integer getSePcapPktCount() {
        return sePcapPktCount;
    }

    /**
     * This is the setter method to the attribute.
     * Max number of packets the pcap interface can hold and if the value is 0 the optimum value will be chosen.
     * The optimum value will be chosen based on se-memory, cloud type and number of interfaces.requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param sePcapPktCount set the sePcapPktCount.
     */
    public void setSePcapPktCount(Integer  sePcapPktCount) {
        this.sePcapPktCount = sePcapPktCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Max size of each packet in the pcap interface.
     * Requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 69632.
     * @return sePcapPktSz
     */
    public Integer getSePcapPktSz() {
        return sePcapPktSz;
    }

    /**
     * This is the setter method to the attribute.
     * Max size of each packet in the pcap interface.
     * Requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 69632.
     * @param sePcapPktSz set the sePcapPktSz.
     */
    public void setSePcapPktSz(Integer  sePcapPktSz) {
        this.sePcapPktSz = sePcapPktSz;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Bypass the kernel's traffic control layer, to deliver packets directly to the driver.
     * Enabling this feature results in egress packets not being captured in host tcpdump.
     * Note   brief packet reordering or loss may occur upon toggle.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return sePcapQdiscBypass
     */
    public Boolean getSePcapQdiscBypass() {
        return sePcapQdiscBypass;
    }

    /**
     * This is the setter method to the attribute.
     * Bypass the kernel's traffic control layer, to deliver packets directly to the driver.
     * Enabling this feature results in egress packets not being captured in host tcpdump.
     * Note   brief packet reordering or loss may occur upon toggle.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param sePcapQdiscBypass set the sePcapQdiscBypass.
     */
    public void setSePcapQdiscBypass(Boolean  sePcapQdiscBypass) {
        this.sePcapQdiscBypass = sePcapQdiscBypass;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Frequency in seconds at which periodically a pcap reinit check is triggered.
     * May be used in conjunction with the configuration pcap_reinit_threshold.
     * (valid range   15 mins - 12 hours, 0 - disables).
     * Allowed values are 900-43200.
     * Special values are 0- disable.
     * Field introduced in 17.2.13, 18.1.3, 18.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return sePcapReinitFrequency
     */
    public Integer getSePcapReinitFrequency() {
        return sePcapReinitFrequency;
    }

    /**
     * This is the setter method to the attribute.
     * Frequency in seconds at which periodically a pcap reinit check is triggered.
     * May be used in conjunction with the configuration pcap_reinit_threshold.
     * (valid range   15 mins - 12 hours, 0 - disables).
     * Allowed values are 900-43200.
     * Special values are 0- disable.
     * Field introduced in 17.2.13, 18.1.3, 18.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param sePcapReinitFrequency set the sePcapReinitFrequency.
     */
    public void setSePcapReinitFrequency(Integer  sePcapReinitFrequency) {
        this.sePcapReinitFrequency = sePcapReinitFrequency;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Threshold for input packet receive errors in pcap mode exceeding which a pcap reinit is triggered.
     * If not set, an unconditional reinit is performed.
     * This value is checked every pcap_reinit_frequency interval.
     * Field introduced in 17.2.13, 18.1.3, 18.2.1.
     * Unit is metric_count.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return sePcapReinitThreshold
     */
    public Integer getSePcapReinitThreshold() {
        return sePcapReinitThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Threshold for input packet receive errors in pcap mode exceeding which a pcap reinit is triggered.
     * If not set, an unconditional reinit is performed.
     * This value is checked every pcap_reinit_frequency interval.
     * Field introduced in 17.2.13, 18.1.3, 18.2.1.
     * Unit is metric_count.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param sePcapReinitThreshold set the sePcapReinitThreshold.
     */
    public void setSePcapReinitThreshold(Integer  sePcapReinitThreshold) {
        this.sePcapReinitThreshold = sePcapReinitThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tcp port on se where echo service will be run.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 7.
     * @return seProbePort
     */
    public Integer getSeProbePort() {
        return seProbePort;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp port on se where echo service will be run.
     * Field introduced in 17.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 7.
     * @param seProbePort set the seProbePort.
     */
    public void setSeProbePort(Integer  seProbePort) {
        this.seProbePort = seProbePort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rate limiter properties.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRlProp
     */
    public RateLimiterProperties getSeRlProp() {
        return seRlProp;
    }

    /**
     * This is the setter method to the attribute.
     * Rate limiter properties.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRlProp set the seRlProp.
     */
    public void setSeRlProp(RateLimiterProperties seRlProp) {
        this.seRlProp = seRlProp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum time to wait on server between taking sampleswhen sampling the navigation timing data from the end user client.
     * Field introduced in 18.2.6.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return seRumSamplingNavInterval
     */
    public Integer getSeRumSamplingNavInterval() {
        return seRumSamplingNavInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum time to wait on server between taking sampleswhen sampling the navigation timing data from the end user client.
     * Field introduced in 18.2.6.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param seRumSamplingNavInterval set the seRumSamplingNavInterval.
     */
    public void setSeRumSamplingNavInterval(Integer  seRumSamplingNavInterval) {
        this.seRumSamplingNavInterval = seRumSamplingNavInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Percentage of navigation timing data from the end user client, used for sampling to get client insights.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return seRumSamplingNavPercent
     */
    public Integer getSeRumSamplingNavPercent() {
        return seRumSamplingNavPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Percentage of navigation timing data from the end user client, used for sampling to get client insights.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param seRumSamplingNavPercent set the seRumSamplingNavPercent.
     */
    public void setSeRumSamplingNavPercent(Integer  seRumSamplingNavPercent) {
        this.seRumSamplingNavPercent = seRumSamplingNavPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum time to wait on server between taking sampleswhen sampling the resource timing data from the end user client.
     * Field introduced in 18.2.6.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @return seRumSamplingResInterval
     */
    public Integer getSeRumSamplingResInterval() {
        return seRumSamplingResInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum time to wait on server between taking sampleswhen sampling the resource timing data from the end user client.
     * Field introduced in 18.2.6.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2.
     * @param seRumSamplingResInterval set the seRumSamplingResInterval.
     */
    public void setSeRumSamplingResInterval(Integer  seRumSamplingResInterval) {
        this.seRumSamplingResInterval = seRumSamplingResInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Percentage of resource timing data from the end user client used for sampling to get client insight.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return seRumSamplingResPercent
     */
    public Integer getSeRumSamplingResPercent() {
        return seRumSamplingResPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Percentage of resource timing data from the end user client used for sampling to get client insight.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param seRumSamplingResPercent set the seRumSamplingResPercent.
     */
    public void setSeRumSamplingResPercent(Integer  seRumSamplingResPercent) {
        this.seRumSamplingResPercent = seRumSamplingResPercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sideband traffic will be handled by a dedicated core.requires se reboot.
     * Field introduced in 16.5.2, 17.1.9, 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seSbDedicatedCore
     */
    public Boolean getSeSbDedicatedCore() {
        return seSbDedicatedCore;
    }

    /**
     * This is the setter method to the attribute.
     * Sideband traffic will be handled by a dedicated core.requires se reboot.
     * Field introduced in 16.5.2, 17.1.9, 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seSbDedicatedCore set the seSbDedicatedCore.
     */
    public void setSeSbDedicatedCore(Boolean  seSbDedicatedCore) {
        this.seSbDedicatedCore = seSbDedicatedCore;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of sideband threads per se.requires se reboot.
     * Allowed values are 1-128.
     * Field introduced in 16.5.2, 17.1.9, 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return seSbThreads
     */
    public Integer getSeSbThreads() {
        return seSbThreads;
    }

    /**
     * This is the setter method to the attribute.
     * Number of sideband threads per se.requires se reboot.
     * Allowed values are 1-128.
     * Field introduced in 16.5.2, 17.1.9, 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param seSbThreads set the seSbThreads.
     */
    public void setSeSbThreads(Integer  seSbThreads) {
        this.seSbThreads = seSbThreads;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Multiplier for se threads based on vcpu.
     * Allowed values are 1-10.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1), basic edition(allowed values- 1), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return seThreadMultiplier
     */
    public Integer getSeThreadMultiplier() {
        return seThreadMultiplier;
    }

    /**
     * This is the setter method to the attribute.
     * Multiplier for se threads based on vcpu.
     * Allowed values are 1-10.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1), basic edition(allowed values- 1), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param seThreadMultiplier set the seThreadMultiplier.
     */
    public void setSeThreadMultiplier(Integer  seThreadMultiplier) {
        this.seThreadMultiplier = seThreadMultiplier;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time tracker properties for latency audit.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seTimeTrackerProps
     */
    public SETimeTrackerProperties getSeTimeTrackerProps() {
        return seTimeTrackerProps;
    }

    /**
     * This is the setter method to the attribute.
     * Time tracker properties for latency audit.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seTimeTrackerProps set the seTimeTrackerProps.
     */
    public void setSeTimeTrackerProps(SETimeTrackerProperties seTimeTrackerProps) {
        this.seTimeTrackerProps = seTimeTrackerProps;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Traceroute port range.
     * Field introduced in 17.2.8.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seTracertPortRange
     */
    public PortRange getSeTracertPortRange() {
        return seTracertPortRange;
    }

    /**
     * This is the setter method to the attribute.
     * Traceroute port range.
     * Field introduced in 17.2.8.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seTracertPortRange set the seTracertPortRange.
     */
    public void setSeTracertPortRange(PortRange seTracertPortRange) {
        this.seTracertPortRange = seTracertPortRange;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Determines if direct secondary return (dsr) from secondary se is active or not  0  automatically determine based on hypervisor type.
     * 1  enable tunnel mode - dsr is unconditionally disabled.
     * 2  disable tunnel mode - dsr is unconditionally enabled.
     * Tunnel mode can be enabled or disabled at run-time.
     * Allowed values are 0-2.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seTunnelMode
     */
    public Integer getSeTunnelMode() {
        return seTunnelMode;
    }

    /**
     * This is the setter method to the attribute.
     * Determines if direct secondary return (dsr) from secondary se is active or not  0  automatically determine based on hypervisor type.
     * 1  enable tunnel mode - dsr is unconditionally disabled.
     * 2  disable tunnel mode - dsr is unconditionally enabled.
     * Tunnel mode can be enabled or disabled at run-time.
     * Allowed values are 0-2.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 0), basic edition(allowed values- 0), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seTunnelMode set the seTunnelMode.
     */
    public void setSeTunnelMode(Integer  seTunnelMode) {
        this.seTunnelMode = seTunnelMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Udp port for tunneled packets from secondary to primary se in docker bridge mode.requires se reboot.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1550.
     * @return seTunnelUdpPort
     */
    public Integer getSeTunnelUdpPort() {
        return seTunnelUdpPort;
    }

    /**
     * This is the setter method to the attribute.
     * Udp port for tunneled packets from secondary to primary se in docker bridge mode.requires se reboot.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1550.
     * @param seTunnelUdpPort set the seTunnelUdpPort.
     */
    public void setSeTunnelUdpPort(Integer  seTunnelUdpPort) {
        this.seTunnelUdpPort = seTunnelUdpPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of packets to batch for transmit to the nic.
     * Requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @return seTxBatchSize
     */
    public Integer getSeTxBatchSize() {
        return seTxBatchSize;
    }

    /**
     * This is the setter method to the attribute.
     * Number of packets to batch for transmit to the nic.
     * Requires se reboot.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @param seTxBatchSize set the seTxBatchSize.
     */
    public void setSeTxBatchSize(Integer  seTxBatchSize) {
        this.seTxBatchSize = seTxBatchSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Once the tx queue of the dispatcher reaches this threshold, hardware queues are not polled for further packets.
     * To be used under surveillance of avi support.
     * Allowed values are 512-32768.
     * Field introduced in 20.1.2.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 2048), basic edition(allowed values- 2048), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
     * @return seTxqThreshold
     */
    public Integer getSeTxqThreshold() {
        return seTxqThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Once the tx queue of the dispatcher reaches this threshold, hardware queues are not polled for further packets.
     * To be used under surveillance of avi support.
     * Allowed values are 512-32768.
     * Field introduced in 20.1.2.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 2048), basic edition(allowed values- 2048), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 2048.
     * @param seTxqThreshold set the seTxqThreshold.
     */
    public void setSeTxqThreshold(Integer  seTxqThreshold) {
        this.seTxqThreshold = seTxqThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Determines if se-se ipc messages are encapsulated in a udp header  0  automatically determine based on hypervisor type.
     * 1  use udp encap unconditionally.requires se reboot.
     * Allowed values are 0-1.
     * Field introduced in 17.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seUdpEncapIpc
     */
    public Integer getSeUdpEncapIpc() {
        return seUdpEncapIpc;
    }

    /**
     * This is the setter method to the attribute.
     * Determines if se-se ipc messages are encapsulated in a udp header  0  automatically determine based on hypervisor type.
     * 1  use udp encap unconditionally.requires se reboot.
     * Allowed values are 0-1.
     * Field introduced in 17.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seUdpEncapIpc set the seUdpEncapIpc.
     */
    public void setSeUdpEncapIpc(Integer  seUdpEncapIpc) {
        this.seUdpEncapIpc = seUdpEncapIpc;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Determines if dpdk library should be used or not   0  automatically determine based on hypervisor type 1  use dpdk if pcap is not enabled 2
     * don't use dpdk.
     * Allowed values are 0-2.
     * Field introduced in 18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seUseDpdk
     */
    public Integer getSeUseDpdk() {
        return seUseDpdk;
    }

    /**
     * This is the setter method to the attribute.
     * Determines if dpdk library should be used or not   0  automatically determine based on hypervisor type 1  use dpdk if pcap is not enabled 2
     * don't use dpdk.
     * Allowed values are 0-2.
     * Field introduced in 18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seUseDpdk set the seUseDpdk.
     */
    public void setSeUseDpdk(Integer  seUseDpdk) {
        this.seUseDpdk = seUseDpdk;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure the frequency in milliseconds of software transmit spillover queue flush when enabled.
     * This is necessary to flush any packets in the spillover queue in the absence of a packet transmit in the normal course of operation.
     * Allowed values are 50-500.
     * Special values are 0- disable.
     * Field introduced in 20.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seVnicTxSwQueueFlushFrequency
     */
    public Integer getSeVnicTxSwQueueFlushFrequency() {
        return seVnicTxSwQueueFlushFrequency;
    }

    /**
     * This is the setter method to the attribute.
     * Configure the frequency in milliseconds of software transmit spillover queue flush when enabled.
     * This is necessary to flush any packets in the spillover queue in the absence of a packet transmit in the normal course of operation.
     * Allowed values are 50-500.
     * Special values are 0- disable.
     * Field introduced in 20.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seVnicTxSwQueueFlushFrequency set the seVnicTxSwQueueFlushFrequency.
     */
    public void setSeVnicTxSwQueueFlushFrequency(Integer  seVnicTxSwQueueFlushFrequency) {
        this.seVnicTxSwQueueFlushFrequency = seVnicTxSwQueueFlushFrequency;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure the size of software transmit spillover queue when enabled.
     * Requires se reboot.
     * Allowed values are 128-2048.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 256.
     * @return seVnicTxSwQueueSize
     */
    public Integer getSeVnicTxSwQueueSize() {
        return seVnicTxSwQueueSize;
    }

    /**
     * This is the setter method to the attribute.
     * Configure the size of software transmit spillover queue when enabled.
     * Requires se reboot.
     * Allowed values are 128-2048.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 256.
     * @param seVnicTxSwQueueSize set the seVnicTxSwQueueSize.
     */
    public void setSeVnicTxSwQueueSize(Integer  seVnicTxSwQueueSize) {
        this.seVnicTxSwQueueSize = seVnicTxSwQueueSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of aggregated vs heartbeat packets to send in a batch.
     * Allowed values are 1-256.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @return seVsHbMaxPktsInBatch
     */
    public Integer getSeVsHbMaxPktsInBatch() {
        return seVsHbMaxPktsInBatch;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of aggregated vs heartbeat packets to send in a batch.
     * Allowed values are 1-256.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @param seVsHbMaxPktsInBatch set the seVsHbMaxPktsInBatch.
     */
    public void setSeVsHbMaxPktsInBatch(Integer  seVsHbMaxPktsInBatch) {
        this.seVsHbMaxPktsInBatch = seVsHbMaxPktsInBatch;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of virtualservices for which heartbeat messages are aggregated in one packet.
     * Allowed values are 1-1024.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 256.
     * @return seVsHbMaxVsInPkt
     */
    public Integer getSeVsHbMaxVsInPkt() {
        return seVsHbMaxVsInPkt;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of virtualservices for which heartbeat messages are aggregated in one packet.
     * Allowed values are 1-1024.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 256.
     * @param seVsHbMaxVsInPkt set the seVsHbMaxVsInPkt.
     */
    public void setSeVsHbMaxVsInPkt(Integer  seVsHbMaxVsInPkt) {
        this.seVsHbMaxVsInPkt = seVsHbMaxVsInPkt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable ses to elect a primary amongst themselves in the absence of a connectivity to controller.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return selfSeElection
     */
    public Boolean getSelfSeElection() {
        return selfSeElection;
    }

    /**
     * This is the setter method to the attribute.
     * Enable ses to elect a primary amongst themselves in the absence of a connectivity to controller.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param selfSeElection set the selfSeElection.
     */
    public void setSelfSeElection(Boolean  selfSeElection) {
        this.selfSeElection = selfSeElection;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for sending se_ready without ns helper registration completion.
     * Allowed values are 10-600.
     * Field introduced in 21.1.1.
     * Unit is seconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @return sendSeReadyTimeout
     */
    public Integer getSendSeReadyTimeout() {
        return sendSeReadyTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout for sending se_ready without ns helper registration completion.
     * Allowed values are 10-600.
     * Field introduced in 21.1.1.
     * Unit is seconds.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @param sendSeReadyTimeout set the sendSeReadyTimeout.
     */
    public void setSendSeReadyTimeout(Integer  sendSeReadyTimeout) {
        this.sendSeReadyTimeout = sendSeReadyTimeout;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 subnets assigned to the se group.
     * Required for vs group placement.
     * Field introduced in 18.1.1.
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceIp6Subnets
     */
    public List<IpAddrPrefix> getServiceIp6Subnets() {
        return serviceIp6Subnets;
    }

    /**
     * This is the setter method. this will set the serviceIp6Subnets
     * Ipv6 subnets assigned to the se group.
     * Required for vs group placement.
     * Field introduced in 18.1.1.
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceIp6Subnets
     */
    public void setServiceIp6Subnets(List<IpAddrPrefix>  serviceIp6Subnets) {
        this.serviceIp6Subnets = serviceIp6Subnets;
    }

    /**
     * This is the setter method this will set the serviceIp6Subnets
     * Ipv6 subnets assigned to the se group.
     * Required for vs group placement.
     * Field introduced in 18.1.1.
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceIp6Subnets
     */
    public ServiceEngineGroup addServiceIp6SubnetsItem(IpAddrPrefix serviceIp6SubnetsItem) {
      if (this.serviceIp6Subnets == null) {
        this.serviceIp6Subnets = new ArrayList<IpAddrPrefix>();
      }
      this.serviceIp6Subnets.add(serviceIp6SubnetsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Subnets assigned to the se group.
     * Required for vs group placement.
     * Field introduced in 17.1.1.
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
     * Subnets assigned to the se group.
     * Required for vs group placement.
     * Field introduced in 17.1.1.
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
     * Subnets assigned to the se group.
     * Required for vs group placement.
     * Field introduced in 17.1.1.
     * Maximum of 128 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceIpSubnets
     */
    public ServiceEngineGroup addServiceIpSubnetsItem(IpAddrPrefix serviceIpSubnetsItem) {
      if (this.serviceIpSubnets == null) {
        this.serviceIpSubnets = new ArrayList<IpAddrPrefix>();
      }
      this.serviceIpSubnets.add(serviceIpSubnetsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum required shared memory to apply any configuration.
     * Allowed values are 0-100.
     * Field introduced in 18.1.2.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return shmMinimumConfigMemory
     */
    public Integer getShmMinimumConfigMemory() {
        return shmMinimumConfigMemory;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum required shared memory to apply any configuration.
     * Allowed values are 0-100.
     * Field introduced in 18.1.2.
     * Unit is mb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param shmMinimumConfigMemory set the shmMinimumConfigMemory.
     */
    public void setShmMinimumConfigMemory(Integer  shmMinimumConfigMemory) {
        this.shmMinimumConfigMemory = shmMinimumConfigMemory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This setting limits the number of significant logs generated per second per core on this se.
     * Default is 100 logs per second.
     * Set it to zero (0) to deactivate throttling.
     * Field introduced in 17.1.3.
     * Unit is per_second.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return significantLogThrottle
     */
    public Integer getSignificantLogThrottle() {
        return significantLogThrottle;
    }

    /**
     * This is the setter method to the attribute.
     * This setting limits the number of significant logs generated per second per core on this se.
     * Default is 100 logs per second.
     * Set it to zero (0) to deactivate throttling.
     * Field introduced in 17.1.3.
     * Unit is per_second.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param significantLogThrottle set the significantLogThrottle.
     */
    public void setSignificantLogThrottle(Integer  significantLogThrottle) {
        this.significantLogThrottle = significantLogThrottle;
    }

    /**
     * This is the getter method this will return the attribute value.
     * (beta) preprocess ssl client hello for sni hostname extension.if set to true, this will apply sni child's ssl protocol(s), if they are different
     * from sni parent's allowed ssl protocol(s).
     * Field introduced in 17.2.12, 18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return sslPreprocessSniHostname
     */
    public Boolean getSslPreprocessSniHostname() {
        return sslPreprocessSniHostname;
    }

    /**
     * This is the setter method to the attribute.
     * (beta) preprocess ssl client hello for sni hostname extension.if set to true, this will apply sni child's ssl protocol(s), if they are different
     * from sni parent's allowed ssl protocol(s).
     * Field introduced in 17.2.12, 18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param sslPreprocessSniHostname set the sslPreprocessSniHostname.
     */
    public void setSslPreprocessSniHostname(Boolean  sslPreprocessSniHostname) {
        this.sslPreprocessSniHostname = sslPreprocessSniHostname;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of ssl sessions that can be cached per vs.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
     * @return sslSessCachePerVs
     */
    public Integer getSslSessCachePerVs() {
        return sslSessCachePerVs;
    }

    /**
     * This is the setter method to the attribute.
     * Number of ssl sessions that can be cached per vs.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
     * @param sslSessCachePerVs set the sslSessCachePerVs.
     */
    public void setSslSessCachePerVs(Integer  sslSessCachePerVs) {
        this.sslSessCachePerVs = sslSessCachePerVs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The threshold for the transient shared config memory in the se.
     * Allowed values are 0-100.
     * Field introduced in 20.1.1.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return transientSharedMemoryMax
     */
    public Integer getTransientSharedMemoryMax() {
        return transientSharedMemoryMax;
    }

    /**
     * This is the setter method to the attribute.
     * The threshold for the transient shared config memory in the se.
     * Allowed values are 0-100.
     * Field introduced in 20.1.1.
     * Unit is percent.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param transientSharedMemoryMax set the transientSharedMemoryMax.
     */
    public void setTransientSharedMemoryMax(Integer  transientSharedMemoryMax) {
        this.transientSharedMemoryMax = transientSharedMemoryMax;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This setting limits the number of udf logs generated per second per core on this se.
     * Udf logs are generated due to the configured client log filters or the rules with logging enabled.
     * Default is 100 logs per second.
     * Set it to zero (0) to deactivate throttling.
     * Field introduced in 17.1.3.
     * Unit is per_second.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @return udfLogThrottle
     */
    public Integer getUdfLogThrottle() {
        return udfLogThrottle;
    }

    /**
     * This is the setter method to the attribute.
     * This setting limits the number of udf logs generated per second per core on this se.
     * Udf logs are generated due to the configured client log filters or the rules with logging enabled.
     * Default is 100 logs per second.
     * Set it to zero (0) to deactivate throttling.
     * Field introduced in 17.1.3.
     * Unit is per_second.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 100.
     * @param udfLogThrottle set the udfLogThrottle.
     */
    public void setUdfLogThrottle(Integer  udfLogThrottle) {
        this.udfLogThrottle = udfLogThrottle;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for backend connection.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @return upstreamConnectTimeout
     */
    public Integer getUpstreamConnectTimeout() {
        return upstreamConnectTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout for backend connection.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @param upstreamConnectTimeout set the upstreamConnectTimeout.
     */
    public void setUpstreamConnectTimeout(Integer  upstreamConnectTimeout) {
        this.upstreamConnectTimeout = upstreamConnectTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable upstream connection pool,.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return upstreamConnpoolEnable
     */
    public Boolean getUpstreamConnpoolEnable() {
        return upstreamConnpoolEnable;
    }

    /**
     * This is the setter method to the attribute.
     * Enable upstream connection pool,.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param upstreamConnpoolEnable set the upstreamConnpoolEnable.
     */
    public void setUpstreamConnpoolEnable(Boolean  upstreamConnpoolEnable) {
        this.upstreamConnpoolEnable = upstreamConnpoolEnable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for data to be received from backend.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @return upstreamReadTimeout
     */
    public Integer getUpstreamReadTimeout() {
        return upstreamReadTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout for data to be received from backend.
     * Field introduced in 21.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3600000.
     * @param upstreamReadTimeout set the upstreamReadTimeout.
     */
    public void setUpstreamReadTimeout(Integer  upstreamReadTimeout) {
        this.upstreamReadTimeout = upstreamReadTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout for upstream to become writable.
     * Field introduced in 21.1.1.
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
     * Field introduced in 21.1.1.
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
     * If enabled, the datapath cpu utilization is consulted by the auto scale-out logic.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return useDpUtilForScaleout
     */
    public Boolean getUseDpUtilForScaleout() {
        return useDpUtilForScaleout;
    }

    /**
     * This is the setter method to the attribute.
     * If enabled, the datapath cpu utilization is consulted by the auto scale-out logic.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param useDpUtilForScaleout set the useDpUtilForScaleout.
     */
    public void setUseDpUtilForScaleout(Boolean  useDpUtilForScaleout) {
        this.useDpUtilForScaleout = useDpUtilForScaleout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enables the use of hyper-threaded cores on se.
     * Requires se reboot.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useHyperthreadedCores
     */
    public Boolean getUseHyperthreadedCores() {
        return useHyperthreadedCores;
    }

    /**
     * This is the setter method to the attribute.
     * Enables the use of hyper-threaded cores on se.
     * Requires se reboot.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useHyperthreadedCores set the useHyperthreadedCores.
     */
    public void setUseHyperthreadedCores(Boolean  useHyperthreadedCores) {
        this.useHyperthreadedCores = useHyperthreadedCores;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable legacy model of netlink notifications.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return useLegacyNetlink
     */
    public Boolean getUseLegacyNetlink() {
        return useLegacyNetlink;
    }

    /**
     * This is the setter method to the attribute.
     * Enable legacy model of netlink notifications.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param useLegacyNetlink set the useLegacyNetlink.
     */
    public void setUseLegacyNetlink(Boolean  useLegacyNetlink) {
        this.useLegacyNetlink = useLegacyNetlink;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable interse objsyc distribution framework.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return useObjsync
     */
    public Boolean getUseObjsync() {
        return useObjsync;
    }

    /**
     * This is the setter method to the attribute.
     * Enable interse objsyc distribution framework.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param useObjsync set the useObjsync.
     */
    public void setUseObjsync(Boolean  useObjsync) {
        this.useObjsync = useObjsync;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Use standard sku azure load balancer.
     * By default cloud level flag is set.
     * If not set, it inherits/uses the use_standard_alb flag from the cloud.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return useStandardAlb
     */
    public Boolean getUseStandardAlb() {
        return useStandardAlb;
    }

    /**
     * This is the setter method to the attribute.
     * Use standard sku azure load balancer.
     * By default cloud level flag is set.
     * If not set, it inherits/uses the use_standard_alb flag from the cloud.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param useStandardAlb set the useStandardAlb.
     */
    public void setUseStandardAlb(Boolean  useStandardAlb) {
        this.useStandardAlb = useStandardAlb;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configuration for user-agent cache used in bot management.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userAgentCacheConfig
     */
    public UserAgentCacheConfig getUserAgentCacheConfig() {
        return userAgentCacheConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Configuration for user-agent cache used in bot management.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userAgentCacheConfig set the userAgentCacheConfig.
     */
    public void setUserAgentCacheConfig(UserAgentCacheConfig userAgentCacheConfig) {
        this.userAgentCacheConfig = userAgentCacheConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Defines in seconds how long before an unused user-defined-metric is garbage collected.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return userDefinedMetricAge
     */
    public Integer getUserDefinedMetricAge() {
        return userDefinedMetricAge;
    }

    /**
     * This is the setter method to the attribute.
     * Defines in seconds how long before an unused user-defined-metric is garbage collected.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param userDefinedMetricAge set the userDefinedMetricAge.
     */
    public void setUserDefinedMetricAge(Integer  userDefinedMetricAge) {
        this.userDefinedMetricAge = userDefinedMetricAge;
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

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterClusters
     */
    public VcenterClusters getVcenterClusters() {
        return vcenterClusters;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterClusters set the vcenterClusters.
     */
    public void setVcenterClusters(VcenterClusters vcenterClusters) {
        this.vcenterClusters = vcenterClusters;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - VCENTER_DATASTORE_ANY, VCENTER_DATASTORE_LOCAL, VCENTER_DATASTORE_SHARED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "VCENTER_DATASTORE_ANY".
     * @return vcenterDatastoreMode
     */
    public String getVcenterDatastoreMode() {
        return vcenterDatastoreMode;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - VCENTER_DATASTORE_ANY, VCENTER_DATASTORE_LOCAL, VCENTER_DATASTORE_SHARED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "VCENTER_DATASTORE_ANY".
     * @param vcenterDatastoreMode set the vcenterDatastoreMode.
     */
    public void setVcenterDatastoreMode(String  vcenterDatastoreMode) {
        this.vcenterDatastoreMode = vcenterDatastoreMode;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterDatastores
     */
    public List<VcenterDatastore> getVcenterDatastores() {
        return vcenterDatastores;
    }

    /**
     * This is the setter method. this will set the vcenterDatastores
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterDatastores
     */
    public void setVcenterDatastores(List<VcenterDatastore>  vcenterDatastores) {
        this.vcenterDatastores = vcenterDatastores;
    }

    /**
     * This is the setter method this will set the vcenterDatastores
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterDatastores
     */
    public ServiceEngineGroup addVcenterDatastoresItem(VcenterDatastore vcenterDatastoresItem) {
      if (this.vcenterDatastores == null) {
        this.vcenterDatastores = new ArrayList<VcenterDatastore>();
      }
      this.vcenterDatastores.add(vcenterDatastoresItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return vcenterDatastoresInclude
     */
    public Boolean getVcenterDatastoresInclude() {
        return vcenterDatastoresInclude;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param vcenterDatastoresInclude set the vcenterDatastoresInclude.
     */
    public void setVcenterDatastoresInclude(Boolean  vcenterDatastoresInclude) {
        this.vcenterDatastoresInclude = vcenterDatastoresInclude;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Folder to place all the service engine virtual machines in vcenter.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "AviSeFolder".
     * @return vcenterFolder
     */
    public String getVcenterFolder() {
        return vcenterFolder;
    }

    /**
     * This is the setter method to the attribute.
     * Folder to place all the service engine virtual machines in vcenter.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "AviSeFolder".
     * @param vcenterFolder set the vcenterFolder.
     */
    public void setVcenterFolder(String  vcenterFolder) {
        this.vcenterFolder = vcenterFolder;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterHosts
     */
    public VcenterHosts getVcenterHosts() {
        return vcenterHosts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterHosts set the vcenterHosts.
     */
    public void setVcenterHosts(VcenterHosts vcenterHosts) {
        this.vcenterHosts = vcenterHosts;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Parking port group to be used by 9 vnics at the time of se creation.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterParkingVnicPg
     */
    public String getVcenterParkingVnicPg() {
        return vcenterParkingVnicPg;
    }

    /**
     * This is the setter method to the attribute.
     * Parking port group to be used by 9 vnics at the time of se creation.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterParkingVnicPg set the vcenterParkingVnicPg.
     */
    public void setVcenterParkingVnicPg(String  vcenterParkingVnicPg) {
        this.vcenterParkingVnicPg = vcenterParkingVnicPg;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Vcenter information for scoping at host/cluster level.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenters
     */
    public List<PlacementScopeConfig> getVcenters() {
        return vcenters;
    }

    /**
     * This is the setter method. this will set the vcenters
     * Vcenter information for scoping at host/cluster level.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenters
     */
    public void setVcenters(List<PlacementScopeConfig>  vcenters) {
        this.vcenters = vcenters;
    }

    /**
     * This is the setter method this will set the vcenters
     * Vcenter information for scoping at host/cluster level.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenters
     */
    public ServiceEngineGroup addVcentersItem(PlacementScopeConfig vcentersItem) {
      if (this.vcenters == null) {
        this.vcenters = new ArrayList<PlacementScopeConfig>();
      }
      this.vcenters.add(vcentersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of vcpus for each of the service engine virtual machines.
     * Changes to this setting do not affect existing ses.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return vcpusPerSe
     */
    public Integer getVcpusPerSe() {
        return vcpusPerSe;
    }

    /**
     * This is the setter method to the attribute.
     * Number of vcpus for each of the service engine virtual machines.
     * Changes to this setting do not affect existing ses.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param vcpusPerSe set the vcpusPerSe.
     */
    public void setVcpusPerSe(Integer  vcpusPerSe) {
        this.vcpusPerSe = vcpusPerSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When vip_asg is set, vip configuration will be managed by avi.user will be able to configure vip_asg or vips individually at the time of create.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipAsg
     */
    public VipAutoscaleGroup getVipAsg() {
        return vipAsg;
    }

    /**
     * This is the setter method to the attribute.
     * When vip_asg is set, vip configuration will be managed by avi.user will be able to configure vip_asg or vips individually at the time of create.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipAsg set the vipAsg.
     */
    public void setVipAsg(VipAutoscaleGroup vipAsg) {
        this.vipAsg = vipAsg;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dhcp ip check interval.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 6.
     * @return vnicDhcpIpCheckInterval
     */
    public Integer getVnicDhcpIpCheckInterval() {
        return vnicDhcpIpCheckInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Dhcp ip check interval.
     * Allowed values are 1-1000.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 6.
     * @param vnicDhcpIpCheckInterval set the vnicDhcpIpCheckInterval.
     */
    public void setVnicDhcpIpCheckInterval(Integer  vnicDhcpIpCheckInterval) {
        this.vnicDhcpIpCheckInterval = vnicDhcpIpCheckInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dhcp ip max retries.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return vnicDhcpIpMaxRetries
     */
    public Integer getVnicDhcpIpMaxRetries() {
        return vnicDhcpIpMaxRetries;
    }

    /**
     * This is the setter method to the attribute.
     * Dhcp ip max retries.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param vnicDhcpIpMaxRetries set the vnicDhcpIpMaxRetries.
     */
    public void setVnicDhcpIpMaxRetries(Integer  vnicDhcpIpMaxRetries) {
        this.vnicDhcpIpMaxRetries = vnicDhcpIpMaxRetries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Wait interval before deleting ip.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return vnicIpDeleteInterval
     */
    public Integer getVnicIpDeleteInterval() {
        return vnicIpDeleteInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Wait interval before deleting ip.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param vnicIpDeleteInterval set the vnicIpDeleteInterval.
     */
    public void setVnicIpDeleteInterval(Integer  vnicIpDeleteInterval) {
        this.vnicIpDeleteInterval = vnicIpDeleteInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Probe vnic interval.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return vnicProbeInterval
     */
    public Integer getVnicProbeInterval() {
        return vnicProbeInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Probe vnic interval.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param vnicProbeInterval set the vnicProbeInterval.
     */
    public void setVnicProbeInterval(Integer  vnicProbeInterval) {
        this.vnicProbeInterval = vnicProbeInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time interval for retrying the failed vnic rpc requests.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return vnicRpcRetryInterval
     */
    public Integer getVnicRpcRetryInterval() {
        return vnicRpcRetryInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Time interval for retrying the failed vnic rpc requests.
     * Field introduced in 21.1.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param vnicRpcRetryInterval set the vnicRpcRetryInterval.
     */
    public void setVnicRpcRetryInterval(Integer  vnicRpcRetryInterval) {
        this.vnicRpcRetryInterval = vnicRpcRetryInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Size of vnicdb command history.
     * Allowed values are 0-65535.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 256.
     * @return vnicdbCmdHistorySize
     */
    public Integer getVnicdbCmdHistorySize() {
        return vnicdbCmdHistorySize;
    }

    /**
     * This is the setter method to the attribute.
     * Size of vnicdb command history.
     * Allowed values are 0-65535.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 256.
     * @param vnicdbCmdHistorySize set the vnicdbCmdHistorySize.
     */
    public void setVnicdbCmdHistorySize(Integer  vnicdbCmdHistorySize) {
        this.vnicdbCmdHistorySize = vnicdbCmdHistorySize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ensure primary and secondary service engines are deployed on different physical hosts.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
     * cloud services edition.
     * Special default for essentials edition is true, basic edition is true, enterprise is true.
     * @return vsHostRedundancy
     */
    public Boolean getVsHostRedundancy() {
        return vsHostRedundancy;
    }

    /**
     * This is the setter method to the attribute.
     * Ensure primary and secondary service engines are deployed on different physical hosts.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
     * cloud services edition.
     * Special default for essentials edition is true, basic edition is true, enterprise is true.
     * @param vsHostRedundancy set the vsHostRedundancy.
     */
    public void setVsHostRedundancy(Boolean  vsHostRedundancy) {
        this.vsHostRedundancy = vsHostRedundancy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time to wait for the scaled in se to drain existing flows before marking the scalein done.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return vsScaleinTimeout
     */
    public Integer getVsScaleinTimeout() {
        return vsScaleinTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Time to wait for the scaled in se to drain existing flows before marking the scalein done.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param vsScaleinTimeout set the vsScaleinTimeout.
     */
    public void setVsScaleinTimeout(Integer  vsScaleinTimeout) {
        this.vsScaleinTimeout = vsScaleinTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * During se upgrade, time to wait for the scaled-in se to drain existing flows before marking the scalein done.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return vsScaleinTimeoutForUpgrade
     */
    public Integer getVsScaleinTimeoutForUpgrade() {
        return vsScaleinTimeoutForUpgrade;
    }

    /**
     * This is the setter method to the attribute.
     * During se upgrade, time to wait for the scaled-in se to drain existing flows before marking the scalein done.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param vsScaleinTimeoutForUpgrade set the vsScaleinTimeoutForUpgrade.
     */
    public void setVsScaleinTimeoutForUpgrade(Integer  vsScaleinTimeoutForUpgrade) {
        this.vsScaleinTimeoutForUpgrade = vsScaleinTimeoutForUpgrade;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time to wait for the scaled out se to become ready before marking the scaleout done.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 600.
     * @return vsScaleoutTimeout
     */
    public Integer getVsScaleoutTimeout() {
        return vsScaleoutTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Time to wait for the scaled out se to become ready before marking the scaleout done.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 600.
     * @param vsScaleoutTimeout set the vsScaleoutTimeout.
     */
    public void setVsScaleoutTimeout(Integer  vsScaleoutTimeout) {
        this.vsScaleoutTimeout = vsScaleoutTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Wait time for primary switchover ready notification after flows are completed.
     * In certain deployments, there may be an additional delay to accept traffic.
     * For example, for bgp, some time is needed for route advertisement.
     * Allowed values are 0-300.
     * Field introduced in 30.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return vsSePrimarySwitchoverAdditionalWaitTime
     */
    public Integer getVsSePrimarySwitchoverAdditionalWaitTime() {
        return vsSePrimarySwitchoverAdditionalWaitTime;
    }

    /**
     * This is the setter method to the attribute.
     * Wait time for primary switchover ready notification after flows are completed.
     * In certain deployments, there may be an additional delay to accept traffic.
     * For example, for bgp, some time is needed for route advertisement.
     * Allowed values are 0-300.
     * Field introduced in 30.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param vsSePrimarySwitchoverAdditionalWaitTime set the vsSePrimarySwitchoverAdditionalWaitTime.
     */
    public void setVsSePrimarySwitchoverAdditionalWaitTime(Integer  vsSePrimarySwitchoverAdditionalWaitTime) {
        this.vsSePrimarySwitchoverAdditionalWaitTime = vsSePrimarySwitchoverAdditionalWaitTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Wait time for sending scalein ready notification after flows are completed.
     * In certain deployments, there may be an additional delay to accept traffic.
     * For example, for bgp, some time is needed for route advertisement.
     * Allowed values are 0-300.
     * Field introduced in 30.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return vsSeScaleinAdditionalWaitTime
     */
    public Integer getVsSeScaleinAdditionalWaitTime() {
        return vsSeScaleinAdditionalWaitTime;
    }

    /**
     * This is the setter method to the attribute.
     * Wait time for sending scalein ready notification after flows are completed.
     * In certain deployments, there may be an additional delay to accept traffic.
     * For example, for bgp, some time is needed for route advertisement.
     * Allowed values are 0-300.
     * Field introduced in 30.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param vsSeScaleinAdditionalWaitTime set the vsSeScaleinAdditionalWaitTime.
     */
    public void setVsSeScaleinAdditionalWaitTime(Integer  vsSeScaleinAdditionalWaitTime) {
        this.vsSeScaleinAdditionalWaitTime = vsSeScaleinAdditionalWaitTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Wait time for sending scaleout ready notification after virtual service is marked up.
     * In certain deployments, there may be an additional delay to accept traffic.
     * For example, for bgp, some time is needed for route advertisement.
     * Allowed values are 0-300.
     * Field introduced in 18.1.5,18.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return vsSeScaleoutAdditionalWaitTime
     */
    public Integer getVsSeScaleoutAdditionalWaitTime() {
        return vsSeScaleoutAdditionalWaitTime;
    }

    /**
     * This is the setter method to the attribute.
     * Wait time for sending scaleout ready notification after virtual service is marked up.
     * In certain deployments, there may be an additional delay to accept traffic.
     * For example, for bgp, some time is needed for route advertisement.
     * Allowed values are 0-300.
     * Field introduced in 18.1.5,18.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param vsSeScaleoutAdditionalWaitTime set the vsSeScaleoutAdditionalWaitTime.
     */
    public void setVsSeScaleoutAdditionalWaitTime(Integer  vsSeScaleoutAdditionalWaitTime) {
        this.vsSeScaleoutAdditionalWaitTime = vsSeScaleoutAdditionalWaitTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timeout in seconds for service engine to sendscaleout ready notification of a virtual service.
     * Allowed values are 0-90.
     * Field introduced in 18.1.5,18.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return vsSeScaleoutReadyTimeout
     */
    public Integer getVsSeScaleoutReadyTimeout() {
        return vsSeScaleoutReadyTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Timeout in seconds for service engine to sendscaleout ready notification of a virtual service.
     * Allowed values are 0-90.
     * Field introduced in 18.1.5,18.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param vsSeScaleoutReadyTimeout set the vsSeScaleoutReadyTimeout.
     */
    public void setVsSeScaleoutReadyTimeout(Integer  vsSeScaleoutReadyTimeout) {
        this.vsSeScaleoutReadyTimeout = vsSeScaleoutReadyTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * During se upgrade in a legacy active/standby segroup, time to wait for the new primary se to accept flows before marking the switchover done.
     * Field introduced in 17.2.13,18.1.4,18.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @return vsSwitchoverTimeout
     */
    public Integer getVsSwitchoverTimeout() {
        return vsSwitchoverTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * During se upgrade in a legacy active/standby segroup, time to wait for the new primary se to accept flows before marking the switchover done.
     * Field introduced in 17.2.13,18.1.4,18.2.1.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @param vsSwitchoverTimeout set the vsSwitchoverTimeout.
     */
    public void setVsSwitchoverTimeout(Integer  vsSwitchoverTimeout) {
        this.vsSwitchoverTimeout = vsSwitchoverTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Parameters to place virtual services on only a subset of the cores of an se.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vssPlacement
     */
    public VssPlacement getVssPlacement() {
        return vssPlacement;
    }

    /**
     * This is the setter method to the attribute.
     * Parameters to place virtual services on only a subset of the cores of an se.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vssPlacement set the vssPlacement.
     */
    public void setVssPlacement(VssPlacement vssPlacement) {
        this.vssPlacement = vssPlacement;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If set, virtual services will be placed on only a subset of the cores of an se.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return vssPlacementEnabled
     */
    public Boolean getVssPlacementEnabled() {
        return vssPlacementEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * If set, virtual services will be placed on only a subset of the cores of an se.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param vssPlacementEnabled set the vssPlacementEnabled.
     */
    public void setVssPlacementEnabled(Boolean  vssPlacementEnabled) {
        this.vssPlacementEnabled = vssPlacementEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable memory pool for waf.requires se reboot.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return wafMempool
     */
    public Boolean getWafMempool() {
        return wafMempool;
    }

    /**
     * This is the setter method to the attribute.
     * Enable memory pool for waf.requires se reboot.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param wafMempool set the wafMempool.
     */
    public void setWafMempool(Boolean  wafMempool) {
        this.wafMempool = wafMempool;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Memory pool size used for waf.requires se reboot.
     * Field introduced in 17.2.3.
     * Unit is kb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @return wafMempoolSize
     */
    public Integer getWafMempoolSize() {
        return wafMempoolSize;
    }

    /**
     * This is the setter method to the attribute.
     * Memory pool size used for waf.requires se reboot.
     * Field introduced in 17.2.3.
     * Unit is kb.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 64.
     * @param wafMempoolSize set the wafMempoolSize.
     */
    public void setWafMempoolSize(Integer  wafMempoolSize) {
        this.wafMempoolSize = wafMempoolSize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ServiceEngineGroup objServiceEngineGroup = (ServiceEngineGroup) o;
      return   Objects.equals(this.uuid, objServiceEngineGroup.uuid)&&
  Objects.equals(this.name, objServiceEngineGroup.name)&&
  Objects.equals(this.description, objServiceEngineGroup.description)&&
  Objects.equals(this.tenantRef, objServiceEngineGroup.tenantRef)&&
  Objects.equals(this.maxVsPerSe, objServiceEngineGroup.maxVsPerSe)&&
  Objects.equals(this.minScaleoutPerVs, objServiceEngineGroup.minScaleoutPerVs)&&
  Objects.equals(this.maxScaleoutPerVs, objServiceEngineGroup.maxScaleoutPerVs)&&
  Objects.equals(this.maxSe, objServiceEngineGroup.maxSe)&&
  Objects.equals(this.vcpusPerSe, objServiceEngineGroup.vcpusPerSe)&&
  Objects.equals(this.memoryPerSe, objServiceEngineGroup.memoryPerSe)&&
  Objects.equals(this.diskPerSe, objServiceEngineGroup.diskPerSe)&&
  Objects.equals(this.maxCpuUsage, objServiceEngineGroup.maxCpuUsage)&&
  Objects.equals(this.minCpuUsage, objServiceEngineGroup.minCpuUsage)&&
  Objects.equals(this.seDeprovisionDelay, objServiceEngineGroup.seDeprovisionDelay)&&
  Objects.equals(this.autoRebalance, objServiceEngineGroup.autoRebalance)&&
  Objects.equals(this.seNamePrefix, objServiceEngineGroup.seNamePrefix)&&
  Objects.equals(this.vsHostRedundancy, objServiceEngineGroup.vsHostRedundancy)&&
  Objects.equals(this.vcenterFolder, objServiceEngineGroup.vcenterFolder)&&
  Objects.equals(this.vcenterDatastores, objServiceEngineGroup.vcenterDatastores)&&
  Objects.equals(this.vcenterDatastoresInclude, objServiceEngineGroup.vcenterDatastoresInclude)&&
  Objects.equals(this.vcenterDatastoreMode, objServiceEngineGroup.vcenterDatastoreMode)&&
  Objects.equals(this.vcenterClusters, objServiceEngineGroup.vcenterClusters)&&
  Objects.equals(this.vcenterHosts, objServiceEngineGroup.vcenterHosts)&&
  Objects.equals(this.cpuReserve, objServiceEngineGroup.cpuReserve)&&
  Objects.equals(this.memReserve, objServiceEngineGroup.memReserve)&&
  Objects.equals(this.mgmtNetworkRef, objServiceEngineGroup.mgmtNetworkRef)&&
  Objects.equals(this.mgmtSubnet, objServiceEngineGroup.mgmtSubnet)&&
  Objects.equals(this.haMode, objServiceEngineGroup.haMode)&&
  Objects.equals(this.algo, objServiceEngineGroup.algo)&&
  Objects.equals(this.bufferSe, objServiceEngineGroup.bufferSe)&&
  Objects.equals(this.activeStandby, objServiceEngineGroup.activeStandby)&&
  Objects.equals(this.placementMode, objServiceEngineGroup.placementMode)&&
  Objects.equals(this.openstackMgmtNetworkName, objServiceEngineGroup.openstackMgmtNetworkName)&&
  Objects.equals(this.openstackMgmtNetworkUuid, objServiceEngineGroup.openstackMgmtNetworkUuid)&&
  Objects.equals(this.instanceFlavor, objServiceEngineGroup.instanceFlavor)&&
  Objects.equals(this.hypervisor, objServiceEngineGroup.hypervisor)&&
  Objects.equals(this.seDosProfile, objServiceEngineGroup.seDosProfile)&&
  Objects.equals(this.autoRebalanceInterval, objServiceEngineGroup.autoRebalanceInterval)&&
  Objects.equals(this.aggressiveFailureDetection, objServiceEngineGroup.aggressiveFailureDetection)&&
  Objects.equals(this.realtimeSeMetrics, objServiceEngineGroup.realtimeSeMetrics)&&
  Objects.equals(this.vsScaleoutTimeout, objServiceEngineGroup.vsScaleoutTimeout)&&
  Objects.equals(this.vsScaleinTimeout, objServiceEngineGroup.vsScaleinTimeout)&&
  Objects.equals(this.hardwaresecuritymodulegroupRef, objServiceEngineGroup.hardwaresecuritymodulegroupRef)&&
  Objects.equals(this.connectionMemoryPercentage, objServiceEngineGroup.connectionMemoryPercentage)&&
  Objects.equals(this.extraConfigMultiplier, objServiceEngineGroup.extraConfigMultiplier)&&
  Objects.equals(this.vsScaleinTimeoutForUpgrade, objServiceEngineGroup.vsScaleinTimeoutForUpgrade)&&
  Objects.equals(this.hostAttributeKey, objServiceEngineGroup.hostAttributeKey)&&
  Objects.equals(this.hostAttributeValue, objServiceEngineGroup.hostAttributeValue)&&
  Objects.equals(this.logDisksz, objServiceEngineGroup.logDisksz)&&
  Objects.equals(this.osReservedMemory, objServiceEngineGroup.osReservedMemory)&&
  Objects.equals(this.hmOnStandby, objServiceEngineGroup.hmOnStandby)&&
  Objects.equals(this.perApp, objServiceEngineGroup.perApp)&&
  Objects.equals(this.distributeLoadActiveStandby, objServiceEngineGroup.distributeLoadActiveStandby)&&
  Objects.equals(this.autoRedistributeActiveStandbyLoad, objServiceEngineGroup.autoRedistributeActiveStandbyLoad)&&
  Objects.equals(this.customTag, objServiceEngineGroup.customTag)&&
  Objects.equals(this.dedicatedDispatcherCore, objServiceEngineGroup.dedicatedDispatcherCore)&&
  Objects.equals(this.cpuSocketAffinity, objServiceEngineGroup.cpuSocketAffinity)&&
  Objects.equals(this.numFlowCoresSumChangesToIgnore, objServiceEngineGroup.numFlowCoresSumChangesToIgnore)&&
  Objects.equals(this.leastLoadCoreSelection, objServiceEngineGroup.leastLoadCoreSelection)&&
  Objects.equals(this.extraSharedConfigMemory, objServiceEngineGroup.extraSharedConfigMemory)&&
  Objects.equals(this.seTunnelMode, objServiceEngineGroup.seTunnelMode)&&
  Objects.equals(this.openstackAvailabilityZones, objServiceEngineGroup.openstackAvailabilityZones)&&
  Objects.equals(this.serviceIpSubnets, objServiceEngineGroup.serviceIpSubnets)&&
  Objects.equals(this.seVsHbMaxVsInPkt, objServiceEngineGroup.seVsHbMaxVsInPkt)&&
  Objects.equals(this.seVsHbMaxPktsInBatch, objServiceEngineGroup.seVsHbMaxPktsInBatch)&&
  Objects.equals(this.autoRebalanceCriteria, objServiceEngineGroup.autoRebalanceCriteria)&&
  Objects.equals(this.cloudRef, objServiceEngineGroup.cloudRef)&&
  Objects.equals(this.iptables, objServiceEngineGroup.iptables)&&
  Objects.equals(this.seThreadMultiplier, objServiceEngineGroup.seThreadMultiplier)&&
  Objects.equals(this.asyncSsl, objServiceEngineGroup.asyncSsl)&&
  Objects.equals(this.asyncSslThreads, objServiceEngineGroup.asyncSslThreads)&&
  Objects.equals(this.seUdpEncapIpc, objServiceEngineGroup.seUdpEncapIpc)&&
  Objects.equals(this.seTunnelUdpPort, objServiceEngineGroup.seTunnelUdpPort)&&
  Objects.equals(this.customSecuritygroupsMgmt, objServiceEngineGroup.customSecuritygroupsMgmt)&&
  Objects.equals(this.customSecuritygroupsData, objServiceEngineGroup.customSecuritygroupsData)&&
  Objects.equals(this.archiveShmLimit, objServiceEngineGroup.archiveShmLimit)&&
  Objects.equals(this.significantLogThrottle, objServiceEngineGroup.significantLogThrottle)&&
  Objects.equals(this.udfLogThrottle, objServiceEngineGroup.udfLogThrottle)&&
  Objects.equals(this.nonSignificantLogThrottle, objServiceEngineGroup.nonSignificantLogThrottle)&&
  Objects.equals(this.ingressAccessMgmt, objServiceEngineGroup.ingressAccessMgmt)&&
  Objects.equals(this.ingressAccessData, objServiceEngineGroup.ingressAccessData)&&
  Objects.equals(this.seSbDedicatedCore, objServiceEngineGroup.seSbDedicatedCore)&&
  Objects.equals(this.seProbePort, objServiceEngineGroup.seProbePort)&&
  Objects.equals(this.seSbThreads, objServiceEngineGroup.seSbThreads)&&
  Objects.equals(this.ignoreRttThreshold, objServiceEngineGroup.ignoreRttThreshold)&&
  Objects.equals(this.wafMempool, objServiceEngineGroup.wafMempool)&&
  Objects.equals(this.wafMempoolSize, objServiceEngineGroup.wafMempoolSize)&&
  Objects.equals(this.seBandwidthType, objServiceEngineGroup.seBandwidthType)&&
  Objects.equals(this.licenseType, objServiceEngineGroup.licenseType)&&
  Objects.equals(this.licenseTier, objServiceEngineGroup.licenseTier)&&
  Objects.equals(this.allowBurst, objServiceEngineGroup.allowBurst)&&
  Objects.equals(this.autoRebalanceCapacityPerSe, objServiceEngineGroup.autoRebalanceCapacityPerSe)&&
  Objects.equals(this.hostGatewayMonitor, objServiceEngineGroup.hostGatewayMonitor)&&
  Objects.equals(this.vssPlacement, objServiceEngineGroup.vssPlacement)&&
  Objects.equals(this.flowTableNewSynMaxEntries, objServiceEngineGroup.flowTableNewSynMaxEntries)&&
  Objects.equals(this.disableCsumOffloads, objServiceEngineGroup.disableCsumOffloads)&&
  Objects.equals(this.disableGro, objServiceEngineGroup.disableGro)&&
  Objects.equals(this.disableTso, objServiceEngineGroup.disableTso)&&
  Objects.equals(this.enableHsmPriming, objServiceEngineGroup.enableHsmPriming)&&
  Objects.equals(this.serviceIp6Subnets, objServiceEngineGroup.serviceIp6Subnets)&&
  Objects.equals(this.seTracertPortRange, objServiceEngineGroup.seTracertPortRange)&&
  Objects.equals(this.distributeQueues, objServiceEngineGroup.distributeQueues)&&
  Objects.equals(this.vssPlacementEnabled, objServiceEngineGroup.vssPlacementEnabled)&&
  Objects.equals(this.enableMultiLb, objServiceEngineGroup.enableMultiLb)&&
  Objects.equals(this.nLogStreamingThreads, objServiceEngineGroup.nLogStreamingThreads)&&
  Objects.equals(this.freeListSize, objServiceEngineGroup.freeListSize)&&
  Objects.equals(this.maxRulesPerLb, objServiceEngineGroup.maxRulesPerLb)&&
  Objects.equals(this.maxPublicIpsPerLb, objServiceEngineGroup.maxPublicIpsPerLb)&&
  Objects.equals(this.selfSeElection, objServiceEngineGroup.selfSeElection)&&
  Objects.equals(this.vipAsg, objServiceEngineGroup.vipAsg)&&
  Objects.equals(this.minimumConnectionMemory, objServiceEngineGroup.minimumConnectionMemory)&&
  Objects.equals(this.shmMinimumConfigMemory, objServiceEngineGroup.shmMinimumConfigMemory)&&
  Objects.equals(this.heapMinimumConfigMemory, objServiceEngineGroup.heapMinimumConfigMemory)&&
  Objects.equals(this.disableSeMemoryCheck, objServiceEngineGroup.disableSeMemoryCheck)&&
  Objects.equals(this.memoryForConfigUpdate, objServiceEngineGroup.memoryForConfigUpdate)&&
  Objects.equals(this.numDispatcherCores, objServiceEngineGroup.numDispatcherCores)&&
  Objects.equals(this.sslPreprocessSniHostname, objServiceEngineGroup.sslPreprocessSniHostname)&&
  Objects.equals(this.seDpdkPmd, objServiceEngineGroup.seDpdkPmd)&&
  Objects.equals(this.seUseDpdk, objServiceEngineGroup.seUseDpdk)&&
  Objects.equals(this.minSe, objServiceEngineGroup.minSe)&&
  Objects.equals(this.sePcapReinitFrequency, objServiceEngineGroup.sePcapReinitFrequency)&&
  Objects.equals(this.sePcapReinitThreshold, objServiceEngineGroup.sePcapReinitThreshold)&&
  Objects.equals(this.ephemeralPortrangeStart, objServiceEngineGroup.ephemeralPortrangeStart)&&
  Objects.equals(this.ephemeralPortrangeEnd, objServiceEngineGroup.ephemeralPortrangeEnd)&&
  Objects.equals(this.disableAviSecuritygroups, objServiceEngineGroup.disableAviSecuritygroups)&&
  Objects.equals(this.seFlowProbeRetries, objServiceEngineGroup.seFlowProbeRetries)&&
  Objects.equals(this.vsSwitchoverTimeout, objServiceEngineGroup.vsSwitchoverTimeout)&&
  Objects.equals(this.configDebugsOnAllCores, objServiceEngineGroup.configDebugsOnAllCores)&&
  Objects.equals(this.acceleratedNetworking, objServiceEngineGroup.acceleratedNetworking)&&
  Objects.equals(this.vsSeScaleoutReadyTimeout, objServiceEngineGroup.vsSeScaleoutReadyTimeout)&&
  Objects.equals(this.vsSeScaleoutAdditionalWaitTime, objServiceEngineGroup.vsSeScaleoutAdditionalWaitTime)&&
  Objects.equals(this.seDpHmDrops, objServiceEngineGroup.seDpHmDrops)&&
  Objects.equals(this.disableFlowProbes, objServiceEngineGroup.disableFlowProbes)&&
  Objects.equals(this.dpAggressiveHbFrequency, objServiceEngineGroup.dpAggressiveHbFrequency)&&
  Objects.equals(this.dpAggressiveHbTimeoutCount, objServiceEngineGroup.dpAggressiveHbTimeoutCount)&&
  Objects.equals(this.bgpStateUpdateInterval, objServiceEngineGroup.bgpStateUpdateInterval)&&
  Objects.equals(this.maxMemoryPerMempool, objServiceEngineGroup.maxMemoryPerMempool)&&
  Objects.equals(this.appCachePercent, objServiceEngineGroup.appCachePercent)&&
  Objects.equals(this.useStandardAlb, objServiceEngineGroup.useStandardAlb)&&
  Objects.equals(this.appLearningMemoryPercent, objServiceEngineGroup.appLearningMemoryPercent)&&
  Objects.equals(this.datascriptTimeout, objServiceEngineGroup.datascriptTimeout)&&
  Objects.equals(this.dataNetworkId, objServiceEngineGroup.dataNetworkId)&&
  Objects.equals(this.sePcapLookahead, objServiceEngineGroup.sePcapLookahead)&&
  Objects.equals(this.enableGratarpPermanent, objServiceEngineGroup.enableGratarpPermanent)&&
  Objects.equals(this.gratarpPermanentPeriodicity, objServiceEngineGroup.gratarpPermanentPeriodicity)&&
  Objects.equals(this.rebootOnPanic, objServiceEngineGroup.rebootOnPanic)&&
  Objects.equals(this.seFlowProbeRetryTimer, objServiceEngineGroup.seFlowProbeRetryTimer)&&
  Objects.equals(this.seLro, objServiceEngineGroup.seLro)&&
  Objects.equals(this.seTxBatchSize, objServiceEngineGroup.seTxBatchSize)&&
  Objects.equals(this.sePcapPktSz, objServiceEngineGroup.sePcapPktSz)&&
  Objects.equals(this.sePcapPktCount, objServiceEngineGroup.sePcapPktCount)&&
  Objects.equals(this.distributeVnics, objServiceEngineGroup.distributeVnics)&&
  Objects.equals(this.seDpVnicQueueStallEventSleep, objServiceEngineGroup.seDpVnicQueueStallEventSleep)&&
  Objects.equals(this.seDpVnicQueueStallTimeout, objServiceEngineGroup.seDpVnicQueueStallTimeout)&&
  Objects.equals(this.seDpVnicQueueStallThreshold, objServiceEngineGroup.seDpVnicQueueStallThreshold)&&
  Objects.equals(this.seDpVnicRestartOnQueueStallCount, objServiceEngineGroup.seDpVnicRestartOnQueueStallCount)&&
  Objects.equals(this.seDpVnicStallSeRestartWindow, objServiceEngineGroup.seDpVnicStallSeRestartWindow)&&
  Objects.equals(this.enablePcapTxRing, objServiceEngineGroup.enablePcapTxRing)&&
  Objects.equals(this.sePcapQdiscBypass, objServiceEngineGroup.sePcapQdiscBypass)&&
  Objects.equals(this.seRumSamplingNavPercent, objServiceEngineGroup.seRumSamplingNavPercent)&&
  Objects.equals(this.seRumSamplingResPercent, objServiceEngineGroup.seRumSamplingResPercent)&&
  Objects.equals(this.seRumSamplingNavInterval, objServiceEngineGroup.seRumSamplingNavInterval)&&
  Objects.equals(this.seRumSamplingResInterval, objServiceEngineGroup.seRumSamplingResInterval)&&
  Objects.equals(this.seKniBurstFactor, objServiceEngineGroup.seKniBurstFactor)&&
  Objects.equals(this.maxQueuesPerVnic, objServiceEngineGroup.maxQueuesPerVnic)&&
  Objects.equals(this.seRlProp, objServiceEngineGroup.seRlProp)&&
  Objects.equals(this.appCacheThreshold, objServiceEngineGroup.appCacheThreshold)&&
  Objects.equals(this.maxConcurrentExternalHm, objServiceEngineGroup.maxConcurrentExternalHm)&&
  Objects.equals(this.seMtu, objServiceEngineGroup.seMtu)&&
  Objects.equals(this.coreShmAppLearning, objServiceEngineGroup.coreShmAppLearning)&&
  Objects.equals(this.coreShmAppCache, objServiceEngineGroup.coreShmAppCache)&&
  Objects.equals(this.pcapTxMode, objServiceEngineGroup.pcapTxMode)&&
  Objects.equals(this.seDpMaxHbVersion, objServiceEngineGroup.seDpMaxHbVersion)&&
  Objects.equals(this.maxNumSeDps, objServiceEngineGroup.maxNumSeDps)&&
  Objects.equals(this.resyncTimeInterval, objServiceEngineGroup.resyncTimeInterval)&&
  Objects.equals(this.useHyperthreadedCores, objServiceEngineGroup.useHyperthreadedCores)&&
  Objects.equals(this.seHyperthreadedMode, objServiceEngineGroup.seHyperthreadedMode)&&
  Objects.equals(this.compressIpRulesForEachNsSubnet, objServiceEngineGroup.compressIpRulesForEachNsSubnet)&&
  Objects.equals(this.availabilityZoneRefs, objServiceEngineGroup.availabilityZoneRefs)&&
  Objects.equals(this.vcenters, objServiceEngineGroup.vcenters)&&
  Objects.equals(this.seVnicTxSwQueueSize, objServiceEngineGroup.seVnicTxSwQueueSize)&&
  Objects.equals(this.seVnicTxSwQueueFlushFrequency, objServiceEngineGroup.seVnicTxSwQueueFlushFrequency)&&
  Objects.equals(this.transientSharedMemoryMax, objServiceEngineGroup.transientSharedMemoryMax)&&
  Objects.equals(this.labels, objServiceEngineGroup.labels)&&
  Objects.equals(this.logMallocFailure, objServiceEngineGroup.logMallocFailure)&&
  Objects.equals(this.seDelayedFlowDelete, objServiceEngineGroup.seDelayedFlowDelete)&&
  Objects.equals(this.seTxqThreshold, objServiceEngineGroup.seTxqThreshold)&&
  Objects.equals(this.seMpRingRetryCount, objServiceEngineGroup.seMpRingRetryCount)&&
  Objects.equals(this.seGroupAnalyticsPolicy, objServiceEngineGroup.seGroupAnalyticsPolicy)&&
  Objects.equals(this.dpHbFrequency, objServiceEngineGroup.dpHbFrequency)&&
  Objects.equals(this.dpHbTimeoutCount, objServiceEngineGroup.dpHbTimeoutCount)&&
  Objects.equals(this.pcapTxRingRdBalancingFactor, objServiceEngineGroup.pcapTxRingRdBalancingFactor)&&
  Objects.equals(this.gcpConfig, objServiceEngineGroup.gcpConfig)&&
  Objects.equals(this.useObjsync, objServiceEngineGroup.useObjsync)&&
  Objects.equals(this.seIpEncapIpc, objServiceEngineGroup.seIpEncapIpc)&&
  Objects.equals(this.seL3EncapIpc, objServiceEngineGroup.seL3EncapIpc)&&
  Objects.equals(this.netlinkPollerThreads, objServiceEngineGroup.netlinkPollerThreads)&&
  Objects.equals(this.netlinkSockBufSize, objServiceEngineGroup.netlinkSockBufSize)&&
  Objects.equals(this.handlePerPktAttack, objServiceEngineGroup.handlePerPktAttack)&&
  Objects.equals(this.perVsAdmissionControl, objServiceEngineGroup.perVsAdmissionControl)&&
  Objects.equals(this.objsyncPort, objServiceEngineGroup.objsyncPort)&&
  Objects.equals(this.objsyncConfig, objServiceEngineGroup.objsyncConfig)&&
  Objects.equals(this.dpAggressiveDeqIntervalMsec, objServiceEngineGroup.dpAggressiveDeqIntervalMsec)&&
  Objects.equals(this.dpAggressiveEnqIntervalMsec, objServiceEngineGroup.dpAggressiveEnqIntervalMsec)&&
  Objects.equals(this.nsHelperDeqIntervalMsec, objServiceEngineGroup.nsHelperDeqIntervalMsec)&&
  Objects.equals(this.dpDeqIntervalMsec, objServiceEngineGroup.dpDeqIntervalMsec)&&
  Objects.equals(this.dpEnqIntervalMsec, objServiceEngineGroup.dpEnqIntervalMsec)&&
  Objects.equals(this.sendSeReadyTimeout, objServiceEngineGroup.sendSeReadyTimeout)&&
  Objects.equals(this.vnicDhcpIpCheckInterval, objServiceEngineGroup.vnicDhcpIpCheckInterval)&&
  Objects.equals(this.vnicDhcpIpMaxRetries, objServiceEngineGroup.vnicDhcpIpMaxRetries)&&
  Objects.equals(this.vnicIpDeleteInterval, objServiceEngineGroup.vnicIpDeleteInterval)&&
  Objects.equals(this.vnicProbeInterval, objServiceEngineGroup.vnicProbeInterval)&&
  Objects.equals(this.vnicRpcRetryInterval, objServiceEngineGroup.vnicRpcRetryInterval)&&
  Objects.equals(this.vnicdbCmdHistorySize, objServiceEngineGroup.vnicdbCmdHistorySize)&&
  Objects.equals(this.seDpIsolation, objServiceEngineGroup.seDpIsolation)&&
  Objects.equals(this.seDpIsolationNumNonDpCpus, objServiceEngineGroup.seDpIsolationNumNonDpCpus)&&
  Objects.equals(this.userAgentCacheConfig, objServiceEngineGroup.userAgentCacheConfig)&&
  Objects.equals(this.sdbScanCount, objServiceEngineGroup.sdbScanCount)&&
  Objects.equals(this.sdbPipelineSize, objServiceEngineGroup.sdbPipelineSize)&&
  Objects.equals(this.sdbFlushInterval, objServiceEngineGroup.sdbFlushInterval)&&
  Objects.equals(this.l7ConnsPerCore, objServiceEngineGroup.l7ConnsPerCore)&&
  Objects.equals(this.sslSessCachePerVs, objServiceEngineGroup.sslSessCachePerVs)&&
  Objects.equals(this.l7ResvdListenConnsPerCore, objServiceEngineGroup.l7ResvdListenConnsPerCore)&&
  Objects.equals(this.upstreamConnpoolEnable, objServiceEngineGroup.upstreamConnpoolEnable)&&
  Objects.equals(this.ngxFreeConnectionStack, objServiceEngineGroup.ngxFreeConnectionStack)&&
  Objects.equals(this.httpRumConsoleLog, objServiceEngineGroup.httpRumConsoleLog)&&
  Objects.equals(this.httpRumMinContentLength, objServiceEngineGroup.httpRumMinContentLength)&&
  Objects.equals(this.upstreamConnectTimeout, objServiceEngineGroup.upstreamConnectTimeout)&&
  Objects.equals(this.upstreamSendTimeout, objServiceEngineGroup.upstreamSendTimeout)&&
  Objects.equals(this.upstreamReadTimeout, objServiceEngineGroup.upstreamReadTimeout)&&
  Objects.equals(this.downstreamSendTimeout, objServiceEngineGroup.downstreamSendTimeout)&&
  Objects.equals(this.lbactionNumRequestsToDispatch, objServiceEngineGroup.lbactionNumRequestsToDispatch)&&
  Objects.equals(this.lbactionRqPerRequestMaxRetries, objServiceEngineGroup.lbactionRqPerRequestMaxRetries)&&
  Objects.equals(this.userDefinedMetricAge, objServiceEngineGroup.userDefinedMetricAge)&&
  Objects.equals(this.enableHsmLog, objServiceEngineGroup.enableHsmLog)&&
  Objects.equals(this.ignoreDockerMacChange, objServiceEngineGroup.ignoreDockerMacChange)&&
  Objects.equals(this.seDumpCoreOnAssert, objServiceEngineGroup.seDumpCoreOnAssert)&&
  Objects.equals(this.sePacketBufferMax, objServiceEngineGroup.sePacketBufferMax)&&
  Objects.equals(this.seDpIfStatePollInterval, objServiceEngineGroup.seDpIfStatePollInterval)&&
  Objects.equals(this.seEmulatedCores, objServiceEngineGroup.seEmulatedCores)&&
  Objects.equals(this.baremetalDispatcherHandlesFlows, objServiceEngineGroup.baremetalDispatcherHandlesFlows)&&
  Objects.equals(this.useLegacyNetlink, objServiceEngineGroup.useLegacyNetlink)&&
  Objects.equals(this.logAgentTraceEnabled, objServiceEngineGroup.logAgentTraceEnabled)&&
  Objects.equals(this.logAgentDebugEnabled, objServiceEngineGroup.logAgentDebugEnabled)&&
  Objects.equals(this.seLogBufferAppBlockingDequeue, objServiceEngineGroup.seLogBufferAppBlockingDequeue)&&
  Objects.equals(this.seLogBufferConnBlockingDequeue, objServiceEngineGroup.seLogBufferConnBlockingDequeue)&&
  Objects.equals(this.seLogBufferEventsBlockingDequeue, objServiceEngineGroup.seLogBufferEventsBlockingDequeue)&&
  Objects.equals(this.logAgentFileSzDebug, objServiceEngineGroup.logAgentFileSzDebug)&&
  Objects.equals(this.logAgentFileSzConn, objServiceEngineGroup.logAgentFileSzConn)&&
  Objects.equals(this.logAgentFileSzAppl, objServiceEngineGroup.logAgentFileSzAppl)&&
  Objects.equals(this.logAgentFileSzEvent, objServiceEngineGroup.logAgentFileSzEvent)&&
  Objects.equals(this.logAgentMinStoragePerVs, objServiceEngineGroup.logAgentMinStoragePerVs)&&
  Objects.equals(this.logAgentMaxStorageIgnorePercent, objServiceEngineGroup.logAgentMaxStorageIgnorePercent)&&
  Objects.equals(this.logAgentMaxStorageExcessPercent, objServiceEngineGroup.logAgentMaxStorageExcessPercent)&&
  Objects.equals(this.seDpLogNfEnqueuePercent, objServiceEngineGroup.seDpLogNfEnqueuePercent)&&
  Objects.equals(this.seDpLogUdfEnqueuePercent, objServiceEngineGroup.seDpLogUdfEnqueuePercent)&&
  Objects.equals(this.logAgentCompressLogs, objServiceEngineGroup.logAgentCompressLogs)&&
  Objects.equals(this.logAgentSleepInterval, objServiceEngineGroup.logAgentSleepInterval)&&
  Objects.equals(this.logAgentUnknownVsTimer, objServiceEngineGroup.logAgentUnknownVsTimer)&&
  Objects.equals(this.logAgentMaxConcurrentRsync, objServiceEngineGroup.logAgentMaxConcurrentRsync)&&
  Objects.equals(this.logAgentLogStorageMinSz, objServiceEngineGroup.logAgentLogStorageMinSz)&&
  Objects.equals(this.logMessageMaxFileListSize, objServiceEngineGroup.logMessageMaxFileListSize)&&
  Objects.equals(this.deactivateIpv6Discovery, objServiceEngineGroup.deactivateIpv6Discovery)&&
  Objects.equals(this.markers, objServiceEngineGroup.markers)&&
  Objects.equals(this.bgpPeerMonitorFailoverEnabled, objServiceEngineGroup.bgpPeerMonitorFailoverEnabled)&&
  Objects.equals(this.maxSkbFrags, objServiceEngineGroup.maxSkbFrags)&&
  Objects.equals(this.hybridRssMode, objServiceEngineGroup.hybridRssMode)&&
  Objects.equals(this.numDispatcherQueues, objServiceEngineGroup.numDispatcherQueues)&&
  Objects.equals(this.kniAllowedServerPorts, objServiceEngineGroup.kniAllowedServerPorts)&&
  Objects.equals(this.deactivateKniFilteringAtDispatcher, objServiceEngineGroup.deactivateKniFilteringAtDispatcher)&&
  Objects.equals(this.vcenterParkingVnicPg, objServiceEngineGroup.vcenterParkingVnicPg)&&
  Objects.equals(this.dpdkGroTimeoutInterval, objServiceEngineGroup.dpdkGroTimeoutInterval)&&
  Objects.equals(this.seTimeTrackerProps, objServiceEngineGroup.seTimeTrackerProps)&&
  Objects.equals(this.grpcChannelConnectTimeout, objServiceEngineGroup.grpcChannelConnectTimeout)&&
  Objects.equals(this.ntpSyncFailEvent, objServiceEngineGroup.ntpSyncFailEvent)&&
  Objects.equals(this.ntpSyncStatusInterval, objServiceEngineGroup.ntpSyncStatusInterval)&&
  Objects.equals(this.useDpUtilForScaleout, objServiceEngineGroup.useDpUtilForScaleout)&&
  Objects.equals(this.replayVrfRoutesInterval, objServiceEngineGroup.replayVrfRoutesInterval)&&
  Objects.equals(this.vsSeScaleinAdditionalWaitTime, objServiceEngineGroup.vsSeScaleinAdditionalWaitTime)&&
  Objects.equals(this.vsSePrimarySwitchoverAdditionalWaitTime, objServiceEngineGroup.vsSePrimarySwitchoverAdditionalWaitTime)&&
  Objects.equals(this.pathMtuDiscoveryV4, objServiceEngineGroup.pathMtuDiscoveryV4)&&
  Objects.equals(this.pathMtuDiscoveryV6, objServiceEngineGroup.pathMtuDiscoveryV6)&&
  Objects.equals(this.metricsCollectionMode, objServiceEngineGroup.metricsCollectionMode)&&
  Objects.equals(this.seDebugTraceSz, objServiceEngineGroup.seDebugTraceSz)&&
  Objects.equals(this.multicastEnable, objServiceEngineGroup.multicastEnable);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ServiceEngineGroup {\n");
                  sb.append("    acceleratedNetworking: ").append(toIndentedString(acceleratedNetworking)).append("\n");
                        sb.append("    activeStandby: ").append(toIndentedString(activeStandby)).append("\n");
                        sb.append("    aggressiveFailureDetection: ").append(toIndentedString(aggressiveFailureDetection)).append("\n");
                        sb.append("    algo: ").append(toIndentedString(algo)).append("\n");
                        sb.append("    allowBurst: ").append(toIndentedString(allowBurst)).append("\n");
                        sb.append("    appCachePercent: ").append(toIndentedString(appCachePercent)).append("\n");
                        sb.append("    appCacheThreshold: ").append(toIndentedString(appCacheThreshold)).append("\n");
                        sb.append("    appLearningMemoryPercent: ").append(toIndentedString(appLearningMemoryPercent)).append("\n");
                        sb.append("    archiveShmLimit: ").append(toIndentedString(archiveShmLimit)).append("\n");
                        sb.append("    asyncSsl: ").append(toIndentedString(asyncSsl)).append("\n");
                        sb.append("    asyncSslThreads: ").append(toIndentedString(asyncSslThreads)).append("\n");
                        sb.append("    autoRebalance: ").append(toIndentedString(autoRebalance)).append("\n");
                        sb.append("    autoRebalanceCapacityPerSe: ").append(toIndentedString(autoRebalanceCapacityPerSe)).append("\n");
                        sb.append("    autoRebalanceCriteria: ").append(toIndentedString(autoRebalanceCriteria)).append("\n");
                        sb.append("    autoRebalanceInterval: ").append(toIndentedString(autoRebalanceInterval)).append("\n");
                        sb.append("    autoRedistributeActiveStandbyLoad: ").append(toIndentedString(autoRedistributeActiveStandbyLoad)).append("\n");
                        sb.append("    availabilityZoneRefs: ").append(toIndentedString(availabilityZoneRefs)).append("\n");
                        sb.append("    baremetalDispatcherHandlesFlows: ").append(toIndentedString(baremetalDispatcherHandlesFlows)).append("\n");
                        sb.append("    bgpPeerMonitorFailoverEnabled: ").append(toIndentedString(bgpPeerMonitorFailoverEnabled)).append("\n");
                        sb.append("    bgpStateUpdateInterval: ").append(toIndentedString(bgpStateUpdateInterval)).append("\n");
                        sb.append("    bufferSe: ").append(toIndentedString(bufferSe)).append("\n");
                        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
                        sb.append("    compressIpRulesForEachNsSubnet: ").append(toIndentedString(compressIpRulesForEachNsSubnet)).append("\n");
                        sb.append("    configDebugsOnAllCores: ").append(toIndentedString(configDebugsOnAllCores)).append("\n");
                        sb.append("    connectionMemoryPercentage: ").append(toIndentedString(connectionMemoryPercentage)).append("\n");
                        sb.append("    coreShmAppCache: ").append(toIndentedString(coreShmAppCache)).append("\n");
                        sb.append("    coreShmAppLearning: ").append(toIndentedString(coreShmAppLearning)).append("\n");
                        sb.append("    cpuReserve: ").append(toIndentedString(cpuReserve)).append("\n");
                        sb.append("    cpuSocketAffinity: ").append(toIndentedString(cpuSocketAffinity)).append("\n");
                        sb.append("    customSecuritygroupsData: ").append(toIndentedString(customSecuritygroupsData)).append("\n");
                        sb.append("    customSecuritygroupsMgmt: ").append(toIndentedString(customSecuritygroupsMgmt)).append("\n");
                        sb.append("    customTag: ").append(toIndentedString(customTag)).append("\n");
                        sb.append("    dataNetworkId: ").append(toIndentedString(dataNetworkId)).append("\n");
                        sb.append("    datascriptTimeout: ").append(toIndentedString(datascriptTimeout)).append("\n");
                        sb.append("    deactivateIpv6Discovery: ").append(toIndentedString(deactivateIpv6Discovery)).append("\n");
                        sb.append("    deactivateKniFilteringAtDispatcher: ").append(toIndentedString(deactivateKniFilteringAtDispatcher)).append("\n");
                        sb.append("    dedicatedDispatcherCore: ").append(toIndentedString(dedicatedDispatcherCore)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    disableAviSecuritygroups: ").append(toIndentedString(disableAviSecuritygroups)).append("\n");
                        sb.append("    disableCsumOffloads: ").append(toIndentedString(disableCsumOffloads)).append("\n");
                        sb.append("    disableFlowProbes: ").append(toIndentedString(disableFlowProbes)).append("\n");
                        sb.append("    disableGro: ").append(toIndentedString(disableGro)).append("\n");
                        sb.append("    disableSeMemoryCheck: ").append(toIndentedString(disableSeMemoryCheck)).append("\n");
                        sb.append("    disableTso: ").append(toIndentedString(disableTso)).append("\n");
                        sb.append("    diskPerSe: ").append(toIndentedString(diskPerSe)).append("\n");
                        sb.append("    distributeLoadActiveStandby: ").append(toIndentedString(distributeLoadActiveStandby)).append("\n");
                        sb.append("    distributeQueues: ").append(toIndentedString(distributeQueues)).append("\n");
                        sb.append("    distributeVnics: ").append(toIndentedString(distributeVnics)).append("\n");
                        sb.append("    downstreamSendTimeout: ").append(toIndentedString(downstreamSendTimeout)).append("\n");
                        sb.append("    dpAggressiveDeqIntervalMsec: ").append(toIndentedString(dpAggressiveDeqIntervalMsec)).append("\n");
                        sb.append("    dpAggressiveEnqIntervalMsec: ").append(toIndentedString(dpAggressiveEnqIntervalMsec)).append("\n");
                        sb.append("    dpAggressiveHbFrequency: ").append(toIndentedString(dpAggressiveHbFrequency)).append("\n");
                        sb.append("    dpAggressiveHbTimeoutCount: ").append(toIndentedString(dpAggressiveHbTimeoutCount)).append("\n");
                        sb.append("    dpDeqIntervalMsec: ").append(toIndentedString(dpDeqIntervalMsec)).append("\n");
                        sb.append("    dpEnqIntervalMsec: ").append(toIndentedString(dpEnqIntervalMsec)).append("\n");
                        sb.append("    dpHbFrequency: ").append(toIndentedString(dpHbFrequency)).append("\n");
                        sb.append("    dpHbTimeoutCount: ").append(toIndentedString(dpHbTimeoutCount)).append("\n");
                        sb.append("    dpdkGroTimeoutInterval: ").append(toIndentedString(dpdkGroTimeoutInterval)).append("\n");
                        sb.append("    enableGratarpPermanent: ").append(toIndentedString(enableGratarpPermanent)).append("\n");
                        sb.append("    enableHsmLog: ").append(toIndentedString(enableHsmLog)).append("\n");
                        sb.append("    enableHsmPriming: ").append(toIndentedString(enableHsmPriming)).append("\n");
                        sb.append("    enableMultiLb: ").append(toIndentedString(enableMultiLb)).append("\n");
                        sb.append("    enablePcapTxRing: ").append(toIndentedString(enablePcapTxRing)).append("\n");
                        sb.append("    ephemeralPortrangeEnd: ").append(toIndentedString(ephemeralPortrangeEnd)).append("\n");
                        sb.append("    ephemeralPortrangeStart: ").append(toIndentedString(ephemeralPortrangeStart)).append("\n");
                        sb.append("    extraConfigMultiplier: ").append(toIndentedString(extraConfigMultiplier)).append("\n");
                        sb.append("    extraSharedConfigMemory: ").append(toIndentedString(extraSharedConfigMemory)).append("\n");
                        sb.append("    flowTableNewSynMaxEntries: ").append(toIndentedString(flowTableNewSynMaxEntries)).append("\n");
                        sb.append("    freeListSize: ").append(toIndentedString(freeListSize)).append("\n");
                        sb.append("    gcpConfig: ").append(toIndentedString(gcpConfig)).append("\n");
                        sb.append("    gratarpPermanentPeriodicity: ").append(toIndentedString(gratarpPermanentPeriodicity)).append("\n");
                        sb.append("    grpcChannelConnectTimeout: ").append(toIndentedString(grpcChannelConnectTimeout)).append("\n");
                        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
                        sb.append("    handlePerPktAttack: ").append(toIndentedString(handlePerPktAttack)).append("\n");
                        sb.append("    hardwaresecuritymodulegroupRef: ").append(toIndentedString(hardwaresecuritymodulegroupRef)).append("\n");
                        sb.append("    heapMinimumConfigMemory: ").append(toIndentedString(heapMinimumConfigMemory)).append("\n");
                        sb.append("    hmOnStandby: ").append(toIndentedString(hmOnStandby)).append("\n");
                        sb.append("    hostAttributeKey: ").append(toIndentedString(hostAttributeKey)).append("\n");
                        sb.append("    hostAttributeValue: ").append(toIndentedString(hostAttributeValue)).append("\n");
                        sb.append("    hostGatewayMonitor: ").append(toIndentedString(hostGatewayMonitor)).append("\n");
                        sb.append("    httpRumConsoleLog: ").append(toIndentedString(httpRumConsoleLog)).append("\n");
                        sb.append("    httpRumMinContentLength: ").append(toIndentedString(httpRumMinContentLength)).append("\n");
                        sb.append("    hybridRssMode: ").append(toIndentedString(hybridRssMode)).append("\n");
                        sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
                        sb.append("    ignoreDockerMacChange: ").append(toIndentedString(ignoreDockerMacChange)).append("\n");
                        sb.append("    ignoreRttThreshold: ").append(toIndentedString(ignoreRttThreshold)).append("\n");
                        sb.append("    ingressAccessData: ").append(toIndentedString(ingressAccessData)).append("\n");
                        sb.append("    ingressAccessMgmt: ").append(toIndentedString(ingressAccessMgmt)).append("\n");
                        sb.append("    instanceFlavor: ").append(toIndentedString(instanceFlavor)).append("\n");
                        sb.append("    iptables: ").append(toIndentedString(iptables)).append("\n");
                        sb.append("    kniAllowedServerPorts: ").append(toIndentedString(kniAllowedServerPorts)).append("\n");
                        sb.append("    l7ConnsPerCore: ").append(toIndentedString(l7ConnsPerCore)).append("\n");
                        sb.append("    l7ResvdListenConnsPerCore: ").append(toIndentedString(l7ResvdListenConnsPerCore)).append("\n");
                        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
                        sb.append("    lbactionNumRequestsToDispatch: ").append(toIndentedString(lbactionNumRequestsToDispatch)).append("\n");
                        sb.append("    lbactionRqPerRequestMaxRetries: ").append(toIndentedString(lbactionRqPerRequestMaxRetries)).append("\n");
                        sb.append("    leastLoadCoreSelection: ").append(toIndentedString(leastLoadCoreSelection)).append("\n");
                        sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
                        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
                        sb.append("    logAgentCompressLogs: ").append(toIndentedString(logAgentCompressLogs)).append("\n");
                        sb.append("    logAgentDebugEnabled: ").append(toIndentedString(logAgentDebugEnabled)).append("\n");
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
                        sb.append("    logAgentTraceEnabled: ").append(toIndentedString(logAgentTraceEnabled)).append("\n");
                        sb.append("    logAgentUnknownVsTimer: ").append(toIndentedString(logAgentUnknownVsTimer)).append("\n");
                        sb.append("    logDisksz: ").append(toIndentedString(logDisksz)).append("\n");
                        sb.append("    logMallocFailure: ").append(toIndentedString(logMallocFailure)).append("\n");
                        sb.append("    logMessageMaxFileListSize: ").append(toIndentedString(logMessageMaxFileListSize)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    maxConcurrentExternalHm: ").append(toIndentedString(maxConcurrentExternalHm)).append("\n");
                        sb.append("    maxCpuUsage: ").append(toIndentedString(maxCpuUsage)).append("\n");
                        sb.append("    maxMemoryPerMempool: ").append(toIndentedString(maxMemoryPerMempool)).append("\n");
                        sb.append("    maxNumSeDps: ").append(toIndentedString(maxNumSeDps)).append("\n");
                        sb.append("    maxPublicIpsPerLb: ").append(toIndentedString(maxPublicIpsPerLb)).append("\n");
                        sb.append("    maxQueuesPerVnic: ").append(toIndentedString(maxQueuesPerVnic)).append("\n");
                        sb.append("    maxRulesPerLb: ").append(toIndentedString(maxRulesPerLb)).append("\n");
                        sb.append("    maxScaleoutPerVs: ").append(toIndentedString(maxScaleoutPerVs)).append("\n");
                        sb.append("    maxSe: ").append(toIndentedString(maxSe)).append("\n");
                        sb.append("    maxSkbFrags: ").append(toIndentedString(maxSkbFrags)).append("\n");
                        sb.append("    maxVsPerSe: ").append(toIndentedString(maxVsPerSe)).append("\n");
                        sb.append("    memReserve: ").append(toIndentedString(memReserve)).append("\n");
                        sb.append("    memoryForConfigUpdate: ").append(toIndentedString(memoryForConfigUpdate)).append("\n");
                        sb.append("    memoryPerSe: ").append(toIndentedString(memoryPerSe)).append("\n");
                        sb.append("    metricsCollectionMode: ").append(toIndentedString(metricsCollectionMode)).append("\n");
                        sb.append("    mgmtNetworkRef: ").append(toIndentedString(mgmtNetworkRef)).append("\n");
                        sb.append("    mgmtSubnet: ").append(toIndentedString(mgmtSubnet)).append("\n");
                        sb.append("    minCpuUsage: ").append(toIndentedString(minCpuUsage)).append("\n");
                        sb.append("    minScaleoutPerVs: ").append(toIndentedString(minScaleoutPerVs)).append("\n");
                        sb.append("    minSe: ").append(toIndentedString(minSe)).append("\n");
                        sb.append("    minimumConnectionMemory: ").append(toIndentedString(minimumConnectionMemory)).append("\n");
                        sb.append("    multicastEnable: ").append(toIndentedString(multicastEnable)).append("\n");
                        sb.append("    nLogStreamingThreads: ").append(toIndentedString(nLogStreamingThreads)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    netlinkPollerThreads: ").append(toIndentedString(netlinkPollerThreads)).append("\n");
                        sb.append("    netlinkSockBufSize: ").append(toIndentedString(netlinkSockBufSize)).append("\n");
                        sb.append("    ngxFreeConnectionStack: ").append(toIndentedString(ngxFreeConnectionStack)).append("\n");
                        sb.append("    nonSignificantLogThrottle: ").append(toIndentedString(nonSignificantLogThrottle)).append("\n");
                        sb.append("    nsHelperDeqIntervalMsec: ").append(toIndentedString(nsHelperDeqIntervalMsec)).append("\n");
                        sb.append("    ntpSyncFailEvent: ").append(toIndentedString(ntpSyncFailEvent)).append("\n");
                        sb.append("    ntpSyncStatusInterval: ").append(toIndentedString(ntpSyncStatusInterval)).append("\n");
                        sb.append("    numDispatcherCores: ").append(toIndentedString(numDispatcherCores)).append("\n");
                        sb.append("    numDispatcherQueues: ").append(toIndentedString(numDispatcherQueues)).append("\n");
                        sb.append("    numFlowCoresSumChangesToIgnore: ").append(toIndentedString(numFlowCoresSumChangesToIgnore)).append("\n");
                        sb.append("    objsyncConfig: ").append(toIndentedString(objsyncConfig)).append("\n");
                        sb.append("    objsyncPort: ").append(toIndentedString(objsyncPort)).append("\n");
                        sb.append("    openstackAvailabilityZones: ").append(toIndentedString(openstackAvailabilityZones)).append("\n");
                        sb.append("    openstackMgmtNetworkName: ").append(toIndentedString(openstackMgmtNetworkName)).append("\n");
                        sb.append("    openstackMgmtNetworkUuid: ").append(toIndentedString(openstackMgmtNetworkUuid)).append("\n");
                        sb.append("    osReservedMemory: ").append(toIndentedString(osReservedMemory)).append("\n");
                        sb.append("    pathMtuDiscoveryV4: ").append(toIndentedString(pathMtuDiscoveryV4)).append("\n");
                        sb.append("    pathMtuDiscoveryV6: ").append(toIndentedString(pathMtuDiscoveryV6)).append("\n");
                        sb.append("    pcapTxMode: ").append(toIndentedString(pcapTxMode)).append("\n");
                        sb.append("    pcapTxRingRdBalancingFactor: ").append(toIndentedString(pcapTxRingRdBalancingFactor)).append("\n");
                        sb.append("    perApp: ").append(toIndentedString(perApp)).append("\n");
                        sb.append("    perVsAdmissionControl: ").append(toIndentedString(perVsAdmissionControl)).append("\n");
                        sb.append("    placementMode: ").append(toIndentedString(placementMode)).append("\n");
                        sb.append("    realtimeSeMetrics: ").append(toIndentedString(realtimeSeMetrics)).append("\n");
                        sb.append("    rebootOnPanic: ").append(toIndentedString(rebootOnPanic)).append("\n");
                        sb.append("    replayVrfRoutesInterval: ").append(toIndentedString(replayVrfRoutesInterval)).append("\n");
                        sb.append("    resyncTimeInterval: ").append(toIndentedString(resyncTimeInterval)).append("\n");
                        sb.append("    sdbFlushInterval: ").append(toIndentedString(sdbFlushInterval)).append("\n");
                        sb.append("    sdbPipelineSize: ").append(toIndentedString(sdbPipelineSize)).append("\n");
                        sb.append("    sdbScanCount: ").append(toIndentedString(sdbScanCount)).append("\n");
                        sb.append("    seBandwidthType: ").append(toIndentedString(seBandwidthType)).append("\n");
                        sb.append("    seDebugTraceSz: ").append(toIndentedString(seDebugTraceSz)).append("\n");
                        sb.append("    seDelayedFlowDelete: ").append(toIndentedString(seDelayedFlowDelete)).append("\n");
                        sb.append("    seDeprovisionDelay: ").append(toIndentedString(seDeprovisionDelay)).append("\n");
                        sb.append("    seDosProfile: ").append(toIndentedString(seDosProfile)).append("\n");
                        sb.append("    seDpHmDrops: ").append(toIndentedString(seDpHmDrops)).append("\n");
                        sb.append("    seDpIfStatePollInterval: ").append(toIndentedString(seDpIfStatePollInterval)).append("\n");
                        sb.append("    seDpIsolation: ").append(toIndentedString(seDpIsolation)).append("\n");
                        sb.append("    seDpIsolationNumNonDpCpus: ").append(toIndentedString(seDpIsolationNumNonDpCpus)).append("\n");
                        sb.append("    seDpLogNfEnqueuePercent: ").append(toIndentedString(seDpLogNfEnqueuePercent)).append("\n");
                        sb.append("    seDpLogUdfEnqueuePercent: ").append(toIndentedString(seDpLogUdfEnqueuePercent)).append("\n");
                        sb.append("    seDpMaxHbVersion: ").append(toIndentedString(seDpMaxHbVersion)).append("\n");
                        sb.append("    seDpVnicQueueStallEventSleep: ").append(toIndentedString(seDpVnicQueueStallEventSleep)).append("\n");
                        sb.append("    seDpVnicQueueStallThreshold: ").append(toIndentedString(seDpVnicQueueStallThreshold)).append("\n");
                        sb.append("    seDpVnicQueueStallTimeout: ").append(toIndentedString(seDpVnicQueueStallTimeout)).append("\n");
                        sb.append("    seDpVnicRestartOnQueueStallCount: ").append(toIndentedString(seDpVnicRestartOnQueueStallCount)).append("\n");
                        sb.append("    seDpVnicStallSeRestartWindow: ").append(toIndentedString(seDpVnicStallSeRestartWindow)).append("\n");
                        sb.append("    seDpdkPmd: ").append(toIndentedString(seDpdkPmd)).append("\n");
                        sb.append("    seDumpCoreOnAssert: ").append(toIndentedString(seDumpCoreOnAssert)).append("\n");
                        sb.append("    seEmulatedCores: ").append(toIndentedString(seEmulatedCores)).append("\n");
                        sb.append("    seFlowProbeRetries: ").append(toIndentedString(seFlowProbeRetries)).append("\n");
                        sb.append("    seFlowProbeRetryTimer: ").append(toIndentedString(seFlowProbeRetryTimer)).append("\n");
                        sb.append("    seGroupAnalyticsPolicy: ").append(toIndentedString(seGroupAnalyticsPolicy)).append("\n");
                        sb.append("    seHyperthreadedMode: ").append(toIndentedString(seHyperthreadedMode)).append("\n");
                        sb.append("    seIpEncapIpc: ").append(toIndentedString(seIpEncapIpc)).append("\n");
                        sb.append("    seKniBurstFactor: ").append(toIndentedString(seKniBurstFactor)).append("\n");
                        sb.append("    seL3EncapIpc: ").append(toIndentedString(seL3EncapIpc)).append("\n");
                        sb.append("    seLogBufferAppBlockingDequeue: ").append(toIndentedString(seLogBufferAppBlockingDequeue)).append("\n");
                        sb.append("    seLogBufferConnBlockingDequeue: ").append(toIndentedString(seLogBufferConnBlockingDequeue)).append("\n");
                        sb.append("    seLogBufferEventsBlockingDequeue: ").append(toIndentedString(seLogBufferEventsBlockingDequeue)).append("\n");
                        sb.append("    seLro: ").append(toIndentedString(seLro)).append("\n");
                        sb.append("    seMpRingRetryCount: ").append(toIndentedString(seMpRingRetryCount)).append("\n");
                        sb.append("    seMtu: ").append(toIndentedString(seMtu)).append("\n");
                        sb.append("    seNamePrefix: ").append(toIndentedString(seNamePrefix)).append("\n");
                        sb.append("    sePacketBufferMax: ").append(toIndentedString(sePacketBufferMax)).append("\n");
                        sb.append("    sePcapLookahead: ").append(toIndentedString(sePcapLookahead)).append("\n");
                        sb.append("    sePcapPktCount: ").append(toIndentedString(sePcapPktCount)).append("\n");
                        sb.append("    sePcapPktSz: ").append(toIndentedString(sePcapPktSz)).append("\n");
                        sb.append("    sePcapQdiscBypass: ").append(toIndentedString(sePcapQdiscBypass)).append("\n");
                        sb.append("    sePcapReinitFrequency: ").append(toIndentedString(sePcapReinitFrequency)).append("\n");
                        sb.append("    sePcapReinitThreshold: ").append(toIndentedString(sePcapReinitThreshold)).append("\n");
                        sb.append("    seProbePort: ").append(toIndentedString(seProbePort)).append("\n");
                        sb.append("    seRlProp: ").append(toIndentedString(seRlProp)).append("\n");
                        sb.append("    seRumSamplingNavInterval: ").append(toIndentedString(seRumSamplingNavInterval)).append("\n");
                        sb.append("    seRumSamplingNavPercent: ").append(toIndentedString(seRumSamplingNavPercent)).append("\n");
                        sb.append("    seRumSamplingResInterval: ").append(toIndentedString(seRumSamplingResInterval)).append("\n");
                        sb.append("    seRumSamplingResPercent: ").append(toIndentedString(seRumSamplingResPercent)).append("\n");
                        sb.append("    seSbDedicatedCore: ").append(toIndentedString(seSbDedicatedCore)).append("\n");
                        sb.append("    seSbThreads: ").append(toIndentedString(seSbThreads)).append("\n");
                        sb.append("    seThreadMultiplier: ").append(toIndentedString(seThreadMultiplier)).append("\n");
                        sb.append("    seTimeTrackerProps: ").append(toIndentedString(seTimeTrackerProps)).append("\n");
                        sb.append("    seTracertPortRange: ").append(toIndentedString(seTracertPortRange)).append("\n");
                        sb.append("    seTunnelMode: ").append(toIndentedString(seTunnelMode)).append("\n");
                        sb.append("    seTunnelUdpPort: ").append(toIndentedString(seTunnelUdpPort)).append("\n");
                        sb.append("    seTxBatchSize: ").append(toIndentedString(seTxBatchSize)).append("\n");
                        sb.append("    seTxqThreshold: ").append(toIndentedString(seTxqThreshold)).append("\n");
                        sb.append("    seUdpEncapIpc: ").append(toIndentedString(seUdpEncapIpc)).append("\n");
                        sb.append("    seUseDpdk: ").append(toIndentedString(seUseDpdk)).append("\n");
                        sb.append("    seVnicTxSwQueueFlushFrequency: ").append(toIndentedString(seVnicTxSwQueueFlushFrequency)).append("\n");
                        sb.append("    seVnicTxSwQueueSize: ").append(toIndentedString(seVnicTxSwQueueSize)).append("\n");
                        sb.append("    seVsHbMaxPktsInBatch: ").append(toIndentedString(seVsHbMaxPktsInBatch)).append("\n");
                        sb.append("    seVsHbMaxVsInPkt: ").append(toIndentedString(seVsHbMaxVsInPkt)).append("\n");
                        sb.append("    selfSeElection: ").append(toIndentedString(selfSeElection)).append("\n");
                        sb.append("    sendSeReadyTimeout: ").append(toIndentedString(sendSeReadyTimeout)).append("\n");
                        sb.append("    serviceIp6Subnets: ").append(toIndentedString(serviceIp6Subnets)).append("\n");
                        sb.append("    serviceIpSubnets: ").append(toIndentedString(serviceIpSubnets)).append("\n");
                        sb.append("    shmMinimumConfigMemory: ").append(toIndentedString(shmMinimumConfigMemory)).append("\n");
                        sb.append("    significantLogThrottle: ").append(toIndentedString(significantLogThrottle)).append("\n");
                        sb.append("    sslPreprocessSniHostname: ").append(toIndentedString(sslPreprocessSniHostname)).append("\n");
                        sb.append("    sslSessCachePerVs: ").append(toIndentedString(sslSessCachePerVs)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    transientSharedMemoryMax: ").append(toIndentedString(transientSharedMemoryMax)).append("\n");
                        sb.append("    udfLogThrottle: ").append(toIndentedString(udfLogThrottle)).append("\n");
                        sb.append("    upstreamConnectTimeout: ").append(toIndentedString(upstreamConnectTimeout)).append("\n");
                        sb.append("    upstreamConnpoolEnable: ").append(toIndentedString(upstreamConnpoolEnable)).append("\n");
                        sb.append("    upstreamReadTimeout: ").append(toIndentedString(upstreamReadTimeout)).append("\n");
                        sb.append("    upstreamSendTimeout: ").append(toIndentedString(upstreamSendTimeout)).append("\n");
                                    sb.append("    useDpUtilForScaleout: ").append(toIndentedString(useDpUtilForScaleout)).append("\n");
                        sb.append("    useHyperthreadedCores: ").append(toIndentedString(useHyperthreadedCores)).append("\n");
                        sb.append("    useLegacyNetlink: ").append(toIndentedString(useLegacyNetlink)).append("\n");
                        sb.append("    useObjsync: ").append(toIndentedString(useObjsync)).append("\n");
                        sb.append("    useStandardAlb: ").append(toIndentedString(useStandardAlb)).append("\n");
                        sb.append("    userAgentCacheConfig: ").append(toIndentedString(userAgentCacheConfig)).append("\n");
                        sb.append("    userDefinedMetricAge: ").append(toIndentedString(userDefinedMetricAge)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    vcenterClusters: ").append(toIndentedString(vcenterClusters)).append("\n");
                        sb.append("    vcenterDatastoreMode: ").append(toIndentedString(vcenterDatastoreMode)).append("\n");
                        sb.append("    vcenterDatastores: ").append(toIndentedString(vcenterDatastores)).append("\n");
                        sb.append("    vcenterDatastoresInclude: ").append(toIndentedString(vcenterDatastoresInclude)).append("\n");
                        sb.append("    vcenterFolder: ").append(toIndentedString(vcenterFolder)).append("\n");
                        sb.append("    vcenterHosts: ").append(toIndentedString(vcenterHosts)).append("\n");
                        sb.append("    vcenterParkingVnicPg: ").append(toIndentedString(vcenterParkingVnicPg)).append("\n");
                        sb.append("    vcenters: ").append(toIndentedString(vcenters)).append("\n");
                        sb.append("    vcpusPerSe: ").append(toIndentedString(vcpusPerSe)).append("\n");
                        sb.append("    vipAsg: ").append(toIndentedString(vipAsg)).append("\n");
                        sb.append("    vnicDhcpIpCheckInterval: ").append(toIndentedString(vnicDhcpIpCheckInterval)).append("\n");
                        sb.append("    vnicDhcpIpMaxRetries: ").append(toIndentedString(vnicDhcpIpMaxRetries)).append("\n");
                        sb.append("    vnicIpDeleteInterval: ").append(toIndentedString(vnicIpDeleteInterval)).append("\n");
                        sb.append("    vnicProbeInterval: ").append(toIndentedString(vnicProbeInterval)).append("\n");
                        sb.append("    vnicRpcRetryInterval: ").append(toIndentedString(vnicRpcRetryInterval)).append("\n");
                        sb.append("    vnicdbCmdHistorySize: ").append(toIndentedString(vnicdbCmdHistorySize)).append("\n");
                        sb.append("    vsHostRedundancy: ").append(toIndentedString(vsHostRedundancy)).append("\n");
                        sb.append("    vsScaleinTimeout: ").append(toIndentedString(vsScaleinTimeout)).append("\n");
                        sb.append("    vsScaleinTimeoutForUpgrade: ").append(toIndentedString(vsScaleinTimeoutForUpgrade)).append("\n");
                        sb.append("    vsScaleoutTimeout: ").append(toIndentedString(vsScaleoutTimeout)).append("\n");
                        sb.append("    vsSePrimarySwitchoverAdditionalWaitTime: ").append(toIndentedString(vsSePrimarySwitchoverAdditionalWaitTime)).append("\n");
                        sb.append("    vsSeScaleinAdditionalWaitTime: ").append(toIndentedString(vsSeScaleinAdditionalWaitTime)).append("\n");
                        sb.append("    vsSeScaleoutAdditionalWaitTime: ").append(toIndentedString(vsSeScaleoutAdditionalWaitTime)).append("\n");
                        sb.append("    vsSeScaleoutReadyTimeout: ").append(toIndentedString(vsSeScaleoutReadyTimeout)).append("\n");
                        sb.append("    vsSwitchoverTimeout: ").append(toIndentedString(vsSwitchoverTimeout)).append("\n");
                        sb.append("    vssPlacement: ").append(toIndentedString(vssPlacement)).append("\n");
                        sb.append("    vssPlacementEnabled: ").append(toIndentedString(vssPlacementEnabled)).append("\n");
                        sb.append("    wafMempool: ").append(toIndentedString(wafMempool)).append("\n");
                        sb.append("    wafMempoolSize: ").append(toIndentedString(wafMempoolSize)).append("\n");
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
