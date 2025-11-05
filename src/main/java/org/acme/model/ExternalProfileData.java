package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ExternalProfileData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ExternalProfileData   {
  private String firstName;
  private String lastName;
  private String phone;
  private String fax;
  private String department;
  private String position;
  private String office;
  private String locale;
  private Long salutationId;
  private Long applicationId;

  public ExternalProfileData() {
  }

  @JsonCreator
  public ExternalProfileData(
    @JsonProperty(required = true, value = "firstName") String firstName,
    @JsonProperty(required = true, value = "lastName") String lastName,
    @JsonProperty(required = true, value = "locale") String locale
  ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.locale = locale;
  }

  /**
   **/
  public ExternalProfileData firstName(String firstName) {
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
  public ExternalProfileData lastName(String lastName) {
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
   **/
  public ExternalProfileData phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @JsonProperty("phone")
   @Pattern(regexp="^[0-9\\-\\+/\\(\\ \\)]+$") @Size(max=80)public String getPhone() {
    return phone;
  }

  @JsonProperty("phone")
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  public ExternalProfileData fax(String fax) {
    this.fax = fax;
    return this;
  }

  
  @JsonProperty("fax")
   @Pattern(regexp="^[0-9\\-\\+/\\(\\ \\)]+$") @Size(max=80)public String getFax() {
    return fax;
  }

  @JsonProperty("fax")
  public void setFax(String fax) {
    this.fax = fax;
  }

  /**
   **/
  public ExternalProfileData department(String department) {
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
  public ExternalProfileData position(String position) {
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
  public ExternalProfileData office(String office) {
    this.office = office;
    return this;
  }

  
  @JsonProperty("office")
   @Size(max=80)public String getOffice() {
    return office;
  }

  @JsonProperty("office")
  public void setOffice(String office) {
    this.office = office;
  }

  /**
   * Language which should be used in translations for this user. E.g. for automated system mails.
   **/
  public ExternalProfileData locale(String locale) {
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
   * Salutation of the user, like Herr, Frau, etc. Has to be a valid id of a salutation.
   **/
  public ExternalProfileData salutationId(Long salutationId) {
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
   * Id of the application from which this external profile was synced from.
   **/
  public ExternalProfileData applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }

  @JsonProperty("applicationId")
  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalProfileData externalProfileData = (ExternalProfileData) o;
    return Objects.equals(this.firstName, externalProfileData.firstName) &&
        Objects.equals(this.lastName, externalProfileData.lastName) &&
        Objects.equals(this.phone, externalProfileData.phone) &&
        Objects.equals(this.fax, externalProfileData.fax) &&
        Objects.equals(this.department, externalProfileData.department) &&
        Objects.equals(this.position, externalProfileData.position) &&
        Objects.equals(this.office, externalProfileData.office) &&
        Objects.equals(this.locale, externalProfileData.locale) &&
        Objects.equals(this.salutationId, externalProfileData.salutationId) &&
        Objects.equals(this.applicationId, externalProfileData.applicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, fax, department, position, office, locale, salutationId, applicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalProfileData {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    salutationId: ").append(toIndentedString(salutationId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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

