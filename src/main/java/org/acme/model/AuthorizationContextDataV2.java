package org.acme.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.acme.model.Context;
import org.acme.model.ContextGroupDataV2;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Enriched context information used for authorization.
 **/

@JsonTypeName("AuthorizationContextDataV2")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class AuthorizationContextDataV2   {
  private String id;
  private String name;
  private String userFirstname;
  private String userLastname;
  private String contextType;
  private String language;
  private @Valid List<@Valid Context> contextRelations = new ArrayList<>();
  private @Valid Set<String> userRights = new LinkedHashSet<>();
  private ContextGroupDataV2 group;
  private Boolean favourite;
  private Boolean primary;
  private Date lastAuthorization;
  private Boolean lastAuthorizedContext;

  public AuthorizationContextDataV2() {
  }

  /**
   **/
  public AuthorizationContextDataV2 id(String id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public AuthorizationContextDataV2 name(String name) {
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
  public AuthorizationContextDataV2 userFirstname(String userFirstname) {
    this.userFirstname = userFirstname;
    return this;
  }

  
  @JsonProperty("userFirstname")
  public String getUserFirstname() {
    return userFirstname;
  }

  @JsonProperty("userFirstname")
  public void setUserFirstname(String userFirstname) {
    this.userFirstname = userFirstname;
  }

  /**
   **/
  public AuthorizationContextDataV2 userLastname(String userLastname) {
    this.userLastname = userLastname;
    return this;
  }

  
  @JsonProperty("userLastname")
  public String getUserLastname() {
    return userLastname;
  }

  @JsonProperty("userLastname")
  public void setUserLastname(String userLastname) {
    this.userLastname = userLastname;
  }

  /**
   **/
  public AuthorizationContextDataV2 contextType(String contextType) {
    this.contextType = contextType;
    return this;
  }

  
  @JsonProperty("contextType")
  public String getContextType() {
    return contextType;
  }

  @JsonProperty("contextType")
  public void setContextType(String contextType) {
    this.contextType = contextType;
  }

  /**
   **/
  public AuthorizationContextDataV2 language(String language) {
    this.language = language;
    return this;
  }

  
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  @JsonProperty("language")
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   **/
  public AuthorizationContextDataV2 contextRelations(List<@Valid Context> contextRelations) {
    this.contextRelations = contextRelations;
    return this;
  }

  
  @JsonProperty("contextRelations")
  @Valid public List<@Valid Context> getContextRelations() {
    return contextRelations;
  }

  @JsonProperty("contextRelations")
  public void setContextRelations(List<@Valid Context> contextRelations) {
    this.contextRelations = contextRelations;
  }

  public AuthorizationContextDataV2 addContextRelationsItem(Context contextRelationsItem) {
    if (this.contextRelations == null) {
      this.contextRelations = new ArrayList<>();
    }

    this.contextRelations.add(contextRelationsItem);
    return this;
  }

  public AuthorizationContextDataV2 removeContextRelationsItem(Context contextRelationsItem) {
    if (contextRelationsItem != null && this.contextRelations != null) {
      this.contextRelations.remove(contextRelationsItem);
    }

    return this;
  }
  /**
   **/
  public AuthorizationContextDataV2 userRights(Set<String> userRights) {
    this.userRights = userRights;
    return this;
  }

  
  @JsonProperty("userRights")
  public Set<String> getUserRights() {
    return userRights;
  }

  @JsonProperty("userRights")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setUserRights(Set<String> userRights) {
    this.userRights = userRights;
  }

  public AuthorizationContextDataV2 addUserRightsItem(String userRightsItem) {
    if (this.userRights == null) {
      this.userRights = new LinkedHashSet<>();
    }

    this.userRights.add(userRightsItem);
    return this;
  }

  public AuthorizationContextDataV2 removeUserRightsItem(String userRightsItem) {
    if (userRightsItem != null && this.userRights != null) {
      this.userRights.remove(userRightsItem);
    }

    return this;
  }
  /**
   **/
  public AuthorizationContextDataV2 group(ContextGroupDataV2 group) {
    this.group = group;
    return this;
  }

  
  @JsonProperty("group")
  @Valid public ContextGroupDataV2 getGroup() {
    return group;
  }

  @JsonProperty("group")
  public void setGroup(ContextGroupDataV2 group) {
    this.group = group;
  }

  /**
   **/
  public AuthorizationContextDataV2 favourite(Boolean favourite) {
    this.favourite = favourite;
    return this;
  }

  
  @JsonProperty("favourite")
  public Boolean getFavourite() {
    return favourite;
  }

  @JsonProperty("favourite")
  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }

  /**
   * Decides if this is the primary context of this account. Only one context can be marked as primary.
   **/
  public AuthorizationContextDataV2 primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }

  @JsonProperty("primary")
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  /**
   **/
  public AuthorizationContextDataV2 lastAuthorization(Date lastAuthorization) {
    this.lastAuthorization = lastAuthorization;
    return this;
  }

  
  @JsonProperty("lastAuthorization")
  public Date getLastAuthorization() {
    return lastAuthorization;
  }

  @JsonProperty("lastAuthorization")
  public void setLastAuthorization(Date lastAuthorization) {
    this.lastAuthorization = lastAuthorization;
  }

  /**
   * Decides if this is the context that last got authorized for this account.
   **/
  public AuthorizationContextDataV2 lastAuthorizedContext(Boolean lastAuthorizedContext) {
    this.lastAuthorizedContext = lastAuthorizedContext;
    return this;
  }

  
  @JsonProperty("lastAuthorizedContext")
  public Boolean getLastAuthorizedContext() {
    return lastAuthorizedContext;
  }

  @JsonProperty("lastAuthorizedContext")
  public void setLastAuthorizedContext(Boolean lastAuthorizedContext) {
    this.lastAuthorizedContext = lastAuthorizedContext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationContextDataV2 authorizationContextDataV2 = (AuthorizationContextDataV2) o;
    return Objects.equals(this.id, authorizationContextDataV2.id) &&
        Objects.equals(this.name, authorizationContextDataV2.name) &&
        Objects.equals(this.userFirstname, authorizationContextDataV2.userFirstname) &&
        Objects.equals(this.userLastname, authorizationContextDataV2.userLastname) &&
        Objects.equals(this.contextType, authorizationContextDataV2.contextType) &&
        Objects.equals(this.language, authorizationContextDataV2.language) &&
        Objects.equals(this.contextRelations, authorizationContextDataV2.contextRelations) &&
        Objects.equals(this.userRights, authorizationContextDataV2.userRights) &&
        Objects.equals(this.group, authorizationContextDataV2.group) &&
        Objects.equals(this.favourite, authorizationContextDataV2.favourite) &&
        Objects.equals(this.primary, authorizationContextDataV2.primary) &&
        Objects.equals(this.lastAuthorization, authorizationContextDataV2.lastAuthorization) &&
        Objects.equals(this.lastAuthorizedContext, authorizationContextDataV2.lastAuthorizedContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, userFirstname, userLastname, contextType, language, contextRelations, userRights, group, favourite, primary, lastAuthorization, lastAuthorizedContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationContextDataV2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userFirstname: ").append(toIndentedString(userFirstname)).append("\n");
    sb.append("    userLastname: ").append(toIndentedString(userLastname)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    contextRelations: ").append(toIndentedString(contextRelations)).append("\n");
    sb.append("    userRights: ").append(toIndentedString(userRights)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    lastAuthorization: ").append(toIndentedString(lastAuthorization)).append("\n");
    sb.append("    lastAuthorizedContext: ").append(toIndentedString(lastAuthorizedContext)).append("\n");
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

