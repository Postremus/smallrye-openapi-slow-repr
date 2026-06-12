package org.acme.model;

import java.util.Map;
import java.util.Objects;

import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("SalutationData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date =
        "2026-06-12T06:27:49" + ".020268300" + "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
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

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public SalutationData putAdditionalProperty(String key, Object value) {
        return this;
    }

    /**
     * Return the additional (undeclared) properties.
     * @return the additional (undeclared) properties
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return null;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     * @param key the name of the property
     * @return the additional (undeclared) property with the specified name
     */
    public Object getAdditionalProperty(String key) {
        return null;
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
      return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
