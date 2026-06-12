package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.acme.model.ExternalOrganizationImportEntry;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ExternalOrganizationImportRequestDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300" +
        "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ExternalOrganizationImportRequestDataV2 {

    private @Valid List<@Valid ExternalOrganizationImportEntry> importDatas = new ArrayList<>();

    public ExternalOrganizationImportRequestDataV2() {
    }

    @JsonCreator
    public ExternalOrganizationImportRequestDataV2(
            @JsonProperty(required = true, value = "importDatas") List<@Valid ExternalOrganizationImportEntry> importDatas) {
        this.importDatas = importDatas;
    }

    /**
     **/
    public ExternalOrganizationImportRequestDataV2 importDatas(List<@Valid ExternalOrganizationImportEntry> importDatas) {
        this.importDatas = importDatas;
        return this;
    }

    @JsonProperty(required = true, value = "importDatas")
    @NotNull
    @Valid
    public List<@Valid ExternalOrganizationImportEntry> getImportDatas() {
        return importDatas;
    }

    @JsonProperty(required = true, value = "importDatas")
    public void setImportDatas(List<@Valid ExternalOrganizationImportEntry> importDatas) {
        this.importDatas = importDatas;
    }

    public ExternalOrganizationImportRequestDataV2 addImportDatasItem(ExternalOrganizationImportEntry importDatasItem) {
        if (this.importDatas == null) {
            this.importDatas = new ArrayList<>();
        }

        this.importDatas.add(importDatasItem);
        return this;
    }

    public ExternalOrganizationImportRequestDataV2 removeImportDatasItem(ExternalOrganizationImportEntry importDatasItem) {
        if (importDatasItem != null && this.importDatas != null) {
            this.importDatas.remove(importDatasItem);
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
        ExternalOrganizationImportRequestDataV2 externalOrganizationImportRequestDataV2 = (ExternalOrganizationImportRequestDataV2) o;
        return Objects.equals(this.importDatas, externalOrganizationImportRequestDataV2.importDatas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importDatas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalOrganizationImportRequestDataV2 {\n");

        sb.append("    importDatas: ").append(toIndentedString(importDatas)).append("\n");
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
