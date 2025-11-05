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



@JsonTypeName("ExternalOrganizationImportRequestData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ExternalOrganizationImportRequestData   {
  private @Valid List<@Valid ExternalOrganizationImportEntry> importDatas = new ArrayList<>();

  public ExternalOrganizationImportRequestData() {
  }

  @JsonCreator
  public ExternalOrganizationImportRequestData(
    @JsonProperty(required = true, value = "importDatas") List<@Valid ExternalOrganizationImportEntry> importDatas
  ) {
    this.importDatas = importDatas;
  }

  /**
   **/
  public ExternalOrganizationImportRequestData importDatas(List<@Valid ExternalOrganizationImportEntry> importDatas) {
    this.importDatas = importDatas;
    return this;
  }

  
  @JsonProperty(required = true, value = "importDatas")
  @NotNull @Valid public List<@Valid ExternalOrganizationImportEntry> getImportDatas() {
    return importDatas;
  }

  @JsonProperty(required = true, value = "importDatas")
  public void setImportDatas(List<@Valid ExternalOrganizationImportEntry> importDatas) {
    this.importDatas = importDatas;
  }

  public ExternalOrganizationImportRequestData addImportDatasItem(ExternalOrganizationImportEntry importDatasItem) {
    if (this.importDatas == null) {
      this.importDatas = new ArrayList<>();
    }

    this.importDatas.add(importDatasItem);
    return this;
  }

  public ExternalOrganizationImportRequestData removeImportDatasItem(ExternalOrganizationImportEntry importDatasItem) {
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
    ExternalOrganizationImportRequestData externalOrganizationImportRequestData = (ExternalOrganizationImportRequestData) o;
    return Objects.equals(this.importDatas, externalOrganizationImportRequestData.importDatas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importDatas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrganizationImportRequestData {\n");
    
    sb.append("    importDatas: ").append(toIndentedString(importDatas)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

