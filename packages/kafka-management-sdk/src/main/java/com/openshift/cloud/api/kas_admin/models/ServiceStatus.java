/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kakfa instances and connectors.
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas_admin.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.openshift.cloud.api.kas_admin.models.ServiceStatusKafkas;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Schema for the service status response body
 */
@ApiModel(description = "Schema for the service status response body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-08T16:30:41.494320497-04:00[America/New_York]")
public class ServiceStatus {
  public static final String SERIALIZED_NAME_KAFKAS = "kafkas";
  @SerializedName(SERIALIZED_NAME_KAFKAS)
  private ServiceStatusKafkas kafkas;


  public ServiceStatus kafkas(ServiceStatusKafkas kafkas) {
    
    this.kafkas = kafkas;
    return this;
  }

   /**
   * Get kafkas
   * @return kafkas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ServiceStatusKafkas getKafkas() {
    return kafkas;
  }


  public void setKafkas(ServiceStatusKafkas kafkas) {
    this.kafkas = kafkas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceStatus serviceStatus = (ServiceStatus) o;
    return Objects.equals(this.kafkas, serviceStatus.kafkas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kafkas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStatus {\n");
    sb.append("    kafkas: ").append(toIndentedString(kafkas)).append("\n");
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

