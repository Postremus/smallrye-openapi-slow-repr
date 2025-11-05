package org.acme.model;

import java.util.UUID;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileGroupMessageData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileGroupMessageData   {
  private UUID id;
  private String matchCode;
  private TranslationHolderData name;
  private Boolean deleted;
  private UUID tenantId;

  public ProfileGroupMessageData() {
  }

  /**
   **/
  public ProfileGroupMessageData id(UUID id) {
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
  public ProfileGroupMessageData matchCode(String matchCode) {
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
  public ProfileGroupMessageData name(TranslationHolderData name) {
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
  public ProfileGroupMessageData deleted(Boolean deleted) {
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
  public ProfileGroupMessageData tenantId(UUID tenantId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileGroupMessageData profileGroupMessageData = (ProfileGroupMessageData) o;
    return Objects.equals(this.id, profileGroupMessageData.id) &&
        Objects.equals(this.matchCode, profileGroupMessageData.matchCode) &&
        Objects.equals(this.name, profileGroupMessageData.name) &&
        Objects.equals(this.deleted, profileGroupMessageData.deleted) &&
        Objects.equals(this.tenantId, profileGroupMessageData.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, matchCode, name, deleted, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileGroupMessageData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

