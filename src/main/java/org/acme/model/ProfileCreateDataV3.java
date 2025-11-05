package org.acme.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.ProfileContextInputDataV3;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileCreateDataV3")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileCreateDataV3   {
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
  private @Valid List<@Valid ProfileContextInputDataV3> contexts = new ArrayList<>();
  private @Valid List<UUID> tagIds = new ArrayList<>();
  private Boolean isDeveloper;
  private Boolean isServiceProvider;
  private Boolean isTechnical;
  private UUID tenantId;
  private Boolean hasSystemAdministratorContext;
  private URI loginLink;
  private String password;

  public ProfileCreateDataV3() {
  }

  @JsonCreator
  public ProfileCreateDataV3(
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
  public ProfileCreateDataV3 firstName(String firstName) {
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
  public ProfileCreateDataV3 lastName(String lastName) {
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
  public ProfileCreateDataV3 phone(String phone) {
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
  public ProfileCreateDataV3 fax(String fax) {
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
  public ProfileCreateDataV3 department(String department) {
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
  public ProfileCreateDataV3 position(String position) {
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
  public ProfileCreateDataV3 office(String office) {
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
  public ProfileCreateDataV3 locale(String locale) {
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
  public ProfileCreateDataV3 status(Boolean status) {
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
  public ProfileCreateDataV3 salutationId(Long salutationId) {
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
  public ProfileCreateDataV3 email(String email) {
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
  public ProfileCreateDataV3 contexts(List<@Valid ProfileContextInputDataV3> contexts) {
    this.contexts = contexts;
    return this;
  }

  
  @JsonProperty("contexts")
  @Valid public List<@Valid ProfileContextInputDataV3> getContexts() {
    return contexts;
  }

  @JsonProperty("contexts")
  public void setContexts(List<@Valid ProfileContextInputDataV3> contexts) {
    this.contexts = contexts;
  }

  public ProfileCreateDataV3 addContextsItem(ProfileContextInputDataV3 contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<>();
    }

    this.contexts.add(contextsItem);
    return this;
  }

  public ProfileCreateDataV3 removeContextsItem(ProfileContextInputDataV3 contextsItem) {
    if (contextsItem != null && this.contexts != null) {
      this.contexts.remove(contextsItem);
    }

    return this;
  }
  /**
   * Tags assigned to this profile.
   **/
  public ProfileCreateDataV3 tagIds(List<UUID> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  
  @JsonProperty("tagIds")
  public List< @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")UUID> getTagIds() {
    return tagIds;
  }

  @JsonProperty("tagIds")
  public void setTagIds(List<UUID> tagIds) {
    this.tagIds = tagIds;
  }

  public ProfileCreateDataV3 addTagIdsItem(UUID tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<>();
    }

    this.tagIds.add(tagIdsItem);
    return this;
  }

  public ProfileCreateDataV3 removeTagIdsItem(UUID tagIdsItem) {
    if (tagIdsItem != null && this.tagIds != null) {
      this.tagIds.remove(tagIdsItem);
    }

    return this;
  }
  /**
   * Describes if this is a developer user, which has additional debug and additional features available in UI. Only users with portal_user_manage_technical_users can change this.
   **/
  public ProfileCreateDataV3 isDeveloper(Boolean isDeveloper) {
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
   * Describes if this profile is a service provider user. Service provider users are controlled by the &#x60;portal_user_manage_service_users&#x60; right, which allows: * Deletion and modification of service provider users. * Changing the value of this flag  By default, service provider users are not visible in the user management list.
   **/
  public ProfileCreateDataV3 isServiceProvider(Boolean isServiceProvider) {
    this.isServiceProvider = isServiceProvider;
    return this;
  }

  
  @JsonProperty("isServiceProvider")
  public Boolean getIsServiceProvider() {
    return isServiceProvider;
  }

  @JsonProperty("isServiceProvider")
  public void setIsServiceProvider(Boolean isServiceProvider) {
    this.isServiceProvider = isServiceProvider;
  }

  /**
   * Describes if this profile is a technical user. These profiles are intended for machine to machine communications. Technical accounts are controlled by the &#x60;portal_user_manage_technical_users&#x60; right, which allows: * Deletion and modification of technical accounts and their profiles. * Initially creating technical accounts  By default, technical users are not visible in the user management list.
   **/
  public ProfileCreateDataV3 isTechnical(Boolean isTechnical) {
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
   **/
  public ProfileCreateDataV3 tenantId(UUID tenantId) {
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
  public ProfileCreateDataV3 hasSystemAdministratorContext(Boolean hasSystemAdministratorContext) {
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
  public ProfileCreateDataV3 loginLink(URI loginLink) {
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

  /**
   **/
  public ProfileCreateDataV3 password(String password) {
    this.password = password;
    return this;
  }

  
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileCreateDataV3 profileCreateDataV3 = (ProfileCreateDataV3) o;
    return Objects.equals(this.firstName, profileCreateDataV3.firstName) &&
        Objects.equals(this.lastName, profileCreateDataV3.lastName) &&
        Objects.equals(this.phone, profileCreateDataV3.phone) &&
        Objects.equals(this.fax, profileCreateDataV3.fax) &&
        Objects.equals(this.department, profileCreateDataV3.department) &&
        Objects.equals(this.position, profileCreateDataV3.position) &&
        Objects.equals(this.office, profileCreateDataV3.office) &&
        Objects.equals(this.locale, profileCreateDataV3.locale) &&
        Objects.equals(this.status, profileCreateDataV3.status) &&
        Objects.equals(this.salutationId, profileCreateDataV3.salutationId) &&
        Objects.equals(this.email, profileCreateDataV3.email) &&
        Objects.equals(this.contexts, profileCreateDataV3.contexts) &&
        Objects.equals(this.tagIds, profileCreateDataV3.tagIds) &&
        Objects.equals(this.isDeveloper, profileCreateDataV3.isDeveloper) &&
        Objects.equals(this.isServiceProvider, profileCreateDataV3.isServiceProvider) &&
        Objects.equals(this.isTechnical, profileCreateDataV3.isTechnical) &&
        Objects.equals(this.tenantId, profileCreateDataV3.tenantId) &&
        Objects.equals(this.hasSystemAdministratorContext, profileCreateDataV3.hasSystemAdministratorContext) &&
        Objects.equals(this.loginLink, profileCreateDataV3.loginLink) &&
        Objects.equals(this.password, profileCreateDataV3.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, fax, department, position, office, locale, status, salutationId, email, contexts, tagIds, isDeveloper, isServiceProvider, isTechnical, tenantId, hasSystemAdministratorContext, loginLink, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileCreateDataV3 {\n");
    
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
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    isDeveloper: ").append(toIndentedString(isDeveloper)).append("\n");
    sb.append("    isServiceProvider: ").append(toIndentedString(isServiceProvider)).append("\n");
    sb.append("    isTechnical: ").append(toIndentedString(isTechnical)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    hasSystemAdministratorContext: ").append(toIndentedString(hasSystemAdministratorContext)).append("\n");
    sb.append("    loginLink: ").append(toIndentedString(loginLink)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

