package org.acme.model;

import java.util.UUID;

import org.acme.model.OrganizationApplicationGrantSetting;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("OrganizationApplicationGrantDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class OrganizationApplicationGrantDataV2 {

    private UUID applicationId;

    private OrganizationApplicationGrantSetting setting;

    private OrganizationApplicationGrantSetting effectiveSetting;

    public OrganizationApplicationGrantDataV2() {
    }

    @JsonCreator
    public OrganizationApplicationGrantDataV2(@JsonProperty(required = true, value = "applicationId") UUID applicationId,
            @JsonProperty(required = true, value = "setting") OrganizationApplicationGrantSetting setting) {
        this.applicationId = applicationId;
        this.setting = setting;
    }

    /**
     * UUID of the application for which this access is.
     **/
    public OrganizationApplicationGrantDataV2 applicationId(UUID applicationId) {
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
    public OrganizationApplicationGrantDataV2 setting(OrganizationApplicationGrantSetting setting) {
        this.setting = setting;
        return this;
    }

    @JsonProperty(required = true, value = "setting")
    @NotNull
    public OrganizationApplicationGrantSetting getSetting() {
        return setting;
    }

    @JsonProperty(required = true, value = "setting")
    public void setSetting(OrganizationApplicationGrantSetting setting) {
        this.setting = setting;
    }

    /**
     * Calculated setting. This is the resolved setting after respecting INHERITED settings, and tenant grants.
     **/
    public OrganizationApplicationGrantDataV2 effectiveSetting(OrganizationApplicationGrantSetting effectiveSetting) {
        this.effectiveSetting = effectiveSetting;
        return this;
    }

    @JsonProperty("effectiveSetting")
    public OrganizationApplicationGrantSetting getEffectiveSetting() {
        return effectiveSetting;
    }

    @JsonProperty("effectiveSetting")
    public void setEffectiveSetting(OrganizationApplicationGrantSetting effectiveSetting) {
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
        OrganizationApplicationGrantDataV2 organizationApplicationGrantDataV2 = (OrganizationApplicationGrantDataV2) o;
        return Objects.equals(this.applicationId, organizationApplicationGrantDataV2.applicationId) && Objects.equals(this.setting,
                organizationApplicationGrantDataV2.setting) && Objects.equals(this.effectiveSetting,
                organizationApplicationGrantDataV2.effectiveSetting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, setting, effectiveSetting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationApplicationGrantDataV2 {\n");

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
