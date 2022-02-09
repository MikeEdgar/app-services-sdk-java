/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The Kafka resource api status
 */
@ApiModel(description = "The Kafka resource api status")
@JsonPropertyOrder({
  ServiceStatusKafkas.JSON_PROPERTY_MAX_CAPACITY_REACHED
})
@JsonTypeName("ServiceStatus_kafkas")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceStatusKafkas {
  public static final String JSON_PROPERTY_MAX_CAPACITY_REACHED = "max_capacity_reached";
  private Boolean maxCapacityReached;

  public ServiceStatusKafkas() { 
  }

  public ServiceStatusKafkas maxCapacityReached(Boolean maxCapacityReached) {
    
    this.maxCapacityReached = maxCapacityReached;
    return this;
  }

   /**
   * Indicates whether we have reached Kafka maximum capacity
   * @return maxCapacityReached
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether we have reached Kafka maximum capacity")
  @JsonProperty(JSON_PROPERTY_MAX_CAPACITY_REACHED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMaxCapacityReached() {
    return maxCapacityReached;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CAPACITY_REACHED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxCapacityReached(Boolean maxCapacityReached) {
    this.maxCapacityReached = maxCapacityReached;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceStatusKafkas serviceStatusKafkas = (ServiceStatusKafkas) o;
    return Objects.equals(this.maxCapacityReached, serviceStatusKafkas.maxCapacityReached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCapacityReached);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStatusKafkas {\n");
    sb.append("    maxCapacityReached: ").append(toIndentedString(maxCapacityReached)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

