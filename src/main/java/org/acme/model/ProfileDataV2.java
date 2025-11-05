package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.acme.model.ContextDataV2;
import org.acme.model.ProfileTagRelationDataV2;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileDataV2")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileDataV2   {
  private String firstName;
  private String lastName;
  private String phone;
  private String fax;
  private String department;
  private String position;
  private String office;
  private String locale;
  private UUID id;
  private String keycloakId;
  private UUID accountId;
  private Boolean status;
  private Long salutationId;
  private String email;
  private Date createDateTime;
  private Date lastUpdateDateTime;
  private Date lastLogin;
  private @Valid List<@Valid ContextDataV2> contexts = new ArrayList<>();
  private @Valid List<@Valid ProfileTagRelationDataV2> profileTagRelations = new ArrayList<>();
  private Boolean isDeveloper;
  private Boolean isServiceProvider;
  private UUID tenantId;
  private Boolean hasSystemAdministratorContext;
  private Boolean deleted;

  public ProfileDataV2() {
  }

  @JsonCreator
  public ProfileDataV2(
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
  public ProfileDataV2 firstName(String firstName) {
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
  public ProfileDataV2 lastName(String lastName) {
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
  public ProfileDataV2 phone(String phone) {
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
  public ProfileDataV2 fax(String fax) {
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
  public ProfileDataV2 department(String department) {
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
  public ProfileDataV2 position(String position) {
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
  public ProfileDataV2 office(String office) {
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
  public ProfileDataV2 locale(String locale) {
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
   **/
  public ProfileDataV2 id(UUID id) {
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
  public ProfileDataV2 keycloakId(String keycloakId) {
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
   **/
  public ProfileDataV2 accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

  
  @JsonProperty("accountId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getAccountId() {
    return accountId;
  }

  @JsonProperty("accountId")
  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  /**
   * Decides whether this profile is active in portal or not.
   **/
  public ProfileDataV2 status(Boolean status) {
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
   * Salutation of the profile, like Herr, Frau, etc. Has to be a valid id of a salutation.
   **/
  public ProfileDataV2 salutationId(Long salutationId) {
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
   * Email address of this user. Has to be unique in the system. Can not be modified.
   **/
  public ProfileDataV2 email(String email) {
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
   **/
  public ProfileDataV2 createDateTime(Date createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  
  @JsonProperty("createDateTime")
  public Date getCreateDateTime() {
    return createDateTime;
  }

  @JsonProperty("createDateTime")
  public void setCreateDateTime(Date createDateTime) {
    this.createDateTime = createDateTime;
  }

  /**
   **/
  public ProfileDataV2 lastUpdateDateTime(Date lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
    return this;
  }

  
  @JsonProperty("lastUpdateDateTime")
  public Date getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  @JsonProperty("lastUpdateDateTime")
  public void setLastUpdateDateTime(Date lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }

  /**
   **/
  public ProfileDataV2 lastLogin(Date lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  
  @JsonProperty("lastLogin")
  public Date getLastLogin() {
    return lastLogin;
  }

  @JsonProperty("lastLogin")
  public void setLastLogin(Date lastLogin) {
    this.lastLogin = lastLogin;
  }

  /**
   * Contexts of this profile. Contains the automatically and manually created contexts.
   **/
  public ProfileDataV2 contexts(List<@Valid ContextDataV2> contexts) {
    this.contexts = contexts;
    return this;
  }

  
  @JsonProperty("contexts")
  @Valid public List<@Valid ContextDataV2> getContexts() {
    return contexts;
  }

  @JsonProperty("contexts")
  public void setContexts(List<@Valid ContextDataV2> contexts) {
    this.contexts = contexts;
  }

  public ProfileDataV2 addContextsItem(ContextDataV2 contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<>();
    }

    this.contexts.add(contextsItem);
    return this;
  }

  public ProfileDataV2 removeContextsItem(ContextDataV2 contextsItem) {
    if (contextsItem != null && this.contexts != null) {
      this.contexts.remove(contextsItem);
    }

    return this;
  }
  /**
   **/
  public ProfileDataV2 profileTagRelations(List<@Valid ProfileTagRelationDataV2> profileTagRelations) {
    this.profileTagRelations = profileTagRelations;
    return this;
  }

  
  @JsonProperty("profileTagRelations")
  @Valid public List<@Valid ProfileTagRelationDataV2> getProfileTagRelations() {
    return profileTagRelations;
  }

  @JsonProperty("profileTagRelations")
  public void setProfileTagRelations(List<@Valid ProfileTagRelationDataV2> profileTagRelations) {
    this.profileTagRelations = profileTagRelations;
  }

  public ProfileDataV2 addProfileTagRelationsItem(ProfileTagRelationDataV2 profileTagRelationsItem) {
    if (this.profileTagRelations == null) {
      this.profileTagRelations = new ArrayList<>();
    }

    this.profileTagRelations.add(profileTagRelationsItem);
    return this;
  }

  public ProfileDataV2 removeProfileTagRelationsItem(ProfileTagRelationDataV2 profileTagRelationsItem) {
    if (profileTagRelationsItem != null && this.profileTagRelations != null) {
      this.profileTagRelations.remove(profileTagRelationsItem);
    }

    return this;
  }
  /**
   * Describes if this is a developer user, which has additional debug and additional features available in UI. Only users with portal_user_manage_technical_users can change this.
   **/
  public ProfileDataV2 isDeveloper(Boolean isDeveloper) {
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
   * Describes if this profile is a service provider user. These profiles are intended to be shared by multiple real life persons. Service provider users are controlled by the &#x60;portal_user_manage_service_users&#x60;right, which allows:         * Creation, Deletion and modification of service provider users .         * Changing the value of this flag By default, service provider users are not visible in the user management list .
   **/
  public ProfileDataV2 isServiceProvider(Boolean isServiceProvider) {
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
   **/
  public ProfileDataV2 tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  
  @JsonProperty("tenantId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getTenantId() {
    return tenantId;
  }

  @JsonProperty("tenantId")
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  /**
   **/
  public ProfileDataV2 hasSystemAdministratorContext(Boolean hasSystemAdministratorContext) {
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
   * true if this profile is deleted.
   **/
  public ProfileDataV2 deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  @JsonProperty("deleted")
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileDataV2 profileDataV2 = (ProfileDataV2) o;
    return Objects.equals(this.firstName, profileDataV2.firstName) &&
        Objects.equals(this.lastName, profileDataV2.lastName) &&
        Objects.equals(this.phone, profileDataV2.phone) &&
        Objects.equals(this.fax, profileDataV2.fax) &&
        Objects.equals(this.department, profileDataV2.department) &&
        Objects.equals(this.position, profileDataV2.position) &&
        Objects.equals(this.office, profileDataV2.office) &&
        Objects.equals(this.locale, profileDataV2.locale) &&
        Objects.equals(this.id, profileDataV2.id) &&
        Objects.equals(this.keycloakId, profileDataV2.keycloakId) &&
        Objects.equals(this.accountId, profileDataV2.accountId) &&
        Objects.equals(this.status, profileDataV2.status) &&
        Objects.equals(this.salutationId, profileDataV2.salutationId) &&
        Objects.equals(this.email, profileDataV2.email) &&
        Objects.equals(this.createDateTime, profileDataV2.createDateTime) &&
        Objects.equals(this.lastUpdateDateTime, profileDataV2.lastUpdateDateTime) &&
        Objects.equals(this.lastLogin, profileDataV2.lastLogin) &&
        Objects.equals(this.contexts, profileDataV2.contexts) &&
        Objects.equals(this.profileTagRelations, profileDataV2.profileTagRelations) &&
        Objects.equals(this.isDeveloper, profileDataV2.isDeveloper) &&
        Objects.equals(this.isServiceProvider, profileDataV2.isServiceProvider) &&
        Objects.equals(this.tenantId, profileDataV2.tenantId) &&
        Objects.equals(this.hasSystemAdministratorContext, profileDataV2.hasSystemAdministratorContext) &&
        Objects.equals(this.deleted, profileDataV2.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, fax, department, position, office, locale, id, keycloakId, accountId, status, salutationId, email, createDateTime, lastUpdateDateTime, lastLogin, contexts, profileTagRelations, isDeveloper, isServiceProvider, tenantId, hasSystemAdministratorContext, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDataV2 {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keycloakId: ").append(toIndentedString(keycloakId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    salutationId: ").append(toIndentedString(salutationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    profileTagRelations: ").append(toIndentedString(profileTagRelations)).append("\n");
    sb.append("    isDeveloper: ").append(toIndentedString(isDeveloper)).append("\n");
    sb.append("    isServiceProvider: ").append(toIndentedString(isServiceProvider)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    hasSystemAdministratorContext: ").append(toIndentedString(hasSystemAdministratorContext)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

