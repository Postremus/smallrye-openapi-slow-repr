package org.acme.model;

import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CSSSettingData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class CSSSettingData   {
  private UUID id;
  private String key;
  private String value;
  private Long sortOrder;
  private UUID typeId;

  public CSSSettingData() {
  }

  @JsonCreator
  public CSSSettingData(
    @JsonProperty(required = true, value = "key") String key,
    @JsonProperty(required = true, value = "value") String value,
    @JsonProperty(required = true, value = "typeId") UUID typeId
  ) {
    this.key = key;
    this.value = value;
    this.typeId = typeId;
  }

  /**
   **/
  public CSSSettingData id(UUID id) {
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
  public CSSSettingData key(String key) {
    this.key = key;
    return this;
  }

  
  @JsonProperty(required = true, value = "key")
  @NotNull  @Pattern(regexp="\\S")public String getKey() {
    return key;
  }

  @JsonProperty(required = true, value = "key")
  public void setKey(String key) {
    this.key = key;
  }

  /**
   **/
  public CSSSettingData value(String value) {
    this.value = value;
    return this;
  }

  
  @JsonProperty(required = true, value = "value")
  @NotNull public String getValue() {
    return value;
  }

  @JsonProperty(required = true, value = "value")
  public void setValue(String value) {
    this.value = value;
  }

  /**
   **/
  public CSSSettingData sortOrder(Long sortOrder) {
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

  /**
   **/
  public CSSSettingData typeId(UUID typeId) {
    this.typeId = typeId;
    return this;
  }

  
  @JsonProperty(required = true, value = "typeId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getTypeId() {
    return typeId;
  }

  @JsonProperty(required = true, value = "typeId")
  public void setTypeId(UUID typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSSSettingData csSSettingData = (CSSSettingData) o;
    return Objects.equals(this.id, csSSettingData.id) &&
        Objects.equals(this.key, csSSettingData.key) &&
        Objects.equals(this.value, csSSettingData.value) &&
        Objects.equals(this.sortOrder, csSSettingData.sortOrder) &&
        Objects.equals(this.typeId, csSSettingData.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, value, sortOrder, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSSSettingData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

