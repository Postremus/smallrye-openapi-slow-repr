package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AccountEmailChangeMessageData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class AccountEmailChangeMessageData   {
  private String keycloakId;
  private String targetEmail;
  private String sourceEmail;

  public AccountEmailChangeMessageData() {
  }

  /**
   * Id which identifies this account in keycloak.
   **/
  public AccountEmailChangeMessageData keycloakId(String keycloakId) {
    this.keycloakId = keycloakId;
    return this;
  }

  
  @JsonProperty("keycloakId")
  public String getKeycloakId() {
    return keycloakId;
  }

  @JsonProperty("keycloakId")
  public void setKeycloakId(String keycloakId) {
    this.keycloakId = keycloakId;
  }

  /**
   * Target Email address of this user. Has to be unique in the system. This Email has just been set for this user.
   **/
  public AccountEmailChangeMessageData targetEmail(String targetEmail) {
    this.targetEmail = targetEmail;
    return this;
  }

  
  @JsonProperty("targetEmail")
  public String getTargetEmail() {
    return targetEmail;
  }

  @JsonProperty("targetEmail")
  public void setTargetEmail(String targetEmail) {
    this.targetEmail = targetEmail;
  }

  /**
   * Source Email address of this user. Has to be unique in the system. This Email is the last known Email of this user.
   **/
  public AccountEmailChangeMessageData sourceEmail(String sourceEmail) {
    this.sourceEmail = sourceEmail;
    return this;
  }

  
  @JsonProperty("sourceEmail")
  public String getSourceEmail() {
    return sourceEmail;
  }

  @JsonProperty("sourceEmail")
  public void setSourceEmail(String sourceEmail) {
    this.sourceEmail = sourceEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountEmailChangeMessageData accountEmailChangeMessageData = (AccountEmailChangeMessageData) o;
    return Objects.equals(this.keycloakId, accountEmailChangeMessageData.keycloakId) &&
        Objects.equals(this.targetEmail, accountEmailChangeMessageData.targetEmail) &&
        Objects.equals(this.sourceEmail, accountEmailChangeMessageData.sourceEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keycloakId, targetEmail, sourceEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountEmailChangeMessageData {\n");
    
    sb.append("    keycloakId: ").append(toIndentedString(keycloakId)).append("\n");
    sb.append("    targetEmail: ").append(toIndentedString(targetEmail)).append("\n");
    sb.append("    sourceEmail: ").append(toIndentedString(sourceEmail)).append("\n");
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

