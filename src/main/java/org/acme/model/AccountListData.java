package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.acme.model.ContextDataV3;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AccountListData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class AccountListData   {
  private UUID id;
  private String keycloakId;
  private String email;
  private Long salutationId;
  private String firstName;
  private String lastName;
  private String locale;
  private Boolean isTechnical;
  private @Valid List<UUID> tenantIds = new ArrayList<>();
  private Boolean status;
  private Date lastLogin;
  private @Valid List<@Valid ContextDataV3> contexts = new ArrayList<>();
  private @Valid List<UUID> tagIds = new ArrayList<>();
  private Boolean isServiceProvider;
  private Boolean deleted;

  public AccountListData() {
  }

  /**
   **/
  public AccountListData id(UUID id) {
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
   * Id which identifies this account in keycloak.
   **/
  public AccountListData keycloakId(String keycloakId) {
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
   * Email address of this account. Has to be unique in the system.
   **/
  public AccountListData email(String email) {
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
   * Salutation of the account, like Herr, Frau, etc. Has to be a valid id of a salutation.
   **/
  public AccountListData salutationId(Long salutationId) {
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
   **/
  public AccountListData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @JsonProperty("firstName")
   @Size(max=100)public String getFirstName() {
    return firstName;
  }

  @JsonProperty("firstName")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  public AccountListData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @JsonProperty("lastName")
   @Size(max=100)public String getLastName() {
    return lastName;
  }

  @JsonProperty("lastName")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Language which should be used in translations for this account. E.g. for automated system mails.
   **/
  public AccountListData locale(String locale) {
    this.locale = locale;
    return this;
  }

  
  @JsonProperty("locale")
   @Pattern(regexp="[a-z]{2}-[A-Z]{2}") @Size(max=5)public String getLocale() {
    return locale;
  }

  @JsonProperty("locale")
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * Describes if this profile is a technical user. These profiles are intended for machine to machine communications. Technical accounts are controlled by the &#x60;portal_user_manage_technical_users&#x60; right, which allows: * Deletion and modification of technical accounts and their profiles. * Initially creating technical accounts  By default, technical users are not visible in the user management list.
   **/
  public AccountListData isTechnical(Boolean isTechnical) {
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
   * List of Tenant UUIDs.
   **/
  public AccountListData tenantIds(List<UUID> tenantIds) {
    this.tenantIds = tenantIds;
    return this;
  }

  
  @JsonProperty("tenantIds")
  public List< @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")UUID> getTenantIds() {
    return tenantIds;
  }

  @JsonProperty("tenantIds")
  public void setTenantIds(List<UUID> tenantIds) {
    this.tenantIds = tenantIds;
  }

  public AccountListData addTenantIdsItem(UUID tenantIdsItem) {
    if (this.tenantIds == null) {
      this.tenantIds = new ArrayList<>();
    }

    this.tenantIds.add(tenantIdsItem);
    return this;
  }

  public AccountListData removeTenantIdsItem(UUID tenantIdsItem) {
    if (tenantIdsItem != null && this.tenantIds != null) {
      this.tenantIds.remove(tenantIdsItem);
    }

    return this;
  }
  /**
   * Decides whether this profile is active in portal or not.
   **/
  public AccountListData status(Boolean status) {
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
   **/
  public AccountListData lastLogin(Date lastLogin) {
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
   * Contexts of this account. Contains the automatically and manually created contexts.
   **/
  public AccountListData contexts(List<@Valid ContextDataV3> contexts) {
    this.contexts = contexts;
    return this;
  }

  
  @JsonProperty("contexts")
  @Valid public List<@Valid ContextDataV3> getContexts() {
    return contexts;
  }

  @JsonProperty("contexts")
  public void setContexts(List<@Valid ContextDataV3> contexts) {
    this.contexts = contexts;
  }

  public AccountListData addContextsItem(ContextDataV3 contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<>();
    }

    this.contexts.add(contextsItem);
    return this;
  }

  public AccountListData removeContextsItem(ContextDataV3 contextsItem) {
    if (contextsItem != null && this.contexts != null) {
      this.contexts.remove(contextsItem);
    }

    return this;
  }
  /**
   * Tags that are assigned to profiles of this account.
   **/
  public AccountListData tagIds(List<UUID> tagIds) {
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

  public AccountListData addTagIdsItem(UUID tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<>();
    }

    this.tagIds.add(tagIdsItem);
    return this;
  }

  public AccountListData removeTagIdsItem(UUID tagIdsItem) {
    if (tagIdsItem != null && this.tagIds != null) {
      this.tagIds.remove(tagIdsItem);
    }

    return this;
  }
  /**
   * Describes if any profile of this account is a service provider user. These profiles are intended to be shared by multiple real life persons. Service provider users are controlled by the &#x60;portal_user_manage_service_users&#x60; right, which allows: * Creation, Deletion and modification of service provider users. * Changing the value of this flag  By default, service provider users are not visible in the user management list.
   **/
  public AccountListData isServiceProvider(Boolean isServiceProvider) {
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
   * true if this profile is deleted.
   **/
  public AccountListData deleted(Boolean deleted) {
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
    AccountListData accountListData = (AccountListData) o;
    return Objects.equals(this.id, accountListData.id) &&
        Objects.equals(this.keycloakId, accountListData.keycloakId) &&
        Objects.equals(this.email, accountListData.email) &&
        Objects.equals(this.salutationId, accountListData.salutationId) &&
        Objects.equals(this.firstName, accountListData.firstName) &&
        Objects.equals(this.lastName, accountListData.lastName) &&
        Objects.equals(this.locale, accountListData.locale) &&
        Objects.equals(this.isTechnical, accountListData.isTechnical) &&
        Objects.equals(this.tenantIds, accountListData.tenantIds) &&
        Objects.equals(this.status, accountListData.status) &&
        Objects.equals(this.lastLogin, accountListData.lastLogin) &&
        Objects.equals(this.contexts, accountListData.contexts) &&
        Objects.equals(this.tagIds, accountListData.tagIds) &&
        Objects.equals(this.isServiceProvider, accountListData.isServiceProvider) &&
        Objects.equals(this.deleted, accountListData.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keycloakId, email, salutationId, firstName, lastName, locale, isTechnical, tenantIds, status, lastLogin, contexts, tagIds, isServiceProvider, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountListData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keycloakId: ").append(toIndentedString(keycloakId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    salutationId: ").append(toIndentedString(salutationId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    isTechnical: ").append(toIndentedString(isTechnical)).append("\n");
    sb.append("    tenantIds: ").append(toIndentedString(tenantIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    isServiceProvider: ").append(toIndentedString(isServiceProvider)).append("\n");
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

