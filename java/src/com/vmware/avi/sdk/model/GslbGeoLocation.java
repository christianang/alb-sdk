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
 * The GslbGeoLocation is a POJO class extends AviRestResource that used for creating
 * GslbGeoLocation.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbGeoLocation  {
    @JsonProperty("location")
    private GeoLocation location;

    @JsonProperty("source")
    private String source;



    /**
     * This is the getter method this will return the attribute value.
     * Geographic location of the site.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return location
     */
    public GeoLocation getLocation() {
        return location;
    }

    /**
     * This is the setter method to the attribute.
     * Geographic location of the site.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param location set the location.
     */
    public void setLocation(GeoLocation location) {
        this.location = location;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field describes the source of the geolocation.
     * Enum options - GSLB_LOCATION_SRC_USER_CONFIGURED, GSLB_LOCATION_SRC_INHERIT_FROM_SITE, GSLB_LOCATION_SRC_FROM_GEODB.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * This is the setter method to the attribute.
     * This field describes the source of the geolocation.
     * Enum options - GSLB_LOCATION_SRC_USER_CONFIGURED, GSLB_LOCATION_SRC_INHERIT_FROM_SITE, GSLB_LOCATION_SRC_FROM_GEODB.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param source set the source.
     */
    public void setSource(String  source) {
        this.source = source;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GslbGeoLocation objGslbGeoLocation = (GslbGeoLocation) o;
      return   Objects.equals(this.source, objGslbGeoLocation.source)&&
  Objects.equals(this.location, objGslbGeoLocation.location);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbGeoLocation {\n");
                  sb.append("    location: ").append(toIndentedString(location)).append("\n");
                        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
