package org.acme.model;

import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SalutationData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class SalutationData   {
  private Long id;
  private TranslationHolderData salutation;

  public SalutationData() {
  }

  /**
   * Id of the salutation.
   **/
  public SalutationData id(Long id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Translated salutation.
   **/
  public SalutationData salutation(TranslationHolderData salutation) {
    this.salutation = salutation;
    return this;
  }

  
  @JsonProperty("salutation")
  @Valid public TranslationHolderData getSalutation() {
    return salutation;
  }

  @JsonProperty("salutation")
  public void setSalutation(TranslationHolderData salutation) {
    this.salutation = salutation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalutationData salutationData = (SalutationData) o;
    return Objects.equals(this.id, salutationData.id) &&
        Objects.equals(this.salutation, salutationData.salutation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, salutation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalutationData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
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

