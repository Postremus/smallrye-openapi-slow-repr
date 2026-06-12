package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("TenantProfileInputDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class TenantProfileInputDataV2 {

    private String firstName;

    private String lastName;

    private String phone;

    private String fax;

    private String department;

    private String position;

    private String office;

    private String locale;

    private String email;

    public TenantProfileInputDataV2() {
    }

    @JsonCreator
    public TenantProfileInputDataV2(@JsonProperty(required = true, value = "firstName") String firstName,
            @JsonProperty(required = true, value = "lastName") String lastName, @JsonProperty(required = true, value = "locale") String locale,
            @JsonProperty(required = true, value = "email") String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.locale = locale;
        this.email = email;
    }

    /**
     **/
    public TenantProfileInputDataV2 firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty(required = true, value = "firstName")
    @NotNull
    @Pattern(regexp = "\\S")
    @Size(max = 100)
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty(required = true, value = "firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     **/
    public TenantProfileInputDataV2 lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty(required = true, value = "lastName")
    @NotNull
    @Pattern(regexp = "\\S")
    @Size(max = 100)
    public String getLastName() {
        return lastName;
    }

    @JsonProperty(required = true, value = "lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     **/
    public TenantProfileInputDataV2 phone(String phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("phone")
    @Pattern(regexp = "^[0-9\\-\\+/\\(\\ \\)]+$")
    @Size(max = 80)
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     **/
    public TenantProfileInputDataV2 fax(String fax) {
        this.fax = fax;
        return this;
    }

    @JsonProperty("fax")
    @Pattern(regexp = "^[0-9\\-\\+/\\(\\ \\)]+$")
    @Size(max = 80)
    public String getFax() {
        return fax;
    }

    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     **/
    public TenantProfileInputDataV2 department(String department) {
        this.department = department;
        return this;
    }

    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     **/
    public TenantProfileInputDataV2 position(String position) {
        this.position = position;
        return this;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * office
     **/
    public TenantProfileInputDataV2 office(String office) {
        this.office = office;
        return this;
    }

    @JsonProperty("office")
    @Size(max = 80)
    public String getOffice() {
        return office;
    }

    @JsonProperty("office")
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * Language which should be used in translations for this user. E.g. for automated system mails.
     **/
    public TenantProfileInputDataV2 locale(String locale) {
        this.locale = locale;
        return this;
    }

    @JsonProperty(required = true, value = "locale")
    @NotNull
    @Pattern(regexp = "[a-z]{2}-[A-Z]{2}")
    @Size(max = 5)
    public String getLocale() {
        return locale;
    }

    @JsonProperty(required = true, value = "locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Email address of this user. Has to be unique in the system. Can not be modified.
     **/
    public TenantProfileInputDataV2 email(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty(required = true, value = "email")
    @NotNull
    public String getEmail() {
        return email;
    }

    @JsonProperty(required = true, value = "email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TenantProfileInputDataV2 tenantProfileInputDataV2 = (TenantProfileInputDataV2) o;
        return Objects.equals(this.firstName, tenantProfileInputDataV2.firstName) && Objects.equals(this.lastName,
                tenantProfileInputDataV2.lastName) && Objects.equals(this.phone, tenantProfileInputDataV2.phone) && Objects.equals(this.fax,
                tenantProfileInputDataV2.fax) && Objects.equals(this.department, tenantProfileInputDataV2.department) && Objects.equals(this.position,
                tenantProfileInputDataV2.position) && Objects.equals(this.office, tenantProfileInputDataV2.office) && Objects.equals(this.locale,
                tenantProfileInputDataV2.locale) && Objects.equals(this.email, tenantProfileInputDataV2.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phone, fax, department, position, office, locale, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantProfileInputDataV2 {\n");

        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
        sb.append("    department: ").append(toIndentedString(department)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    office: ").append(toIndentedString(office)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
