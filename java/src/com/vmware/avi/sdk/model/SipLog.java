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
 * The SipLog is a POJO class extends AviRestResource that used for creating
 * SipLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SipLog  {
    @JsonProperty("server_protocol")
    private String serverProtocol;

    @JsonProperty("sip_callid_hdr")
    private String sipCallidHdr;

    @JsonProperty("sip_contact_hdr")
    private String sipContactHdr;

    @JsonProperty("sip_from_hdr")
    private String sipFromHdr;

    @JsonProperty("sip_messages")
    private List<SipMessage> sipMessages;

    @JsonProperty("sip_to_hdr")
    private String sipToHdr;



    /**
     * This is the getter method this will return the attribute value.
     * Server connection protocol type.
     * Enum options - PROTOCOL_ICMP, PROTOCOL_TCP, PROTOCOL_UDP, PROTOCOL_SCTP.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverProtocol
     */
    public String getServerProtocol() {
        return serverProtocol;
    }

    /**
     * This is the setter method to the attribute.
     * Server connection protocol type.
     * Enum options - PROTOCOL_ICMP, PROTOCOL_TCP, PROTOCOL_UDP, PROTOCOL_SCTP.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverProtocol set the serverProtocol.
     */
    public void setServerProtocol(String  serverProtocol) {
        this.serverProtocol = serverProtocol;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sip callid header.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sipCallidHdr
     */
    public String getSipCallidHdr() {
        return sipCallidHdr;
    }

    /**
     * This is the setter method to the attribute.
     * Sip callid header.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sipCallidHdr set the sipCallidHdr.
     */
    public void setSipCallidHdr(String  sipCallidHdr) {
        this.sipCallidHdr = sipCallidHdr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Client's sip contact header.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sipContactHdr
     */
    public String getSipContactHdr() {
        return sipContactHdr;
    }

    /**
     * This is the setter method to the attribute.
     * Client's sip contact header.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sipContactHdr set the sipContactHdr.
     */
    public void setSipContactHdr(String  sipContactHdr) {
        this.sipContactHdr = sipContactHdr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sip from header.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sipFromHdr
     */
    public String getSipFromHdr() {
        return sipFromHdr;
    }

    /**
     * This is the setter method to the attribute.
     * Sip from header.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sipFromHdr set the sipFromHdr.
     */
    public void setSipFromHdr(String  sipFromHdr) {
        this.sipFromHdr = sipFromHdr;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Sip messages.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sipMessages
     */
    public List<SipMessage> getSipMessages() {
        return sipMessages;
    }

    /**
     * This is the setter method. this will set the sipMessages
     * Sip messages.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sipMessages
     */
    public void setSipMessages(List<SipMessage>  sipMessages) {
        this.sipMessages = sipMessages;
    }

    /**
     * This is the setter method this will set the sipMessages
     * Sip messages.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sipMessages
     */
    public SipLog addSipMessagesItem(SipMessage sipMessagesItem) {
      if (this.sipMessages == null) {
        this.sipMessages = new ArrayList<SipMessage>();
      }
      this.sipMessages.add(sipMessagesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sip to header.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sipToHdr
     */
    public String getSipToHdr() {
        return sipToHdr;
    }

    /**
     * This is the setter method to the attribute.
     * Sip to header.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sipToHdr set the sipToHdr.
     */
    public void setSipToHdr(String  sipToHdr) {
        this.sipToHdr = sipToHdr;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SipLog objSipLog = (SipLog) o;
      return   Objects.equals(this.sipMessages, objSipLog.sipMessages)&&
  Objects.equals(this.serverProtocol, objSipLog.serverProtocol)&&
  Objects.equals(this.sipCallidHdr, objSipLog.sipCallidHdr)&&
  Objects.equals(this.sipFromHdr, objSipLog.sipFromHdr)&&
  Objects.equals(this.sipToHdr, objSipLog.sipToHdr)&&
  Objects.equals(this.sipContactHdr, objSipLog.sipContactHdr);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SipLog {\n");
                  sb.append("    serverProtocol: ").append(toIndentedString(serverProtocol)).append("\n");
                        sb.append("    sipCallidHdr: ").append(toIndentedString(sipCallidHdr)).append("\n");
                        sb.append("    sipContactHdr: ").append(toIndentedString(sipContactHdr)).append("\n");
                        sb.append("    sipFromHdr: ").append(toIndentedString(sipFromHdr)).append("\n");
                        sb.append("    sipMessages: ").append(toIndentedString(sipMessages)).append("\n");
                        sb.append("    sipToHdr: ").append(toIndentedString(sipToHdr)).append("\n");
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
