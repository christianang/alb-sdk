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
 * The ApplicationProfile is a POJO class extends AviRestResource that used for creating
 * ApplicationProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationProfile extends AviRestResource  {
    @JsonProperty("app_service_type")
    private String appServiceType;

    @JsonProperty("cloud_config_cksum")
    private String cloudConfigCksum;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("description")
    private String description;

    @JsonProperty("dns_service_profile")
    private DnsServiceApplicationProfile dnsServiceProfile;

    @JsonProperty("dos_rl_profile")
    private DosRateLimitProfile dosRlProfile;

    @JsonProperty("http_profile")
    private HTTPApplicationProfile httpProfile;

    @JsonProperty("l4_ssl_profile")
    private L4SSLApplicationProfile l4SslProfile;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("preserve_client_ip")
    private Boolean preserveClientIp = false;

    @JsonProperty("preserve_client_port")
    private Boolean preserveClientPort;

    @JsonProperty("preserve_dest_ip_port")
    private Boolean preserveDestIpPort = false;

    @JsonProperty("sip_service_profile")
    private SipServiceApplicationProfile sipServiceProfile;

    @JsonProperty("tcp_app_profile")
    private TCPApplicationProfile tcpAppProfile;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("type")
    private String type;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Specifies app service type for an application.
     * Enum options - APP_SERVICE_TYPE_L7_HORIZON, APP_SERVICE_TYPE_L4_BLAST, APP_SERVICE_TYPE_L4_PCOIP, APP_SERVICE_TYPE_L4_FTP.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appServiceType
     */
    public String getAppServiceType() {
        return appServiceType;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies app service type for an application.
     * Enum options - APP_SERVICE_TYPE_L7_HORIZON, APP_SERVICE_TYPE_L4_BLAST, APP_SERVICE_TYPE_L4_PCOIP, APP_SERVICE_TYPE_L4_FTP.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param appServiceType set the appServiceType.
     */
    public void setAppServiceType(String  appServiceType) {
        this.appServiceType = appServiceType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Checksum of application profiles.
     * Internally set by cloud connector.
     * Field introduced in 17.2.14, 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudConfigCksum
     */
    public String getCloudConfigCksum() {
        return cloudConfigCksum;
    }

    /**
     * This is the setter method to the attribute.
     * Checksum of application profiles.
     * Internally set by cloud connector.
     * Field introduced in 17.2.14, 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudConfigCksum set the cloudConfigCksum.
     */
    public void setCloudConfigCksum(String  cloudConfigCksum) {
        this.cloudConfigCksum = cloudConfigCksum;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the application profile creator.
     * Field introduced in 17.2.14, 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the application profile creator.
     * Field introduced in 17.2.14, 18.1.5, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param createdBy set the createdBy.
     */
    public void setCreatedBy(String  createdBy) {
        this.createdBy = createdBy;
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
     * Specifies various dns service related controls for virtual service.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsServiceProfile
     */
    public DnsServiceApplicationProfile getDnsServiceProfile() {
        return dnsServiceProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies various dns service related controls for virtual service.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsServiceProfile set the dnsServiceProfile.
     */
    public void setDnsServiceProfile(DnsServiceApplicationProfile dnsServiceProfile) {
        this.dnsServiceProfile = dnsServiceProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies various security related controls for virtual service.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dosRlProfile
     */
    public DosRateLimitProfile getDosRlProfile() {
        return dosRlProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies various security related controls for virtual service.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dosRlProfile set the dosRlProfile.
     */
    public void setDosRlProfile(DosRateLimitProfile dosRlProfile) {
        this.dosRlProfile = dosRlProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies the http application proxy profile parameters.
     * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpProfile
     */
    public HTTPApplicationProfile getHttpProfile() {
        return httpProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies the http application proxy profile parameters.
     * Allowed in enterprise edition with any value, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpProfile set the httpProfile.
     */
    public void setHttpProfile(HTTPApplicationProfile httpProfile) {
        this.httpProfile = httpProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies various l4 ssl service related controls for virtual service.
     * Field introduced in 22.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return l4SslProfile
     */
    public L4SSLApplicationProfile getL4SslProfile() {
        return l4SslProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies various l4 ssl service related controls for virtual service.
     * Field introduced in 22.1.2.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param l4SslProfile set the l4SslProfile.
     */
    public void setL4SslProfile(L4SSLApplicationProfile l4SslProfile) {
        this.l4SslProfile = l4SslProfile;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
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
     * Field introduced in 20.1.5.
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
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public ApplicationProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the application profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the application profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies if client ip needs to be preserved for backend connection.
     * Not compatible with connection multiplexing.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return preserveClientIp
     */
    public Boolean getPreserveClientIp() {
        return preserveClientIp;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies if client ip needs to be preserved for backend connection.
     * Not compatible with connection multiplexing.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param preserveClientIp set the preserveClientIp.
     */
    public void setPreserveClientIp(Boolean  preserveClientIp) {
        this.preserveClientIp = preserveClientIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies if we need to preserve client port while preserving client ip for backend connections.
     * Field introduced in 17.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return preserveClientPort
     */
    public Boolean getPreserveClientPort() {
        return preserveClientPort;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies if we need to preserve client port while preserving client ip for backend connections.
     * Field introduced in 17.2.7.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param preserveClientPort set the preserveClientPort.
     */
    public void setPreserveClientPort(Boolean  preserveClientPort) {
        this.preserveClientPort = preserveClientPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies if destination ip and port needs to be preserved for backend connection.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return preserveDestIpPort
     */
    public Boolean getPreserveDestIpPort() {
        return preserveDestIpPort;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies if destination ip and port needs to be preserved for backend connection.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param preserveDestIpPort set the preserveDestIpPort.
     */
    public void setPreserveDestIpPort(Boolean  preserveDestIpPort) {
        this.preserveDestIpPort = preserveDestIpPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies various sip service related controls for virtual service.
     * Field introduced in 17.2.8, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sipServiceProfile
     */
    public SipServiceApplicationProfile getSipServiceProfile() {
        return sipServiceProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies various sip service related controls for virtual service.
     * Field introduced in 17.2.8, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sipServiceProfile set the sipServiceProfile.
     */
    public void setSipServiceProfile(SipServiceApplicationProfile sipServiceProfile) {
        this.sipServiceProfile = sipServiceProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies the tcp application proxy profile parameters.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tcpAppProfile
     */
    public TCPApplicationProfile getTcpAppProfile() {
        return tcpAppProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies the tcp application proxy profile parameters.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tcpAppProfile set the tcpAppProfile.
     */
    public void setTcpAppProfile(TCPApplicationProfile tcpAppProfile) {
        this.tcpAppProfile = tcpAppProfile;
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
     * Specifies which application layer proxy is enabled for the virtual service.
     * Enum options - APPLICATION_PROFILE_TYPE_L4, APPLICATION_PROFILE_TYPE_HTTP, APPLICATION_PROFILE_TYPE_SYSLOG, APPLICATION_PROFILE_TYPE_DNS,
     * APPLICATION_PROFILE_TYPE_SSL, APPLICATION_PROFILE_TYPE_SIP.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- application_profile_type_l4), basic edition(allowed values-
     * application_profile_type_l4,application_profile_type_http), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies which application layer proxy is enabled for the virtual service.
     * Enum options - APPLICATION_PROFILE_TYPE_L4, APPLICATION_PROFILE_TYPE_HTTP, APPLICATION_PROFILE_TYPE_SYSLOG, APPLICATION_PROFILE_TYPE_DNS,
     * APPLICATION_PROFILE_TYPE_SSL, APPLICATION_PROFILE_TYPE_SIP.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- application_profile_type_l4), basic edition(allowed values-
     * application_profile_type_l4,application_profile_type_http), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
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
     * Uuid of the application profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the application profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApplicationProfile objApplicationProfile = (ApplicationProfile) o;
      return   Objects.equals(this.uuid, objApplicationProfile.uuid)&&
  Objects.equals(this.name, objApplicationProfile.name)&&
  Objects.equals(this.type, objApplicationProfile.type)&&
  Objects.equals(this.httpProfile, objApplicationProfile.httpProfile)&&
  Objects.equals(this.dosRlProfile, objApplicationProfile.dosRlProfile)&&
  Objects.equals(this.tcpAppProfile, objApplicationProfile.tcpAppProfile)&&
  Objects.equals(this.dnsServiceProfile, objApplicationProfile.dnsServiceProfile)&&
  Objects.equals(this.preserveClientIp, objApplicationProfile.preserveClientIp)&&
  Objects.equals(this.preserveClientPort, objApplicationProfile.preserveClientPort)&&
  Objects.equals(this.sipServiceProfile, objApplicationProfile.sipServiceProfile)&&
  Objects.equals(this.cloudConfigCksum, objApplicationProfile.cloudConfigCksum)&&
  Objects.equals(this.createdBy, objApplicationProfile.createdBy)&&
  Objects.equals(this.preserveDestIpPort, objApplicationProfile.preserveDestIpPort)&&
  Objects.equals(this.markers, objApplicationProfile.markers)&&
  Objects.equals(this.l4SslProfile, objApplicationProfile.l4SslProfile)&&
  Objects.equals(this.description, objApplicationProfile.description)&&
  Objects.equals(this.tenantRef, objApplicationProfile.tenantRef)&&
  Objects.equals(this.appServiceType, objApplicationProfile.appServiceType);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApplicationProfile {\n");
                  sb.append("    appServiceType: ").append(toIndentedString(appServiceType)).append("\n");
                        sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
                        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    dnsServiceProfile: ").append(toIndentedString(dnsServiceProfile)).append("\n");
                        sb.append("    dosRlProfile: ").append(toIndentedString(dosRlProfile)).append("\n");
                        sb.append("    httpProfile: ").append(toIndentedString(httpProfile)).append("\n");
                        sb.append("    l4SslProfile: ").append(toIndentedString(l4SslProfile)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    preserveClientIp: ").append(toIndentedString(preserveClientIp)).append("\n");
                        sb.append("    preserveClientPort: ").append(toIndentedString(preserveClientPort)).append("\n");
                        sb.append("    preserveDestIpPort: ").append(toIndentedString(preserveDestIpPort)).append("\n");
                        sb.append("    sipServiceProfile: ").append(toIndentedString(sipServiceProfile)).append("\n");
                        sb.append("    tcpAppProfile: ").append(toIndentedString(tcpAppProfile)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
