package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.ProfileTagRelationMessageData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileMessageData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileMessageData   {
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
  private UUID accountId;
  private Boolean status;
  private Long salutationId;
  private String email;
  private @Valid List<@Valid ProfileTagRelationMessageData> profileTagRelations = new ArrayList<>();
  private Boolean isDeveloper;
  private UUID tenantId;

  public ProfileMessageData() {
  }

  @JsonCreator
  public ProfileMessageData(
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
  public ProfileMessageData firstName(String firstName) {
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
  public ProfileMessageData lastName(String lastName) {
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
  public ProfileMessageData phone(String phone) {
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
  public ProfileMessageData fax(String fax) {
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
  public ProfileMessageData department(String department) {
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
  public ProfileMessageData position(String position) {
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
  public ProfileMessageData office(String office) {
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
  public ProfileMessageData locale(String locale) {
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
  public ProfileMessageData id(Long id) {
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
  public ProfileMessageData userId(UUID userId) {
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
  public ProfileMessageData keycloakId(String keycloakId) {
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
  public ProfileMessageData accountId(UUID accountId) {
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
   * Decides whether this account profile is active in portal or not.
   **/
  public ProfileMessageData status(Boolean status) {
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
  public ProfileMessageData salutationId(Long salutationId) {
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
  public ProfileMessageData email(String email) {
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
  public ProfileMessageData profileTagRelations(List<@Valid ProfileTagRelationMessageData> profileTagRelations) {
    this.profileTagRelations = profileTagRelations;
    return this;
  }

  
  @JsonProperty("profileTagRelations")
  @Valid public List<@Valid ProfileTagRelationMessageData> getProfileTagRelations() {
    return profileTagRelations;
  }

  @JsonProperty("profileTagRelations")
  public void setProfileTagRelations(List<@Valid ProfileTagRelationMessageData> profileTagRelations) {
    this.profileTagRelations = profileTagRelations;
  }

  public ProfileMessageData addProfileTagRelationsItem(ProfileTagRelationMessageData profileTagRelationsItem) {
    if (this.profileTagRelations == null) {
      this.profileTagRelations = new ArrayList<>();
    }

    this.profileTagRelations.add(profileTagRelationsItem);
    return this;
  }

  public ProfileMessageData removeProfileTagRelationsItem(ProfileTagRelationMessageData profileTagRelationsItem) {
    if (profileTagRelationsItem != null && this.profileTagRelations != null) {
      this.profileTagRelations.remove(profileTagRelationsItem);
    }

    return this;
  }
  /**
   * Describes if this is a developer user, which has additional debug and additional features available in UI. Only users with portal_user_manage_technical_users can change this.
   **/
  public ProfileMessageData isDeveloper(Boolean isDeveloper) {
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
  public ProfileMessageData tenantId(UUID tenantId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileMessageData profileMessageData = (ProfileMessageData) o;
    return Objects.equals(this.firstName, profileMessageData.firstName) &&
        Objects.equals(this.lastName, profileMessageData.lastName) &&
        Objects.equals(this.phone, profileMessageData.phone) &&
        Objects.equals(this.fax, profileMessageData.fax) &&
        Objects.equals(this.department, profileMessageData.department) &&
        Objects.equals(this.position, profileMessageData.position) &&
        Objects.equals(this.office, profileMessageData.office) &&
        Objects.equals(this.locale, profileMessageData.locale) &&
        Objects.equals(this.id, profileMessageData.id) &&
        Objects.equals(this.userId, profileMessageData.userId) &&
        Objects.equals(this.keycloakId, profileMessageData.keycloakId) &&
        Objects.equals(this.accountId, profileMessageData.accountId) &&
        Objects.equals(this.status, profileMessageData.status) &&
        Objects.equals(this.salutationId, profileMessageData.salutationId) &&
        Objects.equals(this.email, profileMessageData.email) &&
        Objects.equals(this.profileTagRelations, profileMessageData.profileTagRelations) &&
        Objects.equals(this.isDeveloper, profileMessageData.isDeveloper) &&
        Objects.equals(this.tenantId, profileMessageData.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phone, fax, department, position, office, locale, id, userId, keycloakId, accountId, status, salutationId, email, profileTagRelations, isDeveloper, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileMessageData {\n");
    
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
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    salutationId: ").append(toIndentedString(salutationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    profileTagRelations: ").append(toIndentedString(profileTagRelations)).append("\n");
    sb.append("    isDeveloper: ").append(toIndentedString(isDeveloper)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

