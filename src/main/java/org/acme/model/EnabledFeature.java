package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.time.LocalDate;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("EnabledFeature")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class EnabledFeature   {
  private String feature;
  private LocalDate validTo;

  public EnabledFeature() {
  }

  /**
   **/
  public EnabledFeature feature(String feature) {
    this.feature = feature;
    return this;
  }

  
  @JsonProperty("feature")
  public String getFeature() {
    return feature;
  }

  @JsonProperty("feature")
  public void setFeature(String feature) {
    this.feature = feature;
  }

  /**
   **/
  public EnabledFeature validTo(LocalDate validTo) {
    this.validTo = validTo;
    return this;
  }

  
  @JsonProperty("validTo")
  public LocalDate getValidTo() {
    return validTo;
  }

  @JsonProperty("validTo")
  public void setValidTo(LocalDate validTo) {
    this.validTo = validTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnabledFeature enabledFeature = (EnabledFeature) o;
    return Objects.equals(this.feature, enabledFeature.feature) &&
        Objects.equals(this.validTo, enabledFeature.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature, validTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnabledFeature {\n");
    
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

