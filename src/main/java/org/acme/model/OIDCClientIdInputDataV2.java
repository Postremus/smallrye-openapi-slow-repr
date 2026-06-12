package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("OIDCClientIdInputDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class OIDCClientIdInputDataV2 {

    private String clientId;

    private String host;

    private String application;

    public OIDCClientIdInputDataV2() {
    }

    @JsonCreator
    public OIDCClientIdInputDataV2(@JsonProperty(required = true, value = "clientId") String clientId,
            @JsonProperty(required = true, value = "host") String host, @JsonProperty(required = true, value = "application") String application) {
        this.clientId = clientId;
        this.host = host;
        this.application = application;
    }

    /**
     * The client_id for the oidc configuration. Depends on the host and application type.
     **/
    public OIDCClientIdInputDataV2 clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    @JsonProperty(required = true, value = "clientId")
    @NotNull
    @Pattern(regexp = "\\S")
    public String getClientId() {
        return clientId;
    }

    @JsonProperty(required = true, value = "clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     **/
    public OIDCClientIdInputDataV2 host(String host) {
        this.host = host;
        return this;
    }

    @JsonProperty(required = true, value = "host")
    @NotNull
    @Pattern(regexp = "\\S")
    public String getHost() {
        return host;
    }

    @JsonProperty(required = true, value = "host")
    public void setHost(String host) {
        this.host = host;
    }

    /**
     **/
    public OIDCClientIdInputDataV2 application(String application) {
        this.application = application;
        return this;
    }

    @JsonProperty(required = true, value = "application")
    @NotNull
    @Pattern(regexp = "\\S")
    public String getApplication() {
        return application;
    }

    @JsonProperty(required = true, value = "application")
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
        OIDCClientIdInputDataV2 oiDCClientIdInputDataV2 = (OIDCClientIdInputDataV2) o;
        return Objects.equals(this.clientId, oiDCClientIdInputDataV2.clientId) && Objects.equals(this.host,
                oiDCClientIdInputDataV2.host) && Objects.equals(this.application, oiDCClientIdInputDataV2.application);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, host, application);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OIDCClientIdInputDataV2 {\n");

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
