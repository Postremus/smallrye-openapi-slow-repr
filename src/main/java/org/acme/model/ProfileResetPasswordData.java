package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileResetPasswordData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileResetPasswordData   {
  private String username;
  private String clientId;
  private String redirectUri;
  private Integer lifespan;

  public ProfileResetPasswordData() {
  }

  @JsonCreator
  public ProfileResetPasswordData(
    @JsonProperty(required = true, value = "username") String username
  ) {
    this.username = username;
  }

  /**
   * Username of the user which the email will be send to.
   **/
  public ProfileResetPasswordData username(String username) {
    this.username = username;
    return this;
  }

  
  @JsonProperty(required = true, value = "username")
  @NotNull public String getUsername() {
    return username;
  }

  @JsonProperty(required = true, value = "username")
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * client_id of the oidc application.
   **/
  public ProfileResetPasswordData clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }

  @JsonProperty("clientId")
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * URI where the user will get redirected to after completing password reset.
   **/
  public ProfileResetPasswordData redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  
  @JsonProperty("redirectUri")
  public String getRedirectUri() {
    return redirectUri;
  }

  @JsonProperty("redirectUri")
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  /**
   * Time in seconds for which the link will be valid.
   **/
  public ProfileResetPasswordData lifespan(Integer lifespan) {
    this.lifespan = lifespan;
    return this;
  }

  
  @JsonProperty("lifespan")
  public Integer getLifespan() {
    return lifespan;
  }

  @JsonProperty("lifespan")
  public void setLifespan(Integer lifespan) {
    this.lifespan = lifespan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileResetPasswordData profileResetPasswordData = (ProfileResetPasswordData) o;
    return Objects.equals(this.username, profileResetPasswordData.username) &&
        Objects.equals(this.clientId, profileResetPasswordData.clientId) &&
        Objects.equals(this.redirectUri, profileResetPasswordData.redirectUri) &&
        Objects.equals(this.lifespan, profileResetPasswordData.lifespan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, clientId, redirectUri, lifespan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileResetPasswordData {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    lifespan: ").append(toIndentedString(lifespan)).append("\n");
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

