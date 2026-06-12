package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.acme.model.AdapterTenantGrantSetting;
import org.acme.model.AdapterTenantOrganizationGrantData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("AdapterTenantGrantData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300" +
        "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class AdapterTenantGrantData {

    private UUID tenantId;

    private AdapterTenantGrantSetting setting;

    private @Valid List<@Valid AdapterTenantOrganizationGrantData> organizationGrants = new ArrayList<>();

    public AdapterTenantGrantData() {
    }

    @JsonCreator
    public AdapterTenantGrantData(@JsonProperty(required = true, value = "tenantId") UUID tenantId,
            @JsonProperty(required = true, value = "setting") AdapterTenantGrantSetting setting) {
        this.tenantId = tenantId;
        this.setting = setting;
    }

    /**
     * Id of the Tenant.
     **/
    public AdapterTenantGrantData tenantId(UUID tenantId) {
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
     **/
    public AdapterTenantGrantData setting(AdapterTenantGrantSetting setting) {
        this.setting = setting;
        return this;
    }

    @JsonProperty(required = true, value = "setting")
    @NotNull
    public AdapterTenantGrantSetting getSetting() {
        return setting;
    }

    @JsonProperty(required = true, value = "setting")
    public void setSetting(AdapterTenantGrantSetting setting) {
        this.setting = setting;
    }

    /**
     * List of Organization Grants. Optional if setting is ENABLED_FOR_SELECTED_ORGANIZATIONS.
     **/
    public AdapterTenantGrantData organizationGrants(List<@Valid AdapterTenantOrganizationGrantData> organizationGrants) {
        this.organizationGrants = organizationGrants;
        return this;
    }

    @JsonProperty("organizationGrants")
    @Valid
    public List<@Valid AdapterTenantOrganizationGrantData> getOrganizationGrants() {
        return organizationGrants;
    }

    @JsonProperty("organizationGrants")
    public void setOrganizationGrants(List<@Valid AdapterTenantOrganizationGrantData> organizationGrants) {
        this.organizationGrants = organizationGrants;
    }

    public AdapterTenantGrantData addOrganizationGrantsItem(AdapterTenantOrganizationGrantData organizationGrantsItem) {
        if (this.organizationGrants == null) {
            this.organizationGrants = new ArrayList<>();
        }

        this.organizationGrants.add(organizationGrantsItem);
        return this;
    }

    public AdapterTenantGrantData removeOrganizationGrantsItem(AdapterTenantOrganizationGrantData organizationGrantsItem) {
        if (organizationGrantsItem != null && this.organizationGrants != null) {
            this.organizationGrants.remove(organizationGrantsItem);
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
        AdapterTenantGrantData adapterTenantGrantData = (AdapterTenantGrantData) o;
        return Objects.equals(this.tenantId, adapterTenantGrantData.tenantId) && Objects.equals(this.setting,
                adapterTenantGrantData.setting) && Objects.equals(this.organizationGrants, adapterTenantGrantData.organizationGrants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, setting, organizationGrants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdapterTenantGrantData {\n");

        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
        sb.append("    organizationGrants: ").append(toIndentedString(organizationGrants)).append("\n");
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
