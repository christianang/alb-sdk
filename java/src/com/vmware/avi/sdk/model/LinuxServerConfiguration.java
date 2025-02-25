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
 * The LinuxServerConfiguration is a POJO class extends AviRestResource that used for creating
 * LinuxServerConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinuxServerConfiguration  {
    @JsonProperty("hosts")
    private List<LinuxServerHost> hosts;

    @JsonProperty("se_inband_mgmt")
    private Boolean seInbandMgmt = false;

    @JsonProperty("se_log_disk_path")
    private String seLogDiskPath;

    @JsonProperty("se_log_disk_size_GB")
    private Integer seLogDiskSizeGb = 5;

    @JsonProperty("se_sys_disk_path")
    private String seSysDiskPath;

    @JsonProperty("se_sys_disk_size_GB")
    private Integer seSysDiskSizeGb = 10;

    @JsonProperty("ssh_user_ref")
    private String sshUserRef;


    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hosts
     */
    public List<LinuxServerHost> getHosts() {
        return hosts;
    }

    /**
     * This is the setter method. this will set the hosts
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hosts
     */
    public void setHosts(List<LinuxServerHost>  hosts) {
        this.hosts = hosts;
    }

    /**
     * This is the setter method this will set the hosts
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hosts
     */
    public LinuxServerConfiguration addHostsItem(LinuxServerHost hostsItem) {
      if (this.hosts == null) {
        this.hosts = new ArrayList<LinuxServerHost>();
      }
      this.hosts.add(hostsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Flag to notify the se's in this cloud have an inband management interface, this can be overridden at se host level by setting host_attr attr_key
     * as se_inband_mgmt with value of true or false.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return seInbandMgmt
     */
    public Boolean getSeInbandMgmt() {
        return seInbandMgmt;
    }

    /**
     * This is the setter method to the attribute.
     * Flag to notify the se's in this cloud have an inband management interface, this can be overridden at se host level by setting host_attr attr_key
     * as se_inband_mgmt with value of true or false.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param seInbandMgmt set the seInbandMgmt.
     */
    public void setSeInbandMgmt(Boolean  seInbandMgmt) {
        this.seInbandMgmt = seInbandMgmt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se client logs disk path for cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seLogDiskPath
     */
    public String getSeLogDiskPath() {
        return seLogDiskPath;
    }

    /**
     * This is the setter method to the attribute.
     * Se client logs disk path for cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seLogDiskPath set the seLogDiskPath.
     */
    public void setSeLogDiskPath(String  seLogDiskPath) {
        this.seLogDiskPath = seLogDiskPath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se client log disk size for cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return seLogDiskSizeGb
     */
    public Integer getSeLogDiskSizeGb() {
        return seLogDiskSizeGb;
    }

    /**
     * This is the setter method to the attribute.
     * Se client log disk size for cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param seLogDiskSizeGb set the seLogDiskSizeGb.
     */
    public void setSeLogDiskSizeGb(Integer  seLogDiskSizeGb) {
        this.seLogDiskSizeGb = seLogDiskSizeGb;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se system logs disk path for cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seSysDiskPath
     */
    public String getSeSysDiskPath() {
        return seSysDiskPath;
    }

    /**
     * This is the setter method to the attribute.
     * Se system logs disk path for cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seSysDiskPath set the seSysDiskPath.
     */
    public void setSeSysDiskPath(String  seSysDiskPath) {
        this.seSysDiskPath = seSysDiskPath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se system logs disk size for cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return seSysDiskSizeGb
     */
    public Integer getSeSysDiskSizeGb() {
        return seSysDiskSizeGb;
    }

    /**
     * This is the setter method to the attribute.
     * Se system logs disk size for cloud.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param seSysDiskSizeGb set the seSysDiskSizeGb.
     */
    public void setSeSysDiskSizeGb(Integer  seSysDiskSizeGb) {
        this.seSysDiskSizeGb = seSysDiskSizeGb;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cloud connector user uuid for ssh to hosts.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sshUserRef
     */
    public String getSshUserRef() {
        return sshUserRef;
    }

    /**
     * This is the setter method to the attribute.
     * Cloud connector user uuid for ssh to hosts.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sshUserRef set the sshUserRef.
     */
    public void setSshUserRef(String  sshUserRef) {
        this.sshUserRef = sshUserRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LinuxServerConfiguration objLinuxServerConfiguration = (LinuxServerConfiguration) o;
      return   Objects.equals(this.hosts, objLinuxServerConfiguration.hosts)&&
  Objects.equals(this.seSysDiskPath, objLinuxServerConfiguration.seSysDiskPath)&&
  Objects.equals(this.seSysDiskSizeGb, objLinuxServerConfiguration.seSysDiskSizeGb)&&
  Objects.equals(this.seLogDiskPath, objLinuxServerConfiguration.seLogDiskPath)&&
  Objects.equals(this.seLogDiskSizeGb, objLinuxServerConfiguration.seLogDiskSizeGb)&&
  Objects.equals(this.seInbandMgmt, objLinuxServerConfiguration.seInbandMgmt)&&
  Objects.equals(this.sshUserRef, objLinuxServerConfiguration.sshUserRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LinuxServerConfiguration {\n");
                  sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
                        sb.append("    seInbandMgmt: ").append(toIndentedString(seInbandMgmt)).append("\n");
                        sb.append("    seLogDiskPath: ").append(toIndentedString(seLogDiskPath)).append("\n");
                        sb.append("    seLogDiskSizeGb: ").append(toIndentedString(seLogDiskSizeGb)).append("\n");
                        sb.append("    seSysDiskPath: ").append(toIndentedString(seSysDiskPath)).append("\n");
                        sb.append("    seSysDiskSizeGb: ").append(toIndentedString(seSysDiskSizeGb)).append("\n");
                        sb.append("    sshUserRef: ").append(toIndentedString(sshUserRef)).append("\n");
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
