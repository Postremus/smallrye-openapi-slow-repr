package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Holds the access token.
 **/

@JsonTypeName("TokenData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class TokenData   {
  private String token;
  private Integer expiresIn;
  private String sessionToken;
  private Integer sessionTokenExpiresIn;

  public TokenData() {
  }

  /**
   * An opaque token data string, as retrieved from the authorization server. No length restricts.
   **/
  public TokenData token(String token) {
    this.token = token;
    return this;
  }

  
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  @JsonProperty("token")
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * In how many seconds the token will expire since retrieval from the authorization server. After this time expires, requests with this token     will fail, and most likely result in a 401/403 from the application backend. The client should therefore add a bit of leeway for its refresh logic, like minus 30s, to ensure the token is not expired before calling the application backend.
   **/
  public TokenData expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  
  @JsonProperty("expiresIn")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty("expiresIn")
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   * An opaque token data string, as retrieved from the resource server. Contains the session token. No length restricts.
   **/
  public TokenData sessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

  
  @JsonProperty("sessionToken")
  public String getSessionToken() {
    return sessionToken;
  }

  @JsonProperty("sessionToken")
  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }

  /**
   * In how many seconds the sessionToken will expire since retrieval from the resource server. After this time expires, requests with this token will fail, and most likely result in a 401/403 from the application backend. The client should therefore add a bit of leeway for its refresh logic, like minus 30s, to ensure the token is not expired before calling the application backend.
   **/
  public TokenData sessionTokenExpiresIn(Integer sessionTokenExpiresIn) {
    this.sessionTokenExpiresIn = sessionTokenExpiresIn;
    return this;
  }

  
  @JsonProperty("sessionTokenExpiresIn")
  public Integer getSessionTokenExpiresIn() {
    return sessionTokenExpiresIn;
  }

  @JsonProperty("sessionTokenExpiresIn")
  public void setSessionTokenExpiresIn(Integer sessionTokenExpiresIn) {
    this.sessionTokenExpiresIn = sessionTokenExpiresIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenData tokenData = (TokenData) o;
    return Objects.equals(this.token, tokenData.token) &&
        Objects.equals(this.expiresIn, tokenData.expiresIn) &&
        Objects.equals(this.sessionToken, tokenData.sessionToken) &&
        Objects.equals(this.sessionTokenExpiresIn, tokenData.sessionTokenExpiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, expiresIn, sessionToken, sessionTokenExpiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenData {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    sessionTokenExpiresIn: ").append(toIndentedString(sessionTokenExpiresIn)).append("\n");
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

