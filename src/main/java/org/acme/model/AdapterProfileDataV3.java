package org.acme.model;

import java.util.UUID;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("AdapterProfileDataV3")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class AdapterProfileDataV3 {

    private UUID adapterId;

    private String identifier;

    private Boolean enabled;

    public AdapterProfileDataV3() {
    }

    /**
     **/
    public AdapterProfileDataV3 adapterId(UUID adapterId) {
        this.adapterId = adapterId;
        return this;
    }

    @JsonProperty("adapterId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getAdapterId() {
        return adapterId;
    }

    @JsonProperty("adapterId")
    public void setAdapterId(UUID adapterId) {
        this.adapterId = adapterId;
    }

    /**
     **/
    public AdapterProfileDataV3 identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     **/
    public AdapterProfileDataV3 enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdapterProfileDataV3 adapterProfileDataV3 = (AdapterProfileDataV3) o;
        return Objects.equals(this.adapterId, adapterProfileDataV3.adapterId) && Objects.equals(this.identifier,
                adapterProfileDataV3.identifier) && Objects.equals(this.enabled, adapterProfileDataV3.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adapterId, identifier, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdapterProfileDataV3 {\n");

        sb.append("    adapterId: ").append(toIndentedString(adapterId)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
