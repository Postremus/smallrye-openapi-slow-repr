package org.acme.model;

import java.util.UUID;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ExternalOrganizationDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ExternalOrganizationDataV2 {

    private Long externalOrganisationNumber;

    private UUID id;

    private String type;

    private String externalId;

    private UUID applicationId;

    private String name;

    private String streetAndNumber;

    private String appendix;

    private String country;

    private String zipCode;

    private String city;

    private String district;

    public ExternalOrganizationDataV2() {
    }

    /**
     * Number of this external organization.
     **/
    public ExternalOrganizationDataV2 externalOrganisationNumber(Long externalOrganisationNumber) {
        this.externalOrganisationNumber = externalOrganisationNumber;
        return this;
    }

    @JsonProperty("externalOrganisationNumber")
    public Long getExternalOrganisationNumber() {
        return externalOrganisationNumber;
    }

    @JsonProperty("externalOrganisationNumber")
    public void setExternalOrganisationNumber(Long externalOrganisationNumber) {
        this.externalOrganisationNumber = externalOrganisationNumber;
    }

    /**
     * UUID of this external organization.
     **/
    public ExternalOrganizationDataV2 id(UUID id) {
        this.id = id;
        return this;
    }

    @JsonProperty("id")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Free text type describing this organization.
     **/
    public ExternalOrganizationDataV2 type(String type) {
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
    public ExternalOrganizationDataV2 externalId(String externalId) {
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
    public ExternalOrganizationDataV2 applicationId(UUID applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    @JsonProperty("applicationId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getApplicationId() {
        return applicationId;
    }

    @JsonProperty("applicationId")
    public void setApplicationId(UUID applicationId) {
        this.applicationId = applicationId;
    }

    /**
     **/
    public ExternalOrganizationDataV2 name(String name) {
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
    public ExternalOrganizationDataV2 streetAndNumber(String streetAndNumber) {
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
    public ExternalOrganizationDataV2 appendix(String appendix) {
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
    public ExternalOrganizationDataV2 country(String country) {
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
    public ExternalOrganizationDataV2 zipCode(String zipCode) {
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
    public ExternalOrganizationDataV2 city(String city) {
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
    public ExternalOrganizationDataV2 district(String district) {
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
        ExternalOrganizationDataV2 externalOrganizationDataV2 = (ExternalOrganizationDataV2) o;
        return Objects.equals(this.externalOrganisationNumber, externalOrganizationDataV2.externalOrganisationNumber) && Objects.equals(this.id,
                externalOrganizationDataV2.id) && Objects.equals(this.type, externalOrganizationDataV2.type) && Objects.equals(this.externalId,
                externalOrganizationDataV2.externalId) && Objects.equals(this.applicationId,
                externalOrganizationDataV2.applicationId) && Objects.equals(this.name, externalOrganizationDataV2.name) && Objects.equals(
                this.streetAndNumber, externalOrganizationDataV2.streetAndNumber) && Objects.equals(this.appendix,
                externalOrganizationDataV2.appendix) && Objects.equals(this.country, externalOrganizationDataV2.country) && Objects.equals(
                this.zipCode, externalOrganizationDataV2.zipCode) && Objects.equals(this.city, externalOrganizationDataV2.city) && Objects.equals(
                this.district, externalOrganizationDataV2.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalOrganisationNumber, id, type, externalId, applicationId, name, streetAndNumber, appendix, country, zipCode, city,
                district);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalOrganizationDataV2 {\n");

        sb.append("    externalOrganisationNumber: ").append(toIndentedString(externalOrganisationNumber)).append("\n");
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
