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
 * The SamlServiceProviderNode is a POJO class extends AviRestResource that used for creating
 * SamlServiceProviderNode.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SamlServiceProviderNode  {
    @JsonProperty("entity_id")
    private String entityId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("signing_ssl_key_and_certificate_ref")
    private String signingSslKeyAndCertificateRef;

    @JsonProperty("single_signon_url")
    private String singleSignonUrl;



    /**
     * This is the getter method this will return the attribute value.
     * Globally unique entityid for this node.
     * Entity id on the idp should match this.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * This is the setter method to the attribute.
     * Globally unique entityid for this node.
     * Entity id on the idp should match this.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param entityId set the entityId.
     */
    public void setEntityId(String  entityId) {
        this.entityId = entityId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Refers to the cluster name identifier (virtual ip or fqdn).
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Refers to the cluster name identifier (virtual ip or fqdn).
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service engines will use this ssl certificate to sign assertions going to the idp.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return signingSslKeyAndCertificateRef
     */
    public String getSigningSslKeyAndCertificateRef() {
        return signingSslKeyAndCertificateRef;
    }

    /**
     * This is the setter method to the attribute.
     * Service engines will use this ssl certificate to sign assertions going to the idp.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param signingSslKeyAndCertificateRef set the signingSslKeyAndCertificateRef.
     */
    public void setSigningSslKeyAndCertificateRef(String  signingSslKeyAndCertificateRef) {
        this.signingSslKeyAndCertificateRef = signingSslKeyAndCertificateRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Single signon url to be programmed on the idp.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return singleSignonUrl
     */
    public String getSingleSignonUrl() {
        return singleSignonUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Single signon url to be programmed on the idp.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param singleSignonUrl set the singleSignonUrl.
     */
    public void setSingleSignonUrl(String  singleSignonUrl) {
        this.singleSignonUrl = singleSignonUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SamlServiceProviderNode objSamlServiceProviderNode = (SamlServiceProviderNode) o;
      return   Objects.equals(this.name, objSamlServiceProviderNode.name)&&
  Objects.equals(this.entityId, objSamlServiceProviderNode.entityId)&&
  Objects.equals(this.singleSignonUrl, objSamlServiceProviderNode.singleSignonUrl)&&
  Objects.equals(this.signingSslKeyAndCertificateRef, objSamlServiceProviderNode.signingSslKeyAndCertificateRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SamlServiceProviderNode {\n");
                  sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    signingSslKeyAndCertificateRef: ").append(toIndentedString(signingSslKeyAndCertificateRef)).append("\n");
                        sb.append("    singleSignonUrl: ").append(toIndentedString(singleSignonUrl)).append("\n");
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
