package org.acme.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonTypeName("ContextData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date =
        "2026-06-12T06:27:49" + ".020268300" + "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ContextData   {
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

  public ContextData() {
  }

  /**
   * The unique identifier of the context. Uniqueness for a context id is only guaranteed for a single SCS. Other SCS might reuse the context id,
   * or generate new ones. This is intened to be an opaque string, meaning that the format of this string might change without notice.
   **/
  public ContextData id(String id) {
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
  public ContextData name(String name) {
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
   * Translatable name of the context. Usually this this is the translation from the profile group, but can also use different format depending on
   * SCS.
   **/
  public ContextData name2(TranslationHolderData name2) {
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
  public ContextData contextType(String contextType) {
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
  public ContextData contextRelations(List<@Valid Context> contextRelations) {
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

  public ContextData addContextRelationsItem(Context contextRelationsItem) {
    if (this.contextRelations == null) {
      this.contextRelations = new ArrayList<>();
    }

    this.contextRelations.add(contextRelationsItem);
    return this;
  }

  public ContextData removeContextRelationsItem(Context contextRelationsItem) {
    if (contextRelationsItem != null && this.contextRelations != null) {
      this.contextRelations.remove(contextRelationsItem);
    }

    return this;
  }
  /**
   * Firstname of the account this context is for.
   **/
  public ContextData firstName(String firstName) {
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
    public ContextData lastName(String lastName) {
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
    public ContextData email(String email) {
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
    public ContextData locale(String locale) {
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
    public ContextData rights(Set<String> rights) {
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

    public ContextData addRightsItem(String rightsItem) {
        if (this.rights == null) {
            this.rights = new LinkedHashSet<>();
        }

        this.rights.add(rightsItem);
    return this;
  }

    public ContextData removeRightsItem(String rightsItem) {
        if (rightsItem != null && this.rights != null) {
            this.rights.remove(rightsItem);
        }

    return this;
  }
  /**
   * Set the additional (undeclared) property with the specified name and value.
   * Creates the property if it does not already exist, otherwise replaces it.
   * @param key the name of the property
   * @param value the value of the property
   * @return self reference
   */
  @JsonAnySetter
  public ContextData putAdditionalProperty(String key, Object value) {
    return this;
  }

    /**
     * Return the additional (undeclared) properties.
     * @return the additional (undeclared) properties
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return null;
  }

    /**
     * Return the additional (undeclared) property with the specified name.
     * @param key the name of the property
     * @return the additional (undeclared) property with the specified name
     */
    public Object getAdditionalProperty(String key) {
        return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextData contextData = (ContextData) o;
      return Objects.equals(this.id, contextData.id) && Objects.equals(this.name, contextData.name) && Objects.equals(this.name2,
              contextData.name2) && Objects.equals(this.contextType, contextData.contextType) && Objects.equals(this.contextRelations,
              contextData.contextRelations) && Objects.equals(this.firstName, contextData.firstName) && Objects.equals(this.lastName,
              contextData.lastName) && Objects.equals(this.email, contextData.email) && Objects.equals(this.locale,
              contextData.locale) && Objects.equals(this.rights, contextData.rights);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id, name, name2, contextType, contextRelations, firstName, lastName, email, locale, rights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextData {\n");
    
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
