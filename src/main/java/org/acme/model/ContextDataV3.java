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



@JsonTypeName("ContextDataV3")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ContextDataV3   {
  private String contextId;
  private UUID groupId;
  private UUID organizationId;
  private UUID tenantId;
  private ContextCreationMode creationMode;
  private String name;
  private String effectiveName;
  private Boolean primary;
  private Date lastAuthorization;

  public ContextDataV3() {
  }

  /**
   **/
  public ContextDataV3 contextId(String contextId) {
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
  public ContextDataV3 groupId(UUID groupId) {
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
  public ContextDataV3 organizationId(UUID organizationId) {
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
  public ContextDataV3 tenantId(UUID tenantId) {
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
  public ContextDataV3 creationMode(ContextCreationMode creationMode) {
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
  public ContextDataV3 name(String name) {
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
  public ContextDataV3 effectiveName(String effectiveName) {
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
  public ContextDataV3 primary(Boolean primary) {
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
  public ContextDataV3 lastAuthorization(Date lastAuthorization) {
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
    ContextDataV3 contextDataV3 = (ContextDataV3) o;
    return Objects.equals(this.contextId, contextDataV3.contextId) &&
        Objects.equals(this.groupId, contextDataV3.groupId) &&
        Objects.equals(this.organizationId, contextDataV3.organizationId) &&
        Objects.equals(this.tenantId, contextDataV3.tenantId) &&
        Objects.equals(this.creationMode, contextDataV3.creationMode) &&
        Objects.equals(this.name, contextDataV3.name) &&
        Objects.equals(this.effectiveName, contextDataV3.effectiveName) &&
        Objects.equals(this.primary, contextDataV3.primary) &&
        Objects.equals(this.lastAuthorization, contextDataV3.lastAuthorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, groupId, organizationId, tenantId, creationMode, name, effectiveName, primary, lastAuthorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextDataV3 {\n");
    
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

