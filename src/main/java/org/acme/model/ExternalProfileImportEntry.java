package org.acme.model;

import org.acme.model.ExternalProfileInputData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ExternalProfileImportEntry")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ExternalProfileImportEntry   {
  private ExternalProfileInputData externalUserData;
  private Boolean delete;

  public ExternalProfileImportEntry() {
  }

  @JsonCreator
  public ExternalProfileImportEntry(
    @JsonProperty(required = true, value = "externalUserData") ExternalProfileInputData externalUserData
  ) {
    this.externalUserData = externalUserData;
  }

  /**
   **/
  public ExternalProfileImportEntry externalUserData(ExternalProfileInputData externalUserData) {
    this.externalUserData = externalUserData;
    return this;
  }

  
  @JsonProperty(required = true, value = "externalUserData")
  @NotNull @Valid public ExternalProfileInputData getExternalUserData() {
    return externalUserData;
  }

  @JsonProperty(required = true, value = "externalUserData")
  public void setExternalUserData(ExternalProfileInputData externalUserData) {
    this.externalUserData = externalUserData;
  }

  /**
   * Whether this external profile should be deleted (true), or added/updated (false).
   **/
  public ExternalProfileImportEntry delete(Boolean delete) {
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
    ExternalProfileImportEntry externalProfileImportEntry = (ExternalProfileImportEntry) o;
    return Objects.equals(this.externalUserData, externalProfileImportEntry.externalUserData) &&
        Objects.equals(this.delete, externalProfileImportEntry.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUserData, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalProfileImportEntry {\n");
    
    sb.append("    externalUserData: ").append(toIndentedString(externalUserData)).append("\n");
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

