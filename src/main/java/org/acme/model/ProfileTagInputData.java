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



@JsonTypeName("ProfileTagInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileTagInputData   {
  private String matchCode;
  private TranslationHolderData name;
  private UUID tenantId;

  public ProfileTagInputData() {
  }

  @JsonCreator
  public ProfileTagInputData(
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
  public ProfileTagInputData matchCode(String matchCode) {
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
   * Translated profile tag name.
   **/
  public ProfileTagInputData name(TranslationHolderData name) {
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
  public ProfileTagInputData tenantId(UUID tenantId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileTagInputData profileTagInputData = (ProfileTagInputData) o;
    return Objects.equals(this.matchCode, profileTagInputData.matchCode) &&
        Objects.equals(this.name, profileTagInputData.name) &&
        Objects.equals(this.tenantId, profileTagInputData.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCode, name, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileTagInputData {\n");
    
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

