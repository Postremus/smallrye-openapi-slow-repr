package org.acme.model;

import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileTagRelationDataV2")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileTagRelationDataV2   {
  private UUID tenantId;
  private UUID profileTagId;

  public ProfileTagRelationDataV2() {
  }

  /**
   **/
  public ProfileTagRelationDataV2 tenantId(UUID tenantId) {
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
  public ProfileTagRelationDataV2 profileTagId(UUID profileTagId) {
    this.profileTagId = profileTagId;
    return this;
  }

  
  @JsonProperty("profileTagId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getProfileTagId() {
    return profileTagId;
  }

  @JsonProperty("profileTagId")
  public void setProfileTagId(UUID profileTagId) {
    this.profileTagId = profileTagId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileTagRelationDataV2 profileTagRelationDataV2 = (ProfileTagRelationDataV2) o;
    return Objects.equals(this.tenantId, profileTagRelationDataV2.tenantId) &&
        Objects.equals(this.profileTagId, profileTagRelationDataV2.profileTagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, profileTagId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileTagRelationDataV2 {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    profileTagId: ").append(toIndentedString(profileTagId)).append("\n");
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

