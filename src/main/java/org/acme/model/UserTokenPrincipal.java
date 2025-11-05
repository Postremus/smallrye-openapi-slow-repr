package org.acme.model;

import java.util.Date;
import org.acme.model.UserContext;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UserTokenPrincipal")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class UserTokenPrincipal   {
  private String name;
  private Date loginTime;
  private Date sessionExpires;
  private UserContext activeContext;
  private String securityToken;

  public UserTokenPrincipal() {
  }

  /**
   **/
  public UserTokenPrincipal name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public UserTokenPrincipal loginTime(Date loginTime) {
    this.loginTime = loginTime;
    return this;
  }

  
  @JsonProperty("loginTime")
  public Date getLoginTime() {
    return loginTime;
  }

  @JsonProperty("loginTime")
  public void setLoginTime(Date loginTime) {
    this.loginTime = loginTime;
  }

  /**
   **/
  public UserTokenPrincipal sessionExpires(Date sessionExpires) {
    this.sessionExpires = sessionExpires;
    return this;
  }

  
  @JsonProperty("sessionExpires")
  public Date getSessionExpires() {
    return sessionExpires;
  }

  @JsonProperty("sessionExpires")
  public void setSessionExpires(Date sessionExpires) {
    this.sessionExpires = sessionExpires;
  }

  /**
   **/
  public UserTokenPrincipal activeContext(UserContext activeContext) {
    this.activeContext = activeContext;
    return this;
  }

  
  @JsonProperty("activeContext")
  @Valid public UserContext getActiveContext() {
    return activeContext;
  }

  @JsonProperty("activeContext")
  public void setActiveContext(UserContext activeContext) {
    this.activeContext = activeContext;
  }

  /**
   **/
  public UserTokenPrincipal securityToken(String securityToken) {
    this.securityToken = securityToken;
    return this;
  }

  
  @JsonProperty("securityToken")
  public String getSecurityToken() {
    return securityToken;
  }

  @JsonProperty("securityToken")
  public void setSecurityToken(String securityToken) {
    this.securityToken = securityToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTokenPrincipal userTokenPrincipal = (UserTokenPrincipal) o;
    return Objects.equals(this.name, userTokenPrincipal.name) &&
        Objects.equals(this.loginTime, userTokenPrincipal.loginTime) &&
        Objects.equals(this.sessionExpires, userTokenPrincipal.sessionExpires) &&
        Objects.equals(this.activeContext, userTokenPrincipal.activeContext) &&
        Objects.equals(this.securityToken, userTokenPrincipal.securityToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, loginTime, sessionExpires, activeContext, securityToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokenPrincipal {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    loginTime: ").append(toIndentedString(loginTime)).append("\n");
    sb.append("    sessionExpires: ").append(toIndentedString(sessionExpires)).append("\n");
    sb.append("    activeContext: ").append(toIndentedString(activeContext)).append("\n");
    sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
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

