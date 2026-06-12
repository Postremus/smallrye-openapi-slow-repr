package org.acme.model;

import org.acme.model.CssType;
import org.acme.model.TranslationHolderData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("CSSSettingTypeInputData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class CSSSettingTypeInputData {

    private String key;

    private TranslationHolderData name;

    private Long sortOrder;

    private CssType valueType;

    public CSSSettingTypeInputData() {
    }

    @JsonCreator
    public CSSSettingTypeInputData(@JsonProperty(required = true, value = "key") String key) {
        this.key = key;
    }

    /**
     **/
    public CSSSettingTypeInputData key(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty(required = true, value = "key")
    @NotNull
    @Size(min = 1)
    public String getKey() {
        return key;
    }

    @JsonProperty(required = true, value = "key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     **/
    public CSSSettingTypeInputData name(TranslationHolderData name) {
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
    public CSSSettingTypeInputData sortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    @JsonProperty("sortOrder")
    public Long getSortOrder() {
        return sortOrder;
    }

    @JsonProperty("sortOrder")
    public void setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     **/
    public CSSSettingTypeInputData valueType(CssType valueType) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CSSSettingTypeInputData csSSettingTypeInputData = (CSSSettingTypeInputData) o;
        return Objects.equals(this.key, csSSettingTypeInputData.key) && Objects.equals(this.name, csSSettingTypeInputData.name) && Objects.equals(
                this.sortOrder, csSSettingTypeInputData.sortOrder) && Objects.equals(this.valueType, csSSettingTypeInputData.valueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, name, sortOrder, valueType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CSSSettingTypeInputData {\n");

        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
