package org.acme.model;

import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AccountMessageData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class AccountMessageData   {
  private UUID id;
  private String keycloakId;
  private String email;
  private Long salutationId;

    private UUID salutationUuid;
  private String firstName;
  private String lastName;
  private String locale;

  public AccountMessageData() {
  }

  /**
   * Id of this account in portal.
   **/
  public AccountMessageData id(UUID id) {
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
   * Id which identifies this profile in keycloak.
   **/
  public AccountMessageData keycloakId(String keycloakId) {
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
   * Email address of this user. Has to be unique in the system. Can not be modified.
   **/
  public AccountMessageData email(String email) {
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
   * Salutation of the profile, like Herr, Frau, etc. Has to be a valid id of a salutation.
   **/
  public AccountMessageData salutationId(Long salutationId) {
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
     * Salutation of the profile, like Herr, Frau, etc. Has to be a valid id of a salutation.
     **/
    public AccountMessageData salutationUuid(UUID salutationUuid) {
        this.salutationUuid = salutationUuid;
        return this;
    }

    @JsonProperty("salutationUuid")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getSalutationUuid() {
        return salutationUuid;
    }

    @JsonProperty("salutationUuid")
    public void setSalutationUuid(UUID salutationUuid) {
        this.salutationUuid = salutationUuid;
    }

    /**
   **/
  public AccountMessageData firstName(String firstName) {
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
   **/
  public AccountMessageData lastName(String lastName) {
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
   * Language which should be used in translations for this user. E.g. for automated system mails.
   **/
  public AccountMessageData locale(String locale) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMessageData accountMessageData = (AccountMessageData) o;
    return Objects.equals(this.id, accountMessageData.id) &&
        Objects.equals(this.keycloakId, accountMessageData.keycloakId) &&
        Objects.equals(this.email, accountMessageData.email) &&
        Objects.equals(this.salutationId, accountMessageData.salutationId) && Objects.equals(this.salutationUuid,
            accountMessageData.salutationUuid) &&
        Objects.equals(this.firstName, accountMessageData.firstName) &&
        Objects.equals(this.lastName, accountMessageData.lastName) &&
        Objects.equals(this.locale, accountMessageData.locale);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id, keycloakId, email, salutationId, salutationUuid, firstName, lastName, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMessageData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keycloakId: ").append(toIndentedString(keycloakId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    salutationId: ").append(toIndentedString(salutationId)).append("\n");
      sb.append("    salutationUuid: ").append(toIndentedString(salutationUuid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
