package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.CSSSettingData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DesignGroupData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class DesignGroupData   {
  private UUID id;
  private UUID groupTypeId;
  private Long sortOrder;
  private @Valid List<@Valid CSSSettingData> items = new ArrayList<>();

  public DesignGroupData() {
  }

  @JsonCreator
  public DesignGroupData(
    @JsonProperty(required = true, value = "groupTypeId") UUID groupTypeId
  ) {
    this.groupTypeId = groupTypeId;
  }

  /**
   **/
  public DesignGroupData id(UUID id) {
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
  public DesignGroupData groupTypeId(UUID groupTypeId) {
    this.groupTypeId = groupTypeId;
    return this;
  }

  
  @JsonProperty(required = true, value = "groupTypeId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getGroupTypeId() {
    return groupTypeId;
  }

  @JsonProperty(required = true, value = "groupTypeId")
  public void setGroupTypeId(UUID groupTypeId) {
    this.groupTypeId = groupTypeId;
  }

  /**
   **/
  public DesignGroupData sortOrder(Long sortOrder) {
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
  public DesignGroupData items(List<@Valid CSSSettingData> items) {
    this.items = items;
    return this;
  }

  
  @JsonProperty("items")
  @Valid public List<@Valid CSSSettingData> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid CSSSettingData> items) {
    this.items = items;
  }

  public DesignGroupData addItemsItem(CSSSettingData itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public DesignGroupData removeItemsItem(CSSSettingData itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DesignGroupData designGroupData = (DesignGroupData) o;
    return Objects.equals(this.id, designGroupData.id) &&
        Objects.equals(this.groupTypeId, designGroupData.groupTypeId) &&
        Objects.equals(this.sortOrder, designGroupData.sortOrder) &&
        Objects.equals(this.items, designGroupData.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupTypeId, sortOrder, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignGroupData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupTypeId: ").append(toIndentedString(groupTypeId)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

