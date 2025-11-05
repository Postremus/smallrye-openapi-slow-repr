package org.acme.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.ProfileGroupRelationData;
import org.acme.model.ProfileTagRelationInputData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileInputData   {
  private String firstName;
  private String lastName;
  private String phone;
  private String fax;
  private String department;
  private String position;
  private String office;
  private String locale;
  private Boolean status;
  private Long salutationId;
  private String email;
  private @Valid List<@Valid ProfileGroupRelationData> accountProfileGroupRelations = new ArrayList<>();
  private @Valid List<@Valid ProfileTagRelationInputData> profileTagRelations = new ArrayList<>();
  private Boolean isDeveloper;
  private UUID tenantId;
  private Boolean hasSystemAdministratorContext;
  private URI loginLink;

  public ProfileInputData() {
  }

  @JsonCreator
  public ProfileInputData(
    @JsonProperty(required = true, value = "firstName") String firstName,
    @JsonProperty(required = true, value = "lastName") String lastName,
    @JsonProperty(required = true, value = "locale") String locale,
    @JsonProperty(required = true, value = "salutationId") Long salutationId,
    @JsonProperty(required = true, value = "email") String email,
    @JsonProperty(required = true, value = "tenantId") UUID tenantId
  ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.locale = locale;
    this.salutationId = salutationId;
    this.email = email;
    this.tenantId = tenantId;
  }

  /**
   **/
  public ProfileInputData firstName(String firstName) {
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
  public ProfileInputData lastName(String lastName) {
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
  public ProfileInputData phone(String phone) {
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
  public ProfileInputData fax(String fax) {
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
  public ProfileInputData department(String department) {
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
  public ProfileInputData position(String position) {
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
  public ProfileInputData office(String office) {
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
  public ProfileInputData locale(String locale) {
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
   * true if the user is active, false if not.
   **/
  public ProfileInputData status(Boolean status) {
    this.status = status;
    return this;
  }

  
  @JsonProperty("status")
  public Boolean getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(Boolean status) {
    this.status = status;
  }

  /**
   * Salutation of the user, like Herr, Frau, etc. Has to be a valid id of a salutation.
   **/
  public ProfileInputData salutationId(Long salutationId) {
    this.salutationId = salutationId;
    return this;
  }

  
  @JsonProperty(required = true, value = "salutationId")
  @NotNull public Long getSalutationId() {
    return salutationId;
  }

  @JsonProperty(required = true, value = "salutationId")
  public void setSalutationId(Long salutationId) {
    this.salutationId = salutationId;
  }

  /**
   * Email address of this user. Has to be unique in the system. Can not be modified.
   **/
  public ProfileInputData email(String email) {
    this.email = email;
    return this;
  }

  
  @JsonProperty(required = true, value = "email")
  @NotNull public String getEmail() {
    return email;
  }

  @JsonProperty(required = true, value = "email")
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public ProfileInputData accountProfileGroupRelations(List<@Valid ProfileGroupRelationData> accountProfileGroupRelations) {
    this.accountProfileGroupRelations = accountProfileGroupRelations;
    return this;
  }

  
  @JsonProperty("accountProfileGroupRelations")
  @Valid public List<@Valid ProfileGroupRelationData> getAccountProfileGroupRelations() {
    return accountProfileGroupRelations;
  }

  @JsonProperty("accountProfileGroupRelations")
  public void setAccountProfileGroupRelations(List<@Valid ProfileGroupRelationData> accountProfileGroupRelations) {
    this.accountProfileGroupRelations = accountProfileGroupRelations;
  }

  public ProfileInputData addAccountProfileGroupRelationsItem(ProfileGroupRelationData accountProfileGroupRelationsItem) {
    if (this.accountProfileGroupRelations == null) {
      this.accountProfileGroupRelations = new ArrayList<>();
    }

    this.accountProfileGroupRelations.add(accountProfileGroupRelationsItem);
    return this;
  }

  public ProfileInputData removeAccountProfileGroupRelationsItem(ProfileGroupRelationData accountProfileGroupRelationsItem) {
    if (accountProfileGroupRelationsItem != null && this.accountProfileGroupRelations != null) {
      this.accountProfileGroupRelations.remove(accountProfileGroupRelationsItem);
    }

    return this;
  }
  /**
   **/
  public ProfileInputData profileTagRelations(List<@Valid ProfileTagRelationInputData> profileTagRelations) {
    this.profileTagRelations = profileTagRelations;
    return this;
  }

  
  @JsonProperty("profileTagRelations")
  @Valid public List<@Valid ProfileTagRelationInputData> getProfileTagRelations() {
    return profileTagRelations;
  }

  @JsonProperty("profileTagRelations")
  public void setProfileTagRelations(List<@Valid ProfileTagRelationInputData> profileTagRelations) {
    this.profileTagRelations = profileTagRelations;
  }

  public ProfileInputData addProfileTagRelationsItem(ProfileTagRelationInputData profileTagRelationsItem) {
    if (this.profileTagRelations == null) {
      this.profileTagRelations = new ArrayList<>();
    }

    this.profileTagRelations.add(profileTagRelationsItem);
    return this;
  }

  public ProfileInputData removeProfileTagRelationsItem(ProfileTagRelationInputData profileTagRelationsItem) {
    if (profileTagRelationsItem != null && this.profileTagRelations != null) {
      this.profileTagRelations.remove(profileTagRelationsItem);
    }

    return this;
  }
  /**
   * Describes if this is a developer user, which has additional debug and additional features available in UI. Only users with portal_user_manage_technical_users can change this.
   **/
  public ProfileInputData isDeveloper(Boolean isDeveloper) {
    this.isDeveloper = isDeveloper;
    return this;
  }

  
  @JsonProperty("isDeveloper")
  public Boolean getIsDeveloper() {
    return isDeveloper;
  }

  @JsonProperty("isDeveloper")
  public void setIsDeveloper(Boolean isDeveloper) {
    this.isDeveloper = isDeveloper;
  }

  /**
   **/
  public ProfileInputData tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  
  @JsonProperty(required = true, value = "tenantId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getTenantId() {
    return tenantId;
  }

  @JsonProperty(required = true, value = "tenantId")
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  /**
   **/
  public ProfileInputData hasSystemAdministratorContext(Boolean hasSystemAdministratorContext) {
    this.hasSystemAdministratorContext = hasSystemAdministratorContext;
    return this;
  }

  
  @JsonProperty("hasSystemAdministratorContext")
  public Boolean getHasSystemAdministratorContext() {
    return hasSystemAdministratorContext;
  }

  @JsonProperty("hasSystemAdministratorContext")
  public void setHasSystemAdministratorContext(Boolean hasSystemAdministratorContext) {
    this.hasSystemAdministratorContext = hasSystemAdministratorContext;
  }

  /**
   * Link to where the user should be directed to for login. This is optional, a default is configured in backend for this. Needs to be present in the oidc-client-ids.
   **/
  public ProfileInputData loginLink(URI loginLink) {
    this.loginLink = loginLink;
    return this;
  }

  
  @JsonProperty("loginLink")
  public URI getLoginLink() {
    return loginLink;
  }

  @JsonProperty("loginLink")
  public void setLoginLink(URI loginLink) {
    this.loginLink = loginLink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileInputData profileInputData = (ProfileInputData) o;
    return Objects.equals(this.firstName, profileInputData.firstName) &&
        Objects.equals(this.lastName, profileInputData.lastName) &&
        Objects.equals(this.phone, profileInputData.phone) &&
        Objects.equals(this.fax, profileInputData.fax) &&
        Objects.equals(this.department, profileInputData.department) &&
        Objects.equals(this.position, profileInputData.position) &&
        Objects.equals(this.office, profileInputData.office) &&
        Objects.equals(this.locale, profileInputData.locale) &&
        Objects.equals(this.status, profileInputData.status) &&
        Objects.equals(this.salutationId, profileInputData.salutationId) &&
        Objects.equals(this.email, profileInputData.email) &&
        Objects.equals(this.accountProfileGroupRelations, profileInputData.accountProfileGroupRelations) &&
        Objects.equals(this.profileTagRelations, profileInputData.profileTagRelations) &&
        Objects.equals(this.isDeveloper, profileInputData.isDeveloper) &&
        Objects.equals(this.tenantId, profileInputData.tenantId) &&
        Objects.equals(this.hasSystemAdministratorContext, profileInputData.hasSystemAdministratorContext) &&
        Objects.equals(this.loginLink, profileInputData.loginLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, fax, department, position, office, locale, status, salutationId, email, accountProfileGroupRelations, profileTagRelations, isDeveloper, tenantId, hasSystemAdministratorContext, loginLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileInputData {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    salutationId: ").append(toIndentedString(salutationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    accountProfileGroupRelations: ").append(toIndentedString(accountProfileGroupRelations)).append("\n");
    sb.append("    profileTagRelations: ").append(toIndentedString(profileTagRelations)).append("\n");
    sb.append("    isDeveloper: ").append(toIndentedString(isDeveloper)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    hasSystemAdministratorContext: ").append(toIndentedString(hasSystemAdministratorContext)).append("\n");
    sb.append("    loginLink: ").append(toIndentedString(loginLink)).append("\n");
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

