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
 * The SeBootupProperties is a POJO class extends AviRestResource that used for creating
 * SeBootupProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeBootupProperties  {
    @JsonProperty("docker_backend_portend")
    private Integer dockerBackendPortend = 30720;

    @JsonProperty("docker_backend_portstart")
    private Integer dockerBackendPortstart = 20480;

    @JsonProperty("fair_queueing_enabled")
    private Boolean fairQueueingEnabled = false;

    @JsonProperty("geo_db_granularity")
    private Integer geoDbGranularity = 1;

    @JsonProperty("l7_conns_per_core")
    private Integer l7ConnsPerCore = 16384;

    @JsonProperty("l7_resvd_listen_conns_per_core")
    private Integer l7ResvdListenConnsPerCore = 256;

    @JsonProperty("log_agent_debug_enabled")
    private Boolean logAgentDebugEnabled = false;

    @JsonProperty("log_agent_trace_enabled")
    private Boolean logAgentTraceEnabled = true;

    @JsonProperty("se_dp_compression")
    private SeBootupCompressionProperties seDpCompression;

    @JsonProperty("se_emulated_cores")
    private Integer seEmulatedCores = 0;

    @JsonProperty("se_ip_encap_ipc")
    private Integer seIpEncapIpc = 0;

    @JsonProperty("se_l3_encap_ipc")
    private Integer seL3EncapIpc = 0;

    @JsonProperty("se_log_buffer_app_blocking_dequeue")
    private Boolean seLogBufferAppBlockingDequeue = false;

    @JsonProperty("se_log_buffer_applog_size")
    private Integer seLogBufferApplogSize = 4096;

    @JsonProperty("se_log_buffer_chunk_count")
    private Integer seLogBufferChunkCount = 1024;

    @JsonProperty("se_log_buffer_conn_blocking_dequeue")
    private Boolean seLogBufferConnBlockingDequeue = false;

    @JsonProperty("se_log_buffer_connlog_size")
    private Integer seLogBufferConnlogSize = 1024;

    @JsonProperty("se_log_buffer_events_blocking_dequeue")
    private Boolean seLogBufferEventsBlockingDequeue = true;

    @JsonProperty("se_log_buffer_events_size")
    private Integer seLogBufferEventsSize = 512;

    @JsonProperty("ssl_sess_cache_per_vs")
    private Integer sslSessCachePerVs = 4096;

    @JsonProperty("tcp_syncache_hashsize")
    private Integer tcpSyncacheHashsize = 8192;



    /**
     * This is the getter method this will return the attribute value.
     * End of the local tcp port range used by se for backend connections in docker environment.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30720.
     * @return dockerBackendPortend
     */
    public Integer getDockerBackendPortend() {
        return dockerBackendPortend;
    }

    /**
     * This is the setter method to the attribute.
     * End of the local tcp port range used by se for backend connections in docker environment.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30720.
     * @param dockerBackendPortend set the dockerBackendPortend.
     */
    public void setDockerBackendPortend(Integer  dockerBackendPortend) {
        this.dockerBackendPortend = dockerBackendPortend;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Start of the local tcp port range used by se for backend connections in docker environment.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20480.
     * @return dockerBackendPortstart
     */
    public Integer getDockerBackendPortstart() {
        return dockerBackendPortstart;
    }

    /**
     * This is the setter method to the attribute.
     * Start of the local tcp port range used by se for backend connections in docker environment.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 20480.
     * @param dockerBackendPortstart set the dockerBackendPortstart.
     */
    public void setDockerBackendPortstart(Integer  dockerBackendPortstart) {
        this.dockerBackendPortstart = dockerBackendPortstart;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable or disable fair queueing for packet transmission among virtualservices on an se.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return fairQueueingEnabled
     */
    public Boolean getFairQueueingEnabled() {
        return fairQueueingEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable or disable fair queueing for packet transmission among virtualservices on an se.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param fairQueueingEnabled set the fairQueueingEnabled.
     */
    public void setFairQueueingEnabled(Boolean  fairQueueingEnabled) {
        this.fairQueueingEnabled = fairQueueingEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Granularity or resolution of co-ordinates used.
     * When the value is 1 the co-ordinates provided in the geo-db are used as is (highest resolution.this value provides a 'zoom-out' value so that
     * coarser co-ordinates are used.
     * With higher resolution, logs can contain finer location information.
     * But, lower resolution provides significant memory and cpu benefits on the service engine.
     * Besides, given a smaller number of members that are separated geographically, a lower resolution is sufficient for correct load-balancing.
     * Allowed values are 1-20.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1), basic edition(allowed values- 1), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return geoDbGranularity
     */
    public Integer getGeoDbGranularity() {
        return geoDbGranularity;
    }

    /**
     * This is the setter method to the attribute.
     * Granularity or resolution of co-ordinates used.
     * When the value is 1 the co-ordinates provided in the geo-db are used as is (highest resolution.this value provides a 'zoom-out' value so that
     * coarser co-ordinates are used.
     * With higher resolution, logs can contain finer location information.
     * But, lower resolution provides significant memory and cpu benefits on the service engine.
     * Besides, given a smaller number of members that are separated geographically, a lower resolution is sufficient for correct load-balancing.
     * Allowed values are 1-20.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- 1), basic edition(allowed values- 1), enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param geoDbGranularity set the geoDbGranularity.
     */
    public void setGeoDbGranularity(Integer  geoDbGranularity) {
        this.geoDbGranularity = geoDbGranularity;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of l7 connections that can be cached per core.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 16384.
     * @return l7ConnsPerCore
     */
    public Integer getL7ConnsPerCore() {
        return l7ConnsPerCore;
    }

    /**
     * This is the setter method to the attribute.
     * Number of l7 connections that can be cached per core.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 16384.
     * @param l7ConnsPerCore set the l7ConnsPerCore.
     */
    public void setL7ConnsPerCore(Integer  l7ConnsPerCore) {
        this.l7ConnsPerCore = l7ConnsPerCore;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of reserved l7 listener connections per core.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 256.
     * @return l7ResvdListenConnsPerCore
     */
    public Integer getL7ResvdListenConnsPerCore() {
        return l7ResvdListenConnsPerCore;
    }

    /**
     * This is the setter method to the attribute.
     * Number of reserved l7 listener connections per core.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 256.
     * @param l7ResvdListenConnsPerCore set the l7ResvdListenConnsPerCore.
     */
    public void setL7ResvdListenConnsPerCore(Integer  l7ResvdListenConnsPerCore) {
        this.l7ResvdListenConnsPerCore = l7ResvdListenConnsPerCore;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Enable debug logs by default on service engine.
     * This includes all other debugging logs.
     * Debug logs can also be explcitly enabled from the cli shell.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return logAgentDebugEnabled
     */
    public Boolean getLogAgentDebugEnabled() {
        return logAgentDebugEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Enable debug logs by default on service engine.
     * This includes all other debugging logs.
     * Debug logs can also be explcitly enabled from the cli shell.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param logAgentDebugEnabled set the logAgentDebugEnabled.
     */
    public void setLogAgentDebugEnabled(Boolean  logAgentDebugEnabled) {
        this.logAgentDebugEnabled = logAgentDebugEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Enable trace logs by default on service engine.
     * Configuration operations are logged along with other important logs by service engine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return logAgentTraceEnabled
     */
    public Boolean getLogAgentTraceEnabled() {
        return logAgentTraceEnabled;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Enable trace logs by default on service engine.
     * Configuration operations are logged along with other important logs by service engine.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param logAgentTraceEnabled set the logAgentTraceEnabled.
     */
    public void setLogAgentTraceEnabled(Boolean  logAgentTraceEnabled) {
        this.logAgentTraceEnabled = logAgentTraceEnabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seDpCompression
     */
    public SeBootupCompressionProperties getSeDpCompression() {
        return seDpCompression;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seDpCompression set the seDpCompression.
     */
    public void setSeDpCompression(SeBootupCompressionProperties seDpCompression) {
        this.seDpCompression = seDpCompression;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.3.
     * Use config in serviceenginegroup instead.
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
     * Deprecated in 21.1.3.
     * Use config in serviceenginegroup instead.
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
     * Determines if se-se ipc messages are encapsulated in an ip header   note  this field has been moved to se_group properties 20.1.3 onwards.
     * 0        automatically determine based on hypervisor type    1        use ip encap unconditionally    ~[0,1]   don't use ip encap.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seIpEncapIpc
     */
    public Integer getSeIpEncapIpc() {
        return seIpEncapIpc;
    }

    /**
     * This is the setter method to the attribute.
     * Determines if se-se ipc messages are encapsulated in an ip header   note  this field has been moved to se_group properties 20.1.3 onwards.
     * 0        automatically determine based on hypervisor type    1        use ip encap unconditionally    ~[0,1]   don't use ip encap.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seIpEncapIpc set the seIpEncapIpc.
     */
    public void setSeIpEncapIpc(Integer  seIpEncapIpc) {
        this.seIpEncapIpc = seIpEncapIpc;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Determines if se-se ipc messages use se interface ip instead of vip    note  this field has been moved to se_group properties 20.1.3 onwards.
     * 0        automatically determine based on hypervisor type    1        use se interface ip unconditionally    ~[0,1]   don't use se interface ip.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return seL3EncapIpc
     */
    public Integer getSeL3EncapIpc() {
        return seL3EncapIpc;
    }

    /**
     * This is the setter method to the attribute.
     * Determines if se-se ipc messages use se interface ip instead of vip    note  this field has been moved to se_group properties 20.1.3 onwards.
     * 0        automatically determine based on hypervisor type    1        use se interface ip unconditionally    ~[0,1]   don't use se interface ip.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param seL3EncapIpc set the seL3EncapIpc.
     */
    public void setSeL3EncapIpc(Integer  seL3EncapIpc) {
        this.seL3EncapIpc = seL3EncapIpc;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Internal flag that blocks dataplane until all application logs are flushed to log-agent process.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seLogBufferAppBlockingDequeue
     */
    public Boolean getSeLogBufferAppBlockingDequeue() {
        return seLogBufferAppBlockingDequeue;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Internal flag that blocks dataplane until all application logs are flushed to log-agent process.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seLogBufferAppBlockingDequeue set the seLogBufferAppBlockingDequeue.
     */
    public void setSeLogBufferAppBlockingDequeue(Boolean  seLogBufferAppBlockingDequeue) {
        this.seLogBufferAppBlockingDequeue = seLogBufferAppBlockingDequeue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal application log buffer size to use on service engine.
     * Can be fine tuned for better performance of data plane in specific environments.
     * Unit is word.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
     * @return seLogBufferApplogSize
     */
    public Integer getSeLogBufferApplogSize() {
        return seLogBufferApplogSize;
    }

    /**
     * This is the setter method to the attribute.
     * Internal application log buffer size to use on service engine.
     * Can be fine tuned for better performance of data plane in specific environments.
     * Unit is word.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
     * @param seLogBufferApplogSize set the seLogBufferApplogSize.
     */
    public void setSeLogBufferApplogSize(Integer  seLogBufferApplogSize) {
        this.seLogBufferApplogSize = seLogBufferApplogSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of internal buffer chunks to use on service engine.
     * Can be fine tuned for better performance of data plane in specific environments.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @return seLogBufferChunkCount
     */
    public Integer getSeLogBufferChunkCount() {
        return seLogBufferChunkCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of internal buffer chunks to use on service engine.
     * Can be fine tuned for better performance of data plane in specific environments.
     * Unit is bytes.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @param seLogBufferChunkCount set the seLogBufferChunkCount.
     */
    public void setSeLogBufferChunkCount(Integer  seLogBufferChunkCount) {
        this.seLogBufferChunkCount = seLogBufferChunkCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Internal flag that blocks dataplane until all connection logs are flushed to log-agent process.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seLogBufferConnBlockingDequeue
     */
    public Boolean getSeLogBufferConnBlockingDequeue() {
        return seLogBufferConnBlockingDequeue;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Internal flag that blocks dataplane until all connection logs are flushed to log-agent process.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seLogBufferConnBlockingDequeue set the seLogBufferConnBlockingDequeue.
     */
    public void setSeLogBufferConnBlockingDequeue(Boolean  seLogBufferConnBlockingDequeue) {
        this.seLogBufferConnBlockingDequeue = seLogBufferConnBlockingDequeue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal connection log buffer size to use on service engine.
     * Can be fine tuned for better performance of data plane in specific environments.
     * Unit is word.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @return seLogBufferConnlogSize
     */
    public Integer getSeLogBufferConnlogSize() {
        return seLogBufferConnlogSize;
    }

    /**
     * This is the setter method to the attribute.
     * Internal connection log buffer size to use on service engine.
     * Can be fine tuned for better performance of data plane in specific environments.
     * Unit is word.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @param seLogBufferConnlogSize set the seLogBufferConnlogSize.
     */
    public void setSeLogBufferConnlogSize(Integer  seLogBufferConnlogSize) {
        this.seLogBufferConnlogSize = seLogBufferConnlogSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated in 21.1.1.
     * Internal flag that blocks dataplane until all outstanding events are flushed to log-agent process.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return seLogBufferEventsBlockingDequeue
     */
    public Boolean getSeLogBufferEventsBlockingDequeue() {
        return seLogBufferEventsBlockingDequeue;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated in 21.1.1.
     * Internal flag that blocks dataplane until all outstanding events are flushed to log-agent process.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param seLogBufferEventsBlockingDequeue set the seLogBufferEventsBlockingDequeue.
     */
    public void setSeLogBufferEventsBlockingDequeue(Boolean  seLogBufferEventsBlockingDequeue) {
        this.seLogBufferEventsBlockingDequeue = seLogBufferEventsBlockingDequeue;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Internal events buffer size to use on service engine.
     * Can be fine tuned for better performance of data plane in specific environments.
     * Unit is word.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 512.
     * @return seLogBufferEventsSize
     */
    public Integer getSeLogBufferEventsSize() {
        return seLogBufferEventsSize;
    }

    /**
     * This is the setter method to the attribute.
     * Internal events buffer size to use on service engine.
     * Can be fine tuned for better performance of data plane in specific environments.
     * Unit is word.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 512.
     * @param seLogBufferEventsSize set the seLogBufferEventsSize.
     */
    public void setSeLogBufferEventsSize(Integer  seLogBufferEventsSize) {
        this.seLogBufferEventsSize = seLogBufferEventsSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
     * @return sslSessCachePerVs
     */
    public Integer getSslSessCachePerVs() {
        return sslSessCachePerVs;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
     * @param sslSessCachePerVs set the sslSessCachePerVs.
     */
    public void setSslSessCachePerVs(Integer  sslSessCachePerVs) {
        this.sslSessCachePerVs = sslSessCachePerVs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Size of the tcp syn cache hash table.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8192.
     * @return tcpSyncacheHashsize
     */
    public Integer getTcpSyncacheHashsize() {
        return tcpSyncacheHashsize;
    }

    /**
     * This is the setter method to the attribute.
     * Size of the tcp syn cache hash table.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8192.
     * @param tcpSyncacheHashsize set the tcpSyncacheHashsize.
     */
    public void setTcpSyncacheHashsize(Integer  tcpSyncacheHashsize) {
        this.tcpSyncacheHashsize = tcpSyncacheHashsize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeBootupProperties objSeBootupProperties = (SeBootupProperties) o;
      return   Objects.equals(this.tcpSyncacheHashsize, objSeBootupProperties.tcpSyncacheHashsize)&&
  Objects.equals(this.logAgentTraceEnabled, objSeBootupProperties.logAgentTraceEnabled)&&
  Objects.equals(this.logAgentDebugEnabled, objSeBootupProperties.logAgentDebugEnabled)&&
  Objects.equals(this.seEmulatedCores, objSeBootupProperties.seEmulatedCores)&&
  Objects.equals(this.l7ConnsPerCore, objSeBootupProperties.l7ConnsPerCore)&&
  Objects.equals(this.sslSessCachePerVs, objSeBootupProperties.sslSessCachePerVs)&&
  Objects.equals(this.l7ResvdListenConnsPerCore, objSeBootupProperties.l7ResvdListenConnsPerCore)&&
  Objects.equals(this.seDpCompression, objSeBootupProperties.seDpCompression)&&
  Objects.equals(this.seLogBufferChunkCount, objSeBootupProperties.seLogBufferChunkCount)&&
  Objects.equals(this.seLogBufferApplogSize, objSeBootupProperties.seLogBufferApplogSize)&&
  Objects.equals(this.seLogBufferConnlogSize, objSeBootupProperties.seLogBufferConnlogSize)&&
  Objects.equals(this.seLogBufferEventsSize, objSeBootupProperties.seLogBufferEventsSize)&&
  Objects.equals(this.seIpEncapIpc, objSeBootupProperties.seIpEncapIpc)&&
  Objects.equals(this.seLogBufferAppBlockingDequeue, objSeBootupProperties.seLogBufferAppBlockingDequeue)&&
  Objects.equals(this.seLogBufferConnBlockingDequeue, objSeBootupProperties.seLogBufferConnBlockingDequeue)&&
  Objects.equals(this.seLogBufferEventsBlockingDequeue, objSeBootupProperties.seLogBufferEventsBlockingDequeue)&&
  Objects.equals(this.fairQueueingEnabled, objSeBootupProperties.fairQueueingEnabled)&&
  Objects.equals(this.dockerBackendPortstart, objSeBootupProperties.dockerBackendPortstart)&&
  Objects.equals(this.dockerBackendPortend, objSeBootupProperties.dockerBackendPortend)&&
  Objects.equals(this.seL3EncapIpc, objSeBootupProperties.seL3EncapIpc)&&
  Objects.equals(this.geoDbGranularity, objSeBootupProperties.geoDbGranularity);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeBootupProperties {\n");
                  sb.append("    dockerBackendPortend: ").append(toIndentedString(dockerBackendPortend)).append("\n");
                        sb.append("    dockerBackendPortstart: ").append(toIndentedString(dockerBackendPortstart)).append("\n");
                        sb.append("    fairQueueingEnabled: ").append(toIndentedString(fairQueueingEnabled)).append("\n");
                        sb.append("    geoDbGranularity: ").append(toIndentedString(geoDbGranularity)).append("\n");
                        sb.append("    l7ConnsPerCore: ").append(toIndentedString(l7ConnsPerCore)).append("\n");
                        sb.append("    l7ResvdListenConnsPerCore: ").append(toIndentedString(l7ResvdListenConnsPerCore)).append("\n");
                        sb.append("    logAgentDebugEnabled: ").append(toIndentedString(logAgentDebugEnabled)).append("\n");
                        sb.append("    logAgentTraceEnabled: ").append(toIndentedString(logAgentTraceEnabled)).append("\n");
                        sb.append("    seDpCompression: ").append(toIndentedString(seDpCompression)).append("\n");
                        sb.append("    seEmulatedCores: ").append(toIndentedString(seEmulatedCores)).append("\n");
                        sb.append("    seIpEncapIpc: ").append(toIndentedString(seIpEncapIpc)).append("\n");
                        sb.append("    seL3EncapIpc: ").append(toIndentedString(seL3EncapIpc)).append("\n");
                        sb.append("    seLogBufferAppBlockingDequeue: ").append(toIndentedString(seLogBufferAppBlockingDequeue)).append("\n");
                        sb.append("    seLogBufferApplogSize: ").append(toIndentedString(seLogBufferApplogSize)).append("\n");
                        sb.append("    seLogBufferChunkCount: ").append(toIndentedString(seLogBufferChunkCount)).append("\n");
                        sb.append("    seLogBufferConnBlockingDequeue: ").append(toIndentedString(seLogBufferConnBlockingDequeue)).append("\n");
                        sb.append("    seLogBufferConnlogSize: ").append(toIndentedString(seLogBufferConnlogSize)).append("\n");
                        sb.append("    seLogBufferEventsBlockingDequeue: ").append(toIndentedString(seLogBufferEventsBlockingDequeue)).append("\n");
                        sb.append("    seLogBufferEventsSize: ").append(toIndentedString(seLogBufferEventsSize)).append("\n");
                        sb.append("    sslSessCachePerVs: ").append(toIndentedString(sslSessCachePerVs)).append("\n");
                        sb.append("    tcpSyncacheHashsize: ").append(toIndentedString(tcpSyncacheHashsize)).append("\n");
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
