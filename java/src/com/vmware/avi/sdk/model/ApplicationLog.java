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
 * The ApplicationLog is a POJO class extends AviRestResource that used for creating
 * ApplicationLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationLog  {
    @JsonProperty("adf")
    private Boolean adf = false;

    @JsonProperty("all_request_headers")
    private String allRequestHeaders;

    @JsonProperty("all_response_headers")
    private String allResponseHeaders;

    @JsonProperty("app_response_time")
    private Integer appResponseTime;

    @JsonProperty("auth_status")
    private String authStatus = "AUTH_STATUS_NO_AUTHENTICATION";

    @JsonProperty("avg_ingress_latency_be")
    private Integer avgIngressLatencyBe;

    @JsonProperty("avg_ingress_latency_fe")
    private Integer avgIngressLatencyFe;

    @JsonProperty("body_updated")
    private String bodyUpdated = "NOT_UPDATED";

    @JsonProperty("bot_management_log")
    private BotManagementLog botManagementLog;

    @JsonProperty("cache_disabled_by_ds")
    private Boolean cacheDisabledByDs = false;

    @JsonProperty("cache_hit")
    private Boolean cacheHit = false;

    @JsonProperty("cacheable")
    private Boolean cacheable = false;

    @JsonProperty("client_browser")
    private String clientBrowser;

    @JsonProperty("client_cipher_list")
    private SSLCipherList clientCipherList;

    @JsonProperty("client_dest_port")
    private Integer clientDestPort;

    @JsonProperty("client_device")
    private String clientDevice;

    @JsonProperty("client_fingerprints")
    private ClientFingerprints clientFingerprints;

    @JsonProperty("client_insights")
    private String clientInsights;

    @JsonProperty("client_ip")
    private Integer clientIp;

    @JsonProperty("client_ip6")
    private String clientIp6;

    @JsonProperty("client_location")
    private String clientLocation;

    @JsonProperty("client_log_filter_name")
    private String clientLogFilterName;

    @JsonProperty("client_os")
    private String clientOs;

    @JsonProperty("client_rtt")
    private Integer clientRtt;

    @JsonProperty("client_src_port")
    private Integer clientSrcPort;

    @JsonProperty("compression")
    private String compression;

    @JsonProperty("compression_percentage")
    private Integer compressionPercentage;

    @JsonProperty("conn_est_time_be")
    private Integer connEstTimeBe;

    @JsonProperty("conn_est_time_fe")
    private Integer connEstTimeFe;

    @JsonProperty("connection_error_info")
    private ConnErrorInfo connectionErrorInfo;

    @JsonProperty("critical_error_encountered")
    private Boolean criticalErrorEncountered = false;

    @JsonProperty("data_transfer_time")
    private Integer dataTransferTime;

    @JsonProperty("datascript_error_trace")
    private DataScriptErrorTrace datascriptErrorTrace;

    @JsonProperty("datascript_log")
    private String datascriptLog;

    @JsonProperty("etag")
    private String etag;

    @JsonProperty("grpc_method_name")
    private String grpcMethodName;

    @JsonProperty("grpc_service_name")
    private String grpcServiceName;

    @JsonProperty("grpc_status")
    private Integer grpcStatus;

    @JsonProperty("grpc_status_reason_phrase")
    private String grpcStatusReasonPhrase;

    @JsonProperty("headers_received_from_server")
    private String headersReceivedFromServer;

    @JsonProperty("headers_sent_to_server")
    private String headersSentToServer;

    @JsonProperty("host")
    private String host;

    @JsonProperty("http2_stream_id")
    private Integer http2StreamId;

    @JsonProperty("http_request_policy_rule_name")
    private String httpRequestPolicyRuleName;

    @JsonProperty("http_response_policy_rule_name")
    private String httpResponsePolicyRuleName;

    @JsonProperty("http_security_policy_rule_name")
    private String httpSecurityPolicyRuleName;

    @JsonProperty("http_version")
    private String httpVersion;

    @JsonProperty("icap_log")
    private IcapLog icapLog;

    @JsonProperty("jwt_log")
    private JwtLog jwtLog;

    @JsonProperty("log_id")
    private Integer logId;

    @JsonProperty("max_ingress_latency_be")
    private Integer maxIngressLatencyBe;

    @JsonProperty("max_ingress_latency_fe")
    private Integer maxIngressLatencyFe;

    @JsonProperty("method")
    private String method;

    @JsonProperty("microservice")
    private String microservice;

    @JsonProperty("microservice_name")
    private String microserviceName;

    @JsonProperty("network_security_policy_rule_name")
    private String networkSecurityPolicyRuleName;

    @JsonProperty("ntlm_log")
    private NtlmLog ntlmLog;

    @JsonProperty("oauth_log")
    private OauthLog oauthLog;

    @JsonProperty("ocsp_status_resp_sent")
    private Boolean ocspStatusRespSent = false;

    @JsonProperty("oob_log")
    private OutOfBandRequestLog oobLog;

    @JsonProperty("orig_uri")
    private String origUri;

    @JsonProperty("paa_log")
    private PaaLog paaLog;

    @JsonProperty("persistence_used")
    private Boolean persistenceUsed = false;

    @JsonProperty("persistent_session_id")
    private Integer persistentSessionId;

    @JsonProperty("pool")
    private String pool;

    @JsonProperty("pool_name")
    private String poolName;

    @JsonProperty("redirected_uri")
    private String redirectedUri;

    @JsonProperty("referer")
    private String referer;

    @JsonProperty("report_timestamp")
    private Integer reportTimestamp;

    @JsonProperty("request_content_type")
    private String requestContentType;

    @JsonProperty("request_headers")
    private Integer requestHeaders;

    @JsonProperty("request_id")
    private String requestId;

    @JsonProperty("request_length")
    private Integer requestLength;

    @JsonProperty("request_served_locally_remote_site_down")
    private Boolean requestServedLocallyRemoteSiteDown = false;

    @JsonProperty("request_state")
    private String requestState;

    @JsonProperty("response_code")
    private Integer responseCode;

    @JsonProperty("response_content_type")
    private String responseContentType;

    @JsonProperty("response_headers")
    private Integer responseHeaders;

    @JsonProperty("response_length")
    private Integer responseLength;

    @JsonProperty("response_time_first_byte")
    private Integer responseTimeFirstByte;

    @JsonProperty("response_time_last_byte")
    private Integer responseTimeLastByte;

    @JsonProperty("rewritten_uri_path")
    private String rewrittenUriPath;

    @JsonProperty("rewritten_uri_query")
    private String rewrittenUriQuery;

    @JsonProperty("saml_auth_request_generated")
    private Boolean samlAuthRequestGenerated = false;

    @JsonProperty("saml_auth_response_received")
    private Boolean samlAuthResponseReceived = false;

    @JsonProperty("saml_auth_session_id")
    private Integer samlAuthSessionId;

    @JsonProperty("saml_authentication_used")
    private Boolean samlAuthenticationUsed = false;

    @JsonProperty("saml_log")
    private SamlLog samlLog;

    @JsonProperty("saml_session_cookie_valid")
    private Boolean samlSessionCookieValid = false;

    @JsonProperty("server_conn_src_ip")
    private Integer serverConnSrcIp;

    @JsonProperty("server_conn_src_ip6")
    private String serverConnSrcIp6;

    @JsonProperty("server_connection_reused")
    private Boolean serverConnectionReused = false;

    @JsonProperty("server_dest_port")
    private Integer serverDestPort;

    @JsonProperty("server_ip")
    private Integer serverIp;

    @JsonProperty("server_ip6")
    private String serverIp6;

    @JsonProperty("server_name")
    private String serverName;

    @JsonProperty("server_push_initiated")
    private Boolean serverPushInitiated;

    @JsonProperty("server_pushed_request")
    private Boolean serverPushedRequest;

    @JsonProperty("server_response_code")
    private Integer serverResponseCode;

    @JsonProperty("server_response_length")
    private Integer serverResponseLength;

    @JsonProperty("server_response_time_first_byte")
    private Integer serverResponseTimeFirstByte;

    @JsonProperty("server_response_time_last_byte")
    private Integer serverResponseTimeLastByte;

    @JsonProperty("server_rtt")
    private Integer serverRtt;

    @JsonProperty("server_side_redirect_uri")
    private String serverSideRedirectUri;

    @JsonProperty("server_src_port")
    private Integer serverSrcPort;

    @JsonProperty("server_ssl_session_id")
    private String serverSslSessionId;

    @JsonProperty("server_ssl_session_reused")
    private Boolean serverSslSessionReused = false;

    @JsonProperty("servers_tried")
    private Integer serversTried = 0;

    @JsonProperty("service_engine")
    private String serviceEngine;

    @JsonProperty("session_id")
    private String sessionId;

    @JsonProperty("significance")
    private String significance;

    @JsonProperty("significant")
    private Integer significant;

    @JsonProperty("significant_log")
    private List<String> significantLog;

    @JsonProperty("sni_hostname")
    private String sniHostname;

    @JsonProperty("source_ip")
    private Integer sourceIp;

    @JsonProperty("source_ip6")
    private String sourceIp6;

    @JsonProperty("spdy_version")
    private String spdyVersion;

    @JsonProperty("ssl_cipher")
    private String sslCipher;

    @JsonProperty("ssl_session_id")
    private String sslSessionId;

    @JsonProperty("ssl_version")
    private String sslVersion;

    @JsonProperty("total_time")
    private Integer totalTime;

    @JsonProperty("udf")
    private Boolean udf = false;

    @JsonProperty("uri_path")
    private String uriPath;

    @JsonProperty("uri_query")
    private String uriQuery;

    @JsonProperty("user_agent")
    private String userAgent;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("vcpu_id")
    private Integer vcpuId;

    @JsonProperty("vh_match_rule")
    private String vhMatchRule;

    @JsonProperty("virtualservice")
    private String virtualservice;

    @JsonProperty("vs_ip")
    private Integer vsIp;

    @JsonProperty("vs_ip6")
    private String vsIp6;

    @JsonProperty("waf_log")
    private WafLog wafLog;

    @JsonProperty("xff")
    private String xff;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return adf
     */
    public Boolean getAdf() {
        return adf;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param adf set the adf.
     */
    public void setAdf(Boolean  adf) {
        this.adf = adf;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allRequestHeaders
     */
    public String getAllRequestHeaders() {
        return allRequestHeaders;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param allRequestHeaders set the allRequestHeaders.
     */
    public void setAllRequestHeaders(String  allRequestHeaders) {
        this.allRequestHeaders = allRequestHeaders;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allResponseHeaders
     */
    public String getAllResponseHeaders() {
        return allResponseHeaders;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param allResponseHeaders set the allResponseHeaders.
     */
    public void setAllResponseHeaders(String  allResponseHeaders) {
        this.allResponseHeaders = allResponseHeaders;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appResponseTime
     */
    public Integer getAppResponseTime() {
        return appResponseTime;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param appResponseTime set the appResponseTime.
     */
    public void setAppResponseTime(Integer  appResponseTime) {
        this.appResponseTime = appResponseTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Set the session authentication status.
     * Enum options - AUTH_STATUS_NO_AUTHENTICATION, AUTH_STATUS_AUTHENTICATION_SUCCESS, AUTH_STATUS_AUTHENTICATION_FAILURE, AUTH_STATUS_UNAUTHORIZED,
     * AUTH_STATUS_AUTHENTICATED_REQUEST, AUTH_STATUS_AUTHZ_FAILED.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "AUTH_STATUS_NO_AUTHENTICATION".
     * @return authStatus
     */
    public String getAuthStatus() {
        return authStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Set the session authentication status.
     * Enum options - AUTH_STATUS_NO_AUTHENTICATION, AUTH_STATUS_AUTHENTICATION_SUCCESS, AUTH_STATUS_AUTHENTICATION_FAILURE, AUTH_STATUS_UNAUTHORIZED,
     * AUTH_STATUS_AUTHENTICATED_REQUEST, AUTH_STATUS_AUTHZ_FAILED.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "AUTH_STATUS_NO_AUTHENTICATION".
     * @param authStatus set the authStatus.
     */
    public void setAuthStatus(String  authStatus) {
        this.authStatus = authStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Average packet processing latency for the backend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return avgIngressLatencyBe
     */
    public Integer getAvgIngressLatencyBe() {
        return avgIngressLatencyBe;
    }

    /**
     * This is the setter method to the attribute.
     * Average packet processing latency for the backend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param avgIngressLatencyBe set the avgIngressLatencyBe.
     */
    public void setAvgIngressLatencyBe(Integer  avgIngressLatencyBe) {
        this.avgIngressLatencyBe = avgIngressLatencyBe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Average packet processing latency for the frontend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return avgIngressLatencyFe
     */
    public Integer getAvgIngressLatencyFe() {
        return avgIngressLatencyFe;
    }

    /**
     * This is the setter method to the attribute.
     * Average packet processing latency for the frontend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param avgIngressLatencyFe set the avgIngressLatencyFe.
     */
    public void setAvgIngressLatencyFe(Integer  avgIngressLatencyFe) {
        this.avgIngressLatencyFe = avgIngressLatencyFe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - NOT_UPDATED, BY_CONTENT_REWRITE_PROFILE, BY_DATA_SCRIPT.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "NOT_UPDATED".
     * @return bodyUpdated
     */
    public String getBodyUpdated() {
        return bodyUpdated;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - NOT_UPDATED, BY_CONTENT_REWRITE_PROFILE, BY_DATA_SCRIPT.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "NOT_UPDATED".
     * @param bodyUpdated set the bodyUpdated.
     */
    public void setBodyUpdated(String  bodyUpdated) {
        this.bodyUpdated = bodyUpdated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Logs related to bot detection.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return botManagementLog
     */
    public BotManagementLog getBotManagementLog() {
        return botManagementLog;
    }

    /**
     * This is the setter method to the attribute.
     * Logs related to bot detection.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param botManagementLog set the botManagementLog.
     */
    public void setBotManagementLog(BotManagementLog botManagementLog) {
        this.botManagementLog = botManagementLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cache fetch and store is disabled by the datascript policies.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return cacheDisabledByDs
     */
    public Boolean getCacheDisabledByDs() {
        return cacheDisabledByDs;
    }

    /**
     * This is the setter method to the attribute.
     * Cache fetch and store is disabled by the datascript policies.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param cacheDisabledByDs set the cacheDisabledByDs.
     */
    public void setCacheDisabledByDs(Boolean  cacheDisabledByDs) {
        this.cacheDisabledByDs = cacheDisabledByDs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return cacheHit
     */
    public Boolean getCacheHit() {
        return cacheHit;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param cacheHit set the cacheHit.
     */
    public void setCacheHit(Boolean  cacheHit) {
        this.cacheHit = cacheHit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return cacheable
     */
    public Boolean getCacheable() {
        return cacheable;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param cacheable set the cacheable.
     */
    public void setCacheable(Boolean  cacheable) {
        this.cacheable = cacheable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientBrowser
     */
    public String getClientBrowser() {
        return clientBrowser;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientBrowser set the clientBrowser.
     */
    public void setClientBrowser(String  clientBrowser) {
        this.clientBrowser = clientBrowser;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of ciphers sent by client in tls client hello.
     * This field is only generated when tls handshake fails due to no shared cipher.
     * Field introduced in 18.1.4, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientCipherList
     */
    public SSLCipherList getClientCipherList() {
        return clientCipherList;
    }

    /**
     * This is the setter method to the attribute.
     * List of ciphers sent by client in tls client hello.
     * This field is only generated when tls handshake fails due to no shared cipher.
     * Field introduced in 18.1.4, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientCipherList set the clientCipherList.
     */
    public void setClientCipherList(SSLCipherList clientCipherList) {
        this.clientCipherList = clientCipherList;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientDestPort
     */
    public Integer getClientDestPort() {
        return clientDestPort;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientDestPort set the clientDestPort.
     */
    public void setClientDestPort(Integer  clientDestPort) {
        this.clientDestPort = clientDestPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientDevice
     */
    public String getClientDevice() {
        return clientDevice;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientDevice set the clientDevice.
     */
    public void setClientDevice(String  clientDevice) {
        this.clientDevice = clientDevice;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The fingerprints for this client.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientFingerprints
     */
    public ClientFingerprints getClientFingerprints() {
        return clientFingerprints;
    }

    /**
     * This is the setter method to the attribute.
     * The fingerprints for this client.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientFingerprints set the clientFingerprints.
     */
    public void setClientFingerprints(ClientFingerprints clientFingerprints) {
        this.clientFingerprints = clientFingerprints;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - INSIGHTS_DISABLED, NO_INSIGHTS_NOT_SAMPLED_COUNT, NO_INSIGHTS_NOT_SAMPLED_TYPE, NO_INSIGHTS_NOT_SAMPLED_SKIP_URI,
     * NO_INSIGHTS_NOT_SAMPLED_URI_NOT_IN_LIST, NO_INSIGHTS_NOT_SAMPLED_CLIENT_IP_NOT_IN_RANGE, NO_INSIGHTS_NOT_SAMPLED_OTHER, ACTIVE_INSIGHTS_FAILED,
     * ACTIVE_INSIGHTS_ENABLED, PASSIVE_INSIGHTS_ENABLED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientInsights
     */
    public String getClientInsights() {
        return clientInsights;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - INSIGHTS_DISABLED, NO_INSIGHTS_NOT_SAMPLED_COUNT, NO_INSIGHTS_NOT_SAMPLED_TYPE, NO_INSIGHTS_NOT_SAMPLED_SKIP_URI,
     * NO_INSIGHTS_NOT_SAMPLED_URI_NOT_IN_LIST, NO_INSIGHTS_NOT_SAMPLED_CLIENT_IP_NOT_IN_RANGE, NO_INSIGHTS_NOT_SAMPLED_OTHER, ACTIVE_INSIGHTS_FAILED,
     * ACTIVE_INSIGHTS_ENABLED, PASSIVE_INSIGHTS_ENABLED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientInsights set the clientInsights.
     */
    public void setClientInsights(String  clientInsights) {
        this.clientInsights = clientInsights;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv4 address of the client.
     * When true client ip feature is enabled, this will be derived from the header configured in the true client ip feature, if present in the request.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientIp
     */
    public Integer getClientIp() {
        return clientIp;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv4 address of the client.
     * When true client ip feature is enabled, this will be derived from the header configured in the true client ip feature, if present in the request.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientIp set the clientIp.
     */
    public void setClientIp(Integer  clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 address of the client.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientIp6
     */
    public String getClientIp6() {
        return clientIp6;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 address of the client.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientIp6 set the clientIp6.
     */
    public void setClientIp6(String  clientIp6) {
        this.clientIp6 = clientIp6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientLocation
     */
    public String getClientLocation() {
        return clientLocation;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientLocation set the clientLocation.
     */
    public void setClientLocation(String  clientLocation) {
        this.clientLocation = clientLocation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the client log filter applied.
     * Field introduced in 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientLogFilterName
     */
    public String getClientLogFilterName() {
        return clientLogFilterName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the client log filter applied.
     * Field introduced in 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientLogFilterName set the clientLogFilterName.
     */
    public void setClientLogFilterName(String  clientLogFilterName) {
        this.clientLogFilterName = clientLogFilterName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientOs
     */
    public String getClientOs() {
        return clientOs;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientOs set the clientOs.
     */
    public void setClientOs(String  clientOs) {
        this.clientOs = clientOs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientRtt
     */
    public Integer getClientRtt() {
        return clientRtt;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientRtt set the clientRtt.
     */
    public void setClientRtt(Integer  clientRtt) {
        this.clientRtt = clientRtt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientSrcPort
     */
    public Integer getClientSrcPort() {
        return clientSrcPort;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientSrcPort set the clientSrcPort.
     */
    public void setClientSrcPort(Integer  clientSrcPort) {
        this.clientSrcPort = clientSrcPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - NO_COMPRESSION_DISABLED, NO_COMPRESSION_GZIP_CONTENT, NO_COMPRESSION_CONTENT_TYPE, NO_COMPRESSION_CUSTOM_FILTER,
     * NO_COMPRESSION_AUTO_FILTER, NO_COMPRESSION_MIN_LENGTH, NO_COMPRESSION_CAN_BE_COMPRESSED, COMPRESSED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return compression
     */
    public String getCompression() {
        return compression;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - NO_COMPRESSION_DISABLED, NO_COMPRESSION_GZIP_CONTENT, NO_COMPRESSION_CONTENT_TYPE, NO_COMPRESSION_CUSTOM_FILTER,
     * NO_COMPRESSION_AUTO_FILTER, NO_COMPRESSION_MIN_LENGTH, NO_COMPRESSION_CAN_BE_COMPRESSED, COMPRESSED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param compression set the compression.
     */
    public void setCompression(String  compression) {
        this.compression = compression;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return compressionPercentage
     */
    public Integer getCompressionPercentage() {
        return compressionPercentage;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param compressionPercentage set the compressionPercentage.
     */
    public void setCompressionPercentage(Integer  compressionPercentage) {
        this.compressionPercentage = compressionPercentage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tcp connection establishment time for the backend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connEstTimeBe
     */
    public Integer getConnEstTimeBe() {
        return connEstTimeBe;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp connection establishment time for the backend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connEstTimeBe set the connEstTimeBe.
     */
    public void setConnEstTimeBe(Integer  connEstTimeBe) {
        this.connEstTimeBe = connEstTimeBe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tcp connection establishment time for the frontend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connEstTimeFe
     */
    public Integer getConnEstTimeFe() {
        return connEstTimeFe;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp connection establishment time for the frontend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connEstTimeFe set the connEstTimeFe.
     */
    public void setConnEstTimeFe(Integer  connEstTimeFe) {
        this.connEstTimeFe = connEstTimeFe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connectionErrorInfo
     */
    public ConnErrorInfo getConnectionErrorInfo() {
        return connectionErrorInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connectionErrorInfo set the connectionErrorInfo.
     */
    public void setConnectionErrorInfo(ConnErrorInfo connectionErrorInfo) {
        this.connectionErrorInfo = connectionErrorInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Critical error encountered during request processing.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return criticalErrorEncountered
     */
    public Boolean getCriticalErrorEncountered() {
        return criticalErrorEncountered;
    }

    /**
     * This is the setter method to the attribute.
     * Critical error encountered during request processing.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param criticalErrorEncountered set the criticalErrorEncountered.
     */
    public void setCriticalErrorEncountered(Boolean  criticalErrorEncountered) {
        this.criticalErrorEncountered = criticalErrorEncountered;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dataTransferTime
     */
    public Integer getDataTransferTime() {
        return dataTransferTime;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dataTransferTime set the dataTransferTime.
     */
    public void setDataTransferTime(Integer  dataTransferTime) {
        this.dataTransferTime = dataTransferTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return datascriptErrorTrace
     */
    public DataScriptErrorTrace getDatascriptErrorTrace() {
        return datascriptErrorTrace;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param datascriptErrorTrace set the datascriptErrorTrace.
     */
    public void setDatascriptErrorTrace(DataScriptErrorTrace datascriptErrorTrace) {
        this.datascriptErrorTrace = datascriptErrorTrace;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Log created by the invocations of the datascript api avi.vs.log().
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return datascriptLog
     */
    public String getDatascriptLog() {
        return datascriptLog;
    }

    /**
     * This is the setter method to the attribute.
     * Log created by the invocations of the datascript api avi.vs.log().
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param datascriptLog set the datascriptLog.
     */
    public void setDatascriptLog(String  datascriptLog) {
        this.datascriptLog = datascriptLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return etag
     */
    public String getEtag() {
        return etag;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param etag set the etag.
     */
    public void setEtag(String  etag) {
        this.etag = etag;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The method called by the grpc request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return grpcMethodName
     */
    public String getGrpcMethodName() {
        return grpcMethodName;
    }

    /**
     * This is the setter method to the attribute.
     * The method called by the grpc request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param grpcMethodName set the grpcMethodName.
     */
    public void setGrpcMethodName(String  grpcMethodName) {
        this.grpcMethodName = grpcMethodName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The service called by the grpc request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return grpcServiceName
     */
    public String getGrpcServiceName() {
        return grpcServiceName;
    }

    /**
     * This is the setter method to the attribute.
     * The service called by the grpc request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param grpcServiceName set the grpcServiceName.
     */
    public void setGrpcServiceName(String  grpcServiceName) {
        this.grpcServiceName = grpcServiceName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Grpc response status sent in the grpc trailer.
     * Special values are -1- no grpc status recevied even though client sent content-type as application/grpc.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return grpcStatus
     */
    public Integer getGrpcStatus() {
        return grpcStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Grpc response status sent in the grpc trailer.
     * Special values are -1- no grpc status recevied even though client sent content-type as application/grpc.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param grpcStatus set the grpcStatus.
     */
    public void setGrpcStatus(Integer  grpcStatus) {
        this.grpcStatus = grpcStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The reason phrase corresponding to the grpc status code.
     * Enum options - GRPC_STATUS_CODE_OK, GRPC_STATUS_CODE_CANCELLED, GRPC_STATUS_CODE_UNKNOWN, GRPC_STATUS_CODE_INVALID_ARGUMENT,
     * GRPC_STATUS_CODE_DEADLINE_EXCEEDED, GRPC_STATUS_CODE_NOT_FOUND, GRPC_STATUS_CODE_ALREADY_EXISTS, GRPC_STATUS_CODE_PERMISSION_DENIED,
     * GRPC_STATUS_CODE_RESOURCE_EXHAUSTED, GRPC_STATUS_CODE_FAILED_PRECONDITION, GRPC_STATUS_CODE_STOPPED, GRPC_STATUS_CODE_OUT_OF_RANGE,
     * GRPC_STATUS_CODE_UNIMPLEMENTED, GRPC_STATUS_CODE_INTERNAL, GRPC_STATUS_CODE_UNAVAILABLE, GRPC_STATUS_CODE_DATA_LOSS,
     * GRPC_STATUS_CODE_UNAUTHENTICATED.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return grpcStatusReasonPhrase
     */
    public String getGrpcStatusReasonPhrase() {
        return grpcStatusReasonPhrase;
    }

    /**
     * This is the setter method to the attribute.
     * The reason phrase corresponding to the grpc status code.
     * Enum options - GRPC_STATUS_CODE_OK, GRPC_STATUS_CODE_CANCELLED, GRPC_STATUS_CODE_UNKNOWN, GRPC_STATUS_CODE_INVALID_ARGUMENT,
     * GRPC_STATUS_CODE_DEADLINE_EXCEEDED, GRPC_STATUS_CODE_NOT_FOUND, GRPC_STATUS_CODE_ALREADY_EXISTS, GRPC_STATUS_CODE_PERMISSION_DENIED,
     * GRPC_STATUS_CODE_RESOURCE_EXHAUSTED, GRPC_STATUS_CODE_FAILED_PRECONDITION, GRPC_STATUS_CODE_STOPPED, GRPC_STATUS_CODE_OUT_OF_RANGE,
     * GRPC_STATUS_CODE_UNIMPLEMENTED, GRPC_STATUS_CODE_INTERNAL, GRPC_STATUS_CODE_UNAVAILABLE, GRPC_STATUS_CODE_DATA_LOSS,
     * GRPC_STATUS_CODE_UNAUTHENTICATED.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param grpcStatusReasonPhrase set the grpcStatusReasonPhrase.
     */
    public void setGrpcStatusReasonPhrase(String  grpcStatusReasonPhrase) {
        this.grpcStatusReasonPhrase = grpcStatusReasonPhrase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Response headers received from backend server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headersReceivedFromServer
     */
    public String getHeadersReceivedFromServer() {
        return headersReceivedFromServer;
    }

    /**
     * This is the setter method to the attribute.
     * Response headers received from backend server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param headersReceivedFromServer set the headersReceivedFromServer.
     */
    public void setHeadersReceivedFromServer(String  headersReceivedFromServer) {
        this.headersReceivedFromServer = headersReceivedFromServer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Request headers sent to backend server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headersSentToServer
     */
    public String getHeadersSentToServer() {
        return headersSentToServer;
    }

    /**
     * This is the setter method to the attribute.
     * Request headers sent to backend server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param headersSentToServer set the headersSentToServer.
     */
    public void setHeadersSentToServer(String  headersSentToServer) {
        this.headersSentToServer = headersSentToServer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param host set the host.
     */
    public void setHost(String  host) {
        this.host = host;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Stream identifier corresponding to an http2 request.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return http2StreamId
     */
    public Integer getHttp2StreamId() {
        return http2StreamId;
    }

    /**
     * This is the setter method to the attribute.
     * Stream identifier corresponding to an http2 request.
     * Field introduced in 18.1.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param http2StreamId set the http2StreamId.
     */
    public void setHttp2StreamId(Integer  http2StreamId) {
        this.http2StreamId = http2StreamId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpRequestPolicyRuleName
     */
    public String getHttpRequestPolicyRuleName() {
        return httpRequestPolicyRuleName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpRequestPolicyRuleName set the httpRequestPolicyRuleName.
     */
    public void setHttpRequestPolicyRuleName(String  httpRequestPolicyRuleName) {
        this.httpRequestPolicyRuleName = httpRequestPolicyRuleName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpResponsePolicyRuleName
     */
    public String getHttpResponsePolicyRuleName() {
        return httpResponsePolicyRuleName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpResponsePolicyRuleName set the httpResponsePolicyRuleName.
     */
    public void setHttpResponsePolicyRuleName(String  httpResponsePolicyRuleName) {
        this.httpResponsePolicyRuleName = httpResponsePolicyRuleName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpSecurityPolicyRuleName
     */
    public String getHttpSecurityPolicyRuleName() {
        return httpSecurityPolicyRuleName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpSecurityPolicyRuleName set the httpSecurityPolicyRuleName.
     */
    public void setHttpSecurityPolicyRuleName(String  httpSecurityPolicyRuleName) {
        this.httpSecurityPolicyRuleName = httpSecurityPolicyRuleName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpVersion
     */
    public String getHttpVersion() {
        return httpVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpVersion set the httpVersion.
     */
    public void setHttpVersion(String  httpVersion) {
        this.httpVersion = httpVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Log for the icap processing.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return icapLog
     */
    public IcapLog getIcapLog() {
        return icapLog;
    }

    /**
     * This is the setter method to the attribute.
     * Log for the icap processing.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param icapLog set the icapLog.
     */
    public void setIcapLog(IcapLog icapLog) {
        this.icapLog = icapLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Logs for the jwt validation process.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return jwtLog
     */
    public JwtLog getJwtLog() {
        return jwtLog;
    }

    /**
     * This is the setter method to the attribute.
     * Logs for the jwt validation process.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param jwtLog set the jwtLog.
     */
    public void setJwtLog(JwtLog jwtLog) {
        this.jwtLog = jwtLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return logId
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param logId set the logId.
     */
    public void setLogId(Integer  logId) {
        this.logId = logId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum packet processing latency for the backend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxIngressLatencyBe
     */
    public Integer getMaxIngressLatencyBe() {
        return maxIngressLatencyBe;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum packet processing latency for the backend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxIngressLatencyBe set the maxIngressLatencyBe.
     */
    public void setMaxIngressLatencyBe(Integer  maxIngressLatencyBe) {
        this.maxIngressLatencyBe = maxIngressLatencyBe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum packet processing latency for the frontend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxIngressLatencyFe
     */
    public Integer getMaxIngressLatencyFe() {
        return maxIngressLatencyFe;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum packet processing latency for the frontend flow.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxIngressLatencyFe set the maxIngressLatencyFe.
     */
    public void setMaxIngressLatencyFe(Integer  maxIngressLatencyFe) {
        this.maxIngressLatencyFe = maxIngressLatencyFe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return method
     */
    public String getMethod() {
        return method;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param method set the method.
     */
    public void setMethod(String  method) {
        this.method = method;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return microservice
     */
    public String getMicroservice() {
        return microservice;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param microservice set the microservice.
     */
    public void setMicroservice(String  microservice) {
        this.microservice = microservice;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return microserviceName
     */
    public String getMicroserviceName() {
        return microserviceName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param microserviceName set the microserviceName.
     */
    public void setMicroserviceName(String  microserviceName) {
        this.microserviceName = microserviceName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return networkSecurityPolicyRuleName
     */
    public String getNetworkSecurityPolicyRuleName() {
        return networkSecurityPolicyRuleName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param networkSecurityPolicyRuleName set the networkSecurityPolicyRuleName.
     */
    public void setNetworkSecurityPolicyRuleName(String  networkSecurityPolicyRuleName) {
        this.networkSecurityPolicyRuleName = networkSecurityPolicyRuleName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ntlm auto-detection logs.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ntlmLog
     */
    public NtlmLog getNtlmLog() {
        return ntlmLog;
    }

    /**
     * This is the setter method to the attribute.
     * Ntlm auto-detection logs.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ntlmLog set the ntlmLog.
     */
    public void setNtlmLog(NtlmLog ntlmLog) {
        this.ntlmLog = ntlmLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Logs related to oauth requests.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oauthLog
     */
    public OauthLog getOauthLog() {
        return oauthLog;
    }

    /**
     * This is the setter method to the attribute.
     * Logs related to oauth requests.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param oauthLog set the oauthLog.
     */
    public void setOauthLog(OauthLog oauthLog) {
        this.oauthLog = oauthLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ocsp certificate status response sent in the ssl/tls connection handshake.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return ocspStatusRespSent
     */
    public Boolean getOcspStatusRespSent() {
        return ocspStatusRespSent;
    }

    /**
     * This is the setter method to the attribute.
     * Ocsp certificate status response sent in the ssl/tls connection handshake.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param ocspStatusRespSent set the ocspStatusRespSent.
     */
    public void setOcspStatusRespSent(Boolean  ocspStatusRespSent) {
        this.ocspStatusRespSent = ocspStatusRespSent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Logs for http out-of-band requests.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oobLog
     */
    public OutOfBandRequestLog getOobLog() {
        return oobLog;
    }

    /**
     * This is the setter method to the attribute.
     * Logs for http out-of-band requests.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param oobLog set the oobLog.
     */
    public void setOobLog(OutOfBandRequestLog oobLog) {
        this.oobLog = oobLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The actual client request uri sent before normalization.
     * Only included if it differs from the normalized uri.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return origUri
     */
    public String getOrigUri() {
        return origUri;
    }

    /**
     * This is the setter method to the attribute.
     * The actual client request uri sent before normalization.
     * Only included if it differs from the normalized uri.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param origUri set the origUri.
     */
    public void setOrigUri(String  origUri) {
        this.origUri = origUri;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Logs for the pingaccess authentication process.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return paaLog
     */
    public PaaLog getPaaLog() {
        return paaLog;
    }

    /**
     * This is the setter method to the attribute.
     * Logs for the pingaccess authentication process.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param paaLog set the paaLog.
     */
    public void setPaaLog(PaaLog paaLog) {
        this.paaLog = paaLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return persistenceUsed
     */
    public Boolean getPersistenceUsed() {
        return persistenceUsed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param persistenceUsed set the persistenceUsed.
     */
    public void setPersistenceUsed(Boolean  persistenceUsed) {
        this.persistenceUsed = persistenceUsed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return persistentSessionId
     */
    public Integer getPersistentSessionId() {
        return persistentSessionId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param persistentSessionId set the persistentSessionId.
     */
    public void setPersistentSessionId(Integer  persistentSessionId) {
        this.persistentSessionId = persistentSessionId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pool
     */
    public String getPool() {
        return pool;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pool set the pool.
     */
    public void setPool(String  pool) {
        this.pool = pool;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolName set the poolName.
     */
    public void setPoolName(String  poolName) {
        this.poolName = poolName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return redirectedUri
     */
    public String getRedirectedUri() {
        return redirectedUri;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param redirectedUri set the redirectedUri.
     */
    public void setRedirectedUri(String  redirectedUri) {
        this.redirectedUri = redirectedUri;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return referer
     */
    public String getReferer() {
        return referer;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param referer set the referer.
     */
    public void setReferer(String  referer) {
        this.referer = referer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reportTimestamp
     */
    public Integer getReportTimestamp() {
        return reportTimestamp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reportTimestamp set the reportTimestamp.
     */
    public void setReportTimestamp(Integer  reportTimestamp) {
        this.reportTimestamp = reportTimestamp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestContentType
     */
    public String getRequestContentType() {
        return requestContentType;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestContentType set the requestContentType.
     */
    public void setRequestContentType(String  requestContentType) {
        this.requestContentType = requestContentType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestHeaders
     */
    public Integer getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestHeaders set the requestHeaders.
     */
    public void setRequestHeaders(Integer  requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unique http request id.
     * Field introduced in 17.2.4.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * This is the setter method to the attribute.
     * Unique http request id.
     * Field introduced in 17.2.4.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestId set the requestId.
     */
    public void setRequestId(String  requestId) {
        this.requestId = requestId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestLength
     */
    public Integer getRequestLength() {
        return requestLength;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestLength set the requestLength.
     */
    public void setRequestLength(Integer  requestLength) {
        this.requestLength = requestLength;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flag to indicate if request was served locally because the remote site was down.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return requestServedLocallyRemoteSiteDown
     */
    public Boolean getRequestServedLocallyRemoteSiteDown() {
        return requestServedLocallyRemoteSiteDown;
    }

    /**
     * This is the setter method to the attribute.
     * Flag to indicate if request was served locally because the remote site was down.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param requestServedLocallyRemoteSiteDown set the requestServedLocallyRemoteSiteDown.
     */
    public void setRequestServedLocallyRemoteSiteDown(Boolean  requestServedLocallyRemoteSiteDown) {
        this.requestServedLocallyRemoteSiteDown = requestServedLocallyRemoteSiteDown;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - AVI_HTTP_REQUEST_STATE_CONN_ACCEPT, AVI_HTTP_REQUEST_STATE_WAITING_FOR_REQUEST, AVI_HTTP_REQUEST_STATE_SSL_HANDSHAKING,
     * AVI_HTTP_REQUEST_STATE_PROCESSING_SPDY, AVI_HTTP_REQUEST_STATE_READ_CLIENT_REQ_LINE, AVI_HTTP_REQUEST_STATE_READ_CLIENT_REQ_HDR,
     * AVI_HTTP_REQUEST_STATE_CONNECT_TO_UPSTREAM, AVI_HTTP_REQUEST_STATE_SEND_REQ_TO_UPSTREAM, AVI_HTTP_REQUEST_STATE_READ_RESP_HDR_FROM_UPSTREAM,
     * AVI_HTTP_REQUEST_STATE_SEND_TO_CLIENT, AVI_HTTP_REQUEST_STATE_KEEPALIVE, AVI_HTTP_REQUEST_STATE_PROXY_UPGRADED_CONN,
     * AVI_HTTP_REQUEST_STATE_CLOSING_REQUEST, AVI_HTTP_REQUEST_STATE_READ_FROM_UPSTREAM, AVI_HTTP_REQUEST_STATE_READ_PROXY_PROTOCOL,
     * AVI_HTTP_REQUEST_STATE_READ_CLIENT_PIPELINE_REQ_LINE, AVI_HTTP_REQUEST_STATE_SSL_HANDSHAKE_TO_UPSTREAM,
     * AVI_HTTP_REQUEST_STATE_WAITING_IN_CONNPOOL_CACHE, AVI_HTTP_REQUEST_STATE_SEND_RESPONSE_HEADER_TO_CLIENT,
     * AVI_HTTP_REQUEST_STATE_SEND_RESPONSE_BODY_TO_CLIENT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestState
     */
    public String getRequestState() {
        return requestState;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - AVI_HTTP_REQUEST_STATE_CONN_ACCEPT, AVI_HTTP_REQUEST_STATE_WAITING_FOR_REQUEST, AVI_HTTP_REQUEST_STATE_SSL_HANDSHAKING,
     * AVI_HTTP_REQUEST_STATE_PROCESSING_SPDY, AVI_HTTP_REQUEST_STATE_READ_CLIENT_REQ_LINE, AVI_HTTP_REQUEST_STATE_READ_CLIENT_REQ_HDR,
     * AVI_HTTP_REQUEST_STATE_CONNECT_TO_UPSTREAM, AVI_HTTP_REQUEST_STATE_SEND_REQ_TO_UPSTREAM, AVI_HTTP_REQUEST_STATE_READ_RESP_HDR_FROM_UPSTREAM,
     * AVI_HTTP_REQUEST_STATE_SEND_TO_CLIENT, AVI_HTTP_REQUEST_STATE_KEEPALIVE, AVI_HTTP_REQUEST_STATE_PROXY_UPGRADED_CONN,
     * AVI_HTTP_REQUEST_STATE_CLOSING_REQUEST, AVI_HTTP_REQUEST_STATE_READ_FROM_UPSTREAM, AVI_HTTP_REQUEST_STATE_READ_PROXY_PROTOCOL,
     * AVI_HTTP_REQUEST_STATE_READ_CLIENT_PIPELINE_REQ_LINE, AVI_HTTP_REQUEST_STATE_SSL_HANDSHAKE_TO_UPSTREAM,
     * AVI_HTTP_REQUEST_STATE_WAITING_IN_CONNPOOL_CACHE, AVI_HTTP_REQUEST_STATE_SEND_RESPONSE_HEADER_TO_CLIENT,
     * AVI_HTTP_REQUEST_STATE_SEND_RESPONSE_BODY_TO_CLIENT.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestState set the requestState.
     */
    public void setRequestState(String  requestState) {
        this.requestState = requestState;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return responseCode
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param responseCode set the responseCode.
     */
    public void setResponseCode(Integer  responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return responseContentType
     */
    public String getResponseContentType() {
        return responseContentType;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param responseContentType set the responseContentType.
     */
    public void setResponseContentType(String  responseContentType) {
        this.responseContentType = responseContentType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return responseHeaders
     */
    public Integer getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param responseHeaders set the responseHeaders.
     */
    public void setResponseHeaders(Integer  responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return responseLength
     */
    public Integer getResponseLength() {
        return responseLength;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param responseLength set the responseLength.
     */
    public void setResponseLength(Integer  responseLength) {
        this.responseLength = responseLength;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return responseTimeFirstByte
     */
    public Integer getResponseTimeFirstByte() {
        return responseTimeFirstByte;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param responseTimeFirstByte set the responseTimeFirstByte.
     */
    public void setResponseTimeFirstByte(Integer  responseTimeFirstByte) {
        this.responseTimeFirstByte = responseTimeFirstByte;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return responseTimeLastByte
     */
    public Integer getResponseTimeLastByte() {
        return responseTimeLastByte;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param responseTimeLastByte set the responseTimeLastByte.
     */
    public void setResponseTimeLastByte(Integer  responseTimeLastByte) {
        this.responseTimeLastByte = responseTimeLastByte;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rewrittenUriPath
     */
    public String getRewrittenUriPath() {
        return rewrittenUriPath;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rewrittenUriPath set the rewrittenUriPath.
     */
    public void setRewrittenUriPath(String  rewrittenUriPath) {
        this.rewrittenUriPath = rewrittenUriPath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rewrittenUriQuery
     */
    public String getRewrittenUriQuery() {
        return rewrittenUriQuery;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rewrittenUriQuery set the rewrittenUriQuery.
     */
    public void setRewrittenUriQuery(String  rewrittenUriQuery) {
        this.rewrittenUriQuery = rewrittenUriQuery;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml authentication request is generated.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return samlAuthRequestGenerated
     */
    public Boolean getSamlAuthRequestGenerated() {
        return samlAuthRequestGenerated;
    }

    /**
     * This is the setter method to the attribute.
     * Saml authentication request is generated.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param samlAuthRequestGenerated set the samlAuthRequestGenerated.
     */
    public void setSamlAuthRequestGenerated(Boolean  samlAuthRequestGenerated) {
        this.samlAuthRequestGenerated = samlAuthRequestGenerated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml authentication response is received.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return samlAuthResponseReceived
     */
    public Boolean getSamlAuthResponseReceived() {
        return samlAuthResponseReceived;
    }

    /**
     * This is the setter method to the attribute.
     * Saml authentication response is received.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param samlAuthResponseReceived set the samlAuthResponseReceived.
     */
    public void setSamlAuthResponseReceived(Boolean  samlAuthResponseReceived) {
        this.samlAuthResponseReceived = samlAuthResponseReceived;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml authentication session id.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return samlAuthSessionId
     */
    public Integer getSamlAuthSessionId() {
        return samlAuthSessionId;
    }

    /**
     * This is the setter method to the attribute.
     * Saml authentication session id.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param samlAuthSessionId set the samlAuthSessionId.
     */
    public void setSamlAuthSessionId(Integer  samlAuthSessionId) {
        this.samlAuthSessionId = samlAuthSessionId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml authentication is used.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return samlAuthenticationUsed
     */
    public Boolean getSamlAuthenticationUsed() {
        return samlAuthenticationUsed;
    }

    /**
     * This is the setter method to the attribute.
     * Saml authentication is used.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param samlAuthenticationUsed set the samlAuthenticationUsed.
     */
    public void setSamlAuthenticationUsed(Boolean  samlAuthenticationUsed) {
        this.samlAuthenticationUsed = samlAuthenticationUsed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Logs for the saml authentication/authorization process.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return samlLog
     */
    public SamlLog getSamlLog() {
        return samlLog;
    }

    /**
     * This is the setter method to the attribute.
     * Logs for the saml authentication/authorization process.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param samlLog set the samlLog.
     */
    public void setSamlLog(SamlLog samlLog) {
        this.samlLog = samlLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml authentication session cookie is valid.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return samlSessionCookieValid
     */
    public Boolean getSamlSessionCookieValid() {
        return samlSessionCookieValid;
    }

    /**
     * This is the setter method to the attribute.
     * Saml authentication session cookie is valid.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param samlSessionCookieValid set the samlSessionCookieValid.
     */
    public void setSamlSessionCookieValid(Boolean  samlSessionCookieValid) {
        this.samlSessionCookieValid = samlSessionCookieValid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverConnSrcIp
     */
    public Integer getServerConnSrcIp() {
        return serverConnSrcIp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverConnSrcIp set the serverConnSrcIp.
     */
    public void setServerConnSrcIp(Integer  serverConnSrcIp) {
        this.serverConnSrcIp = serverConnSrcIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 address used to connect to server.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverConnSrcIp6
     */
    public String getServerConnSrcIp6() {
        return serverConnSrcIp6;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 address used to connect to server.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverConnSrcIp6 set the serverConnSrcIp6.
     */
    public void setServerConnSrcIp6(String  serverConnSrcIp6) {
        this.serverConnSrcIp6 = serverConnSrcIp6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flag to indicate if connection from the connection pool was reused.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return serverConnectionReused
     */
    public Boolean getServerConnectionReused() {
        return serverConnectionReused;
    }

    /**
     * This is the setter method to the attribute.
     * Flag to indicate if connection from the connection pool was reused.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param serverConnectionReused set the serverConnectionReused.
     */
    public void setServerConnectionReused(Boolean  serverConnectionReused) {
        this.serverConnectionReused = serverConnectionReused;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverDestPort
     */
    public Integer getServerDestPort() {
        return serverDestPort;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverDestPort set the serverDestPort.
     */
    public void setServerDestPort(Integer  serverDestPort) {
        this.serverDestPort = serverDestPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverIp
     */
    public Integer getServerIp() {
        return serverIp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverIp set the serverIp.
     */
    public void setServerIp(Integer  serverIp) {
        this.serverIp = serverIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 address of the server.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverIp6
     */
    public String getServerIp6() {
        return serverIp6;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 address of the server.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverIp6 set the serverIp6.
     */
    public void setServerIp6(String  serverIp6) {
        this.serverIp6 = serverIp6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverName set the serverName.
     */
    public void setServerName(String  serverName) {
        this.serverName = serverName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Request which initiates server push.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverPushInitiated
     */
    public Boolean getServerPushInitiated() {
        return serverPushInitiated;
    }

    /**
     * This is the setter method to the attribute.
     * Request which initiates server push.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverPushInitiated set the serverPushInitiated.
     */
    public void setServerPushInitiated(Boolean  serverPushInitiated) {
        this.serverPushInitiated = serverPushInitiated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Requests served via server push.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverPushedRequest
     */
    public Boolean getServerPushedRequest() {
        return serverPushedRequest;
    }

    /**
     * This is the setter method to the attribute.
     * Requests served via server push.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverPushedRequest set the serverPushedRequest.
     */
    public void setServerPushedRequest(Boolean  serverPushedRequest) {
        this.serverPushedRequest = serverPushedRequest;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverResponseCode
     */
    public Integer getServerResponseCode() {
        return serverResponseCode;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverResponseCode set the serverResponseCode.
     */
    public void setServerResponseCode(Integer  serverResponseCode) {
        this.serverResponseCode = serverResponseCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverResponseLength
     */
    public Integer getServerResponseLength() {
        return serverResponseLength;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverResponseLength set the serverResponseLength.
     */
    public void setServerResponseLength(Integer  serverResponseLength) {
        this.serverResponseLength = serverResponseLength;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverResponseTimeFirstByte
     */
    public Integer getServerResponseTimeFirstByte() {
        return serverResponseTimeFirstByte;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverResponseTimeFirstByte set the serverResponseTimeFirstByte.
     */
    public void setServerResponseTimeFirstByte(Integer  serverResponseTimeFirstByte) {
        this.serverResponseTimeFirstByte = serverResponseTimeFirstByte;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverResponseTimeLastByte
     */
    public Integer getServerResponseTimeLastByte() {
        return serverResponseTimeLastByte;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverResponseTimeLastByte set the serverResponseTimeLastByte.
     */
    public void setServerResponseTimeLastByte(Integer  serverResponseTimeLastByte) {
        this.serverResponseTimeLastByte = serverResponseTimeLastByte;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverRtt
     */
    public Integer getServerRtt() {
        return serverRtt;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverRtt set the serverRtt.
     */
    public void setServerRtt(Integer  serverRtt) {
        this.serverRtt = serverRtt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverSideRedirectUri
     */
    public String getServerSideRedirectUri() {
        return serverSideRedirectUri;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverSideRedirectUri set the serverSideRedirectUri.
     */
    public void setServerSideRedirectUri(String  serverSideRedirectUri) {
        this.serverSideRedirectUri = serverSideRedirectUri;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverSrcPort
     */
    public Integer getServerSrcPort() {
        return serverSrcPort;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverSrcPort set the serverSrcPort.
     */
    public void setServerSrcPort(Integer  serverSrcPort) {
        this.serverSrcPort = serverSrcPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ssl session id for the backend connection.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverSslSessionId
     */
    public String getServerSslSessionId() {
        return serverSslSessionId;
    }

    /**
     * This is the setter method to the attribute.
     * Ssl session id for the backend connection.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverSslSessionId set the serverSslSessionId.
     */
    public void setServerSslSessionId(String  serverSslSessionId) {
        this.serverSslSessionId = serverSslSessionId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flag to indicate if ssl session was reused.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return serverSslSessionReused
     */
    public Boolean getServerSslSessionReused() {
        return serverSslSessionReused;
    }

    /**
     * This is the setter method to the attribute.
     * Flag to indicate if ssl session was reused.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param serverSslSessionReused set the serverSslSessionReused.
     */
    public void setServerSslSessionReused(Boolean  serverSslSessionReused) {
        this.serverSslSessionReused = serverSslSessionReused;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of servers tried during server reselect before the response is sent back.
     * Field introduced in 18.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return serversTried
     */
    public Integer getServersTried() {
        return serversTried;
    }

    /**
     * This is the setter method to the attribute.
     * Number of servers tried during server reselect before the response is sent back.
     * Field introduced in 18.2.2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param serversTried set the serversTried.
     */
    public void setServersTried(Integer  serversTried) {
        this.serversTried = serversTried;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceEngine
     */
    public String getServiceEngine() {
        return serviceEngine;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceEngine set the serviceEngine.
     */
    public void setServiceEngine(String  serviceEngine) {
        this.serviceEngine = serviceEngine;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field set by datascript using avi.vs.set_session_id().
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * This is the setter method to the attribute.
     * Field set by datascript using avi.vs.set_session_id().
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sessionId set the sessionId.
     */
    public void setSessionId(String  sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return significance
     */
    public String getSignificance() {
        return significance;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param significance set the significance.
     */
    public void setSignificance(String  significance) {
        this.significance = significance;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return significant
     */
    public Integer getSignificant() {
        return significant;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param significant set the significant.
     */
    public void setSignificant(Integer  significant) {
        this.significant = significant;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of enums which indicate why a log is significant.
     * Enum options - ADF_CLIENT_CONN_SETUP_REFUSED, ADF_SERVER_CONN_SETUP_REFUSED, ADF_CLIENT_CONN_SETUP_TIMEDOUT, ADF_SERVER_CONN_SETUP_TIMEDOUT,
     * ADF_CLIENT_CONN_SETUP_FAILED_INTERNAL, ADF_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_CLIENT_CONN_SETUP_FAILED_BAD_PACKET,
     * ADF_UDP_CONN_SETUP_FAILED_INTERNAL, ADF_UDP_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_SCTP_SERVER_CONN_SETUP_REFUSED,
     * ADF_SCTP_SERVER_CONN_SETUP_TIMEDOUT, ADF_SCTP_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_CLIENT_SENT_RESET, ADF_SERVER_SENT_RESET,
     * ADF_CLIENT_CONN_TIMEDOUT, ADF_SERVER_CONN_TIMEDOUT, ADF_USER_DELETE_OPERATION, ADF_CLIENT_REQUEST_TIMEOUT, ADF_CLIENT_CONN_ABORTED,
     * ADF_CLIENT_SSL_HANDSHAKE_FAILURE...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return significantLog
     */
    public List<String> getSignificantLog() {
        return significantLog;
    }

    /**
     * This is the setter method. this will set the significantLog
     * List of enums which indicate why a log is significant.
     * Enum options - ADF_CLIENT_CONN_SETUP_REFUSED, ADF_SERVER_CONN_SETUP_REFUSED, ADF_CLIENT_CONN_SETUP_TIMEDOUT, ADF_SERVER_CONN_SETUP_TIMEDOUT,
     * ADF_CLIENT_CONN_SETUP_FAILED_INTERNAL, ADF_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_CLIENT_CONN_SETUP_FAILED_BAD_PACKET,
     * ADF_UDP_CONN_SETUP_FAILED_INTERNAL, ADF_UDP_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_SCTP_SERVER_CONN_SETUP_REFUSED,
     * ADF_SCTP_SERVER_CONN_SETUP_TIMEDOUT, ADF_SCTP_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_CLIENT_SENT_RESET, ADF_SERVER_SENT_RESET,
     * ADF_CLIENT_CONN_TIMEDOUT, ADF_SERVER_CONN_TIMEDOUT, ADF_USER_DELETE_OPERATION, ADF_CLIENT_REQUEST_TIMEOUT, ADF_CLIENT_CONN_ABORTED,
     * ADF_CLIENT_SSL_HANDSHAKE_FAILURE...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return significantLog
     */
    public void setSignificantLog(List<String>  significantLog) {
        this.significantLog = significantLog;
    }

    /**
     * This is the setter method this will set the significantLog
     * List of enums which indicate why a log is significant.
     * Enum options - ADF_CLIENT_CONN_SETUP_REFUSED, ADF_SERVER_CONN_SETUP_REFUSED, ADF_CLIENT_CONN_SETUP_TIMEDOUT, ADF_SERVER_CONN_SETUP_TIMEDOUT,
     * ADF_CLIENT_CONN_SETUP_FAILED_INTERNAL, ADF_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_CLIENT_CONN_SETUP_FAILED_BAD_PACKET,
     * ADF_UDP_CONN_SETUP_FAILED_INTERNAL, ADF_UDP_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_SCTP_SERVER_CONN_SETUP_REFUSED,
     * ADF_SCTP_SERVER_CONN_SETUP_TIMEDOUT, ADF_SCTP_SERVER_CONN_SETUP_FAILED_INTERNAL, ADF_CLIENT_SENT_RESET, ADF_SERVER_SENT_RESET,
     * ADF_CLIENT_CONN_TIMEDOUT, ADF_SERVER_CONN_TIMEDOUT, ADF_USER_DELETE_OPERATION, ADF_CLIENT_REQUEST_TIMEOUT, ADF_CLIENT_CONN_ABORTED,
     * ADF_CLIENT_SSL_HANDSHAKE_FAILURE...
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return significantLog
     */
    public ApplicationLog addSignificantLogItem(String significantLogItem) {
      if (this.significantLog == null) {
        this.significantLog = new ArrayList<String>();
      }
      this.significantLog.add(significantLogItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sniHostname
     */
    public String getSniHostname() {
        return sniHostname;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.2.5.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sniHostname set the sniHostname.
     */
    public void setSniHostname(String  sniHostname) {
        this.sniHostname = sniHostname;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Source ip of the client connection to the vs.
     * This can be different from client ip when true client ip feature is enabled.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sourceIp
     */
    public Integer getSourceIp() {
        return sourceIp;
    }

    /**
     * This is the setter method to the attribute.
     * Source ip of the client connection to the vs.
     * This can be different from client ip when true client ip feature is enabled.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sourceIp set the sourceIp.
     */
    public void setSourceIp(Integer  sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipv6 address of the source of the client connection to the vs.
     * This can be different from client ipv6 address when true client ip feature is enabled.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sourceIp6
     */
    public String getSourceIp6() {
        return sourceIp6;
    }

    /**
     * This is the setter method to the attribute.
     * Ipv6 address of the source of the client connection to the vs.
     * This can be different from client ipv6 address when true client ip feature is enabled.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sourceIp6 set the sourceIp6.
     */
    public void setSourceIp6(String  sourceIp6) {
        this.sourceIp6 = sourceIp6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return spdyVersion
     */
    public String getSpdyVersion() {
        return spdyVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param spdyVersion set the spdyVersion.
     */
    public void setSpdyVersion(String  spdyVersion) {
        this.spdyVersion = spdyVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslCipher
     */
    public String getSslCipher() {
        return sslCipher;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslCipher set the sslCipher.
     */
    public void setSslCipher(String  sslCipher) {
        this.sslCipher = sslCipher;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslSessionId
     */
    public String getSslSessionId() {
        return sslSessionId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslSessionId set the sslSessionId.
     */
    public void setSslSessionId(String  sslSessionId) {
        this.sslSessionId = sslSessionId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslVersion
     */
    public String getSslVersion() {
        return sslVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslVersion set the sslVersion.
     */
    public void setSslVersion(String  sslVersion) {
        this.sslVersion = sslVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalTime
     */
    public Integer getTotalTime() {
        return totalTime;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalTime set the totalTime.
     */
    public void setTotalTime(Integer  totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return udf
     */
    public Boolean getUdf() {
        return udf;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param udf set the udf.
     */
    public void setUdf(Boolean  udf) {
        this.udf = udf;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uriPath
     */
    public String getUriPath() {
        return uriPath;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uriPath set the uriPath.
     */
    public void setUriPath(String  uriPath) {
        this.uriPath = uriPath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uriQuery
     */
    public String getUriQuery() {
        return uriQuery;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uriQuery set the uriQuery.
     */
    public void setUriQuery(String  uriQuery) {
        this.uriQuery = uriQuery;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userAgent set the userAgent.
     */
    public void setUserAgent(String  userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userId set the userId.
     */
    public void setUserId(String  userId) {
        this.userId = userId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcpuId
     */
    public Integer getVcpuId() {
        return vcpuId;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcpuId set the vcpuId.
     */
    public void setVcpuId(Integer  vcpuId) {
        this.vcpuId = vcpuId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Evh rule matching the request.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vhMatchRule
     */
    public String getVhMatchRule() {
        return vhMatchRule;
    }

    /**
     * This is the setter method to the attribute.
     * Evh rule matching the request.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vhMatchRule set the vhMatchRule.
     */
    public void setVhMatchRule(String  vhMatchRule) {
        this.vhMatchRule = vhMatchRule;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return virtualservice
     */
    public String getVirtualservice() {
        return virtualservice;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param virtualservice set the virtualservice.
     */
    public void setVirtualservice(String  virtualservice) {
        this.virtualservice = virtualservice;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsIp
     */
    public Integer getVsIp() {
        return vsIp;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsIp set the vsIp.
     */
    public void setVsIp(Integer  vsIp) {
        this.vsIp = vsIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Virtual ipv6 address of the vs.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsIp6
     */
    public String getVsIp6() {
        return vsIp6;
    }

    /**
     * This is the setter method to the attribute.
     * Virtual ipv6 address of the vs.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsIp6 set the vsIp6.
     */
    public void setVsIp6(String  vsIp6) {
        this.vsIp6 = vsIp6;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Presence of waf_log indicates that atleast 1 waf rule was hit for the transaction.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return wafLog
     */
    public WafLog getWafLog() {
        return wafLog;
    }

    /**
     * This is the setter method to the attribute.
     * Presence of waf_log indicates that atleast 1 waf rule was hit for the transaction.
     * Field introduced in 17.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param wafLog set the wafLog.
     */
    public void setWafLog(WafLog wafLog) {
        this.wafLog = wafLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xff
     */
    public String getXff() {
        return xff;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param xff set the xff.
     */
    public void setXff(String  xff) {
        this.xff = xff;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApplicationLog objApplicationLog = (ApplicationLog) o;
      return   Objects.equals(this.adf, objApplicationLog.adf)&&
  Objects.equals(this.significant, objApplicationLog.significant)&&
  Objects.equals(this.significance, objApplicationLog.significance)&&
  Objects.equals(this.udf, objApplicationLog.udf)&&
  Objects.equals(this.virtualservice, objApplicationLog.virtualservice)&&
  Objects.equals(this.reportTimestamp, objApplicationLog.reportTimestamp)&&
  Objects.equals(this.serviceEngine, objApplicationLog.serviceEngine)&&
  Objects.equals(this.vcpuId, objApplicationLog.vcpuId)&&
  Objects.equals(this.logId, objApplicationLog.logId)&&
  Objects.equals(this.clientIp, objApplicationLog.clientIp)&&
  Objects.equals(this.clientLocation, objApplicationLog.clientLocation)&&
  Objects.equals(this.clientSrcPort, objApplicationLog.clientSrcPort)&&
  Objects.equals(this.clientDestPort, objApplicationLog.clientDestPort)&&
  Objects.equals(this.clientRtt, objApplicationLog.clientRtt)&&
  Objects.equals(this.sslSessionId, objApplicationLog.sslSessionId)&&
  Objects.equals(this.sslVersion, objApplicationLog.sslVersion)&&
  Objects.equals(this.sslCipher, objApplicationLog.sslCipher)&&
  Objects.equals(this.sniHostname, objApplicationLog.sniHostname)&&
  Objects.equals(this.httpVersion, objApplicationLog.httpVersion)&&
  Objects.equals(this.method, objApplicationLog.method)&&
  Objects.equals(this.uriPath, objApplicationLog.uriPath)&&
  Objects.equals(this.origUri, objApplicationLog.origUri)&&
  Objects.equals(this.rewrittenUriPath, objApplicationLog.rewrittenUriPath)&&
  Objects.equals(this.uriQuery, objApplicationLog.uriQuery)&&
  Objects.equals(this.rewrittenUriQuery, objApplicationLog.rewrittenUriQuery)&&
  Objects.equals(this.redirectedUri, objApplicationLog.redirectedUri)&&
  Objects.equals(this.serverSideRedirectUri, objApplicationLog.serverSideRedirectUri)&&
  Objects.equals(this.referer, objApplicationLog.referer)&&
  Objects.equals(this.userAgent, objApplicationLog.userAgent)&&
  Objects.equals(this.clientDevice, objApplicationLog.clientDevice)&&
  Objects.equals(this.clientBrowser, objApplicationLog.clientBrowser)&&
  Objects.equals(this.clientOs, objApplicationLog.clientOs)&&
  Objects.equals(this.xff, objApplicationLog.xff)&&
  Objects.equals(this.persistenceUsed, objApplicationLog.persistenceUsed)&&
  Objects.equals(this.host, objApplicationLog.host)&&
  Objects.equals(this.etag, objApplicationLog.etag)&&
  Objects.equals(this.persistentSessionId, objApplicationLog.persistentSessionId)&&
  Objects.equals(this.requestContentType, objApplicationLog.requestContentType)&&
  Objects.equals(this.responseContentType, objApplicationLog.responseContentType)&&
  Objects.equals(this.requestLength, objApplicationLog.requestLength)&&
  Objects.equals(this.cacheHit, objApplicationLog.cacheHit)&&
  Objects.equals(this.cacheable, objApplicationLog.cacheable)&&
  Objects.equals(this.networkSecurityPolicyRuleName, objApplicationLog.networkSecurityPolicyRuleName)&&
  Objects.equals(this.httpSecurityPolicyRuleName, objApplicationLog.httpSecurityPolicyRuleName)&&
  Objects.equals(this.httpRequestPolicyRuleName, objApplicationLog.httpRequestPolicyRuleName)&&
  Objects.equals(this.httpResponsePolicyRuleName, objApplicationLog.httpResponsePolicyRuleName)&&
  Objects.equals(this.pool, objApplicationLog.pool)&&
  Objects.equals(this.poolName, objApplicationLog.poolName)&&
  Objects.equals(this.serverIp, objApplicationLog.serverIp)&&
  Objects.equals(this.serverName, objApplicationLog.serverName)&&
  Objects.equals(this.serverConnSrcIp, objApplicationLog.serverConnSrcIp)&&
  Objects.equals(this.serverDestPort, objApplicationLog.serverDestPort)&&
  Objects.equals(this.serverSrcPort, objApplicationLog.serverSrcPort)&&
  Objects.equals(this.serverRtt, objApplicationLog.serverRtt)&&
  Objects.equals(this.serverResponseLength, objApplicationLog.serverResponseLength)&&
  Objects.equals(this.serverResponseCode, objApplicationLog.serverResponseCode)&&
  Objects.equals(this.serverResponseTimeFirstByte, objApplicationLog.serverResponseTimeFirstByte)&&
  Objects.equals(this.serverResponseTimeLastByte, objApplicationLog.serverResponseTimeLastByte)&&
  Objects.equals(this.appResponseTime, objApplicationLog.appResponseTime)&&
  Objects.equals(this.dataTransferTime, objApplicationLog.dataTransferTime)&&
  Objects.equals(this.totalTime, objApplicationLog.totalTime)&&
  Objects.equals(this.responseLength, objApplicationLog.responseLength)&&
  Objects.equals(this.responseCode, objApplicationLog.responseCode)&&
  Objects.equals(this.responseTimeFirstByte, objApplicationLog.responseTimeFirstByte)&&
  Objects.equals(this.responseTimeLastByte, objApplicationLog.responseTimeLastByte)&&
  Objects.equals(this.compressionPercentage, objApplicationLog.compressionPercentage)&&
  Objects.equals(this.compression, objApplicationLog.compression)&&
  Objects.equals(this.clientInsights, objApplicationLog.clientInsights)&&
  Objects.equals(this.connectionErrorInfo, objApplicationLog.connectionErrorInfo)&&
  Objects.equals(this.spdyVersion, objApplicationLog.spdyVersion)&&
  Objects.equals(this.requestHeaders, objApplicationLog.requestHeaders)&&
  Objects.equals(this.responseHeaders, objApplicationLog.responseHeaders)&&
  Objects.equals(this.requestState, objApplicationLog.requestState)&&
  Objects.equals(this.datascriptErrorTrace, objApplicationLog.datascriptErrorTrace)&&
  Objects.equals(this.allRequestHeaders, objApplicationLog.allRequestHeaders)&&
  Objects.equals(this.allResponseHeaders, objApplicationLog.allResponseHeaders)&&
  Objects.equals(this.userId, objApplicationLog.userId)&&
  Objects.equals(this.significantLog, objApplicationLog.significantLog)&&
  Objects.equals(this.datascriptLog, objApplicationLog.datascriptLog)&&
  Objects.equals(this.microservice, objApplicationLog.microservice)&&
  Objects.equals(this.microserviceName, objApplicationLog.microserviceName)&&
  Objects.equals(this.headersSentToServer, objApplicationLog.headersSentToServer)&&
  Objects.equals(this.headersReceivedFromServer, objApplicationLog.headersReceivedFromServer)&&
  Objects.equals(this.serverSslSessionId, objApplicationLog.serverSslSessionId)&&
  Objects.equals(this.serverConnectionReused, objApplicationLog.serverConnectionReused)&&
  Objects.equals(this.serverSslSessionReused, objApplicationLog.serverSslSessionReused)&&
  Objects.equals(this.vsIp, objApplicationLog.vsIp)&&
  Objects.equals(this.bodyUpdated, objApplicationLog.bodyUpdated)&&
  Objects.equals(this.wafLog, objApplicationLog.wafLog)&&
  Objects.equals(this.clientIp6, objApplicationLog.clientIp6)&&
  Objects.equals(this.vsIp6, objApplicationLog.vsIp6)&&
  Objects.equals(this.serverIp6, objApplicationLog.serverIp6)&&
  Objects.equals(this.serverConnSrcIp6, objApplicationLog.serverConnSrcIp6)&&
  Objects.equals(this.requestId, objApplicationLog.requestId)&&
  Objects.equals(this.requestServedLocallyRemoteSiteDown, objApplicationLog.requestServedLocallyRemoteSiteDown)&&
  Objects.equals(this.http2StreamId, objApplicationLog.http2StreamId)&&
  Objects.equals(this.clientCipherList, objApplicationLog.clientCipherList)&&
  Objects.equals(this.clientLogFilterName, objApplicationLog.clientLogFilterName)&&
  Objects.equals(this.samlAuthenticationUsed, objApplicationLog.samlAuthenticationUsed)&&
  Objects.equals(this.samlSessionCookieValid, objApplicationLog.samlSessionCookieValid)&&
  Objects.equals(this.samlAuthRequestGenerated, objApplicationLog.samlAuthRequestGenerated)&&
  Objects.equals(this.samlAuthResponseReceived, objApplicationLog.samlAuthResponseReceived)&&
  Objects.equals(this.samlAuthSessionId, objApplicationLog.samlAuthSessionId)&&
  Objects.equals(this.serversTried, objApplicationLog.serversTried)&&
  Objects.equals(this.paaLog, objApplicationLog.paaLog)&&
  Objects.equals(this.cacheDisabledByDs, objApplicationLog.cacheDisabledByDs)&&
  Objects.equals(this.grpcStatus, objApplicationLog.grpcStatus)&&
  Objects.equals(this.ocspStatusRespSent, objApplicationLog.ocspStatusRespSent)&&
  Objects.equals(this.criticalErrorEncountered, objApplicationLog.criticalErrorEncountered)&&
  Objects.equals(this.grpcServiceName, objApplicationLog.grpcServiceName)&&
  Objects.equals(this.grpcMethodName, objApplicationLog.grpcMethodName)&&
  Objects.equals(this.grpcStatusReasonPhrase, objApplicationLog.grpcStatusReasonPhrase)&&
  Objects.equals(this.icapLog, objApplicationLog.icapLog)&&
  Objects.equals(this.samlLog, objApplicationLog.samlLog)&&
  Objects.equals(this.jwtLog, objApplicationLog.jwtLog)&&
  Objects.equals(this.ntlmLog, objApplicationLog.ntlmLog)&&
  Objects.equals(this.oobLog, objApplicationLog.oobLog)&&
  Objects.equals(this.sessionId, objApplicationLog.sessionId)&&
  Objects.equals(this.botManagementLog, objApplicationLog.botManagementLog)&&
  Objects.equals(this.maxIngressLatencyFe, objApplicationLog.maxIngressLatencyFe)&&
  Objects.equals(this.avgIngressLatencyFe, objApplicationLog.avgIngressLatencyFe)&&
  Objects.equals(this.connEstTimeFe, objApplicationLog.connEstTimeFe)&&
  Objects.equals(this.maxIngressLatencyBe, objApplicationLog.maxIngressLatencyBe)&&
  Objects.equals(this.avgIngressLatencyBe, objApplicationLog.avgIngressLatencyBe)&&
  Objects.equals(this.connEstTimeBe, objApplicationLog.connEstTimeBe)&&
  Objects.equals(this.sourceIp, objApplicationLog.sourceIp)&&
  Objects.equals(this.sourceIp6, objApplicationLog.sourceIp6)&&
  Objects.equals(this.oauthLog, objApplicationLog.oauthLog)&&
  Objects.equals(this.authStatus, objApplicationLog.authStatus)&&
  Objects.equals(this.clientFingerprints, objApplicationLog.clientFingerprints)&&
  Objects.equals(this.serverPushInitiated, objApplicationLog.serverPushInitiated)&&
  Objects.equals(this.serverPushedRequest, objApplicationLog.serverPushedRequest)&&
  Objects.equals(this.vhMatchRule, objApplicationLog.vhMatchRule);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApplicationLog {\n");
                  sb.append("    adf: ").append(toIndentedString(adf)).append("\n");
                        sb.append("    allRequestHeaders: ").append(toIndentedString(allRequestHeaders)).append("\n");
                        sb.append("    allResponseHeaders: ").append(toIndentedString(allResponseHeaders)).append("\n");
                        sb.append("    appResponseTime: ").append(toIndentedString(appResponseTime)).append("\n");
                        sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
                        sb.append("    avgIngressLatencyBe: ").append(toIndentedString(avgIngressLatencyBe)).append("\n");
                        sb.append("    avgIngressLatencyFe: ").append(toIndentedString(avgIngressLatencyFe)).append("\n");
                        sb.append("    bodyUpdated: ").append(toIndentedString(bodyUpdated)).append("\n");
                        sb.append("    botManagementLog: ").append(toIndentedString(botManagementLog)).append("\n");
                        sb.append("    cacheDisabledByDs: ").append(toIndentedString(cacheDisabledByDs)).append("\n");
                        sb.append("    cacheHit: ").append(toIndentedString(cacheHit)).append("\n");
                        sb.append("    cacheable: ").append(toIndentedString(cacheable)).append("\n");
                        sb.append("    clientBrowser: ").append(toIndentedString(clientBrowser)).append("\n");
                        sb.append("    clientCipherList: ").append(toIndentedString(clientCipherList)).append("\n");
                        sb.append("    clientDestPort: ").append(toIndentedString(clientDestPort)).append("\n");
                        sb.append("    clientDevice: ").append(toIndentedString(clientDevice)).append("\n");
                        sb.append("    clientFingerprints: ").append(toIndentedString(clientFingerprints)).append("\n");
                        sb.append("    clientInsights: ").append(toIndentedString(clientInsights)).append("\n");
                        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
                        sb.append("    clientIp6: ").append(toIndentedString(clientIp6)).append("\n");
                        sb.append("    clientLocation: ").append(toIndentedString(clientLocation)).append("\n");
                        sb.append("    clientLogFilterName: ").append(toIndentedString(clientLogFilterName)).append("\n");
                        sb.append("    clientOs: ").append(toIndentedString(clientOs)).append("\n");
                        sb.append("    clientRtt: ").append(toIndentedString(clientRtt)).append("\n");
                        sb.append("    clientSrcPort: ").append(toIndentedString(clientSrcPort)).append("\n");
                        sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
                        sb.append("    compressionPercentage: ").append(toIndentedString(compressionPercentage)).append("\n");
                        sb.append("    connEstTimeBe: ").append(toIndentedString(connEstTimeBe)).append("\n");
                        sb.append("    connEstTimeFe: ").append(toIndentedString(connEstTimeFe)).append("\n");
                        sb.append("    connectionErrorInfo: ").append(toIndentedString(connectionErrorInfo)).append("\n");
                        sb.append("    criticalErrorEncountered: ").append(toIndentedString(criticalErrorEncountered)).append("\n");
                        sb.append("    dataTransferTime: ").append(toIndentedString(dataTransferTime)).append("\n");
                        sb.append("    datascriptErrorTrace: ").append(toIndentedString(datascriptErrorTrace)).append("\n");
                        sb.append("    datascriptLog: ").append(toIndentedString(datascriptLog)).append("\n");
                        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
                        sb.append("    grpcMethodName: ").append(toIndentedString(grpcMethodName)).append("\n");
                        sb.append("    grpcServiceName: ").append(toIndentedString(grpcServiceName)).append("\n");
                        sb.append("    grpcStatus: ").append(toIndentedString(grpcStatus)).append("\n");
                        sb.append("    grpcStatusReasonPhrase: ").append(toIndentedString(grpcStatusReasonPhrase)).append("\n");
                        sb.append("    headersReceivedFromServer: ").append(toIndentedString(headersReceivedFromServer)).append("\n");
                        sb.append("    headersSentToServer: ").append(toIndentedString(headersSentToServer)).append("\n");
                        sb.append("    host: ").append(toIndentedString(host)).append("\n");
                        sb.append("    http2StreamId: ").append(toIndentedString(http2StreamId)).append("\n");
                        sb.append("    httpRequestPolicyRuleName: ").append(toIndentedString(httpRequestPolicyRuleName)).append("\n");
                        sb.append("    httpResponsePolicyRuleName: ").append(toIndentedString(httpResponsePolicyRuleName)).append("\n");
                        sb.append("    httpSecurityPolicyRuleName: ").append(toIndentedString(httpSecurityPolicyRuleName)).append("\n");
                        sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
                        sb.append("    icapLog: ").append(toIndentedString(icapLog)).append("\n");
                        sb.append("    jwtLog: ").append(toIndentedString(jwtLog)).append("\n");
                        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
                        sb.append("    maxIngressLatencyBe: ").append(toIndentedString(maxIngressLatencyBe)).append("\n");
                        sb.append("    maxIngressLatencyFe: ").append(toIndentedString(maxIngressLatencyFe)).append("\n");
                        sb.append("    method: ").append(toIndentedString(method)).append("\n");
                        sb.append("    microservice: ").append(toIndentedString(microservice)).append("\n");
                        sb.append("    microserviceName: ").append(toIndentedString(microserviceName)).append("\n");
                        sb.append("    networkSecurityPolicyRuleName: ").append(toIndentedString(networkSecurityPolicyRuleName)).append("\n");
                        sb.append("    ntlmLog: ").append(toIndentedString(ntlmLog)).append("\n");
                        sb.append("    oauthLog: ").append(toIndentedString(oauthLog)).append("\n");
                        sb.append("    ocspStatusRespSent: ").append(toIndentedString(ocspStatusRespSent)).append("\n");
                        sb.append("    oobLog: ").append(toIndentedString(oobLog)).append("\n");
                        sb.append("    origUri: ").append(toIndentedString(origUri)).append("\n");
                        sb.append("    paaLog: ").append(toIndentedString(paaLog)).append("\n");
                        sb.append("    persistenceUsed: ").append(toIndentedString(persistenceUsed)).append("\n");
                        sb.append("    persistentSessionId: ").append(toIndentedString(persistentSessionId)).append("\n");
                        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
                        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
                        sb.append("    redirectedUri: ").append(toIndentedString(redirectedUri)).append("\n");
                        sb.append("    referer: ").append(toIndentedString(referer)).append("\n");
                        sb.append("    reportTimestamp: ").append(toIndentedString(reportTimestamp)).append("\n");
                        sb.append("    requestContentType: ").append(toIndentedString(requestContentType)).append("\n");
                        sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
                        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
                        sb.append("    requestLength: ").append(toIndentedString(requestLength)).append("\n");
                        sb.append("    requestServedLocallyRemoteSiteDown: ").append(toIndentedString(requestServedLocallyRemoteSiteDown)).append("\n");
                        sb.append("    requestState: ").append(toIndentedString(requestState)).append("\n");
                        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
                        sb.append("    responseContentType: ").append(toIndentedString(responseContentType)).append("\n");
                        sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
                        sb.append("    responseLength: ").append(toIndentedString(responseLength)).append("\n");
                        sb.append("    responseTimeFirstByte: ").append(toIndentedString(responseTimeFirstByte)).append("\n");
                        sb.append("    responseTimeLastByte: ").append(toIndentedString(responseTimeLastByte)).append("\n");
                        sb.append("    rewrittenUriPath: ").append(toIndentedString(rewrittenUriPath)).append("\n");
                        sb.append("    rewrittenUriQuery: ").append(toIndentedString(rewrittenUriQuery)).append("\n");
                        sb.append("    samlAuthRequestGenerated: ").append(toIndentedString(samlAuthRequestGenerated)).append("\n");
                        sb.append("    samlAuthResponseReceived: ").append(toIndentedString(samlAuthResponseReceived)).append("\n");
                        sb.append("    samlAuthSessionId: ").append(toIndentedString(samlAuthSessionId)).append("\n");
                        sb.append("    samlAuthenticationUsed: ").append(toIndentedString(samlAuthenticationUsed)).append("\n");
                        sb.append("    samlLog: ").append(toIndentedString(samlLog)).append("\n");
                        sb.append("    samlSessionCookieValid: ").append(toIndentedString(samlSessionCookieValid)).append("\n");
                        sb.append("    serverConnSrcIp: ").append(toIndentedString(serverConnSrcIp)).append("\n");
                        sb.append("    serverConnSrcIp6: ").append(toIndentedString(serverConnSrcIp6)).append("\n");
                        sb.append("    serverConnectionReused: ").append(toIndentedString(serverConnectionReused)).append("\n");
                        sb.append("    serverDestPort: ").append(toIndentedString(serverDestPort)).append("\n");
                        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
                        sb.append("    serverIp6: ").append(toIndentedString(serverIp6)).append("\n");
                        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
                        sb.append("    serverPushInitiated: ").append(toIndentedString(serverPushInitiated)).append("\n");
                        sb.append("    serverPushedRequest: ").append(toIndentedString(serverPushedRequest)).append("\n");
                        sb.append("    serverResponseCode: ").append(toIndentedString(serverResponseCode)).append("\n");
                        sb.append("    serverResponseLength: ").append(toIndentedString(serverResponseLength)).append("\n");
                        sb.append("    serverResponseTimeFirstByte: ").append(toIndentedString(serverResponseTimeFirstByte)).append("\n");
                        sb.append("    serverResponseTimeLastByte: ").append(toIndentedString(serverResponseTimeLastByte)).append("\n");
                        sb.append("    serverRtt: ").append(toIndentedString(serverRtt)).append("\n");
                        sb.append("    serverSideRedirectUri: ").append(toIndentedString(serverSideRedirectUri)).append("\n");
                        sb.append("    serverSrcPort: ").append(toIndentedString(serverSrcPort)).append("\n");
                        sb.append("    serverSslSessionId: ").append(toIndentedString(serverSslSessionId)).append("\n");
                        sb.append("    serverSslSessionReused: ").append(toIndentedString(serverSslSessionReused)).append("\n");
                        sb.append("    serversTried: ").append(toIndentedString(serversTried)).append("\n");
                        sb.append("    serviceEngine: ").append(toIndentedString(serviceEngine)).append("\n");
                        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
                        sb.append("    significance: ").append(toIndentedString(significance)).append("\n");
                        sb.append("    significant: ").append(toIndentedString(significant)).append("\n");
                        sb.append("    significantLog: ").append(toIndentedString(significantLog)).append("\n");
                        sb.append("    sniHostname: ").append(toIndentedString(sniHostname)).append("\n");
                        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
                        sb.append("    sourceIp6: ").append(toIndentedString(sourceIp6)).append("\n");
                        sb.append("    spdyVersion: ").append(toIndentedString(spdyVersion)).append("\n");
                        sb.append("    sslCipher: ").append(toIndentedString(sslCipher)).append("\n");
                        sb.append("    sslSessionId: ").append(toIndentedString(sslSessionId)).append("\n");
                        sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
                        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
                        sb.append("    udf: ").append(toIndentedString(udf)).append("\n");
                        sb.append("    uriPath: ").append(toIndentedString(uriPath)).append("\n");
                        sb.append("    uriQuery: ").append(toIndentedString(uriQuery)).append("\n");
                        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
                        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
                        sb.append("    vcpuId: ").append(toIndentedString(vcpuId)).append("\n");
                        sb.append("    vhMatchRule: ").append(toIndentedString(vhMatchRule)).append("\n");
                        sb.append("    virtualservice: ").append(toIndentedString(virtualservice)).append("\n");
                        sb.append("    vsIp: ").append(toIndentedString(vsIp)).append("\n");
                        sb.append("    vsIp6: ").append(toIndentedString(vsIp6)).append("\n");
                        sb.append("    wafLog: ").append(toIndentedString(wafLog)).append("\n");
                        sb.append("    xff: ").append(toIndentedString(xff)).append("\n");
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
