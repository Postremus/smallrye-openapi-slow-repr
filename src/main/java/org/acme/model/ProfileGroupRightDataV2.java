package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ProfileGroupRightDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ProfileGroupRightDataV2 {

    private String name;

    private Boolean isActive;

    public ProfileGroupRightDataV2() {
    }

    /**
     * name of the right.
     **/
    public ProfileGroupRightDataV2 name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * True if the right is currently active for the group.
     **/
    public ProfileGroupRightDataV2 isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProfileGroupRightDataV2 profileGroupRightDataV2 = (ProfileGroupRightDataV2) o;
        return Objects.equals(this.name, profileGroupRightDataV2.name) && Objects.equals(this.isActive, profileGroupRightDataV2.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isActive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfileGroupRightDataV2 {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
