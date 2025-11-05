package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.DesignGroupData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DesignCategoryData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class DesignCategoryData   {
  private UUID id;
  private UUID categoryTypeId;
  private Long sortOrder;
  private @Valid List<@Valid DesignGroupData> groups = new ArrayList<>();

  public DesignCategoryData() {
  }

  @JsonCreator
  public DesignCategoryData(
    @JsonProperty(required = true, value = "id") UUID id,
    @JsonProperty(required = true, value = "categoryTypeId") UUID categoryTypeId
  ) {
    this.id = id;
    this.categoryTypeId = categoryTypeId;
  }

  /**
   **/
  public DesignCategoryData id(UUID id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public DesignCategoryData categoryTypeId(UUID categoryTypeId) {
    this.categoryTypeId = categoryTypeId;
    return this;
  }

  
  @JsonProperty(required = true, value = "categoryTypeId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getCategoryTypeId() {
    return categoryTypeId;
  }

  @JsonProperty(required = true, value = "categoryTypeId")
  public void setCategoryTypeId(UUID categoryTypeId) {
    this.categoryTypeId = categoryTypeId;
  }

  /**
   **/
  public DesignCategoryData sortOrder(Long sortOrder) {
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
  public DesignCategoryData groups(List<@Valid DesignGroupData> groups) {
    this.groups = groups;
    return this;
  }

  
  @JsonProperty("groups")
  @Valid public List<@Valid DesignGroupData> getGroups() {
    return groups;
  }

  @JsonProperty("groups")
  public void setGroups(List<@Valid DesignGroupData> groups) {
    this.groups = groups;
  }

  public DesignCategoryData addGroupsItem(DesignGroupData groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }

    this.groups.add(groupsItem);
    return this;
  }

  public DesignCategoryData removeGroupsItem(DesignGroupData groupsItem) {
    if (groupsItem != null && this.groups != null) {
      this.groups.remove(groupsItem);
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
    DesignCategoryData designCategoryData = (DesignCategoryData) o;
    return Objects.equals(this.id, designCategoryData.id) &&
        Objects.equals(this.categoryTypeId, designCategoryData.categoryTypeId) &&
        Objects.equals(this.sortOrder, designCategoryData.sortOrder) &&
        Objects.equals(this.groups, designCategoryData.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categoryTypeId, sortOrder, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignCategoryData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categoryTypeId: ").append(toIndentedString(categoryTypeId)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

