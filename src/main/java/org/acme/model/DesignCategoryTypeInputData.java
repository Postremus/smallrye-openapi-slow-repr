package org.acme.model;

import java.util.ArrayList;
import java.util.List;
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

@JsonTypeName("DesignCategoryTypeInputData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date =
        "2026-06-12T06:27:49" + ".020268300" + "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class DesignCategoryTypeInputData {

    private TranslationHolderData name;

    private Long sortOrder;

    private String key;

    private @Valid List<@Valid DesignGroupTypeInputData> groupTypes = new ArrayList<>();

    public DesignCategoryTypeInputData() {
    }

    @JsonCreator
    public DesignCategoryTypeInputData(@JsonProperty(required = true, value = "name") TranslationHolderData name) {
        this.name = name;
    }

    /**
     * Translated category type name.
     **/
    public DesignCategoryTypeInputData name(TranslationHolderData name) {
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
     * Category type sort order.
     **/
    public DesignCategoryTypeInputData sortOrder(Long sortOrder) {
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
     * Category type key.
     **/
    public DesignCategoryTypeInputData key(String key) {
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
     * Category type group types.
     **/
    public DesignCategoryTypeInputData groupTypes(List<@Valid DesignGroupTypeInputData> groupTypes) {
        this.groupTypes = groupTypes;
        return this;
    }

    @JsonProperty("groupTypes")
    @Valid
    public List<@Valid DesignGroupTypeInputData> getGroupTypes() {
        return groupTypes;
    }

    @JsonProperty("groupTypes")
    public void setGroupTypes(List<@Valid DesignGroupTypeInputData> groupTypes) {
        this.groupTypes = groupTypes;
    }

    public DesignCategoryTypeInputData addGroupTypesItem(DesignGroupTypeInputData groupTypesItem) {
        if (this.groupTypes == null) {
            this.groupTypes = new ArrayList<>();
        }

        this.groupTypes.add(groupTypesItem);
        return this;
    }

    public DesignCategoryTypeInputData removeGroupTypesItem(DesignGroupTypeInputData groupTypesItem) {
        if (groupTypesItem != null && this.groupTypes != null) {
            this.groupTypes.remove(groupTypesItem);
        }

        return this;
    }

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public DesignCategoryTypeInputData putAdditionalProperty(String key, Object value) {
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
        DesignCategoryTypeInputData designCategoryTypeInputData = (DesignCategoryTypeInputData) o;
        return Objects.equals(this.name, designCategoryTypeInputData.name) && Objects.equals(this.sortOrder,
                designCategoryTypeInputData.sortOrder) && Objects.equals(this.key, designCategoryTypeInputData.key) && Objects.equals(this.groupTypes,
                designCategoryTypeInputData.groupTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sortOrder, key, groupTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesignCategoryTypeInputData {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    groupTypes: ").append(toIndentedString(groupTypes)).append("\n");
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
