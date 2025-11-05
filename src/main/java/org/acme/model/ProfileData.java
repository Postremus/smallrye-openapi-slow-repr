package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.acme.model.ProfileContextData;
import org.acme.model.ProfileGroupRelationData;
import org.acme.model.ProfileTagRelationData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileData   {
  private String firstName;
  private String lastName;
  private String phone;
  private String fax;
  private String department;
  private String position;
  private String office;
  private String locale;
  private Long id;
  private UUID userId;
  private String keycloakId;
  private Boolean status;
  private Long salutationId;
  private String email;
  private @Valid List<Long> applicationIds = new ArrayList<>();
  private Date createDateTime;
  private String createUser;
  private Date lastUpdateDateTime;
  private String lastUpdateUser;
  private Date lastLogin;
  private @Valid List<@Valid ProfileContextData> contexts = new ArrayList<>();
  private @Valid List<@Valid ProfileGroupRelationData> accountProfileGroupRelations = new ArrayList<>();
  private @Valid List<@Valid ProfileTagRelationData> profileTagRelations = new ArrayList<>();
  private Boolean isDeveloper;
  private UUID tenantId;
  private Boolean hasSystemAdministratorContext;

  public ProfileData() {
  }

  @JsonCreator
  public ProfileData(
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
  public ProfileData firstName(String firstName) {
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
  public ProfileData lastName(String lastName) {
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
  public ProfileData phone(String phone) {
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
  public ProfileData fax(String fax) {
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
  public ProfileData department(String department) {
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
  public ProfileData position(String position) {
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
  public ProfileData office(String office) {
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
  public ProfileData locale(String locale) {
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
   * Id of the account profile in portal.
   **/
  public ProfileData id(Long id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public ProfileData userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  
  @JsonProperty("userId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  /**
   * Id which identifies this account profile in keycloak.
   **/
  public ProfileData keycloakId(String keycloakId) {
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
   * Decides whether this account profile is active in portal or not.
   **/
  public ProfileData status(Boolean status) {
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
   * Salutation of the account profile, like Herr, Frau, etc. Has to be a valid id of a salutation.
   **/
  public ProfileData salutationId(Long salutationId) {
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
  public ProfileData email(String email) {
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
   * List of all applications ids this account profile is allowed to use. Deprecated, use the grants lists.
   **/
  public ProfileData applicationIds(List<Long> applicationIds) {
    this.applicationIds = applicationIds;
    return this;
  }

  
  @JsonProperty("applicationIds")
  public List<Long> getApplicationIds() {
    return applicationIds;
  }

  @JsonProperty("applicationIds")
  public void setApplicationIds(List<Long> applicationIds) {
    this.applicationIds = applicationIds;
  }

  public ProfileData addApplicationIdsItem(Long applicationIdsItem) {
    if (this.applicationIds == null) {
      this.applicationIds = new ArrayList<>();
    }

    this.applicationIds.add(applicationIdsItem);
    return this;
  }

  public ProfileData removeApplicationIdsItem(Long applicationIdsItem) {
    if (applicationIdsItem != null && this.applicationIds != null) {
      this.applicationIds.remove(applicationIdsItem);
    }

    return this;
  }
  /**
   **/
  public ProfileData createDateTime(Date createDateTime) {
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
  public ProfileData createUser(String createUser) {
    this.createUser = createUser;
    return this;
  }

  
  @JsonProperty("createUser")
  public String getCreateUser() {
    return createUser;
  }

  @JsonProperty("createUser")
  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  /**
   **/
  public ProfileData lastUpdateDateTime(Date lastUpdateDateTime) {
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
  public ProfileData lastUpdateUser(String lastUpdateUser) {
    this.lastUpdateUser = lastUpdateUser;
    return this;
  }

  
  @JsonProperty("lastUpdateUser")
  public String getLastUpdateUser() {
    return lastUpdateUser;
  }

  @JsonProperty("lastUpdateUser")
  public void setLastUpdateUser(String lastUpdateUser) {
    this.lastUpdateUser = lastUpdateUser;
  }

  /**
   **/
  public ProfileData lastLogin(Date lastLogin) {
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
  public ProfileData contexts(List<@Valid ProfileContextData> contexts) {
    this.contexts = contexts;
    return this;
  }

  
  @JsonProperty("contexts")
  @Valid public List<@Valid ProfileContextData> getContexts() {
    return contexts;
  }

  @JsonProperty("contexts")
  public void setContexts(List<@Valid ProfileContextData> contexts) {
    this.contexts = contexts;
  }

  public ProfileData addContextsItem(ProfileContextData contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<>();
    }

    this.contexts.add(contextsItem);
    return this;
  }

  public ProfileData removeContextsItem(ProfileContextData contextsItem) {
    if (contextsItem != null && this.contexts != null) {
      this.contexts.remove(contextsItem);
    }

    return this;
  }
  /**
   **/
  public ProfileData accountProfileGroupRelations(List<@Valid ProfileGroupRelationData> accountProfileGroupRelations) {
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

  public ProfileData addAccountProfileGroupRelationsItem(ProfileGroupRelationData accountProfileGroupRelationsItem) {
    if (this.accountProfileGroupRelations == null) {
      this.accountProfileGroupRelations = new ArrayList<>();
    }

    this.accountProfileGroupRelations.add(accountProfileGroupRelationsItem);
    return this;
  }

  public ProfileData removeAccountProfileGroupRelationsItem(ProfileGroupRelationData accountProfileGroupRelationsItem) {
    if (accountProfileGroupRelationsItem != null && this.accountProfileGroupRelations != null) {
      this.accountProfileGroupRelations.remove(accountProfileGroupRelationsItem);
    }

    return this;
  }
  /**
   **/
  public ProfileData profileTagRelations(List<@Valid ProfileTagRelationData> profileTagRelations) {
    this.profileTagRelations = profileTagRelations;
    return this;
  }

  
  @JsonProperty("profileTagRelations")
  @Valid public List<@Valid ProfileTagRelationData> getProfileTagRelations() {
    return profileTagRelations;
  }

  @JsonProperty("profileTagRelations")
  public void setProfileTagRelations(List<@Valid ProfileTagRelationData> profileTagRelations) {
    this.profileTagRelations = profileTagRelations;
  }

  public ProfileData addProfileTagRelationsItem(ProfileTagRelationData profileTagRelationsItem) {
    if (this.profileTagRelations == null) {
      this.profileTagRelations = new ArrayList<>();
    }

    this.profileTagRelations.add(profileTagRelationsItem);
    return this;
  }

  public ProfileData removeProfileTagRelationsItem(ProfileTagRelationData profileTagRelationsItem) {
    if (profileTagRelationsItem != null && this.profileTagRelations != null) {
      this.profileTagRelations.remove(profileTagRelationsItem);
    }

    return this;
  }
  /**
   * Describes if this is a developer user, which has additional debug and additional features available in UI. Only users with portal_user_manage_technical_users can change this.
   **/
  public ProfileData isDeveloper(Boolean isDeveloper) {
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
  public ProfileData tenantId(UUID tenantId) {
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
  public ProfileData hasSystemAdministratorContext(Boolean hasSystemAdministratorContext) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileData profileData = (ProfileData) o;
    return Objects.equals(this.firstName, profileData.firstName) &&
        Objects.equals(this.lastName, profileData.lastName) &&
        Objects.equals(this.phone, profileData.phone) &&
        Objects.equals(this.fax, profileData.fax) &&
        Objects.equals(this.department, profileData.department) &&
        Objects.equals(this.position, profileData.position) &&
        Objects.equals(this.office, profileData.office) &&
        Objects.equals(this.locale, profileData.locale) &&
        Objects.equals(this.id, profileData.id) &&
        Objects.equals(this.userId, profileData.userId) &&
        Objects.equals(this.keycloakId, profileData.keycloakId) &&
        Objects.equals(this.status, profileData.status) &&
        Objects.equals(this.salutationId, profileData.salutationId) &&
        Objects.equals(this.email, profileData.email) &&
        Objects.equals(this.applicationIds, profileData.applicationIds) &&
        Objects.equals(this.createDateTime, profileData.createDateTime) &&
        Objects.equals(this.createUser, profileData.createUser) &&
        Objects.equals(this.lastUpdateDateTime, profileData.lastUpdateDateTime) &&
        Objects.equals(this.lastUpdateUser, profileData.lastUpdateUser) &&
        Objects.equals(this.lastLogin, profileData.lastLogin) &&
        Objects.equals(this.contexts, profileData.contexts) &&
        Objects.equals(this.accountProfileGroupRelations, profileData.accountProfileGroupRelations) &&
        Objects.equals(this.profileTagRelations, profileData.profileTagRelations) &&
        Objects.equals(this.isDeveloper, profileData.isDeveloper) &&
        Objects.equals(this.tenantId, profileData.tenantId) &&
        Objects.equals(this.hasSystemAdministratorContext, profileData.hasSystemAdministratorContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, fax, department, position, office, locale, id, userId, keycloakId, status, salutationId, email, applicationIds, createDateTime, createUser, lastUpdateDateTime, lastUpdateUser, lastLogin, contexts, accountProfileGroupRelations, profileTagRelations, isDeveloper, tenantId, hasSystemAdministratorContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileData {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    keycloakId: ").append(toIndentedString(keycloakId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    salutationId: ").append(toIndentedString(salutationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    lastUpdateUser: ").append(toIndentedString(lastUpdateUser)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    accountProfileGroupRelations: ").append(toIndentedString(accountProfileGroupRelations)).append("\n");
    sb.append("    profileTagRelations: ").append(toIndentedString(profileTagRelations)).append("\n");
    sb.append("    isDeveloper: ").append(toIndentedString(isDeveloper)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    hasSystemAdministratorContext: ").append(toIndentedString(hasSystemAdministratorContext)).append("\n");
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

