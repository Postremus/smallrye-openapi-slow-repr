package org.acme.model;

import java.util.UUID;

import org.acme.model.TranslationHolderData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("OrganizationTypeDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class OrganizationTypeDataV2 {

    private UUID id;

    private Long organizationTypeNumber;

    private TranslationHolderData name;

    private String type;

    private String iconClass;

    public OrganizationTypeDataV2() {
    }

    /**
     * Id of the organization type.
     **/
    public OrganizationTypeDataV2 id(UUID id) {
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
     * Number of the organization type.
     **/
    public OrganizationTypeDataV2 organizationTypeNumber(Long organizationTypeNumber) {
        this.organizationTypeNumber = organizationTypeNumber;
        return this;
    }

    @JsonProperty("organizationTypeNumber")
    public Long getOrganizationTypeNumber() {
        return organizationTypeNumber;
    }

    @JsonProperty("organizationTypeNumber")
    public void setOrganizationTypeNumber(Long organizationTypeNumber) {
        this.organizationTypeNumber = organizationTypeNumber;
    }

    /**
     * Translated context name.
     **/
    public OrganizationTypeDataV2 name(TranslationHolderData name) {
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
     * Free text organization type.
     **/
    public OrganizationTypeDataV2 type(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Icon used in the client for this context type in specific display modes. This can be for example the name of a css class for an icon.
     **/
    public OrganizationTypeDataV2 iconClass(String iconClass) {
        this.iconClass = iconClass;
        return this;
    }

    @JsonProperty("iconClass")
    public String getIconClass() {
        return iconClass;
    }

    @JsonProperty("iconClass")
    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationTypeDataV2 organizationTypeDataV2 = (OrganizationTypeDataV2) o;
        return Objects.equals(this.id, organizationTypeDataV2.id) && Objects.equals(this.organizationTypeNumber,
                organizationTypeDataV2.organizationTypeNumber) && Objects.equals(this.name, organizationTypeDataV2.name) && Objects.equals(this.type,
                organizationTypeDataV2.type) && Objects.equals(this.iconClass, organizationTypeDataV2.iconClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, organizationTypeNumber, name, type, iconClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationTypeDataV2 {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    organizationTypeNumber: ").append(toIndentedString(organizationTypeNumber)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    iconClass: ").append(toIndentedString(iconClass)).append("\n");
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
