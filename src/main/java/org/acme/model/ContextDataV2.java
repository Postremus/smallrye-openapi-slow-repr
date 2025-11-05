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



@JsonTypeName("ContextDataV2")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ContextDataV2   {
  private String contextId;
  private UUID groupId;
  private UUID organizationId;
  private UUID tenantId;
  private ContextCreationMode creationMode;
  private String name;
  private String effectiveName;
  private Boolean primary;
  private Date lastAuthorization;

  public ContextDataV2() {
  }

  /**
   **/
  public ContextDataV2 contextId(String contextId) {
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
  public ContextDataV2 groupId(UUID groupId) {
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
  public ContextDataV2 organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @JsonProperty("organizationId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("organizationId")
  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }

  /**
   **/
  public ContextDataV2 tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  
  @JsonProperty("tenantId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getTenantId() {
    return tenantId;
  }

  @JsonProperty("tenantId")
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  /**
   **/
  public ContextDataV2 creationMode(ContextCreationMode creationMode) {
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
   * Name for the context as entered by the user.
   **/
  public ContextDataV2 name(String name) {
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
   * Name of this context, as it should be displayed in e.g. the context selection. This can either be: * the &#x60;name&#x60; * or an automatically generated name. The service generated the name using e.g. the organization. 
   **/
  public ContextDataV2 effectiveName(String effectiveName) {
    this.effectiveName = effectiveName;
    return this;
  }

  
  @JsonProperty("effectiveName")
  public String getEffectiveName() {
    return effectiveName;
  }

  @JsonProperty("effectiveName")
  public void setEffectiveName(String effectiveName) {
    this.effectiveName = effectiveName;
  }

  /**
   * Decides if this is the primary context of this account. Only one context can be marked as primary for the account.
   **/
  public ContextDataV2 primary(Boolean primary) {
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
  public ContextDataV2 lastAuthorization(Date lastAuthorization) {
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
    ContextDataV2 contextDataV2 = (ContextDataV2) o;
    return Objects.equals(this.contextId, contextDataV2.contextId) &&
        Objects.equals(this.groupId, contextDataV2.groupId) &&
        Objects.equals(this.organizationId, contextDataV2.organizationId) &&
        Objects.equals(this.tenantId, contextDataV2.tenantId) &&
        Objects.equals(this.creationMode, contextDataV2.creationMode) &&
        Objects.equals(this.name, contextDataV2.name) &&
        Objects.equals(this.effectiveName, contextDataV2.effectiveName) &&
        Objects.equals(this.primary, contextDataV2.primary) &&
        Objects.equals(this.lastAuthorization, contextDataV2.lastAuthorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, groupId, organizationId, tenantId, creationMode, name, effectiveName, primary, lastAuthorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextDataV2 {\n");
    
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    creationMode: ").append(toIndentedString(creationMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    effectiveName: ").append(toIndentedString(effectiveName)).append("\n");
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

