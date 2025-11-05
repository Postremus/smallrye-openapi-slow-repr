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



@JsonTypeName("ProfileUpdateDataV3")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileUpdateDataV3   {
  private Boolean status;
  private @Valid List<@Valid ProfileContextInputDataV3> contexts = new ArrayList<>();
  private @Valid List<UUID> tagIds = new ArrayList<>();
  private Boolean isDeveloper;
  private Boolean isServiceProvider;
  private UUID tenantId;
  private Boolean hasSystemAdministratorContext;
  private URI loginLink;
  private String phone;
  private String fax;
  private String department;
  private String position;
  private String office;

  public ProfileUpdateDataV3() {
  }

  @JsonCreator
  public ProfileUpdateDataV3(
    @JsonProperty(required = true, value = "tenantId") UUID tenantId
  ) {
    this.tenantId = tenantId;
  }

  /**
   * true if the user is active, false if not.
   **/
  public ProfileUpdateDataV3 status(Boolean status) {
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
  public ProfileUpdateDataV3 contexts(List<@Valid ProfileContextInputDataV3> contexts) {
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

  public ProfileUpdateDataV3 addContextsItem(ProfileContextInputDataV3 contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<>();
    }

    this.contexts.add(contextsItem);
    return this;
  }

  public ProfileUpdateDataV3 removeContextsItem(ProfileContextInputDataV3 contextsItem) {
    if (contextsItem != null && this.contexts != null) {
      this.contexts.remove(contextsItem);
    }

    return this;
  }
  /**
   * Tags assigned to this profile.
   **/
  public ProfileUpdateDataV3 tagIds(List<UUID> tagIds) {
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

  public ProfileUpdateDataV3 addTagIdsItem(UUID tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<>();
    }

    this.tagIds.add(tagIdsItem);
    return this;
  }

  public ProfileUpdateDataV3 removeTagIdsItem(UUID tagIdsItem) {
    if (tagIdsItem != null && this.tagIds != null) {
      this.tagIds.remove(tagIdsItem);
    }

    return this;
  }
  /**
   * Describes if this is a developer user, which has additional debug and additional features available in UI. Only users with portal_user_manage_technical_users can change this.
   **/
  public ProfileUpdateDataV3 isDeveloper(Boolean isDeveloper) {
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
  public ProfileUpdateDataV3 isServiceProvider(Boolean isServiceProvider) {
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
  public ProfileUpdateDataV3 tenantId(UUID tenantId) {
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
  public ProfileUpdateDataV3 hasSystemAdministratorContext(Boolean hasSystemAdministratorContext) {
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
  public ProfileUpdateDataV3 loginLink(URI loginLink) {
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
  public ProfileUpdateDataV3 phone(String phone) {
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
  public ProfileUpdateDataV3 fax(String fax) {
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
  public ProfileUpdateDataV3 department(String department) {
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
  public ProfileUpdateDataV3 position(String position) {
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
  public ProfileUpdateDataV3 office(String office) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileUpdateDataV3 profileUpdateDataV3 = (ProfileUpdateDataV3) o;
    return Objects.equals(this.status, profileUpdateDataV3.status) &&
        Objects.equals(this.contexts, profileUpdateDataV3.contexts) &&
        Objects.equals(this.tagIds, profileUpdateDataV3.tagIds) &&
        Objects.equals(this.isDeveloper, profileUpdateDataV3.isDeveloper) &&
        Objects.equals(this.isServiceProvider, profileUpdateDataV3.isServiceProvider) &&
        Objects.equals(this.tenantId, profileUpdateDataV3.tenantId) &&
        Objects.equals(this.hasSystemAdministratorContext, profileUpdateDataV3.hasSystemAdministratorContext) &&
        Objects.equals(this.loginLink, profileUpdateDataV3.loginLink) &&
        Objects.equals(this.phone, profileUpdateDataV3.phone) &&
        Objects.equals(this.fax, profileUpdateDataV3.fax) &&
        Objects.equals(this.department, profileUpdateDataV3.department) &&
        Objects.equals(this.position, profileUpdateDataV3.position) &&
        Objects.equals(this.office, profileUpdateDataV3.office);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, contexts, tagIds, isDeveloper, isServiceProvider, tenantId, hasSystemAdministratorContext, loginLink, phone, fax, department, position, office);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileUpdateDataV3 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    isDeveloper: ").append(toIndentedString(isDeveloper)).append("\n");
    sb.append("    isServiceProvider: ").append(toIndentedString(isServiceProvider)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    hasSystemAdministratorContext: ").append(toIndentedString(hasSystemAdministratorContext)).append("\n");
    sb.append("    loginLink: ").append(toIndentedString(loginLink)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
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

