package org.acme.model;

import java.util.Date;
import java.util.UUID;
import org.acme.model.ContextCreationMode;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileContextData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileContextData   {
  private Long id;
  private String contextId;
  private UUID groupId;
  private String foreignId;
  private ContextCreationMode creationMode;
  private String name;
  private Boolean primary;
  private Date lastAuthorization;

  public ProfileContextData() {
  }

  /**
   **/
  public ProfileContextData id(Long id) {
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
   **/
  public ProfileContextData contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  @JsonProperty("contextId")
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  /**
   **/
  public ProfileContextData groupId(UUID groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @JsonProperty("groupId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getGroupId() {
    return groupId;
  }

  @JsonProperty("groupId")
  public void setGroupId(UUID groupId) {
    this.groupId = groupId;
  }

  /**
   **/
  public ProfileContextData foreignId(String foreignId) {
    this.foreignId = foreignId;
    return this;
  }

  
  @JsonProperty("foreignId")
  public String getForeignId() {
    return foreignId;
  }

  @JsonProperty("foreignId")
  public void setForeignId(String foreignId) {
    this.foreignId = foreignId;
  }

  /**
   **/
  public ProfileContextData creationMode(ContextCreationMode creationMode) {
    this.creationMode = creationMode;
    return this;
  }

  
  @JsonProperty("creationMode")
  public ContextCreationMode getCreationMode() {
    return creationMode;
  }

  @JsonProperty("creationMode")
  public void setCreationMode(ContextCreationMode creationMode) {
    this.creationMode = creationMode;
  }

  /**
   **/
  public ProfileContextData name(String name) {
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
   * Decides if this is the primary context of this profile. Only one context can be marked as primary.
   **/
  public ProfileContextData primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }

  @JsonProperty("primary")
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  /**
   **/
  public ProfileContextData lastAuthorization(Date lastAuthorization) {
    this.lastAuthorization = lastAuthorization;
    return this;
  }

  
  @JsonProperty("lastAuthorization")
  public Date getLastAuthorization() {
    return lastAuthorization;
  }

  @JsonProperty("lastAuthorization")
  public void setLastAuthorization(Date lastAuthorization) {
    this.lastAuthorization = lastAuthorization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileContextData profileContextData = (ProfileContextData) o;
    return Objects.equals(this.id, profileContextData.id) &&
        Objects.equals(this.contextId, profileContextData.contextId) &&
        Objects.equals(this.groupId, profileContextData.groupId) &&
        Objects.equals(this.foreignId, profileContextData.foreignId) &&
        Objects.equals(this.creationMode, profileContextData.creationMode) &&
        Objects.equals(this.name, profileContextData.name) &&
        Objects.equals(this.primary, profileContextData.primary) &&
        Objects.equals(this.lastAuthorization, profileContextData.lastAuthorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contextId, groupId, foreignId, creationMode, name, primary, lastAuthorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileContextData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    foreignId: ").append(toIndentedString(foreignId)).append("\n");
    sb.append("    creationMode: ").append(toIndentedString(creationMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    lastAuthorization: ").append(toIndentedString(lastAuthorization)).append("\n");
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

