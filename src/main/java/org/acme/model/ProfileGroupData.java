package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.ProfileGroupApplicationGrantData;
import org.acme.model.ProfileGroupRightData;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileGroupData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileGroupData   {
  private UUID id;
  private String matchCode;
  private TranslationHolderData name;
  private Boolean deleted;
  private UUID tenantId;
  private Boolean modifieable;
  private @Valid List<@Valid ProfileGroupRightData> rights = new ArrayList<>();
  private @Valid List<@Valid ProfileGroupApplicationGrantData> accessGrants = new ArrayList<>();

  public ProfileGroupData() {
  }

  /**
   **/
  public ProfileGroupData id(UUID id) {
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
   * Matchcode of this object. Matchcodes are upper cases abbreviations of e.g. the object name, or the upper cased functional key of the object.
   **/
  public ProfileGroupData matchCode(String matchCode) {
    this.matchCode = matchCode;
    return this;
  }

  
  @JsonProperty("matchCode")
   @Pattern(regexp="[A-Z0-9]*") @Size(max=100)public String getMatchCode() {
    return matchCode;
  }

  @JsonProperty("matchCode")
  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }

  /**
   * Translated account profile group name.
   **/
  public ProfileGroupData name(TranslationHolderData name) {
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
   * true if this account profile group is deleted.
   **/
  public ProfileGroupData deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  @JsonProperty("deleted")
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  /**
   **/
  public ProfileGroupData tenantId(UUID tenantId) {
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
  public ProfileGroupData modifieable(Boolean modifieable) {
    this.modifieable = modifieable;
    return this;
  }

  
  @JsonProperty("modifieable")
  public Boolean getModifieable() {
    return modifieable;
  }

  @JsonProperty("modifieable")
  public void setModifieable(Boolean modifieable) {
    this.modifieable = modifieable;
  }

  /**
   **/
  public ProfileGroupData rights(List<@Valid ProfileGroupRightData> rights) {
    this.rights = rights;
    return this;
  }

  
  @JsonProperty("rights")
  @Valid public List<@Valid ProfileGroupRightData> getRights() {
    return rights;
  }

  @JsonProperty("rights")
  public void setRights(List<@Valid ProfileGroupRightData> rights) {
    this.rights = rights;
  }

  public ProfileGroupData addRightsItem(ProfileGroupRightData rightsItem) {
    if (this.rights == null) {
      this.rights = new ArrayList<>();
    }

    this.rights.add(rightsItem);
    return this;
  }

  public ProfileGroupData removeRightsItem(ProfileGroupRightData rightsItem) {
    if (rightsItem != null && this.rights != null) {
      this.rights.remove(rightsItem);
    }

    return this;
  }
  /**
   * List of all applications this profile group is allowed to use.
   **/
  public ProfileGroupData accessGrants(List<@Valid ProfileGroupApplicationGrantData> accessGrants) {
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

  public ProfileGroupData addAccessGrantsItem(ProfileGroupApplicationGrantData accessGrantsItem) {
    if (this.accessGrants == null) {
      this.accessGrants = new ArrayList<>();
    }

    this.accessGrants.add(accessGrantsItem);
    return this;
  }

  public ProfileGroupData removeAccessGrantsItem(ProfileGroupApplicationGrantData accessGrantsItem) {
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
    ProfileGroupData profileGroupData = (ProfileGroupData) o;
    return Objects.equals(this.id, profileGroupData.id) &&
        Objects.equals(this.matchCode, profileGroupData.matchCode) &&
        Objects.equals(this.name, profileGroupData.name) &&
        Objects.equals(this.deleted, profileGroupData.deleted) &&
        Objects.equals(this.tenantId, profileGroupData.tenantId) &&
        Objects.equals(this.modifieable, profileGroupData.modifieable) &&
        Objects.equals(this.rights, profileGroupData.rights) &&
        Objects.equals(this.accessGrants, profileGroupData.accessGrants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, matchCode, name, deleted, tenantId, modifieable, rights, accessGrants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileGroupData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    modifieable: ").append(toIndentedString(modifieable)).append("\n");
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

