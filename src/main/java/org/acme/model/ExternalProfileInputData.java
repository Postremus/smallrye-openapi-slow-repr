package org.acme.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ExternalProfileInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ExternalProfileInputData   {
  private String firstName;
  private String lastName;
  private String phone;
  private String fax;
  private String department;
  private String position;
  private String office;
  private String locale;
  private String email;
  private String externalId;
  private UUID applicationUUID;
  private @Valid Set<String> externalOrganizationExternalIds = new LinkedHashSet<>();

  public ExternalProfileInputData() {
  }

  @JsonCreator
  public ExternalProfileInputData(
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
  public ExternalProfileInputData firstName(String firstName) {
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
  public ExternalProfileInputData lastName(String lastName) {
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
  public ExternalProfileInputData phone(String phone) {
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
  public ExternalProfileInputData fax(String fax) {
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
  public ExternalProfileInputData department(String department) {
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
  public ExternalProfileInputData position(String position) {
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
  public ExternalProfileInputData office(String office) {
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
  public ExternalProfileInputData locale(String locale) {
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
   * Email address of this user. Has to be unique in the system. Can not be modified.
   **/
  public ExternalProfileInputData email(String email) {
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
   * Id of this profile in the source application.
   **/
  public ExternalProfileInputData externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  @JsonProperty("externalId")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  public ExternalProfileInputData applicationUUID(UUID applicationUUID) {
    this.applicationUUID = applicationUUID;
    return this;
  }

  
  @JsonProperty("applicationUUID")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getApplicationUUID() {
    return applicationUUID;
  }

  @JsonProperty("applicationUUID")
  public void setApplicationUUID(UUID applicationUUID) {
    this.applicationUUID = applicationUUID;
  }

  /**
   * List of the external ids of the external organizations this profile has access to.
   **/
  public ExternalProfileInputData externalOrganizationExternalIds(Set<String> externalOrganizationExternalIds) {
    this.externalOrganizationExternalIds = externalOrganizationExternalIds;
    return this;
  }

  
  @JsonProperty("externalOrganizationExternalIds")
  public Set<String> getExternalOrganizationExternalIds() {
    return externalOrganizationExternalIds;
  }

  @JsonProperty("externalOrganizationExternalIds")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setExternalOrganizationExternalIds(Set<String> externalOrganizationExternalIds) {
    this.externalOrganizationExternalIds = externalOrganizationExternalIds;
  }

  public ExternalProfileInputData addExternalOrganizationExternalIdsItem(String externalOrganizationExternalIdsItem) {
    if (this.externalOrganizationExternalIds == null) {
      this.externalOrganizationExternalIds = new LinkedHashSet<>();
    }

    this.externalOrganizationExternalIds.add(externalOrganizationExternalIdsItem);
    return this;
  }

  public ExternalProfileInputData removeExternalOrganizationExternalIdsItem(String externalOrganizationExternalIdsItem) {
    if (externalOrganizationExternalIdsItem != null && this.externalOrganizationExternalIds != null) {
      this.externalOrganizationExternalIds.remove(externalOrganizationExternalIdsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalProfileInputData externalProfileInputData = (ExternalProfileInputData) o;
    return Objects.equals(this.firstName, externalProfileInputData.firstName) &&
        Objects.equals(this.lastName, externalProfileInputData.lastName) &&
        Objects.equals(this.phone, externalProfileInputData.phone) &&
        Objects.equals(this.fax, externalProfileInputData.fax) &&
        Objects.equals(this.department, externalProfileInputData.department) &&
        Objects.equals(this.position, externalProfileInputData.position) &&
        Objects.equals(this.office, externalProfileInputData.office) &&
        Objects.equals(this.locale, externalProfileInputData.locale) &&
        Objects.equals(this.email, externalProfileInputData.email) &&
        Objects.equals(this.externalId, externalProfileInputData.externalId) &&
        Objects.equals(this.applicationUUID, externalProfileInputData.applicationUUID) &&
        Objects.equals(this.externalOrganizationExternalIds, externalProfileInputData.externalOrganizationExternalIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, fax, department, position, office, locale, email, externalId, applicationUUID, externalOrganizationExternalIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalProfileInputData {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    applicationUUID: ").append(toIndentedString(applicationUUID)).append("\n");
    sb.append("    externalOrganizationExternalIds: ").append(toIndentedString(externalOrganizationExternalIds)).append("\n");
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

