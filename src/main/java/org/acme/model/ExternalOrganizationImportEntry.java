package org.acme.model;

import org.acme.model.ExternalOrganizationInputData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ExternalOrganizationImportEntry")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ExternalOrganizationImportEntry   {
  private ExternalOrganizationInputData externalOrganizationData;
  private Boolean delete;

  public ExternalOrganizationImportEntry() {
  }

  @JsonCreator
  public ExternalOrganizationImportEntry(
    @JsonProperty(required = true, value = "externalOrganizationData") ExternalOrganizationInputData externalOrganizationData
  ) {
    this.externalOrganizationData = externalOrganizationData;
  }

  /**
   **/
  public ExternalOrganizationImportEntry externalOrganizationData(ExternalOrganizationInputData externalOrganizationData) {
    this.externalOrganizationData = externalOrganizationData;
    return this;
  }

  
  @JsonProperty(required = true, value = "externalOrganizationData")
  @NotNull @Valid public ExternalOrganizationInputData getExternalOrganizationData() {
    return externalOrganizationData;
  }

  @JsonProperty(required = true, value = "externalOrganizationData")
  public void setExternalOrganizationData(ExternalOrganizationInputData externalOrganizationData) {
    this.externalOrganizationData = externalOrganizationData;
  }

  /**
   * Whether this external organization should be deleted (true), or added/updated (false).
   **/
  public ExternalOrganizationImportEntry delete(Boolean delete) {
    this.delete = delete;
    return this;
  }

  
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }

  @JsonProperty("delete")
  public void setDelete(Boolean delete) {
    this.delete = delete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalOrganizationImportEntry externalOrganizationImportEntry = (ExternalOrganizationImportEntry) o;
    return Objects.equals(this.externalOrganizationData, externalOrganizationImportEntry.externalOrganizationData) &&
        Objects.equals(this.delete, externalOrganizationImportEntry.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalOrganizationData, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrganizationImportEntry {\n");
    
    sb.append("    externalOrganizationData: ").append(toIndentedString(externalOrganizationData)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

