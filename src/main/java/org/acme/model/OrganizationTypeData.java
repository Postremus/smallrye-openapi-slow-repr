package org.acme.model;

import java.util.Map;
import java.util.Objects;

import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("OrganizationTypeData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date =
        "2026-06-12T06:27:49" + ".020268300" + "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class OrganizationTypeData   {
  private Long id;
  private TranslationHolderData name;
  private String type;
  private String iconClass;

  public OrganizationTypeData() {
  }

  /**
   * Id of the organization type.
   **/
  public OrganizationTypeData id(Long id) {
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
   * Translated context name.
   **/
  public OrganizationTypeData name(TranslationHolderData name) {
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
   * Free text organization type.
   **/
  public OrganizationTypeData type(String type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Icon used in the client for this context type in specific display modes. This can be for example the name of a css class for an icon.
   **/
  public OrganizationTypeData iconClass(String iconClass) {
    this.iconClass = iconClass;
    return this;
  }

  
  @JsonProperty("iconClass")
  public String getIconClass() {
    return iconClass;
  }

  @JsonProperty("iconClass")
  public void setIconClass(String iconClass) {
    this.iconClass = iconClass;
  }

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public OrganizationTypeData putAdditionalProperty(String key, Object value) {
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
    OrganizationTypeData organizationTypeData = (OrganizationTypeData) o;
    return Objects.equals(this.id, organizationTypeData.id) &&
        Objects.equals(this.name, organizationTypeData.name) &&
        Objects.equals(this.type, organizationTypeData.type) &&
        Objects.equals(this.iconClass, organizationTypeData.iconClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, iconClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationTypeData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    iconClass: ").append(toIndentedString(iconClass)).append("\n");
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
