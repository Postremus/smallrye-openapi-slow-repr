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

@JsonTypeName("AdapterData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date =
        "2026-06-12T06:27:49" + ".020268300" + "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class AdapterData {

    private UUID id;

    private String identifier;

    private Object _configuration;

    private UUID adapterConfigurationId;

    private @Valid Set<@Valid AdapterTenantGrantData> adapterTenantGrants = new LinkedHashSet<>();

    private Boolean enabled;

    private Boolean deleted;

    public AdapterData() {
    }

    @JsonCreator
    public AdapterData(@JsonProperty(required = true, value = "identifier") String identifier) {
        this.identifier = identifier;
    }

    /**
     * Id of this adapter. This id is optional during creation of the adapter, and will be automatically generated if not specified. Ignored during
     * updates to the adapter.
     **/
    public AdapterData id(UUID id) {
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
    public AdapterData identifier(String identifier) {
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
    public AdapterData _configuration(Object _configuration) {
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
     **/
    public AdapterData adapterConfigurationId(UUID adapterConfigurationId) {
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
    public AdapterData adapterTenantGrants(Set<@Valid AdapterTenantGrantData> adapterTenantGrants) {
        this.adapterTenantGrants = adapterTenantGrants;
        return this;
    }

    @JsonProperty("adapterTenantGrants")
    @Valid
    public Set<@Valid AdapterTenantGrantData> getAdapterTenantGrants() {
        return adapterTenantGrants;
    }

    @JsonProperty("adapterTenantGrants")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setAdapterTenantGrants(Set<@Valid AdapterTenantGrantData> adapterTenantGrants) {
        this.adapterTenantGrants = adapterTenantGrants;
    }

    public AdapterData addAdapterTenantGrantsItem(AdapterTenantGrantData adapterTenantGrantsItem) {
        if (this.adapterTenantGrants == null) {
            this.adapterTenantGrants = new LinkedHashSet<>();
        }

        this.adapterTenantGrants.add(adapterTenantGrantsItem);
        return this;
    }

    public AdapterData removeAdapterTenantGrantsItem(AdapterTenantGrantData adapterTenantGrantsItem) {
        if (adapterTenantGrantsItem != null && this.adapterTenantGrants != null) {
            this.adapterTenantGrants.remove(adapterTenantGrantsItem);
        }

        return this;
    }

    /**
     * true if this Adapter is enabled
     **/
    public AdapterData enabled(Boolean enabled) {
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
     * true if this adapter is deleted.
     **/
    public AdapterData deleted(Boolean deleted) {
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
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public AdapterData putAdditionalProperty(String key, Object value) {
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
        AdapterData adapterData = (AdapterData) o;
        return Objects.equals(this.id, adapterData.id) && Objects.equals(this.identifier, adapterData.identifier) && Objects.equals(
                this._configuration, adapterData._configuration) && Objects.equals(this.adapterConfigurationId,
                adapterData.adapterConfigurationId) && Objects.equals(this.adapterTenantGrants, adapterData.adapterTenantGrants) && Objects.equals(
                this.enabled, adapterData.enabled) && Objects.equals(this.deleted, adapterData.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identifier, _configuration, adapterConfigurationId, adapterTenantGrants, enabled, deleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdapterData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    adapterConfigurationId: ").append(toIndentedString(adapterConfigurationId)).append("\n");
        sb.append("    adapterTenantGrants: ").append(toIndentedString(adapterTenantGrants)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
