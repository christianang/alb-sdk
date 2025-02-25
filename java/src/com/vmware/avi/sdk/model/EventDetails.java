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
 * The EventDetails is a POJO class extends AviRestResource that used for creating
 * EventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventDetails  {
    @JsonProperty("adaptrepl_event")
    private AdaptReplEventInfo adaptreplEvent;

    @JsonProperty("add_networks_details")
    private RmAddNetworksEventDetails addNetworksDetails;

    @JsonProperty("albservices_case_details")
    private ALBServicesCase albservicesCaseDetails;

    @JsonProperty("albservices_file_download_details")
    private ALBServicesFileDownload albservicesFileDownloadDetails;

    @JsonProperty("albservices_file_upload_details")
    private ALBServicesFileUpload albservicesFileUploadDetails;

    @JsonProperty("albservices_status_details")
    private ALBServicesStatusDetails albservicesStatusDetails;

    @JsonProperty("all_seupgrade_event_details")
    private AllSeUpgradeEventDetails allSeupgradeEventDetails;

    @JsonProperty("anomaly_details")
    private AnomalyEventDetails anomalyDetails;

    @JsonProperty("api_version_deprecated")
    private ApiVersionDeprecated apiVersionDeprecated;

    @JsonProperty("app_signature_event_data")
    private AppSignatureEventData appSignatureEventData;

    @JsonProperty("attach_ip_status_details")
    private AttachIpStatusEventDetails attachIpStatusDetails;

    @JsonProperty("avg_uptime_change_details")
    private AvgUptimeChangeDetails avgUptimeChangeDetails;

    @JsonProperty("aws_asg_deletion_details")
    private AWSASGDelete awsAsgDeletionDetails;

    @JsonProperty("aws_asg_notif_details")
    private AWSASGNotifDetails awsAsgNotifDetails;

    @JsonProperty("aws_infra_details")
    private AWSSetup awsInfraDetails;

    @JsonProperty("azure_info")
    private AzureSetup azureInfo;

    @JsonProperty("azure_mp_info")
    private AzureMarketplace azureMpInfo;

    @JsonProperty("bind_vs_se_details")
    private RmBindVsSeEventDetails bindVsSeDetails;

    @JsonProperty("bm_infra_details")
    private BMSetup bmInfraDetails;

    @JsonProperty("bootup_fail_details")
    private RmSeBootupFailEventDetails bootupFailDetails;

    @JsonProperty("burst_checkout_details")
    private BurstLicenseDetails burstCheckoutDetails;

    @JsonProperty("cc_cluster_vip_details")
    private CloudClusterVip ccClusterVipDetails;

    @JsonProperty("cc_dns_update_details")
    private CloudDnsUpdate ccDnsUpdateDetails;

    @JsonProperty("cc_health_details")
    private CloudHealth ccHealthDetails;

    @JsonProperty("cc_infra_details")
    private CloudGeneric ccInfraDetails;

    @JsonProperty("cc_ip_details")
    private CloudIpChange ccIpDetails;

    @JsonProperty("cc_parkintf_details")
    private CloudVipParkingIntf ccParkintfDetails;

    @JsonProperty("cc_scaleset_notif_details")
    private CCScaleSetNotifDetails ccScalesetNotifDetails;

    @JsonProperty("cc_se_vm_details")
    private CloudSeVmChange ccSeVmDetails;

    @JsonProperty("cc_sync_services_details")
    private CloudSyncServices ccSyncServicesDetails;

    @JsonProperty("cc_tenant_del_details")
    private CloudTenantsDeleted ccTenantDelDetails;

    @JsonProperty("cc_vip_update_details")
    private CloudVipUpdate ccVipUpdateDetails;

    @JsonProperty("cc_vnic_details")
    private CloudVnicChange ccVnicDetails;

    @JsonProperty("central_license_refresh_details")
    private CentralLicenseRefreshDetails centralLicenseRefreshDetails;

    @JsonProperty("central_license_subscription_details")
    private CentralLicenseSubscriptionDetails centralLicenseSubscriptionDetails;

    @JsonProperty("cloud_asg_notif_details")
    private CloudASGNotifDetails cloudAsgNotifDetails;

    @JsonProperty("cloud_autoscaling_config_failure_details")
    private CloudAutoscalingConfigFailureDetails cloudAutoscalingConfigFailureDetails;

    @JsonProperty("cloud_route_notif_details")
    private CloudRouteNotifDetails cloudRouteNotifDetails;

    @JsonProperty("cluster_config_failed_details")
    private ClusterConfigFailedEvent clusterConfigFailedDetails;

    @JsonProperty("cluster_leader_failover_details")
    private ClusterLeaderFailoverEvent clusterLeaderFailoverDetails;

    @JsonProperty("cluster_node_add_details")
    private ClusterNodeAddEvent clusterNodeAddDetails;

    @JsonProperty("cluster_node_db_failed_details")
    private ClusterNodeDbFailedEvent clusterNodeDbFailedDetails;

    @JsonProperty("cluster_node_remove_details")
    private ClusterNodeRemoveEvent clusterNodeRemoveDetails;

    @JsonProperty("cluster_node_shutdown_details")
    private ClusterNodeShutdownEvent clusterNodeShutdownDetails;

    @JsonProperty("cluster_node_started_details")
    private ClusterNodeStartedEvent clusterNodeStartedDetails;

    @JsonProperty("cluster_service_critical_failure_details")
    private ClusterServiceCriticalFailureEvent clusterServiceCriticalFailureDetails;

    @JsonProperty("cluster_service_failed_details")
    private ClusterServiceFailedEvent clusterServiceFailedDetails;

    @JsonProperty("cluster_service_restored_details")
    private ClusterServiceRestoredEvent clusterServiceRestoredDetails;

    @JsonProperty("clustify_check_details")
    private ClustifyCheckEvent clustifyCheckDetails;

    @JsonProperty("cntlr_host_list_details")
    private VinfraCntlrHostUnreachableList cntlrHostListDetails;

    @JsonProperty("config_action_details")
    private ConfigActionDetails configActionDetails;

    @JsonProperty("config_create_details")
    private ConfigCreateDetails configCreateDetails;

    @JsonProperty("config_delete_details")
    private ConfigDeleteDetails configDeleteDetails;

    @JsonProperty("config_password_change_request_details")
    private ConfigUserPasswordChangeRequest configPasswordChangeRequestDetails;

    @JsonProperty("config_se_grp_flv_update_details")
    private ConfigSeGrpFlvUpdate configSeGrpFlvUpdateDetails;

    @JsonProperty("config_update_details")
    private ConfigUpdateDetails configUpdateDetails;

    @JsonProperty("config_user_authrz_rule_details")
    private ConfigUserAuthrzByRule configUserAuthrzRuleDetails;

    @JsonProperty("config_user_login_details")
    private ConfigUserLogin configUserLoginDetails;

    @JsonProperty("config_user_logout_details")
    private ConfigUserLogout configUserLogoutDetails;

    @JsonProperty("config_user_not_authrz_rule_details")
    private ConfigUserNotAuthrzByRule configUserNotAuthrzRuleDetails;

    @JsonProperty("connection_event")
    private ConnectionEventDetails connectionEvent;

    @JsonProperty("container_cloud_batch_setup")
    private ContainerCloudBatchSetup containerCloudBatchSetup;

    @JsonProperty("container_cloud_setup")
    private ContainerCloudSetup containerCloudSetup;

    @JsonProperty("container_cloud_sevice")
    private ContainerCloudService containerCloudSevice;

    @JsonProperty("controller_discontinuous_time_change_event_details")
    private ControllerDiscontinuousTimeChangeEventDetails controllerDiscontinuousTimeChangeEventDetails;

    @JsonProperty("controller_license_reconcile_details")
    private ControllerLicenseReconcileDetails controllerLicenseReconcileDetails;

    @JsonProperty("crs_deployment_failure")
    private CRSDeploymentFailure crsDeploymentFailure;

    @JsonProperty("crs_deployment_success")
    private CRSDeploymentSuccess crsDeploymentSuccess;

    @JsonProperty("crs_details")
    private CRSDetails crsDetails;

    @JsonProperty("crs_update_details")
    private CRSUpdateDetails crsUpdateDetails;

    @JsonProperty("cs_infra_details")
    private CloudStackSetup csInfraDetails;

    @JsonProperty("database_event_info")
    private DatabaseEventInfo databaseEventInfo;

    @JsonProperty("delete_se_details")
    private RmDeleteSeEventDetails deleteSeDetails;

    @JsonProperty("detach_ip_status_details")
    private DetachIpStatusEventDetails detachIpStatusDetails;

    @JsonProperty("disable_se_migrate_details")
    private DisableSeMigrateEventDetails disableSeMigrateDetails;

    @JsonProperty("disc_summary")
    private VinfraDiscSummaryDetails discSummary;

    @JsonProperty("disk_cleanup_event_details")
    private LogMgrCleanupEventDetails diskCleanupEventDetails;

    @JsonProperty("dns_query_error")
    private DNSQueryError dnsQueryError;

    @JsonProperty("dns_sync_info")
    private DNSVsSyncInfo dnsSyncInfo;

    @JsonProperty("docker_ucp_details")
    private DockerUCPSetup dockerUcpDetails;

    @JsonProperty("dos_attack_event_details")
    private DosAttackEventDetails dosAttackEventDetails;

    @JsonProperty("false_positive_details")
    private FalsePositiveDetails falsePositiveDetails;

    @JsonProperty("gcp_cloud_router_info")
    private GCPCloudRouterUpdate gcpCloudRouterInfo;

    @JsonProperty("gcp_info")
    private GCPSetup gcpInfo;

    @JsonProperty("generic_audit_compliance_event_info")
    private AuditComplianceEventInfo genericAuditComplianceEventInfo;

    @JsonProperty("glb_info")
    private GslbStatus glbInfo;

    @JsonProperty("gs_info")
    private GslbServiceStatus gsInfo;

    @JsonProperty("host_unavail_details")
    private HostUnavailEventDetails hostUnavailDetails;

    @JsonProperty("hs_details")
    private HealthScoreDetails hsDetails;

    @JsonProperty("ip_fail_details")
    private RmSeIpFailEventDetails ipFailDetails;

    @JsonProperty("ip_threat_db_event_data")
    private IPThreatDBEventData ipThreatDbEventData;

    @JsonProperty("license_details")
    private LicenseDetails licenseDetails;

    @JsonProperty("license_expiry_details")
    private LicenseExpiryDetails licenseExpiryDetails;

    @JsonProperty("license_tier_switch_details")
    private LicenseTierSwitchDetiails licenseTierSwitchDetails;

    @JsonProperty("license_transaction_details")
    private LicenseTransactionDetails licenseTransactionDetails;

    @JsonProperty("log_agent_event_details")
    private LogAgentEventDetail logAgentEventDetails;

    @JsonProperty("marathon_service_port_conflict_details")
    private MarathonServicePortConflict marathonServicePortConflictDetails;

    @JsonProperty("memory_balancer_info")
    private MemoryBalancerInfo memoryBalancerInfo;

    @JsonProperty("mesos_infra_details")
    private MesosSetup mesosInfraDetails;

    @JsonProperty("metric_threshold_up_details")
    private MetricThresoldUpDetails metricThresholdUpDetails;

    @JsonProperty("metrics_db_disk_details")
    private MetricsDbDiskEventDetails metricsDbDiskDetails;

    @JsonProperty("metrics_db_queue_full_details")
    private MetricsDbQueueFullEventDetails metricsDbQueueFullDetails;

    @JsonProperty("metrics_db_queue_healthy_details")
    private MetricsDbQueueHealthyEventDetails metricsDbQueueHealthyDetails;

    @JsonProperty("metrics_db_sync_failure_details")
    private MetricsDbSyncFailureEventDetails metricsDbSyncFailureDetails;

    @JsonProperty("metrics_grpc_auth_failure_details")
    private MetricsGRPCAuthFailureDetails metricsGrpcAuthFailureDetails;

    @JsonProperty("mgmt_nw_change_details")
    private VinfraMgmtNwChangeDetails mgmtNwChangeDetails;

    @JsonProperty("modify_networks_details")
    private RmModifyNetworksEventDetails modifyNetworksDetails;

    @JsonProperty("network_subnet_details")
    private NetworkSubnetInfo networkSubnetDetails;

    @JsonProperty("nsxt_endpoint_details")
    private NsxtSIEndpointDetails nsxtEndpointDetails;

    @JsonProperty("nsxt_img_details")
    private NsxtImageDetails nsxtImgDetails;

    @JsonProperty("nsxt_info")
    private NsxtSetup nsxtInfo;

    @JsonProperty("nsxt_policy_details")
    private NsxtSIPolicyDetails nsxtPolicyDetails;

    @JsonProperty("nsxt_rule_details")
    private NsxtSIRuleDetails nsxtRuleDetails;

    @JsonProperty("nsxt_service_details")
    private NsxtSIServiceDetails nsxtServiceDetails;

    @JsonProperty("nsxt_t1_seg_details")
    private NsxtT1SegDetails nsxtT1SegDetails;

    @JsonProperty("nw_subnet_clash_details")
    private NetworkSubnetClash nwSubnetClashDetails;

    @JsonProperty("nw_summarized_details")
    private SummarizedInfo nwSummarizedDetails;

    @JsonProperty("oci_info")
    private OCISetup ociInfo;

    @JsonProperty("os_api_ver_check_failure")
    private OpenStackApiVersionCheckFailure osApiVerCheckFailure;

    @JsonProperty("os_infra_details")
    private OpenStackClusterSetup osInfraDetails;

    @JsonProperty("os_ip_details")
    private OpenStackIpChange osIpDetails;

    @JsonProperty("os_lbaudit_details")
    private OpenStackLbProvAuditCheck osLbauditDetails;

    @JsonProperty("os_lbplugin_op_details")
    private OpenStackLbPluginOp osLbpluginOpDetails;

    @JsonProperty("os_se_vm_details")
    private OpenStackSeVmChange osSeVmDetails;

    @JsonProperty("os_sync_services_details")
    private OpenStackSyncServices osSyncServicesDetails;

    @JsonProperty("os_vnic_details")
    private OpenStackVnicChange osVnicDetails;

    @JsonProperty("pkiprofile_details")
    private PKIProfileDetails pkiprofileDetails;

    @JsonProperty("pool_deployment_failure_info")
    private PoolDeploymentFailureInfo poolDeploymentFailureInfo;

    @JsonProperty("pool_deployment_success_info")
    private PoolDeploymentSuccessInfo poolDeploymentSuccessInfo;

    @JsonProperty("pool_deployment_update_info")
    private PoolDeploymentUpdateInfo poolDeploymentUpdateInfo;

    @JsonProperty("pool_server_delete_details")
    private VinfraPoolServerDeleteDetails poolServerDeleteDetails;

    @JsonProperty("psm_program_details")
    private PsmProgramDetails psmProgramDetails;

    @JsonProperty("rate_limiter_event_details")
    private RateLimiterEventDetails rateLimiterEventDetails;

    @JsonProperty("rebalance_migrate_details")
    private RebalanceMigrateEventDetails rebalanceMigrateDetails;

    @JsonProperty("rebalance_scalein_details")
    private RebalanceScaleinEventDetails rebalanceScaleinDetails;

    @JsonProperty("rebalance_scaleout_details")
    private RebalanceScaleoutEventDetails rebalanceScaleoutDetails;

    @JsonProperty("reboot_se_details")
    private RmRebootSeEventDetails rebootSeDetails;

    @JsonProperty("saml_metadata_failed_events")
    private SamlMetadataUpdateFailedDetails samlMetadataFailedEvents;

    @JsonProperty("scheduler_action_info")
    private SchedulerActionDetails schedulerActionInfo;

    @JsonProperty("se_bgp_peer_down_details")
    private SeBgpPeerDownDetails seBgpPeerDownDetails;

    @JsonProperty("se_bgp_peer_state_change_details")
    private SeBgpPeerStateChangeDetails seBgpPeerStateChangeDetails;

    @JsonProperty("se_debug_mode_event_detail")
    private SeDebugModeEventDetail seDebugModeEventDetail;

    @JsonProperty("se_details")
    private SeMgrEventDetails seDetails;

    @JsonProperty("se_discontinuous_time_change_event_details")
    private SeDiscontinuousTimeChangeEventDetails seDiscontinuousTimeChangeEventDetails;

    @JsonProperty("se_dupip_event_details")
    private SeDupipEventDetails seDupipEventDetails;

    @JsonProperty("se_gateway_heartbeat_failed_details")
    private SeGatewayHeartbeatFailedDetails seGatewayHeartbeatFailedDetails;

    @JsonProperty("se_gateway_heartbeat_success_details")
    private SeGatewayHeartbeatSuccessDetails seGatewayHeartbeatSuccessDetails;

    @JsonProperty("se_geo_db_details")
    private SeGeoDbDetails seGeoDbDetails;

    @JsonProperty("se_hb_event_details")
    private SeHBEventDetails seHbEventDetails;

    @JsonProperty("se_hb_recovered_event_details")
    private SeHbRecoveredEventDetails seHbRecoveredEventDetails;

    @JsonProperty("se_high_egress_proc_latency_event_details")
    private SeHighEgressProcLatencyEventDetails seHighEgressProcLatencyEventDetails;

    @JsonProperty("se_high_ingress_proc_latency_event_details")
    private SeHighIngressProcLatencyEventDetails seHighIngressProcLatencyEventDetails;

    @JsonProperty("se_hm_gs_details")
    private SeHmEventGSDetails seHmGsDetails;

    @JsonProperty("se_hm_gsgroup_details")
    private SeHmEventGslbPoolDetails seHmGsgroupDetails;

    @JsonProperty("se_hm_pool_details")
    private SeHmEventPoolDetails seHmPoolDetails;

    @JsonProperty("se_hm_vs_details")
    private SeHmEventVsDetails seHmVsDetails;

    @JsonProperty("se_ip6_dad_failed_event_details")
    private SeIP6DadFailedEventDetails seIp6DadFailedEventDetails;

    @JsonProperty("se_ip_added_event_details")
    private SeIpAddedEventDetails seIpAddedEventDetails;

    @JsonProperty("se_ip_removed_event_details")
    private SeIpRemovedEventDetails seIpRemovedEventDetails;

    @JsonProperty("se_ipfailure_event_details")
    private SeIpfailureEventDetails seIpfailureEventDetails;

    @JsonProperty("se_licensed_bandwdith_exceeded_event_details")
    private SeLicensedBandwdithExceededEventDetails seLicensedBandwdithExceededEventDetails;

    @JsonProperty("se_memory_limit_event_details")
    private SeMemoryLimitEventDetails seMemoryLimitEventDetails;

    @JsonProperty("se_ntp_synchronization_failed")
    private SeNtpSynchronizationFailed seNtpSynchronizationFailed;

    @JsonProperty("se_objsync_peer_down_details")
    private SeObjsyncPeerDownDetails seObjsyncPeerDownDetails;

    @JsonProperty("se_persistence_details")
    private SePersistenceEventDetails sePersistenceDetails;

    @JsonProperty("se_pool_lb_details")
    private SePoolLbEventDetails sePoolLbDetails;

    @JsonProperty("se_reconcile_details")
    private SeReconcileDetails seReconcileDetails;

    @JsonProperty("se_thresh_event_details")
    private SeThreshEventDetails seThreshEventDetails;

    @JsonProperty("se_vnic_down_event_details")
    private SeVnicDownEventDetails seVnicDownEventDetails;

    @JsonProperty("se_vnic_tx_queue_stall_event_details")
    private SeVnicTxQueueStallEventDetails seVnicTxQueueStallEventDetails;

    @JsonProperty("se_vnic_up_event_details")
    private SeVnicUpEventDetails seVnicUpEventDetails;

    @JsonProperty("se_vs_del_flows_disrupted")
    private SeVsDelFlowsDisrupted seVsDelFlowsDisrupted;

    @JsonProperty("se_vs_fault_event_details")
    private SeVsFaultEventDetails seVsFaultEventDetails;

    @JsonProperty("se_vs_pkt_buf_high_event_details")
    private SeVsPktBufHighEventDetails seVsPktBufHighEventDetails;

    @JsonProperty("sec_mgr_data_event")
    private SecMgrDataEvent secMgrDataEvent;

    @JsonProperty("sec_mgr_ua_event_details")
    private SecMgrUAEventDetails secMgrUaEventDetails;

    @JsonProperty("secure_key_exchange_info")
    private SecureKeyExchangeDetails secureKeyExchangeInfo;

    @JsonProperty("semigrate_event_details")
    private SeMigrateEventDetails semigrateEventDetails;

    @JsonProperty("server_autoscale_failed_info")
    private ServerAutoScaleFailedInfo serverAutoscaleFailedInfo;

    @JsonProperty("server_autoscalein_complete_info")
    private ServerAutoScaleInCompleteInfo serverAutoscaleinCompleteInfo;

    @JsonProperty("server_autoscalein_info")
    private ServerAutoScaleInInfo serverAutoscaleinInfo;

    @JsonProperty("server_autoscaleout_complete_info")
    private ServerAutoScaleOutCompleteInfo serverAutoscaleoutCompleteInfo;

    @JsonProperty("server_autoscaleout_info")
    private ServerAutoScaleOutInfo serverAutoscaleoutInfo;

    @JsonProperty("seupgrade_disrupted_details")
    private SeUpgradeVsDisruptedEventDetails seupgradeDisruptedDetails;

    @JsonProperty("seupgrade_event_details")
    private SeUpgradeEventDetails seupgradeEventDetails;

    @JsonProperty("seupgrade_migrate_details")
    private SeUpgradeMigrateEventDetails seupgradeMigrateDetails;

    @JsonProperty("seupgrade_scalein_details")
    private SeUpgradeScaleinEventDetails seupgradeScaleinDetails;

    @JsonProperty("seupgrade_scaleout_details")
    private SeUpgradeScaleoutEventDetails seupgradeScaleoutDetails;

    @JsonProperty("spawn_se_details")
    private RmSpawnSeEventDetails spawnSeDetails;

    @JsonProperty("ssl_expire_details")
    private SSLExpireDetails sslExpireDetails;

    @JsonProperty("ssl_export_details")
    private SSLExportDetails sslExportDetails;

    @JsonProperty("ssl_ignored_details")
    private SSLIgnoredDetails sslIgnoredDetails;

    @JsonProperty("ssl_renew_details")
    private SSLRenewDetails sslRenewDetails;

    @JsonProperty("ssl_renew_failed_details")
    private SSLRenewFailedDetails sslRenewFailedDetails;

    @JsonProperty("ssl_revoked_details")
    private SSLRevokedDetails sslRevokedDetails;

    @JsonProperty("switchover_details")
    private SwitchoverEventDetails switchoverDetails;

    @JsonProperty("switchover_fail_details")
    private SwitchoverFailEventDetails switchoverFailDetails;

    @JsonProperty("sync_services_info")
    private CloudSyncServices syncServicesInfo;

    @JsonProperty("tencent_info")
    private TencentSetup tencentInfo;

    @JsonProperty("unbind_vs_se_details")
    private RmUnbindVsSeEventDetails unbindVsSeDetails;

    @JsonProperty("upgrade_entry")
    private UpgradeOpsEntry upgradeEntry;

    @JsonProperty("upgrade_status_info")
    private UpgradeStatusInfo upgradeStatusInfo;

    @JsonProperty("vca_infra_details")
    private VCASetup vcaInfraDetails;

    @JsonProperty("vcenter_cloud_delete_details")
    private VcenterCloudDeleteDetails vcenterCloudDeleteDetails;

    @JsonProperty("vcenter_cluster_details")
    private VcenterClusterDetails vcenterClusterDetails;

    @JsonProperty("vcenter_connectivity_status")
    private VinfraVcenterConnectivityStatus vcenterConnectivityStatus;

    @JsonProperty("vcenter_details")
    private VinfraVcenterBadCredentials vcenterDetails;

    @JsonProperty("vcenter_disc_failure")
    private VinfraVcenterDiscoveryFailure vcenterDiscFailure;

    @JsonProperty("vcenter_img_details")
    private VcenterImageDetails vcenterImgDetails;

    @JsonProperty("vcenter_network_limit")
    private VinfraVcenterNetworkLimit vcenterNetworkLimit;

    @JsonProperty("vcenter_obj_delete_details")
    private VinfraVcenterObjDeleteDetails vcenterObjDeleteDetails;

    @JsonProperty("vcenter_tag_event_details")
    private VcenterTagEventDetails vcenterTagEventDetails;

    @JsonProperty("vip_autoscale")
    private VipScaleDetails vipAutoscale;

    @JsonProperty("vip_dns_info")
    private DNSRegisterInfo vipDnsInfo;

    @JsonProperty("vip_symmetry_details")
    private VipSymmetryDetails vipSymmetryDetails;

    @JsonProperty("vm_details")
    private VinfraVmDetails vmDetails;

    @JsonProperty("vs_awaitingse_details")
    private VsAwaitingSeEventDetails vsAwaitingseDetails;

    @JsonProperty("vs_error_details")
    private VsErrorEventDetails vsErrorDetails;

    @JsonProperty("vs_fsm_details")
    private VsFsmEventDetails vsFsmDetails;

    @JsonProperty("vs_initialplacement_details")
    private VsInitialPlacementEventDetails vsInitialplacementDetails;

    @JsonProperty("vs_migrate_details")
    private VsMigrateEventDetails vsMigrateDetails;

    @JsonProperty("vs_pool_nw_fltr_details")
    private VsPoolNwFilterEventDetails vsPoolNwFltrDetails;

    @JsonProperty("vs_scalein_details")
    private VsScaleInEventDetails vsScaleinDetails;

    @JsonProperty("vs_scaleout_details")
    private VsScaleOutEventDetails vsScaleoutDetails;

    @JsonProperty("vs_switchover_details")
    private VsSwitchoverEventDetails vsSwitchoverDetails;



    /**
     * This is the getter method this will return the attribute value.
     * Adaptive replication event e.g.
     * Dns vs, config version.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return adaptreplEvent
     */
    public AdaptReplEventInfo getAdaptreplEvent() {
        return adaptreplEvent;
    }

    /**
     * This is the setter method to the attribute.
     * Adaptive replication event e.g.
     * Dns vs, config version.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param adaptreplEvent set the adaptreplEvent.
     */
    public void setAdaptreplEvent(AdaptReplEventInfo adaptreplEvent) {
        this.adaptreplEvent = adaptreplEvent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return addNetworksDetails
     */
    public RmAddNetworksEventDetails getAddNetworksDetails() {
        return addNetworksDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param addNetworksDetails set the addNetworksDetails.
     */
    public void setAddNetworksDetails(RmAddNetworksEventDetails addNetworksDetails) {
        this.addNetworksDetails = addNetworksDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return albservicesCaseDetails
     */
    public ALBServicesCase getAlbservicesCaseDetails() {
        return albservicesCaseDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param albservicesCaseDetails set the albservicesCaseDetails.
     */
    public void setAlbservicesCaseDetails(ALBServicesCase albservicesCaseDetails) {
        this.albservicesCaseDetails = albservicesCaseDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Albservices file download event details.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return albservicesFileDownloadDetails
     */
    public ALBServicesFileDownload getAlbservicesFileDownloadDetails() {
        return albservicesFileDownloadDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Albservices file download event details.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param albservicesFileDownloadDetails set the albservicesFileDownloadDetails.
     */
    public void setAlbservicesFileDownloadDetails(ALBServicesFileDownload albservicesFileDownloadDetails) {
        this.albservicesFileDownloadDetails = albservicesFileDownloadDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return albservicesFileUploadDetails
     */
    public ALBServicesFileUpload getAlbservicesFileUploadDetails() {
        return albservicesFileUploadDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param albservicesFileUploadDetails set the albservicesFileUploadDetails.
     */
    public void setAlbservicesFileUploadDetails(ALBServicesFileUpload albservicesFileUploadDetails) {
        this.albservicesFileUploadDetails = albservicesFileUploadDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return albservicesStatusDetails
     */
    public ALBServicesStatusDetails getAlbservicesStatusDetails() {
        return albservicesStatusDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param albservicesStatusDetails set the albservicesStatusDetails.
     */
    public void setAlbservicesStatusDetails(ALBServicesStatusDetails albservicesStatusDetails) {
        this.albservicesStatusDetails = albservicesStatusDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allSeupgradeEventDetails
     */
    public AllSeUpgradeEventDetails getAllSeupgradeEventDetails() {
        return allSeupgradeEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param allSeupgradeEventDetails set the allSeupgradeEventDetails.
     */
    public void setAllSeupgradeEventDetails(AllSeUpgradeEventDetails allSeupgradeEventDetails) {
        this.allSeupgradeEventDetails = allSeupgradeEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return anomalyDetails
     */
    public AnomalyEventDetails getAnomalyDetails() {
        return anomalyDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param anomalyDetails set the anomalyDetails.
     */
    public void setAnomalyDetails(AnomalyEventDetails anomalyDetails) {
        this.anomalyDetails = anomalyDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return apiVersionDeprecated
     */
    public ApiVersionDeprecated getApiVersionDeprecated() {
        return apiVersionDeprecated;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param apiVersionDeprecated set the apiVersionDeprecated.
     */
    public void setApiVersionDeprecated(ApiVersionDeprecated apiVersionDeprecated) {
        this.apiVersionDeprecated = apiVersionDeprecated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appSignatureEventData
     */
    public AppSignatureEventData getAppSignatureEventData() {
        return appSignatureEventData;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param appSignatureEventData set the appSignatureEventData.
     */
    public void setAppSignatureEventData(AppSignatureEventData appSignatureEventData) {
        this.appSignatureEventData = appSignatureEventData;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Details for attach ip status.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return attachIpStatusDetails
     */
    public AttachIpStatusEventDetails getAttachIpStatusDetails() {
        return attachIpStatusDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Details for attach ip status.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param attachIpStatusDetails set the attachIpStatusDetails.
     */
    public void setAttachIpStatusDetails(AttachIpStatusEventDetails attachIpStatusDetails) {
        this.attachIpStatusDetails = attachIpStatusDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return avgUptimeChangeDetails
     */
    public AvgUptimeChangeDetails getAvgUptimeChangeDetails() {
        return avgUptimeChangeDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param avgUptimeChangeDetails set the avgUptimeChangeDetails.
     */
    public void setAvgUptimeChangeDetails(AvgUptimeChangeDetails avgUptimeChangeDetails) {
        this.avgUptimeChangeDetails = avgUptimeChangeDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.10,18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return awsAsgDeletionDetails
     */
    public AWSASGDelete getAwsAsgDeletionDetails() {
        return awsAsgDeletionDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.2.10,18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param awsAsgDeletionDetails set the awsAsgDeletionDetails.
     */
    public void setAwsAsgDeletionDetails(AWSASGDelete awsAsgDeletionDetails) {
        this.awsAsgDeletionDetails = awsAsgDeletionDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return awsAsgNotifDetails
     */
    public AWSASGNotifDetails getAwsAsgNotifDetails() {
        return awsAsgNotifDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param awsAsgNotifDetails set the awsAsgNotifDetails.
     */
    public void setAwsAsgNotifDetails(AWSASGNotifDetails awsAsgNotifDetails) {
        this.awsAsgNotifDetails = awsAsgNotifDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return awsInfraDetails
     */
    public AWSSetup getAwsInfraDetails() {
        return awsInfraDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param awsInfraDetails set the awsInfraDetails.
     */
    public void setAwsInfraDetails(AWSSetup awsInfraDetails) {
        this.awsInfraDetails = awsInfraDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return azureInfo
     */
    public AzureSetup getAzureInfo() {
        return azureInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param azureInfo set the azureInfo.
     */
    public void setAzureInfo(AzureSetup azureInfo) {
        this.azureInfo = azureInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Azure marketplace license term acceptance event.
     * Field introduced in 18.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return azureMpInfo
     */
    public AzureMarketplace getAzureMpInfo() {
        return azureMpInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Azure marketplace license term acceptance event.
     * Field introduced in 18.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param azureMpInfo set the azureMpInfo.
     */
    public void setAzureMpInfo(AzureMarketplace azureMpInfo) {
        this.azureMpInfo = azureMpInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return bindVsSeDetails
     */
    public RmBindVsSeEventDetails getBindVsSeDetails() {
        return bindVsSeDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param bindVsSeDetails set the bindVsSeDetails.
     */
    public void setBindVsSeDetails(RmBindVsSeEventDetails bindVsSeDetails) {
        this.bindVsSeDetails = bindVsSeDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return bmInfraDetails
     */
    public BMSetup getBmInfraDetails() {
        return bmInfraDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param bmInfraDetails set the bmInfraDetails.
     */
    public void setBmInfraDetails(BMSetup bmInfraDetails) {
        this.bmInfraDetails = bmInfraDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return bootupFailDetails
     */
    public RmSeBootupFailEventDetails getBootupFailDetails() {
        return bootupFailDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param bootupFailDetails set the bootupFailDetails.
     */
    public void setBootupFailDetails(RmSeBootupFailEventDetails bootupFailDetails) {
        this.bootupFailDetails = bootupFailDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return burstCheckoutDetails
     */
    public BurstLicenseDetails getBurstCheckoutDetails() {
        return burstCheckoutDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param burstCheckoutDetails set the burstCheckoutDetails.
     */
    public void setBurstCheckoutDetails(BurstLicenseDetails burstCheckoutDetails) {
        this.burstCheckoutDetails = burstCheckoutDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccClusterVipDetails
     */
    public CloudClusterVip getCcClusterVipDetails() {
        return ccClusterVipDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccClusterVipDetails set the ccClusterVipDetails.
     */
    public void setCcClusterVipDetails(CloudClusterVip ccClusterVipDetails) {
        this.ccClusterVipDetails = ccClusterVipDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccDnsUpdateDetails
     */
    public CloudDnsUpdate getCcDnsUpdateDetails() {
        return ccDnsUpdateDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccDnsUpdateDetails set the ccDnsUpdateDetails.
     */
    public void setCcDnsUpdateDetails(CloudDnsUpdate ccDnsUpdateDetails) {
        this.ccDnsUpdateDetails = ccDnsUpdateDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccHealthDetails
     */
    public CloudHealth getCcHealthDetails() {
        return ccHealthDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccHealthDetails set the ccHealthDetails.
     */
    public void setCcHealthDetails(CloudHealth ccHealthDetails) {
        this.ccHealthDetails = ccHealthDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccInfraDetails
     */
    public CloudGeneric getCcInfraDetails() {
        return ccInfraDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccInfraDetails set the ccInfraDetails.
     */
    public void setCcInfraDetails(CloudGeneric ccInfraDetails) {
        this.ccInfraDetails = ccInfraDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccIpDetails
     */
    public CloudIpChange getCcIpDetails() {
        return ccIpDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccIpDetails set the ccIpDetails.
     */
    public void setCcIpDetails(CloudIpChange ccIpDetails) {
        this.ccIpDetails = ccIpDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccParkintfDetails
     */
    public CloudVipParkingIntf getCcParkintfDetails() {
        return ccParkintfDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccParkintfDetails set the ccParkintfDetails.
     */
    public void setCcParkintfDetails(CloudVipParkingIntf ccParkintfDetails) {
        this.ccParkintfDetails = ccParkintfDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccScalesetNotifDetails
     */
    public CCScaleSetNotifDetails getCcScalesetNotifDetails() {
        return ccScalesetNotifDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccScalesetNotifDetails set the ccScalesetNotifDetails.
     */
    public void setCcScalesetNotifDetails(CCScaleSetNotifDetails ccScalesetNotifDetails) {
        this.ccScalesetNotifDetails = ccScalesetNotifDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccSeVmDetails
     */
    public CloudSeVmChange getCcSeVmDetails() {
        return ccSeVmDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccSeVmDetails set the ccSeVmDetails.
     */
    public void setCcSeVmDetails(CloudSeVmChange ccSeVmDetails) {
        this.ccSeVmDetails = ccSeVmDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccSyncServicesDetails
     */
    public CloudSyncServices getCcSyncServicesDetails() {
        return ccSyncServicesDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccSyncServicesDetails set the ccSyncServicesDetails.
     */
    public void setCcSyncServicesDetails(CloudSyncServices ccSyncServicesDetails) {
        this.ccSyncServicesDetails = ccSyncServicesDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccTenantDelDetails
     */
    public CloudTenantsDeleted getCcTenantDelDetails() {
        return ccTenantDelDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccTenantDelDetails set the ccTenantDelDetails.
     */
    public void setCcTenantDelDetails(CloudTenantsDeleted ccTenantDelDetails) {
        this.ccTenantDelDetails = ccTenantDelDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccVipUpdateDetails
     */
    public CloudVipUpdate getCcVipUpdateDetails() {
        return ccVipUpdateDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccVipUpdateDetails set the ccVipUpdateDetails.
     */
    public void setCcVipUpdateDetails(CloudVipUpdate ccVipUpdateDetails) {
        this.ccVipUpdateDetails = ccVipUpdateDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccVnicDetails
     */
    public CloudVnicChange getCcVnicDetails() {
        return ccVnicDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccVnicDetails set the ccVnicDetails.
     */
    public void setCcVnicDetails(CloudVnicChange ccVnicDetails) {
        this.ccVnicDetails = ccVnicDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Central license refresh details.
     * Field introduced in 21.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return centralLicenseRefreshDetails
     */
    public CentralLicenseRefreshDetails getCentralLicenseRefreshDetails() {
        return centralLicenseRefreshDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Central license refresh details.
     * Field introduced in 21.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param centralLicenseRefreshDetails set the centralLicenseRefreshDetails.
     */
    public void setCentralLicenseRefreshDetails(CentralLicenseRefreshDetails centralLicenseRefreshDetails) {
        this.centralLicenseRefreshDetails = centralLicenseRefreshDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Central license subscription details.
     * Field introduced in 21.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return centralLicenseSubscriptionDetails
     */
    public CentralLicenseSubscriptionDetails getCentralLicenseSubscriptionDetails() {
        return centralLicenseSubscriptionDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Central license subscription details.
     * Field introduced in 21.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param centralLicenseSubscriptionDetails set the centralLicenseSubscriptionDetails.
     */
    public void setCentralLicenseSubscriptionDetails(CentralLicenseSubscriptionDetails centralLicenseSubscriptionDetails) {
        this.centralLicenseSubscriptionDetails = centralLicenseSubscriptionDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudAsgNotifDetails
     */
    public CloudASGNotifDetails getCloudAsgNotifDetails() {
        return cloudAsgNotifDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudAsgNotifDetails set the cloudAsgNotifDetails.
     */
    public void setCloudAsgNotifDetails(CloudASGNotifDetails cloudAsgNotifDetails) {
        this.cloudAsgNotifDetails = cloudAsgNotifDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudAutoscalingConfigFailureDetails
     */
    public CloudAutoscalingConfigFailureDetails getCloudAutoscalingConfigFailureDetails() {
        return cloudAutoscalingConfigFailureDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudAutoscalingConfigFailureDetails set the cloudAutoscalingConfigFailureDetails.
     */
    public void setCloudAutoscalingConfigFailureDetails(CloudAutoscalingConfigFailureDetails cloudAutoscalingConfigFailureDetails) {
        this.cloudAutoscalingConfigFailureDetails = cloudAutoscalingConfigFailureDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cloud routes event.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudRouteNotifDetails
     */
    public CloudRouteNotifDetails getCloudRouteNotifDetails() {
        return cloudRouteNotifDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Cloud routes event.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudRouteNotifDetails set the cloudRouteNotifDetails.
     */
    public void setCloudRouteNotifDetails(CloudRouteNotifDetails cloudRouteNotifDetails) {
        this.cloudRouteNotifDetails = cloudRouteNotifDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterConfigFailedDetails
     */
    public ClusterConfigFailedEvent getClusterConfigFailedDetails() {
        return clusterConfigFailedDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterConfigFailedDetails set the clusterConfigFailedDetails.
     */
    public void setClusterConfigFailedDetails(ClusterConfigFailedEvent clusterConfigFailedDetails) {
        this.clusterConfigFailedDetails = clusterConfigFailedDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterLeaderFailoverDetails
     */
    public ClusterLeaderFailoverEvent getClusterLeaderFailoverDetails() {
        return clusterLeaderFailoverDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterLeaderFailoverDetails set the clusterLeaderFailoverDetails.
     */
    public void setClusterLeaderFailoverDetails(ClusterLeaderFailoverEvent clusterLeaderFailoverDetails) {
        this.clusterLeaderFailoverDetails = clusterLeaderFailoverDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterNodeAddDetails
     */
    public ClusterNodeAddEvent getClusterNodeAddDetails() {
        return clusterNodeAddDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterNodeAddDetails set the clusterNodeAddDetails.
     */
    public void setClusterNodeAddDetails(ClusterNodeAddEvent clusterNodeAddDetails) {
        this.clusterNodeAddDetails = clusterNodeAddDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterNodeDbFailedDetails
     */
    public ClusterNodeDbFailedEvent getClusterNodeDbFailedDetails() {
        return clusterNodeDbFailedDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterNodeDbFailedDetails set the clusterNodeDbFailedDetails.
     */
    public void setClusterNodeDbFailedDetails(ClusterNodeDbFailedEvent clusterNodeDbFailedDetails) {
        this.clusterNodeDbFailedDetails = clusterNodeDbFailedDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterNodeRemoveDetails
     */
    public ClusterNodeRemoveEvent getClusterNodeRemoveDetails() {
        return clusterNodeRemoveDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterNodeRemoveDetails set the clusterNodeRemoveDetails.
     */
    public void setClusterNodeRemoveDetails(ClusterNodeRemoveEvent clusterNodeRemoveDetails) {
        this.clusterNodeRemoveDetails = clusterNodeRemoveDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterNodeShutdownDetails
     */
    public ClusterNodeShutdownEvent getClusterNodeShutdownDetails() {
        return clusterNodeShutdownDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterNodeShutdownDetails set the clusterNodeShutdownDetails.
     */
    public void setClusterNodeShutdownDetails(ClusterNodeShutdownEvent clusterNodeShutdownDetails) {
        this.clusterNodeShutdownDetails = clusterNodeShutdownDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterNodeStartedDetails
     */
    public ClusterNodeStartedEvent getClusterNodeStartedDetails() {
        return clusterNodeStartedDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterNodeStartedDetails set the clusterNodeStartedDetails.
     */
    public void setClusterNodeStartedDetails(ClusterNodeStartedEvent clusterNodeStartedDetails) {
        this.clusterNodeStartedDetails = clusterNodeStartedDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterServiceCriticalFailureDetails
     */
    public ClusterServiceCriticalFailureEvent getClusterServiceCriticalFailureDetails() {
        return clusterServiceCriticalFailureDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterServiceCriticalFailureDetails set the clusterServiceCriticalFailureDetails.
     */
    public void setClusterServiceCriticalFailureDetails(ClusterServiceCriticalFailureEvent clusterServiceCriticalFailureDetails) {
        this.clusterServiceCriticalFailureDetails = clusterServiceCriticalFailureDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterServiceFailedDetails
     */
    public ClusterServiceFailedEvent getClusterServiceFailedDetails() {
        return clusterServiceFailedDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterServiceFailedDetails set the clusterServiceFailedDetails.
     */
    public void setClusterServiceFailedDetails(ClusterServiceFailedEvent clusterServiceFailedDetails) {
        this.clusterServiceFailedDetails = clusterServiceFailedDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterServiceRestoredDetails
     */
    public ClusterServiceRestoredEvent getClusterServiceRestoredDetails() {
        return clusterServiceRestoredDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterServiceRestoredDetails set the clusterServiceRestoredDetails.
     */
    public void setClusterServiceRestoredDetails(ClusterServiceRestoredEvent clusterServiceRestoredDetails) {
        this.clusterServiceRestoredDetails = clusterServiceRestoredDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clustifyCheckDetails
     */
    public ClustifyCheckEvent getClustifyCheckDetails() {
        return clustifyCheckDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clustifyCheckDetails set the clustifyCheckDetails.
     */
    public void setClustifyCheckDetails(ClustifyCheckEvent clustifyCheckDetails) {
        this.clustifyCheckDetails = clustifyCheckDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cntlrHostListDetails
     */
    public VinfraCntlrHostUnreachableList getCntlrHostListDetails() {
        return cntlrHostListDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cntlrHostListDetails set the cntlrHostListDetails.
     */
    public void setCntlrHostListDetails(VinfraCntlrHostUnreachableList cntlrHostListDetails) {
        this.cntlrHostListDetails = cntlrHostListDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configActionDetails
     */
    public ConfigActionDetails getConfigActionDetails() {
        return configActionDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configActionDetails set the configActionDetails.
     */
    public void setConfigActionDetails(ConfigActionDetails configActionDetails) {
        this.configActionDetails = configActionDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configCreateDetails
     */
    public ConfigCreateDetails getConfigCreateDetails() {
        return configCreateDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configCreateDetails set the configCreateDetails.
     */
    public void setConfigCreateDetails(ConfigCreateDetails configCreateDetails) {
        this.configCreateDetails = configCreateDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configDeleteDetails
     */
    public ConfigDeleteDetails getConfigDeleteDetails() {
        return configDeleteDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configDeleteDetails set the configDeleteDetails.
     */
    public void setConfigDeleteDetails(ConfigDeleteDetails configDeleteDetails) {
        this.configDeleteDetails = configDeleteDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configPasswordChangeRequestDetails
     */
    public ConfigUserPasswordChangeRequest getConfigPasswordChangeRequestDetails() {
        return configPasswordChangeRequestDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configPasswordChangeRequestDetails set the configPasswordChangeRequestDetails.
     */
    public void setConfigPasswordChangeRequestDetails(ConfigUserPasswordChangeRequest configPasswordChangeRequestDetails) {
        this.configPasswordChangeRequestDetails = configPasswordChangeRequestDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configSeGrpFlvUpdateDetails
     */
    public ConfigSeGrpFlvUpdate getConfigSeGrpFlvUpdateDetails() {
        return configSeGrpFlvUpdateDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configSeGrpFlvUpdateDetails set the configSeGrpFlvUpdateDetails.
     */
    public void setConfigSeGrpFlvUpdateDetails(ConfigSeGrpFlvUpdate configSeGrpFlvUpdateDetails) {
        this.configSeGrpFlvUpdateDetails = configSeGrpFlvUpdateDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configUpdateDetails
     */
    public ConfigUpdateDetails getConfigUpdateDetails() {
        return configUpdateDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configUpdateDetails set the configUpdateDetails.
     */
    public void setConfigUpdateDetails(ConfigUpdateDetails configUpdateDetails) {
        this.configUpdateDetails = configUpdateDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configUserAuthrzRuleDetails
     */
    public ConfigUserAuthrzByRule getConfigUserAuthrzRuleDetails() {
        return configUserAuthrzRuleDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configUserAuthrzRuleDetails set the configUserAuthrzRuleDetails.
     */
    public void setConfigUserAuthrzRuleDetails(ConfigUserAuthrzByRule configUserAuthrzRuleDetails) {
        this.configUserAuthrzRuleDetails = configUserAuthrzRuleDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configUserLoginDetails
     */
    public ConfigUserLogin getConfigUserLoginDetails() {
        return configUserLoginDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configUserLoginDetails set the configUserLoginDetails.
     */
    public void setConfigUserLoginDetails(ConfigUserLogin configUserLoginDetails) {
        this.configUserLoginDetails = configUserLoginDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configUserLogoutDetails
     */
    public ConfigUserLogout getConfigUserLogoutDetails() {
        return configUserLogoutDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configUserLogoutDetails set the configUserLogoutDetails.
     */
    public void setConfigUserLogoutDetails(ConfigUserLogout configUserLogoutDetails) {
        this.configUserLogoutDetails = configUserLogoutDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return configUserNotAuthrzRuleDetails
     */
    public ConfigUserNotAuthrzByRule getConfigUserNotAuthrzRuleDetails() {
        return configUserNotAuthrzRuleDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param configUserNotAuthrzRuleDetails set the configUserNotAuthrzRuleDetails.
     */
    public void setConfigUserNotAuthrzRuleDetails(ConfigUserNotAuthrzByRule configUserNotAuthrzRuleDetails) {
        this.configUserNotAuthrzRuleDetails = configUserNotAuthrzRuleDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Connection event.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connectionEvent
     */
    public ConnectionEventDetails getConnectionEvent() {
        return connectionEvent;
    }

    /**
     * This is the setter method to the attribute.
     * Connection event.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connectionEvent set the connectionEvent.
     */
    public void setConnectionEvent(ConnectionEventDetails connectionEvent) {
        this.connectionEvent = connectionEvent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return containerCloudBatchSetup
     */
    public ContainerCloudBatchSetup getContainerCloudBatchSetup() {
        return containerCloudBatchSetup;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param containerCloudBatchSetup set the containerCloudBatchSetup.
     */
    public void setContainerCloudBatchSetup(ContainerCloudBatchSetup containerCloudBatchSetup) {
        this.containerCloudBatchSetup = containerCloudBatchSetup;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return containerCloudSetup
     */
    public ContainerCloudSetup getContainerCloudSetup() {
        return containerCloudSetup;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param containerCloudSetup set the containerCloudSetup.
     */
    public void setContainerCloudSetup(ContainerCloudSetup containerCloudSetup) {
        this.containerCloudSetup = containerCloudSetup;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return containerCloudSevice
     */
    public ContainerCloudService getContainerCloudSevice() {
        return containerCloudSevice;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param containerCloudSevice set the containerCloudSevice.
     */
    public void setContainerCloudSevice(ContainerCloudService containerCloudSevice) {
        this.containerCloudSevice = containerCloudSevice;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerDiscontinuousTimeChangeEventDetails
     */
    public ControllerDiscontinuousTimeChangeEventDetails getControllerDiscontinuousTimeChangeEventDetails() {
        return controllerDiscontinuousTimeChangeEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerDiscontinuousTimeChangeEventDetails set the controllerDiscontinuousTimeChangeEventDetails.
     */
    public void setControllerDiscontinuousTimeChangeEventDetails(ControllerDiscontinuousTimeChangeEventDetails controllerDiscontinuousTimeChangeEventDetails) {
        this.controllerDiscontinuousTimeChangeEventDetails = controllerDiscontinuousTimeChangeEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerLicenseReconcileDetails
     */
    public ControllerLicenseReconcileDetails getControllerLicenseReconcileDetails() {
        return controllerLicenseReconcileDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerLicenseReconcileDetails set the controllerLicenseReconcileDetails.
     */
    public void setControllerLicenseReconcileDetails(ControllerLicenseReconcileDetails controllerLicenseReconcileDetails) {
        this.controllerLicenseReconcileDetails = controllerLicenseReconcileDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crsDeploymentFailure
     */
    public CRSDeploymentFailure getCrsDeploymentFailure() {
        return crsDeploymentFailure;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param crsDeploymentFailure set the crsDeploymentFailure.
     */
    public void setCrsDeploymentFailure(CRSDeploymentFailure crsDeploymentFailure) {
        this.crsDeploymentFailure = crsDeploymentFailure;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crsDeploymentSuccess
     */
    public CRSDeploymentSuccess getCrsDeploymentSuccess() {
        return crsDeploymentSuccess;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param crsDeploymentSuccess set the crsDeploymentSuccess.
     */
    public void setCrsDeploymentSuccess(CRSDeploymentSuccess crsDeploymentSuccess) {
        this.crsDeploymentSuccess = crsDeploymentSuccess;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crsDetails
     */
    public CRSDetails getCrsDetails() {
        return crsDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param crsDetails set the crsDetails.
     */
    public void setCrsDetails(CRSDetails crsDetails) {
        this.crsDetails = crsDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crsUpdateDetails
     */
    public CRSUpdateDetails getCrsUpdateDetails() {
        return crsUpdateDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param crsUpdateDetails set the crsUpdateDetails.
     */
    public void setCrsUpdateDetails(CRSUpdateDetails crsUpdateDetails) {
        this.crsUpdateDetails = crsUpdateDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return csInfraDetails
     */
    public CloudStackSetup getCsInfraDetails() {
        return csInfraDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param csInfraDetails set the csInfraDetails.
     */
    public void setCsInfraDetails(CloudStackSetup csInfraDetails) {
        this.csInfraDetails = csInfraDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Database error event.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return databaseEventInfo
     */
    public DatabaseEventInfo getDatabaseEventInfo() {
        return databaseEventInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Database error event.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param databaseEventInfo set the databaseEventInfo.
     */
    public void setDatabaseEventInfo(DatabaseEventInfo databaseEventInfo) {
        this.databaseEventInfo = databaseEventInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return deleteSeDetails
     */
    public RmDeleteSeEventDetails getDeleteSeDetails() {
        return deleteSeDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param deleteSeDetails set the deleteSeDetails.
     */
    public void setDeleteSeDetails(RmDeleteSeEventDetails deleteSeDetails) {
        this.deleteSeDetails = deleteSeDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Details for detach ip status.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return detachIpStatusDetails
     */
    public DetachIpStatusEventDetails getDetachIpStatusDetails() {
        return detachIpStatusDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Details for detach ip status.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param detachIpStatusDetails set the detachIpStatusDetails.
     */
    public void setDetachIpStatusDetails(DetachIpStatusEventDetails detachIpStatusDetails) {
        this.detachIpStatusDetails = detachIpStatusDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return disableSeMigrateDetails
     */
    public DisableSeMigrateEventDetails getDisableSeMigrateDetails() {
        return disableSeMigrateDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param disableSeMigrateDetails set the disableSeMigrateDetails.
     */
    public void setDisableSeMigrateDetails(DisableSeMigrateEventDetails disableSeMigrateDetails) {
        this.disableSeMigrateDetails = disableSeMigrateDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return discSummary
     */
    public VinfraDiscSummaryDetails getDiscSummary() {
        return discSummary;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param discSummary set the discSummary.
     */
    public void setDiscSummary(VinfraDiscSummaryDetails discSummary) {
        this.discSummary = discSummary;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Log files exsiting on controller need to be cleanup.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return diskCleanupEventDetails
     */
    public LogMgrCleanupEventDetails getDiskCleanupEventDetails() {
        return diskCleanupEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Log files exsiting on controller need to be cleanup.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param diskCleanupEventDetails set the diskCleanupEventDetails.
     */
    public void setDiskCleanupEventDetails(LogMgrCleanupEventDetails diskCleanupEventDetails) {
        this.diskCleanupEventDetails = diskCleanupEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsQueryError
     */
    public DNSQueryError getDnsQueryError() {
        return dnsQueryError;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsQueryError set the dnsQueryError.
     */
    public void setDnsQueryError(DNSQueryError dnsQueryError) {
        this.dnsQueryError = dnsQueryError;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsSyncInfo
     */
    public DNSVsSyncInfo getDnsSyncInfo() {
        return dnsSyncInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsSyncInfo set the dnsSyncInfo.
     */
    public void setDnsSyncInfo(DNSVsSyncInfo dnsSyncInfo) {
        this.dnsSyncInfo = dnsSyncInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dockerUcpDetails
     */
    public DockerUCPSetup getDockerUcpDetails() {
        return dockerUcpDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dockerUcpDetails set the dockerUcpDetails.
     */
    public void setDockerUcpDetails(DockerUCPSetup dockerUcpDetails) {
        this.dockerUcpDetails = dockerUcpDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dosAttackEventDetails
     */
    public DosAttackEventDetails getDosAttackEventDetails() {
        return dosAttackEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dosAttackEventDetails set the dosAttackEventDetails.
     */
    public void setDosAttackEventDetails(DosAttackEventDetails dosAttackEventDetails) {
        this.dosAttackEventDetails = dosAttackEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * False positive details.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return falsePositiveDetails
     */
    public FalsePositiveDetails getFalsePositiveDetails() {
        return falsePositiveDetails;
    }

    /**
     * This is the setter method to the attribute.
     * False positive details.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param falsePositiveDetails set the falsePositiveDetails.
     */
    public void setFalsePositiveDetails(FalsePositiveDetails falsePositiveDetails) {
        this.falsePositiveDetails = falsePositiveDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gcpCloudRouterInfo
     */
    public GCPCloudRouterUpdate getGcpCloudRouterInfo() {
        return gcpCloudRouterInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gcpCloudRouterInfo set the gcpCloudRouterInfo.
     */
    public void setGcpCloudRouterInfo(GCPCloudRouterUpdate gcpCloudRouterInfo) {
        this.gcpCloudRouterInfo = gcpCloudRouterInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gcpInfo
     */
    public GCPSetup getGcpInfo() {
        return gcpInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gcpInfo set the gcpInfo.
     */
    public void setGcpInfo(GCPSetup gcpInfo) {
        this.gcpInfo = gcpInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return genericAuditComplianceEventInfo
     */
    public AuditComplianceEventInfo getGenericAuditComplianceEventInfo() {
        return genericAuditComplianceEventInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param genericAuditComplianceEventInfo set the genericAuditComplianceEventInfo.
     */
    public void setGenericAuditComplianceEventInfo(AuditComplianceEventInfo genericAuditComplianceEventInfo) {
        this.genericAuditComplianceEventInfo = genericAuditComplianceEventInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return glbInfo
     */
    public GslbStatus getGlbInfo() {
        return glbInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param glbInfo set the glbInfo.
     */
    public void setGlbInfo(GslbStatus glbInfo) {
        this.glbInfo = glbInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gsInfo
     */
    public GslbServiceStatus getGsInfo() {
        return gsInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gsInfo set the gsInfo.
     */
    public void setGsInfo(GslbServiceStatus gsInfo) {
        this.gsInfo = gsInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostUnavailDetails
     */
    public HostUnavailEventDetails getHostUnavailDetails() {
        return hostUnavailDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostUnavailDetails set the hostUnavailDetails.
     */
    public void setHostUnavailDetails(HostUnavailEventDetails hostUnavailDetails) {
        this.hostUnavailDetails = hostUnavailDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hsDetails
     */
    public HealthScoreDetails getHsDetails() {
        return hsDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hsDetails set the hsDetails.
     */
    public void setHsDetails(HealthScoreDetails hsDetails) {
        this.hsDetails = hsDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipFailDetails
     */
    public RmSeIpFailEventDetails getIpFailDetails() {
        return ipFailDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipFailDetails set the ipFailDetails.
     */
    public void setIpFailDetails(RmSeIpFailEventDetails ipFailDetails) {
        this.ipFailDetails = ipFailDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipThreatDbEventData
     */
    public IPThreatDBEventData getIpThreatDbEventData() {
        return ipThreatDbEventData;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipThreatDbEventData set the ipThreatDbEventData.
     */
    public void setIpThreatDbEventData(IPThreatDBEventData ipThreatDbEventData) {
        this.ipThreatDbEventData = ipThreatDbEventData;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseDetails
     */
    public LicenseDetails getLicenseDetails() {
        return licenseDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseDetails set the licenseDetails.
     */
    public void setLicenseDetails(LicenseDetails licenseDetails) {
        this.licenseDetails = licenseDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseExpiryDetails
     */
    public LicenseExpiryDetails getLicenseExpiryDetails() {
        return licenseExpiryDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseExpiryDetails set the licenseExpiryDetails.
     */
    public void setLicenseExpiryDetails(LicenseExpiryDetails licenseExpiryDetails) {
        this.licenseExpiryDetails = licenseExpiryDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseTierSwitchDetails
     */
    public LicenseTierSwitchDetiails getLicenseTierSwitchDetails() {
        return licenseTierSwitchDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseTierSwitchDetails set the licenseTierSwitchDetails.
     */
    public void setLicenseTierSwitchDetails(LicenseTierSwitchDetiails licenseTierSwitchDetails) {
        this.licenseTierSwitchDetails = licenseTierSwitchDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return licenseTransactionDetails
     */
    public LicenseTransactionDetails getLicenseTransactionDetails() {
        return licenseTransactionDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param licenseTransactionDetails set the licenseTransactionDetails.
     */
    public void setLicenseTransactionDetails(LicenseTransactionDetails licenseTransactionDetails) {
        this.licenseTransactionDetails = licenseTransactionDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return logAgentEventDetails
     */
    public LogAgentEventDetail getLogAgentEventDetails() {
        return logAgentEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param logAgentEventDetails set the logAgentEventDetails.
     */
    public void setLogAgentEventDetails(LogAgentEventDetail logAgentEventDetails) {
        this.logAgentEventDetails = logAgentEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return marathonServicePortConflictDetails
     */
    public MarathonServicePortConflict getMarathonServicePortConflictDetails() {
        return marathonServicePortConflictDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param marathonServicePortConflictDetails set the marathonServicePortConflictDetails.
     */
    public void setMarathonServicePortConflictDetails(MarathonServicePortConflict marathonServicePortConflictDetails) {
        this.marathonServicePortConflictDetails = marathonServicePortConflictDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return memoryBalancerInfo
     */
    public MemoryBalancerInfo getMemoryBalancerInfo() {
        return memoryBalancerInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param memoryBalancerInfo set the memoryBalancerInfo.
     */
    public void setMemoryBalancerInfo(MemoryBalancerInfo memoryBalancerInfo) {
        this.memoryBalancerInfo = memoryBalancerInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mesosInfraDetails
     */
    public MesosSetup getMesosInfraDetails() {
        return mesosInfraDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mesosInfraDetails set the mesosInfraDetails.
     */
    public void setMesosInfraDetails(MesosSetup mesosInfraDetails) {
        this.mesosInfraDetails = mesosInfraDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricThresholdUpDetails
     */
    public MetricThresoldUpDetails getMetricThresholdUpDetails() {
        return metricThresholdUpDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricThresholdUpDetails set the metricThresholdUpDetails.
     */
    public void setMetricThresholdUpDetails(MetricThresoldUpDetails metricThresholdUpDetails) {
        this.metricThresholdUpDetails = metricThresholdUpDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsDbDiskDetails
     */
    public MetricsDbDiskEventDetails getMetricsDbDiskDetails() {
        return metricsDbDiskDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsDbDiskDetails set the metricsDbDiskDetails.
     */
    public void setMetricsDbDiskDetails(MetricsDbDiskEventDetails metricsDbDiskDetails) {
        this.metricsDbDiskDetails = metricsDbDiskDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsDbQueueFullDetails
     */
    public MetricsDbQueueFullEventDetails getMetricsDbQueueFullDetails() {
        return metricsDbQueueFullDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsDbQueueFullDetails set the metricsDbQueueFullDetails.
     */
    public void setMetricsDbQueueFullDetails(MetricsDbQueueFullEventDetails metricsDbQueueFullDetails) {
        this.metricsDbQueueFullDetails = metricsDbQueueFullDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsDbQueueHealthyDetails
     */
    public MetricsDbQueueHealthyEventDetails getMetricsDbQueueHealthyDetails() {
        return metricsDbQueueHealthyDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsDbQueueHealthyDetails set the metricsDbQueueHealthyDetails.
     */
    public void setMetricsDbQueueHealthyDetails(MetricsDbQueueHealthyEventDetails metricsDbQueueHealthyDetails) {
        this.metricsDbQueueHealthyDetails = metricsDbQueueHealthyDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsDbSyncFailureDetails
     */
    public MetricsDbSyncFailureEventDetails getMetricsDbSyncFailureDetails() {
        return metricsDbSyncFailureDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsDbSyncFailureDetails set the metricsDbSyncFailureDetails.
     */
    public void setMetricsDbSyncFailureDetails(MetricsDbSyncFailureEventDetails metricsDbSyncFailureDetails) {
        this.metricsDbSyncFailureDetails = metricsDbSyncFailureDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metricsGrpcAuthFailureDetails
     */
    public MetricsGRPCAuthFailureDetails getMetricsGrpcAuthFailureDetails() {
        return metricsGrpcAuthFailureDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metricsGrpcAuthFailureDetails set the metricsGrpcAuthFailureDetails.
     */
    public void setMetricsGrpcAuthFailureDetails(MetricsGRPCAuthFailureDetails metricsGrpcAuthFailureDetails) {
        this.metricsGrpcAuthFailureDetails = metricsGrpcAuthFailureDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mgmtNwChangeDetails
     */
    public VinfraMgmtNwChangeDetails getMgmtNwChangeDetails() {
        return mgmtNwChangeDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mgmtNwChangeDetails set the mgmtNwChangeDetails.
     */
    public void setMgmtNwChangeDetails(VinfraMgmtNwChangeDetails mgmtNwChangeDetails) {
        this.mgmtNwChangeDetails = mgmtNwChangeDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return modifyNetworksDetails
     */
    public RmModifyNetworksEventDetails getModifyNetworksDetails() {
        return modifyNetworksDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param modifyNetworksDetails set the modifyNetworksDetails.
     */
    public void setModifyNetworksDetails(RmModifyNetworksEventDetails modifyNetworksDetails) {
        this.modifyNetworksDetails = modifyNetworksDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networkSubnetDetails
     */
    public NetworkSubnetInfo getNetworkSubnetDetails() {
        return networkSubnetDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param networkSubnetDetails set the networkSubnetDetails.
     */
    public void setNetworkSubnetDetails(NetworkSubnetInfo networkSubnetDetails) {
        this.networkSubnetDetails = networkSubnetDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t serviceinsertion virtualendpoint event.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtEndpointDetails
     */
    public NsxtSIEndpointDetails getNsxtEndpointDetails() {
        return nsxtEndpointDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx-t serviceinsertion virtualendpoint event.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtEndpointDetails set the nsxtEndpointDetails.
     */
    public void setNsxtEndpointDetails(NsxtSIEndpointDetails nsxtEndpointDetails) {
        this.nsxtEndpointDetails = nsxtEndpointDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsxt image event.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtImgDetails
     */
    public NsxtImageDetails getNsxtImgDetails() {
        return nsxtImgDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Nsxt image event.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtImgDetails set the nsxtImgDetails.
     */
    public void setNsxtImgDetails(NsxtImageDetails nsxtImgDetails) {
        this.nsxtImgDetails = nsxtImgDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsxt cloud event.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtInfo
     */
    public NsxtSetup getNsxtInfo() {
        return nsxtInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Nsxt cloud event.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtInfo set the nsxtInfo.
     */
    public void setNsxtInfo(NsxtSetup nsxtInfo) {
        this.nsxtInfo = nsxtInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t serviceinsertion redirectpolicy event.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtPolicyDetails
     */
    public NsxtSIPolicyDetails getNsxtPolicyDetails() {
        return nsxtPolicyDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx-t serviceinsertion redirectpolicy event.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtPolicyDetails set the nsxtPolicyDetails.
     */
    public void setNsxtPolicyDetails(NsxtSIPolicyDetails nsxtPolicyDetails) {
        this.nsxtPolicyDetails = nsxtPolicyDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t serviceinsertion redirectrule event.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtRuleDetails
     */
    public NsxtSIRuleDetails getNsxtRuleDetails() {
        return nsxtRuleDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx-t serviceinsertion redirectrule event.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtRuleDetails set the nsxtRuleDetails.
     */
    public void setNsxtRuleDetails(NsxtSIRuleDetails nsxtRuleDetails) {
        this.nsxtRuleDetails = nsxtRuleDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t serviceinsertion service event.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtServiceDetails
     */
    public NsxtSIServiceDetails getNsxtServiceDetails() {
        return nsxtServiceDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx-t serviceinsertion service event.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtServiceDetails set the nsxtServiceDetails.
     */
    public void setNsxtServiceDetails(NsxtSIServiceDetails nsxtServiceDetails) {
        this.nsxtServiceDetails = nsxtServiceDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t tier1(s) segment(s) event details.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtT1SegDetails
     */
    public NsxtT1SegDetails getNsxtT1SegDetails() {
        return nsxtT1SegDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx-t tier1(s) segment(s) event details.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtT1SegDetails set the nsxtT1SegDetails.
     */
    public void setNsxtT1SegDetails(NsxtT1SegDetails nsxtT1SegDetails) {
        this.nsxtT1SegDetails = nsxtT1SegDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nwSubnetClashDetails
     */
    public NetworkSubnetClash getNwSubnetClashDetails() {
        return nwSubnetClashDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nwSubnetClashDetails set the nwSubnetClashDetails.
     */
    public void setNwSubnetClashDetails(NetworkSubnetClash nwSubnetClashDetails) {
        this.nwSubnetClashDetails = nwSubnetClashDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nwSummarizedDetails
     */
    public SummarizedInfo getNwSummarizedDetails() {
        return nwSummarizedDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nwSummarizedDetails set the nwSummarizedDetails.
     */
    public void setNwSummarizedDetails(SummarizedInfo nwSummarizedDetails) {
        this.nwSummarizedDetails = nwSummarizedDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ociInfo
     */
    public OCISetup getOciInfo() {
        return ociInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ociInfo set the ociInfo.
     */
    public void setOciInfo(OCISetup ociInfo) {
        this.ociInfo = ociInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return osApiVerCheckFailure
     */
    public OpenStackApiVersionCheckFailure getOsApiVerCheckFailure() {
        return osApiVerCheckFailure;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param osApiVerCheckFailure set the osApiVerCheckFailure.
     */
    public void setOsApiVerCheckFailure(OpenStackApiVersionCheckFailure osApiVerCheckFailure) {
        this.osApiVerCheckFailure = osApiVerCheckFailure;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return osInfraDetails
     */
    public OpenStackClusterSetup getOsInfraDetails() {
        return osInfraDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param osInfraDetails set the osInfraDetails.
     */
    public void setOsInfraDetails(OpenStackClusterSetup osInfraDetails) {
        this.osInfraDetails = osInfraDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return osIpDetails
     */
    public OpenStackIpChange getOsIpDetails() {
        return osIpDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param osIpDetails set the osIpDetails.
     */
    public void setOsIpDetails(OpenStackIpChange osIpDetails) {
        this.osIpDetails = osIpDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return osLbauditDetails
     */
    public OpenStackLbProvAuditCheck getOsLbauditDetails() {
        return osLbauditDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param osLbauditDetails set the osLbauditDetails.
     */
    public void setOsLbauditDetails(OpenStackLbProvAuditCheck osLbauditDetails) {
        this.osLbauditDetails = osLbauditDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return osLbpluginOpDetails
     */
    public OpenStackLbPluginOp getOsLbpluginOpDetails() {
        return osLbpluginOpDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param osLbpluginOpDetails set the osLbpluginOpDetails.
     */
    public void setOsLbpluginOpDetails(OpenStackLbPluginOp osLbpluginOpDetails) {
        this.osLbpluginOpDetails = osLbpluginOpDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return osSeVmDetails
     */
    public OpenStackSeVmChange getOsSeVmDetails() {
        return osSeVmDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param osSeVmDetails set the osSeVmDetails.
     */
    public void setOsSeVmDetails(OpenStackSeVmChange osSeVmDetails) {
        this.osSeVmDetails = osSeVmDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return osSyncServicesDetails
     */
    public OpenStackSyncServices getOsSyncServicesDetails() {
        return osSyncServicesDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param osSyncServicesDetails set the osSyncServicesDetails.
     */
    public void setOsSyncServicesDetails(OpenStackSyncServices osSyncServicesDetails) {
        this.osSyncServicesDetails = osSyncServicesDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return osVnicDetails
     */
    public OpenStackVnicChange getOsVnicDetails() {
        return osVnicDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param osVnicDetails set the osVnicDetails.
     */
    public void setOsVnicDetails(OpenStackVnicChange osVnicDetails) {
        this.osVnicDetails = osVnicDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pkiprofile event.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pkiprofileDetails
     */
    public PKIProfileDetails getPkiprofileDetails() {
        return pkiprofileDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Pkiprofile event.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pkiprofileDetails set the pkiprofileDetails.
     */
    public void setPkiprofileDetails(PKIProfileDetails pkiprofileDetails) {
        this.pkiprofileDetails = pkiprofileDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolDeploymentFailureInfo
     */
    public PoolDeploymentFailureInfo getPoolDeploymentFailureInfo() {
        return poolDeploymentFailureInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolDeploymentFailureInfo set the poolDeploymentFailureInfo.
     */
    public void setPoolDeploymentFailureInfo(PoolDeploymentFailureInfo poolDeploymentFailureInfo) {
        this.poolDeploymentFailureInfo = poolDeploymentFailureInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolDeploymentSuccessInfo
     */
    public PoolDeploymentSuccessInfo getPoolDeploymentSuccessInfo() {
        return poolDeploymentSuccessInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolDeploymentSuccessInfo set the poolDeploymentSuccessInfo.
     */
    public void setPoolDeploymentSuccessInfo(PoolDeploymentSuccessInfo poolDeploymentSuccessInfo) {
        this.poolDeploymentSuccessInfo = poolDeploymentSuccessInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolDeploymentUpdateInfo
     */
    public PoolDeploymentUpdateInfo getPoolDeploymentUpdateInfo() {
        return poolDeploymentUpdateInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolDeploymentUpdateInfo set the poolDeploymentUpdateInfo.
     */
    public void setPoolDeploymentUpdateInfo(PoolDeploymentUpdateInfo poolDeploymentUpdateInfo) {
        this.poolDeploymentUpdateInfo = poolDeploymentUpdateInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolServerDeleteDetails
     */
    public VinfraPoolServerDeleteDetails getPoolServerDeleteDetails() {
        return poolServerDeleteDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolServerDeleteDetails set the poolServerDeleteDetails.
     */
    public void setPoolServerDeleteDetails(VinfraPoolServerDeleteDetails poolServerDeleteDetails) {
        this.poolServerDeleteDetails = poolServerDeleteDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return psmProgramDetails
     */
    public PsmProgramDetails getPsmProgramDetails() {
        return psmProgramDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param psmProgramDetails set the psmProgramDetails.
     */
    public void setPsmProgramDetails(PsmProgramDetails psmProgramDetails) {
        this.psmProgramDetails = psmProgramDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rateLimiterEventDetails
     */
    public RateLimiterEventDetails getRateLimiterEventDetails() {
        return rateLimiterEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rateLimiterEventDetails set the rateLimiterEventDetails.
     */
    public void setRateLimiterEventDetails(RateLimiterEventDetails rateLimiterEventDetails) {
        this.rateLimiterEventDetails = rateLimiterEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rebalanceMigrateDetails
     */
    public RebalanceMigrateEventDetails getRebalanceMigrateDetails() {
        return rebalanceMigrateDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rebalanceMigrateDetails set the rebalanceMigrateDetails.
     */
    public void setRebalanceMigrateDetails(RebalanceMigrateEventDetails rebalanceMigrateDetails) {
        this.rebalanceMigrateDetails = rebalanceMigrateDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rebalanceScaleinDetails
     */
    public RebalanceScaleinEventDetails getRebalanceScaleinDetails() {
        return rebalanceScaleinDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rebalanceScaleinDetails set the rebalanceScaleinDetails.
     */
    public void setRebalanceScaleinDetails(RebalanceScaleinEventDetails rebalanceScaleinDetails) {
        this.rebalanceScaleinDetails = rebalanceScaleinDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rebalanceScaleoutDetails
     */
    public RebalanceScaleoutEventDetails getRebalanceScaleoutDetails() {
        return rebalanceScaleoutDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rebalanceScaleoutDetails set the rebalanceScaleoutDetails.
     */
    public void setRebalanceScaleoutDetails(RebalanceScaleoutEventDetails rebalanceScaleoutDetails) {
        this.rebalanceScaleoutDetails = rebalanceScaleoutDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rebootSeDetails
     */
    public RmRebootSeEventDetails getRebootSeDetails() {
        return rebootSeDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rebootSeDetails set the rebootSeDetails.
     */
    public void setRebootSeDetails(RmRebootSeEventDetails rebootSeDetails) {
        this.rebootSeDetails = rebootSeDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return samlMetadataFailedEvents
     */
    public SamlMetadataUpdateFailedDetails getSamlMetadataFailedEvents() {
        return samlMetadataFailedEvents;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param samlMetadataFailedEvents set the samlMetadataFailedEvents.
     */
    public void setSamlMetadataFailedEvents(SamlMetadataUpdateFailedDetails samlMetadataFailedEvents) {
        this.samlMetadataFailedEvents = samlMetadataFailedEvents;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return schedulerActionInfo
     */
    public SchedulerActionDetails getSchedulerActionInfo() {
        return schedulerActionInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param schedulerActionInfo set the schedulerActionInfo.
     */
    public void setSchedulerActionInfo(SchedulerActionDetails schedulerActionInfo) {
        this.schedulerActionInfo = schedulerActionInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seBgpPeerDownDetails
     */
    public SeBgpPeerDownDetails getSeBgpPeerDownDetails() {
        return seBgpPeerDownDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seBgpPeerDownDetails set the seBgpPeerDownDetails.
     */
    public void setSeBgpPeerDownDetails(SeBgpPeerDownDetails seBgpPeerDownDetails) {
        this.seBgpPeerDownDetails = seBgpPeerDownDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seBgpPeerStateChangeDetails
     */
    public SeBgpPeerStateChangeDetails getSeBgpPeerStateChangeDetails() {
        return seBgpPeerStateChangeDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seBgpPeerStateChangeDetails set the seBgpPeerStateChangeDetails.
     */
    public void setSeBgpPeerStateChangeDetails(SeBgpPeerStateChangeDetails seBgpPeerStateChangeDetails) {
        this.seBgpPeerStateChangeDetails = seBgpPeerStateChangeDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDebugModeEventDetail
     */
    public SeDebugModeEventDetail getSeDebugModeEventDetail() {
        return seDebugModeEventDetail;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seDebugModeEventDetail set the seDebugModeEventDetail.
     */
    public void setSeDebugModeEventDetail(SeDebugModeEventDetail seDebugModeEventDetail) {
        this.seDebugModeEventDetail = seDebugModeEventDetail;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDetails
     */
    public SeMgrEventDetails getSeDetails() {
        return seDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seDetails set the seDetails.
     */
    public void setSeDetails(SeMgrEventDetails seDetails) {
        this.seDetails = seDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDiscontinuousTimeChangeEventDetails
     */
    public SeDiscontinuousTimeChangeEventDetails getSeDiscontinuousTimeChangeEventDetails() {
        return seDiscontinuousTimeChangeEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.4.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seDiscontinuousTimeChangeEventDetails set the seDiscontinuousTimeChangeEventDetails.
     */
    public void setSeDiscontinuousTimeChangeEventDetails(SeDiscontinuousTimeChangeEventDetails seDiscontinuousTimeChangeEventDetails) {
        this.seDiscontinuousTimeChangeEventDetails = seDiscontinuousTimeChangeEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDupipEventDetails
     */
    public SeDupipEventDetails getSeDupipEventDetails() {
        return seDupipEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seDupipEventDetails set the seDupipEventDetails.
     */
    public void setSeDupipEventDetails(SeDupipEventDetails seDupipEventDetails) {
        this.seDupipEventDetails = seDupipEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGatewayHeartbeatFailedDetails
     */
    public SeGatewayHeartbeatFailedDetails getSeGatewayHeartbeatFailedDetails() {
        return seGatewayHeartbeatFailedDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGatewayHeartbeatFailedDetails set the seGatewayHeartbeatFailedDetails.
     */
    public void setSeGatewayHeartbeatFailedDetails(SeGatewayHeartbeatFailedDetails seGatewayHeartbeatFailedDetails) {
        this.seGatewayHeartbeatFailedDetails = seGatewayHeartbeatFailedDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGatewayHeartbeatSuccessDetails
     */
    public SeGatewayHeartbeatSuccessDetails getSeGatewayHeartbeatSuccessDetails() {
        return seGatewayHeartbeatSuccessDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGatewayHeartbeatSuccessDetails set the seGatewayHeartbeatSuccessDetails.
     */
    public void setSeGatewayHeartbeatSuccessDetails(SeGatewayHeartbeatSuccessDetails seGatewayHeartbeatSuccessDetails) {
        this.seGatewayHeartbeatSuccessDetails = seGatewayHeartbeatSuccessDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGeoDbDetails
     */
    public SeGeoDbDetails getSeGeoDbDetails() {
        return seGeoDbDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGeoDbDetails set the seGeoDbDetails.
     */
    public void setSeGeoDbDetails(SeGeoDbDetails seGeoDbDetails) {
        this.seGeoDbDetails = seGeoDbDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seHbEventDetails
     */
    public SeHBEventDetails getSeHbEventDetails() {
        return seHbEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seHbEventDetails set the seHbEventDetails.
     */
    public void setSeHbEventDetails(SeHBEventDetails seHbEventDetails) {
        this.seHbEventDetails = seHbEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Inter-se datapath heartbeat recovered.
     * One event is generated when heartbeat recovers.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seHbRecoveredEventDetails
     */
    public SeHbRecoveredEventDetails getSeHbRecoveredEventDetails() {
        return seHbRecoveredEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Inter-se datapath heartbeat recovered.
     * One event is generated when heartbeat recovers.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seHbRecoveredEventDetails set the seHbRecoveredEventDetails.
     */
    public void setSeHbRecoveredEventDetails(SeHbRecoveredEventDetails seHbRecoveredEventDetails) {
        this.seHbRecoveredEventDetails = seHbRecoveredEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Egress queueing latency from proxy to dispatcher.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seHighEgressProcLatencyEventDetails
     */
    public SeHighEgressProcLatencyEventDetails getSeHighEgressProcLatencyEventDetails() {
        return seHighEgressProcLatencyEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Egress queueing latency from proxy to dispatcher.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seHighEgressProcLatencyEventDetails set the seHighEgressProcLatencyEventDetails.
     */
    public void setSeHighEgressProcLatencyEventDetails(SeHighEgressProcLatencyEventDetails seHighEgressProcLatencyEventDetails) {
        this.seHighEgressProcLatencyEventDetails = seHighEgressProcLatencyEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seHighIngressProcLatencyEventDetails
     */
    public SeHighIngressProcLatencyEventDetails getSeHighIngressProcLatencyEventDetails() {
        return seHighIngressProcLatencyEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seHighIngressProcLatencyEventDetails set the seHighIngressProcLatencyEventDetails.
     */
    public void setSeHighIngressProcLatencyEventDetails(SeHighIngressProcLatencyEventDetails seHighIngressProcLatencyEventDetails) {
        this.seHighIngressProcLatencyEventDetails = seHighIngressProcLatencyEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seHmGsDetails
     */
    public SeHmEventGSDetails getSeHmGsDetails() {
        return seHmGsDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seHmGsDetails set the seHmGsDetails.
     */
    public void setSeHmGsDetails(SeHmEventGSDetails seHmGsDetails) {
        this.seHmGsDetails = seHmGsDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seHmGsgroupDetails
     */
    public SeHmEventGslbPoolDetails getSeHmGsgroupDetails() {
        return seHmGsgroupDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seHmGsgroupDetails set the seHmGsgroupDetails.
     */
    public void setSeHmGsgroupDetails(SeHmEventGslbPoolDetails seHmGsgroupDetails) {
        this.seHmGsgroupDetails = seHmGsgroupDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seHmPoolDetails
     */
    public SeHmEventPoolDetails getSeHmPoolDetails() {
        return seHmPoolDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seHmPoolDetails set the seHmPoolDetails.
     */
    public void setSeHmPoolDetails(SeHmEventPoolDetails seHmPoolDetails) {
        this.seHmPoolDetails = seHmPoolDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seHmVsDetails
     */
    public SeHmEventVsDetails getSeHmVsDetails() {
        return seHmVsDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seHmVsDetails set the seHmVsDetails.
     */
    public void setSeHmVsDetails(SeHmEventVsDetails seHmVsDetails) {
        this.seHmVsDetails = seHmVsDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seIp6DadFailedEventDetails
     */
    public SeIP6DadFailedEventDetails getSeIp6DadFailedEventDetails() {
        return seIp6DadFailedEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seIp6DadFailedEventDetails set the seIp6DadFailedEventDetails.
     */
    public void setSeIp6DadFailedEventDetails(SeIP6DadFailedEventDetails seIp6DadFailedEventDetails) {
        this.seIp6DadFailedEventDetails = seIp6DadFailedEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seIpAddedEventDetails
     */
    public SeIpAddedEventDetails getSeIpAddedEventDetails() {
        return seIpAddedEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seIpAddedEventDetails set the seIpAddedEventDetails.
     */
    public void setSeIpAddedEventDetails(SeIpAddedEventDetails seIpAddedEventDetails) {
        this.seIpAddedEventDetails = seIpAddedEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seIpRemovedEventDetails
     */
    public SeIpRemovedEventDetails getSeIpRemovedEventDetails() {
        return seIpRemovedEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seIpRemovedEventDetails set the seIpRemovedEventDetails.
     */
    public void setSeIpRemovedEventDetails(SeIpRemovedEventDetails seIpRemovedEventDetails) {
        this.seIpRemovedEventDetails = seIpRemovedEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seIpfailureEventDetails
     */
    public SeIpfailureEventDetails getSeIpfailureEventDetails() {
        return seIpfailureEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seIpfailureEventDetails set the seIpfailureEventDetails.
     */
    public void setSeIpfailureEventDetails(SeIpfailureEventDetails seIpfailureEventDetails) {
        this.seIpfailureEventDetails = seIpfailureEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seLicensedBandwdithExceededEventDetails
     */
    public SeLicensedBandwdithExceededEventDetails getSeLicensedBandwdithExceededEventDetails() {
        return seLicensedBandwdithExceededEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seLicensedBandwdithExceededEventDetails set the seLicensedBandwdithExceededEventDetails.
     */
    public void setSeLicensedBandwdithExceededEventDetails(SeLicensedBandwdithExceededEventDetails seLicensedBandwdithExceededEventDetails) {
        this.seLicensedBandwdithExceededEventDetails = seLicensedBandwdithExceededEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seMemoryLimitEventDetails
     */
    public SeMemoryLimitEventDetails getSeMemoryLimitEventDetails() {
        return seMemoryLimitEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seMemoryLimitEventDetails set the seMemoryLimitEventDetails.
     */
    public void setSeMemoryLimitEventDetails(SeMemoryLimitEventDetails seMemoryLimitEventDetails) {
        this.seMemoryLimitEventDetails = seMemoryLimitEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se ntp synchronization failed.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seNtpSynchronizationFailed
     */
    public SeNtpSynchronizationFailed getSeNtpSynchronizationFailed() {
        return seNtpSynchronizationFailed;
    }

    /**
     * This is the setter method to the attribute.
     * Se ntp synchronization failed.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seNtpSynchronizationFailed set the seNtpSynchronizationFailed.
     */
    public void setSeNtpSynchronizationFailed(SeNtpSynchronizationFailed seNtpSynchronizationFailed) {
        this.seNtpSynchronizationFailed = seNtpSynchronizationFailed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seObjsyncPeerDownDetails
     */
    public SeObjsyncPeerDownDetails getSeObjsyncPeerDownDetails() {
        return seObjsyncPeerDownDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seObjsyncPeerDownDetails set the seObjsyncPeerDownDetails.
     */
    public void setSeObjsyncPeerDownDetails(SeObjsyncPeerDownDetails seObjsyncPeerDownDetails) {
        this.seObjsyncPeerDownDetails = seObjsyncPeerDownDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sePersistenceDetails
     */
    public SePersistenceEventDetails getSePersistenceDetails() {
        return sePersistenceDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sePersistenceDetails set the sePersistenceDetails.
     */
    public void setSePersistenceDetails(SePersistenceEventDetails sePersistenceDetails) {
        this.sePersistenceDetails = sePersistenceDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sePoolLbDetails
     */
    public SePoolLbEventDetails getSePoolLbDetails() {
        return sePoolLbDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sePoolLbDetails set the sePoolLbDetails.
     */
    public void setSePoolLbDetails(SePoolLbEventDetails sePoolLbDetails) {
        this.sePoolLbDetails = sePoolLbDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seReconcileDetails
     */
    public SeReconcileDetails getSeReconcileDetails() {
        return seReconcileDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seReconcileDetails set the seReconcileDetails.
     */
    public void setSeReconcileDetails(SeReconcileDetails seReconcileDetails) {
        this.seReconcileDetails = seReconcileDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seThreshEventDetails
     */
    public SeThreshEventDetails getSeThreshEventDetails() {
        return seThreshEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seThreshEventDetails set the seThreshEventDetails.
     */
    public void setSeThreshEventDetails(SeThreshEventDetails seThreshEventDetails) {
        this.seThreshEventDetails = seThreshEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seVnicDownEventDetails
     */
    public SeVnicDownEventDetails getSeVnicDownEventDetails() {
        return seVnicDownEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seVnicDownEventDetails set the seVnicDownEventDetails.
     */
    public void setSeVnicDownEventDetails(SeVnicDownEventDetails seVnicDownEventDetails) {
        this.seVnicDownEventDetails = seVnicDownEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seVnicTxQueueStallEventDetails
     */
    public SeVnicTxQueueStallEventDetails getSeVnicTxQueueStallEventDetails() {
        return seVnicTxQueueStallEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seVnicTxQueueStallEventDetails set the seVnicTxQueueStallEventDetails.
     */
    public void setSeVnicTxQueueStallEventDetails(SeVnicTxQueueStallEventDetails seVnicTxQueueStallEventDetails) {
        this.seVnicTxQueueStallEventDetails = seVnicTxQueueStallEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seVnicUpEventDetails
     */
    public SeVnicUpEventDetails getSeVnicUpEventDetails() {
        return seVnicUpEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seVnicUpEventDetails set the seVnicUpEventDetails.
     */
    public void setSeVnicUpEventDetails(SeVnicUpEventDetails seVnicUpEventDetails) {
        this.seVnicUpEventDetails = seVnicUpEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vs flows disrupted when a vs was deleted from se.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seVsDelFlowsDisrupted
     */
    public SeVsDelFlowsDisrupted getSeVsDelFlowsDisrupted() {
        return seVsDelFlowsDisrupted;
    }

    /**
     * This is the setter method to the attribute.
     * Vs flows disrupted when a vs was deleted from se.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seVsDelFlowsDisrupted set the seVsDelFlowsDisrupted.
     */
    public void setSeVsDelFlowsDisrupted(SeVsDelFlowsDisrupted seVsDelFlowsDisrupted) {
        this.seVsDelFlowsDisrupted = seVsDelFlowsDisrupted;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seVsFaultEventDetails
     */
    public SeVsFaultEventDetails getSeVsFaultEventDetails() {
        return seVsFaultEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seVsFaultEventDetails set the seVsFaultEventDetails.
     */
    public void setSeVsFaultEventDetails(SeVsFaultEventDetails seVsFaultEventDetails) {
        this.seVsFaultEventDetails = seVsFaultEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.11,20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seVsPktBufHighEventDetails
     */
    public SeVsPktBufHighEventDetails getSeVsPktBufHighEventDetails() {
        return seVsPktBufHighEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.11,20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seVsPktBufHighEventDetails set the seVsPktBufHighEventDetails.
     */
    public void setSeVsPktBufHighEventDetails(SeVsPktBufHighEventDetails seVsPktBufHighEventDetails) {
        this.seVsPktBufHighEventDetails = seVsPktBufHighEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return secMgrDataEvent
     */
    public SecMgrDataEvent getSecMgrDataEvent() {
        return secMgrDataEvent;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param secMgrDataEvent set the secMgrDataEvent.
     */
    public void setSecMgrDataEvent(SecMgrDataEvent secMgrDataEvent) {
        this.secMgrDataEvent = secMgrDataEvent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Security-mgr ua cache event details.
     * Field introduced in 21.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return secMgrUaEventDetails
     */
    public SecMgrUAEventDetails getSecMgrUaEventDetails() {
        return secMgrUaEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Security-mgr ua cache event details.
     * Field introduced in 21.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param secMgrUaEventDetails set the secMgrUaEventDetails.
     */
    public void setSecMgrUaEventDetails(SecMgrUAEventDetails secMgrUaEventDetails) {
        this.secMgrUaEventDetails = secMgrUaEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return secureKeyExchangeInfo
     */
    public SecureKeyExchangeDetails getSecureKeyExchangeInfo() {
        return secureKeyExchangeInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param secureKeyExchangeInfo set the secureKeyExchangeInfo.
     */
    public void setSecureKeyExchangeInfo(SecureKeyExchangeDetails secureKeyExchangeInfo) {
        this.secureKeyExchangeInfo = secureKeyExchangeInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return semigrateEventDetails
     */
    public SeMigrateEventDetails getSemigrateEventDetails() {
        return semigrateEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param semigrateEventDetails set the semigrateEventDetails.
     */
    public void setSemigrateEventDetails(SeMigrateEventDetails semigrateEventDetails) {
        this.semigrateEventDetails = semigrateEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverAutoscaleFailedInfo
     */
    public ServerAutoScaleFailedInfo getServerAutoscaleFailedInfo() {
        return serverAutoscaleFailedInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverAutoscaleFailedInfo set the serverAutoscaleFailedInfo.
     */
    public void setServerAutoscaleFailedInfo(ServerAutoScaleFailedInfo serverAutoscaleFailedInfo) {
        this.serverAutoscaleFailedInfo = serverAutoscaleFailedInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverAutoscaleinCompleteInfo
     */
    public ServerAutoScaleInCompleteInfo getServerAutoscaleinCompleteInfo() {
        return serverAutoscaleinCompleteInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverAutoscaleinCompleteInfo set the serverAutoscaleinCompleteInfo.
     */
    public void setServerAutoscaleinCompleteInfo(ServerAutoScaleInCompleteInfo serverAutoscaleinCompleteInfo) {
        this.serverAutoscaleinCompleteInfo = serverAutoscaleinCompleteInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverAutoscaleinInfo
     */
    public ServerAutoScaleInInfo getServerAutoscaleinInfo() {
        return serverAutoscaleinInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverAutoscaleinInfo set the serverAutoscaleinInfo.
     */
    public void setServerAutoscaleinInfo(ServerAutoScaleInInfo serverAutoscaleinInfo) {
        this.serverAutoscaleinInfo = serverAutoscaleinInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverAutoscaleoutCompleteInfo
     */
    public ServerAutoScaleOutCompleteInfo getServerAutoscaleoutCompleteInfo() {
        return serverAutoscaleoutCompleteInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverAutoscaleoutCompleteInfo set the serverAutoscaleoutCompleteInfo.
     */
    public void setServerAutoscaleoutCompleteInfo(ServerAutoScaleOutCompleteInfo serverAutoscaleoutCompleteInfo) {
        this.serverAutoscaleoutCompleteInfo = serverAutoscaleoutCompleteInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverAutoscaleoutInfo
     */
    public ServerAutoScaleOutInfo getServerAutoscaleoutInfo() {
        return serverAutoscaleoutInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverAutoscaleoutInfo set the serverAutoscaleoutInfo.
     */
    public void setServerAutoscaleoutInfo(ServerAutoScaleOutInfo serverAutoscaleoutInfo) {
        this.serverAutoscaleoutInfo = serverAutoscaleoutInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seupgradeDisruptedDetails
     */
    public SeUpgradeVsDisruptedEventDetails getSeupgradeDisruptedDetails() {
        return seupgradeDisruptedDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seupgradeDisruptedDetails set the seupgradeDisruptedDetails.
     */
    public void setSeupgradeDisruptedDetails(SeUpgradeVsDisruptedEventDetails seupgradeDisruptedDetails) {
        this.seupgradeDisruptedDetails = seupgradeDisruptedDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seupgradeEventDetails
     */
    public SeUpgradeEventDetails getSeupgradeEventDetails() {
        return seupgradeEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seupgradeEventDetails set the seupgradeEventDetails.
     */
    public void setSeupgradeEventDetails(SeUpgradeEventDetails seupgradeEventDetails) {
        this.seupgradeEventDetails = seupgradeEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seupgradeMigrateDetails
     */
    public SeUpgradeMigrateEventDetails getSeupgradeMigrateDetails() {
        return seupgradeMigrateDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seupgradeMigrateDetails set the seupgradeMigrateDetails.
     */
    public void setSeupgradeMigrateDetails(SeUpgradeMigrateEventDetails seupgradeMigrateDetails) {
        this.seupgradeMigrateDetails = seupgradeMigrateDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seupgradeScaleinDetails
     */
    public SeUpgradeScaleinEventDetails getSeupgradeScaleinDetails() {
        return seupgradeScaleinDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seupgradeScaleinDetails set the seupgradeScaleinDetails.
     */
    public void setSeupgradeScaleinDetails(SeUpgradeScaleinEventDetails seupgradeScaleinDetails) {
        this.seupgradeScaleinDetails = seupgradeScaleinDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seupgradeScaleoutDetails
     */
    public SeUpgradeScaleoutEventDetails getSeupgradeScaleoutDetails() {
        return seupgradeScaleoutDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seupgradeScaleoutDetails set the seupgradeScaleoutDetails.
     */
    public void setSeupgradeScaleoutDetails(SeUpgradeScaleoutEventDetails seupgradeScaleoutDetails) {
        this.seupgradeScaleoutDetails = seupgradeScaleoutDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return spawnSeDetails
     */
    public RmSpawnSeEventDetails getSpawnSeDetails() {
        return spawnSeDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param spawnSeDetails set the spawnSeDetails.
     */
    public void setSpawnSeDetails(RmSpawnSeEventDetails spawnSeDetails) {
        this.spawnSeDetails = spawnSeDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslExpireDetails
     */
    public SSLExpireDetails getSslExpireDetails() {
        return sslExpireDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslExpireDetails set the sslExpireDetails.
     */
    public void setSslExpireDetails(SSLExpireDetails sslExpireDetails) {
        this.sslExpireDetails = sslExpireDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslExportDetails
     */
    public SSLExportDetails getSslExportDetails() {
        return sslExportDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslExportDetails set the sslExportDetails.
     */
    public void setSslExportDetails(SSLExportDetails sslExportDetails) {
        this.sslExportDetails = sslExportDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslIgnoredDetails
     */
    public SSLIgnoredDetails getSslIgnoredDetails() {
        return sslIgnoredDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslIgnoredDetails set the sslIgnoredDetails.
     */
    public void setSslIgnoredDetails(SSLIgnoredDetails sslIgnoredDetails) {
        this.sslIgnoredDetails = sslIgnoredDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslRenewDetails
     */
    public SSLRenewDetails getSslRenewDetails() {
        return sslRenewDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslRenewDetails set the sslRenewDetails.
     */
    public void setSslRenewDetails(SSLRenewDetails sslRenewDetails) {
        this.sslRenewDetails = sslRenewDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslRenewFailedDetails
     */
    public SSLRenewFailedDetails getSslRenewFailedDetails() {
        return sslRenewFailedDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslRenewFailedDetails set the sslRenewFailedDetails.
     */
    public void setSslRenewFailedDetails(SSLRenewFailedDetails sslRenewFailedDetails) {
        this.sslRenewFailedDetails = sslRenewFailedDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslRevokedDetails
     */
    public SSLRevokedDetails getSslRevokedDetails() {
        return sslRevokedDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslRevokedDetails set the sslRevokedDetails.
     */
    public void setSslRevokedDetails(SSLRevokedDetails sslRevokedDetails) {
        this.sslRevokedDetails = sslRevokedDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return switchoverDetails
     */
    public SwitchoverEventDetails getSwitchoverDetails() {
        return switchoverDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param switchoverDetails set the switchoverDetails.
     */
    public void setSwitchoverDetails(SwitchoverEventDetails switchoverDetails) {
        this.switchoverDetails = switchoverDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return switchoverFailDetails
     */
    public SwitchoverFailEventDetails getSwitchoverFailDetails() {
        return switchoverFailDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param switchoverFailDetails set the switchoverFailDetails.
     */
    public void setSwitchoverFailDetails(SwitchoverFailEventDetails switchoverFailDetails) {
        this.switchoverFailDetails = switchoverFailDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Azure cloud sync services event details.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return syncServicesInfo
     */
    public CloudSyncServices getSyncServicesInfo() {
        return syncServicesInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Azure cloud sync services event details.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param syncServicesInfo set the syncServicesInfo.
     */
    public void setSyncServicesInfo(CloudSyncServices syncServicesInfo) {
        this.syncServicesInfo = syncServicesInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tencentInfo
     */
    public TencentSetup getTencentInfo() {
        return tencentInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tencentInfo set the tencentInfo.
     */
    public void setTencentInfo(TencentSetup tencentInfo) {
        this.tencentInfo = tencentInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return unbindVsSeDetails
     */
    public RmUnbindVsSeEventDetails getUnbindVsSeDetails() {
        return unbindVsSeDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param unbindVsSeDetails set the unbindVsSeDetails.
     */
    public void setUnbindVsSeDetails(RmUnbindVsSeEventDetails unbindVsSeDetails) {
        this.unbindVsSeDetails = unbindVsSeDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return upgradeEntry
     */
    public UpgradeOpsEntry getUpgradeEntry() {
        return upgradeEntry;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param upgradeEntry set the upgradeEntry.
     */
    public void setUpgradeEntry(UpgradeOpsEntry upgradeEntry) {
        this.upgradeEntry = upgradeEntry;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return upgradeStatusInfo
     */
    public UpgradeStatusInfo getUpgradeStatusInfo() {
        return upgradeStatusInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param upgradeStatusInfo set the upgradeStatusInfo.
     */
    public void setUpgradeStatusInfo(UpgradeStatusInfo upgradeStatusInfo) {
        this.upgradeStatusInfo = upgradeStatusInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcaInfraDetails
     */
    public VCASetup getVcaInfraDetails() {
        return vcaInfraDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcaInfraDetails set the vcaInfraDetails.
     */
    public void setVcaInfraDetails(VCASetup vcaInfraDetails) {
        this.vcaInfraDetails = vcaInfraDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Details of objects still referred to cloud.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterCloudDeleteDetails
     */
    public VcenterCloudDeleteDetails getVcenterCloudDeleteDetails() {
        return vcenterCloudDeleteDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Details of objects still referred to cloud.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterCloudDeleteDetails set the vcenterCloudDeleteDetails.
     */
    public void setVcenterCloudDeleteDetails(VcenterCloudDeleteDetails vcenterCloudDeleteDetails) {
        this.vcenterCloudDeleteDetails = vcenterCloudDeleteDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vcenter cluster event.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterClusterDetails
     */
    public VcenterClusterDetails getVcenterClusterDetails() {
        return vcenterClusterDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Vcenter cluster event.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterClusterDetails set the vcenterClusterDetails.
     */
    public void setVcenterClusterDetails(VcenterClusterDetails vcenterClusterDetails) {
        this.vcenterClusterDetails = vcenterClusterDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterConnectivityStatus
     */
    public VinfraVcenterConnectivityStatus getVcenterConnectivityStatus() {
        return vcenterConnectivityStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterConnectivityStatus set the vcenterConnectivityStatus.
     */
    public void setVcenterConnectivityStatus(VinfraVcenterConnectivityStatus vcenterConnectivityStatus) {
        this.vcenterConnectivityStatus = vcenterConnectivityStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterDetails
     */
    public VinfraVcenterBadCredentials getVcenterDetails() {
        return vcenterDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterDetails set the vcenterDetails.
     */
    public void setVcenterDetails(VinfraVcenterBadCredentials vcenterDetails) {
        this.vcenterDetails = vcenterDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterDiscFailure
     */
    public VinfraVcenterDiscoveryFailure getVcenterDiscFailure() {
        return vcenterDiscFailure;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterDiscFailure set the vcenterDiscFailure.
     */
    public void setVcenterDiscFailure(VinfraVcenterDiscoveryFailure vcenterDiscFailure) {
        this.vcenterDiscFailure = vcenterDiscFailure;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vcenter image event details.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterImgDetails
     */
    public VcenterImageDetails getVcenterImgDetails() {
        return vcenterImgDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Vcenter image event details.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterImgDetails set the vcenterImgDetails.
     */
    public void setVcenterImgDetails(VcenterImageDetails vcenterImgDetails) {
        this.vcenterImgDetails = vcenterImgDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterNetworkLimit
     */
    public VinfraVcenterNetworkLimit getVcenterNetworkLimit() {
        return vcenterNetworkLimit;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterNetworkLimit set the vcenterNetworkLimit.
     */
    public void setVcenterNetworkLimit(VinfraVcenterNetworkLimit vcenterNetworkLimit) {
        this.vcenterNetworkLimit = vcenterNetworkLimit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterObjDeleteDetails
     */
    public VinfraVcenterObjDeleteDetails getVcenterObjDeleteDetails() {
        return vcenterObjDeleteDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterObjDeleteDetails set the vcenterObjDeleteDetails.
     */
    public void setVcenterObjDeleteDetails(VinfraVcenterObjDeleteDetails vcenterObjDeleteDetails) {
        this.vcenterObjDeleteDetails = vcenterObjDeleteDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Failed to tag ses with custom tags.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenterTagEventDetails
     */
    public VcenterTagEventDetails getVcenterTagEventDetails() {
        return vcenterTagEventDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Failed to tag ses with custom tags.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenterTagEventDetails set the vcenterTagEventDetails.
     */
    public void setVcenterTagEventDetails(VcenterTagEventDetails vcenterTagEventDetails) {
        this.vcenterTagEventDetails = vcenterTagEventDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipAutoscale
     */
    public VipScaleDetails getVipAutoscale() {
        return vipAutoscale;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipAutoscale set the vipAutoscale.
     */
    public void setVipAutoscale(VipScaleDetails vipAutoscale) {
        this.vipAutoscale = vipAutoscale;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipDnsInfo
     */
    public DNSRegisterInfo getVipDnsInfo() {
        return vipDnsInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipDnsInfo set the vipDnsInfo.
     */
    public void setVipDnsInfo(DNSRegisterInfo vipDnsInfo) {
        this.vipDnsInfo = vipDnsInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Details for vip symmetry.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipSymmetryDetails
     */
    public VipSymmetryDetails getVipSymmetryDetails() {
        return vipSymmetryDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Details for vip symmetry.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipSymmetryDetails set the vipSymmetryDetails.
     */
    public void setVipSymmetryDetails(VipSymmetryDetails vipSymmetryDetails) {
        this.vipSymmetryDetails = vipSymmetryDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmDetails
     */
    public VinfraVmDetails getVmDetails() {
        return vmDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vmDetails set the vmDetails.
     */
    public void setVmDetails(VinfraVmDetails vmDetails) {
        this.vmDetails = vmDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsAwaitingseDetails
     */
    public VsAwaitingSeEventDetails getVsAwaitingseDetails() {
        return vsAwaitingseDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsAwaitingseDetails set the vsAwaitingseDetails.
     */
    public void setVsAwaitingseDetails(VsAwaitingSeEventDetails vsAwaitingseDetails) {
        this.vsAwaitingseDetails = vsAwaitingseDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsErrorDetails
     */
    public VsErrorEventDetails getVsErrorDetails() {
        return vsErrorDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsErrorDetails set the vsErrorDetails.
     */
    public void setVsErrorDetails(VsErrorEventDetails vsErrorDetails) {
        this.vsErrorDetails = vsErrorDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsFsmDetails
     */
    public VsFsmEventDetails getVsFsmDetails() {
        return vsFsmDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsFsmDetails set the vsFsmDetails.
     */
    public void setVsFsmDetails(VsFsmEventDetails vsFsmDetails) {
        this.vsFsmDetails = vsFsmDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsInitialplacementDetails
     */
    public VsInitialPlacementEventDetails getVsInitialplacementDetails() {
        return vsInitialplacementDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsInitialplacementDetails set the vsInitialplacementDetails.
     */
    public void setVsInitialplacementDetails(VsInitialPlacementEventDetails vsInitialplacementDetails) {
        this.vsInitialplacementDetails = vsInitialplacementDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsMigrateDetails
     */
    public VsMigrateEventDetails getVsMigrateDetails() {
        return vsMigrateDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsMigrateDetails set the vsMigrateDetails.
     */
    public void setVsMigrateDetails(VsMigrateEventDetails vsMigrateDetails) {
        this.vsMigrateDetails = vsMigrateDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsPoolNwFltrDetails
     */
    public VsPoolNwFilterEventDetails getVsPoolNwFltrDetails() {
        return vsPoolNwFltrDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsPoolNwFltrDetails set the vsPoolNwFltrDetails.
     */
    public void setVsPoolNwFltrDetails(VsPoolNwFilterEventDetails vsPoolNwFltrDetails) {
        this.vsPoolNwFltrDetails = vsPoolNwFltrDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsScaleinDetails
     */
    public VsScaleInEventDetails getVsScaleinDetails() {
        return vsScaleinDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsScaleinDetails set the vsScaleinDetails.
     */
    public void setVsScaleinDetails(VsScaleInEventDetails vsScaleinDetails) {
        this.vsScaleinDetails = vsScaleinDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsScaleoutDetails
     */
    public VsScaleOutEventDetails getVsScaleoutDetails() {
        return vsScaleoutDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsScaleoutDetails set the vsScaleoutDetails.
     */
    public void setVsScaleoutDetails(VsScaleOutEventDetails vsScaleoutDetails) {
        this.vsScaleoutDetails = vsScaleoutDetails;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Details for primary switchover status.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsSwitchoverDetails
     */
    public VsSwitchoverEventDetails getVsSwitchoverDetails() {
        return vsSwitchoverDetails;
    }

    /**
     * This is the setter method to the attribute.
     * Details for primary switchover status.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsSwitchoverDetails set the vsSwitchoverDetails.
     */
    public void setVsSwitchoverDetails(VsSwitchoverEventDetails vsSwitchoverDetails) {
        this.vsSwitchoverDetails = vsSwitchoverDetails;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      EventDetails objEventDetails = (EventDetails) o;
      return   Objects.equals(this.discSummary, objEventDetails.discSummary)&&
  Objects.equals(this.vcenterDetails, objEventDetails.vcenterDetails)&&
  Objects.equals(this.cntlrHostListDetails, objEventDetails.cntlrHostListDetails)&&
  Objects.equals(this.poolServerDeleteDetails, objEventDetails.poolServerDeleteDetails)&&
  Objects.equals(this.vmDetails, objEventDetails.vmDetails)&&
  Objects.equals(this.mgmtNwChangeDetails, objEventDetails.mgmtNwChangeDetails)&&
  Objects.equals(this.vcenterObjDeleteDetails, objEventDetails.vcenterObjDeleteDetails)&&
  Objects.equals(this.vcenterDiscFailure, objEventDetails.vcenterDiscFailure)&&
  Objects.equals(this.vcenterConnectivityStatus, objEventDetails.vcenterConnectivityStatus)&&
  Objects.equals(this.vcenterNetworkLimit, objEventDetails.vcenterNetworkLimit)&&
  Objects.equals(this.vcenterTagEventDetails, objEventDetails.vcenterTagEventDetails)&&
  Objects.equals(this.vcenterCloudDeleteDetails, objEventDetails.vcenterCloudDeleteDetails)&&
  Objects.equals(this.seDetails, objEventDetails.seDetails)&&
  Objects.equals(this.spawnSeDetails, objEventDetails.spawnSeDetails)&&
  Objects.equals(this.modifyNetworksDetails, objEventDetails.modifyNetworksDetails)&&
  Objects.equals(this.bindVsSeDetails, objEventDetails.bindVsSeDetails)&&
  Objects.equals(this.unbindVsSeDetails, objEventDetails.unbindVsSeDetails)&&
  Objects.equals(this.rebootSeDetails, objEventDetails.rebootSeDetails)&&
  Objects.equals(this.addNetworksDetails, objEventDetails.addNetworksDetails)&&
  Objects.equals(this.bootupFailDetails, objEventDetails.bootupFailDetails)&&
  Objects.equals(this.ipFailDetails, objEventDetails.ipFailDetails)&&
  Objects.equals(this.deleteSeDetails, objEventDetails.deleteSeDetails)&&
  Objects.equals(this.hostUnavailDetails, objEventDetails.hostUnavailDetails)&&
  Objects.equals(this.switchoverDetails, objEventDetails.switchoverDetails)&&
  Objects.equals(this.switchoverFailDetails, objEventDetails.switchoverFailDetails)&&
  Objects.equals(this.attachIpStatusDetails, objEventDetails.attachIpStatusDetails)&&
  Objects.equals(this.detachIpStatusDetails, objEventDetails.detachIpStatusDetails)&&
  Objects.equals(this.vipSymmetryDetails, objEventDetails.vipSymmetryDetails)&&
  Objects.equals(this.vsFsmDetails, objEventDetails.vsFsmDetails)&&
  Objects.equals(this.vsPoolNwFltrDetails, objEventDetails.vsPoolNwFltrDetails)&&
  Objects.equals(this.vsScaleoutDetails, objEventDetails.vsScaleoutDetails)&&
  Objects.equals(this.vsScaleinDetails, objEventDetails.vsScaleinDetails)&&
  Objects.equals(this.vsMigrateDetails, objEventDetails.vsMigrateDetails)&&
  Objects.equals(this.vsErrorDetails, objEventDetails.vsErrorDetails)&&
  Objects.equals(this.vsAwaitingseDetails, objEventDetails.vsAwaitingseDetails)&&
  Objects.equals(this.vsInitialplacementDetails, objEventDetails.vsInitialplacementDetails)&&
  Objects.equals(this.vsSwitchoverDetails, objEventDetails.vsSwitchoverDetails)&&
  Objects.equals(this.upgradeStatusInfo, objEventDetails.upgradeStatusInfo)&&
  Objects.equals(this.allSeupgradeEventDetails, objEventDetails.allSeupgradeEventDetails)&&
  Objects.equals(this.seupgradeEventDetails, objEventDetails.seupgradeEventDetails)&&
  Objects.equals(this.seupgradeScaleoutDetails, objEventDetails.seupgradeScaleoutDetails)&&
  Objects.equals(this.seupgradeScaleinDetails, objEventDetails.seupgradeScaleinDetails)&&
  Objects.equals(this.seupgradeMigrateDetails, objEventDetails.seupgradeMigrateDetails)&&
  Objects.equals(this.seupgradeDisruptedDetails, objEventDetails.seupgradeDisruptedDetails)&&
  Objects.equals(this.rebalanceScaleoutDetails, objEventDetails.rebalanceScaleoutDetails)&&
  Objects.equals(this.rebalanceScaleinDetails, objEventDetails.rebalanceScaleinDetails)&&
  Objects.equals(this.rebalanceMigrateDetails, objEventDetails.rebalanceMigrateDetails)&&
  Objects.equals(this.semigrateEventDetails, objEventDetails.semigrateEventDetails)&&
  Objects.equals(this.disableSeMigrateDetails, objEventDetails.disableSeMigrateDetails)&&
  Objects.equals(this.vipAutoscale, objEventDetails.vipAutoscale)&&
  Objects.equals(this.upgradeEntry, objEventDetails.upgradeEntry)&&
  Objects.equals(this.seThreshEventDetails, objEventDetails.seThreshEventDetails)&&
  Objects.equals(this.seHbEventDetails, objEventDetails.seHbEventDetails)&&
  Objects.equals(this.seIpfailureEventDetails, objEventDetails.seIpfailureEventDetails)&&
  Objects.equals(this.seDupipEventDetails, objEventDetails.seDupipEventDetails)&&
  Objects.equals(this.seIpAddedEventDetails, objEventDetails.seIpAddedEventDetails)&&
  Objects.equals(this.seIpRemovedEventDetails, objEventDetails.seIpRemovedEventDetails)&&
  Objects.equals(this.seGatewayHeartbeatFailedDetails, objEventDetails.seGatewayHeartbeatFailedDetails)&&
  Objects.equals(this.seGatewayHeartbeatSuccessDetails, objEventDetails.seGatewayHeartbeatSuccessDetails)&&
  Objects.equals(this.seVnicDownEventDetails, objEventDetails.seVnicDownEventDetails)&&
  Objects.equals(this.seVnicTxQueueStallEventDetails, objEventDetails.seVnicTxQueueStallEventDetails)&&
  Objects.equals(this.seBgpPeerStateChangeDetails, objEventDetails.seBgpPeerStateChangeDetails)&&
  Objects.equals(this.seLicensedBandwdithExceededEventDetails, objEventDetails.seLicensedBandwdithExceededEventDetails)&&
  Objects.equals(this.seVnicUpEventDetails, objEventDetails.seVnicUpEventDetails)&&
  Objects.equals(this.seVsFaultEventDetails, objEventDetails.seVsFaultEventDetails)&&
  Objects.equals(this.seIp6DadFailedEventDetails, objEventDetails.seIp6DadFailedEventDetails)&&
  Objects.equals(this.seMemoryLimitEventDetails, objEventDetails.seMemoryLimitEventDetails)&&
  Objects.equals(this.rateLimiterEventDetails, objEventDetails.rateLimiterEventDetails)&&
  Objects.equals(this.seHbRecoveredEventDetails, objEventDetails.seHbRecoveredEventDetails)&&
  Objects.equals(this.seBgpPeerDownDetails, objEventDetails.seBgpPeerDownDetails)&&
  Objects.equals(this.seVsPktBufHighEventDetails, objEventDetails.seVsPktBufHighEventDetails)&&
  Objects.equals(this.seDiscontinuousTimeChangeEventDetails, objEventDetails.seDiscontinuousTimeChangeEventDetails)&&
  Objects.equals(this.seHighIngressProcLatencyEventDetails, objEventDetails.seHighIngressProcLatencyEventDetails)&&
  Objects.equals(this.seVsDelFlowsDisrupted, objEventDetails.seVsDelFlowsDisrupted)&&
  Objects.equals(this.seNtpSynchronizationFailed, objEventDetails.seNtpSynchronizationFailed)&&
  Objects.equals(this.seHighEgressProcLatencyEventDetails, objEventDetails.seHighEgressProcLatencyEventDetails)&&
  Objects.equals(this.seDebugModeEventDetail, objEventDetails.seDebugModeEventDetail)&&
  Objects.equals(this.seObjsyncPeerDownDetails, objEventDetails.seObjsyncPeerDownDetails)&&
  Objects.equals(this.seHmPoolDetails, objEventDetails.seHmPoolDetails)&&
  Objects.equals(this.seHmVsDetails, objEventDetails.seHmVsDetails)&&
  Objects.equals(this.sePersistenceDetails, objEventDetails.sePersistenceDetails)&&
  Objects.equals(this.sePoolLbDetails, objEventDetails.sePoolLbDetails)&&
  Objects.equals(this.seHmGsgroupDetails, objEventDetails.seHmGsgroupDetails)&&
  Objects.equals(this.seHmGsDetails, objEventDetails.seHmGsDetails)&&
  Objects.equals(this.seGeoDbDetails, objEventDetails.seGeoDbDetails)&&
  Objects.equals(this.configCreateDetails, objEventDetails.configCreateDetails)&&
  Objects.equals(this.configUpdateDetails, objEventDetails.configUpdateDetails)&&
  Objects.equals(this.configDeleteDetails, objEventDetails.configDeleteDetails)&&
  Objects.equals(this.configUserLoginDetails, objEventDetails.configUserLoginDetails)&&
  Objects.equals(this.configUserLogoutDetails, objEventDetails.configUserLogoutDetails)&&
  Objects.equals(this.configActionDetails, objEventDetails.configActionDetails)&&
  Objects.equals(this.configPasswordChangeRequestDetails, objEventDetails.configPasswordChangeRequestDetails)&&
  Objects.equals(this.configUserAuthrzRuleDetails, objEventDetails.configUserAuthrzRuleDetails)&&
  Objects.equals(this.configUserNotAuthrzRuleDetails, objEventDetails.configUserNotAuthrzRuleDetails)&&
  Objects.equals(this.configSeGrpFlvUpdateDetails, objEventDetails.configSeGrpFlvUpdateDetails)&&
  Objects.equals(this.apiVersionDeprecated, objEventDetails.apiVersionDeprecated)&&
  Objects.equals(this.sslExpireDetails, objEventDetails.sslExpireDetails)&&
  Objects.equals(this.sslExportDetails, objEventDetails.sslExportDetails)&&
  Objects.equals(this.sslRenewDetails, objEventDetails.sslRenewDetails)&&
  Objects.equals(this.sslRenewFailedDetails, objEventDetails.sslRenewFailedDetails)&&
  Objects.equals(this.sslIgnoredDetails, objEventDetails.sslIgnoredDetails)&&
  Objects.equals(this.sslRevokedDetails, objEventDetails.sslRevokedDetails)&&
  Objects.equals(this.samlMetadataFailedEvents, objEventDetails.samlMetadataFailedEvents)&&
  Objects.equals(this.clusterNodeAddDetails, objEventDetails.clusterNodeAddDetails)&&
  Objects.equals(this.clusterNodeRemoveDetails, objEventDetails.clusterNodeRemoveDetails)&&
  Objects.equals(this.clusterServiceFailedDetails, objEventDetails.clusterServiceFailedDetails)&&
  Objects.equals(this.clusterLeaderFailoverDetails, objEventDetails.clusterLeaderFailoverDetails)&&
  Objects.equals(this.clusterServiceRestoredDetails, objEventDetails.clusterServiceRestoredDetails)&&
  Objects.equals(this.clusterServiceCriticalFailureDetails, objEventDetails.clusterServiceCriticalFailureDetails)&&
  Objects.equals(this.clusterNodeShutdownDetails, objEventDetails.clusterNodeShutdownDetails)&&
  Objects.equals(this.clusterNodeStartedDetails, objEventDetails.clusterNodeStartedDetails)&&
  Objects.equals(this.clusterConfigFailedDetails, objEventDetails.clusterConfigFailedDetails)&&
  Objects.equals(this.clustifyCheckDetails, objEventDetails.clustifyCheckDetails)&&
  Objects.equals(this.clusterNodeDbFailedDetails, objEventDetails.clusterNodeDbFailedDetails)&&
  Objects.equals(this.memoryBalancerInfo, objEventDetails.memoryBalancerInfo)&&
  Objects.equals(this.controllerDiscontinuousTimeChangeEventDetails, objEventDetails.controllerDiscontinuousTimeChangeEventDetails)&&
  Objects.equals(this.metricThresholdUpDetails, objEventDetails.metricThresholdUpDetails)&&
  Objects.equals(this.licenseExpiryDetails, objEventDetails.licenseExpiryDetails)&&
  Objects.equals(this.anomalyDetails, objEventDetails.anomalyDetails)&&
  Objects.equals(this.licenseDetails, objEventDetails.licenseDetails)&&
  Objects.equals(this.metricsDbDiskDetails, objEventDetails.metricsDbDiskDetails)&&
  Objects.equals(this.burstCheckoutDetails, objEventDetails.burstCheckoutDetails)&&
  Objects.equals(this.metricsDbQueueFullDetails, objEventDetails.metricsDbQueueFullDetails)&&
  Objects.equals(this.metricsDbQueueHealthyDetails, objEventDetails.metricsDbQueueHealthyDetails)&&
  Objects.equals(this.metricsDbSyncFailureDetails, objEventDetails.metricsDbSyncFailureDetails)&&
  Objects.equals(this.metricsGrpcAuthFailureDetails, objEventDetails.metricsGrpcAuthFailureDetails)&&
  Objects.equals(this.osInfraDetails, objEventDetails.osInfraDetails)&&
  Objects.equals(this.osSeVmDetails, objEventDetails.osSeVmDetails)&&
  Objects.equals(this.osVnicDetails, objEventDetails.osVnicDetails)&&
  Objects.equals(this.osIpDetails, objEventDetails.osIpDetails)&&
  Objects.equals(this.osLbauditDetails, objEventDetails.osLbauditDetails)&&
  Objects.equals(this.osLbpluginOpDetails, objEventDetails.osLbpluginOpDetails)&&
  Objects.equals(this.osSyncServicesDetails, objEventDetails.osSyncServicesDetails)&&
  Objects.equals(this.osApiVerCheckFailure, objEventDetails.osApiVerCheckFailure)&&
  Objects.equals(this.awsInfraDetails, objEventDetails.awsInfraDetails)&&
  Objects.equals(this.ccSeVmDetails, objEventDetails.ccSeVmDetails)&&
  Objects.equals(this.ccVnicDetails, objEventDetails.ccVnicDetails)&&
  Objects.equals(this.ccIpDetails, objEventDetails.ccIpDetails)&&
  Objects.equals(this.ccSyncServicesDetails, objEventDetails.ccSyncServicesDetails)&&
  Objects.equals(this.ccVipUpdateDetails, objEventDetails.ccVipUpdateDetails)&&
  Objects.equals(this.ccInfraDetails, objEventDetails.ccInfraDetails)&&
  Objects.equals(this.ccTenantDelDetails, objEventDetails.ccTenantDelDetails)&&
  Objects.equals(this.ccClusterVipDetails, objEventDetails.ccClusterVipDetails)&&
  Objects.equals(this.ccDnsUpdateDetails, objEventDetails.ccDnsUpdateDetails)&&
  Objects.equals(this.ccHealthDetails, objEventDetails.ccHealthDetails)&&
  Objects.equals(this.ccParkintfDetails, objEventDetails.ccParkintfDetails)&&
  Objects.equals(this.awsAsgNotifDetails, objEventDetails.awsAsgNotifDetails)&&
  Objects.equals(this.awsAsgDeletionDetails, objEventDetails.awsAsgDeletionDetails)&&
  Objects.equals(this.ccScalesetNotifDetails, objEventDetails.ccScalesetNotifDetails)&&
  Objects.equals(this.csInfraDetails, objEventDetails.csInfraDetails)&&
  Objects.equals(this.bmInfraDetails, objEventDetails.bmInfraDetails)&&
  Objects.equals(this.vcaInfraDetails, objEventDetails.vcaInfraDetails)&&
  Objects.equals(this.marathonServicePortConflictDetails, objEventDetails.marathonServicePortConflictDetails)&&
  Objects.equals(this.mesosInfraDetails, objEventDetails.mesosInfraDetails)&&
  Objects.equals(this.dockerUcpDetails, objEventDetails.dockerUcpDetails)&&
  Objects.equals(this.containerCloudSetup, objEventDetails.containerCloudSetup)&&
  Objects.equals(this.containerCloudSevice, objEventDetails.containerCloudSevice)&&
  Objects.equals(this.containerCloudBatchSetup, objEventDetails.containerCloudBatchSetup)&&
  Objects.equals(this.hsDetails, objEventDetails.hsDetails)&&
  Objects.equals(this.nwSubnetClashDetails, objEventDetails.nwSubnetClashDetails)&&
  Objects.equals(this.nwSummarizedDetails, objEventDetails.nwSummarizedDetails)&&
  Objects.equals(this.networkSubnetDetails, objEventDetails.networkSubnetDetails)&&
  Objects.equals(this.avgUptimeChangeDetails, objEventDetails.avgUptimeChangeDetails)&&
  Objects.equals(this.dosAttackEventDetails, objEventDetails.dosAttackEventDetails)&&
  Objects.equals(this.serverAutoscaleoutInfo, objEventDetails.serverAutoscaleoutInfo)&&
  Objects.equals(this.serverAutoscaleinInfo, objEventDetails.serverAutoscaleinInfo)&&
  Objects.equals(this.serverAutoscaleoutCompleteInfo, objEventDetails.serverAutoscaleoutCompleteInfo)&&
  Objects.equals(this.serverAutoscaleinCompleteInfo, objEventDetails.serverAutoscaleinCompleteInfo)&&
  Objects.equals(this.serverAutoscaleFailedInfo, objEventDetails.serverAutoscaleFailedInfo)&&
  Objects.equals(this.poolDeploymentSuccessInfo, objEventDetails.poolDeploymentSuccessInfo)&&
  Objects.equals(this.poolDeploymentFailureInfo, objEventDetails.poolDeploymentFailureInfo)&&
  Objects.equals(this.poolDeploymentUpdateInfo, objEventDetails.poolDeploymentUpdateInfo)&&
  Objects.equals(this.glbInfo, objEventDetails.glbInfo)&&
  Objects.equals(this.gsInfo, objEventDetails.gsInfo)&&
  Objects.equals(this.schedulerActionInfo, objEventDetails.schedulerActionInfo)&&
  Objects.equals(this.gcpInfo, objEventDetails.gcpInfo)&&
  Objects.equals(this.gcpCloudRouterInfo, objEventDetails.gcpCloudRouterInfo)&&
  Objects.equals(this.vipDnsInfo, objEventDetails.vipDnsInfo)&&
  Objects.equals(this.dnsSyncInfo, objEventDetails.dnsSyncInfo)&&
  Objects.equals(this.azureInfo, objEventDetails.azureInfo)&&
  Objects.equals(this.azureMpInfo, objEventDetails.azureMpInfo)&&
  Objects.equals(this.syncServicesInfo, objEventDetails.syncServicesInfo)&&
  Objects.equals(this.ociInfo, objEventDetails.ociInfo)&&
  Objects.equals(this.tencentInfo, objEventDetails.tencentInfo)&&
  Objects.equals(this.albservicesStatusDetails, objEventDetails.albservicesStatusDetails)&&
  Objects.equals(this.crsDetails, objEventDetails.crsDetails)&&
  Objects.equals(this.crsDeploymentSuccess, objEventDetails.crsDeploymentSuccess)&&
  Objects.equals(this.crsDeploymentFailure, objEventDetails.crsDeploymentFailure)&&
  Objects.equals(this.albservicesCaseDetails, objEventDetails.albservicesCaseDetails)&&
  Objects.equals(this.albservicesFileUploadDetails, objEventDetails.albservicesFileUploadDetails)&&
  Objects.equals(this.crsUpdateDetails, objEventDetails.crsUpdateDetails)&&
  Objects.equals(this.ipThreatDbEventData, objEventDetails.ipThreatDbEventData)&&
  Objects.equals(this.appSignatureEventData, objEventDetails.appSignatureEventData)&&
  Objects.equals(this.albservicesFileDownloadDetails, objEventDetails.albservicesFileDownloadDetails)&&
  Objects.equals(this.nsxtInfo, objEventDetails.nsxtInfo)&&
  Objects.equals(this.nsxtImgDetails, objEventDetails.nsxtImgDetails)&&
  Objects.equals(this.vcenterClusterDetails, objEventDetails.vcenterClusterDetails)&&
  Objects.equals(this.nsxtServiceDetails, objEventDetails.nsxtServiceDetails)&&
  Objects.equals(this.nsxtEndpointDetails, objEventDetails.nsxtEndpointDetails)&&
  Objects.equals(this.nsxtPolicyDetails, objEventDetails.nsxtPolicyDetails)&&
  Objects.equals(this.nsxtRuleDetails, objEventDetails.nsxtRuleDetails)&&
  Objects.equals(this.vcenterImgDetails, objEventDetails.vcenterImgDetails)&&
  Objects.equals(this.nsxtT1SegDetails, objEventDetails.nsxtT1SegDetails)&&
  Objects.equals(this.psmProgramDetails, objEventDetails.psmProgramDetails)&&
  Objects.equals(this.secMgrDataEvent, objEventDetails.secMgrDataEvent)&&
  Objects.equals(this.falsePositiveDetails, objEventDetails.falsePositiveDetails)&&
  Objects.equals(this.secMgrUaEventDetails, objEventDetails.secMgrUaEventDetails)&&
  Objects.equals(this.cloudAsgNotifDetails, objEventDetails.cloudAsgNotifDetails)&&
  Objects.equals(this.cloudAutoscalingConfigFailureDetails, objEventDetails.cloudAutoscalingConfigFailureDetails)&&
  Objects.equals(this.cloudRouteNotifDetails, objEventDetails.cloudRouteNotifDetails)&&
  Objects.equals(this.licenseTransactionDetails, objEventDetails.licenseTransactionDetails)&&
  Objects.equals(this.seReconcileDetails, objEventDetails.seReconcileDetails)&&
  Objects.equals(this.controllerLicenseReconcileDetails, objEventDetails.controllerLicenseReconcileDetails)&&
  Objects.equals(this.licenseTierSwitchDetails, objEventDetails.licenseTierSwitchDetails)&&
  Objects.equals(this.centralLicenseSubscriptionDetails, objEventDetails.centralLicenseSubscriptionDetails)&&
  Objects.equals(this.centralLicenseRefreshDetails, objEventDetails.centralLicenseRefreshDetails)&&
  Objects.equals(this.genericAuditComplianceEventInfo, objEventDetails.genericAuditComplianceEventInfo)&&
  Objects.equals(this.secureKeyExchangeInfo, objEventDetails.secureKeyExchangeInfo)&&
  Objects.equals(this.logAgentEventDetails, objEventDetails.logAgentEventDetails)&&
  Objects.equals(this.databaseEventInfo, objEventDetails.databaseEventInfo)&&
  Objects.equals(this.dnsQueryError, objEventDetails.dnsQueryError)&&
  Objects.equals(this.connectionEvent, objEventDetails.connectionEvent)&&
  Objects.equals(this.adaptreplEvent, objEventDetails.adaptreplEvent)&&
  Objects.equals(this.pkiprofileDetails, objEventDetails.pkiprofileDetails)&&
  Objects.equals(this.diskCleanupEventDetails, objEventDetails.diskCleanupEventDetails);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class EventDetails {\n");
                  sb.append("    adaptreplEvent: ").append(toIndentedString(adaptreplEvent)).append("\n");
                        sb.append("    addNetworksDetails: ").append(toIndentedString(addNetworksDetails)).append("\n");
                        sb.append("    albservicesCaseDetails: ").append(toIndentedString(albservicesCaseDetails)).append("\n");
                        sb.append("    albservicesFileDownloadDetails: ").append(toIndentedString(albservicesFileDownloadDetails)).append("\n");
                        sb.append("    albservicesFileUploadDetails: ").append(toIndentedString(albservicesFileUploadDetails)).append("\n");
                        sb.append("    albservicesStatusDetails: ").append(toIndentedString(albservicesStatusDetails)).append("\n");
                        sb.append("    allSeupgradeEventDetails: ").append(toIndentedString(allSeupgradeEventDetails)).append("\n");
                        sb.append("    anomalyDetails: ").append(toIndentedString(anomalyDetails)).append("\n");
                        sb.append("    apiVersionDeprecated: ").append(toIndentedString(apiVersionDeprecated)).append("\n");
                        sb.append("    appSignatureEventData: ").append(toIndentedString(appSignatureEventData)).append("\n");
                        sb.append("    attachIpStatusDetails: ").append(toIndentedString(attachIpStatusDetails)).append("\n");
                        sb.append("    avgUptimeChangeDetails: ").append(toIndentedString(avgUptimeChangeDetails)).append("\n");
                        sb.append("    awsAsgDeletionDetails: ").append(toIndentedString(awsAsgDeletionDetails)).append("\n");
                        sb.append("    awsAsgNotifDetails: ").append(toIndentedString(awsAsgNotifDetails)).append("\n");
                        sb.append("    awsInfraDetails: ").append(toIndentedString(awsInfraDetails)).append("\n");
                        sb.append("    azureInfo: ").append(toIndentedString(azureInfo)).append("\n");
                        sb.append("    azureMpInfo: ").append(toIndentedString(azureMpInfo)).append("\n");
                        sb.append("    bindVsSeDetails: ").append(toIndentedString(bindVsSeDetails)).append("\n");
                        sb.append("    bmInfraDetails: ").append(toIndentedString(bmInfraDetails)).append("\n");
                        sb.append("    bootupFailDetails: ").append(toIndentedString(bootupFailDetails)).append("\n");
                        sb.append("    burstCheckoutDetails: ").append(toIndentedString(burstCheckoutDetails)).append("\n");
                        sb.append("    ccClusterVipDetails: ").append(toIndentedString(ccClusterVipDetails)).append("\n");
                        sb.append("    ccDnsUpdateDetails: ").append(toIndentedString(ccDnsUpdateDetails)).append("\n");
                        sb.append("    ccHealthDetails: ").append(toIndentedString(ccHealthDetails)).append("\n");
                        sb.append("    ccInfraDetails: ").append(toIndentedString(ccInfraDetails)).append("\n");
                        sb.append("    ccIpDetails: ").append(toIndentedString(ccIpDetails)).append("\n");
                        sb.append("    ccParkintfDetails: ").append(toIndentedString(ccParkintfDetails)).append("\n");
                        sb.append("    ccScalesetNotifDetails: ").append(toIndentedString(ccScalesetNotifDetails)).append("\n");
                        sb.append("    ccSeVmDetails: ").append(toIndentedString(ccSeVmDetails)).append("\n");
                        sb.append("    ccSyncServicesDetails: ").append(toIndentedString(ccSyncServicesDetails)).append("\n");
                        sb.append("    ccTenantDelDetails: ").append(toIndentedString(ccTenantDelDetails)).append("\n");
                        sb.append("    ccVipUpdateDetails: ").append(toIndentedString(ccVipUpdateDetails)).append("\n");
                        sb.append("    ccVnicDetails: ").append(toIndentedString(ccVnicDetails)).append("\n");
                        sb.append("    centralLicenseRefreshDetails: ").append(toIndentedString(centralLicenseRefreshDetails)).append("\n");
                        sb.append("    centralLicenseSubscriptionDetails: ").append(toIndentedString(centralLicenseSubscriptionDetails)).append("\n");
                        sb.append("    cloudAsgNotifDetails: ").append(toIndentedString(cloudAsgNotifDetails)).append("\n");
                        sb.append("    cloudAutoscalingConfigFailureDetails: ").append(toIndentedString(cloudAutoscalingConfigFailureDetails)).append("\n");
                        sb.append("    cloudRouteNotifDetails: ").append(toIndentedString(cloudRouteNotifDetails)).append("\n");
                        sb.append("    clusterConfigFailedDetails: ").append(toIndentedString(clusterConfigFailedDetails)).append("\n");
                        sb.append("    clusterLeaderFailoverDetails: ").append(toIndentedString(clusterLeaderFailoverDetails)).append("\n");
                        sb.append("    clusterNodeAddDetails: ").append(toIndentedString(clusterNodeAddDetails)).append("\n");
                        sb.append("    clusterNodeDbFailedDetails: ").append(toIndentedString(clusterNodeDbFailedDetails)).append("\n");
                        sb.append("    clusterNodeRemoveDetails: ").append(toIndentedString(clusterNodeRemoveDetails)).append("\n");
                        sb.append("    clusterNodeShutdownDetails: ").append(toIndentedString(clusterNodeShutdownDetails)).append("\n");
                        sb.append("    clusterNodeStartedDetails: ").append(toIndentedString(clusterNodeStartedDetails)).append("\n");
                        sb.append("    clusterServiceCriticalFailureDetails: ").append(toIndentedString(clusterServiceCriticalFailureDetails)).append("\n");
                        sb.append("    clusterServiceFailedDetails: ").append(toIndentedString(clusterServiceFailedDetails)).append("\n");
                        sb.append("    clusterServiceRestoredDetails: ").append(toIndentedString(clusterServiceRestoredDetails)).append("\n");
                        sb.append("    clustifyCheckDetails: ").append(toIndentedString(clustifyCheckDetails)).append("\n");
                        sb.append("    cntlrHostListDetails: ").append(toIndentedString(cntlrHostListDetails)).append("\n");
                        sb.append("    configActionDetails: ").append(toIndentedString(configActionDetails)).append("\n");
                        sb.append("    configCreateDetails: ").append(toIndentedString(configCreateDetails)).append("\n");
                        sb.append("    configDeleteDetails: ").append(toIndentedString(configDeleteDetails)).append("\n");
                        sb.append("    configPasswordChangeRequestDetails: ").append(toIndentedString(configPasswordChangeRequestDetails)).append("\n");
                        sb.append("    configSeGrpFlvUpdateDetails: ").append(toIndentedString(configSeGrpFlvUpdateDetails)).append("\n");
                        sb.append("    configUpdateDetails: ").append(toIndentedString(configUpdateDetails)).append("\n");
                        sb.append("    configUserAuthrzRuleDetails: ").append(toIndentedString(configUserAuthrzRuleDetails)).append("\n");
                        sb.append("    configUserLoginDetails: ").append(toIndentedString(configUserLoginDetails)).append("\n");
                        sb.append("    configUserLogoutDetails: ").append(toIndentedString(configUserLogoutDetails)).append("\n");
                        sb.append("    configUserNotAuthrzRuleDetails: ").append(toIndentedString(configUserNotAuthrzRuleDetails)).append("\n");
                        sb.append("    connectionEvent: ").append(toIndentedString(connectionEvent)).append("\n");
                        sb.append("    containerCloudBatchSetup: ").append(toIndentedString(containerCloudBatchSetup)).append("\n");
                        sb.append("    containerCloudSetup: ").append(toIndentedString(containerCloudSetup)).append("\n");
                        sb.append("    containerCloudSevice: ").append(toIndentedString(containerCloudSevice)).append("\n");
                        sb.append("    controllerDiscontinuousTimeChangeEventDetails: ").append(toIndentedString(controllerDiscontinuousTimeChangeEventDetails)).append("\n");
                        sb.append("    controllerLicenseReconcileDetails: ").append(toIndentedString(controllerLicenseReconcileDetails)).append("\n");
                        sb.append("    crsDeploymentFailure: ").append(toIndentedString(crsDeploymentFailure)).append("\n");
                        sb.append("    crsDeploymentSuccess: ").append(toIndentedString(crsDeploymentSuccess)).append("\n");
                        sb.append("    crsDetails: ").append(toIndentedString(crsDetails)).append("\n");
                        sb.append("    crsUpdateDetails: ").append(toIndentedString(crsUpdateDetails)).append("\n");
                        sb.append("    csInfraDetails: ").append(toIndentedString(csInfraDetails)).append("\n");
                        sb.append("    databaseEventInfo: ").append(toIndentedString(databaseEventInfo)).append("\n");
                        sb.append("    deleteSeDetails: ").append(toIndentedString(deleteSeDetails)).append("\n");
                        sb.append("    detachIpStatusDetails: ").append(toIndentedString(detachIpStatusDetails)).append("\n");
                        sb.append("    disableSeMigrateDetails: ").append(toIndentedString(disableSeMigrateDetails)).append("\n");
                        sb.append("    discSummary: ").append(toIndentedString(discSummary)).append("\n");
                        sb.append("    diskCleanupEventDetails: ").append(toIndentedString(diskCleanupEventDetails)).append("\n");
                        sb.append("    dnsQueryError: ").append(toIndentedString(dnsQueryError)).append("\n");
                        sb.append("    dnsSyncInfo: ").append(toIndentedString(dnsSyncInfo)).append("\n");
                        sb.append("    dockerUcpDetails: ").append(toIndentedString(dockerUcpDetails)).append("\n");
                        sb.append("    dosAttackEventDetails: ").append(toIndentedString(dosAttackEventDetails)).append("\n");
                        sb.append("    falsePositiveDetails: ").append(toIndentedString(falsePositiveDetails)).append("\n");
                        sb.append("    gcpCloudRouterInfo: ").append(toIndentedString(gcpCloudRouterInfo)).append("\n");
                        sb.append("    gcpInfo: ").append(toIndentedString(gcpInfo)).append("\n");
                        sb.append("    genericAuditComplianceEventInfo: ").append(toIndentedString(genericAuditComplianceEventInfo)).append("\n");
                        sb.append("    glbInfo: ").append(toIndentedString(glbInfo)).append("\n");
                        sb.append("    gsInfo: ").append(toIndentedString(gsInfo)).append("\n");
                        sb.append("    hostUnavailDetails: ").append(toIndentedString(hostUnavailDetails)).append("\n");
                        sb.append("    hsDetails: ").append(toIndentedString(hsDetails)).append("\n");
                        sb.append("    ipFailDetails: ").append(toIndentedString(ipFailDetails)).append("\n");
                        sb.append("    ipThreatDbEventData: ").append(toIndentedString(ipThreatDbEventData)).append("\n");
                        sb.append("    licenseDetails: ").append(toIndentedString(licenseDetails)).append("\n");
                        sb.append("    licenseExpiryDetails: ").append(toIndentedString(licenseExpiryDetails)).append("\n");
                        sb.append("    licenseTierSwitchDetails: ").append(toIndentedString(licenseTierSwitchDetails)).append("\n");
                        sb.append("    licenseTransactionDetails: ").append(toIndentedString(licenseTransactionDetails)).append("\n");
                        sb.append("    logAgentEventDetails: ").append(toIndentedString(logAgentEventDetails)).append("\n");
                        sb.append("    marathonServicePortConflictDetails: ").append(toIndentedString(marathonServicePortConflictDetails)).append("\n");
                        sb.append("    memoryBalancerInfo: ").append(toIndentedString(memoryBalancerInfo)).append("\n");
                        sb.append("    mesosInfraDetails: ").append(toIndentedString(mesosInfraDetails)).append("\n");
                        sb.append("    metricThresholdUpDetails: ").append(toIndentedString(metricThresholdUpDetails)).append("\n");
                        sb.append("    metricsDbDiskDetails: ").append(toIndentedString(metricsDbDiskDetails)).append("\n");
                        sb.append("    metricsDbQueueFullDetails: ").append(toIndentedString(metricsDbQueueFullDetails)).append("\n");
                        sb.append("    metricsDbQueueHealthyDetails: ").append(toIndentedString(metricsDbQueueHealthyDetails)).append("\n");
                        sb.append("    metricsDbSyncFailureDetails: ").append(toIndentedString(metricsDbSyncFailureDetails)).append("\n");
                        sb.append("    metricsGrpcAuthFailureDetails: ").append(toIndentedString(metricsGrpcAuthFailureDetails)).append("\n");
                        sb.append("    mgmtNwChangeDetails: ").append(toIndentedString(mgmtNwChangeDetails)).append("\n");
                        sb.append("    modifyNetworksDetails: ").append(toIndentedString(modifyNetworksDetails)).append("\n");
                        sb.append("    networkSubnetDetails: ").append(toIndentedString(networkSubnetDetails)).append("\n");
                        sb.append("    nsxtEndpointDetails: ").append(toIndentedString(nsxtEndpointDetails)).append("\n");
                        sb.append("    nsxtImgDetails: ").append(toIndentedString(nsxtImgDetails)).append("\n");
                        sb.append("    nsxtInfo: ").append(toIndentedString(nsxtInfo)).append("\n");
                        sb.append("    nsxtPolicyDetails: ").append(toIndentedString(nsxtPolicyDetails)).append("\n");
                        sb.append("    nsxtRuleDetails: ").append(toIndentedString(nsxtRuleDetails)).append("\n");
                        sb.append("    nsxtServiceDetails: ").append(toIndentedString(nsxtServiceDetails)).append("\n");
                        sb.append("    nsxtT1SegDetails: ").append(toIndentedString(nsxtT1SegDetails)).append("\n");
                        sb.append("    nwSubnetClashDetails: ").append(toIndentedString(nwSubnetClashDetails)).append("\n");
                        sb.append("    nwSummarizedDetails: ").append(toIndentedString(nwSummarizedDetails)).append("\n");
                        sb.append("    ociInfo: ").append(toIndentedString(ociInfo)).append("\n");
                        sb.append("    osApiVerCheckFailure: ").append(toIndentedString(osApiVerCheckFailure)).append("\n");
                        sb.append("    osInfraDetails: ").append(toIndentedString(osInfraDetails)).append("\n");
                        sb.append("    osIpDetails: ").append(toIndentedString(osIpDetails)).append("\n");
                        sb.append("    osLbauditDetails: ").append(toIndentedString(osLbauditDetails)).append("\n");
                        sb.append("    osLbpluginOpDetails: ").append(toIndentedString(osLbpluginOpDetails)).append("\n");
                        sb.append("    osSeVmDetails: ").append(toIndentedString(osSeVmDetails)).append("\n");
                        sb.append("    osSyncServicesDetails: ").append(toIndentedString(osSyncServicesDetails)).append("\n");
                        sb.append("    osVnicDetails: ").append(toIndentedString(osVnicDetails)).append("\n");
                        sb.append("    pkiprofileDetails: ").append(toIndentedString(pkiprofileDetails)).append("\n");
                        sb.append("    poolDeploymentFailureInfo: ").append(toIndentedString(poolDeploymentFailureInfo)).append("\n");
                        sb.append("    poolDeploymentSuccessInfo: ").append(toIndentedString(poolDeploymentSuccessInfo)).append("\n");
                        sb.append("    poolDeploymentUpdateInfo: ").append(toIndentedString(poolDeploymentUpdateInfo)).append("\n");
                        sb.append("    poolServerDeleteDetails: ").append(toIndentedString(poolServerDeleteDetails)).append("\n");
                        sb.append("    psmProgramDetails: ").append(toIndentedString(psmProgramDetails)).append("\n");
                        sb.append("    rateLimiterEventDetails: ").append(toIndentedString(rateLimiterEventDetails)).append("\n");
                        sb.append("    rebalanceMigrateDetails: ").append(toIndentedString(rebalanceMigrateDetails)).append("\n");
                        sb.append("    rebalanceScaleinDetails: ").append(toIndentedString(rebalanceScaleinDetails)).append("\n");
                        sb.append("    rebalanceScaleoutDetails: ").append(toIndentedString(rebalanceScaleoutDetails)).append("\n");
                        sb.append("    rebootSeDetails: ").append(toIndentedString(rebootSeDetails)).append("\n");
                        sb.append("    samlMetadataFailedEvents: ").append(toIndentedString(samlMetadataFailedEvents)).append("\n");
                        sb.append("    schedulerActionInfo: ").append(toIndentedString(schedulerActionInfo)).append("\n");
                        sb.append("    seBgpPeerDownDetails: ").append(toIndentedString(seBgpPeerDownDetails)).append("\n");
                        sb.append("    seBgpPeerStateChangeDetails: ").append(toIndentedString(seBgpPeerStateChangeDetails)).append("\n");
                        sb.append("    seDebugModeEventDetail: ").append(toIndentedString(seDebugModeEventDetail)).append("\n");
                        sb.append("    seDetails: ").append(toIndentedString(seDetails)).append("\n");
                        sb.append("    seDiscontinuousTimeChangeEventDetails: ").append(toIndentedString(seDiscontinuousTimeChangeEventDetails)).append("\n");
                        sb.append("    seDupipEventDetails: ").append(toIndentedString(seDupipEventDetails)).append("\n");
                        sb.append("    seGatewayHeartbeatFailedDetails: ").append(toIndentedString(seGatewayHeartbeatFailedDetails)).append("\n");
                        sb.append("    seGatewayHeartbeatSuccessDetails: ").append(toIndentedString(seGatewayHeartbeatSuccessDetails)).append("\n");
                        sb.append("    seGeoDbDetails: ").append(toIndentedString(seGeoDbDetails)).append("\n");
                        sb.append("    seHbEventDetails: ").append(toIndentedString(seHbEventDetails)).append("\n");
                        sb.append("    seHbRecoveredEventDetails: ").append(toIndentedString(seHbRecoveredEventDetails)).append("\n");
                        sb.append("    seHighEgressProcLatencyEventDetails: ").append(toIndentedString(seHighEgressProcLatencyEventDetails)).append("\n");
                        sb.append("    seHighIngressProcLatencyEventDetails: ").append(toIndentedString(seHighIngressProcLatencyEventDetails)).append("\n");
                        sb.append("    seHmGsDetails: ").append(toIndentedString(seHmGsDetails)).append("\n");
                        sb.append("    seHmGsgroupDetails: ").append(toIndentedString(seHmGsgroupDetails)).append("\n");
                        sb.append("    seHmPoolDetails: ").append(toIndentedString(seHmPoolDetails)).append("\n");
                        sb.append("    seHmVsDetails: ").append(toIndentedString(seHmVsDetails)).append("\n");
                        sb.append("    seIp6DadFailedEventDetails: ").append(toIndentedString(seIp6DadFailedEventDetails)).append("\n");
                        sb.append("    seIpAddedEventDetails: ").append(toIndentedString(seIpAddedEventDetails)).append("\n");
                        sb.append("    seIpRemovedEventDetails: ").append(toIndentedString(seIpRemovedEventDetails)).append("\n");
                        sb.append("    seIpfailureEventDetails: ").append(toIndentedString(seIpfailureEventDetails)).append("\n");
                        sb.append("    seLicensedBandwdithExceededEventDetails: ").append(toIndentedString(seLicensedBandwdithExceededEventDetails)).append("\n");
                        sb.append("    seMemoryLimitEventDetails: ").append(toIndentedString(seMemoryLimitEventDetails)).append("\n");
                        sb.append("    seNtpSynchronizationFailed: ").append(toIndentedString(seNtpSynchronizationFailed)).append("\n");
                        sb.append("    seObjsyncPeerDownDetails: ").append(toIndentedString(seObjsyncPeerDownDetails)).append("\n");
                        sb.append("    sePersistenceDetails: ").append(toIndentedString(sePersistenceDetails)).append("\n");
                        sb.append("    sePoolLbDetails: ").append(toIndentedString(sePoolLbDetails)).append("\n");
                        sb.append("    seReconcileDetails: ").append(toIndentedString(seReconcileDetails)).append("\n");
                        sb.append("    seThreshEventDetails: ").append(toIndentedString(seThreshEventDetails)).append("\n");
                        sb.append("    seVnicDownEventDetails: ").append(toIndentedString(seVnicDownEventDetails)).append("\n");
                        sb.append("    seVnicTxQueueStallEventDetails: ").append(toIndentedString(seVnicTxQueueStallEventDetails)).append("\n");
                        sb.append("    seVnicUpEventDetails: ").append(toIndentedString(seVnicUpEventDetails)).append("\n");
                        sb.append("    seVsDelFlowsDisrupted: ").append(toIndentedString(seVsDelFlowsDisrupted)).append("\n");
                        sb.append("    seVsFaultEventDetails: ").append(toIndentedString(seVsFaultEventDetails)).append("\n");
                        sb.append("    seVsPktBufHighEventDetails: ").append(toIndentedString(seVsPktBufHighEventDetails)).append("\n");
                        sb.append("    secMgrDataEvent: ").append(toIndentedString(secMgrDataEvent)).append("\n");
                        sb.append("    secMgrUaEventDetails: ").append(toIndentedString(secMgrUaEventDetails)).append("\n");
                        sb.append("    secureKeyExchangeInfo: ").append(toIndentedString(secureKeyExchangeInfo)).append("\n");
                        sb.append("    semigrateEventDetails: ").append(toIndentedString(semigrateEventDetails)).append("\n");
                        sb.append("    serverAutoscaleFailedInfo: ").append(toIndentedString(serverAutoscaleFailedInfo)).append("\n");
                        sb.append("    serverAutoscaleinCompleteInfo: ").append(toIndentedString(serverAutoscaleinCompleteInfo)).append("\n");
                        sb.append("    serverAutoscaleinInfo: ").append(toIndentedString(serverAutoscaleinInfo)).append("\n");
                        sb.append("    serverAutoscaleoutCompleteInfo: ").append(toIndentedString(serverAutoscaleoutCompleteInfo)).append("\n");
                        sb.append("    serverAutoscaleoutInfo: ").append(toIndentedString(serverAutoscaleoutInfo)).append("\n");
                        sb.append("    seupgradeDisruptedDetails: ").append(toIndentedString(seupgradeDisruptedDetails)).append("\n");
                        sb.append("    seupgradeEventDetails: ").append(toIndentedString(seupgradeEventDetails)).append("\n");
                        sb.append("    seupgradeMigrateDetails: ").append(toIndentedString(seupgradeMigrateDetails)).append("\n");
                        sb.append("    seupgradeScaleinDetails: ").append(toIndentedString(seupgradeScaleinDetails)).append("\n");
                        sb.append("    seupgradeScaleoutDetails: ").append(toIndentedString(seupgradeScaleoutDetails)).append("\n");
                        sb.append("    spawnSeDetails: ").append(toIndentedString(spawnSeDetails)).append("\n");
                        sb.append("    sslExpireDetails: ").append(toIndentedString(sslExpireDetails)).append("\n");
                        sb.append("    sslExportDetails: ").append(toIndentedString(sslExportDetails)).append("\n");
                        sb.append("    sslIgnoredDetails: ").append(toIndentedString(sslIgnoredDetails)).append("\n");
                        sb.append("    sslRenewDetails: ").append(toIndentedString(sslRenewDetails)).append("\n");
                        sb.append("    sslRenewFailedDetails: ").append(toIndentedString(sslRenewFailedDetails)).append("\n");
                        sb.append("    sslRevokedDetails: ").append(toIndentedString(sslRevokedDetails)).append("\n");
                        sb.append("    switchoverDetails: ").append(toIndentedString(switchoverDetails)).append("\n");
                        sb.append("    switchoverFailDetails: ").append(toIndentedString(switchoverFailDetails)).append("\n");
                        sb.append("    syncServicesInfo: ").append(toIndentedString(syncServicesInfo)).append("\n");
                        sb.append("    tencentInfo: ").append(toIndentedString(tencentInfo)).append("\n");
                        sb.append("    unbindVsSeDetails: ").append(toIndentedString(unbindVsSeDetails)).append("\n");
                        sb.append("    upgradeEntry: ").append(toIndentedString(upgradeEntry)).append("\n");
                        sb.append("    upgradeStatusInfo: ").append(toIndentedString(upgradeStatusInfo)).append("\n");
                        sb.append("    vcaInfraDetails: ").append(toIndentedString(vcaInfraDetails)).append("\n");
                        sb.append("    vcenterCloudDeleteDetails: ").append(toIndentedString(vcenterCloudDeleteDetails)).append("\n");
                        sb.append("    vcenterClusterDetails: ").append(toIndentedString(vcenterClusterDetails)).append("\n");
                        sb.append("    vcenterConnectivityStatus: ").append(toIndentedString(vcenterConnectivityStatus)).append("\n");
                        sb.append("    vcenterDetails: ").append(toIndentedString(vcenterDetails)).append("\n");
                        sb.append("    vcenterDiscFailure: ").append(toIndentedString(vcenterDiscFailure)).append("\n");
                        sb.append("    vcenterImgDetails: ").append(toIndentedString(vcenterImgDetails)).append("\n");
                        sb.append("    vcenterNetworkLimit: ").append(toIndentedString(vcenterNetworkLimit)).append("\n");
                        sb.append("    vcenterObjDeleteDetails: ").append(toIndentedString(vcenterObjDeleteDetails)).append("\n");
                        sb.append("    vcenterTagEventDetails: ").append(toIndentedString(vcenterTagEventDetails)).append("\n");
                        sb.append("    vipAutoscale: ").append(toIndentedString(vipAutoscale)).append("\n");
                        sb.append("    vipDnsInfo: ").append(toIndentedString(vipDnsInfo)).append("\n");
                        sb.append("    vipSymmetryDetails: ").append(toIndentedString(vipSymmetryDetails)).append("\n");
                        sb.append("    vmDetails: ").append(toIndentedString(vmDetails)).append("\n");
                        sb.append("    vsAwaitingseDetails: ").append(toIndentedString(vsAwaitingseDetails)).append("\n");
                        sb.append("    vsErrorDetails: ").append(toIndentedString(vsErrorDetails)).append("\n");
                        sb.append("    vsFsmDetails: ").append(toIndentedString(vsFsmDetails)).append("\n");
                        sb.append("    vsInitialplacementDetails: ").append(toIndentedString(vsInitialplacementDetails)).append("\n");
                        sb.append("    vsMigrateDetails: ").append(toIndentedString(vsMigrateDetails)).append("\n");
                        sb.append("    vsPoolNwFltrDetails: ").append(toIndentedString(vsPoolNwFltrDetails)).append("\n");
                        sb.append("    vsScaleinDetails: ").append(toIndentedString(vsScaleinDetails)).append("\n");
                        sb.append("    vsScaleoutDetails: ").append(toIndentedString(vsScaleoutDetails)).append("\n");
                        sb.append("    vsSwitchoverDetails: ").append(toIndentedString(vsSwitchoverDetails)).append("\n");
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
