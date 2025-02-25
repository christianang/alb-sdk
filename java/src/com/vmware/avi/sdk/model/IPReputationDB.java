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
 * The IPReputationDB is a POJO class extends AviRestResource that used for creating
 * IPReputationDB.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IPReputationDB extends AviRestResource  {
    @JsonProperty("base_file_refs")
    private List<String> baseFileRefs;

    @JsonProperty("description")
    private String description;

    @JsonProperty("incremental_file_refs")
    private List<String> incrementalFileRefs;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("service_status")
    private IPReputationServiceStatus serviceStatus;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("vendor")
    private String vendor;

    @JsonProperty("version")
    private String version;


    /**
     * This is the getter method this will return the attribute value.
     * Ip reputation db base file.
     * It is a reference to an object of type fileobject.
     * Field introduced in 20.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return baseFileRefs
     */
    public List<String> getBaseFileRefs() {
        return baseFileRefs;
    }

    /**
     * This is the setter method. this will set the baseFileRefs
     * Ip reputation db base file.
     * It is a reference to an object of type fileobject.
     * Field introduced in 20.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return baseFileRefs
     */
    public void setBaseFileRefs(List<String>  baseFileRefs) {
        this.baseFileRefs = baseFileRefs;
    }

    /**
     * This is the setter method this will set the baseFileRefs
     * Ip reputation db base file.
     * It is a reference to an object of type fileobject.
     * Field introduced in 20.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return baseFileRefs
     */
    public IPReputationDB addBaseFileRefsItem(String baseFileRefsItem) {
      if (this.baseFileRefs == null) {
        this.baseFileRefs = new ArrayList<String>();
      }
      this.baseFileRefs.add(baseFileRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Description.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Ip reputation db incremental update files.
     * It is a reference to an object of type fileobject.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return incrementalFileRefs
     */
    public List<String> getIncrementalFileRefs() {
        return incrementalFileRefs;
    }

    /**
     * This is the setter method. this will set the incrementalFileRefs
     * Ip reputation db incremental update files.
     * It is a reference to an object of type fileobject.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return incrementalFileRefs
     */
    public void setIncrementalFileRefs(List<String>  incrementalFileRefs) {
        this.incrementalFileRefs = incrementalFileRefs;
    }

    /**
     * This is the setter method this will set the incrementalFileRefs
     * Ip reputation db incremental update files.
     * It is a reference to an object of type fileobject.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return incrementalFileRefs
     */
    public IPReputationDB addIncrementalFileRefsItem(String incrementalFileRefsItem) {
      if (this.incrementalFileRefs == null) {
        this.incrementalFileRefs = new ArrayList<String>();
      }
      this.incrementalFileRefs.add(incrementalFileRefsItem);
      return this;
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
    public IPReputationDB addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ip reputation db name.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Ip reputation db name.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If this object is managed by the ip reputation service, this field contain the status of this syncronization.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceStatus
     */
    public IPReputationServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * This is the setter method to the attribute.
     * If this object is managed by the ip reputation service, this field contain the status of this syncronization.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceStatus set the serviceStatus.
     */
    public void setServiceStatus(IPReputationServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant that this object belongs to.
     * It is a reference to an object of type tenant.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant that this object belongs to.
     * It is a reference to an object of type tenant.
     * Field introduced in 20.1.1.
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
     * Uuid of this object.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of this object.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Organization providing ip reputation data.
     * Enum options - IP_REPUTATION_VENDOR_WEBROOT.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * This is the setter method to the attribute.
     * Organization providing ip reputation data.
     * Enum options - IP_REPUTATION_VENDOR_WEBROOT.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vendor set the vendor.
     */
    public void setVendor(String  vendor) {
        this.vendor = vendor;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A version number for this database object.
     * This is informal for the consumer of this api only, a tool which manages this object can store version information here.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * A version number for this database object.
     * This is informal for the consumer of this api only, a tool which manages this object can store version information here.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param version set the version.
     */
    public void setVersion(String  version) {
        this.version = version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      IPReputationDB objIPReputationDB = (IPReputationDB) o;
      return   Objects.equals(this.uuid, objIPReputationDB.uuid)&&
  Objects.equals(this.tenantRef, objIPReputationDB.tenantRef)&&
  Objects.equals(this.name, objIPReputationDB.name)&&
  Objects.equals(this.description, objIPReputationDB.description)&&
  Objects.equals(this.baseFileRefs, objIPReputationDB.baseFileRefs)&&
  Objects.equals(this.incrementalFileRefs, objIPReputationDB.incrementalFileRefs)&&
  Objects.equals(this.vendor, objIPReputationDB.vendor)&&
  Objects.equals(this.version, objIPReputationDB.version)&&
  Objects.equals(this.serviceStatus, objIPReputationDB.serviceStatus)&&
  Objects.equals(this.markers, objIPReputationDB.markers);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IPReputationDB {\n");
                  sb.append("    baseFileRefs: ").append(toIndentedString(baseFileRefs)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    incrementalFileRefs: ").append(toIndentedString(incrementalFileRefs)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
                        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
