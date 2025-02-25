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
 * The MatchTarget is a POJO class extends AviRestResource that used for creating
 * MatchTarget.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MatchTarget  {
    @JsonProperty("bot_detection_result")
    private BotDetectionMatch botDetectionResult;

    @JsonProperty("client_ip")
    private IpAddrMatch clientIp;

    @JsonProperty("cookie")
    private CookieMatch cookie;

    @JsonProperty("geo_matches")
    private List<GeoMatch> geoMatches;

    @JsonProperty("hdrs")
    private List<HdrMatch> hdrs;

    @JsonProperty("host_hdr")
    private HostHdrMatch hostHdr;

    @JsonProperty("ip_reputation_type")
    private IPReputationTypeMatch ipReputationType;

    @JsonProperty("method")
    private MethodMatch method;

    @JsonProperty("path")
    private PathMatch path;

    @JsonProperty("protocol")
    private ProtocolMatch protocol;

    @JsonProperty("query")
    private QueryMatch query;

    @JsonProperty("source_ip")
    private IpAddrMatch sourceIp;

    @JsonProperty("tls_fingerprint_match")
    private TlsFingerprintMatch tlsFingerprintMatch;

    @JsonProperty("version")
    private HTTPVersionMatch version;

    @JsonProperty("vs_port")
    private PortMatch vsPort;



    /**
     * This is the getter method this will return the attribute value.
     * Configure the bot classification result.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return botDetectionResult
     */
    public BotDetectionMatch getBotDetectionResult() {
        return botDetectionResult;
    }

    /**
     * This is the setter method to the attribute.
     * Configure the bot classification result.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param botDetectionResult set the botDetectionResult.
     */
    public void setBotDetectionResult(BotDetectionMatch botDetectionResult) {
        this.botDetectionResult = botDetectionResult;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure client ip addresses.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientIp
     */
    public IpAddrMatch getClientIp() {
        return clientIp;
    }

    /**
     * This is the setter method to the attribute.
     * Configure client ip addresses.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientIp set the clientIp.
     */
    public void setClientIp(IpAddrMatch clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure http cookie(s).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cookie
     */
    public CookieMatch getCookie() {
        return cookie;
    }

    /**
     * This is the setter method to the attribute.
     * Configure http cookie(s).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cookie set the cookie.
     */
    public void setCookie(CookieMatch cookie) {
        this.cookie = cookie;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Configure the geo information.
     * Field introduced in 21.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return geoMatches
     */
    public List<GeoMatch> getGeoMatches() {
        return geoMatches;
    }

    /**
     * This is the setter method. this will set the geoMatches
     * Configure the geo information.
     * Field introduced in 21.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return geoMatches
     */
    public void setGeoMatches(List<GeoMatch>  geoMatches) {
        this.geoMatches = geoMatches;
    }

    /**
     * This is the setter method this will set the geoMatches
     * Configure the geo information.
     * Field introduced in 21.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return geoMatches
     */
    public MatchTarget addGeoMatchesItem(GeoMatch geoMatchesItem) {
      if (this.geoMatches == null) {
        this.geoMatches = new ArrayList<GeoMatch>();
      }
      this.geoMatches.add(geoMatchesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Configure http header(s).
     * All configured headers must match.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hdrs
     */
    public List<HdrMatch> getHdrs() {
        return hdrs;
    }

    /**
     * This is the setter method. this will set the hdrs
     * Configure http header(s).
     * All configured headers must match.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hdrs
     */
    public void setHdrs(List<HdrMatch>  hdrs) {
        this.hdrs = hdrs;
    }

    /**
     * This is the setter method this will set the hdrs
     * Configure http header(s).
     * All configured headers must match.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hdrs
     */
    public MatchTarget addHdrsItem(HdrMatch hdrsItem) {
      if (this.hdrs == null) {
        this.hdrs = new ArrayList<HdrMatch>();
      }
      this.hdrs.add(hdrsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure the host header.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostHdr
     */
    public HostHdrMatch getHostHdr() {
        return hostHdr;
    }

    /**
     * This is the setter method to the attribute.
     * Configure the host header.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostHdr set the hostHdr.
     */
    public void setHostHdr(HostHdrMatch hostHdr) {
        this.hostHdr = hostHdr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure ip reputation.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipReputationType
     */
    public IPReputationTypeMatch getIpReputationType() {
        return ipReputationType;
    }

    /**
     * This is the setter method to the attribute.
     * Configure ip reputation.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipReputationType set the ipReputationType.
     */
    public void setIpReputationType(IPReputationTypeMatch ipReputationType) {
        this.ipReputationType = ipReputationType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure http methods.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return method
     */
    public MethodMatch getMethod() {
        return method;
    }

    /**
     * This is the setter method to the attribute.
     * Configure http methods.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param method set the method.
     */
    public void setMethod(MethodMatch method) {
        this.method = method;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure request paths.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return path
     */
    public PathMatch getPath() {
        return path;
    }

    /**
     * This is the setter method to the attribute.
     * Configure request paths.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param path set the path.
     */
    public void setPath(PathMatch path) {
        this.path = path;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure the type of http protocol.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return protocol
     */
    public ProtocolMatch getProtocol() {
        return protocol;
    }

    /**
     * This is the setter method to the attribute.
     * Configure the type of http protocol.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param protocol set the protocol.
     */
    public void setProtocol(ProtocolMatch protocol) {
        this.protocol = protocol;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure request query.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return query
     */
    public QueryMatch getQuery() {
        return query;
    }

    /**
     * This is the setter method to the attribute.
     * Configure request query.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param query set the query.
     */
    public void setQuery(QueryMatch query) {
        this.query = query;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure source ip addresses.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sourceIp
     */
    public IpAddrMatch getSourceIp() {
        return sourceIp;
    }

    /**
     * This is the setter method to the attribute.
     * Configure source ip addresses.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sourceIp set the sourceIp.
     */
    public void setSourceIp(IpAddrMatch sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure the tls fingerprint.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tlsFingerprintMatch
     */
    public TlsFingerprintMatch getTlsFingerprintMatch() {
        return tlsFingerprintMatch;
    }

    /**
     * This is the setter method to the attribute.
     * Configure the tls fingerprint.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tlsFingerprintMatch set the tlsFingerprintMatch.
     */
    public void setTlsFingerprintMatch(TlsFingerprintMatch tlsFingerprintMatch) {
        this.tlsFingerprintMatch = tlsFingerprintMatch;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure versions of the http protocol.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public HTTPVersionMatch getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * Configure versions of the http protocol.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param version set the version.
     */
    public void setVersion(HTTPVersionMatch version) {
        this.version = version;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure virtual service ports.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsPort
     */
    public PortMatch getVsPort() {
        return vsPort;
    }

    /**
     * This is the setter method to the attribute.
     * Configure virtual service ports.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsPort set the vsPort.
     */
    public void setVsPort(PortMatch vsPort) {
        this.vsPort = vsPort;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MatchTarget objMatchTarget = (MatchTarget) o;
      return   Objects.equals(this.clientIp, objMatchTarget.clientIp)&&
  Objects.equals(this.vsPort, objMatchTarget.vsPort)&&
  Objects.equals(this.protocol, objMatchTarget.protocol)&&
  Objects.equals(this.method, objMatchTarget.method)&&
  Objects.equals(this.version, objMatchTarget.version)&&
  Objects.equals(this.path, objMatchTarget.path)&&
  Objects.equals(this.query, objMatchTarget.query)&&
  Objects.equals(this.hdrs, objMatchTarget.hdrs)&&
  Objects.equals(this.cookie, objMatchTarget.cookie)&&
  Objects.equals(this.hostHdr, objMatchTarget.hostHdr)&&
  Objects.equals(this.ipReputationType, objMatchTarget.ipReputationType)&&
  Objects.equals(this.geoMatches, objMatchTarget.geoMatches)&&
  Objects.equals(this.botDetectionResult, objMatchTarget.botDetectionResult)&&
  Objects.equals(this.sourceIp, objMatchTarget.sourceIp)&&
  Objects.equals(this.tlsFingerprintMatch, objMatchTarget.tlsFingerprintMatch);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MatchTarget {\n");
                  sb.append("    botDetectionResult: ").append(toIndentedString(botDetectionResult)).append("\n");
                        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
                        sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
                        sb.append("    geoMatches: ").append(toIndentedString(geoMatches)).append("\n");
                        sb.append("    hdrs: ").append(toIndentedString(hdrs)).append("\n");
                        sb.append("    hostHdr: ").append(toIndentedString(hostHdr)).append("\n");
                        sb.append("    ipReputationType: ").append(toIndentedString(ipReputationType)).append("\n");
                        sb.append("    method: ").append(toIndentedString(method)).append("\n");
                        sb.append("    path: ").append(toIndentedString(path)).append("\n");
                        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
                        sb.append("    query: ").append(toIndentedString(query)).append("\n");
                        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
                        sb.append("    tlsFingerprintMatch: ").append(toIndentedString(tlsFingerprintMatch)).append("\n");
                        sb.append("    version: ").append(toIndentedString(version)).append("\n");
                        sb.append("    vsPort: ").append(toIndentedString(vsPort)).append("\n");
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
