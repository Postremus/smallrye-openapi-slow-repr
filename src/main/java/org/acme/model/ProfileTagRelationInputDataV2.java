package org.acme.model;

import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileTagRelationInputDataV2")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileTagRelationInputDataV2   {
  private UUID profileTagId;

  public ProfileTagRelationInputDataV2() {
  }

  @JsonCreator
  public ProfileTagRelationInputDataV2(
    @JsonProperty(required = true, value = "profileTagId") UUID profileTagId
  ) {
    this.profileTagId = profileTagId;
  }

  /**
   **/
  public ProfileTagRelationInputDataV2 profileTagId(UUID profileTagId) {
    this.profileTagId = profileTagId;
    return this;
  }

  
  @JsonProperty(required = true, value = "profileTagId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getProfileTagId() {
    return profileTagId;
  }

  @JsonProperty(required = true, value = "profileTagId")
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
    ProfileTagRelationInputDataV2 profileTagRelationInputDataV2 = (ProfileTagRelationInputDataV2) o;
    return Objects.equals(this.profileTagId, profileTagRelationInputDataV2.profileTagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileTagId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileTagRelationInputDataV2 {\n");
    
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

