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
 * The HSMSafenetLunaServer is a POJO class extends AviRestResource that used for creating
 * HSMSafenetLunaServer.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HSMSafenetLunaServer  {
    @JsonProperty("index")
    private Integer index;

    @JsonProperty("partition_passwd")
    private String partitionPasswd;

    @JsonProperty("partition_serial_number")
    private String partitionSerialNumber;

    @JsonProperty("remote_ip")
    private String remoteIp;

    @JsonProperty("server_cert")
    private String serverCert;



    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 16.5.2,17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 16.5.2,17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param index set the index.
     */
    public void setIndex(Integer  index) {
        this.index = index;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Password of the partition assigned to this client.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return partitionPasswd
     */
    public String getPartitionPasswd() {
        return partitionPasswd;
    }

    /**
     * This is the setter method to the attribute.
     * Password of the partition assigned to this client.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param partitionPasswd set the partitionPasswd.
     */
    public void setPartitionPasswd(String  partitionPasswd) {
        this.partitionPasswd = partitionPasswd;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Serial number of the partition assigned to this client.
     * Field introduced in 16.5.2,17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return partitionSerialNumber
     */
    public String getPartitionSerialNumber() {
        return partitionSerialNumber;
    }

    /**
     * This is the setter method to the attribute.
     * Serial number of the partition assigned to this client.
     * Field introduced in 16.5.2,17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param partitionSerialNumber set the partitionSerialNumber.
     */
    public void setPartitionSerialNumber(String  partitionSerialNumber) {
        this.partitionSerialNumber = partitionSerialNumber;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ip address of the thales luna hsm device.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return remoteIp
     */
    public String getRemoteIp() {
        return remoteIp;
    }

    /**
     * This is the setter method to the attribute.
     * Ip address of the thales luna hsm device.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param remoteIp set the remoteIp.
     */
    public void setRemoteIp(String  remoteIp) {
        this.remoteIp = remoteIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ca certificate of the server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverCert
     */
    public String getServerCert() {
        return serverCert;
    }

    /**
     * This is the setter method to the attribute.
     * Ca certificate of the server.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverCert set the serverCert.
     */
    public void setServerCert(String  serverCert) {
        this.serverCert = serverCert;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HSMSafenetLunaServer objHSMSafenetLunaServer = (HSMSafenetLunaServer) o;
      return   Objects.equals(this.remoteIp, objHSMSafenetLunaServer.remoteIp)&&
  Objects.equals(this.serverCert, objHSMSafenetLunaServer.serverCert)&&
  Objects.equals(this.partitionPasswd, objHSMSafenetLunaServer.partitionPasswd)&&
  Objects.equals(this.partitionSerialNumber, objHSMSafenetLunaServer.partitionSerialNumber)&&
  Objects.equals(this.index, objHSMSafenetLunaServer.index);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HSMSafenetLunaServer {\n");
                  sb.append("    index: ").append(toIndentedString(index)).append("\n");
                        sb.append("    partitionPasswd: ").append(toIndentedString(partitionPasswd)).append("\n");
                        sb.append("    partitionSerialNumber: ").append(toIndentedString(partitionSerialNumber)).append("\n");
                        sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
                        sb.append("    serverCert: ").append(toIndentedString(serverCert)).append("\n");
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
