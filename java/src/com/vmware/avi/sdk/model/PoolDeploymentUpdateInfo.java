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
 * The PoolDeploymentUpdateInfo is a POJO class extends AviRestResource that used for creating
 * PoolDeploymentUpdateInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PoolDeploymentUpdateInfo extends AviRestResource  {
    @JsonProperty("deployment_state")
    private String deploymentState;

    @JsonProperty("evaluation_duration")
    private Integer evaluationDuration;

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
     * Pool deployment state used with the pg deployment policy.
     * Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return deploymentState
     */
    public String getDeploymentState() {
        return deploymentState;
    }

    /**
     * This is the setter method to the attribute.
     * Pool deployment state used with the pg deployment policy.
     * Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param deploymentState set the deploymentState.
     */
    public void setDeploymentState(String  deploymentState) {
        this.deploymentState = deploymentState;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Evaluation period for deployment update.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return evaluationDuration
     */
    public Integer getEvaluationDuration() {
        return evaluationDuration;
    }

    /**
     * This is the setter method to the attribute.
     * Evaluation period for deployment update.
     * Unit is sec.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param evaluationDuration set the evaluationDuration.
     */
    public void setEvaluationDuration(Integer  evaluationDuration) {
        this.evaluationDuration = evaluationDuration;
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
     * List of results for each deployment rule.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return results
     */
    public List<PGDeploymentRuleResult> getResults() {
        return results;
    }

    /**
     * This is the setter method. this will set the results
     * List of results for each deployment rule.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return results
     */
    public void setResults(List<PGDeploymentRuleResult>  results) {
        this.results = results;
    }

    /**
     * This is the setter method this will set the results
     * List of results for each deployment rule.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return results
     */
    public PoolDeploymentUpdateInfo addResultsItem(PGDeploymentRuleResult resultsItem) {
      if (this.results == null) {
        this.results = new ArrayList<PGDeploymentRuleResult>();
      }
      this.results.add(resultsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Member pool's id.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Member pool's id.
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
      PoolDeploymentUpdateInfo objPoolDeploymentUpdateInfo = (PoolDeploymentUpdateInfo) o;
      return   Objects.equals(this.uuid, objPoolDeploymentUpdateInfo.uuid)&&
  Objects.equals(this.ratio, objPoolDeploymentUpdateInfo.ratio)&&
  Objects.equals(this.results, objPoolDeploymentUpdateInfo.results)&&
  Objects.equals(this.webhookResult, objPoolDeploymentUpdateInfo.webhookResult)&&
  Objects.equals(this.webhookReason, objPoolDeploymentUpdateInfo.webhookReason)&&
  Objects.equals(this.deploymentState, objPoolDeploymentUpdateInfo.deploymentState)&&
  Objects.equals(this.evaluationDuration, objPoolDeploymentUpdateInfo.evaluationDuration);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PoolDeploymentUpdateInfo {\n");
                  sb.append("    deploymentState: ").append(toIndentedString(deploymentState)).append("\n");
                        sb.append("    evaluationDuration: ").append(toIndentedString(evaluationDuration)).append("\n");
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
