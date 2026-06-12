package org.acme.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.acme.model.Context;
import org.acme.model.TranslationHolderData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ContextTokenData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ContextTokenData {

    private String id;

    private String name;

    private TranslationHolderData name2;

    private String contextType;

    private @Valid List<@Valid Context> contextRelations = new ArrayList<>();

    private String firstName;

    private String lastName;

    private String email;

    private String locale;

    private @Valid Set<String> rights = new LinkedHashSet<>();

    private String sessionToken;

    private Integer sessionTokenExpiresIn;

    public ContextTokenData() {
    }

    /**
     * The unique identifier of the context. Uniqueness for a context id is only guaranteed for a single SCS. Other SCS might reuse the context id,
     * or generate new ones. This is intened to be an opaque string, meaning that the format of this string might change without notice.
     **/
    public ContextTokenData id(String id) {
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
     * Name of the context. Usually this follows the pattern &#x60;&lt;organization-name&gt;, &lt;city&gt;&#x60;, but can also use different format
     * depending on SCS. Can also be a value entered by the user. Not translatable, since this is the direct display name.
     **/
    public ContextTokenData name(String name) {
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
     * Translatable name of the context. Usually this this is the translation from the profile group, but can also use different format depending
     * on SCS.
     **/
    public ContextTokenData name2(TranslationHolderData name2) {
        this.name2 = name2;
        return this;
    }

    @JsonProperty("name2")
    @Valid
    public TranslationHolderData getName2() {
        return name2;
    }

    @JsonProperty("name2")
    public void setName2(TranslationHolderData name2) {
        this.name2 = name2;
    }

    /**
     * Type of this context. This matches one of the entries in contextRelations[].type. This is usually &#x60;ORGANIZATION&#x60;, but can also be
     * different depending on SCS.
     **/
    public ContextTokenData contextType(String contextType) {
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
    public ContextTokenData contextRelations(List<@Valid Context> contextRelations) {
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

    public ContextTokenData addContextRelationsItem(Context contextRelationsItem) {
        if (this.contextRelations == null) {
            this.contextRelations = new ArrayList<>();
        }

        this.contextRelations.add(contextRelationsItem);
        return this;
    }

    public ContextTokenData removeContextRelationsItem(Context contextRelationsItem) {
        if (contextRelationsItem != null && this.contextRelations != null) {
            this.contextRelations.remove(contextRelationsItem);
        }

        return this;
    }

    /**
     * Firstname of the account this context is for.
     **/
    public ContextTokenData firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Lastname of the account this context is for.
     **/
    public ContextTokenData lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Email of the account this context is for.
     **/
    public ContextTokenData email(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Locale of the account this context is for.
     **/
    public ContextTokenData locale(String locale) {
        this.locale = locale;
        return this;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Rights assigned to this context. Set of strings, guaranteed to not include duplicates.
     **/
    public ContextTokenData rights(Set<String> rights) {
        this.rights = rights;
        return this;
    }

    @JsonProperty("rights")
    public Set<String> getRights() {
        return rights;
    }

    @JsonProperty("rights")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setRights(Set<String> rights) {
        this.rights = rights;
    }

    public ContextTokenData addRightsItem(String rightsItem) {
        if (this.rights == null) {
            this.rights = new LinkedHashSet<>();
        }

        this.rights.add(rightsItem);
        return this;
    }

    public ContextTokenData removeRightsItem(String rightsItem) {
        if (rightsItem != null && this.rights != null) {
            this.rights.remove(rightsItem);
        }

        return this;
    }

    /**
     * An opaque token data string, as retrieved from the resource server. Contains the session token. No length restricts.
     **/
    public ContextTokenData sessionToken(String sessionToken) {
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
     * In how many seconds the sessionToken will expire since retrieval from the resource server. After this time expires, requests with this token
     * will fail, and most likely result in a 401/403 from the application backend. The client should therefore add a bit of leeway for its refresh
     * logic, like subtract 30 seconds, to ensure the token is not expired before calling the application backend.
     **/
    public ContextTokenData sessionTokenExpiresIn(Integer sessionTokenExpiresIn) {
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
        ContextTokenData contextTokenData = (ContextTokenData) o;
        return Objects.equals(this.id, contextTokenData.id) && Objects.equals(this.name, contextTokenData.name) && Objects.equals(this.name2,
                contextTokenData.name2) && Objects.equals(this.contextType, contextTokenData.contextType) && Objects.equals(this.contextRelations,
                contextTokenData.contextRelations) && Objects.equals(this.firstName, contextTokenData.firstName) && Objects.equals(this.lastName,
                contextTokenData.lastName) && Objects.equals(this.email, contextTokenData.email) && Objects.equals(this.locale,
                contextTokenData.locale) && Objects.equals(this.rights, contextTokenData.rights) && Objects.equals(this.sessionToken,
                contextTokenData.sessionToken) && Objects.equals(this.sessionTokenExpiresIn, contextTokenData.sessionTokenExpiresIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, name2, contextType, contextRelations, firstName, lastName, email, locale, rights, sessionToken,
                sessionTokenExpiresIn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContextTokenData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
        sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
        sb.append("    contextRelations: ").append(toIndentedString(contextRelations)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
