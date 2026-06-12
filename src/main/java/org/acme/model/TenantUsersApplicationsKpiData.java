package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("TenantUsersApplicationsKpiData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class TenantUsersApplicationsKpiData {

    private String name;

    private Long users;

    private Long applications;

    public TenantUsersApplicationsKpiData() {
    }

    /**
     * Tenant name.
     **/
    public TenantUsersApplicationsKpiData name(String name) {
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
     * Number of distinct Users per Tenant.
     **/
    public TenantUsersApplicationsKpiData users(Long users) {
        this.users = users;
        return this;
    }

    @JsonProperty("users")
    public Long getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(Long users) {
        this.users = users;
    }

    /**
     * Number of distinct Applications per Tenant.
     **/
    public TenantUsersApplicationsKpiData applications(Long applications) {
        this.applications = applications;
        return this;
    }

    @JsonProperty("applications")
    public Long getApplications() {
        return applications;
    }

    @JsonProperty("applications")
    public void setApplications(Long applications) {
        this.applications = applications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TenantUsersApplicationsKpiData tenantUsersApplicationsKpiData = (TenantUsersApplicationsKpiData) o;
        return Objects.equals(this.name, tenantUsersApplicationsKpiData.name) && Objects.equals(this.users,
                tenantUsersApplicationsKpiData.users) && Objects.equals(this.applications, tenantUsersApplicationsKpiData.applications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users, applications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantUsersApplicationsKpiData {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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
