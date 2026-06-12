package org.acme.model;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonTypeName("AdapterInputData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date =
        "2026-06-12T06:27:49" + ".020268300" + "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class AdapterInputData {

    private String identifier;

    private Object _configuration;

    private UUID adapterConfigurationId;

    private @Valid Set<@Valid AdapterTenantGrantData> tenantGrants = new LinkedHashSet<>();

    private Boolean enabled;

    public AdapterInputData() {
    }

    @JsonCreator
    public AdapterInputData(@JsonProperty(required = true, value = "identifier") String identifier) {
        this.identifier = identifier;
    }

    /**
     **/
    public AdapterInputData identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    @JsonProperty(required = true, value = "identifier")
    @NotNull
    @Pattern(regexp = "\\S")
    @Size(max = 255)
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty(required = true, value = "identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Configuration of the User Adapter.
     **/
    public AdapterInputData _configuration(Object _configuration) {
        this._configuration = _configuration;
        return this;
    }

    @JsonProperty("configuration")
    public Object getConfiguration() {
        return _configuration;
    }

    @JsonProperty("configuration")
    public void setConfiguration(Object _configuration) {
        this._configuration = _configuration;
    }

    /**
     * Id of the Adapter Configuration. Defines the Type of User Adapter: e.g. GENERIC-Adapter-Configuration.
     **/
    public AdapterInputData adapterConfigurationId(UUID adapterConfigurationId) {
        this.adapterConfigurationId = adapterConfigurationId;
        return this;
    }

    @JsonProperty("adapterConfigurationId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getAdapterConfigurationId() {
        return adapterConfigurationId;
    }

    @JsonProperty("adapterConfigurationId")
    public void setAdapterConfigurationId(UUID adapterConfigurationId) {
        this.adapterConfigurationId = adapterConfigurationId;
    }

    /**
     * List of all tenants this adapter is configured to use.
     **/
    public AdapterInputData tenantGrants(Set<@Valid AdapterTenantGrantData> tenantGrants) {
        this.tenantGrants = tenantGrants;
        return this;
    }

    @JsonProperty("tenantGrants")
    @Valid
    public Set<@Valid AdapterTenantGrantData> getTenantGrants() {
        return tenantGrants;
    }

    @JsonProperty("tenantGrants")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setTenantGrants(Set<@Valid AdapterTenantGrantData> tenantGrants) {
        this.tenantGrants = tenantGrants;
    }

    public AdapterInputData addTenantGrantsItem(AdapterTenantGrantData tenantGrantsItem) {
        if (this.tenantGrants == null) {
            this.tenantGrants = new LinkedHashSet<>();
        }

        this.tenantGrants.add(tenantGrantsItem);
        return this;
    }

    public AdapterInputData removeTenantGrantsItem(AdapterTenantGrantData tenantGrantsItem) {
        if (tenantGrantsItem != null && this.tenantGrants != null) {
            this.tenantGrants.remove(tenantGrantsItem);
        }

        return this;
    }

    /**
     * Set this Adapter enabled (true/false)
     **/
    public AdapterInputData enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public AdapterInputData putAdditionalProperty(String key, Object value) {
        return this;
    }

    /**
     * Return the additional (undeclared) properties.
     * @return the additional (undeclared) properties
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return null;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     * @param key the name of the property
     * @return the additional (undeclared) property with the specified name
     */
    public Object getAdditionalProperty(String key) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdapterInputData adapterInputData = (AdapterInputData) o;
        return Objects.equals(this.identifier, adapterInputData.identifier) && Objects.equals(this._configuration,
                adapterInputData._configuration) && Objects.equals(this.adapterConfigurationId,
                adapterInputData.adapterConfigurationId) && Objects.equals(this.tenantGrants, adapterInputData.tenantGrants) && Objects.equals(
                this.enabled, adapterInputData.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, _configuration, adapterConfigurationId, tenantGrants, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdapterInputData {\n");

        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    adapterConfigurationId: ").append(toIndentedString(adapterConfigurationId)).append("\n");
        sb.append("    tenantGrants: ").append(toIndentedString(tenantGrants)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
