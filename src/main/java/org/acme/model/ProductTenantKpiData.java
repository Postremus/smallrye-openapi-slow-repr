package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ProductTenantKpiData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ProductTenantKpiData {

    private String name;

    private Long tenants;

    public ProductTenantKpiData() {
    }

    /**
     * Product name.
     **/
    public ProductTenantKpiData name(String name) {
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
     * Number of distinct Tenants per Product.
     **/
    public ProductTenantKpiData tenants(Long tenants) {
        this.tenants = tenants;
        return this;
    }

    @JsonProperty("tenants")
    public Long getTenants() {
        return tenants;
    }

    @JsonProperty("tenants")
    public void setTenants(Long tenants) {
        this.tenants = tenants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductTenantKpiData productTenantKpiData = (ProductTenantKpiData) o;
        return Objects.equals(this.name, productTenantKpiData.name) && Objects.equals(this.tenants, productTenantKpiData.tenants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tenants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductTenantKpiData {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
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
