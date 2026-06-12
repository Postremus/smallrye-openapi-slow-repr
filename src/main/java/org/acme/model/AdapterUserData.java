package org.acme.model;

import java.util.UUID;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("AdapterUserData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class AdapterUserData {

    private UUID id;

    private String email;

    private String firstName;

    private String lastName;

    private String oidcId;

    private String locale;

    private UUID salutationId;

    public AdapterUserData() {
    }

    @JsonCreator
    public AdapterUserData(@JsonProperty(required = true, value = "email") String email) {
        this.email = email;
    }

    /**
     **/
    public AdapterUserData id(UUID id) {
        this.id = id;
        return this;
    }

    @JsonProperty("id")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     **/
    public AdapterUserData email(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty(required = true, value = "email")
    @NotNull
    @Size(max = 255)
    public String getEmail() {
        return email;
    }

    @JsonProperty(required = true, value = "email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     **/
    public AdapterUserData firstName(String firstName) {
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
    public AdapterUserData lastName(String lastName) {
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
     **/
    public AdapterUserData oidcId(String oidcId) {
        this.oidcId = oidcId;
        return this;
    }

    @JsonProperty("oidcId")
    public String getOidcId() {
        return oidcId;
    }

    @JsonProperty("oidcId")
    public void setOidcId(String oidcId) {
        this.oidcId = oidcId;
    }

    /**
     **/
    public AdapterUserData locale(String locale) {
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
     **/
    public AdapterUserData salutationId(UUID salutationId) {
        this.salutationId = salutationId;
        return this;
    }

    @JsonProperty("salutationId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getSalutationId() {
        return salutationId;
    }

    @JsonProperty("salutationId")
    public void setSalutationId(UUID salutationId) {
        this.salutationId = salutationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdapterUserData adapterUserData = (AdapterUserData) o;
        return Objects.equals(this.id, adapterUserData.id) && Objects.equals(this.email, adapterUserData.email) && Objects.equals(this.firstName,
                adapterUserData.firstName) && Objects.equals(this.lastName, adapterUserData.lastName) && Objects.equals(this.oidcId,
                adapterUserData.oidcId) && Objects.equals(this.locale, adapterUserData.locale) && Objects.equals(this.salutationId,
                adapterUserData.salutationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstName, lastName, oidcId, locale, salutationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdapterUserData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    oidcId: ").append(toIndentedString(oidcId)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    salutationId: ").append(toIndentedString(salutationId)).append("\n");
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
