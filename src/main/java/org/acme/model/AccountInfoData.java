package org.acme.model;

import java.util.UUID;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("AccountInfoData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class AccountInfoData {

    private String firstName;

    private String lastName;

    private String email;

    private String locale;

    private String keycloakId;

    private UUID accountPortalId;

    public AccountInfoData() {
    }

    /**
     * Firstname of this account.
     **/
    public AccountInfoData firstName(String firstName) {
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
     * Lastname of this account.
     **/
    public AccountInfoData lastName(String lastName) {
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
     * Email of this account.
     **/
    public AccountInfoData email(String email) {
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
     * Locale of this account.
     **/
    public AccountInfoData locale(String locale) {
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
     * Id which identifies this account in keycloak. This is most likely a UUIDv4.
     **/
    public AccountInfoData keycloakId(String keycloakId) {
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
     * Id which identifies this account in portal.
     **/
    public AccountInfoData accountPortalId(UUID accountPortalId) {
        this.accountPortalId = accountPortalId;
        return this;
    }

    @JsonProperty("accountPortalId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getAccountPortalId() {
        return accountPortalId;
    }

    @JsonProperty("accountPortalId")
    public void setAccountPortalId(UUID accountPortalId) {
        this.accountPortalId = accountPortalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountInfoData accountInfoData = (AccountInfoData) o;
        return Objects.equals(this.firstName, accountInfoData.firstName) && Objects.equals(this.lastName, accountInfoData.lastName) && Objects.equals(
                this.email, accountInfoData.email) && Objects.equals(this.locale, accountInfoData.locale) && Objects.equals(this.keycloakId,
                accountInfoData.keycloakId) && Objects.equals(this.accountPortalId, accountInfoData.accountPortalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, locale, keycloakId, accountPortalId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountInfoData {\n");

        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    keycloakId: ").append(toIndentedString(keycloakId)).append("\n");
        sb.append("    accountPortalId: ").append(toIndentedString(accountPortalId)).append("\n");
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
