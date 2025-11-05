package org.acme.model;

import org.acme.model.TenantApplicationGrantSetting;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TenantApplicationGrantData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class TenantApplicationGrantData   {
  private Long applicationId;
  private TenantApplicationGrantSetting setting;

  public TenantApplicationGrantData() {
  }

  @JsonCreator
  public TenantApplicationGrantData(
    @JsonProperty(required = true, value = "applicationId") Long applicationId,
    @JsonProperty(required = true, value = "setting") TenantApplicationGrantSetting setting
  ) {
    this.applicationId = applicationId;
    this.setting = setting;
  }

  /**
   * Id of the application for which this access is.
   **/
  public TenantApplicationGrantData applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  
  @JsonProperty(required = true, value = "applicationId")
  @NotNull public Long getApplicationId() {
    return applicationId;
  }

  @JsonProperty(required = true, value = "applicationId")
  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  /**
   **/
  public TenantApplicationGrantData setting(TenantApplicationGrantSetting setting) {
    this.setting = setting;
    return this;
  }

  
  @JsonProperty(required = true, value = "setting")
  @NotNull public TenantApplicationGrantSetting getSetting() {
    return setting;
  }

  @JsonProperty(required = true, value = "setting")
  public void setSetting(TenantApplicationGrantSetting setting) {
    this.setting = setting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantApplicationGrantData tenantApplicationGrantData = (TenantApplicationGrantData) o;
    return Objects.equals(this.applicationId, tenantApplicationGrantData.applicationId) &&
        Objects.equals(this.setting, tenantApplicationGrantData.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, setting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantApplicationGrantData {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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

