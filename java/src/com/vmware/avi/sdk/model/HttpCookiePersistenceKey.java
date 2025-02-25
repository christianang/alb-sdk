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
 * The HttpCookiePersistenceKey is a POJO class extends AviRestResource that used for creating
 * HttpCookiePersistenceKey.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HttpCookiePersistenceKey  {
    @JsonProperty("aes_key")
    private String aesKey;

    @JsonProperty("hmac_key")
    private String hmacKey;

    @JsonProperty("name")
    private String name;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return aesKey
     */
    public String getAesKey() {
        return aesKey;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param aesKey set the aesKey.
     */
    public void setAesKey(String  aesKey) {
        this.aesKey = aesKey;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hmacKey
     */
    public String getHmacKey() {
        return hmacKey;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hmacKey set the hmacKey.
     */
    public void setHmacKey(String  hmacKey) {
        this.hmacKey = hmacKey;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name to use for cookie encryption.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name to use for cookie encryption.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HttpCookiePersistenceKey objHttpCookiePersistenceKey = (HttpCookiePersistenceKey) o;
      return   Objects.equals(this.name, objHttpCookiePersistenceKey.name)&&
  Objects.equals(this.aesKey, objHttpCookiePersistenceKey.aesKey)&&
  Objects.equals(this.hmacKey, objHttpCookiePersistenceKey.hmacKey);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HttpCookiePersistenceKey {\n");
                  sb.append("    aesKey: ").append(toIndentedString(aesKey)).append("\n");
                        sb.append("    hmacKey: ").append(toIndentedString(hmacKey)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
