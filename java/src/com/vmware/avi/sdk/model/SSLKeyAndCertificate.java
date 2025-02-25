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
 * The SSLKeyAndCertificate is a POJO class extends AviRestResource that used for creating
 * SSLKeyAndCertificate.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSLKeyAndCertificate extends AviRestResource  {
    @JsonProperty("ca_certs")
    private List<CertificateAuthority> caCerts;

    @JsonProperty("certificate")
    private SSLCertificate certificate;

    @JsonProperty("certificate_base64")
    private Boolean certificateBase64 = false;

    @JsonProperty("certificate_management_profile_ref")
    private String certificateManagementProfileRef;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("dynamic_params")
    private List<CustomParams> dynamicParams;

    @JsonProperty("enable_ocsp_stapling")
    private Boolean enableOcspStapling = false;

    @JsonProperty("enckey_base64")
    private String enckeyBase64;

    @JsonProperty("enckey_name")
    private String enckeyName;

    @JsonProperty("format")
    private String format = "SSL_PEM";

    @JsonProperty("hardwaresecuritymodulegroup_ref")
    private String hardwaresecuritymodulegroupRef;

    @JsonProperty("import_key_to_hsm")
    private Boolean importKeyToHsm = false;

    @JsonProperty("is_federated")
    private Boolean isFederated = false;

    @JsonProperty("key")
    private String key;

    @JsonProperty("key_base64")
    private Boolean keyBase64 = false;

    @JsonProperty("key_params")
    private SSLKeyParams keyParams;

    @JsonProperty("key_passphrase")
    private String keyPassphrase;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ocsp_config")
    private OCSPConfig ocspConfig;

    @JsonProperty("ocsp_error_status")
    private String ocspErrorStatus;

    @JsonProperty("ocsp_responder_url_list_from_certs")
    private List<String> ocspResponderUrlListFromCerts;

    @JsonProperty("ocsp_response_info")
    private OCSPResponseInfo ocspResponseInfo;

    @JsonProperty("status")
    private String status = "SSL_CERTIFICATE_FINISHED";

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
     * Ca certificates in certificate chain.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caCerts
     */
    public List<CertificateAuthority> getCaCerts() {
        return caCerts;
    }

    /**
     * This is the setter method. this will set the caCerts
     * Ca certificates in certificate chain.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caCerts
     */
    public void setCaCerts(List<CertificateAuthority>  caCerts) {
        this.caCerts = caCerts;
    }

    /**
     * This is the setter method this will set the caCerts
     * Ca certificates in certificate chain.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caCerts
     */
    public SSLKeyAndCertificate addCaCertsItem(CertificateAuthority caCertsItem) {
      if (this.caCerts == null) {
        this.caCerts = new ArrayList<CertificateAuthority>();
      }
      this.caCerts.add(caCertsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return certificate
     */
    public SSLCertificate getCertificate() {
        return certificate;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param certificate set the certificate.
     */
    public void setCertificate(SSLCertificate certificate) {
        this.certificate = certificate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * States if the certificate is base64 encoded.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return certificateBase64
     */
    public Boolean getCertificateBase64() {
        return certificateBase64;
    }

    /**
     * This is the setter method to the attribute.
     * States if the certificate is base64 encoded.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param certificateBase64 set the certificateBase64.
     */
    public void setCertificateBase64(Boolean  certificateBase64) {
        this.certificateBase64 = certificateBase64;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type certificatemanagementprofile.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return certificateManagementProfileRef
     */
    public String getCertificateManagementProfileRef() {
        return certificateManagementProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type certificatemanagementprofile.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param certificateManagementProfileRef set the certificateManagementProfileRef.
     */
    public void setCertificateManagementProfileRef(String  certificateManagementProfileRef) {
        this.certificateManagementProfileRef = certificateManagementProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Creator name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This is the setter method to the attribute.
     * Creator name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param createdBy set the createdBy.
     */
    public void setCreatedBy(String  createdBy) {
        this.createdBy = createdBy;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Dynamic parameters needed for certificate management profile.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dynamicParams
     */
    public List<CustomParams> getDynamicParams() {
        return dynamicParams;
    }

    /**
     * This is the setter method. this will set the dynamicParams
     * Dynamic parameters needed for certificate management profile.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dynamicParams
     */
    public void setDynamicParams(List<CustomParams>  dynamicParams) {
        this.dynamicParams = dynamicParams;
    }

    /**
     * This is the setter method this will set the dynamicParams
     * Dynamic parameters needed for certificate management profile.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dynamicParams
     */
    public SSLKeyAndCertificate addDynamicParamsItem(CustomParams dynamicParamsItem) {
      if (this.dynamicParams == null) {
        this.dynamicParams = new ArrayList<CustomParams>();
      }
      this.dynamicParams.add(dynamicParamsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enables ocsp stapling.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableOcspStapling
     */
    public Boolean getEnableOcspStapling() {
        return enableOcspStapling;
    }

    /**
     * This is the setter method to the attribute.
     * Enables ocsp stapling.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- false), basic edition(allowed values- false), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableOcspStapling set the enableOcspStapling.
     */
    public void setEnableOcspStapling(Boolean  enableOcspStapling) {
        this.enableOcspStapling = enableOcspStapling;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Encrypted private key corresponding to the private key (e.g.
     * Those generated by an hsm such as thales nshield).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enckeyBase64
     */
    public String getEnckeyBase64() {
        return enckeyBase64;
    }

    /**
     * This is the setter method to the attribute.
     * Encrypted private key corresponding to the private key (e.g.
     * Those generated by an hsm such as thales nshield).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enckeyBase64 set the enckeyBase64.
     */
    public void setEnckeyBase64(String  enckeyBase64) {
        this.enckeyBase64 = enckeyBase64;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the encrypted private key (e.g.
     * Those generated by an hsm such as thales nshield).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enckeyName
     */
    public String getEnckeyName() {
        return enckeyName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the encrypted private key (e.g.
     * Those generated by an hsm such as thales nshield).
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enckeyName set the enckeyName.
     */
    public void setEnckeyName(String  enckeyName) {
        this.enckeyName = enckeyName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Format of the key/certificate file.
     * Enum options - SSL_PEM, SSL_PKCS12.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_PEM".
     * @return format
     */
    public String getFormat() {
        return format;
    }

    /**
     * This is the setter method to the attribute.
     * Format of the key/certificate file.
     * Enum options - SSL_PEM, SSL_PKCS12.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_PEM".
     * @param format set the format.
     */
    public void setFormat(String  format) {
        this.format = format;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type hardwaresecuritymodulegroup.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hardwaresecuritymodulegroupRef
     */
    public String getHardwaresecuritymodulegroupRef() {
        return hardwaresecuritymodulegroupRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type hardwaresecuritymodulegroup.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hardwaresecuritymodulegroupRef set the hardwaresecuritymodulegroupRef.
     */
    public void setHardwaresecuritymodulegroupRef(String  hardwaresecuritymodulegroupRef) {
        this.hardwaresecuritymodulegroupRef = hardwaresecuritymodulegroupRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flag to enable private key import to hsm while importing the certificate.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return importKeyToHsm
     */
    public Boolean getImportKeyToHsm() {
        return importKeyToHsm;
    }

    /**
     * This is the setter method to the attribute.
     * Flag to enable private key import to hsm while importing the certificate.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param importKeyToHsm set the importKeyToHsm.
     */
    public void setImportKeyToHsm(Boolean  importKeyToHsm) {
        this.importKeyToHsm = importKeyToHsm;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It specifies whether the object has to be replicated to the gslb followers.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return isFederated
     */
    public Boolean getIsFederated() {
        return isFederated;
    }

    /**
     * This is the setter method to the attribute.
     * It specifies whether the object has to be replicated to the gslb followers.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param isFederated set the isFederated.
     */
    public void setIsFederated(Boolean  isFederated) {
        this.isFederated = isFederated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Private key.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * This is the setter method to the attribute.
     * Private key.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param key set the key.
     */
    public void setKey(String  key) {
        this.key = key;
    }

    /**
     * This is the getter method this will return the attribute value.
     * States if the private key is base64 encoded.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return keyBase64
     */
    public Boolean getKeyBase64() {
        return keyBase64;
    }

    /**
     * This is the setter method to the attribute.
     * States if the private key is base64 encoded.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param keyBase64 set the keyBase64.
     */
    public void setKeyBase64(Boolean  keyBase64) {
        this.keyBase64 = keyBase64;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return keyParams
     */
    public SSLKeyParams getKeyParams() {
        return keyParams;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param keyParams set the keyParams.
     */
    public void setKeyParams(SSLKeyParams keyParams) {
        this.keyParams = keyParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Passphrase used to encrypt the private key.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return keyPassphrase
     */
    public String getKeyPassphrase() {
        return keyPassphrase;
    }

    /**
     * This is the setter method to the attribute.
     * Passphrase used to encrypt the private key.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param keyPassphrase set the keyPassphrase.
     */
    public void setKeyPassphrase(String  keyPassphrase) {
        this.keyPassphrase = keyPassphrase;
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
    public SSLKeyAndCertificate addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configuration related to ocsp.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ocspConfig
     */
    public OCSPConfig getOcspConfig() {
        return ocspConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Configuration related to ocsp.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ocspConfig set the ocspConfig.
     */
    public void setOcspConfig(OCSPConfig ocspConfig) {
        this.ocspConfig = ocspConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error reported during ocsp status query.
     * Enum options - OCSP_ERR_CERTSTATUS_GOOD, OCSP_ERR_CERTSTATUS_REVOKED, OCSP_ERR_CERTSTATUS_UNKNOWN, OCSP_ERR_CERTSTATUS_SERVERFAIL_ERR,
     * OCSP_ERR_CERTSTATUS_JOBDB, OCSP_ERR_CERTSTATUS_DISABLED, OCSP_ERR_CERTSTATUS_GETCERT, OCSP_ERR_CERTSTATUS_NONVSCERT,
     * OCSP_ERR_CERTSTATUS_SELFSIGNED, OCSP_ERR_CERTSTATUS_CERTFINISH, OCSP_ERR_CERTSTATUS_CACERT, OCSP_ERR_CERTSTATUS_REQUEST,
     * OCSP_ERR_CERTSTATUS_ISSUER_REVOKED, OCSP_ERR_CERTSTATUS_PARSE_CERT, OCSP_ERR_CERTSTATUS_HTTP_REQ, OCSP_ERR_CERTSTATUS_URL_LIST,
     * OCSP_ERR_CERTSTATUS_HTTP_SEND, OCSP_ERR_CERTSTATUS_HTTP_RECV, OCSP_ERR_CERTSTATUS_HTTP_RESP.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- ocsp_err_certstatus_disabled), basic edition(allowed values-
     * ocsp_err_certstatus_disabled), enterprise with cloud services edition.
     * @return ocspErrorStatus
     */
    public String getOcspErrorStatus() {
        return ocspErrorStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Error reported during ocsp status query.
     * Enum options - OCSP_ERR_CERTSTATUS_GOOD, OCSP_ERR_CERTSTATUS_REVOKED, OCSP_ERR_CERTSTATUS_UNKNOWN, OCSP_ERR_CERTSTATUS_SERVERFAIL_ERR,
     * OCSP_ERR_CERTSTATUS_JOBDB, OCSP_ERR_CERTSTATUS_DISABLED, OCSP_ERR_CERTSTATUS_GETCERT, OCSP_ERR_CERTSTATUS_NONVSCERT,
     * OCSP_ERR_CERTSTATUS_SELFSIGNED, OCSP_ERR_CERTSTATUS_CERTFINISH, OCSP_ERR_CERTSTATUS_CACERT, OCSP_ERR_CERTSTATUS_REQUEST,
     * OCSP_ERR_CERTSTATUS_ISSUER_REVOKED, OCSP_ERR_CERTSTATUS_PARSE_CERT, OCSP_ERR_CERTSTATUS_HTTP_REQ, OCSP_ERR_CERTSTATUS_URL_LIST,
     * OCSP_ERR_CERTSTATUS_HTTP_SEND, OCSP_ERR_CERTSTATUS_HTTP_RECV, OCSP_ERR_CERTSTATUS_HTTP_RESP.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- ocsp_err_certstatus_disabled), basic edition(allowed values-
     * ocsp_err_certstatus_disabled), enterprise with cloud services edition.
     * @param ocspErrorStatus set the ocspErrorStatus.
     */
    public void setOcspErrorStatus(String  ocspErrorStatus) {
        this.ocspErrorStatus = ocspErrorStatus;
    }
    /**
     * This is the getter method this will return the attribute value.
     * This is an internal field to store the ocsp responder urls contained in the certificate.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * @return ocspResponderUrlListFromCerts
     */
    public List<String> getOcspResponderUrlListFromCerts() {
        return ocspResponderUrlListFromCerts;
    }

    /**
     * This is the setter method. this will set the ocspResponderUrlListFromCerts
     * This is an internal field to store the ocsp responder urls contained in the certificate.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * @return ocspResponderUrlListFromCerts
     */
    public void setOcspResponderUrlListFromCerts(List<String>  ocspResponderUrlListFromCerts) {
        this.ocspResponderUrlListFromCerts = ocspResponderUrlListFromCerts;
    }

    /**
     * This is the setter method this will set the ocspResponderUrlListFromCerts
     * This is an internal field to store the ocsp responder urls contained in the certificate.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * @return ocspResponderUrlListFromCerts
     */
    public SSLKeyAndCertificate addOcspResponderUrlListFromCertsItem(String ocspResponderUrlListFromCertsItem) {
      if (this.ocspResponderUrlListFromCerts == null) {
        this.ocspResponderUrlListFromCerts = new ArrayList<String>();
      }
      this.ocspResponderUrlListFromCerts.add(ocspResponderUrlListFromCertsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Information related to ocsp response.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * @return ocspResponseInfo
     */
    public OCSPResponseInfo getOcspResponseInfo() {
        return ocspResponseInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Information related to ocsp response.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * @param ocspResponseInfo set the ocspResponseInfo.
     */
    public void setOcspResponseInfo(OCSPResponseInfo ocspResponseInfo) {
        this.ocspResponseInfo = ocspResponseInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - SSL_CERTIFICATE_FINISHED, SSL_CERTIFICATE_PENDING.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_CERTIFICATE_FINISHED".
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - SSL_CERTIFICATE_FINISHED, SSL_CERTIFICATE_PENDING.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SSL_CERTIFICATE_FINISHED".
     * @param status set the status.
     */
    public void setStatus(String  status) {
        this.status = status;
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
     * Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
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
      SSLKeyAndCertificate objSSLKeyAndCertificate = (SSLKeyAndCertificate) o;
      return   Objects.equals(this.uuid, objSSLKeyAndCertificate.uuid)&&
  Objects.equals(this.name, objSSLKeyAndCertificate.name)&&
  Objects.equals(this.type, objSSLKeyAndCertificate.type)&&
  Objects.equals(this.certificate, objSSLKeyAndCertificate.certificate)&&
  Objects.equals(this.keyParams, objSSLKeyAndCertificate.keyParams)&&
  Objects.equals(this.key, objSSLKeyAndCertificate.key)&&
  Objects.equals(this.status, objSSLKeyAndCertificate.status)&&
  Objects.equals(this.caCerts, objSSLKeyAndCertificate.caCerts)&&
  Objects.equals(this.enckeyBase64, objSSLKeyAndCertificate.enckeyBase64)&&
  Objects.equals(this.enckeyName, objSSLKeyAndCertificate.enckeyName)&&
  Objects.equals(this.hardwaresecuritymodulegroupRef, objSSLKeyAndCertificate.hardwaresecuritymodulegroupRef)&&
  Objects.equals(this.tenantRef, objSSLKeyAndCertificate.tenantRef)&&
  Objects.equals(this.certificateManagementProfileRef, objSSLKeyAndCertificate.certificateManagementProfileRef)&&
  Objects.equals(this.dynamicParams, objSSLKeyAndCertificate.dynamicParams)&&
  Objects.equals(this.createdBy, objSSLKeyAndCertificate.createdBy)&&
  Objects.equals(this.format, objSSLKeyAndCertificate.format)&&
  Objects.equals(this.keyPassphrase, objSSLKeyAndCertificate.keyPassphrase)&&
  Objects.equals(this.certificateBase64, objSSLKeyAndCertificate.certificateBase64)&&
  Objects.equals(this.keyBase64, objSSLKeyAndCertificate.keyBase64)&&
  Objects.equals(this.enableOcspStapling, objSSLKeyAndCertificate.enableOcspStapling)&&
  Objects.equals(this.ocspResponderUrlListFromCerts, objSSLKeyAndCertificate.ocspResponderUrlListFromCerts)&&
  Objects.equals(this.ocspConfig, objSSLKeyAndCertificate.ocspConfig)&&
  Objects.equals(this.ocspResponseInfo, objSSLKeyAndCertificate.ocspResponseInfo)&&
  Objects.equals(this.ocspErrorStatus, objSSLKeyAndCertificate.ocspErrorStatus)&&
  Objects.equals(this.markers, objSSLKeyAndCertificate.markers)&&
  Objects.equals(this.importKeyToHsm, objSSLKeyAndCertificate.importKeyToHsm)&&
  Objects.equals(this.isFederated, objSSLKeyAndCertificate.isFederated);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SSLKeyAndCertificate {\n");
                  sb.append("    caCerts: ").append(toIndentedString(caCerts)).append("\n");
                        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
                        sb.append("    certificateBase64: ").append(toIndentedString(certificateBase64)).append("\n");
                        sb.append("    certificateManagementProfileRef: ").append(toIndentedString(certificateManagementProfileRef)).append("\n");
                        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
                        sb.append("    dynamicParams: ").append(toIndentedString(dynamicParams)).append("\n");
                        sb.append("    enableOcspStapling: ").append(toIndentedString(enableOcspStapling)).append("\n");
                        sb.append("    enckeyBase64: ").append(toIndentedString(enckeyBase64)).append("\n");
                        sb.append("    enckeyName: ").append(toIndentedString(enckeyName)).append("\n");
                        sb.append("    format: ").append(toIndentedString(format)).append("\n");
                        sb.append("    hardwaresecuritymodulegroupRef: ").append(toIndentedString(hardwaresecuritymodulegroupRef)).append("\n");
                        sb.append("    importKeyToHsm: ").append(toIndentedString(importKeyToHsm)).append("\n");
                        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
                        sb.append("    key: ").append(toIndentedString(key)).append("\n");
                        sb.append("    keyBase64: ").append(toIndentedString(keyBase64)).append("\n");
                        sb.append("    keyParams: ").append(toIndentedString(keyParams)).append("\n");
                        sb.append("    keyPassphrase: ").append(toIndentedString(keyPassphrase)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    ocspConfig: ").append(toIndentedString(ocspConfig)).append("\n");
                        sb.append("    ocspErrorStatus: ").append(toIndentedString(ocspErrorStatus)).append("\n");
                        sb.append("    ocspResponderUrlListFromCerts: ").append(toIndentedString(ocspResponderUrlListFromCerts)).append("\n");
                        sb.append("    ocspResponseInfo: ").append(toIndentedString(ocspResponseInfo)).append("\n");
                        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
