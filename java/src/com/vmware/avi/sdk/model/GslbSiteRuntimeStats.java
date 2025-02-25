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
 * The GslbSiteRuntimeStats is a POJO class extends AviRestResource that used for creating
 * GslbSiteRuntimeStats.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbSiteRuntimeStats  {
    @JsonProperty("num_file_cr_txed")
    private Integer numFileCrTxed;

    @JsonProperty("num_file_del_txed")
    private Integer numFileDelTxed;

    @JsonProperty("num_gap_cr_rxed")
    private Integer numGapCrRxed;

    @JsonProperty("num_gap_cr_txed")
    private Integer numGapCrTxed;

    @JsonProperty("num_gap_del_rxed")
    private Integer numGapDelRxed;

    @JsonProperty("num_gap_del_txed")
    private Integer numGapDelTxed;

    @JsonProperty("num_gap_upd_rxed")
    private Integer numGapUpdRxed;

    @JsonProperty("num_gap_upd_txed")
    private Integer numGapUpdTxed;

    @JsonProperty("num_geo_cr_rxed")
    private Integer numGeoCrRxed;

    @JsonProperty("num_geo_cr_txed")
    private Integer numGeoCrTxed;

    @JsonProperty("num_geo_del_rxed")
    private Integer numGeoDelRxed;

    @JsonProperty("num_geo_del_txed")
    private Integer numGeoDelTxed;

    @JsonProperty("num_geo_upd_rxed")
    private Integer numGeoUpdRxed;

    @JsonProperty("num_geo_upd_txed")
    private Integer numGeoUpdTxed;

    @JsonProperty("num_ghm_cr_rxed")
    private Integer numGhmCrRxed;

    @JsonProperty("num_ghm_cr_txed")
    private Integer numGhmCrTxed;

    @JsonProperty("num_ghm_del_rxed")
    private Integer numGhmDelRxed;

    @JsonProperty("num_ghm_del_txed")
    private Integer numGhmDelTxed;

    @JsonProperty("num_ghm_upd_rxed")
    private Integer numGhmUpdRxed;

    @JsonProperty("num_ghm_upd_txed")
    private Integer numGhmUpdTxed;

    @JsonProperty("num_gjwt_cr_rxed")
    private Integer numGjwtCrRxed;

    @JsonProperty("num_gjwt_cr_txed")
    private Integer numGjwtCrTxed;

    @JsonProperty("num_gjwt_del_rxed")
    private Integer numGjwtDelRxed;

    @JsonProperty("num_gjwt_del_txed")
    private Integer numGjwtDelTxed;

    @JsonProperty("num_gjwt_upd_rxed")
    private Integer numGjwtUpdRxed;

    @JsonProperty("num_gjwt_upd_txed")
    private Integer numGjwtUpdTxed;

    @JsonProperty("num_glb_cr_rxed")
    private Integer numGlbCrRxed;

    @JsonProperty("num_glb_cr_txed")
    private Integer numGlbCrTxed;

    @JsonProperty("num_glb_del_rxed")
    private Integer numGlbDelRxed;

    @JsonProperty("num_glb_del_txed")
    private Integer numGlbDelTxed;

    @JsonProperty("num_glb_upd_rxed")
    private Integer numGlbUpdRxed;

    @JsonProperty("num_glb_upd_txed")
    private Integer numGlbUpdTxed;

    @JsonProperty("num_gpki_cr_rxed")
    private Integer numGpkiCrRxed;

    @JsonProperty("num_gpki_cr_txed")
    private Integer numGpkiCrTxed;

    @JsonProperty("num_gpki_del_rxed")
    private Integer numGpkiDelRxed;

    @JsonProperty("num_gpki_del_txed")
    private Integer numGpkiDelTxed;

    @JsonProperty("num_gpki_upd_rxed")
    private Integer numGpkiUpdRxed;

    @JsonProperty("num_gpki_upd_txed")
    private Integer numGpkiUpdTxed;

    @JsonProperty("num_gs_cr_rxed")
    private Integer numGsCrRxed;

    @JsonProperty("num_gs_cr_txed")
    private Integer numGsCrTxed;

    @JsonProperty("num_gs_del_rxed")
    private Integer numGsDelRxed;

    @JsonProperty("num_gs_del_txed")
    private Integer numGsDelTxed;

    @JsonProperty("num_gs_upd_rxed")
    private Integer numGsUpdRxed;

    @JsonProperty("num_gs_upd_txed")
    private Integer numGsUpdTxed;

    @JsonProperty("num_gssl_cert_cr_rxed")
    private Integer numGsslCertCrRxed;

    @JsonProperty("num_gssl_cert_del_rxed")
    private Integer numGsslCertDelRxed;

    @JsonProperty("num_gssl_cert_upd_rxed")
    private Integer numGsslCertUpdRxed;

    @JsonProperty("num_gssl_cr_rxed")
    private Integer numGsslCrRxed;

    @JsonProperty("num_gssl_del_rxed")
    private Integer numGsslDelRxed;

    @JsonProperty("num_gssl_upd_rxed")
    private Integer numGsslUpdRxed;

    @JsonProperty("num_health_msgs_rxed")
    private Integer numHealthMsgsRxed;

    @JsonProperty("num_health_msgs_txed")
    private Integer numHealthMsgsTxed;

    @JsonProperty("num_of_bad_responses")
    private Integer numOfBadResponses;

    @JsonProperty("num_of_events_generated")
    private Integer numOfEventsGenerated;

    @JsonProperty("num_of_skip_outstanding_requests")
    private Integer numOfSkipOutstandingRequests;

    @JsonProperty("num_of_timeouts")
    private Integer numOfTimeouts;



    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numFileCrTxed
     */
    public Integer getNumFileCrTxed() {
        return numFileCrTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numFileCrTxed set the numFileCrTxed.
     */
    public void setNumFileCrTxed(Integer  numFileCrTxed) {
        this.numFileCrTxed = numFileCrTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numFileDelTxed
     */
    public Integer getNumFileDelTxed() {
        return numFileDelTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numFileDelTxed set the numFileDelTxed.
     */
    public void setNumFileDelTxed(Integer  numFileDelTxed) {
        this.numFileDelTxed = numFileDelTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGapCrRxed
     */
    public Integer getNumGapCrRxed() {
        return numGapCrRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGapCrRxed set the numGapCrRxed.
     */
    public void setNumGapCrRxed(Integer  numGapCrRxed) {
        this.numGapCrRxed = numGapCrRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGapCrTxed
     */
    public Integer getNumGapCrTxed() {
        return numGapCrTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGapCrTxed set the numGapCrTxed.
     */
    public void setNumGapCrTxed(Integer  numGapCrTxed) {
        this.numGapCrTxed = numGapCrTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGapDelRxed
     */
    public Integer getNumGapDelRxed() {
        return numGapDelRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGapDelRxed set the numGapDelRxed.
     */
    public void setNumGapDelRxed(Integer  numGapDelRxed) {
        this.numGapDelRxed = numGapDelRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGapDelTxed
     */
    public Integer getNumGapDelTxed() {
        return numGapDelTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGapDelTxed set the numGapDelTxed.
     */
    public void setNumGapDelTxed(Integer  numGapDelTxed) {
        this.numGapDelTxed = numGapDelTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGapUpdRxed
     */
    public Integer getNumGapUpdRxed() {
        return numGapUpdRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGapUpdRxed set the numGapUpdRxed.
     */
    public void setNumGapUpdRxed(Integer  numGapUpdRxed) {
        this.numGapUpdRxed = numGapUpdRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGapUpdTxed
     */
    public Integer getNumGapUpdTxed() {
        return numGapUpdTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGapUpdTxed set the numGapUpdTxed.
     */
    public void setNumGapUpdTxed(Integer  numGapUpdTxed) {
        this.numGapUpdTxed = numGapUpdTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGeoCrRxed
     */
    public Integer getNumGeoCrRxed() {
        return numGeoCrRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGeoCrRxed set the numGeoCrRxed.
     */
    public void setNumGeoCrRxed(Integer  numGeoCrRxed) {
        this.numGeoCrRxed = numGeoCrRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGeoCrTxed
     */
    public Integer getNumGeoCrTxed() {
        return numGeoCrTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGeoCrTxed set the numGeoCrTxed.
     */
    public void setNumGeoCrTxed(Integer  numGeoCrTxed) {
        this.numGeoCrTxed = numGeoCrTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGeoDelRxed
     */
    public Integer getNumGeoDelRxed() {
        return numGeoDelRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGeoDelRxed set the numGeoDelRxed.
     */
    public void setNumGeoDelRxed(Integer  numGeoDelRxed) {
        this.numGeoDelRxed = numGeoDelRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGeoDelTxed
     */
    public Integer getNumGeoDelTxed() {
        return numGeoDelTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGeoDelTxed set the numGeoDelTxed.
     */
    public void setNumGeoDelTxed(Integer  numGeoDelTxed) {
        this.numGeoDelTxed = numGeoDelTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGeoUpdRxed
     */
    public Integer getNumGeoUpdRxed() {
        return numGeoUpdRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGeoUpdRxed set the numGeoUpdRxed.
     */
    public void setNumGeoUpdRxed(Integer  numGeoUpdRxed) {
        this.numGeoUpdRxed = numGeoUpdRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGeoUpdTxed
     */
    public Integer getNumGeoUpdTxed() {
        return numGeoUpdTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGeoUpdTxed set the numGeoUpdTxed.
     */
    public void setNumGeoUpdTxed(Integer  numGeoUpdTxed) {
        this.numGeoUpdTxed = numGeoUpdTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGhmCrRxed
     */
    public Integer getNumGhmCrRxed() {
        return numGhmCrRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGhmCrRxed set the numGhmCrRxed.
     */
    public void setNumGhmCrRxed(Integer  numGhmCrRxed) {
        this.numGhmCrRxed = numGhmCrRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGhmCrTxed
     */
    public Integer getNumGhmCrTxed() {
        return numGhmCrTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGhmCrTxed set the numGhmCrTxed.
     */
    public void setNumGhmCrTxed(Integer  numGhmCrTxed) {
        this.numGhmCrTxed = numGhmCrTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGhmDelRxed
     */
    public Integer getNumGhmDelRxed() {
        return numGhmDelRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGhmDelRxed set the numGhmDelRxed.
     */
    public void setNumGhmDelRxed(Integer  numGhmDelRxed) {
        this.numGhmDelRxed = numGhmDelRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGhmDelTxed
     */
    public Integer getNumGhmDelTxed() {
        return numGhmDelTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGhmDelTxed set the numGhmDelTxed.
     */
    public void setNumGhmDelTxed(Integer  numGhmDelTxed) {
        this.numGhmDelTxed = numGhmDelTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGhmUpdRxed
     */
    public Integer getNumGhmUpdRxed() {
        return numGhmUpdRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGhmUpdRxed set the numGhmUpdRxed.
     */
    public void setNumGhmUpdRxed(Integer  numGhmUpdRxed) {
        this.numGhmUpdRxed = numGhmUpdRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGhmUpdTxed
     */
    public Integer getNumGhmUpdTxed() {
        return numGhmUpdTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGhmUpdTxed set the numGhmUpdTxed.
     */
    public void setNumGhmUpdTxed(Integer  numGhmUpdTxed) {
        this.numGhmUpdTxed = numGhmUpdTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGjwtCrRxed
     */
    public Integer getNumGjwtCrRxed() {
        return numGjwtCrRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGjwtCrRxed set the numGjwtCrRxed.
     */
    public void setNumGjwtCrRxed(Integer  numGjwtCrRxed) {
        this.numGjwtCrRxed = numGjwtCrRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGjwtCrTxed
     */
    public Integer getNumGjwtCrTxed() {
        return numGjwtCrTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGjwtCrTxed set the numGjwtCrTxed.
     */
    public void setNumGjwtCrTxed(Integer  numGjwtCrTxed) {
        this.numGjwtCrTxed = numGjwtCrTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGjwtDelRxed
     */
    public Integer getNumGjwtDelRxed() {
        return numGjwtDelRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGjwtDelRxed set the numGjwtDelRxed.
     */
    public void setNumGjwtDelRxed(Integer  numGjwtDelRxed) {
        this.numGjwtDelRxed = numGjwtDelRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGjwtDelTxed
     */
    public Integer getNumGjwtDelTxed() {
        return numGjwtDelTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGjwtDelTxed set the numGjwtDelTxed.
     */
    public void setNumGjwtDelTxed(Integer  numGjwtDelTxed) {
        this.numGjwtDelTxed = numGjwtDelTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGjwtUpdRxed
     */
    public Integer getNumGjwtUpdRxed() {
        return numGjwtUpdRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGjwtUpdRxed set the numGjwtUpdRxed.
     */
    public void setNumGjwtUpdRxed(Integer  numGjwtUpdRxed) {
        this.numGjwtUpdRxed = numGjwtUpdRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGjwtUpdTxed
     */
    public Integer getNumGjwtUpdTxed() {
        return numGjwtUpdTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGjwtUpdTxed set the numGjwtUpdTxed.
     */
    public void setNumGjwtUpdTxed(Integer  numGjwtUpdTxed) {
        this.numGjwtUpdTxed = numGjwtUpdTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGlbCrRxed
     */
    public Integer getNumGlbCrRxed() {
        return numGlbCrRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGlbCrRxed set the numGlbCrRxed.
     */
    public void setNumGlbCrRxed(Integer  numGlbCrRxed) {
        this.numGlbCrRxed = numGlbCrRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGlbCrTxed
     */
    public Integer getNumGlbCrTxed() {
        return numGlbCrTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGlbCrTxed set the numGlbCrTxed.
     */
    public void setNumGlbCrTxed(Integer  numGlbCrTxed) {
        this.numGlbCrTxed = numGlbCrTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGlbDelRxed
     */
    public Integer getNumGlbDelRxed() {
        return numGlbDelRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGlbDelRxed set the numGlbDelRxed.
     */
    public void setNumGlbDelRxed(Integer  numGlbDelRxed) {
        this.numGlbDelRxed = numGlbDelRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGlbDelTxed
     */
    public Integer getNumGlbDelTxed() {
        return numGlbDelTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGlbDelTxed set the numGlbDelTxed.
     */
    public void setNumGlbDelTxed(Integer  numGlbDelTxed) {
        this.numGlbDelTxed = numGlbDelTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGlbUpdRxed
     */
    public Integer getNumGlbUpdRxed() {
        return numGlbUpdRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGlbUpdRxed set the numGlbUpdRxed.
     */
    public void setNumGlbUpdRxed(Integer  numGlbUpdRxed) {
        this.numGlbUpdRxed = numGlbUpdRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGlbUpdTxed
     */
    public Integer getNumGlbUpdTxed() {
        return numGlbUpdTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGlbUpdTxed set the numGlbUpdTxed.
     */
    public void setNumGlbUpdTxed(Integer  numGlbUpdTxed) {
        this.numGlbUpdTxed = numGlbUpdTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGpkiCrRxed
     */
    public Integer getNumGpkiCrRxed() {
        return numGpkiCrRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGpkiCrRxed set the numGpkiCrRxed.
     */
    public void setNumGpkiCrRxed(Integer  numGpkiCrRxed) {
        this.numGpkiCrRxed = numGpkiCrRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGpkiCrTxed
     */
    public Integer getNumGpkiCrTxed() {
        return numGpkiCrTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGpkiCrTxed set the numGpkiCrTxed.
     */
    public void setNumGpkiCrTxed(Integer  numGpkiCrTxed) {
        this.numGpkiCrTxed = numGpkiCrTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGpkiDelRxed
     */
    public Integer getNumGpkiDelRxed() {
        return numGpkiDelRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGpkiDelRxed set the numGpkiDelRxed.
     */
    public void setNumGpkiDelRxed(Integer  numGpkiDelRxed) {
        this.numGpkiDelRxed = numGpkiDelRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGpkiDelTxed
     */
    public Integer getNumGpkiDelTxed() {
        return numGpkiDelTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGpkiDelTxed set the numGpkiDelTxed.
     */
    public void setNumGpkiDelTxed(Integer  numGpkiDelTxed) {
        this.numGpkiDelTxed = numGpkiDelTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGpkiUpdRxed
     */
    public Integer getNumGpkiUpdRxed() {
        return numGpkiUpdRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGpkiUpdRxed set the numGpkiUpdRxed.
     */
    public void setNumGpkiUpdRxed(Integer  numGpkiUpdRxed) {
        this.numGpkiUpdRxed = numGpkiUpdRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGpkiUpdTxed
     */
    public Integer getNumGpkiUpdTxed() {
        return numGpkiUpdTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGpkiUpdTxed set the numGpkiUpdTxed.
     */
    public void setNumGpkiUpdTxed(Integer  numGpkiUpdTxed) {
        this.numGpkiUpdTxed = numGpkiUpdTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsCrRxed
     */
    public Integer getNumGsCrRxed() {
        return numGsCrRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsCrRxed set the numGsCrRxed.
     */
    public void setNumGsCrRxed(Integer  numGsCrRxed) {
        this.numGsCrRxed = numGsCrRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsCrTxed
     */
    public Integer getNumGsCrTxed() {
        return numGsCrTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsCrTxed set the numGsCrTxed.
     */
    public void setNumGsCrTxed(Integer  numGsCrTxed) {
        this.numGsCrTxed = numGsCrTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsDelRxed
     */
    public Integer getNumGsDelRxed() {
        return numGsDelRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsDelRxed set the numGsDelRxed.
     */
    public void setNumGsDelRxed(Integer  numGsDelRxed) {
        this.numGsDelRxed = numGsDelRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsDelTxed
     */
    public Integer getNumGsDelTxed() {
        return numGsDelTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsDelTxed set the numGsDelTxed.
     */
    public void setNumGsDelTxed(Integer  numGsDelTxed) {
        this.numGsDelTxed = numGsDelTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsUpdRxed
     */
    public Integer getNumGsUpdRxed() {
        return numGsUpdRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsUpdRxed set the numGsUpdRxed.
     */
    public void setNumGsUpdRxed(Integer  numGsUpdRxed) {
        this.numGsUpdRxed = numGsUpdRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsUpdTxed
     */
    public Integer getNumGsUpdTxed() {
        return numGsUpdTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsUpdTxed set the numGsUpdTxed.
     */
    public void setNumGsUpdTxed(Integer  numGsUpdTxed) {
        this.numGsUpdTxed = numGsUpdTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Used for federated ssl key and cert stats for create.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsslCertCrRxed
     */
    public Integer getNumGsslCertCrRxed() {
        return numGsslCertCrRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Used for federated ssl key and cert stats for create.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsslCertCrRxed set the numGsslCertCrRxed.
     */
    public void setNumGsslCertCrRxed(Integer  numGsslCertCrRxed) {
        this.numGsslCertCrRxed = numGsslCertCrRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Used for federated ssl key and cert stats for delete.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsslCertDelRxed
     */
    public Integer getNumGsslCertDelRxed() {
        return numGsslCertDelRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Used for federated ssl key and cert stats for delete.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsslCertDelRxed set the numGsslCertDelRxed.
     */
    public void setNumGsslCertDelRxed(Integer  numGsslCertDelRxed) {
        this.numGsslCertDelRxed = numGsslCertDelRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Used for federated ssl key and cert stats for update.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsslCertUpdRxed
     */
    public Integer getNumGsslCertUpdRxed() {
        return numGsslCertUpdRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Used for federated ssl key and cert stats for update.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsslCertUpdRxed set the numGsslCertUpdRxed.
     */
    public void setNumGsslCertUpdRxed(Integer  numGsslCertUpdRxed) {
        this.numGsslCertUpdRxed = numGsslCertUpdRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Used for federated ssl profile stats for create.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsslCrRxed
     */
    public Integer getNumGsslCrRxed() {
        return numGsslCrRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Used for federated ssl profile stats for create.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsslCrRxed set the numGsslCrRxed.
     */
    public void setNumGsslCrRxed(Integer  numGsslCrRxed) {
        this.numGsslCrRxed = numGsslCrRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Used for federated ssl profile stats for delete.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsslDelRxed
     */
    public Integer getNumGsslDelRxed() {
        return numGsslDelRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Used for federated ssl profile stats for delete.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsslDelRxed set the numGsslDelRxed.
     */
    public void setNumGsslDelRxed(Integer  numGsslDelRxed) {
        this.numGsslDelRxed = numGsslDelRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Used for federated ssl profile stats for update.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numGsslUpdRxed
     */
    public Integer getNumGsslUpdRxed() {
        return numGsslUpdRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Used for federated ssl profile stats for update.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numGsslUpdRxed set the numGsslUpdRxed.
     */
    public void setNumGsslUpdRxed(Integer  numGsslUpdRxed) {
        this.numGsslUpdRxed = numGsslUpdRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numHealthMsgsRxed
     */
    public Integer getNumHealthMsgsRxed() {
        return numHealthMsgsRxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numHealthMsgsRxed set the numHealthMsgsRxed.
     */
    public void setNumHealthMsgsRxed(Integer  numHealthMsgsRxed) {
        this.numHealthMsgsRxed = numHealthMsgsRxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numHealthMsgsTxed
     */
    public Integer getNumHealthMsgsTxed() {
        return numHealthMsgsTxed;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numHealthMsgsTxed set the numHealthMsgsTxed.
     */
    public void setNumHealthMsgsTxed(Integer  numHealthMsgsTxed) {
        this.numHealthMsgsTxed = numHealthMsgsTxed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numOfBadResponses
     */
    public Integer getNumOfBadResponses() {
        return numOfBadResponses;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numOfBadResponses set the numOfBadResponses.
     */
    public void setNumOfBadResponses(Integer  numOfBadResponses) {
        this.numOfBadResponses = numOfBadResponses;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numOfEventsGenerated
     */
    public Integer getNumOfEventsGenerated() {
        return numOfEventsGenerated;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numOfEventsGenerated set the numOfEventsGenerated.
     */
    public void setNumOfEventsGenerated(Integer  numOfEventsGenerated) {
        this.numOfEventsGenerated = numOfEventsGenerated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numOfSkipOutstandingRequests
     */
    public Integer getNumOfSkipOutstandingRequests() {
        return numOfSkipOutstandingRequests;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numOfSkipOutstandingRequests set the numOfSkipOutstandingRequests.
     */
    public void setNumOfSkipOutstandingRequests(Integer  numOfSkipOutstandingRequests) {
        this.numOfSkipOutstandingRequests = numOfSkipOutstandingRequests;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numOfTimeouts
     */
    public Integer getNumOfTimeouts() {
        return numOfTimeouts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numOfTimeouts set the numOfTimeouts.
     */
    public void setNumOfTimeouts(Integer  numOfTimeouts) {
        this.numOfTimeouts = numOfTimeouts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GslbSiteRuntimeStats objGslbSiteRuntimeStats = (GslbSiteRuntimeStats) o;
      return   Objects.equals(this.numGlbCrTxed, objGslbSiteRuntimeStats.numGlbCrTxed)&&
  Objects.equals(this.numGlbCrRxed, objGslbSiteRuntimeStats.numGlbCrRxed)&&
  Objects.equals(this.numGlbDelTxed, objGslbSiteRuntimeStats.numGlbDelTxed)&&
  Objects.equals(this.numGlbDelRxed, objGslbSiteRuntimeStats.numGlbDelRxed)&&
  Objects.equals(this.numGlbUpdTxed, objGslbSiteRuntimeStats.numGlbUpdTxed)&&
  Objects.equals(this.numGlbUpdRxed, objGslbSiteRuntimeStats.numGlbUpdRxed)&&
  Objects.equals(this.numGsCrTxed, objGslbSiteRuntimeStats.numGsCrTxed)&&
  Objects.equals(this.numGsCrRxed, objGslbSiteRuntimeStats.numGsCrRxed)&&
  Objects.equals(this.numGsDelTxed, objGslbSiteRuntimeStats.numGsDelTxed)&&
  Objects.equals(this.numGsDelRxed, objGslbSiteRuntimeStats.numGsDelRxed)&&
  Objects.equals(this.numGsUpdTxed, objGslbSiteRuntimeStats.numGsUpdTxed)&&
  Objects.equals(this.numGsUpdRxed, objGslbSiteRuntimeStats.numGsUpdRxed)&&
  Objects.equals(this.numGhmCrTxed, objGslbSiteRuntimeStats.numGhmCrTxed)&&
  Objects.equals(this.numGhmCrRxed, objGslbSiteRuntimeStats.numGhmCrRxed)&&
  Objects.equals(this.numGhmDelTxed, objGslbSiteRuntimeStats.numGhmDelTxed)&&
  Objects.equals(this.numGhmDelRxed, objGslbSiteRuntimeStats.numGhmDelRxed)&&
  Objects.equals(this.numGhmUpdTxed, objGslbSiteRuntimeStats.numGhmUpdTxed)&&
  Objects.equals(this.numGhmUpdRxed, objGslbSiteRuntimeStats.numGhmUpdRxed)&&
  Objects.equals(this.numHealthMsgsTxed, objGslbSiteRuntimeStats.numHealthMsgsTxed)&&
  Objects.equals(this.numHealthMsgsRxed, objGslbSiteRuntimeStats.numHealthMsgsRxed)&&
  Objects.equals(this.numOfTimeouts, objGslbSiteRuntimeStats.numOfTimeouts)&&
  Objects.equals(this.numOfEventsGenerated, objGslbSiteRuntimeStats.numOfEventsGenerated)&&
  Objects.equals(this.numOfBadResponses, objGslbSiteRuntimeStats.numOfBadResponses)&&
  Objects.equals(this.numOfSkipOutstandingRequests, objGslbSiteRuntimeStats.numOfSkipOutstandingRequests)&&
  Objects.equals(this.numGeoCrTxed, objGslbSiteRuntimeStats.numGeoCrTxed)&&
  Objects.equals(this.numGeoCrRxed, objGslbSiteRuntimeStats.numGeoCrRxed)&&
  Objects.equals(this.numGeoDelTxed, objGslbSiteRuntimeStats.numGeoDelTxed)&&
  Objects.equals(this.numGeoDelRxed, objGslbSiteRuntimeStats.numGeoDelRxed)&&
  Objects.equals(this.numGeoUpdTxed, objGslbSiteRuntimeStats.numGeoUpdTxed)&&
  Objects.equals(this.numGeoUpdRxed, objGslbSiteRuntimeStats.numGeoUpdRxed)&&
  Objects.equals(this.numGapCrTxed, objGslbSiteRuntimeStats.numGapCrTxed)&&
  Objects.equals(this.numGapCrRxed, objGslbSiteRuntimeStats.numGapCrRxed)&&
  Objects.equals(this.numGapDelTxed, objGslbSiteRuntimeStats.numGapDelTxed)&&
  Objects.equals(this.numGapDelRxed, objGslbSiteRuntimeStats.numGapDelRxed)&&
  Objects.equals(this.numGapUpdTxed, objGslbSiteRuntimeStats.numGapUpdTxed)&&
  Objects.equals(this.numGapUpdRxed, objGslbSiteRuntimeStats.numGapUpdRxed)&&
  Objects.equals(this.numFileCrTxed, objGslbSiteRuntimeStats.numFileCrTxed)&&
  Objects.equals(this.numFileDelTxed, objGslbSiteRuntimeStats.numFileDelTxed)&&
  Objects.equals(this.numGpkiCrTxed, objGslbSiteRuntimeStats.numGpkiCrTxed)&&
  Objects.equals(this.numGpkiCrRxed, objGslbSiteRuntimeStats.numGpkiCrRxed)&&
  Objects.equals(this.numGpkiDelTxed, objGslbSiteRuntimeStats.numGpkiDelTxed)&&
  Objects.equals(this.numGpkiDelRxed, objGslbSiteRuntimeStats.numGpkiDelRxed)&&
  Objects.equals(this.numGpkiUpdTxed, objGslbSiteRuntimeStats.numGpkiUpdTxed)&&
  Objects.equals(this.numGpkiUpdRxed, objGslbSiteRuntimeStats.numGpkiUpdRxed)&&
  Objects.equals(this.numGjwtCrTxed, objGslbSiteRuntimeStats.numGjwtCrTxed)&&
  Objects.equals(this.numGjwtCrRxed, objGslbSiteRuntimeStats.numGjwtCrRxed)&&
  Objects.equals(this.numGjwtDelTxed, objGslbSiteRuntimeStats.numGjwtDelTxed)&&
  Objects.equals(this.numGjwtDelRxed, objGslbSiteRuntimeStats.numGjwtDelRxed)&&
  Objects.equals(this.numGjwtUpdTxed, objGslbSiteRuntimeStats.numGjwtUpdTxed)&&
  Objects.equals(this.numGjwtUpdRxed, objGslbSiteRuntimeStats.numGjwtUpdRxed)&&
  Objects.equals(this.numGsslCrRxed, objGslbSiteRuntimeStats.numGsslCrRxed)&&
  Objects.equals(this.numGsslDelRxed, objGslbSiteRuntimeStats.numGsslDelRxed)&&
  Objects.equals(this.numGsslUpdRxed, objGslbSiteRuntimeStats.numGsslUpdRxed)&&
  Objects.equals(this.numGsslCertCrRxed, objGslbSiteRuntimeStats.numGsslCertCrRxed)&&
  Objects.equals(this.numGsslCertDelRxed, objGslbSiteRuntimeStats.numGsslCertDelRxed)&&
  Objects.equals(this.numGsslCertUpdRxed, objGslbSiteRuntimeStats.numGsslCertUpdRxed);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbSiteRuntimeStats {\n");
                  sb.append("    numFileCrTxed: ").append(toIndentedString(numFileCrTxed)).append("\n");
                        sb.append("    numFileDelTxed: ").append(toIndentedString(numFileDelTxed)).append("\n");
                        sb.append("    numGapCrRxed: ").append(toIndentedString(numGapCrRxed)).append("\n");
                        sb.append("    numGapCrTxed: ").append(toIndentedString(numGapCrTxed)).append("\n");
                        sb.append("    numGapDelRxed: ").append(toIndentedString(numGapDelRxed)).append("\n");
                        sb.append("    numGapDelTxed: ").append(toIndentedString(numGapDelTxed)).append("\n");
                        sb.append("    numGapUpdRxed: ").append(toIndentedString(numGapUpdRxed)).append("\n");
                        sb.append("    numGapUpdTxed: ").append(toIndentedString(numGapUpdTxed)).append("\n");
                        sb.append("    numGeoCrRxed: ").append(toIndentedString(numGeoCrRxed)).append("\n");
                        sb.append("    numGeoCrTxed: ").append(toIndentedString(numGeoCrTxed)).append("\n");
                        sb.append("    numGeoDelRxed: ").append(toIndentedString(numGeoDelRxed)).append("\n");
                        sb.append("    numGeoDelTxed: ").append(toIndentedString(numGeoDelTxed)).append("\n");
                        sb.append("    numGeoUpdRxed: ").append(toIndentedString(numGeoUpdRxed)).append("\n");
                        sb.append("    numGeoUpdTxed: ").append(toIndentedString(numGeoUpdTxed)).append("\n");
                        sb.append("    numGhmCrRxed: ").append(toIndentedString(numGhmCrRxed)).append("\n");
                        sb.append("    numGhmCrTxed: ").append(toIndentedString(numGhmCrTxed)).append("\n");
                        sb.append("    numGhmDelRxed: ").append(toIndentedString(numGhmDelRxed)).append("\n");
                        sb.append("    numGhmDelTxed: ").append(toIndentedString(numGhmDelTxed)).append("\n");
                        sb.append("    numGhmUpdRxed: ").append(toIndentedString(numGhmUpdRxed)).append("\n");
                        sb.append("    numGhmUpdTxed: ").append(toIndentedString(numGhmUpdTxed)).append("\n");
                        sb.append("    numGjwtCrRxed: ").append(toIndentedString(numGjwtCrRxed)).append("\n");
                        sb.append("    numGjwtCrTxed: ").append(toIndentedString(numGjwtCrTxed)).append("\n");
                        sb.append("    numGjwtDelRxed: ").append(toIndentedString(numGjwtDelRxed)).append("\n");
                        sb.append("    numGjwtDelTxed: ").append(toIndentedString(numGjwtDelTxed)).append("\n");
                        sb.append("    numGjwtUpdRxed: ").append(toIndentedString(numGjwtUpdRxed)).append("\n");
                        sb.append("    numGjwtUpdTxed: ").append(toIndentedString(numGjwtUpdTxed)).append("\n");
                        sb.append("    numGlbCrRxed: ").append(toIndentedString(numGlbCrRxed)).append("\n");
                        sb.append("    numGlbCrTxed: ").append(toIndentedString(numGlbCrTxed)).append("\n");
                        sb.append("    numGlbDelRxed: ").append(toIndentedString(numGlbDelRxed)).append("\n");
                        sb.append("    numGlbDelTxed: ").append(toIndentedString(numGlbDelTxed)).append("\n");
                        sb.append("    numGlbUpdRxed: ").append(toIndentedString(numGlbUpdRxed)).append("\n");
                        sb.append("    numGlbUpdTxed: ").append(toIndentedString(numGlbUpdTxed)).append("\n");
                        sb.append("    numGpkiCrRxed: ").append(toIndentedString(numGpkiCrRxed)).append("\n");
                        sb.append("    numGpkiCrTxed: ").append(toIndentedString(numGpkiCrTxed)).append("\n");
                        sb.append("    numGpkiDelRxed: ").append(toIndentedString(numGpkiDelRxed)).append("\n");
                        sb.append("    numGpkiDelTxed: ").append(toIndentedString(numGpkiDelTxed)).append("\n");
                        sb.append("    numGpkiUpdRxed: ").append(toIndentedString(numGpkiUpdRxed)).append("\n");
                        sb.append("    numGpkiUpdTxed: ").append(toIndentedString(numGpkiUpdTxed)).append("\n");
                        sb.append("    numGsCrRxed: ").append(toIndentedString(numGsCrRxed)).append("\n");
                        sb.append("    numGsCrTxed: ").append(toIndentedString(numGsCrTxed)).append("\n");
                        sb.append("    numGsDelRxed: ").append(toIndentedString(numGsDelRxed)).append("\n");
                        sb.append("    numGsDelTxed: ").append(toIndentedString(numGsDelTxed)).append("\n");
                        sb.append("    numGsUpdRxed: ").append(toIndentedString(numGsUpdRxed)).append("\n");
                        sb.append("    numGsUpdTxed: ").append(toIndentedString(numGsUpdTxed)).append("\n");
                        sb.append("    numGsslCertCrRxed: ").append(toIndentedString(numGsslCertCrRxed)).append("\n");
                        sb.append("    numGsslCertDelRxed: ").append(toIndentedString(numGsslCertDelRxed)).append("\n");
                        sb.append("    numGsslCertUpdRxed: ").append(toIndentedString(numGsslCertUpdRxed)).append("\n");
                        sb.append("    numGsslCrRxed: ").append(toIndentedString(numGsslCrRxed)).append("\n");
                        sb.append("    numGsslDelRxed: ").append(toIndentedString(numGsslDelRxed)).append("\n");
                        sb.append("    numGsslUpdRxed: ").append(toIndentedString(numGsslUpdRxed)).append("\n");
                        sb.append("    numHealthMsgsRxed: ").append(toIndentedString(numHealthMsgsRxed)).append("\n");
                        sb.append("    numHealthMsgsTxed: ").append(toIndentedString(numHealthMsgsTxed)).append("\n");
                        sb.append("    numOfBadResponses: ").append(toIndentedString(numOfBadResponses)).append("\n");
                        sb.append("    numOfEventsGenerated: ").append(toIndentedString(numOfEventsGenerated)).append("\n");
                        sb.append("    numOfSkipOutstandingRequests: ").append(toIndentedString(numOfSkipOutstandingRequests)).append("\n");
                        sb.append("    numOfTimeouts: ").append(toIndentedString(numOfTimeouts)).append("\n");
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
