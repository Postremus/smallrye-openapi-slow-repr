package org.acme.model;

import java.util.UUID;

import org.acme.model.AdapterTenantOrganizationGrantSetting;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("AdapterTenantOrganizationGrantData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300" +
        "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class AdapterTenantOrganizationGrantData {

    private UUID organizationId;

    private AdapterTenantOrganizationGrantSetting setting;

    public AdapterTenantOrganizationGrantData() {
    }

    @JsonCreator
    public AdapterTenantOrganizationGrantData(@JsonProperty(required = true, value = "organizationId") UUID organizationId,
            @JsonProperty(required = true, value = "setting") AdapterTenantOrganizationGrantSetting setting) {
        this.organizationId = organizationId;
        this.setting = setting;
    }

    /**
     * Id of the Organization.
     **/
    public AdapterTenantOrganizationGrantData organizationId(UUID organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    @JsonProperty(required = true, value = "organizationId")
    @NotNull
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getOrganizationId() {
        return organizationId;
    }

    @JsonProperty(required = true, value = "organizationId")
    public void setOrganizationId(UUID organizationId) {
        this.organizationId = organizationId;
    }

    /**
     **/
    public AdapterTenantOrganizationGrantData setting(AdapterTenantOrganizationGrantSetting setting) {
        this.setting = setting;
        return this;
    }

    @JsonProperty(required = true, value = "setting")
    @NotNull
    public AdapterTenantOrganizationGrantSetting getSetting() {
        return setting;
    }

    @JsonProperty(required = true, value = "setting")
    public void setSetting(AdapterTenantOrganizationGrantSetting setting) {
        this.setting = setting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdapterTenantOrganizationGrantData adapterTenantOrganizationGrantData = (AdapterTenantOrganizationGrantData) o;
        return Objects.equals(this.organizationId, adapterTenantOrganizationGrantData.organizationId) && Objects.equals(this.setting,
                adapterTenantOrganizationGrantData.setting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, setting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdapterTenantOrganizationGrantData {\n");

        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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
