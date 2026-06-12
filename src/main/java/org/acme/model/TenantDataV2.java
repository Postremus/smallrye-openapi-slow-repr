package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.acme.model.TenantApplicationGrantDataV2;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("TenantDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class TenantDataV2 {

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

    private String jiraId;

    private String salesforceId;

    private String netboxId;

    private String customerAbbreviation;

    private String neoUrlName;

    private Boolean deleted;

    private @Valid List<@Valid TenantApplicationGrantDataV2> accessGrants = new ArrayList<>();

    public TenantDataV2() {
    }

    @JsonCreator
    public TenantDataV2(@JsonProperty(required = true, value = "name") String name,
            @JsonProperty(required = true, value = "matchCode") String matchCode,
            @JsonProperty(required = true, value = "streetAndNumber") String streetAndNumber,
            @JsonProperty(required = true, value = "country") String country, @JsonProperty(required = true, value = "zipCode") String zipCode,
            @JsonProperty(required = true, value = "city") String city, @JsonProperty(required = true, value = "email") String email) {
        this.name = name;
        this.matchCode = matchCode;
        this.streetAndNumber = streetAndNumber;
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.email = email;
    }

    /**
     * Id of this tenant. This id is optional during creation of the tenant, and will be automatically generated if not specified. Ignored during
     * updates to the tenant.
     **/
    public TenantDataV2 id(UUID id) {
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
     **/
    public TenantDataV2 name(String name) {
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
    public TenantDataV2 matchCode(String matchCode) {
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
    public TenantDataV2 name2(String name2) {
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
    public TenantDataV2 streetAndNumber(String streetAndNumber) {
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
    public TenantDataV2 appendix(String appendix) {
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
    public TenantDataV2 country(String country) {
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
     * Has to match country zip code pattern.
     **/
    public TenantDataV2 zipCode(String zipCode) {
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
    public TenantDataV2 city(String city) {
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
    public TenantDataV2 district(String district) {
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
    public TenantDataV2 zipCodePoBox(String zipCodePoBox) {
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
    public TenantDataV2 poBox(String poBox) {
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
    public TenantDataV2 phone(String phone) {
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
    public TenantDataV2 mobile(String mobile) {
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
    public TenantDataV2 fax(String fax) {
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
    public TenantDataV2 email(String email) {
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
    public TenantDataV2 website(String website) {
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
     * Jira identifier of this tenant.
     **/
    public TenantDataV2 jiraId(String jiraId) {
        this.jiraId = jiraId;
        return this;
    }

    @JsonProperty("jiraId")
    @Size(max = 255)
    public String getJiraId() {
        return jiraId;
    }

    @JsonProperty("jiraId")
    public void setJiraId(String jiraId) {
        this.jiraId = jiraId;
    }

    /**
     * Salesforce identifier of this tenant.
     **/
    public TenantDataV2 salesforceId(String salesforceId) {
        this.salesforceId = salesforceId;
        return this;
    }

    @JsonProperty("salesforceId")
    @Size(max = 255)
    public String getSalesforceId() {
        return salesforceId;
    }

    @JsonProperty("salesforceId")
    public void setSalesforceId(String salesforceId) {
        this.salesforceId = salesforceId;
    }

    /**
     * Netbox identifier of this tenant.
     **/
    public TenantDataV2 netboxId(String netboxId) {
        this.netboxId = netboxId;
        return this;
    }

    @JsonProperty("netboxId")
    @Size(max = 255)
    public String getNetboxId() {
        return netboxId;
    }

    @JsonProperty("netboxId")
    public void setNetboxId(String netboxId) {
        this.netboxId = netboxId;
    }

    /**
     * Customer abbreviation of this tenant.
     **/
    public TenantDataV2 customerAbbreviation(String customerAbbreviation) {
        this.customerAbbreviation = customerAbbreviation;
        return this;
    }

    @JsonProperty("customerAbbreviation")
    @Size(max = 255)
    public String getCustomerAbbreviation() {
        return customerAbbreviation;
    }

    @JsonProperty("customerAbbreviation")
    public void setCustomerAbbreviation(String customerAbbreviation) {
        this.customerAbbreviation = customerAbbreviation;
    }

    /**
     * NEO URL name of this tenant.
     **/
    public TenantDataV2 neoUrlName(String neoUrlName) {
        this.neoUrlName = neoUrlName;
        return this;
    }

    @JsonProperty("neoUrlName")
    @Size(max = 255)
    public String getNeoUrlName() {
        return neoUrlName;
    }

    @JsonProperty("neoUrlName")
    public void setNeoUrlName(String neoUrlName) {
        this.neoUrlName = neoUrlName;
    }

    /**
     * true if this tenant is deleted.
     **/
    public TenantDataV2 deleted(Boolean deleted) {
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
    public TenantDataV2 accessGrants(List<@Valid TenantApplicationGrantDataV2> accessGrants) {
        this.accessGrants = accessGrants;
        return this;
    }

    @JsonProperty("accessGrants")
    @Valid
    public List<@Valid TenantApplicationGrantDataV2> getAccessGrants() {
        return accessGrants;
    }

    @JsonProperty("accessGrants")
    public void setAccessGrants(List<@Valid TenantApplicationGrantDataV2> accessGrants) {
        this.accessGrants = accessGrants;
    }

    public TenantDataV2 addAccessGrantsItem(TenantApplicationGrantDataV2 accessGrantsItem) {
        if (this.accessGrants == null) {
            this.accessGrants = new ArrayList<>();
        }

        this.accessGrants.add(accessGrantsItem);
        return this;
    }

    public TenantDataV2 removeAccessGrantsItem(TenantApplicationGrantDataV2 accessGrantsItem) {
        if (accessGrantsItem != null && this.accessGrants != null) {
            this.accessGrants.remove(accessGrantsItem);
        }

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TenantDataV2 tenantDataV2 = (TenantDataV2) o;
        return Objects.equals(this.id, tenantDataV2.id) && Objects.equals(this.name, tenantDataV2.name) && Objects.equals(this.matchCode,
                tenantDataV2.matchCode) && Objects.equals(this.name2, tenantDataV2.name2) && Objects.equals(this.streetAndNumber,
                tenantDataV2.streetAndNumber) && Objects.equals(this.appendix, tenantDataV2.appendix) && Objects.equals(this.country,
                tenantDataV2.country) && Objects.equals(this.zipCode, tenantDataV2.zipCode) && Objects.equals(this.city,
                tenantDataV2.city) && Objects.equals(this.district, tenantDataV2.district) && Objects.equals(this.zipCodePoBox,
                tenantDataV2.zipCodePoBox) && Objects.equals(this.poBox, tenantDataV2.poBox) && Objects.equals(this.phone,
                tenantDataV2.phone) && Objects.equals(this.mobile, tenantDataV2.mobile) && Objects.equals(this.fax,
                tenantDataV2.fax) && Objects.equals(this.email, tenantDataV2.email) && Objects.equals(this.website,
                tenantDataV2.website) && Objects.equals(this.jiraId, tenantDataV2.jiraId) && Objects.equals(this.salesforceId,
                tenantDataV2.salesforceId) && Objects.equals(this.netboxId, tenantDataV2.netboxId) && Objects.equals(this.customerAbbreviation,
                tenantDataV2.customerAbbreviation) && Objects.equals(this.neoUrlName, tenantDataV2.neoUrlName) && Objects.equals(this.deleted,
                tenantDataV2.deleted) && Objects.equals(this.accessGrants, tenantDataV2.accessGrants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, matchCode, name2, streetAndNumber, appendix, country, zipCode, city, district, zipCodePoBox, poBox, phone,
                mobile, fax, email, website, jiraId, salesforceId, netboxId, customerAbbreviation, neoUrlName, deleted, accessGrants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantDataV2 {\n");

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
        sb.append("    jiraId: ").append(toIndentedString(jiraId)).append("\n");
        sb.append("    salesforceId: ").append(toIndentedString(salesforceId)).append("\n");
        sb.append("    netboxId: ").append(toIndentedString(netboxId)).append("\n");
        sb.append("    customerAbbreviation: ").append(toIndentedString(customerAbbreviation)).append("\n");
        sb.append("    neoUrlName: ").append(toIndentedString(neoUrlName)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    accessGrants: ").append(toIndentedString(accessGrants)).append("\n");
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
