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
 * The OCICredentials is a POJO class extends AviRestResource that used for creating
 * OCICredentials.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OCICredentials  {
    @JsonProperty("fingerprint")
    private String fingerprint;

    @JsonProperty("key_content")
    private String keyContent;

    @JsonProperty("pass_phrase")
    private String passPhrase;

    @JsonProperty("user")
    private String user;



    /**
     * This is the getter method this will return the attribute value.
     * Api key with respect to the public key.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * This is the setter method to the attribute.
     * Api key with respect to the public key.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fingerprint set the fingerprint.
     */
    public void setFingerprint(String  fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Private key file (pem file) content.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return keyContent
     */
    public String getKeyContent() {
        return keyContent;
    }

    /**
     * This is the setter method to the attribute.
     * Private key file (pem file) content.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param keyContent set the keyContent.
     */
    public void setKeyContent(String  keyContent) {
        this.keyContent = keyContent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pass phrase for the key.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return passPhrase
     */
    public String getPassPhrase() {
        return passPhrase;
    }

    /**
     * This is the setter method to the attribute.
     * Pass phrase for the key.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param passPhrase set the passPhrase.
     */
    public void setPassPhrase(String  passPhrase) {
        this.passPhrase = passPhrase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Oracle cloud id for the user.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * This is the setter method to the attribute.
     * Oracle cloud id for the user.
     * Field introduced in 18.2.1,18.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param user set the user.
     */
    public void setUser(String  user) {
        this.user = user;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OCICredentials objOCICredentials = (OCICredentials) o;
      return   Objects.equals(this.user, objOCICredentials.user)&&
  Objects.equals(this.keyContent, objOCICredentials.keyContent)&&
  Objects.equals(this.passPhrase, objOCICredentials.passPhrase)&&
  Objects.equals(this.fingerprint, objOCICredentials.fingerprint);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OCICredentials {\n");
                  sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
                        sb.append("    keyContent: ").append(toIndentedString(keyContent)).append("\n");
                        sb.append("    passPhrase: ").append(toIndentedString(passPhrase)).append("\n");
                        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
