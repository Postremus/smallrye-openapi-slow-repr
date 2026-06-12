package org.acme.model;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("AdapterConfigurationData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date =
        "2026-06-12T06:27:49" + ".020268300" + "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class AdapterConfigurationData {

    private UUID id;

    private TranslationHolderData description;

    private AdapterType type;

    private Boolean deleted;

    private Object schema;

    public AdapterConfigurationData() {
    }

    @JsonCreator
    public AdapterConfigurationData(@JsonProperty(required = true, value = "type") AdapterType type) {
        this.type = type;
    }

    /**
     * Id of this adapter configuration. This id is optional during creation of the adapter configuration, and will be automatically generated if
     * not specified. Ignored during updates to the adapter configuration.
     **/
    public AdapterConfigurationData id(UUID id) {
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
    public AdapterConfigurationData description(TranslationHolderData description) {
        this.description = description;
        return this;
    }

    @JsonProperty("description")
    @Valid
    public TranslationHolderData getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(TranslationHolderData description) {
        this.description = description;
    }

    /**
     **/
    public AdapterConfigurationData type(AdapterType type) {
        this.type = type;
        return this;
    }

    @JsonProperty(required = true, value = "type")
    @NotNull
    public AdapterType getType() {
        return type;
    }

    @JsonProperty(required = true, value = "type")
    public void setType(AdapterType type) {
        this.type = type;
    }

    /**
     * true if this adapter is deleted.
     **/
    public AdapterConfigurationData deleted(Boolean deleted) {
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
     * JSON Schema to prepare User Adapter detail view.
     **/
    public AdapterConfigurationData schema(Object schema) {
        this.schema = schema;
        return this;
    }

    @JsonProperty("schema")
    public Object getSchema() {
        return schema;
    }

    @JsonProperty("schema")
    public void setSchema(Object schema) {
        this.schema = schema;
    }

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public AdapterConfigurationData putAdditionalProperty(String key, Object value) {
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
        AdapterConfigurationData adapterConfigurationData = (AdapterConfigurationData) o;
        return Objects.equals(this.id, adapterConfigurationData.id) && Objects.equals(this.description,
                adapterConfigurationData.description) && Objects.equals(this.type, adapterConfigurationData.type) && Objects.equals(this.deleted,
                adapterConfigurationData.deleted) && Objects.equals(this.schema, adapterConfigurationData.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, type, deleted, schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdapterConfigurationData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
