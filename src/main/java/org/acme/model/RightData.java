package org.acme.model;

import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RightData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class RightData   {
  private String name;
  private TranslationHolderData description;
  private Boolean isInternal;

  public RightData() {
  }

  /**
   **/
  public RightData name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public RightData description(TranslationHolderData description) {
    this.description = description;
    return this;
  }

  
  @JsonProperty("description")
  @Valid public TranslationHolderData getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(TranslationHolderData description) {
    this.description = description;
  }

  /**
   **/
  public RightData isInternal(Boolean isInternal) {
    this.isInternal = isInternal;
    return this;
  }

  
  @JsonProperty("isInternal")
  public Boolean getIsInternal() {
    return isInternal;
  }

  @JsonProperty("isInternal")
  public void setIsInternal(Boolean isInternal) {
    this.isInternal = isInternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RightData rightData = (RightData) o;
    return Objects.equals(this.name, rightData.name) &&
        Objects.equals(this.description, rightData.description) &&
        Objects.equals(this.isInternal, rightData.isInternal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isInternal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RightData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isInternal: ").append(toIndentedString(isInternal)).append("\n");
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

