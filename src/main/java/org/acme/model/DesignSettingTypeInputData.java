package org.acme.model;

import java.util.Map;
import java.util.Objects;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("DesignSettingTypeInputData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300" +
        "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class DesignSettingTypeInputData {

    private TranslationHolderData name;

    private CssType valueType;

    private String key;

    public DesignSettingTypeInputData() {
    }

    @JsonCreator
    public DesignSettingTypeInputData(@JsonProperty(required = true, value = "name") TranslationHolderData name,
            @JsonProperty(required = true, value = "valueType") CssType valueType, @JsonProperty(required = true, value = "key") String key) {
        this.name = name;
        this.valueType = valueType;
        this.key = key;
    }

    /**
     * Translated Setting type name.
     **/
    public DesignSettingTypeInputData name(TranslationHolderData name) {
        this.name = name;
        return this;
    }

    @JsonProperty(required = true, value = "name")
    @NotNull
    @Valid
    public TranslationHolderData getName() {
        return name;
    }

    @JsonProperty(required = true, value = "name")
    public void setName(TranslationHolderData name) {
        this.name = name;
    }

    /**
     * Setting type value Type.
     **/
    public DesignSettingTypeInputData valueType(CssType valueType) {
        this.valueType = valueType;
        return this;
    }

    @JsonProperty(required = true, value = "valueType")
    @NotNull
    public CssType getValueType() {
        return valueType;
    }

    @JsonProperty(required = true, value = "valueType")
    public void setValueType(CssType valueType) {
        this.valueType = valueType;
    }

    /**
     * Setting type key.
     **/
    public DesignSettingTypeInputData key(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty(required = true, value = "key")
    @NotNull
    public String getKey() {
        return key;
    }

    @JsonProperty(required = true, value = "key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public DesignSettingTypeInputData putAdditionalProperty(String key, Object value) {
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
        DesignSettingTypeInputData designSettingTypeInputData = (DesignSettingTypeInputData) o;
        return Objects.equals(this.name, designSettingTypeInputData.name) && Objects.equals(this.valueType,
                designSettingTypeInputData.valueType) && Objects.equals(this.key, designSettingTypeInputData.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, valueType, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesignSettingTypeInputData {\n");

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
