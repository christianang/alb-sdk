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
 * The EmailConfiguration is a POJO class extends AviRestResource that used for creating
 * EmailConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmailConfiguration  {
    @JsonProperty("auth_password")
    private String authPassword;

    @JsonProperty("auth_username")
    private String authUsername;

    @JsonProperty("disable_tls")
    private Boolean disableTls = false;

    @JsonProperty("email_timezone")
    private String emailTimezone;

    @JsonProperty("from_email")
    private String fromEmail = "admin@avicontroller.net";

    @JsonProperty("from_name")
    private String fromName;

    @JsonProperty("mail_server_name")
    private String mailServerName = "localhost";

    @JsonProperty("mail_server_port")
    private Integer mailServerPort = 25;

    @JsonProperty("smtp_type")
    private String smtpType = "SMTP_LOCAL_HOST";



    /**
     * This is the getter method this will return the attribute value.
     * Password for mail server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authPassword
     */
    public String getAuthPassword() {
        return authPassword;
    }

    /**
     * This is the setter method to the attribute.
     * Password for mail server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authPassword set the authPassword.
     */
    public void setAuthPassword(String  authPassword) {
        this.authPassword = authPassword;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Username for mail server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authUsername
     */
    public String getAuthUsername() {
        return authUsername;
    }

    /**
     * This is the setter method to the attribute.
     * Username for mail server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authUsername set the authUsername.
     */
    public void setAuthUsername(String  authUsername) {
        this.authUsername = authUsername;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When set, disables tls on the connection to the mail server.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return disableTls
     */
    public Boolean getDisableTls() {
        return disableTls;
    }

    /**
     * This is the setter method to the attribute.
     * When set, disables tls on the connection to the mail server.
     * Field introduced in 17.2.12, 18.1.3, 18.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param disableTls set the disableTls.
     */
    public void setDisableTls(Boolean  disableTls) {
        this.disableTls = disableTls;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timezone for timestamps in alert emails.
     * Enum options - UTC, AFRICA_ABIDJAN, AFRICA_ACCRA, AFRICA_ADDIS_ABABA, AFRICA_ALGIERS, AFRICA_ASMARA, AFRICA_ASMERA, AFRICA_BAMAKO, AFRICA_BANGUI,
     * AFRICA_BANJUL, AFRICA_BISSAU, AFRICA_BLANTYRE, AFRICA_BRAZZAVILLE, AFRICA_BUJUMBURA, AFRICA_CAIRO, AFRICA_CASABLANCA, AFRICA_CEUTA,
     * AFRICA_CONAKRY, AFRICA_DAKAR, AFRICA_DAR_ES_SALAAM...
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return emailTimezone
     */
    public String getEmailTimezone() {
        return emailTimezone;
    }

    /**
     * This is the setter method to the attribute.
     * Timezone for timestamps in alert emails.
     * Enum options - UTC, AFRICA_ABIDJAN, AFRICA_ACCRA, AFRICA_ADDIS_ABABA, AFRICA_ALGIERS, AFRICA_ASMARA, AFRICA_ASMERA, AFRICA_BAMAKO, AFRICA_BANGUI,
     * AFRICA_BANJUL, AFRICA_BISSAU, AFRICA_BLANTYRE, AFRICA_BRAZZAVILLE, AFRICA_BUJUMBURA, AFRICA_CAIRO, AFRICA_CASABLANCA, AFRICA_CEUTA,
     * AFRICA_CONAKRY, AFRICA_DAKAR, AFRICA_DAR_ES_SALAAM...
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param emailTimezone set the emailTimezone.
     */
    public void setEmailTimezone(String  emailTimezone) {
        this.emailTimezone = emailTimezone;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Email address in from field.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "admin@avicontroller.net".
     * @return fromEmail
     */
    public String getFromEmail() {
        return fromEmail;
    }

    /**
     * This is the setter method to the attribute.
     * Email address in from field.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "admin@avicontroller.net".
     * @param fromEmail set the fromEmail.
     */
    public void setFromEmail(String  fromEmail) {
        this.fromEmail = fromEmail;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Friendly name in from field.
     * Field introduced in 21.1.4, 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fromName
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * This is the setter method to the attribute.
     * Friendly name in from field.
     * Field introduced in 21.1.4, 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fromName set the fromName.
     */
    public void setFromName(String  fromName) {
        this.fromName = fromName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Mail server fqdn or ip(v4/v6) address.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "localhost".
     * @return mailServerName
     */
    public String getMailServerName() {
        return mailServerName;
    }

    /**
     * This is the setter method to the attribute.
     * Mail server fqdn or ip(v4/v6) address.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "localhost".
     * @param mailServerName set the mailServerName.
     */
    public void setMailServerName(String  mailServerName) {
        this.mailServerName = mailServerName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Mail server port.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 25.
     * @return mailServerPort
     */
    public Integer getMailServerPort() {
        return mailServerPort;
    }

    /**
     * This is the setter method to the attribute.
     * Mail server port.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 25.
     * @param mailServerPort set the mailServerPort.
     */
    public void setMailServerPort(Integer  mailServerPort) {
        this.mailServerPort = mailServerPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Type of smtp mail service.
     * Enum options - SMTP_NONE, SMTP_LOCAL_HOST, SMTP_SERVER, SMTP_ANONYMOUS_SERVER.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SMTP_LOCAL_HOST".
     * @return smtpType
     */
    public String getSmtpType() {
        return smtpType;
    }

    /**
     * This is the setter method to the attribute.
     * Type of smtp mail service.
     * Enum options - SMTP_NONE, SMTP_LOCAL_HOST, SMTP_SERVER, SMTP_ANONYMOUS_SERVER.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SMTP_LOCAL_HOST".
     * @param smtpType set the smtpType.
     */
    public void setSmtpType(String  smtpType) {
        this.smtpType = smtpType;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      EmailConfiguration objEmailConfiguration = (EmailConfiguration) o;
      return   Objects.equals(this.smtpType, objEmailConfiguration.smtpType)&&
  Objects.equals(this.fromEmail, objEmailConfiguration.fromEmail)&&
  Objects.equals(this.mailServerName, objEmailConfiguration.mailServerName)&&
  Objects.equals(this.mailServerPort, objEmailConfiguration.mailServerPort)&&
  Objects.equals(this.authUsername, objEmailConfiguration.authUsername)&&
  Objects.equals(this.authPassword, objEmailConfiguration.authPassword)&&
  Objects.equals(this.disableTls, objEmailConfiguration.disableTls)&&
  Objects.equals(this.emailTimezone, objEmailConfiguration.emailTimezone)&&
  Objects.equals(this.fromName, objEmailConfiguration.fromName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class EmailConfiguration {\n");
                  sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
                        sb.append("    authUsername: ").append(toIndentedString(authUsername)).append("\n");
                        sb.append("    disableTls: ").append(toIndentedString(disableTls)).append("\n");
                        sb.append("    emailTimezone: ").append(toIndentedString(emailTimezone)).append("\n");
                        sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
                        sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
                        sb.append("    mailServerName: ").append(toIndentedString(mailServerName)).append("\n");
                        sb.append("    mailServerPort: ").append(toIndentedString(mailServerPort)).append("\n");
                        sb.append("    smtpType: ").append(toIndentedString(smtpType)).append("\n");
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
