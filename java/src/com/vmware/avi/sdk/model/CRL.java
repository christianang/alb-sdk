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
 * The CRL is a POJO class extends AviRestResource that used for creating
 * CRL.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CRL  {
    @JsonProperty("body")
    private String body;

    @JsonProperty("common_name")
    private String commonName;

    @JsonProperty("distinguished_name")
    private String distinguishedName;

    @JsonProperty("etag")
    private String etag;

    @JsonProperty("file_ref")
    private String fileRef;

    @JsonProperty("fingerprint")
    private String fingerprint;

    @JsonProperty("last_refreshed")
    private String lastRefreshed;

    @JsonProperty("last_update")
    private String lastUpdate;

    @JsonProperty("next_update")
    private String nextUpdate;

    @JsonProperty("server_url")
    private String serverUrl;

    @JsonProperty("text")
    private String text;

    @JsonProperty("update_interval")
    private Integer updateInterval;



    /**
     * This is the getter method this will return the attribute value.
     * Certificate revocation list from a given issuer in pem format.
     * This can either be configured directly or via the server_url.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return body
     */
    public String getBody() {
        return body;
    }

    /**
     * This is the setter method to the attribute.
     * Certificate revocation list from a given issuer in pem format.
     * This can either be configured directly or via the server_url.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param body set the body.
     */
    public void setBody(String  body) {
        this.body = body;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Common name of the issuer in the certificate revocation list.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return commonName
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * This is the setter method to the attribute.
     * Common name of the issuer in the certificate revocation list.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param commonName set the commonName.
     */
    public void setCommonName(String  commonName) {
        this.commonName = commonName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Distinguished name of the issuer in the certificate revocation list.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return distinguishedName
     */
    public String getDistinguishedName() {
        return distinguishedName;
    }

    /**
     * This is the setter method to the attribute.
     * Distinguished name of the issuer in the certificate revocation list.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param distinguishedName set the distinguishedName.
     */
    public void setDistinguishedName(String  distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cached etag to optimize the download of the crl.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return etag
     */
    public String getEtag() {
        return etag;
    }

    /**
     * This is the setter method to the attribute.
     * Cached etag to optimize the download of the crl.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param etag set the etag.
     */
    public void setEtag(String  etag) {
        this.etag = etag;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Refers to fileobject containing crl body.
     * It is a reference to an object of type fileobject.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fileRef
     */
    public String getFileRef() {
        return fileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Refers to fileobject containing crl body.
     * It is a reference to an object of type fileobject.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fileRef set the fileRef.
     */
    public void setFileRef(String  fileRef) {
        this.fileRef = fileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Fingerprint of the crl.
     * Used to avoid configuring duplicates.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * This is the setter method to the attribute.
     * Fingerprint of the crl.
     * Used to avoid configuring duplicates.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fingerprint set the fingerprint.
     */
    public void setFingerprint(String  fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Last time crl was refreshed by the system.
     * This is an internal field used by the system.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastRefreshed
     */
    public String getLastRefreshed() {
        return lastRefreshed;
    }

    /**
     * This is the setter method to the attribute.
     * Last time crl was refreshed by the system.
     * This is an internal field used by the system.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastRefreshed set the lastRefreshed.
     */
    public void setLastRefreshed(String  lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The date when this crl was last issued.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastUpdate
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This is the setter method to the attribute.
     * The date when this crl was last issued.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastUpdate set the lastUpdate.
     */
    public void setLastUpdate(String  lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The date when a newer crl will be available.
     * Also conveys the date after which the crl should be considered obsolete.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nextUpdate
     */
    public String getNextUpdate() {
        return nextUpdate;
    }

    /**
     * This is the setter method to the attribute.
     * The date when a newer crl will be available.
     * Also conveys the date after which the crl should be considered obsolete.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nextUpdate set the nextUpdate.
     */
    public void setNextUpdate(String  nextUpdate) {
        this.nextUpdate = nextUpdate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Url of a server that issues the certificate revocation list.
     * If this is configured, crl will be periodically downloaded either based on the configured update interval or the next update interval in the crl.
     * Crl itself is stored in the body.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverUrl
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Url of a server that issues the certificate revocation list.
     * If this is configured, crl will be periodically downloaded either based on the configured update interval or the next update interval in the crl.
     * Crl itself is stored in the body.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverUrl set the serverUrl.
     */
    public void setServerUrl(String  serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Certificate revocation list in plain text for readability.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * This is the setter method to the attribute.
     * Certificate revocation list in plain text for readability.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param text set the text.
     */
    public void setText(String  text) {
        this.text = text;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Interval in minutes to check for crl update.
     * If not specified, interval will be 1 day.
     * Allowed values are 30-525600.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return updateInterval
     */
    public Integer getUpdateInterval() {
        return updateInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Interval in minutes to check for crl update.
     * If not specified, interval will be 1 day.
     * Allowed values are 30-525600.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param updateInterval set the updateInterval.
     */
    public void setUpdateInterval(Integer  updateInterval) {
        this.updateInterval = updateInterval;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CRL objCRL = (CRL) o;
      return   Objects.equals(this.serverUrl, objCRL.serverUrl)&&
  Objects.equals(this.body, objCRL.body)&&
  Objects.equals(this.lastUpdate, objCRL.lastUpdate)&&
  Objects.equals(this.nextUpdate, objCRL.nextUpdate)&&
  Objects.equals(this.updateInterval, objCRL.updateInterval)&&
  Objects.equals(this.etag, objCRL.etag)&&
  Objects.equals(this.text, objCRL.text)&&
  Objects.equals(this.commonName, objCRL.commonName)&&
  Objects.equals(this.fingerprint, objCRL.fingerprint)&&
  Objects.equals(this.distinguishedName, objCRL.distinguishedName)&&
  Objects.equals(this.lastRefreshed, objCRL.lastRefreshed)&&
  Objects.equals(this.fileRef, objCRL.fileRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CRL {\n");
                  sb.append("    body: ").append(toIndentedString(body)).append("\n");
                        sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
                        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
                        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
                        sb.append("    fileRef: ").append(toIndentedString(fileRef)).append("\n");
                        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
                        sb.append("    lastRefreshed: ").append(toIndentedString(lastRefreshed)).append("\n");
                        sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
                        sb.append("    nextUpdate: ").append(toIndentedString(nextUpdate)).append("\n");
                        sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
                        sb.append("    text: ").append(toIndentedString(text)).append("\n");
                        sb.append("    updateInterval: ").append(toIndentedString(updateInterval)).append("\n");
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
