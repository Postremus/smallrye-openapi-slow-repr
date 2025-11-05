package org.acme.model;

import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileContextInputDataV3")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileContextInputDataV3   {
  private UUID groupId;
  private UUID organizationId;
  private String name;
  private Boolean primary;

  public ProfileContextInputDataV3() {
  }

  @JsonCreator
  public ProfileContextInputDataV3(
    @JsonProperty(required = true, value = "groupId") UUID groupId,
    @JsonProperty(required = true, value = "organizationId") UUID organizationId
  ) {
    this.groupId = groupId;
    this.organizationId = organizationId;
  }

  /**
   **/
  public ProfileContextInputDataV3 groupId(UUID groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @JsonProperty(required = true, value = "groupId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getGroupId() {
    return groupId;
  }

  @JsonProperty(required = true, value = "groupId")
  public void setGroupId(UUID groupId) {
    this.groupId = groupId;
  }

  /**
   **/
  public ProfileContextInputDataV3 organizationId(UUID organizationId) {
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
   * Name for the context as entered by the user.
   **/
  public ProfileContextInputDataV3 name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
   @Size(min=1,max=255)public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Decides if this is the primary context of this profile. Only one context can be marked as primary. Deprecated. Has no effect anymore, primary context needs to be set through account contexts.
   **/
  public ProfileContextInputDataV3 primary(Boolean primary) {
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
    ProfileContextInputDataV3 profileContextInputDataV3 = (ProfileContextInputDataV3) o;
    return Objects.equals(this.groupId, profileContextInputDataV3.groupId) &&
        Objects.equals(this.organizationId, profileContextInputDataV3.organizationId) &&
        Objects.equals(this.name, profileContextInputDataV3.name) &&
        Objects.equals(this.primary, profileContextInputDataV3.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, organizationId, name, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileContextInputDataV3 {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

