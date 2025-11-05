package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.OrganizationalChartNodeType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OrganizationalChartNodeData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class OrganizationalChartNodeData   {
  private UUID id;
  private String name;
  private String city;
  private Boolean isMandator;
  private OrganizationalChartNodeType type;
  private @Valid List<@Valid OrganizationalChartNodeData> childs = new ArrayList<>();

  public OrganizationalChartNodeData() {
  }

  /**
   **/
  public OrganizationalChartNodeData id(UUID id) {
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
  public OrganizationalChartNodeData name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public OrganizationalChartNodeData city(String city) {
    this.city = city;
    return this;
  }

  
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  public OrganizationalChartNodeData isMandator(Boolean isMandator) {
    this.isMandator = isMandator;
    return this;
  }

  
  @JsonProperty("isMandator")
  public Boolean getIsMandator() {
    return isMandator;
  }

  @JsonProperty("isMandator")
  public void setIsMandator(Boolean isMandator) {
    this.isMandator = isMandator;
  }

  /**
   **/
  public OrganizationalChartNodeData type(OrganizationalChartNodeType type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
  public OrganizationalChartNodeType getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(OrganizationalChartNodeType type) {
    this.type = type;
  }

  /**
   **/
  public OrganizationalChartNodeData childs(List<@Valid OrganizationalChartNodeData> childs) {
    this.childs = childs;
    return this;
  }

  
  @JsonProperty("childs")
  @Valid public List<@Valid OrganizationalChartNodeData> getChilds() {
    return childs;
  }

  @JsonProperty("childs")
  public void setChilds(List<@Valid OrganizationalChartNodeData> childs) {
    this.childs = childs;
  }

  public OrganizationalChartNodeData addChildsItem(OrganizationalChartNodeData childsItem) {
    if (this.childs == null) {
      this.childs = new ArrayList<>();
    }

    this.childs.add(childsItem);
    return this;
  }

  public OrganizationalChartNodeData removeChildsItem(OrganizationalChartNodeData childsItem) {
    if (childsItem != null && this.childs != null) {
      this.childs.remove(childsItem);
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
    OrganizationalChartNodeData organizationalChartNodeData = (OrganizationalChartNodeData) o;
    return Objects.equals(this.id, organizationalChartNodeData.id) &&
        Objects.equals(this.name, organizationalChartNodeData.name) &&
        Objects.equals(this.city, organizationalChartNodeData.city) &&
        Objects.equals(this.isMandator, organizationalChartNodeData.isMandator) &&
        Objects.equals(this.type, organizationalChartNodeData.type) &&
        Objects.equals(this.childs, organizationalChartNodeData.childs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, city, isMandator, type, childs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationalChartNodeData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    isMandator: ").append(toIndentedString(isMandator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    childs: ").append(toIndentedString(childs)).append("\n");
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

