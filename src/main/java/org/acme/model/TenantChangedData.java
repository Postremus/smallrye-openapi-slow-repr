package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TenantChangedData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class TenantChangedData   {
  private Boolean changed;

  public TenantChangedData() {
  }

  /**
   **/
  public TenantChangedData changed(Boolean changed) {
    this.changed = changed;
    return this;
  }

  
  @JsonProperty("changed")
  public Boolean getChanged() {
    return changed;
  }

  @JsonProperty("changed")
  public void setChanged(Boolean changed) {
    this.changed = changed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantChangedData tenantChangedData = (TenantChangedData) o;
    return Objects.equals(this.changed, tenantChangedData.changed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantChangedData {\n");
    
    sb.append("    changed: ").append(toIndentedString(changed)).append("\n");
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
