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
 * The PoolDeploymentFailureInfo is a POJO class extends AviRestResource that used for creating
 * PoolDeploymentFailureInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PoolDeploymentFailureInfo extends AviRestResource  {
    @JsonProperty("curr_in_service_pool_name")
    private String currInServicePoolName;

    @JsonProperty("curr_in_service_pool_ref")
    private String currInServicePoolRef;

    @JsonProperty("ratio")
    private Integer ratio;

    @JsonProperty("results")
    private List<PGDeploymentRuleResult> results;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("webhook_reason")
    private String webhookReason;

    @JsonProperty("webhook_result")
    private Boolean webhookResult;



    /**
     * This is the getter method this will return the attribute value.
     * Curent in-service pool.
     * It is a reference to an object of type pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return currInServicePoolName
     */
    public String getCurrInServicePoolName() {
        return currInServicePoolName;
    }

    /**
     * This is the setter method to the attribute.
     * Curent in-service pool.
     * It is a reference to an object of type pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param currInServicePoolName set the currInServicePoolName.
     */
    public void setCurrInServicePoolName(String  currInServicePoolName) {
        this.currInServicePoolName = currInServicePoolName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Curent in service pool.
     * It is a reference to an object of type pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return currInServicePoolRef
     */
    public String getCurrInServicePoolRef() {
        return currInServicePoolRef;
    }

    /**
     * This is the setter method to the attribute.
     * Curent in service pool.
     * It is a reference to an object of type pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param currInServicePoolRef set the currInServicePoolRef.
     */
    public void setCurrInServicePoolRef(String  currInServicePoolRef) {
        this.currInServicePoolRef = currInServicePoolRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Operational traffic ratio for the pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ratio
     */
    public Integer getRatio() {
        return ratio;
    }

    /**
     * This is the setter method to the attribute.
     * Operational traffic ratio for the pool.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ratio set the ratio.
     */
    public void setRatio(Integer  ratio) {
        this.ratio = ratio;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return results
     */
    public List<PGDeploymentRuleResult> getResults() {
        return results;
    }

    /**
     * This is the setter method. this will set the results
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return results
     */
    public void setResults(List<PGDeploymentRuleResult>  results) {
        this.results = results;
    }

    /**
     * This is the setter method this will set the results
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return results
     */
    public PoolDeploymentFailureInfo addResultsItem(PGDeploymentRuleResult resultsItem) {
      if (this.results == null) {
        this.results = new ArrayList<PGDeploymentRuleResult>();
      }
      this.results.add(resultsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pool's id.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Pool's id.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason returned in webhook callback when configured.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return webhookReason
     */
    public String getWebhookReason() {
        return webhookReason;
    }

    /**
     * This is the setter method to the attribute.
     * Reason returned in webhook callback when configured.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param webhookReason set the webhookReason.
     */
    public void setWebhookReason(String  webhookReason) {
        this.webhookReason = webhookReason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Result of webhook callback when configured.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return webhookResult
     */
    public Boolean getWebhookResult() {
        return webhookResult;
    }

    /**
     * This is the setter method to the attribute.
     * Result of webhook callback when configured.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param webhookResult set the webhookResult.
     */
    public void setWebhookResult(Boolean  webhookResult) {
        this.webhookResult = webhookResult;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PoolDeploymentFailureInfo objPoolDeploymentFailureInfo = (PoolDeploymentFailureInfo) o;
      return   Objects.equals(this.uuid, objPoolDeploymentFailureInfo.uuid)&&
  Objects.equals(this.ratio, objPoolDeploymentFailureInfo.ratio)&&
  Objects.equals(this.currInServicePoolRef, objPoolDeploymentFailureInfo.currInServicePoolRef)&&
  Objects.equals(this.results, objPoolDeploymentFailureInfo.results)&&
  Objects.equals(this.webhookResult, objPoolDeploymentFailureInfo.webhookResult)&&
  Objects.equals(this.webhookReason, objPoolDeploymentFailureInfo.webhookReason)&&
  Objects.equals(this.currInServicePoolName, objPoolDeploymentFailureInfo.currInServicePoolName);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PoolDeploymentFailureInfo {\n");
                  sb.append("    currInServicePoolName: ").append(toIndentedString(currInServicePoolName)).append("\n");
                        sb.append("    currInServicePoolRef: ").append(toIndentedString(currInServicePoolRef)).append("\n");
                        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
                        sb.append("    results: ").append(toIndentedString(results)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    webhookReason: ").append(toIndentedString(webhookReason)).append("\n");
                        sb.append("    webhookResult: ").append(toIndentedString(webhookResult)).append("\n");
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
