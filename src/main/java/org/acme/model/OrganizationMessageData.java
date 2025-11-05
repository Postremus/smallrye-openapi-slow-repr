package org.acme.model;

import java.util.Date;
import java.util.UUID;
import org.acme.model.OrganizationType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OrganizationMessageData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class OrganizationMessageData   {
  private UUID id;
  private UUID uuid;
  private Boolean supportAreaEnabled;
  private Date createDateTime;
  private Date lastUpdateDateTime;
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

  public OrganizationMessageData() {
  }

  @JsonCreator
  public OrganizationMessageData(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "matchCode") String matchCode,
    @JsonProperty(required = true, value = "streetAndNumber") String streetAndNumber,
    @JsonProperty(required = true, value = "country") String country,
    @JsonProperty(required = true, value = "zipCode") String zipCode,
    @JsonProperty(required = true, value = "city") String city,
    @JsonProperty(required = true, value = "email") String email
  ) {
    this.name = name;
    this.matchCode = matchCode;
    this.streetAndNumber = streetAndNumber;
    this.country = country;
    this.zipCode = zipCode;
    this.city = city;
    this.email = email;
  }

  /**
   **/
  public OrganizationMessageData id(UUID id) {
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
  public OrganizationMessageData uuid(UUID uuid) {
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
  public OrganizationMessageData supportAreaEnabled(Boolean supportAreaEnabled) {
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
   **/
  public OrganizationMessageData createDateTime(Date createDateTime) {
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
  public OrganizationMessageData lastUpdateDateTime(Date lastUpdateDateTime) {
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
  public OrganizationMessageData name(String name) {
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
  public OrganizationMessageData matchCode(String matchCode) {
    this.matchCode = matchCode;
    return this;
  }

  
  @JsonProperty(required = true, value = "matchCode")
  @NotNull  @Pattern(regexp="\\S") @Size(max=100)public String getMatchCode() {
    return matchCode;
  }

  @JsonProperty(required = true, value = "matchCode")
  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }

  /**
   **/
  public OrganizationMessageData name2(String name2) {
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
  public OrganizationMessageData streetAndNumber(String streetAndNumber) {
    this.streetAndNumber = streetAndNumber;
    return this;
  }

  
  @JsonProperty(required = true, value = "streetAndNumber")
  @NotNull  @Pattern(regexp="\\S") @Size(max=35)public String getStreetAndNumber() {
    return streetAndNumber;
  }

  @JsonProperty(required = true, value = "streetAndNumber")
  public void setStreetAndNumber(String streetAndNumber) {
    this.streetAndNumber = streetAndNumber;
  }

  /**
   **/
  public OrganizationMessageData appendix(String appendix) {
    this.appendix = appendix;
    return this;
  }

  
  @JsonProperty("appendix")
   @Size(max=35)public String getAppendix() {
    return appendix;
  }

  @JsonProperty("appendix")
  public void setAppendix(String appendix) {
    this.appendix = appendix;
  }

  /**
   * ISO 3166 ALPHA-2 country code.
   **/
  public OrganizationMessageData country(String country) {
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
  public OrganizationMessageData zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  
  @JsonProperty(required = true, value = "zipCode")
  @NotNull  @Pattern(regexp="\\S") @Size(max=10)public String getZipCode() {
    return zipCode;
  }

  @JsonProperty(required = true, value = "zipCode")
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  /**
   **/
  public OrganizationMessageData city(String city) {
    this.city = city;
    return this;
  }

  
  @JsonProperty(required = true, value = "city")
  @NotNull  @Pattern(regexp="\\S") @Size(max=60)public String getCity() {
    return city;
  }

  @JsonProperty(required = true, value = "city")
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  public OrganizationMessageData district(String district) {
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
  public OrganizationMessageData zipCodePoBox(String zipCodePoBox) {
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
  public OrganizationMessageData poBox(String poBox) {
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
  public OrganizationMessageData phone(String phone) {
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
  public OrganizationMessageData mobile(String mobile) {
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
  public OrganizationMessageData fax(String fax) {
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
  public OrganizationMessageData email(String email) {
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
  public OrganizationMessageData website(String website) {
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
  public OrganizationMessageData deleted(Boolean deleted) {
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
  public OrganizationMessageData tenantId(UUID tenantId) {
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
  public OrganizationMessageData parentId(UUID parentId) {
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
  public OrganizationMessageData isMandator(Boolean isMandator) {
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
  public OrganizationMessageData type(OrganizationType type) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationMessageData organizationMessageData = (OrganizationMessageData) o;
    return Objects.equals(this.id, organizationMessageData.id) &&
        Objects.equals(this.uuid, organizationMessageData.uuid) &&
        Objects.equals(this.supportAreaEnabled, organizationMessageData.supportAreaEnabled) &&
        Objects.equals(this.createDateTime, organizationMessageData.createDateTime) &&
        Objects.equals(this.lastUpdateDateTime, organizationMessageData.lastUpdateDateTime) &&
        Objects.equals(this.name, organizationMessageData.name) &&
        Objects.equals(this.matchCode, organizationMessageData.matchCode) &&
        Objects.equals(this.name2, organizationMessageData.name2) &&
        Objects.equals(this.streetAndNumber, organizationMessageData.streetAndNumber) &&
        Objects.equals(this.appendix, organizationMessageData.appendix) &&
        Objects.equals(this.country, organizationMessageData.country) &&
        Objects.equals(this.zipCode, organizationMessageData.zipCode) &&
        Objects.equals(this.city, organizationMessageData.city) &&
        Objects.equals(this.district, organizationMessageData.district) &&
        Objects.equals(this.zipCodePoBox, organizationMessageData.zipCodePoBox) &&
        Objects.equals(this.poBox, organizationMessageData.poBox) &&
        Objects.equals(this.phone, organizationMessageData.phone) &&
        Objects.equals(this.mobile, organizationMessageData.mobile) &&
        Objects.equals(this.fax, organizationMessageData.fax) &&
        Objects.equals(this.email, organizationMessageData.email) &&
        Objects.equals(this.website, organizationMessageData.website) &&
        Objects.equals(this.deleted, organizationMessageData.deleted) &&
        Objects.equals(this.tenantId, organizationMessageData.tenantId) &&
        Objects.equals(this.parentId, organizationMessageData.parentId) &&
        Objects.equals(this.isMandator, organizationMessageData.isMandator) &&
        Objects.equals(this.type, organizationMessageData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, supportAreaEnabled, createDateTime, lastUpdateDateTime, name, matchCode, name2, streetAndNumber, appendix, country, zipCode, city, district, zipCodePoBox, poBox, phone, mobile, fax, email, website, deleted, tenantId, parentId, isMandator, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationMessageData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    supportAreaEnabled: ").append(toIndentedString(supportAreaEnabled)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
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

