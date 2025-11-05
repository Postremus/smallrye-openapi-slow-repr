package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.ProfileGroupApplicationGrantData;
import org.acme.model.ProfileGroupRightInputData;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileGroupInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileGroupInputData   {
  private String matchCode;
  private TranslationHolderData name;
  private UUID tenantId;
  private @Valid List<@Valid ProfileGroupRightInputData> rights = new ArrayList<>();
  private @Valid List<@Valid ProfileGroupApplicationGrantData> accessGrants = new ArrayList<>();

  public ProfileGroupInputData() {
  }

  @JsonCreator
  public ProfileGroupInputData(
    @JsonProperty(required = true, value = "matchCode") String matchCode,
    @JsonProperty(required = true, value = "name") TranslationHolderData name,
    @JsonProperty(required = true, value = "tenantId") UUID tenantId
  ) {
    this.matchCode = matchCode;
    this.name = name;
    this.tenantId = tenantId;
  }

  /**
   * Matchcode of this object. Matchcodes are upper cases abbreviations of e.g. the object name, or the upper cased functional key of the object.
   **/
  public ProfileGroupInputData matchCode(String matchCode) {
    this.matchCode = matchCode;
    return this;
  }

  
  @JsonProperty(required = true, value = "matchCode")
  @NotNull  @Pattern(regexp="[A-Z0-9]*") @Size(max=100)public String getMatchCode() {
    return matchCode;
  }

  @JsonProperty(required = true, value = "matchCode")
  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }

  /**
   * Translated account profile group name.
   **/
  public ProfileGroupInputData name(TranslationHolderData name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty(required = true, value = "name")
  @NotNull @Valid public TranslationHolderData getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(TranslationHolderData name) {
    this.name = name;
  }

  /**
   **/
  public ProfileGroupInputData tenantId(UUID tenantId) {
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
  public ProfileGroupInputData rights(List<@Valid ProfileGroupRightInputData> rights) {
    this.rights = rights;
    return this;
  }

  
  @JsonProperty("rights")
  @Valid public List<@Valid ProfileGroupRightInputData> getRights() {
    return rights;
  }

  @JsonProperty("rights")
  public void setRights(List<@Valid ProfileGroupRightInputData> rights) {
    this.rights = rights;
  }

  public ProfileGroupInputData addRightsItem(ProfileGroupRightInputData rightsItem) {
    if (this.rights == null) {
      this.rights = new ArrayList<>();
    }

    this.rights.add(rightsItem);
    return this;
  }

  public ProfileGroupInputData removeRightsItem(ProfileGroupRightInputData rightsItem) {
    if (rightsItem != null && this.rights != null) {
      this.rights.remove(rightsItem);
    }

    return this;
  }
  /**
   * List of all applications this profile group is allowed to use.
   **/
  public ProfileGroupInputData accessGrants(List<@Valid ProfileGroupApplicationGrantData> accessGrants) {
    this.accessGrants = accessGrants;
    return this;
  }

  
  @JsonProperty("accessGrants")
  @Valid public List<@Valid ProfileGroupApplicationGrantData> getAccessGrants() {
    return accessGrants;
  }

  @JsonProperty("accessGrants")
  public void setAccessGrants(List<@Valid ProfileGroupApplicationGrantData> accessGrants) {
    this.accessGrants = accessGrants;
  }

  public ProfileGroupInputData addAccessGrantsItem(ProfileGroupApplicationGrantData accessGrantsItem) {
    if (this.accessGrants == null) {
      this.accessGrants = new ArrayList<>();
    }

    this.accessGrants.add(accessGrantsItem);
    return this;
  }

  public ProfileGroupInputData removeAccessGrantsItem(ProfileGroupApplicationGrantData accessGrantsItem) {
    if (accessGrantsItem != null && this.accessGrants != null) {
      this.accessGrants.remove(accessGrantsItem);
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
    ProfileGroupInputData profileGroupInputData = (ProfileGroupInputData) o;
    return Objects.equals(this.matchCode, profileGroupInputData.matchCode) &&
        Objects.equals(this.name, profileGroupInputData.name) &&
        Objects.equals(this.tenantId, profileGroupInputData.tenantId) &&
        Objects.equals(this.rights, profileGroupInputData.rights) &&
        Objects.equals(this.accessGrants, profileGroupInputData.accessGrants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCode, name, tenantId, rights, accessGrants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileGroupInputData {\n");
    
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    sb.append("    accessGrants: ").append(toIndentedString(accessGrants)).append("\n");
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

