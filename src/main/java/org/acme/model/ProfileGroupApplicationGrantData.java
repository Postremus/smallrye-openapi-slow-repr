package org.acme.model;

import org.acme.model.ProfileGroupApplicationGrantSetting;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProfileGroupApplicationGrantData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ProfileGroupApplicationGrantData   {
  private Long applicationId;
  private ProfileGroupApplicationGrantSetting setting;
  private ProfileGroupApplicationGrantSetting effectiveSetting;

  public ProfileGroupApplicationGrantData() {
  }

  @JsonCreator
  public ProfileGroupApplicationGrantData(
    @JsonProperty(required = true, value = "applicationId") Long applicationId,
    @JsonProperty(required = true, value = "setting") ProfileGroupApplicationGrantSetting setting
  ) {
    this.applicationId = applicationId;
    this.setting = setting;
  }

  /**
   * Id of the application for which this access is.
   **/
  public ProfileGroupApplicationGrantData applicationId(Long applicationId) {
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
   * Setting that the user applied for this grant.
   **/
  public ProfileGroupApplicationGrantData setting(ProfileGroupApplicationGrantSetting setting) {
    this.setting = setting;
    return this;
  }

  
  @JsonProperty(required = true, value = "setting")
  @NotNull public ProfileGroupApplicationGrantSetting getSetting() {
    return setting;
  }

  @JsonProperty(required = true, value = "setting")
  public void setSetting(ProfileGroupApplicationGrantSetting setting) {
    this.setting = setting;
  }

  /**
   * Calculated setting. This is the resolved setting after respecting tenant grants.
   **/
  public ProfileGroupApplicationGrantData effectiveSetting(ProfileGroupApplicationGrantSetting effectiveSetting) {
    this.effectiveSetting = effectiveSetting;
    return this;
  }

  
  @JsonProperty("effectiveSetting")
  public ProfileGroupApplicationGrantSetting getEffectiveSetting() {
    return effectiveSetting;
  }

  @JsonProperty("effectiveSetting")
  public void setEffectiveSetting(ProfileGroupApplicationGrantSetting effectiveSetting) {
    this.effectiveSetting = effectiveSetting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileGroupApplicationGrantData profileGroupApplicationGrantData = (ProfileGroupApplicationGrantData) o;
    return Objects.equals(this.applicationId, profileGroupApplicationGrantData.applicationId) &&
        Objects.equals(this.setting, profileGroupApplicationGrantData.setting) &&
        Objects.equals(this.effectiveSetting, profileGroupApplicationGrantData.effectiveSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, setting, effectiveSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileGroupApplicationGrantData {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
    sb.append("    effectiveSetting: ").append(toIndentedString(effectiveSetting)).append("\n");
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

