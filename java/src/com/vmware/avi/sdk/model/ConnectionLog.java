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
 * The ConnectionLog is a POJO class extends AviRestResource that used for creating
 * ConnectionLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConnectionLog  {
    @JsonProperty("adf")
    private Boolean adf = false;

    @JsonProperty("average_turntime")
    private Integer averageTurntime;

    @JsonProperty("avg_ingress_latency_be")
    private Integer avgIngressLatencyBe;

    @JsonProperty("avg_ingress_latency_fe")
    private Integer avgIngressLatencyFe;

    @JsonProperty("client_dest_port")
    private Integer clientDestPort;

    @JsonProperty("client_ip")
    private Integer clientIp;

    @JsonProperty("client_ip6")
    private String clientIp6;

    @JsonProperty("client_location")
    private String clientLocation;

    @JsonProperty("client_log_filter_name")
    private String clientLogFilterName;

    @JsonProperty("client_rtt")
    private Integer clientRtt;

    @JsonProperty("client_src_port")
    private Integer clientSrcPort;

    @JsonProperty("conn_est_time_be")
    private Integer connEstTimeBe;

    @JsonProperty("conn_est_time_fe")
    private Integer connEstTimeFe;

    @JsonProperty("connection_ended")
    private Boolean connectionEnded = true;

    @JsonProperty("dns_etype")
    private String dnsEtype;

    @JsonProperty("dns_fqdn")
    private String dnsFqdn;

    @JsonProperty("dns_ips")
    private List<Integer> dnsIps;

    @JsonProperty("dns_qtype")
    private String dnsQtype;

    @JsonProperty("dns_request")
    private DnsRequest dnsRequest;

    @JsonProperty("dns_response")
    private DnsResponse dnsResponse;

    @JsonProperty("dns_tcp_conn_close_from_se")
    private Boolean dnsTcpConnCloseFromSe;

    @JsonProperty("ds_log")
    private String dsLog;

    @JsonProperty("gslbpool_name")
    private String gslbpoolName;

    @JsonProperty("gslbservice")
    private String gslbservice;

    @JsonProperty("gslbservice_name")
    private String gslbserviceName;

    @JsonProperty("log_id")
    private Integer logId;

    @JsonProperty("max_ingress_latency_be")
    private Integer maxIngressLatencyBe;

    @JsonProperty("max_ingress_latency_fe")
    private Integer maxIngressLatencyFe;

    @JsonProperty("microservice")
    private String microservice;

    @JsonProperty("microservice_name")
    private String microserviceName;

    @JsonProperty("mss")
    private Integer mss = 1500;

    @JsonProperty("network_security_policy_rule_name")
    private String networkSecurityPolicyRuleName;

    @JsonProperty("num_syn_retransmit")
    private Integer numSynRetransmit;

    @JsonProperty("num_transaction")
    private Integer numTransaction;

    @JsonProperty("num_window_shrink")
    private Integer numWindowShrink;

    @JsonProperty("ocsp_status_resp_sent")
    private Boolean ocspStatusRespSent = false;

    @JsonProperty("out_of_orders")
    private Integer outOfOrders = 0;

    @JsonProperty("persistence_used")
    private Boolean persistenceUsed = false;

    @JsonProperty("pool")
    private String pool;

    @JsonProperty("pool_name")
    private String poolName;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("proxy_protocol")
    private String proxyProtocol;

    @JsonProperty("report_timestamp")
    private Integer reportTimestamp;

    @JsonProperty("retransmits")
    private Integer retransmits = 0;

    @JsonProperty("rx_bytes")
    private Integer rxBytes;

    @JsonProperty("rx_pkts")
    private Integer rxPkts;

    @JsonProperty("server_conn_src_ip")
    private Integer serverConnSrcIp;

    @JsonProperty("server_conn_src_ip6")
    private String serverConnSrcIp6;

    @JsonProperty("server_dest_port")
    private Integer serverDestPort;

    @JsonProperty("server_ip")
    private Integer serverIp;

    @JsonProperty("server_ip6")
    private String serverIp6;

    @JsonProperty("server_name")
    private String serverName;

    @JsonProperty("server_num_window_shrink")
    private Integer serverNumWindowShrink;

    @JsonProperty("server_out_of_orders")
    private Integer serverOutOfOrders = 0;

    @JsonProperty("server_retransmits")
    private Integer serverRetransmits = 0;

    @JsonProperty("server_rtt")
    private Integer serverRtt;

    @JsonProperty("server_rx_bytes")
    private Integer serverRxBytes;

    @JsonProperty("server_rx_pkts")
    private Integer serverRxPkts;

    @JsonProperty("server_src_port")
    private Integer serverSrcPort;

    @JsonProperty("server_timeouts")
    private Integer serverTimeouts = 0;

    @JsonProperty("server_total_bytes")
    private Integer serverTotalBytes;

    @JsonProperty("server_total_pkts")
    private Integer serverTotalPkts;

    @JsonProperty("server_tx_bytes")
    private Integer serverTxBytes;

    @JsonProperty("server_tx_pkts")
    private Integer serverTxPkts;

    @JsonProperty("server_zero_window_size_events")
    private Integer serverZeroWindowSizeEvents = 0;

    @JsonProperty("service_engine")
    private String serviceEngine;

    @JsonProperty("significance")
    private String significance;

    @JsonProperty("significant")
    private Integer significant;

    @JsonProperty("significant_log")
    private List<String> significantLog;

    @JsonProperty("sip_log")
    private SipLog sipLog;

    @JsonProperty("sni_hostname")
    private String sniHostname;

    @JsonProperty("ssl_cipher")
    private String sslCipher;

    @JsonProperty("ssl_session_id")
    private String sslSessionId;

    @JsonProperty("ssl_version")
    private String sslVersion;

    @JsonProperty("start_timestamp")
    private Integer startTimestamp;

    @JsonProperty("timeouts")
    private Integer timeouts = 0;

    @JsonProperty("total_bytes")
    private Integer totalBytes = 0;

    @JsonProperty("total_pkts")
    private Integer totalPkts = 0;

    @JsonProperty("total_time")
    private Integer totalTime = 0;

    @JsonProperty("tx_bytes")
    private Integer txBytes;

    @JsonProperty("tx_pkts")
    private Integer txPkts;

    @JsonProperty("udf")
    private Boolean udf = false;

    @JsonProperty("vcpu_id")
    private Integer vcpuId;

    @JsonProperty("virtualservice")
    private String virtualservice;

    @JsonProperty("vs_ip")
    private Integer vsIp;

    @JsonProperty("vs_ip6")
    private String vsIp6;

    @JsonProperty("zero_window_size_events")
    private Integer zeroWindowSizeEvents = 0;



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
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return averageTurntime
     */
    public Integer getAverageTurntime() {
        return averageTurntime;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param averageTurntime set the averageTurntime.
     */
    public void setAverageTurntime(Integer  averageTurntime) {
        this.averageTurntime = averageTurntime;
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
     * @return clientIp
     */
    public Integer getClientIp() {
        return clientIp;
    }

    /**
     * This is the setter method to the attribute.
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
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return connectionEnded
     */
    public Boolean getConnectionEnded() {
        return connectionEnded;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param connectionEnded set the connectionEnded.
     */
    public void setConnectionEnded(Boolean  connectionEnded) {
        this.connectionEnded = connectionEnded;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - DNS_ENTRY_PASS_THROUGH, DNS_ENTRY_GSLB, DNS_ENTRY_VIRTUALSERVICE, DNS_ENTRY_STATIC, DNS_ENTRY_POLICY, DNS_ENTRY_LOCAL.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsEtype
     */
    public String getDnsEtype() {
        return dnsEtype;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - DNS_ENTRY_PASS_THROUGH, DNS_ENTRY_GSLB, DNS_ENTRY_VIRTUALSERVICE, DNS_ENTRY_STATIC, DNS_ENTRY_POLICY, DNS_ENTRY_LOCAL.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsEtype set the dnsEtype.
     */
    public void setDnsEtype(String  dnsEtype) {
        this.dnsEtype = dnsEtype;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsFqdn
     */
    public String getDnsFqdn() {
        return dnsFqdn;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsFqdn set the dnsFqdn.
     */
    public void setDnsFqdn(String  dnsFqdn) {
        this.dnsFqdn = dnsFqdn;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsIps
     */
    public List<Integer> getDnsIps() {
        return dnsIps;
    }

    /**
     * This is the setter method. this will set the dnsIps
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsIps
     */
    public void setDnsIps(List<Integer>  dnsIps) {
        this.dnsIps = dnsIps;
    }

    /**
     * This is the setter method this will set the dnsIps
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsIps
     */
    public ConnectionLog addDnsIpsItem(Integer dnsIpsItem) {
      if (this.dnsIps == null) {
        this.dnsIps = new ArrayList<Integer>();
      }
      this.dnsIps.add(dnsIpsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX,
     * DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR,
     * DNS_RECORD_ANY.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsQtype
     */
    public String getDnsQtype() {
        return dnsQtype;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX,
     * DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR,
     * DNS_RECORD_ANY.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsQtype set the dnsQtype.
     */
    public void setDnsQtype(String  dnsQtype) {
        this.dnsQtype = dnsQtype;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsRequest
     */
    public DnsRequest getDnsRequest() {
        return dnsRequest;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsRequest set the dnsRequest.
     */
    public void setDnsRequest(DnsRequest dnsRequest) {
        this.dnsRequest = dnsRequest;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsResponse
     */
    public DnsResponse getDnsResponse() {
        return dnsResponse;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsResponse set the dnsResponse.
     */
    public void setDnsResponse(DnsResponse dnsResponse) {
        this.dnsResponse = dnsResponse;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service engine closed the tcp connection after the first dns response.
     * Field introduced in 21.1.7, 22.1.4, 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsTcpConnCloseFromSe
     */
    public Boolean getDnsTcpConnCloseFromSe() {
        return dnsTcpConnCloseFromSe;
    }

    /**
     * This is the setter method to the attribute.
     * Service engine closed the tcp connection after the first dns response.
     * Field introduced in 21.1.7, 22.1.4, 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsTcpConnCloseFromSe set the dnsTcpConnCloseFromSe.
     */
    public void setDnsTcpConnCloseFromSe(Boolean  dnsTcpConnCloseFromSe) {
        this.dnsTcpConnCloseFromSe = dnsTcpConnCloseFromSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Datascript log.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dsLog
     */
    public String getDsLog() {
        return dsLog;
    }

    /**
     * This is the setter method to the attribute.
     * Datascript log.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dsLog set the dsLog.
     */
    public void setDsLog(String  dsLog) {
        this.dsLog = dsLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gslbpoolName
     */
    public String getGslbpoolName() {
        return gslbpoolName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gslbpoolName set the gslbpoolName.
     */
    public void setGslbpoolName(String  gslbpoolName) {
        this.gslbpoolName = gslbpoolName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gslbservice
     */
    public String getGslbservice() {
        return gslbservice;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gslbservice set the gslbservice.
     */
    public void setGslbservice(String  gslbservice) {
        this.gslbservice = gslbservice;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gslbserviceName
     */
    public String getGslbserviceName() {
        return gslbserviceName;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gslbserviceName set the gslbserviceName.
     */
    public void setGslbserviceName(String  gslbserviceName) {
        this.gslbserviceName = gslbserviceName;
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
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1500.
     * @return mss
     */
    public Integer getMss() {
        return mss;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1500.
     * @param mss set the mss.
     */
    public void setMss(Integer  mss) {
        this.mss = mss;
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numSynRetransmit
     */
    public Integer getNumSynRetransmit() {
        return numSynRetransmit;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numSynRetransmit set the numSynRetransmit.
     */
    public void setNumSynRetransmit(Integer  numSynRetransmit) {
        this.numSynRetransmit = numSynRetransmit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numTransaction
     */
    public Integer getNumTransaction() {
        return numTransaction;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numTransaction set the numTransaction.
     */
    public void setNumTransaction(Integer  numTransaction) {
        this.numTransaction = numTransaction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numWindowShrink
     */
    public Integer getNumWindowShrink() {
        return numWindowShrink;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numWindowShrink set the numWindowShrink.
     */
    public void setNumWindowShrink(Integer  numWindowShrink) {
        this.numWindowShrink = numWindowShrink;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ocsp response sent in the ssl/tls connection handshake.
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
     * Ocsp response sent in the ssl/tls connection handshake.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return outOfOrders
     */
    public Integer getOutOfOrders() {
        return outOfOrders;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param outOfOrders set the outOfOrders.
     */
    public void setOutOfOrders(Integer  outOfOrders) {
        this.outOfOrders = outOfOrders;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Persistence applied during server selection.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return persistenceUsed
     */
    public Boolean getPersistenceUsed() {
        return persistenceUsed;
    }

    /**
     * This is the setter method to the attribute.
     * Persistence applied during server selection.
     * Field introduced in 20.1.1.
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
     * Enum options - PROTOCOL_ICMP, PROTOCOL_TCP, PROTOCOL_UDP, PROTOCOL_SCTP.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - PROTOCOL_ICMP, PROTOCOL_TCP, PROTOCOL_UDP, PROTOCOL_SCTP.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param protocol set the protocol.
     */
    public void setProtocol(String  protocol) {
        this.protocol = protocol;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Version of proxy protocol used to convey client connection information to the back-end servers.
     * A value of 0 indicates that proxy protocol is not used.
     * A value of 1 or 2 indicates the version of proxy protocol used.
     * Enum options - PROXY_PROTOCOL_VERSION_1, PROXY_PROTOCOL_VERSION_2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return proxyProtocol
     */
    public String getProxyProtocol() {
        return proxyProtocol;
    }

    /**
     * This is the setter method to the attribute.
     * Version of proxy protocol used to convey client connection information to the back-end servers.
     * A value of 0 indicates that proxy protocol is not used.
     * A value of 1 or 2 indicates the version of proxy protocol used.
     * Enum options - PROXY_PROTOCOL_VERSION_1, PROXY_PROTOCOL_VERSION_2.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param proxyProtocol set the proxyProtocol.
     */
    public void setProxyProtocol(String  proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
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
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return retransmits
     */
    public Integer getRetransmits() {
        return retransmits;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param retransmits set the retransmits.
     */
    public void setRetransmits(Integer  retransmits) {
        this.retransmits = retransmits;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rxBytes
     */
    public Integer getRxBytes() {
        return rxBytes;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rxBytes set the rxBytes.
     */
    public void setRxBytes(Integer  rxBytes) {
        this.rxBytes = rxBytes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rxPkts
     */
    public Integer getRxPkts() {
        return rxPkts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param rxPkts set the rxPkts.
     */
    public void setRxPkts(Integer  rxPkts) {
        this.rxPkts = rxPkts;
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
     * Ipv6 address used to connect to backend server.
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
     * Ipv6 address used to connect to backend server.
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
     * Ipv6 address of the backend server.
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
     * Ipv6 address of the backend server.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverNumWindowShrink
     */
    public Integer getServerNumWindowShrink() {
        return serverNumWindowShrink;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverNumWindowShrink set the serverNumWindowShrink.
     */
    public void setServerNumWindowShrink(Integer  serverNumWindowShrink) {
        this.serverNumWindowShrink = serverNumWindowShrink;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return serverOutOfOrders
     */
    public Integer getServerOutOfOrders() {
        return serverOutOfOrders;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param serverOutOfOrders set the serverOutOfOrders.
     */
    public void setServerOutOfOrders(Integer  serverOutOfOrders) {
        this.serverOutOfOrders = serverOutOfOrders;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return serverRetransmits
     */
    public Integer getServerRetransmits() {
        return serverRetransmits;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param serverRetransmits set the serverRetransmits.
     */
    public void setServerRetransmits(Integer  serverRetransmits) {
        this.serverRetransmits = serverRetransmits;
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
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverRxBytes
     */
    public Integer getServerRxBytes() {
        return serverRxBytes;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverRxBytes set the serverRxBytes.
     */
    public void setServerRxBytes(Integer  serverRxBytes) {
        this.serverRxBytes = serverRxBytes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverRxPkts
     */
    public Integer getServerRxPkts() {
        return serverRxPkts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverRxPkts set the serverRxPkts.
     */
    public void setServerRxPkts(Integer  serverRxPkts) {
        this.serverRxPkts = serverRxPkts;
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return serverTimeouts
     */
    public Integer getServerTimeouts() {
        return serverTimeouts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param serverTimeouts set the serverTimeouts.
     */
    public void setServerTimeouts(Integer  serverTimeouts) {
        this.serverTimeouts = serverTimeouts;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverTotalBytes
     */
    public Integer getServerTotalBytes() {
        return serverTotalBytes;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverTotalBytes set the serverTotalBytes.
     */
    public void setServerTotalBytes(Integer  serverTotalBytes) {
        this.serverTotalBytes = serverTotalBytes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverTotalPkts
     */
    public Integer getServerTotalPkts() {
        return serverTotalPkts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverTotalPkts set the serverTotalPkts.
     */
    public void setServerTotalPkts(Integer  serverTotalPkts) {
        this.serverTotalPkts = serverTotalPkts;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverTxBytes
     */
    public Integer getServerTxBytes() {
        return serverTxBytes;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverTxBytes set the serverTxBytes.
     */
    public void setServerTxBytes(Integer  serverTxBytes) {
        this.serverTxBytes = serverTxBytes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverTxPkts
     */
    public Integer getServerTxPkts() {
        return serverTxPkts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverTxPkts set the serverTxPkts.
     */
    public void setServerTxPkts(Integer  serverTxPkts) {
        this.serverTxPkts = serverTxPkts;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return serverZeroWindowSizeEvents
     */
    public Integer getServerZeroWindowSizeEvents() {
        return serverZeroWindowSizeEvents;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param serverZeroWindowSizeEvents set the serverZeroWindowSizeEvents.
     */
    public void setServerZeroWindowSizeEvents(Integer  serverZeroWindowSizeEvents) {
        this.serverZeroWindowSizeEvents = serverZeroWindowSizeEvents;
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
    public ConnectionLog addSignificantLogItem(String significantLogItem) {
      if (this.significantLog == null) {
        this.significantLog = new ArrayList<String>();
      }
      this.significantLog.add(significantLogItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sip related logging information.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sipLog
     */
    public SipLog getSipLog() {
        return sipLog;
    }

    /**
     * This is the setter method to the attribute.
     * Sip related logging information.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sipLog set the sipLog.
     */
    public void setSipLog(SipLog sipLog) {
        this.sipLog = sipLog;
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTimestamp
     */
    public Integer getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTimestamp set the startTimestamp.
     */
    public void setStartTimestamp(Integer  startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return timeouts
     */
    public Integer getTimeouts() {
        return timeouts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param timeouts set the timeouts.
     */
    public void setTimeouts(Integer  timeouts) {
        this.timeouts = timeouts;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return totalBytes
     */
    public Integer getTotalBytes() {
        return totalBytes;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param totalBytes set the totalBytes.
     */
    public void setTotalBytes(Integer  totalBytes) {
        this.totalBytes = totalBytes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return totalPkts
     */
    public Integer getTotalPkts() {
        return totalPkts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param totalPkts set the totalPkts.
     */
    public void setTotalPkts(Integer  totalPkts) {
        this.totalPkts = totalPkts;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return totalTime
     */
    public Integer getTotalTime() {
        return totalTime;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param totalTime set the totalTime.
     */
    public void setTotalTime(Integer  totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return txBytes
     */
    public Integer getTxBytes() {
        return txBytes;
    }

    /**
     * This is the setter method to the attribute.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param txBytes set the txBytes.
     */
    public void setTxBytes(Integer  txBytes) {
        this.txBytes = txBytes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return txPkts
     */
    public Integer getTxPkts() {
        return txPkts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param txPkts set the txPkts.
     */
    public void setTxPkts(Integer  txPkts) {
        this.txPkts = txPkts;
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
     * Ipv6 address of the vip of the vs.
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
     * Ipv6 address of the vip of the vs.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return zeroWindowSizeEvents
     */
    public Integer getZeroWindowSizeEvents() {
        return zeroWindowSizeEvents;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param zeroWindowSizeEvents set the zeroWindowSizeEvents.
     */
    public void setZeroWindowSizeEvents(Integer  zeroWindowSizeEvents) {
        this.zeroWindowSizeEvents = zeroWindowSizeEvents;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ConnectionLog objConnectionLog = (ConnectionLog) o;
      return   Objects.equals(this.adf, objConnectionLog.adf)&&
  Objects.equals(this.significant, objConnectionLog.significant)&&
  Objects.equals(this.significance, objConnectionLog.significance)&&
  Objects.equals(this.udf, objConnectionLog.udf)&&
  Objects.equals(this.virtualservice, objConnectionLog.virtualservice)&&
  Objects.equals(this.vsIp, objConnectionLog.vsIp)&&
  Objects.equals(this.clientIp, objConnectionLog.clientIp)&&
  Objects.equals(this.clientLocation, objConnectionLog.clientLocation)&&
  Objects.equals(this.clientSrcPort, objConnectionLog.clientSrcPort)&&
  Objects.equals(this.clientDestPort, objConnectionLog.clientDestPort)&&
  Objects.equals(this.startTimestamp, objConnectionLog.startTimestamp)&&
  Objects.equals(this.reportTimestamp, objConnectionLog.reportTimestamp)&&
  Objects.equals(this.totalTime, objConnectionLog.totalTime)&&
  Objects.equals(this.connectionEnded, objConnectionLog.connectionEnded)&&
  Objects.equals(this.clientRtt, objConnectionLog.clientRtt)&&
  Objects.equals(this.mss, objConnectionLog.mss)&&
  Objects.equals(this.rxBytes, objConnectionLog.rxBytes)&&
  Objects.equals(this.txBytes, objConnectionLog.txBytes)&&
  Objects.equals(this.totalBytes, objConnectionLog.totalBytes)&&
  Objects.equals(this.rxPkts, objConnectionLog.rxPkts)&&
  Objects.equals(this.txPkts, objConnectionLog.txPkts)&&
  Objects.equals(this.totalPkts, objConnectionLog.totalPkts)&&
  Objects.equals(this.outOfOrders, objConnectionLog.outOfOrders)&&
  Objects.equals(this.retransmits, objConnectionLog.retransmits)&&
  Objects.equals(this.timeouts, objConnectionLog.timeouts)&&
  Objects.equals(this.zeroWindowSizeEvents, objConnectionLog.zeroWindowSizeEvents)&&
  Objects.equals(this.serviceEngine, objConnectionLog.serviceEngine)&&
  Objects.equals(this.vcpuId, objConnectionLog.vcpuId)&&
  Objects.equals(this.logId, objConnectionLog.logId)&&
  Objects.equals(this.networkSecurityPolicyRuleName, objConnectionLog.networkSecurityPolicyRuleName)&&
  Objects.equals(this.pool, objConnectionLog.pool)&&
  Objects.equals(this.poolName, objConnectionLog.poolName)&&
  Objects.equals(this.serverIp, objConnectionLog.serverIp)&&
  Objects.equals(this.serverName, objConnectionLog.serverName)&&
  Objects.equals(this.serverConnSrcIp, objConnectionLog.serverConnSrcIp)&&
  Objects.equals(this.serverDestPort, objConnectionLog.serverDestPort)&&
  Objects.equals(this.serverSrcPort, objConnectionLog.serverSrcPort)&&
  Objects.equals(this.serverRtt, objConnectionLog.serverRtt)&&
  Objects.equals(this.serverTotalBytes, objConnectionLog.serverTotalBytes)&&
  Objects.equals(this.serverRxBytes, objConnectionLog.serverRxBytes)&&
  Objects.equals(this.serverTxBytes, objConnectionLog.serverTxBytes)&&
  Objects.equals(this.serverTotalPkts, objConnectionLog.serverTotalPkts)&&
  Objects.equals(this.serverRxPkts, objConnectionLog.serverRxPkts)&&
  Objects.equals(this.serverTxPkts, objConnectionLog.serverTxPkts)&&
  Objects.equals(this.serverOutOfOrders, objConnectionLog.serverOutOfOrders)&&
  Objects.equals(this.serverRetransmits, objConnectionLog.serverRetransmits)&&
  Objects.equals(this.serverTimeouts, objConnectionLog.serverTimeouts)&&
  Objects.equals(this.serverZeroWindowSizeEvents, objConnectionLog.serverZeroWindowSizeEvents)&&
  Objects.equals(this.significantLog, objConnectionLog.significantLog)&&
  Objects.equals(this.numTransaction, objConnectionLog.numTransaction)&&
  Objects.equals(this.averageTurntime, objConnectionLog.averageTurntime)&&
  Objects.equals(this.numWindowShrink, objConnectionLog.numWindowShrink)&&
  Objects.equals(this.serverNumWindowShrink, objConnectionLog.serverNumWindowShrink)&&
  Objects.equals(this.numSynRetransmit, objConnectionLog.numSynRetransmit)&&
  Objects.equals(this.microservice, objConnectionLog.microservice)&&
  Objects.equals(this.microserviceName, objConnectionLog.microserviceName)&&
  Objects.equals(this.proxyProtocol, objConnectionLog.proxyProtocol)&&
  Objects.equals(this.sslSessionId, objConnectionLog.sslSessionId)&&
  Objects.equals(this.sslVersion, objConnectionLog.sslVersion)&&
  Objects.equals(this.sslCipher, objConnectionLog.sslCipher)&&
  Objects.equals(this.dnsFqdn, objConnectionLog.dnsFqdn)&&
  Objects.equals(this.dnsIps, objConnectionLog.dnsIps)&&
  Objects.equals(this.dnsQtype, objConnectionLog.dnsQtype)&&
  Objects.equals(this.gslbservice, objConnectionLog.gslbservice)&&
  Objects.equals(this.gslbserviceName, objConnectionLog.gslbserviceName)&&
  Objects.equals(this.gslbpoolName, objConnectionLog.gslbpoolName)&&
  Objects.equals(this.dnsResponse, objConnectionLog.dnsResponse)&&
  Objects.equals(this.dnsEtype, objConnectionLog.dnsEtype)&&
  Objects.equals(this.protocol, objConnectionLog.protocol)&&
  Objects.equals(this.dnsRequest, objConnectionLog.dnsRequest)&&
  Objects.equals(this.clientIp6, objConnectionLog.clientIp6)&&
  Objects.equals(this.vsIp6, objConnectionLog.vsIp6)&&
  Objects.equals(this.serverIp6, objConnectionLog.serverIp6)&&
  Objects.equals(this.serverConnSrcIp6, objConnectionLog.serverConnSrcIp6)&&
  Objects.equals(this.sniHostname, objConnectionLog.sniHostname)&&
  Objects.equals(this.sipLog, objConnectionLog.sipLog)&&
  Objects.equals(this.clientLogFilterName, objConnectionLog.clientLogFilterName)&&
  Objects.equals(this.dsLog, objConnectionLog.dsLog)&&
  Objects.equals(this.persistenceUsed, objConnectionLog.persistenceUsed)&&
  Objects.equals(this.ocspStatusRespSent, objConnectionLog.ocspStatusRespSent)&&
  Objects.equals(this.maxIngressLatencyFe, objConnectionLog.maxIngressLatencyFe)&&
  Objects.equals(this.avgIngressLatencyFe, objConnectionLog.avgIngressLatencyFe)&&
  Objects.equals(this.connEstTimeFe, objConnectionLog.connEstTimeFe)&&
  Objects.equals(this.maxIngressLatencyBe, objConnectionLog.maxIngressLatencyBe)&&
  Objects.equals(this.avgIngressLatencyBe, objConnectionLog.avgIngressLatencyBe)&&
  Objects.equals(this.connEstTimeBe, objConnectionLog.connEstTimeBe)&&
  Objects.equals(this.dnsTcpConnCloseFromSe, objConnectionLog.dnsTcpConnCloseFromSe);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ConnectionLog {\n");
                  sb.append("    adf: ").append(toIndentedString(adf)).append("\n");
                        sb.append("    averageTurntime: ").append(toIndentedString(averageTurntime)).append("\n");
                        sb.append("    avgIngressLatencyBe: ").append(toIndentedString(avgIngressLatencyBe)).append("\n");
                        sb.append("    avgIngressLatencyFe: ").append(toIndentedString(avgIngressLatencyFe)).append("\n");
                        sb.append("    clientDestPort: ").append(toIndentedString(clientDestPort)).append("\n");
                        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
                        sb.append("    clientIp6: ").append(toIndentedString(clientIp6)).append("\n");
                        sb.append("    clientLocation: ").append(toIndentedString(clientLocation)).append("\n");
                        sb.append("    clientLogFilterName: ").append(toIndentedString(clientLogFilterName)).append("\n");
                        sb.append("    clientRtt: ").append(toIndentedString(clientRtt)).append("\n");
                        sb.append("    clientSrcPort: ").append(toIndentedString(clientSrcPort)).append("\n");
                        sb.append("    connEstTimeBe: ").append(toIndentedString(connEstTimeBe)).append("\n");
                        sb.append("    connEstTimeFe: ").append(toIndentedString(connEstTimeFe)).append("\n");
                        sb.append("    connectionEnded: ").append(toIndentedString(connectionEnded)).append("\n");
                        sb.append("    dnsEtype: ").append(toIndentedString(dnsEtype)).append("\n");
                        sb.append("    dnsFqdn: ").append(toIndentedString(dnsFqdn)).append("\n");
                        sb.append("    dnsIps: ").append(toIndentedString(dnsIps)).append("\n");
                        sb.append("    dnsQtype: ").append(toIndentedString(dnsQtype)).append("\n");
                        sb.append("    dnsRequest: ").append(toIndentedString(dnsRequest)).append("\n");
                        sb.append("    dnsResponse: ").append(toIndentedString(dnsResponse)).append("\n");
                        sb.append("    dnsTcpConnCloseFromSe: ").append(toIndentedString(dnsTcpConnCloseFromSe)).append("\n");
                        sb.append("    dsLog: ").append(toIndentedString(dsLog)).append("\n");
                        sb.append("    gslbpoolName: ").append(toIndentedString(gslbpoolName)).append("\n");
                        sb.append("    gslbservice: ").append(toIndentedString(gslbservice)).append("\n");
                        sb.append("    gslbserviceName: ").append(toIndentedString(gslbserviceName)).append("\n");
                        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
                        sb.append("    maxIngressLatencyBe: ").append(toIndentedString(maxIngressLatencyBe)).append("\n");
                        sb.append("    maxIngressLatencyFe: ").append(toIndentedString(maxIngressLatencyFe)).append("\n");
                        sb.append("    microservice: ").append(toIndentedString(microservice)).append("\n");
                        sb.append("    microserviceName: ").append(toIndentedString(microserviceName)).append("\n");
                        sb.append("    mss: ").append(toIndentedString(mss)).append("\n");
                        sb.append("    networkSecurityPolicyRuleName: ").append(toIndentedString(networkSecurityPolicyRuleName)).append("\n");
                        sb.append("    numSynRetransmit: ").append(toIndentedString(numSynRetransmit)).append("\n");
                        sb.append("    numTransaction: ").append(toIndentedString(numTransaction)).append("\n");
                        sb.append("    numWindowShrink: ").append(toIndentedString(numWindowShrink)).append("\n");
                        sb.append("    ocspStatusRespSent: ").append(toIndentedString(ocspStatusRespSent)).append("\n");
                        sb.append("    outOfOrders: ").append(toIndentedString(outOfOrders)).append("\n");
                        sb.append("    persistenceUsed: ").append(toIndentedString(persistenceUsed)).append("\n");
                        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
                        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
                        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
                        sb.append("    proxyProtocol: ").append(toIndentedString(proxyProtocol)).append("\n");
                        sb.append("    reportTimestamp: ").append(toIndentedString(reportTimestamp)).append("\n");
                        sb.append("    retransmits: ").append(toIndentedString(retransmits)).append("\n");
                        sb.append("    rxBytes: ").append(toIndentedString(rxBytes)).append("\n");
                        sb.append("    rxPkts: ").append(toIndentedString(rxPkts)).append("\n");
                        sb.append("    serverConnSrcIp: ").append(toIndentedString(serverConnSrcIp)).append("\n");
                        sb.append("    serverConnSrcIp6: ").append(toIndentedString(serverConnSrcIp6)).append("\n");
                        sb.append("    serverDestPort: ").append(toIndentedString(serverDestPort)).append("\n");
                        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
                        sb.append("    serverIp6: ").append(toIndentedString(serverIp6)).append("\n");
                        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
                        sb.append("    serverNumWindowShrink: ").append(toIndentedString(serverNumWindowShrink)).append("\n");
                        sb.append("    serverOutOfOrders: ").append(toIndentedString(serverOutOfOrders)).append("\n");
                        sb.append("    serverRetransmits: ").append(toIndentedString(serverRetransmits)).append("\n");
                        sb.append("    serverRtt: ").append(toIndentedString(serverRtt)).append("\n");
                        sb.append("    serverRxBytes: ").append(toIndentedString(serverRxBytes)).append("\n");
                        sb.append("    serverRxPkts: ").append(toIndentedString(serverRxPkts)).append("\n");
                        sb.append("    serverSrcPort: ").append(toIndentedString(serverSrcPort)).append("\n");
                        sb.append("    serverTimeouts: ").append(toIndentedString(serverTimeouts)).append("\n");
                        sb.append("    serverTotalBytes: ").append(toIndentedString(serverTotalBytes)).append("\n");
                        sb.append("    serverTotalPkts: ").append(toIndentedString(serverTotalPkts)).append("\n");
                        sb.append("    serverTxBytes: ").append(toIndentedString(serverTxBytes)).append("\n");
                        sb.append("    serverTxPkts: ").append(toIndentedString(serverTxPkts)).append("\n");
                        sb.append("    serverZeroWindowSizeEvents: ").append(toIndentedString(serverZeroWindowSizeEvents)).append("\n");
                        sb.append("    serviceEngine: ").append(toIndentedString(serviceEngine)).append("\n");
                        sb.append("    significance: ").append(toIndentedString(significance)).append("\n");
                        sb.append("    significant: ").append(toIndentedString(significant)).append("\n");
                        sb.append("    significantLog: ").append(toIndentedString(significantLog)).append("\n");
                        sb.append("    sipLog: ").append(toIndentedString(sipLog)).append("\n");
                        sb.append("    sniHostname: ").append(toIndentedString(sniHostname)).append("\n");
                        sb.append("    sslCipher: ").append(toIndentedString(sslCipher)).append("\n");
                        sb.append("    sslSessionId: ").append(toIndentedString(sslSessionId)).append("\n");
                        sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
                        sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
                        sb.append("    timeouts: ").append(toIndentedString(timeouts)).append("\n");
                        sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
                        sb.append("    totalPkts: ").append(toIndentedString(totalPkts)).append("\n");
                        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
                        sb.append("    txBytes: ").append(toIndentedString(txBytes)).append("\n");
                        sb.append("    txPkts: ").append(toIndentedString(txPkts)).append("\n");
                        sb.append("    udf: ").append(toIndentedString(udf)).append("\n");
                        sb.append("    vcpuId: ").append(toIndentedString(vcpuId)).append("\n");
                        sb.append("    virtualservice: ").append(toIndentedString(virtualservice)).append("\n");
                        sb.append("    vsIp: ").append(toIndentedString(vsIp)).append("\n");
                        sb.append("    vsIp6: ").append(toIndentedString(vsIp6)).append("\n");
                        sb.append("    zeroWindowSizeEvents: ").append(toIndentedString(zeroWindowSizeEvents)).append("\n");
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
