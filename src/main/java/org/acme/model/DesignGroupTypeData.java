package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.CSSSettingTypeData;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DesignGroupTypeData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class DesignGroupTypeData   {
  private UUID id;
  private TranslationHolderData name;
  private Long sortOrder;
  private @Valid List<@Valid CSSSettingTypeData> itemTypes = new ArrayList<>();
  private UUID categoryTypeId;

  public DesignGroupTypeData() {
  }

  /**
   **/
  public DesignGroupTypeData id(UUID id) {
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
  public DesignGroupTypeData name(TranslationHolderData name) {
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
  public DesignGroupTypeData sortOrder(Long sortOrder) {
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
  public DesignGroupTypeData itemTypes(List<@Valid CSSSettingTypeData> itemTypes) {
    this.itemTypes = itemTypes;
    return this;
  }

  
  @JsonProperty("itemTypes")
  @Valid public List<@Valid CSSSettingTypeData> getItemTypes() {
    return itemTypes;
  }

  @JsonProperty("itemTypes")
  public void setItemTypes(List<@Valid CSSSettingTypeData> itemTypes) {
    this.itemTypes = itemTypes;
  }

  public DesignGroupTypeData addItemTypesItem(CSSSettingTypeData itemTypesItem) {
    if (this.itemTypes == null) {
      this.itemTypes = new ArrayList<>();
    }

    this.itemTypes.add(itemTypesItem);
    return this;
  }

  public DesignGroupTypeData removeItemTypesItem(CSSSettingTypeData itemTypesItem) {
    if (itemTypesItem != null && this.itemTypes != null) {
      this.itemTypes.remove(itemTypesItem);
    }

    return this;
  }
  /**
   **/
  public DesignGroupTypeData categoryTypeId(UUID categoryTypeId) {
    this.categoryTypeId = categoryTypeId;
    return this;
  }

  
  @JsonProperty("categoryTypeId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getCategoryTypeId() {
    return categoryTypeId;
  }

  @JsonProperty("categoryTypeId")
  public void setCategoryTypeId(UUID categoryTypeId) {
    this.categoryTypeId = categoryTypeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DesignGroupTypeData designGroupTypeData = (DesignGroupTypeData) o;
    return Objects.equals(this.id, designGroupTypeData.id) &&
        Objects.equals(this.name, designGroupTypeData.name) &&
        Objects.equals(this.sortOrder, designGroupTypeData.sortOrder) &&
        Objects.equals(this.itemTypes, designGroupTypeData.itemTypes) &&
        Objects.equals(this.categoryTypeId, designGroupTypeData.categoryTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sortOrder, itemTypes, categoryTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignGroupTypeData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
    sb.append("    categoryTypeId: ").append(toIndentedString(categoryTypeId)).append("\n");
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

