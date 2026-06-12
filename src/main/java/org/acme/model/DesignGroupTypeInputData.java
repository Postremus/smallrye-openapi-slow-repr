package org.acme.model;

import java.util.ArrayList;
import java.util.List;
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

@JsonTypeName("DesignGroupTypeInputData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date =
        "2026-06-12T06:27:49" + ".020268300" + "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class DesignGroupTypeInputData {

    private TranslationHolderData name;

    private Long sortOrder;

    private String key;

    private @Valid List<@Valid CSSSettingTypeInputData> itemTypes = new ArrayList<>();

    private UUID categoryTypeId;

    public DesignGroupTypeInputData() {
    }

    @JsonCreator
    public DesignGroupTypeInputData(@JsonProperty(required = true, value = "name") TranslationHolderData name,
            @JsonProperty(required = true, value = "categoryTypeId") UUID categoryTypeId) {
        this.name = name;
        this.categoryTypeId = categoryTypeId;
    }

    /**
     * Translated group type name.
     **/
    public DesignGroupTypeInputData name(TranslationHolderData name) {
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
     * Group type sort order.
     **/
    public DesignGroupTypeInputData sortOrder(Long sortOrder) {
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
     * Group type key.
     **/
    public DesignGroupTypeInputData key(String key) {
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

    /**
     * Group type item types.
     **/
    public DesignGroupTypeInputData itemTypes(List<@Valid CSSSettingTypeInputData> itemTypes) {
        this.itemTypes = itemTypes;
        return this;
    }

    @JsonProperty("itemTypes")
    @Valid
    public List<@Valid CSSSettingTypeInputData> getItemTypes() {
        return itemTypes;
    }

    @JsonProperty("itemTypes")
    public void setItemTypes(List<@Valid CSSSettingTypeInputData> itemTypes) {
        this.itemTypes = itemTypes;
    }

    public DesignGroupTypeInputData addItemTypesItem(CSSSettingTypeInputData itemTypesItem) {
        if (this.itemTypes == null) {
            this.itemTypes = new ArrayList<>();
        }

        this.itemTypes.add(itemTypesItem);
        return this;
    }

    public DesignGroupTypeInputData removeItemTypesItem(CSSSettingTypeInputData itemTypesItem) {
        if (itemTypesItem != null && this.itemTypes != null) {
            this.itemTypes.remove(itemTypesItem);
        }

        return this;
    }

    /**
     * Group type category Type id.
     **/
    public DesignGroupTypeInputData categoryTypeId(UUID categoryTypeId) {
        this.categoryTypeId = categoryTypeId;
        return this;
    }

    @JsonProperty(required = true, value = "categoryTypeId")
    @NotNull
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getCategoryTypeId() {
        return categoryTypeId;
    }

    @JsonProperty(required = true, value = "categoryTypeId")
    public void setCategoryTypeId(UUID categoryTypeId) {
        this.categoryTypeId = categoryTypeId;
    }

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public DesignGroupTypeInputData putAdditionalProperty(String key, Object value) {
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
        DesignGroupTypeInputData designGroupTypeInputData = (DesignGroupTypeInputData) o;
        return Objects.equals(this.name, designGroupTypeInputData.name) && Objects.equals(this.sortOrder,
                designGroupTypeInputData.sortOrder) && Objects.equals(this.key, designGroupTypeInputData.key) && Objects.equals(this.itemTypes,
                designGroupTypeInputData.itemTypes) && Objects.equals(this.categoryTypeId, designGroupTypeInputData.categoryTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sortOrder, key, itemTypes, categoryTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesignGroupTypeInputData {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
        sb.append("    categoryTypeId: ").append(toIndentedString(categoryTypeId)).append("\n");
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
