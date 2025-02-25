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
 * The WafCRS is a POJO class extends AviRestResource that used for creating
 * WafCRS.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafCRS extends AviRestResource  {
    @JsonProperty("allowed_request_content_type_charsets")
    private List<String> allowedRequestContentTypeCharsets;

    @JsonProperty("description")
    private String description;

    @JsonProperty("files")
    private List<WafDataFile> files;

    @JsonProperty("groups")
    private List<WafRuleGroup> groups;

    @JsonProperty("integrity")
    private String integrity;

    @JsonProperty("integrity_values")
    private List<String> integrityValues;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("restricted_extensions")
    private List<String> restrictedExtensions;

    @JsonProperty("restricted_headers")
    private List<String> restrictedHeaders;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("version")
    private String version;


    /**
     * This is the getter method this will return the attribute value.
     * Allowed request content type character sets in waf.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowedRequestContentTypeCharsets
     */
    public List<String> getAllowedRequestContentTypeCharsets() {
        return allowedRequestContentTypeCharsets;
    }

    /**
     * This is the setter method. this will set the allowedRequestContentTypeCharsets
     * Allowed request content type character sets in waf.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowedRequestContentTypeCharsets
     */
    public void setAllowedRequestContentTypeCharsets(List<String>  allowedRequestContentTypeCharsets) {
        this.allowedRequestContentTypeCharsets = allowedRequestContentTypeCharsets;
    }

    /**
     * This is the setter method this will set the allowedRequestContentTypeCharsets
     * Allowed request content type character sets in waf.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowedRequestContentTypeCharsets
     */
    public WafCRS addAllowedRequestContentTypeCharsetsItem(String allowedRequestContentTypeCharsetsItem) {
      if (this.allowedRequestContentTypeCharsets == null) {
        this.allowedRequestContentTypeCharsets = new ArrayList<String>();
      }
      this.allowedRequestContentTypeCharsets.add(allowedRequestContentTypeCharsetsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A short description of this ruleset.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * A short description of this ruleset.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of data files used for waf rules.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return files
     */
    public List<WafDataFile> getFiles() {
        return files;
    }

    /**
     * This is the setter method. this will set the files
     * List of data files used for waf rules.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return files
     */
    public void setFiles(List<WafDataFile>  files) {
        this.files = files;
    }

    /**
     * This is the setter method this will set the files
     * List of data files used for waf rules.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return files
     */
    public WafCRS addFilesItem(WafDataFile filesItem) {
      if (this.files == null) {
        this.files = new ArrayList<WafDataFile>();
      }
      this.files.add(filesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Waf rules are sorted in groups based on their characterization.
     * Field introduced in 18.1.1.
     * Maximum of 64 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return groups
     */
    public List<WafRuleGroup> getGroups() {
        return groups;
    }

    /**
     * This is the setter method. this will set the groups
     * Waf rules are sorted in groups based on their characterization.
     * Field introduced in 18.1.1.
     * Maximum of 64 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return groups
     */
    public void setGroups(List<WafRuleGroup>  groups) {
        this.groups = groups;
    }

    /**
     * This is the setter method this will set the groups
     * Waf rules are sorted in groups based on their characterization.
     * Field introduced in 18.1.1.
     * Maximum of 64 items allowed.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return groups
     */
    public WafCRS addGroupsItem(WafRuleGroup groupsItem) {
      if (this.groups == null) {
        this.groups = new ArrayList<WafRuleGroup>();
      }
      this.groups.add(groupsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Integrity protection value.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return integrity
     */
    public String getIntegrity() {
        return integrity;
    }

    /**
     * This is the setter method to the attribute.
     * Integrity protection value.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param integrity set the integrity.
     */
    public void setIntegrity(String  integrity) {
        this.integrity = integrity;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Integrity protection values for crs.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return integrityValues
     */
    public List<String> getIntegrityValues() {
        return integrityValues;
    }

    /**
     * This is the setter method. this will set the integrityValues
     * Integrity protection values for crs.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return integrityValues
     */
    public void setIntegrityValues(List<String>  integrityValues) {
        this.integrityValues = integrityValues;
    }

    /**
     * This is the setter method this will set the integrityValues
     * Integrity protection values for crs.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return integrityValues
     */
    public WafCRS addIntegrityValuesItem(String integrityValuesItem) {
      if (this.integrityValues == null) {
        this.integrityValues = new ArrayList<String>();
      }
      this.integrityValues.add(integrityValuesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.6.
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
     * Field introduced in 20.1.6.
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
     * Field introduced in 20.1.6.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public WafCRS addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of this ruleset object.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * The name of this ruleset object.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The release date of this version in rfc 3339 / iso 8601 format.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * This is the setter method to the attribute.
     * The release date of this version in rfc 3339 / iso 8601 format.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param releaseDate set the releaseDate.
     */
    public void setReleaseDate(String  releaseDate) {
        this.releaseDate = releaseDate;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Waf restricted file extensions.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return restrictedExtensions
     */
    public List<String> getRestrictedExtensions() {
        return restrictedExtensions;
    }

    /**
     * This is the setter method. this will set the restrictedExtensions
     * Waf restricted file extensions.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return restrictedExtensions
     */
    public void setRestrictedExtensions(List<String>  restrictedExtensions) {
        this.restrictedExtensions = restrictedExtensions;
    }

    /**
     * This is the setter method this will set the restrictedExtensions
     * Waf restricted file extensions.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return restrictedExtensions
     */
    public WafCRS addRestrictedExtensionsItem(String restrictedExtensionsItem) {
      if (this.restrictedExtensions == null) {
        this.restrictedExtensions = new ArrayList<String>();
      }
      this.restrictedExtensions.add(restrictedExtensionsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Waf restricted http headers.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return restrictedHeaders
     */
    public List<String> getRestrictedHeaders() {
        return restrictedHeaders;
    }

    /**
     * This is the setter method. this will set the restrictedHeaders
     * Waf restricted http headers.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return restrictedHeaders
     */
    public void setRestrictedHeaders(List<String>  restrictedHeaders) {
        this.restrictedHeaders = restrictedHeaders;
    }

    /**
     * This is the setter method this will set the restrictedHeaders
     * Waf restricted http headers.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return restrictedHeaders
     */
    public WafCRS addRestrictedHeadersItem(String restrictedHeadersItem) {
      if (this.restrictedHeaders == null) {
        this.restrictedHeaders = new ArrayList<String>();
      }
      this.restrictedHeaders.add(restrictedHeadersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant that this object belongs to.
     * It is a reference to an object of type tenant.
     * Field introduced in 18.2.1.
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
     * Field introduced in 18.2.1.
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
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The version of this ruleset object.
     * Field introduced in 18.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * The version of this ruleset object.
     * Field introduced in 18.1.1.
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
      WafCRS objWafCRS = (WafCRS) o;
      return   Objects.equals(this.uuid, objWafCRS.uuid)&&
  Objects.equals(this.version, objWafCRS.version)&&
  Objects.equals(this.releaseDate, objWafCRS.releaseDate)&&
  Objects.equals(this.description, objWafCRS.description)&&
  Objects.equals(this.groups, objWafCRS.groups)&&
  Objects.equals(this.name, objWafCRS.name)&&
  Objects.equals(this.tenantRef, objWafCRS.tenantRef)&&
  Objects.equals(this.integrity, objWafCRS.integrity)&&
  Objects.equals(this.markers, objWafCRS.markers)&&
  Objects.equals(this.files, objWafCRS.files)&&
  Objects.equals(this.restrictedExtensions, objWafCRS.restrictedExtensions)&&
  Objects.equals(this.restrictedHeaders, objWafCRS.restrictedHeaders)&&
  Objects.equals(this.allowedRequestContentTypeCharsets, objWafCRS.allowedRequestContentTypeCharsets)&&
  Objects.equals(this.integrityValues, objWafCRS.integrityValues);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafCRS {\n");
                  sb.append("    allowedRequestContentTypeCharsets: ").append(toIndentedString(allowedRequestContentTypeCharsets)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    files: ").append(toIndentedString(files)).append("\n");
                        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
                        sb.append("    integrity: ").append(toIndentedString(integrity)).append("\n");
                        sb.append("    integrityValues: ").append(toIndentedString(integrityValues)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
                        sb.append("    restrictedExtensions: ").append(toIndentedString(restrictedExtensions)).append("\n");
                        sb.append("    restrictedHeaders: ").append(toIndentedString(restrictedHeaders)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
