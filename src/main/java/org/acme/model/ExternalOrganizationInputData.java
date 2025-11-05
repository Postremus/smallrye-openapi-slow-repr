package org.acme.model;

import java.util.UUID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ExternalOrganizationInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ExternalOrganizationInputData   {
  private String type;
  private String externalId;
  private UUID applicationUUID;
  private String name;
  private String streetAndNumber;
  private String appendix;
  private String country;
  private String zipCode;
  private String city;
  private String district;

  public ExternalOrganizationInputData() {
  }

  @JsonCreator
  public ExternalOrganizationInputData(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "streetAndNumber") String streetAndNumber,
    @JsonProperty(required = true, value = "country") String country,
    @JsonProperty(required = true, value = "zipCode") String zipCode,
    @JsonProperty(required = true, value = "city") String city
  ) {
    this.name = name;
    this.streetAndNumber = streetAndNumber;
    this.country = country;
    this.zipCode = zipCode;
    this.city = city;
  }

  /**
   * Free text type describing this organization.
   **/
  public ExternalOrganizationInputData type(String type) {
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
  public ExternalOrganizationInputData externalId(String externalId) {
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
   **/
  public ExternalOrganizationInputData applicationUUID(UUID applicationUUID) {
    this.applicationUUID = applicationUUID;
    return this;
  }

  
  @JsonProperty("applicationUUID")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getApplicationUUID() {
    return applicationUUID;
  }

  @JsonProperty("applicationUUID")
  public void setApplicationUUID(UUID applicationUUID) {
    this.applicationUUID = applicationUUID;
  }

  /**
   **/
  public ExternalOrganizationInputData name(String name) {
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
   **/
  public ExternalOrganizationInputData streetAndNumber(String streetAndNumber) {
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
  public ExternalOrganizationInputData appendix(String appendix) {
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
  public ExternalOrganizationInputData country(String country) {
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
  public ExternalOrganizationInputData zipCode(String zipCode) {
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
  public ExternalOrganizationInputData city(String city) {
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
  public ExternalOrganizationInputData district(String district) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalOrganizationInputData externalOrganizationInputData = (ExternalOrganizationInputData) o;
    return Objects.equals(this.type, externalOrganizationInputData.type) &&
        Objects.equals(this.externalId, externalOrganizationInputData.externalId) &&
        Objects.equals(this.applicationUUID, externalOrganizationInputData.applicationUUID) &&
        Objects.equals(this.name, externalOrganizationInputData.name) &&
        Objects.equals(this.streetAndNumber, externalOrganizationInputData.streetAndNumber) &&
        Objects.equals(this.appendix, externalOrganizationInputData.appendix) &&
        Objects.equals(this.country, externalOrganizationInputData.country) &&
        Objects.equals(this.zipCode, externalOrganizationInputData.zipCode) &&
        Objects.equals(this.city, externalOrganizationInputData.city) &&
        Objects.equals(this.district, externalOrganizationInputData.district);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, externalId, applicationUUID, name, streetAndNumber, appendix, country, zipCode, city, district);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrganizationInputData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    applicationUUID: ").append(toIndentedString(applicationUUID)).append("\n");
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

