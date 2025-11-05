package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ExternalOrganizationData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ExternalOrganizationData   {
  private Long id;
  private String type;
  private String externalId;
  private Long applicationId;
  private String name;
  private String streetAndNumber;
  private String appendix;
  private String country;
  private String zipCode;
  private String city;
  private String district;

  public ExternalOrganizationData() {
  }

  /**
   * Id of this external organization.
   **/
  public ExternalOrganizationData id(Long id) {
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
   * Free text type describing this organization.
   **/
  public ExternalOrganizationData type(String type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Id of this org in the source system.
   **/
  public ExternalOrganizationData externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  @JsonProperty("externalId")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Application this external context is a part of.
   **/
  public ExternalOrganizationData applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }

  @JsonProperty("applicationId")
  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  /**
   **/
  public ExternalOrganizationData name(String name) {
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
   **/
  public ExternalOrganizationData streetAndNumber(String streetAndNumber) {
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
  public ExternalOrganizationData appendix(String appendix) {
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
   * ISO 3166 ALPHA-2 country code.
   **/
  public ExternalOrganizationData country(String country) {
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
  public ExternalOrganizationData zipCode(String zipCode) {
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
  public ExternalOrganizationData city(String city) {
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
  public ExternalOrganizationData district(String district) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalOrganizationData externalOrganizationData = (ExternalOrganizationData) o;
    return Objects.equals(this.id, externalOrganizationData.id) &&
        Objects.equals(this.type, externalOrganizationData.type) &&
        Objects.equals(this.externalId, externalOrganizationData.externalId) &&
        Objects.equals(this.applicationId, externalOrganizationData.applicationId) &&
        Objects.equals(this.name, externalOrganizationData.name) &&
        Objects.equals(this.streetAndNumber, externalOrganizationData.streetAndNumber) &&
        Objects.equals(this.appendix, externalOrganizationData.appendix) &&
        Objects.equals(this.country, externalOrganizationData.country) &&
        Objects.equals(this.zipCode, externalOrganizationData.zipCode) &&
        Objects.equals(this.city, externalOrganizationData.city) &&
        Objects.equals(this.district, externalOrganizationData.district);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, externalId, applicationId, name, streetAndNumber, appendix, country, zipCode, city, district);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrganizationData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    streetAndNumber: ").append(toIndentedString(streetAndNumber)).append("\n");
    sb.append("    appendix: ").append(toIndentedString(appendix)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
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

