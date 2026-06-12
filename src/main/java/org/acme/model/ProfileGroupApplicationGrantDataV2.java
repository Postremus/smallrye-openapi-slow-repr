package org.acme.model;

import java.util.UUID;

import org.acme.model.ProfileGroupApplicationGrantSetting;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ProfileGroupApplicationGrantDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300" +
        "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ProfileGroupApplicationGrantDataV2 {

    private UUID applicationId;

    private ProfileGroupApplicationGrantSetting setting;

    private ProfileGroupApplicationGrantSetting effectiveSetting;

    public ProfileGroupApplicationGrantDataV2() {
    }

    @JsonCreator
    public ProfileGroupApplicationGrantDataV2(@JsonProperty(required = true, value = "applicationId") UUID applicationId,
            @JsonProperty(required = true, value = "setting") ProfileGroupApplicationGrantSetting setting) {
        this.applicationId = applicationId;
        this.setting = setting;
    }

    /**
     * Id of the application for which this access is.
     **/
    public ProfileGroupApplicationGrantDataV2 applicationId(UUID applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    @JsonProperty(required = true, value = "applicationId")
    @NotNull
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getApplicationId() {
        return applicationId;
    }

    @JsonProperty(required = true, value = "applicationId")
    public void setApplicationId(UUID applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Setting that the user applied for this grant.
     **/
    public ProfileGroupApplicationGrantDataV2 setting(ProfileGroupApplicationGrantSetting setting) {
        this.setting = setting;
        return this;
    }

    @JsonProperty(required = true, value = "setting")
    @NotNull
    public ProfileGroupApplicationGrantSetting getSetting() {
        return setting;
    }

    @JsonProperty(required = true, value = "setting")
    public void setSetting(ProfileGroupApplicationGrantSetting setting) {
        this.setting = setting;
    }

    /**
     * Calculated setting. This is the resolved setting after respecting tenant grants.
     **/
    public ProfileGroupApplicationGrantDataV2 effectiveSetting(ProfileGroupApplicationGrantSetting effectiveSetting) {
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
        ProfileGroupApplicationGrantDataV2 profileGroupApplicationGrantDataV2 = (ProfileGroupApplicationGrantDataV2) o;
        return Objects.equals(this.applicationId, profileGroupApplicationGrantDataV2.applicationId) && Objects.equals(this.setting,
                profileGroupApplicationGrantDataV2.setting) && Objects.equals(this.effectiveSetting,
                profileGroupApplicationGrantDataV2.effectiveSetting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, setting, effectiveSetting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfileGroupApplicationGrantDataV2 {\n");

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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
