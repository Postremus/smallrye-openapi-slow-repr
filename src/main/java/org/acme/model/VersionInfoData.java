package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("VersionInfoData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class VersionInfoData {

    private String name;

    private String version;

    private String stage;

    private String tenant;

    public VersionInfoData() {
    }

    /**
     * Name.
     **/
    public VersionInfoData name(String name) {
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
     * Version number.
     **/
    public VersionInfoData version(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Stage.
     **/
    public VersionInfoData stage(String stage) {
        this.stage = stage;
        return this;
    }

    @JsonProperty("stage")
    public String getStage() {
        return stage;
    }

    @JsonProperty("stage")
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * Tenant.
     **/
    public VersionInfoData tenant(String tenant) {
        this.tenant = tenant;
        return this;
    }

    @JsonProperty("tenant")
    public String getTenant() {
        return tenant;
    }

    @JsonProperty("tenant")
    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionInfoData versionInfoData = (VersionInfoData) o;
        return Objects.equals(this.name, versionInfoData.name) && Objects.equals(this.version, versionInfoData.version) && Objects.equals(this.stage,
                versionInfoData.stage) && Objects.equals(this.tenant, versionInfoData.tenant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, stage, tenant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionInfoData {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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
