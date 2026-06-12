package org.acme.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.acme.model.Context;
import org.acme.model.ContextGroupData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ContextData1")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ContextData1 {

    private String id;

    private String name;

    private String userFirstname;

    private String userLastname;

    private String contextType;

    private String language;

    private @Valid List<@Valid Context> contextRelations = new ArrayList<>();

    private @Valid Set<String> userRights = new LinkedHashSet<>();

    private ContextGroupData group;

    private Boolean primary;

    private Date lastAuthorization;

    private Boolean lastAuthorizedContext;

    public ContextData1() {
    }

    /**
     **/
    public ContextData1 id(String id) {
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
    public ContextData1 name(String name) {
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
    public ContextData1 userFirstname(String userFirstname) {
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
    public ContextData1 userLastname(String userLastname) {
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
    public ContextData1 contextType(String contextType) {
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
    public ContextData1 language(String language) {
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
    public ContextData1 contextRelations(List<@Valid Context> contextRelations) {
        this.contextRelations = contextRelations;
        return this;
    }

    @JsonProperty("contextRelations")
    @Valid
    public List<@Valid Context> getContextRelations() {
        return contextRelations;
    }

    @JsonProperty("contextRelations")
    public void setContextRelations(List<@Valid Context> contextRelations) {
        this.contextRelations = contextRelations;
    }

    public ContextData1 addContextRelationsItem(Context contextRelationsItem) {
        if (this.contextRelations == null) {
            this.contextRelations = new ArrayList<>();
        }

        this.contextRelations.add(contextRelationsItem);
        return this;
    }

    public ContextData1 removeContextRelationsItem(Context contextRelationsItem) {
        if (contextRelationsItem != null && this.contextRelations != null) {
            this.contextRelations.remove(contextRelationsItem);
        }

        return this;
    }

    /**
     **/
    public ContextData1 userRights(Set<String> userRights) {
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

    public ContextData1 addUserRightsItem(String userRightsItem) {
        if (this.userRights == null) {
            this.userRights = new LinkedHashSet<>();
        }

        this.userRights.add(userRightsItem);
        return this;
    }

    public ContextData1 removeUserRightsItem(String userRightsItem) {
        if (userRightsItem != null && this.userRights != null) {
            this.userRights.remove(userRightsItem);
        }

        return this;
    }

    /**
     **/
    public ContextData1 group(ContextGroupData group) {
        this.group = group;
        return this;
    }

    @JsonProperty("group")
    @Valid
    public ContextGroupData getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(ContextGroupData group) {
        this.group = group;
    }

    /**
     * Decides if this is the primary context of this profile. Only one context can be marked as primary.
     **/
    public ContextData1 primary(Boolean primary) {
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
     * Last time this context got authorized.
     **/
    public ContextData1 lastAuthorization(Date lastAuthorization) {
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
     * Decides if this is the context that last got authorized for this profile.
     **/
    public ContextData1 lastAuthorizedContext(Boolean lastAuthorizedContext) {
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
        ContextData1 contextData1 = (ContextData1) o;
        return Objects.equals(this.id, contextData1.id) && Objects.equals(this.name, contextData1.name) && Objects.equals(this.userFirstname,
                contextData1.userFirstname) && Objects.equals(this.userLastname, contextData1.userLastname) && Objects.equals(this.contextType,
                contextData1.contextType) && Objects.equals(this.language, contextData1.language) && Objects.equals(this.contextRelations,
                contextData1.contextRelations) && Objects.equals(this.userRights, contextData1.userRights) && Objects.equals(this.group,
                contextData1.group) && Objects.equals(this.primary, contextData1.primary) && Objects.equals(this.lastAuthorization,
                contextData1.lastAuthorization) && Objects.equals(this.lastAuthorizedContext, contextData1.lastAuthorizedContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, userFirstname, userLastname, contextType, language, contextRelations, userRights, group, primary,
                lastAuthorization, lastAuthorizedContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContextData1 {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userFirstname: ").append(toIndentedString(userFirstname)).append("\n");
        sb.append("    userLastname: ").append(toIndentedString(userLastname)).append("\n");
        sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    contextRelations: ").append(toIndentedString(contextRelations)).append("\n");
        sb.append("    userRights: ").append(toIndentedString(userRights)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
