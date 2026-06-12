package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.acme.model.OrganizationApplicationGrantDataV2;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("OrganizationInputDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300" +
        "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class OrganizationInputDataV2 {

    private Boolean supportAreaEnabled;

    private @Valid List<UUID> externalOrganizationIds = new ArrayList<>();

    private @Valid List<@Valid OrganizationApplicationGrantDataV2> accessGrants = new ArrayList<>();

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

    private UUID tenantId;

    private UUID parentId;

    private Boolean isMandator;

    private Boolean previewFeatures;

    private UUID designProfileId;

    private String timeZoneId;

    public OrganizationInputDataV2() {
    }

    @JsonCreator
    public OrganizationInputDataV2(@JsonProperty(required = true, value = "name") String name,
            @JsonProperty(required = true, value = "matchCode") String matchCode,
            @JsonProperty(required = true, value = "streetAndNumber") String streetAndNumber,
            @JsonProperty(required = true, value = "country") String country, @JsonProperty(required = true, value = "zipCode") String zipCode,
            @JsonProperty(required = true, value = "city") String city, @JsonProperty(required = true, value = "email") String email,
            @JsonProperty(required = true, value = "tenantId") UUID tenantId) {
        this.name = name;
        this.matchCode = matchCode;
        this.streetAndNumber = streetAndNumber;
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.email = email;
        this.tenantId = tenantId;
    }

    /**
     * If the  support area is enabled for this organization.
     **/
    public OrganizationInputDataV2 supportAreaEnabled(Boolean supportAreaEnabled) {
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
     * All external organizations linked to this portal organization. Uses UUID. Can be omitted.
     **/
    public OrganizationInputDataV2 externalOrganizationIds(List<UUID> externalOrganizationIds) {
        this.externalOrganizationIds = externalOrganizationIds;
        return this;
    }

    @JsonProperty("externalOrganizationIds")
    public List<@Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}") UUID> getExternalOrganizationIds() {
        return externalOrganizationIds;
    }

    @JsonProperty("externalOrganizationIds")
    public void setExternalOrganizationIds(List<UUID> externalOrganizationIds) {
        this.externalOrganizationIds = externalOrganizationIds;
    }

    public OrganizationInputDataV2 addExternalOrganizationIdsItem(UUID externalOrganizationIdsItem) {
        if (this.externalOrganizationIds == null) {
            this.externalOrganizationIds = new ArrayList<>();
        }

        this.externalOrganizationIds.add(externalOrganizationIdsItem);
        return this;
    }

    public OrganizationInputDataV2 removeExternalOrganizationIdsItem(UUID externalOrganizationIdsItem) {
        if (externalOrganizationIdsItem != null && this.externalOrganizationIds != null) {
            this.externalOrganizationIds.remove(externalOrganizationIdsItem);
        }

        return this;
    }

    /**
     * List of all applications this organization is allowed to use.
     **/
    public OrganizationInputDataV2 accessGrants(List<@Valid OrganizationApplicationGrantDataV2> accessGrants) {
        this.accessGrants = accessGrants;
        return this;
    }

    @JsonProperty("accessGrants")
    @Valid
    public List<@Valid OrganizationApplicationGrantDataV2> getAccessGrants() {
        return accessGrants;
    }

    @JsonProperty("accessGrants")
    public void setAccessGrants(List<@Valid OrganizationApplicationGrantDataV2> accessGrants) {
        this.accessGrants = accessGrants;
    }

    public OrganizationInputDataV2 addAccessGrantsItem(OrganizationApplicationGrantDataV2 accessGrantsItem) {
        if (this.accessGrants == null) {
            this.accessGrants = new ArrayList<>();
        }

        this.accessGrants.add(accessGrantsItem);
        return this;
    }

    public OrganizationInputDataV2 removeAccessGrantsItem(OrganizationApplicationGrantDataV2 accessGrantsItem) {
        if (accessGrantsItem != null && this.accessGrants != null) {
            this.accessGrants.remove(accessGrantsItem);
        }

        return this;
    }

    /**
     **/
    public OrganizationInputDataV2 name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty(required = true, value = "name")
    @NotNull
    @Pattern(regexp = "\\S")
    @Size(max = 255)
    public String getName() {
        return name;
    }

    @JsonProperty(required = true, value = "name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Matchcode of this object. Matchcodes are upper cases abbreviations of e.g. the object name, or the upper cased functional key of the object.
     **/
    public OrganizationInputDataV2 matchCode(String matchCode) {
        this.matchCode = matchCode;
        return this;
    }

    @JsonProperty(required = true, value = "matchCode")
    @NotNull
    @Pattern(regexp = "[A-Z0-9]*")
    @Size(max = 100)
    public String getMatchCode() {
        return matchCode;
    }

    @JsonProperty(required = true, value = "matchCode")
    public void setMatchCode(String matchCode) {
        this.matchCode = matchCode;
    }

    /**
     **/
    public OrganizationInputDataV2 name2(String name2) {
        this.name2 = name2;
        return this;
    }

    @JsonProperty("name2")
    @Size(max = 255)
    public String getName2() {
        return name2;
    }

    @JsonProperty("name2")
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     **/
    public OrganizationInputDataV2 streetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
        return this;
    }

    @JsonProperty(required = true, value = "streetAndNumber")
    @NotNull
    @Pattern(regexp = "\\S")
    @Size(max = 255)
    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    @JsonProperty(required = true, value = "streetAndNumber")
    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    /**
     **/
    public OrganizationInputDataV2 appendix(String appendix) {
        this.appendix = appendix;
        return this;
    }

    @JsonProperty("appendix")
    @Size(max = 255)
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
    public OrganizationInputDataV2 country(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty(required = true, value = "country")
    @NotNull
    @Pattern(regexp = "[A-Z]{2}")
    public String getCountry() {
        return country;
    }

    @JsonProperty(required = true, value = "country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Has to match country zip code pattern
     **/
    public OrganizationInputDataV2 zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    @JsonProperty(required = true, value = "zipCode")
    @NotNull
    @Pattern(regexp = "\\S")
    @Size(max = 20)
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty(required = true, value = "zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     **/
    public OrganizationInputDataV2 city(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty(required = true, value = "city")
    @NotNull
    @Pattern(regexp = "\\S")
    @Size(max = 255)
    public String getCity() {
        return city;
    }

    @JsonProperty(required = true, value = "city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     **/
    public OrganizationInputDataV2 district(String district) {
        this.district = district;
        return this;
    }

    @JsonProperty("district")
    @Size(max = 60)
    public String getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     **/
    public OrganizationInputDataV2 zipCodePoBox(String zipCodePoBox) {
        this.zipCodePoBox = zipCodePoBox;
        return this;
    }

    @JsonProperty("zipCodePoBox")
    @Size(max = 20)
    public String getZipCodePoBox() {
        return zipCodePoBox;
    }

    @JsonProperty("zipCodePoBox")
    public void setZipCodePoBox(String zipCodePoBox) {
        this.zipCodePoBox = zipCodePoBox;
    }

    /**
     **/
    public OrganizationInputDataV2 poBox(String poBox) {
        this.poBox = poBox;
        return this;
    }

    @JsonProperty("poBox")
    @Size(max = 100)
    public String getPoBox() {
        return poBox;
    }

    @JsonProperty("poBox")
    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    /**
     **/
    public OrganizationInputDataV2 phone(String phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("phone")
    @Pattern(regexp = "^[0-9\\-\\+/\\(\\ \\)]+$")
    @Size(max = 80)
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     **/
    public OrganizationInputDataV2 mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    @JsonProperty("mobile")
    @Pattern(regexp = "^[0-9\\-\\+/\\(\\ \\)]+$")
    @Size(max = 80)
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     **/
    public OrganizationInputDataV2 fax(String fax) {
        this.fax = fax;
        return this;
    }

    @JsonProperty("fax")
    @Pattern(regexp = "^[0-9\\-\\+/\\(\\ \\)]+$")
    @Size(max = 80)
    public String getFax() {
        return fax;
    }

    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     **/
    public OrganizationInputDataV2 email(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty(required = true, value = "email")
    @NotNull
    public String getEmail() {
        return email;
    }

    @JsonProperty(required = true, value = "email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     **/
    public OrganizationInputDataV2 website(String website) {
        this.website = website;
        return this;
    }

    @JsonProperty("website")
    @Size(max = 255)
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Id of the tenant this organization belongs to.
     **/
    public OrganizationInputDataV2 tenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    @JsonProperty(required = true, value = "tenantId")
    @NotNull
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getTenantId() {
        return tenantId;
    }

    @JsonProperty(required = true, value = "tenantId")
    public void setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * Id of the direct organization parent. Might be null if this is an organization directly below the tenant.
     **/
    public OrganizationInputDataV2 parentId(UUID parentId) {
        this.parentId = parentId;
        return this;
    }

    @JsonProperty("parentId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getParentId() {
        return parentId;
    }

    @JsonProperty("parentId")
    public void setParentId(UUID parentId) {
        this.parentId = parentId;
    }

    /**
     **/
    public OrganizationInputDataV2 isMandator(Boolean isMandator) {
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
     * Decides if preview features should be activated for contexts of this organization.
     **/
    public OrganizationInputDataV2 previewFeatures(Boolean previewFeatures) {
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
     * Design profile id, if organization has dedicated profile.
     **/
    public OrganizationInputDataV2 designProfileId(UUID designProfileId) {
        this.designProfileId = designProfileId;
        return this;
    }

    @JsonProperty("designProfileId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getDesignProfileId() {
        return designProfileId;
    }

    @JsonProperty("designProfileId")
    public void setDesignProfileId(UUID designProfileId) {
        this.designProfileId = designProfileId;
    }

    /**
     * IANA conform time zone id.
     **/
    public OrganizationInputDataV2 timeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    @JsonProperty("timeZoneId")
    public String getTimeZoneId() {
        return timeZoneId;
    }

    @JsonProperty("timeZoneId")
    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationInputDataV2 organizationInputDataV2 = (OrganizationInputDataV2) o;
        return Objects.equals(this.supportAreaEnabled, organizationInputDataV2.supportAreaEnabled) && Objects.equals(this.externalOrganizationIds,
                organizationInputDataV2.externalOrganizationIds) && Objects.equals(this.accessGrants,
                organizationInputDataV2.accessGrants) && Objects.equals(this.name, organizationInputDataV2.name) && Objects.equals(this.matchCode,
                organizationInputDataV2.matchCode) && Objects.equals(this.name2, organizationInputDataV2.name2) && Objects.equals(
                this.streetAndNumber, organizationInputDataV2.streetAndNumber) && Objects.equals(this.appendix,
                organizationInputDataV2.appendix) && Objects.equals(this.country, organizationInputDataV2.country) && Objects.equals(this.zipCode,
                organizationInputDataV2.zipCode) && Objects.equals(this.city, organizationInputDataV2.city) && Objects.equals(this.district,
                organizationInputDataV2.district) && Objects.equals(this.zipCodePoBox, organizationInputDataV2.zipCodePoBox) && Objects.equals(
                this.poBox, organizationInputDataV2.poBox) && Objects.equals(this.phone, organizationInputDataV2.phone) && Objects.equals(this.mobile,
                organizationInputDataV2.mobile) && Objects.equals(this.fax, organizationInputDataV2.fax) && Objects.equals(this.email,
                organizationInputDataV2.email) && Objects.equals(this.website, organizationInputDataV2.website) && Objects.equals(this.tenantId,
                organizationInputDataV2.tenantId) && Objects.equals(this.parentId, organizationInputDataV2.parentId) && Objects.equals(
                this.isMandator, organizationInputDataV2.isMandator) && Objects.equals(this.previewFeatures,
                organizationInputDataV2.previewFeatures) && Objects.equals(this.designProfileId,
                organizationInputDataV2.designProfileId) && Objects.equals(this.timeZoneId, organizationInputDataV2.timeZoneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportAreaEnabled, externalOrganizationIds, accessGrants, name, matchCode, name2, streetAndNumber, appendix, country,
                zipCode, city, district, zipCodePoBox, poBox, phone, mobile, fax, email, website, tenantId, parentId, isMandator, previewFeatures,
                designProfileId, timeZoneId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationInputDataV2 {\n");

        sb.append("    supportAreaEnabled: ").append(toIndentedString(supportAreaEnabled)).append("\n");
        sb.append("    externalOrganizationIds: ").append(toIndentedString(externalOrganizationIds)).append("\n");
        sb.append("    accessGrants: ").append(toIndentedString(accessGrants)).append("\n");
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
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    isMandator: ").append(toIndentedString(isMandator)).append("\n");
        sb.append("    previewFeatures: ").append(toIndentedString(previewFeatures)).append("\n");
        sb.append("    designProfileId: ").append(toIndentedString(designProfileId)).append("\n");
        sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
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
