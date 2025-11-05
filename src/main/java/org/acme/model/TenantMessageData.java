package org.acme.model;

import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TenantMessageData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class TenantMessageData   {
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

  public TenantMessageData() {
  }

  @JsonCreator
  public TenantMessageData(
    @JsonProperty(required = true, value = "email") String email
  ) {
    this.email = email;
  }

  /**
   **/
  public TenantMessageData id(UUID id) {
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
  public TenantMessageData name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Matchcode of this object. Matchcodes are upper cases abbreviations of e.g. the object name, or the upper cased functional key of the object.
   **/
  public TenantMessageData matchCode(String matchCode) {
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
  public TenantMessageData name2(String name2) {
    this.name2 = name2;
    return this;
  }

  
  @JsonProperty("name2")
  public String getName2() {
    return name2;
  }

  @JsonProperty("name2")
  public void setName2(String name2) {
    this.name2 = name2;
  }

  /**
   **/
  public TenantMessageData streetAndNumber(String streetAndNumber) {
    this.streetAndNumber = streetAndNumber;
    return this;
  }

  
  @JsonProperty("streetAndNumber")
  public String getStreetAndNumber() {
    return streetAndNumber;
  }

  @JsonProperty("streetAndNumber")
  public void setStreetAndNumber(String streetAndNumber) {
    this.streetAndNumber = streetAndNumber;
  }

  /**
   **/
  public TenantMessageData appendix(String appendix) {
    this.appendix = appendix;
    return this;
  }

  
  @JsonProperty("appendix")
  public String getAppendix() {
    return appendix;
  }

  @JsonProperty("appendix")
  public void setAppendix(String appendix) {
    this.appendix = appendix;
  }

  /**
   **/
  public TenantMessageData country(String country) {
    this.country = country;
    return this;
  }

  
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  public TenantMessageData zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }

  @JsonProperty("zipCode")
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  /**
   **/
  public TenantMessageData city(String city) {
    this.city = city;
    return this;
  }

  
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  public TenantMessageData district(String district) {
    this.district = district;
    return this;
  }

  
  @JsonProperty("district")
  public String getDistrict() {
    return district;
  }

  @JsonProperty("district")
  public void setDistrict(String district) {
    this.district = district;
  }

  /**
   **/
  public TenantMessageData zipCodePoBox(String zipCodePoBox) {
    this.zipCodePoBox = zipCodePoBox;
    return this;
  }

  
  @JsonProperty("zipCodePoBox")
  public String getZipCodePoBox() {
    return zipCodePoBox;
  }

  @JsonProperty("zipCodePoBox")
  public void setZipCodePoBox(String zipCodePoBox) {
    this.zipCodePoBox = zipCodePoBox;
  }

  /**
   **/
  public TenantMessageData poBox(String poBox) {
    this.poBox = poBox;
    return this;
  }

  
  @JsonProperty("poBox")
  public String getPoBox() {
    return poBox;
  }

  @JsonProperty("poBox")
  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  /**
   **/
  public TenantMessageData phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  @JsonProperty("phone")
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  public TenantMessageData mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  
  @JsonProperty("mobile")
  public String getMobile() {
    return mobile;
  }

  @JsonProperty("mobile")
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   **/
  public TenantMessageData fax(String fax) {
    this.fax = fax;
    return this;
  }

  
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }

  @JsonProperty("fax")
  public void setFax(String fax) {
    this.fax = fax;
  }

  /**
   **/
  public TenantMessageData email(String email) {
    this.email = email;
    return this;
  }

  
  @JsonProperty(required = true, value = "email")
  @NotNull  @Size(max=255)public String getEmail() {
    return email;
  }

  @JsonProperty(required = true, value = "email")
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public TenantMessageData website(String website) {
    this.website = website;
    return this;
  }

  
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  @JsonProperty("website")
  public void setWebsite(String website) {
    this.website = website;
  }

  /**
   **/
  public TenantMessageData deleted(Boolean deleted) {
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
    TenantMessageData tenantMessageData = (TenantMessageData) o;
    return Objects.equals(this.id, tenantMessageData.id) &&
        Objects.equals(this.name, tenantMessageData.name) &&
        Objects.equals(this.matchCode, tenantMessageData.matchCode) &&
        Objects.equals(this.name2, tenantMessageData.name2) &&
        Objects.equals(this.streetAndNumber, tenantMessageData.streetAndNumber) &&
        Objects.equals(this.appendix, tenantMessageData.appendix) &&
        Objects.equals(this.country, tenantMessageData.country) &&
        Objects.equals(this.zipCode, tenantMessageData.zipCode) &&
        Objects.equals(this.city, tenantMessageData.city) &&
        Objects.equals(this.district, tenantMessageData.district) &&
        Objects.equals(this.zipCodePoBox, tenantMessageData.zipCodePoBox) &&
        Objects.equals(this.poBox, tenantMessageData.poBox) &&
        Objects.equals(this.phone, tenantMessageData.phone) &&
        Objects.equals(this.mobile, tenantMessageData.mobile) &&
        Objects.equals(this.fax, tenantMessageData.fax) &&
        Objects.equals(this.email, tenantMessageData.email) &&
        Objects.equals(this.website, tenantMessageData.website) &&
        Objects.equals(this.deleted, tenantMessageData.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, matchCode, name2, streetAndNumber, appendix, country, zipCode, city, district, zipCodePoBox, poBox, phone, mobile, fax, email, website, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantMessageData {\n");
    
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

