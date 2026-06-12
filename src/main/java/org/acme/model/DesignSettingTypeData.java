package org.acme.model;

import java.util.UUID;

import org.acme.model.CssType;
import org.acme.model.TranslationHolderData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("DesignSettingTypeData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class DesignSettingTypeData {

    private UUID id;

    private TranslationHolderData name;

    private CssType valueType;

    private String key;

    public DesignSettingTypeData() {
    }

    /**
     **/
    public DesignSettingTypeData id(UUID id) {
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
    public DesignSettingTypeData name(TranslationHolderData name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name")
    @Valid
    public TranslationHolderData getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(TranslationHolderData name) {
        this.name = name;
    }

    /**
     **/
    public DesignSettingTypeData valueType(CssType valueType) {
        this.valueType = valueType;
        return this;
    }

    @JsonProperty("valueType")
    public CssType getValueType() {
        return valueType;
    }

    @JsonProperty("valueType")
    public void setValueType(CssType valueType) {
        this.valueType = valueType;
    }

    /**
     **/
    public DesignSettingTypeData key(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DesignSettingTypeData designSettingTypeData = (DesignSettingTypeData) o;
        return Objects.equals(this.id, designSettingTypeData.id) && Objects.equals(this.name, designSettingTypeData.name) && Objects.equals(
                this.valueType, designSettingTypeData.valueType) && Objects.equals(this.key, designSettingTypeData.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, valueType, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesignSettingTypeData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
