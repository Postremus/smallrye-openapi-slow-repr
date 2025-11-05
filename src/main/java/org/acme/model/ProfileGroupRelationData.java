package org.acme.model;

import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileGroupRelationData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileGroupRelationData   {
  private UUID tenantId;
  private UUID accountProfileGroupId;
  private UUID organizationId;
  private String name;
  private Boolean primary;

  public ProfileGroupRelationData() {
  }

  @JsonCreator
  public ProfileGroupRelationData(
    @JsonProperty(required = true, value = "tenantId") UUID tenantId,
    @JsonProperty(required = true, value = "accountProfileGroupId") UUID accountProfileGroupId,
    @JsonProperty(required = true, value = "organizationId") UUID organizationId
  ) {
    this.tenantId = tenantId;
    this.accountProfileGroupId = accountProfileGroupId;
    this.organizationId = organizationId;
  }

  /**
   **/
  public ProfileGroupRelationData tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  
  @JsonProperty(required = true, value = "tenantId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getTenantId() {
    return tenantId;
  }

  @JsonProperty(required = true, value = "tenantId")
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  /**
   **/
  public ProfileGroupRelationData accountProfileGroupId(UUID accountProfileGroupId) {
    this.accountProfileGroupId = accountProfileGroupId;
    return this;
  }

  
  @JsonProperty(required = true, value = "accountProfileGroupId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getAccountProfileGroupId() {
    return accountProfileGroupId;
  }

  @JsonProperty(required = true, value = "accountProfileGroupId")
  public void setAccountProfileGroupId(UUID accountProfileGroupId) {
    this.accountProfileGroupId = accountProfileGroupId;
  }

  /**
   **/
  public ProfileGroupRelationData organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @JsonProperty(required = true, value = "organizationId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getOrganizationId() {
    return organizationId;
  }

  @JsonProperty(required = true, value = "organizationId")
  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }

  /**
   * Name for this group relation. Will be automatically generated if left null.
   **/
  public ProfileGroupRelationData name(String name) {
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
  public ProfileGroupRelationData primary(Boolean primary) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileGroupRelationData profileGroupRelationData = (ProfileGroupRelationData) o;
    return Objects.equals(this.tenantId, profileGroupRelationData.tenantId) &&
        Objects.equals(this.accountProfileGroupId, profileGroupRelationData.accountProfileGroupId) &&
        Objects.equals(this.organizationId, profileGroupRelationData.organizationId) &&
        Objects.equals(this.name, profileGroupRelationData.name) &&
        Objects.equals(this.primary, profileGroupRelationData.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, accountProfileGroupId, organizationId, name, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileGroupRelationData {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    accountProfileGroupId: ").append(toIndentedString(accountProfileGroupId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

