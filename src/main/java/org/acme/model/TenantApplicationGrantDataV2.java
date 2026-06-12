package org.acme.model;

import java.util.UUID;

import org.acme.model.TenantApplicationGrantSetting;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("TenantApplicationGrantDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300" +
        "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class TenantApplicationGrantDataV2 {

    private UUID applicationId;

    private TenantApplicationGrantSetting setting;

    public TenantApplicationGrantDataV2() {
    }

    @JsonCreator
    public TenantApplicationGrantDataV2(@JsonProperty(required = true, value = "applicationId") UUID applicationId,
            @JsonProperty(required = true, value = "setting") TenantApplicationGrantSetting setting) {
        this.applicationId = applicationId;
        this.setting = setting;
    }

    /**
     * Id of the application for which this access is.
     **/
    public TenantApplicationGrantDataV2 applicationId(UUID applicationId) {
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
     **/
    public TenantApplicationGrantDataV2 setting(TenantApplicationGrantSetting setting) {
        this.setting = setting;
        return this;
    }

    @JsonProperty(required = true, value = "setting")
    @NotNull
    public TenantApplicationGrantSetting getSetting() {
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
        TenantApplicationGrantDataV2 tenantApplicationGrantDataV2 = (TenantApplicationGrantDataV2) o;
        return Objects.equals(this.applicationId, tenantApplicationGrantDataV2.applicationId) && Objects.equals(this.setting,
                tenantApplicationGrantDataV2.setting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, setting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantApplicationGrantDataV2 {\n");

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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
