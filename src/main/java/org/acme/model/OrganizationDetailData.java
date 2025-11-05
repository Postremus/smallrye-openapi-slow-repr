package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.acme.model.ExternalOrganizationData;
import org.acme.model.OrganizationApplicationGrantData;
import org.acme.model.OrganizationType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OrganizationDetailData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class OrganizationDetailData   {
  private UUID id;
  private UUID uuid;
  private Boolean supportAreaEnabled;
  private @Valid List<@Valid ExternalOrganizationData> externalOrganizations = new ArrayList<>();
  private @Valid List<@Valid OrganizationApplicationGrantData> accessGrants = new ArrayList<>();
  private Date createDateTime;
  private String createUser;
  private Date lastUpdateDateTime;
  private String lastUpdateUser;
  private String name;
  private String matchCode;
  private String name2;
  private String streetAndNumber;
  private String appendix;
  private String country;
  private String zipCode;
  private String city;
  private String district;
  private String zipCodePoBox;
  private String poBox;
  private String phone;
  private String mobile;
  private String fax;
  private String email;
  private String website;
  private Boolean deleted;
  private UUID tenantId;
  private UUID parentId;
  private Boolean isMandator;
  private OrganizationType type;
  private Boolean previewFeatures;
  private UUID designProfileId;

  public OrganizationDetailData() {
  }

  @JsonCreator
  public OrganizationDetailData(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "streetAndNumber") String streetAndNumber,
    @JsonProperty(required = true, value = "country") String country,
    @JsonProperty(required = true, value = "zipCode") String zipCode,
    @JsonProperty(required = true, value = "city") String city,
    @JsonProperty(required = true, value = "email") String email
  ) {
    this.name = name;
    this.streetAndNumber = streetAndNumber;
    this.country = country;
    this.zipCode = zipCode;
    this.city = city;
    this.email = email;
  }

  /**
   **/
  public OrganizationDetailData id(UUID id) {
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
   **/
  public OrganizationDetailData uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @JsonProperty("uuid")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getUuid() {
    return uuid;
  }

  @JsonProperty("uuid")
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
   * If the  support area is enabled for this organization.
   **/
  public OrganizationDetailData supportAreaEnabled(Boolean supportAreaEnabled) {
    this.supportAreaEnabled = supportAreaEnabled;
    return this;
  }

  
  @JsonProperty("supportAreaEnabled")
  public Boolean getSupportAreaEnabled() {
    return supportAreaEnabled;
  }

  @JsonProperty("supportAreaEnabled")
  public void setSupportAreaEnabled(Boolean supportAreaEnabled) {
    this.supportAreaEnabled = supportAreaEnabled;
  }

  /**
   * All external organizations linked to this portal organization.
   **/
  public OrganizationDetailData externalOrganizations(List<@Valid ExternalOrganizationData> externalOrganizations) {
    this.externalOrganizations = externalOrganizations;
    return this;
  }

  
  @JsonProperty("externalOrganizations")
  @Valid public List<@Valid ExternalOrganizationData> getExternalOrganizations() {
    return externalOrganizations;
  }

  @JsonProperty("externalOrganizations")
  public void setExternalOrganizations(List<@Valid ExternalOrganizationData> externalOrganizations) {
    this.externalOrganizations = externalOrganizations;
  }

  public OrganizationDetailData addExternalOrganizationsItem(ExternalOrganizationData externalOrganizationsItem) {
    if (this.externalOrganizations == null) {
      this.externalOrganizations = new ArrayList<>();
    }

    this.externalOrganizations.add(externalOrganizationsItem);
    return this;
  }

  public OrganizationDetailData removeExternalOrganizationsItem(ExternalOrganizationData externalOrganizationsItem) {
    if (externalOrganizationsItem != null && this.externalOrganizations != null) {
      this.externalOrganizations.remove(externalOrganizationsItem);
    }

    return this;
  }
  /**
   * List of all applications this organization is allowed to use.
   **/
  public OrganizationDetailData accessGrants(List<@Valid OrganizationApplicationGrantData> accessGrants) {
    this.accessGrants = accessGrants;
    return this;
  }

  
  @JsonProperty("accessGrants")
  @Valid public List<@Valid OrganizationApplicationGrantData> getAccessGrants() {
    return accessGrants;
  }

  @JsonProperty("accessGrants")
  public void setAccessGrants(List<@Valid OrganizationApplicationGrantData> accessGrants) {
    this.accessGrants = accessGrants;
  }

  public OrganizationDetailData addAccessGrantsItem(OrganizationApplicationGrantData accessGrantsItem) {
    if (this.accessGrants == null) {
      this.accessGrants = new ArrayList<>();
    }

    this.accessGrants.add(accessGrantsItem);
    return this;
  }

  public OrganizationDetailData removeAccessGrantsItem(OrganizationApplicationGrantData accessGrantsItem) {
    if (accessGrantsItem != null && this.accessGrants != null) {
      this.accessGrants.remove(accessGrantsItem);
    }

    return this;
  }
  /**
   **/
  public OrganizationDetailData createDateTime(Date createDateTime) {
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
  public OrganizationDetailData createUser(String createUser) {
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
  public OrganizationDetailData lastUpdateDateTime(Date lastUpdateDateTime) {
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
  public OrganizationDetailData lastUpdateUser(String lastUpdateUser) {
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
  public OrganizationDetailData name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty(required = true, value = "name")
  @NotNull  @Pattern(regexp="\\S") @Size(max=255)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Matchcode of this object. Matchcodes are upper cases abbreviations of e.g. the object name, or the upper cased functional key of the object.
   **/
  public OrganizationDetailData matchCode(String matchCode) {
    this.matchCode = matchCode;
    return this;
  }

  
  @JsonProperty("matchCode")
   @Pattern(regexp="[A-Z0-9]*") @Size(max=100)public String getMatchCode() {
    return matchCode;
  }

  @JsonProperty("matchCode")
  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }

  /**
   **/
  public OrganizationDetailData name2(String name2) {
    this.name2 = name2;
    return this;
  }

  
  @JsonProperty("name2")
   @Size(max=255)public String getName2() {
    return name2;
  }

  @JsonProperty("name2")
  public void setName2(String name2) {
    this.name2 = name2;
  }

  /**
   **/
  public OrganizationDetailData streetAndNumber(String streetAndNumber) {
    this.streetAndNumber = streetAndNumber;
    return this;
  }

  
  @JsonProperty(required = true, value = "streetAndNumber")
  @NotNull  @Pattern(regexp="\\S") @Size(max=255)public String getStreetAndNumber() {
    return streetAndNumber;
  }

  @JsonProperty(required = true, value = "streetAndNumber")
  public void setStreetAndNumber(String streetAndNumber) {
    this.streetAndNumber = streetAndNumber;
  }

  /**
   **/
  public OrganizationDetailData appendix(String appendix) {
    this.appendix = appendix;
    return this;
  }

  
  @JsonProperty("appendix")
   @Size(max=255)public String getAppendix() {
    return appendix;
  }

  @JsonProperty("appendix")
  public void setAppendix(String appendix) {
    this.appendix = appendix;
  }

  /**
   * ISO 3166 ALPHA-2 country code.
   **/
  public OrganizationDetailData country(String country) {
    this.country = country;
    return this;
  }

  
  @JsonProperty(required = true, value = "country")
  @NotNull  @Pattern(regexp="[A-Z]{2}")public String getCountry() {
    return country;
  }

  @JsonProperty(required = true, value = "country")
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  public OrganizationDetailData zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  
  @JsonProperty(required = true, value = "zipCode")
  @NotNull  @Pattern(regexp="\\S") @Size(max=20)public String getZipCode() {
    return zipCode;
  }

  @JsonProperty(required = true, value = "zipCode")
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  /**
   **/
  public OrganizationDetailData city(String city) {
    this.city = city;
    return this;
  }

  
  @JsonProperty(required = true, value = "city")
  @NotNull  @Pattern(regexp="\\S") @Size(max=255)public String getCity() {
    return city;
  }

  @JsonProperty(required = true, value = "city")
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  public OrganizationDetailData district(String district) {
    this.district = district;
    return this;
  }

  
  @JsonProperty("district")
   @Size(max=60)public String getDistrict() {
    return district;
  }

  @JsonProperty("district")
  public void setDistrict(String district) {
    this.district = district;
  }

  /**
   **/
  public OrganizationDetailData zipCodePoBox(String zipCodePoBox) {
    this.zipCodePoBox = zipCodePoBox;
    return this;
  }

  
  @JsonProperty("zipCodePoBox")
   @Size(max=20)public String getZipCodePoBox() {
    return zipCodePoBox;
  }

  @JsonProperty("zipCodePoBox")
  public void setZipCodePoBox(String zipCodePoBox) {
    this.zipCodePoBox = zipCodePoBox;
  }

  /**
   **/
  public OrganizationDetailData poBox(String poBox) {
    this.poBox = poBox;
    return this;
  }

  
  @JsonProperty("poBox")
   @Size(max=100)public String getPoBox() {
    return poBox;
  }

  @JsonProperty("poBox")
  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  /**
   **/
  public OrganizationDetailData phone(String phone) {
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
  public OrganizationDetailData mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  
  @JsonProperty("mobile")
   @Pattern(regexp="^[0-9\\-\\+/\\(\\ \\)]+$") @Size(max=80)public String getMobile() {
    return mobile;
  }

  @JsonProperty("mobile")
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   **/
  public OrganizationDetailData fax(String fax) {
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
  public OrganizationDetailData email(String email) {
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
  public OrganizationDetailData website(String website) {
    this.website = website;
    return this;
  }

  
  @JsonProperty("website")
   @Size(max=255)public String getWebsite() {
    return website;
  }

  @JsonProperty("website")
  public void setWebsite(String website) {
    this.website = website;
  }

  /**
   * true if this tenant is deleted.
   **/
  public OrganizationDetailData deleted(Boolean deleted) {
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

  /**
   **/
  public OrganizationDetailData tenantId(UUID tenantId) {
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
  public OrganizationDetailData parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @JsonProperty("parentId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getParentId() {
    return parentId;
  }

  @JsonProperty("parentId")
  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  public OrganizationDetailData isMandator(Boolean isMandator) {
    this.isMandator = isMandator;
    return this;
  }

  
  @JsonProperty("isMandator")
  public Boolean getIsMandator() {
    return isMandator;
  }

  @JsonProperty("isMandator")
  public void setIsMandator(Boolean isMandator) {
    this.isMandator = isMandator;
  }

  /**
   * type of the organization, automatically determined by the service.
   **/
  public OrganizationDetailData type(OrganizationType type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
  public OrganizationType getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(OrganizationType type) {
    this.type = type;
  }

  /**
   * Decides if preview features should be activated for contexts of this organization.
   **/
  public OrganizationDetailData previewFeatures(Boolean previewFeatures) {
    this.previewFeatures = previewFeatures;
    return this;
  }

  
  @JsonProperty("previewFeatures")
  public Boolean getPreviewFeatures() {
    return previewFeatures;
  }

  @JsonProperty("previewFeatures")
  public void setPreviewFeatures(Boolean previewFeatures) {
    this.previewFeatures = previewFeatures;
  }

  /**
   **/
  public OrganizationDetailData designProfileId(UUID designProfileId) {
    this.designProfileId = designProfileId;
    return this;
  }

  
  @JsonProperty("designProfileId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getDesignProfileId() {
    return designProfileId;
  }

  @JsonProperty("designProfileId")
  public void setDesignProfileId(UUID designProfileId) {
    this.designProfileId = designProfileId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationDetailData organizationDetailData = (OrganizationDetailData) o;
    return Objects.equals(this.id, organizationDetailData.id) &&
        Objects.equals(this.uuid, organizationDetailData.uuid) &&
        Objects.equals(this.supportAreaEnabled, organizationDetailData.supportAreaEnabled) &&
        Objects.equals(this.externalOrganizations, organizationDetailData.externalOrganizations) &&
        Objects.equals(this.accessGrants, organizationDetailData.accessGrants) &&
        Objects.equals(this.createDateTime, organizationDetailData.createDateTime) &&
        Objects.equals(this.createUser, organizationDetailData.createUser) &&
        Objects.equals(this.lastUpdateDateTime, organizationDetailData.lastUpdateDateTime) &&
        Objects.equals(this.lastUpdateUser, organizationDetailData.lastUpdateUser) &&
        Objects.equals(this.name, organizationDetailData.name) &&
        Objects.equals(this.matchCode, organizationDetailData.matchCode) &&
        Objects.equals(this.name2, organizationDetailData.name2) &&
        Objects.equals(this.streetAndNumber, organizationDetailData.streetAndNumber) &&
        Objects.equals(this.appendix, organizationDetailData.appendix) &&
        Objects.equals(this.country, organizationDetailData.country) &&
        Objects.equals(this.zipCode, organizationDetailData.zipCode) &&
        Objects.equals(this.city, organizationDetailData.city) &&
        Objects.equals(this.district, organizationDetailData.district) &&
        Objects.equals(this.zipCodePoBox, organizationDetailData.zipCodePoBox) &&
        Objects.equals(this.poBox, organizationDetailData.poBox) &&
        Objects.equals(this.phone, organizationDetailData.phone) &&
        Objects.equals(this.mobile, organizationDetailData.mobile) &&
        Objects.equals(this.fax, organizationDetailData.fax) &&
        Objects.equals(this.email, organizationDetailData.email) &&
        Objects.equals(this.website, organizationDetailData.website) &&
        Objects.equals(this.deleted, organizationDetailData.deleted) &&
        Objects.equals(this.tenantId, organizationDetailData.tenantId) &&
        Objects.equals(this.parentId, organizationDetailData.parentId) &&
        Objects.equals(this.isMandator, organizationDetailData.isMandator) &&
        Objects.equals(this.type, organizationDetailData.type) &&
        Objects.equals(this.previewFeatures, organizationDetailData.previewFeatures) &&
        Objects.equals(this.designProfileId, organizationDetailData.designProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, supportAreaEnabled, externalOrganizations, accessGrants, createDateTime, createUser, lastUpdateDateTime, lastUpdateUser, name, matchCode, name2, streetAndNumber, appendix, country, zipCode, city, district, zipCodePoBox, poBox, phone, mobile, fax, email, website, deleted, tenantId, parentId, isMandator, type, previewFeatures, designProfileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationDetailData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    supportAreaEnabled: ").append(toIndentedString(supportAreaEnabled)).append("\n");
    sb.append("    externalOrganizations: ").append(toIndentedString(externalOrganizations)).append("\n");
    sb.append("    accessGrants: ").append(toIndentedString(accessGrants)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    lastUpdateUser: ").append(toIndentedString(lastUpdateUser)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
    sb.append("    streetAndNumber: ").append(toIndentedString(streetAndNumber)).append("\n");
    sb.append("    appendix: ").append(toIndentedString(appendix)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    zipCodePoBox: ").append(toIndentedString(zipCodePoBox)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    isMandator: ").append(toIndentedString(isMandator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    previewFeatures: ").append(toIndentedString(previewFeatures)).append("\n");
    sb.append("    designProfileId: ").append(toIndentedString(designProfileId)).append("\n");
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

