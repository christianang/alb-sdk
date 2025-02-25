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
 * The ALBServicesCaseAttachment is a POJO class extends AviRestResource that used for creating
 * ALBServicesCaseAttachment.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ALBServicesCaseAttachment  {
    @JsonProperty("attachment_name")
    private String attachmentName;

    @JsonProperty("attachment_size")
    private String attachmentSize;

    @JsonProperty("attachment_url")
    private String attachmentUrl;



    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return attachmentName
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param attachmentName set the attachmentName.
     */
    public void setAttachmentName(String  attachmentName) {
        this.attachmentName = attachmentName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return attachmentSize
     */
    public String getAttachmentSize() {
        return attachmentSize;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param attachmentSize set the attachmentSize.
     */
    public void setAttachmentSize(String  attachmentSize) {
        this.attachmentSize = attachmentSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return attachmentUrl
     */
    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param attachmentUrl set the attachmentUrl.
     */
    public void setAttachmentUrl(String  attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ALBServicesCaseAttachment objALBServicesCaseAttachment = (ALBServicesCaseAttachment) o;
      return   Objects.equals(this.attachmentName, objALBServicesCaseAttachment.attachmentName)&&
  Objects.equals(this.attachmentSize, objALBServicesCaseAttachment.attachmentSize)&&
  Objects.equals(this.attachmentUrl, objALBServicesCaseAttachment.attachmentUrl);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ALBServicesCaseAttachment {\n");
                  sb.append("    attachmentName: ").append(toIndentedString(attachmentName)).append("\n");
                        sb.append("    attachmentSize: ").append(toIndentedString(attachmentSize)).append("\n");
                        sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
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
