package org.acme.model;

import java.util.UUID;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("OIDCClientIdDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class OIDCClientIdDataV2 {

    private UUID id;

    private String clientId;

    private String host;

    private String application;

    public OIDCClientIdDataV2() {
    }

    /**
     **/
    public OIDCClientIdDataV2 id(UUID id) {
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
     * The client_id for the oidc configuration. Depends on the host and application type.
     **/
    public OIDCClientIdDataV2 clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     **/
    public OIDCClientIdDataV2 host(String host) {
        this.host = host;
        return this;
    }

    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    /**
     **/
    public OIDCClientIdDataV2 application(String application) {
        this.application = application;
        return this;
    }

    @JsonProperty("application")
    public String getApplication() {
        return application;
    }

    @JsonProperty("application")
    public void setApplication(String application) {
        this.application = application;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OIDCClientIdDataV2 oiDCClientIdDataV2 = (OIDCClientIdDataV2) o;
        return Objects.equals(this.id, oiDCClientIdDataV2.id) && Objects.equals(this.clientId, oiDCClientIdDataV2.clientId) && Objects.equals(
                this.host, oiDCClientIdDataV2.host) && Objects.equals(this.application, oiDCClientIdDataV2.application);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, host, application);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OIDCClientIdDataV2 {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
