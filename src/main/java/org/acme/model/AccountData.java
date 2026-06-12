package org.acme.model;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("AccountData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300" +
        "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class AccountData   {
  private UUID id;
  private String keycloakId;
  private String email;
  private Long salutationId;
  private String firstName;
  private String lastName;
  private String locale;
  private Boolean isTechnical;

    private Boolean forceContextSwitchMenu;

    public AccountData() {
  }

  @JsonCreator
  public AccountData(
    @JsonProperty(required = true, value = "firstName") String firstName,
    @JsonProperty(required = true, value = "lastName") String lastName,
    @JsonProperty(required = true, value = "locale") String locale
  ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.locale = locale;
  }

  /**
   * Id of this account in portal.
   **/
  public AccountData id(UUID id) {
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
   * Id which identifies this account in keycloak.
   **/
  public AccountData keycloakId(String keycloakId) {
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
   * Email address of this account. Has to be unique in the system.
   **/
  public AccountData email(String email) {
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
   * Salutation of the account, like Herr, Frau, etc. Has to be a valid id of a salutation.
   **/
  public AccountData salutationId(Long salutationId) {
    this.salutationId = salutationId;
    return this;
  }

  
  @JsonProperty("salutationId")
  public Long getSalutationId() {
    return salutationId;
  }

  @JsonProperty("salutationId")
  public void setSalutationId(Long salutationId) {
    this.salutationId = salutationId;
  }

  /**
   **/
  public AccountData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @JsonProperty(required = true, value = "firstName")
  @NotNull  @Pattern(regexp="\\S") @Size(max=100)public String getFirstName() {
    return firstName;
  }

  @JsonProperty(required = true, value = "firstName")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  public AccountData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @JsonProperty(required = true, value = "lastName")
  @NotNull  @Pattern(regexp="\\S") @Size(max=100)public String getLastName() {
    return lastName;
  }

  @JsonProperty(required = true, value = "lastName")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Language which should be used in translations for this account. E.g. for automated system mails.
   **/
  public AccountData locale(String locale) {
    this.locale = locale;
    return this;
  }

  
  @JsonProperty(required = true, value = "locale")
  @NotNull  @Pattern(regexp="[a-z]{2}-[A-Z]{2}") @Size(max=5)public String getLocale() {
    return locale;
  }

  @JsonProperty(required = true, value = "locale")
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * Describes if this account is a technical user. These accounts are intended for machine to machine communications. Technical accounts are
   * controlled by the &#x60;portal_user_manage_technical_users&#x60; right, which allows: * Deletion and modification of technical accounts and
   * their profiles. * Initially creating technical accounts  By default, technical users are not visible in the user management list.
   **/
  public AccountData isTechnical(Boolean isTechnical) {
    this.isTechnical = isTechnical;
    return this;
  }

  
  @JsonProperty("isTechnical")
  public Boolean getIsTechnical() {
    return isTechnical;
  }

  @JsonProperty("isTechnical")
  public void setIsTechnical(Boolean isTechnical) {
    this.isTechnical = isTechnical;
  }

    /**
     * Forces the display of the context switch menu. Some customers want the context selection to always be displayed. Default value is false.
     **/
    public AccountData forceContextSwitchMenu(Boolean forceContextSwitchMenu) {
        this.forceContextSwitchMenu = forceContextSwitchMenu;
        return this;
    }

    @JsonProperty("forceContextSwitchMenu")
    public Boolean getForceContextSwitchMenu() {
        return forceContextSwitchMenu;
    }

    @JsonProperty("forceContextSwitchMenu")
    public void setForceContextSwitchMenu(Boolean forceContextSwitchMenu) {
        this.forceContextSwitchMenu = forceContextSwitchMenu;
    }

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public AccountData putAdditionalProperty(String key, Object value) {
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
    AccountData accountData = (AccountData) o;
    return Objects.equals(this.id, accountData.id) &&
        Objects.equals(this.keycloakId, accountData.keycloakId) &&
        Objects.equals(this.email, accountData.email) &&
        Objects.equals(this.salutationId, accountData.salutationId) &&
        Objects.equals(this.firstName, accountData.firstName) &&
        Objects.equals(this.lastName, accountData.lastName) && Objects.equals(this.locale, accountData.locale) && Objects.equals(this.isTechnical,
            accountData.isTechnical) && Objects.equals(this.forceContextSwitchMenu, accountData.forceContextSwitchMenu);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id, keycloakId, email, salutationId, firstName, lastName, locale, isTechnical, forceContextSwitchMenu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keycloakId: ").append(toIndentedString(keycloakId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    salutationId: ").append(toIndentedString(salutationId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    isTechnical: ").append(toIndentedString(isTechnical)).append("\n");
      sb.append("    forceContextSwitchMenu: ").append(toIndentedString(forceContextSwitchMenu)).append("\n");
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
