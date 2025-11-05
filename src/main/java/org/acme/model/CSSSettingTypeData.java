package org.acme.model;

import java.util.UUID;
import org.acme.model.CssType;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CSSSettingTypeData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class CSSSettingTypeData   {
  private UUID id;
  private UUID typeId;
  private TranslationHolderData name;
  private String key;
  private CssType valueType;
  private Long sortOrder;

  public CSSSettingTypeData() {
  }

  /**
   **/
  public CSSSettingTypeData id(UUID id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public CSSSettingTypeData typeId(UUID typeId) {
    this.typeId = typeId;
    return this;
  }

  
  @JsonProperty("typeId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getTypeId() {
    return typeId;
  }

  @JsonProperty("typeId")
  public void setTypeId(UUID typeId) {
    this.typeId = typeId;
  }

  /**
   **/
  public CSSSettingTypeData name(TranslationHolderData name) {
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
  public CSSSettingTypeData key(String key) {
    this.key = key;
    return this;
  }

  
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  @JsonProperty("key")
  public void setKey(String key) {
    this.key = key;
  }

  /**
   **/
  public CSSSettingTypeData valueType(CssType valueType) {
    this.valueType = valueType;
    return this;
  }

  
  @JsonProperty("valueType")
  public CssType getValueType() {
    return valueType;
  }

  @JsonProperty("valueType")
  public void setValueType(CssType valueType) {
    this.valueType = valueType;
  }

  /**
   **/
  public CSSSettingTypeData sortOrder(Long sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  
  @JsonProperty("sortOrder")
  public Long getSortOrder() {
    return sortOrder;
  }

  @JsonProperty("sortOrder")
  public void setSortOrder(Long sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSSSettingTypeData csSSettingTypeData = (CSSSettingTypeData) o;
    return Objects.equals(this.id, csSSettingTypeData.id) &&
        Objects.equals(this.typeId, csSSettingTypeData.typeId) &&
        Objects.equals(this.name, csSSettingTypeData.name) &&
        Objects.equals(this.key, csSSettingTypeData.key) &&
        Objects.equals(this.valueType, csSSettingTypeData.valueType) &&
        Objects.equals(this.sortOrder, csSSettingTypeData.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, typeId, name, key, valueType, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSSSettingTypeData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

