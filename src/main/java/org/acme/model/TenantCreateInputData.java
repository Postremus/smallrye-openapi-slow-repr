package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.TenantApplicationGrantData;
import org.acme.model.TenantProfileInputData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TenantCreateInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class TenantCreateInputData   {
  private UUID id;
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
  private @Valid List<@Valid TenantApplicationGrantData> accessGrants = new ArrayList<>();
  private TenantProfileInputData profile;

  public TenantCreateInputData() {
  }

  @JsonCreator
  public TenantCreateInputData(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "matchCode") String matchCode,
    @JsonProperty(required = true, value = "streetAndNumber") String streetAndNumber,
    @JsonProperty(required = true, value = "country") String country,
    @JsonProperty(required = true, value = "zipCode") String zipCode,
    @JsonProperty(required = true, value = "city") String city,
    @JsonProperty(required = true, value = "email") String email,
    @JsonProperty(required = true, value = "profile") TenantProfileInputData profile
  ) {
    this.name = name;
    this.matchCode = matchCode;
    this.streetAndNumber = streetAndNumber;
    this.country = country;
    this.zipCode = zipCode;
    this.city = city;
    this.email = email;
    this.profile = profile;
  }

  /**
   **/
  public TenantCreateInputData id(UUID id) {
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
  public TenantCreateInputData name(String name) {
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
  public TenantCreateInputData matchCode(String matchCode) {
    this.matchCode = matchCode;
    return this;
  }

  
  @JsonProperty(required = true, value = "matchCode")
  @NotNull  @Pattern(regexp="[A-Z0-9]*") @Size(max=100)public String getMatchCode() {
    return matchCode;
  }

  @JsonProperty(required = true, value = "matchCode")
  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }

  /**
   **/
  public TenantCreateInputData name2(String name2) {
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
  public TenantCreateInputData streetAndNumber(String streetAndNumber) {
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
  public TenantCreateInputData appendix(String appendix) {
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
  public TenantCreateInputData country(String country) {
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
   * Has to match country zip code pattern.
   **/
  public TenantCreateInputData zipCode(String zipCode) {
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
  public TenantCreateInputData city(String city) {
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
  public TenantCreateInputData district(String district) {
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
  public TenantCreateInputData zipCodePoBox(String zipCodePoBox) {
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
  public TenantCreateInputData poBox(String poBox) {
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
  public TenantCreateInputData phone(String phone) {
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
  public TenantCreateInputData mobile(String mobile) {
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
  public TenantCreateInputData fax(String fax) {
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
  public TenantCreateInputData email(String email) {
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
  public TenantCreateInputData website(String website) {
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
  public TenantCreateInputData deleted(Boolean deleted) {
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
   * List of all applications this tenant is allowed to use.
   **/
  public TenantCreateInputData accessGrants(List<@Valid TenantApplicationGrantData> accessGrants) {
    this.accessGrants = accessGrants;
    return this;
  }

  
  @JsonProperty("accessGrants")
  @Valid public List<@Valid TenantApplicationGrantData> getAccessGrants() {
    return accessGrants;
  }

  @JsonProperty("accessGrants")
  public void setAccessGrants(List<@Valid TenantApplicationGrantData> accessGrants) {
    this.accessGrants = accessGrants;
  }

  public TenantCreateInputData addAccessGrantsItem(TenantApplicationGrantData accessGrantsItem) {
    if (this.accessGrants == null) {
      this.accessGrants = new ArrayList<>();
    }

    this.accessGrants.add(accessGrantsItem);
    return this;
  }

  public TenantCreateInputData removeAccessGrantsItem(TenantApplicationGrantData accessGrantsItem) {
    if (accessGrantsItem != null && this.accessGrants != null) {
      this.accessGrants.remove(accessGrantsItem);
    }

    return this;
  }
  /**
   **/
  public TenantCreateInputData profile(TenantProfileInputData profile) {
    this.profile = profile;
    return this;
  }

  
  @JsonProperty(required = true, value = "profile")
  @NotNull @Valid public TenantProfileInputData getProfile() {
    return profile;
  }

  @JsonProperty(required = true, value = "profile")
  public void setProfile(TenantProfileInputData profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantCreateInputData tenantCreateInputData = (TenantCreateInputData) o;
    return Objects.equals(this.id, tenantCreateInputData.id) &&
        Objects.equals(this.name, tenantCreateInputData.name) &&
        Objects.equals(this.matchCode, tenantCreateInputData.matchCode) &&
        Objects.equals(this.name2, tenantCreateInputData.name2) &&
        Objects.equals(this.streetAndNumber, tenantCreateInputData.streetAndNumber) &&
        Objects.equals(this.appendix, tenantCreateInputData.appendix) &&
        Objects.equals(this.country, tenantCreateInputData.country) &&
        Objects.equals(this.zipCode, tenantCreateInputData.zipCode) &&
        Objects.equals(this.city, tenantCreateInputData.city) &&
        Objects.equals(this.district, tenantCreateInputData.district) &&
        Objects.equals(this.zipCodePoBox, tenantCreateInputData.zipCodePoBox) &&
        Objects.equals(this.poBox, tenantCreateInputData.poBox) &&
        Objects.equals(this.phone, tenantCreateInputData.phone) &&
        Objects.equals(this.mobile, tenantCreateInputData.mobile) &&
        Objects.equals(this.fax, tenantCreateInputData.fax) &&
        Objects.equals(this.email, tenantCreateInputData.email) &&
        Objects.equals(this.website, tenantCreateInputData.website) &&
        Objects.equals(this.deleted, tenantCreateInputData.deleted) &&
        Objects.equals(this.accessGrants, tenantCreateInputData.accessGrants) &&
        Objects.equals(this.profile, tenantCreateInputData.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, matchCode, name2, streetAndNumber, appendix, country, zipCode, city, district, zipCodePoBox, poBox, phone, mobile, fax, email, website, deleted, accessGrants, profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantCreateInputData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    accessGrants: ").append(toIndentedString(accessGrants)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

