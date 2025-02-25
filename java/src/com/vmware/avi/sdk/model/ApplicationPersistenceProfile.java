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
 * The ApplicationPersistenceProfile is a POJO class extends AviRestResource that used for creating
 * ApplicationPersistenceProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationPersistenceProfile extends AviRestResource  {
    @JsonProperty("app_cookie_persistence_profile")
    private AppCookiePersistenceProfile appCookiePersistenceProfile;

    @JsonProperty("description")
    private String description;

    @JsonProperty("hdr_persistence_profile")
    private HdrPersistenceProfile hdrPersistenceProfile;

    @JsonProperty("http_cookie_persistence_profile")
    private HttpCookiePersistenceProfile httpCookiePersistenceProfile;

    @JsonProperty("ip_persistence_profile")
    private IPPersistenceProfile ipPersistenceProfile;

    @JsonProperty("is_federated")
    private Boolean isFederated = false;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("persistence_type")
    private String persistenceType = "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS";

    @JsonProperty("server_hm_down_recovery")
    private String serverHmDownRecovery = "HM_DOWN_PICK_NEW_SERVER";

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Specifies the application cookie persistence profile parameters.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appCookiePersistenceProfile
     */
    public AppCookiePersistenceProfile getAppCookiePersistenceProfile() {
        return appCookiePersistenceProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies the application cookie persistence profile parameters.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param appCookiePersistenceProfile set the appCookiePersistenceProfile.
     */
    public void setAppCookiePersistenceProfile(AppCookiePersistenceProfile appCookiePersistenceProfile) {
        this.appCookiePersistenceProfile = appCookiePersistenceProfile;
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
     * Specifies the custom http header persistence profile parameters.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hdrPersistenceProfile
     */
    public HdrPersistenceProfile getHdrPersistenceProfile() {
        return hdrPersistenceProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies the custom http header persistence profile parameters.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hdrPersistenceProfile set the hdrPersistenceProfile.
     */
    public void setHdrPersistenceProfile(HdrPersistenceProfile hdrPersistenceProfile) {
        this.hdrPersistenceProfile = hdrPersistenceProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies the http cookie persistence profile parameters.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpCookiePersistenceProfile
     */
    public HttpCookiePersistenceProfile getHttpCookiePersistenceProfile() {
        return httpCookiePersistenceProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies the http cookie persistence profile parameters.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpCookiePersistenceProfile set the httpCookiePersistenceProfile.
     */
    public void setHttpCookiePersistenceProfile(HttpCookiePersistenceProfile httpCookiePersistenceProfile) {
        this.httpCookiePersistenceProfile = httpCookiePersistenceProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies the client ip persistence profile parameters.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipPersistenceProfile
     */
    public IPPersistenceProfile getIpPersistenceProfile() {
        return ipPersistenceProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies the client ip persistence profile parameters.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipPersistenceProfile set the ipPersistenceProfile.
     */
    public void setIpPersistenceProfile(IPPersistenceProfile ipPersistenceProfile) {
        this.ipPersistenceProfile = ipPersistenceProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field describes the object's replication scope.
     * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
     * If the field is set to true, then the object is replicated across the federation.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return isFederated
     */
    public Boolean getIsFederated() {
        return isFederated;
    }

    /**
     * This is the setter method to the attribute.
     * This field describes the object's replication scope.
     * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
     * If the field is set to true, then the object is replicated across the federation.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param isFederated set the isFederated.
     */
    public void setIsFederated(Boolean  isFederated) {
        this.isFederated = isFederated;
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
    public ApplicationPersistenceProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A user-friendly name for the persistence profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * A user-friendly name for the persistence profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Method used to persist clients to the same server for a duration of time or a session.
     * Enum options - PERSISTENCE_TYPE_CLIENT_IP_ADDRESS, PERSISTENCE_TYPE_HTTP_COOKIE, PERSISTENCE_TYPE_TLS, PERSISTENCE_TYPE_CLIENT_IPV6_ADDRESS,
     * PERSISTENCE_TYPE_CUSTOM_HTTP_HEADER, PERSISTENCE_TYPE_APP_COOKIE, PERSISTENCE_TYPE_GSLB_SITE.
     * Allowed in enterprise edition with any value, essentials edition(allowed values-
     * persistence_type_client_ip_address,persistence_type_http_cookie), basic edition(allowed values-
     * persistence_type_client_ip_address,persistence_type_http_cookie), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS".
     * @return persistenceType
     */
    public String getPersistenceType() {
        return persistenceType;
    }

    /**
     * This is the setter method to the attribute.
     * Method used to persist clients to the same server for a duration of time or a session.
     * Enum options - PERSISTENCE_TYPE_CLIENT_IP_ADDRESS, PERSISTENCE_TYPE_HTTP_COOKIE, PERSISTENCE_TYPE_TLS, PERSISTENCE_TYPE_CLIENT_IPV6_ADDRESS,
     * PERSISTENCE_TYPE_CUSTOM_HTTP_HEADER, PERSISTENCE_TYPE_APP_COOKIE, PERSISTENCE_TYPE_GSLB_SITE.
     * Allowed in enterprise edition with any value, essentials edition(allowed values-
     * persistence_type_client_ip_address,persistence_type_http_cookie), basic edition(allowed values-
     * persistence_type_client_ip_address,persistence_type_http_cookie), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "PERSISTENCE_TYPE_CLIENT_IP_ADDRESS".
     * @param persistenceType set the persistenceType.
     */
    public void setPersistenceType(String  persistenceType) {
        this.persistenceType = persistenceType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specifies behavior when a persistent server has been marked down by a health monitor.
     * Enum options - HM_DOWN_PICK_NEW_SERVER, HM_DOWN_ABORT_CONNECTION, HM_DOWN_CONTINUE_PERSISTENT_SERVER.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- hm_down_pick_new_server), basic edition(allowed values-
     * hm_down_pick_new_server), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "HM_DOWN_PICK_NEW_SERVER".
     * @return serverHmDownRecovery
     */
    public String getServerHmDownRecovery() {
        return serverHmDownRecovery;
    }

    /**
     * This is the setter method to the attribute.
     * Specifies behavior when a persistent server has been marked down by a health monitor.
     * Enum options - HM_DOWN_PICK_NEW_SERVER, HM_DOWN_ABORT_CONNECTION, HM_DOWN_CONTINUE_PERSISTENT_SERVER.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- hm_down_pick_new_server), basic edition(allowed values-
     * hm_down_pick_new_server), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "HM_DOWN_PICK_NEW_SERVER".
     * @param serverHmDownRecovery set the serverHmDownRecovery.
     */
    public void setServerHmDownRecovery(String  serverHmDownRecovery) {
        this.serverHmDownRecovery = serverHmDownRecovery;
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
     * Uuid of the persistence profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the persistence profile.
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
      ApplicationPersistenceProfile objApplicationPersistenceProfile = (ApplicationPersistenceProfile) o;
      return   Objects.equals(this.uuid, objApplicationPersistenceProfile.uuid)&&
  Objects.equals(this.name, objApplicationPersistenceProfile.name)&&
  Objects.equals(this.serverHmDownRecovery, objApplicationPersistenceProfile.serverHmDownRecovery)&&
  Objects.equals(this.persistenceType, objApplicationPersistenceProfile.persistenceType)&&
  Objects.equals(this.ipPersistenceProfile, objApplicationPersistenceProfile.ipPersistenceProfile)&&
  Objects.equals(this.hdrPersistenceProfile, objApplicationPersistenceProfile.hdrPersistenceProfile)&&
  Objects.equals(this.appCookiePersistenceProfile, objApplicationPersistenceProfile.appCookiePersistenceProfile)&&
  Objects.equals(this.httpCookiePersistenceProfile, objApplicationPersistenceProfile.httpCookiePersistenceProfile)&&
  Objects.equals(this.markers, objApplicationPersistenceProfile.markers)&&
  Objects.equals(this.isFederated, objApplicationPersistenceProfile.isFederated)&&
  Objects.equals(this.description, objApplicationPersistenceProfile.description)&&
  Objects.equals(this.tenantRef, objApplicationPersistenceProfile.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApplicationPersistenceProfile {\n");
                  sb.append("    appCookiePersistenceProfile: ").append(toIndentedString(appCookiePersistenceProfile)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    hdrPersistenceProfile: ").append(toIndentedString(hdrPersistenceProfile)).append("\n");
                        sb.append("    httpCookiePersistenceProfile: ").append(toIndentedString(httpCookiePersistenceProfile)).append("\n");
                        sb.append("    ipPersistenceProfile: ").append(toIndentedString(ipPersistenceProfile)).append("\n");
                        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    persistenceType: ").append(toIndentedString(persistenceType)).append("\n");
                        sb.append("    serverHmDownRecovery: ").append(toIndentedString(serverHmDownRecovery)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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
