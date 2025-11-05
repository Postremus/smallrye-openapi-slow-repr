package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.DesignGroupTypeData;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DesignCategoryTypeData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class DesignCategoryTypeData   {
  private UUID id;
  private TranslationHolderData name;
  private Long sortOrder;
  private @Valid List<@Valid DesignGroupTypeData> groupTypes = new ArrayList<>();

  public DesignCategoryTypeData() {
  }

  /**
   **/
  public DesignCategoryTypeData id(UUID id) {
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
  public DesignCategoryTypeData name(TranslationHolderData name) {
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
  public DesignCategoryTypeData sortOrder(Long sortOrder) {
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
  public DesignCategoryTypeData groupTypes(List<@Valid DesignGroupTypeData> groupTypes) {
    this.groupTypes = groupTypes;
    return this;
  }

  
  @JsonProperty("groupTypes")
  @Valid public List<@Valid DesignGroupTypeData> getGroupTypes() {
    return groupTypes;
  }

  @JsonProperty("groupTypes")
  public void setGroupTypes(List<@Valid DesignGroupTypeData> groupTypes) {
    this.groupTypes = groupTypes;
  }

  public DesignCategoryTypeData addGroupTypesItem(DesignGroupTypeData groupTypesItem) {
    if (this.groupTypes == null) {
      this.groupTypes = new ArrayList<>();
    }

    this.groupTypes.add(groupTypesItem);
    return this;
  }

  public DesignCategoryTypeData removeGroupTypesItem(DesignGroupTypeData groupTypesItem) {
    if (groupTypesItem != null && this.groupTypes != null) {
      this.groupTypes.remove(groupTypesItem);
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
    DesignCategoryTypeData designCategoryTypeData = (DesignCategoryTypeData) o;
    return Objects.equals(this.id, designCategoryTypeData.id) &&
        Objects.equals(this.name, designCategoryTypeData.name) &&
        Objects.equals(this.sortOrder, designCategoryTypeData.sortOrder) &&
        Objects.equals(this.groupTypes, designCategoryTypeData.groupTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sortOrder, groupTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignCategoryTypeData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    groupTypes: ").append(toIndentedString(groupTypes)).append("\n");
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

