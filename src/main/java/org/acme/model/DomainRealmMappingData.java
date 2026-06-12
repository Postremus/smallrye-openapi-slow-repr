package org.acme.model;

import java.util.UUID;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("DomainRealmMappingData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class DomainRealmMappingData {

    private UUID id;

    private Boolean external;

    private String domain;

    private String realm;

    public DomainRealmMappingData() {
    }

    /**
     * Id of the domain-realm mapping.
     **/
    public DomainRealmMappingData id(UUID id) {
        this.id = id;
        return this;
    }

    @JsonProperty("id")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * External.
     **/
    public DomainRealmMappingData external(Boolean external) {
        this.external = external;
        return this;
    }

    @JsonProperty("external")
    public Boolean getExternal() {
        return external;
    }

    @JsonProperty("external")
    public void setExternal(Boolean external) {
        this.external = external;
    }

    /**
     * Domain.
     **/
    public DomainRealmMappingData domain(String domain) {
        this.domain = domain;
        return this;
    }

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * Realm.
     **/
    public DomainRealmMappingData realm(String realm) {
        this.realm = realm;
        return this;
    }

    @JsonProperty("realm")
    public String getRealm() {
        return realm;
    }

    @JsonProperty("realm")
    public void setRealm(String realm) {
        this.realm = realm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainRealmMappingData domainRealmMappingData = (DomainRealmMappingData) o;
        return Objects.equals(this.id, domainRealmMappingData.id) && Objects.equals(this.external, domainRealmMappingData.external) && Objects.equals(
                this.domain, domainRealmMappingData.domain) && Objects.equals(this.realm, domainRealmMappingData.realm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, external, domain, realm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainRealmMappingData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    external: ").append(toIndentedString(external)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
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
