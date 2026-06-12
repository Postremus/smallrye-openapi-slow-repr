package org.acme.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("RightCategoryData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date =
        "2026-06-12T06:27:49" + ".020268300" + "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class RightCategoryData   {
  private Long id;
  private TranslationHolderData name;
  private @Valid List<@Valid RightData> rights = new ArrayList<>();

  public RightCategoryData() {
  }

  /**
   * Id of the right category.
   **/
  public RightCategoryData id(Long id) {
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
   * Translated category name.
   **/
  public RightCategoryData name(TranslationHolderData name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  @Valid public TranslationHolderData getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(TranslationHolderData name) {
    this.name = name;
  }

  /**
   **/
  public RightCategoryData rights(List<@Valid RightData> rights) {
    this.rights = rights;
    return this;
  }

  
  @JsonProperty("rights")
  @Valid public List<@Valid RightData> getRights() {
    return rights;
  }

  @JsonProperty("rights")
  public void setRights(List<@Valid RightData> rights) {
    this.rights = rights;
  }

  public RightCategoryData addRightsItem(RightData rightsItem) {
    if (this.rights == null) {
      this.rights = new ArrayList<>();
    }

    this.rights.add(rightsItem);
    return this;
  }

  public RightCategoryData removeRightsItem(RightData rightsItem) {
    if (rightsItem != null && this.rights != null) {
      this.rights.remove(rightsItem);
    }

      return this;
  }

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public RightCategoryData putAdditionalProperty(String key, Object value) {
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
    RightCategoryData rightCategoryData = (RightCategoryData) o;
    return Objects.equals(this.id, rightCategoryData.id) &&
        Objects.equals(this.name, rightCategoryData.name) &&
        Objects.equals(this.rights, rightCategoryData.rights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, rights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RightCategoryData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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
