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
 * The GeoLocation is a POJO class extends AviRestResource that used for creating
 * GeoLocation.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeoLocation  {
    @JsonProperty("latitude")
    private Float latitude;

    @JsonProperty("longitude")
    private Float longitude;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tag")
    private String tag;



    /**
     * This is the getter method this will return the attribute value.
     * Latitude of the location.
     * This is represented as degrees.minutes.
     * The range is from -90.0 (south) to +90.0 (north).
     * Allowed values are -90.0-+90.0.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * This is the setter method to the attribute.
     * Latitude of the location.
     * This is represented as degrees.minutes.
     * The range is from -90.0 (south) to +90.0 (north).
     * Allowed values are -90.0-+90.0.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param latitude set the latitude.
     */
    public void setLatitude(Float  latitude) {
        this.latitude = latitude;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Longitude of the location.
     * This is represented as degrees.minutes.
     * The range is from -180.0 (west) to +180.0 (east).
     * Allowed values are -180.0-+180.0.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * This is the setter method to the attribute.
     * Longitude of the location.
     * This is represented as degrees.minutes.
     * The range is from -180.0 (west) to +180.0 (east).
     * Allowed values are -180.0-+180.0.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param longitude set the longitude.
     */
    public void setLongitude(Float  longitude) {
        this.longitude = longitude;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Location name in the format country/state/city.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Location name in the format country/state/city.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Location tag string - example  useast.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * This is the setter method to the attribute.
     * Location tag string - example  useast.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tag set the tag.
     */
    public void setTag(String  tag) {
        this.tag = tag;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GeoLocation objGeoLocation = (GeoLocation) o;
      return   Objects.equals(this.latitude, objGeoLocation.latitude)&&
  Objects.equals(this.longitude, objGeoLocation.longitude)&&
  Objects.equals(this.name, objGeoLocation.name)&&
  Objects.equals(this.tag, objGeoLocation.tag);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GeoLocation {\n");
                  sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
                        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
