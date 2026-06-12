package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("KeycloakClientRepresentationData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class KeycloakClientRepresentationData {

    private String clientId;

    private String name;

    private String description;

    private String rootUrl;

    private String baseUrl;

    private @Valid List<String> redirectUris = new ArrayList<>();

    private @Valid List<String> webOrigins = new ArrayList<>();

    private Boolean directAccessGrantsEnabled;

    private Boolean publicClient;

    private Boolean frontchannelLogout;

    public KeycloakClientRepresentationData() {
    }

    @JsonCreator
    public KeycloakClientRepresentationData(@JsonProperty(required = true, value = "clientId") String clientId) {
        this.clientId = clientId;
    }

    /**
     **/
    public KeycloakClientRepresentationData clientId(String clientId) {
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
    public KeycloakClientRepresentationData name(String name) {
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
     **/
    public KeycloakClientRepresentationData description(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     **/
    public KeycloakClientRepresentationData rootUrl(String rootUrl) {
        this.rootUrl = rootUrl;
        return this;
    }

    @JsonProperty("rootUrl")
    public String getRootUrl() {
        return rootUrl;
    }

    @JsonProperty("rootUrl")
    public void setRootUrl(String rootUrl) {
        this.rootUrl = rootUrl;
    }

    /**
     **/
    public KeycloakClientRepresentationData baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    @JsonProperty("baseUrl")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("baseUrl")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     **/
    public KeycloakClientRepresentationData redirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    @JsonProperty("redirectUris")
    public List<String> getRedirectUris() {
        return redirectUris;
    }

    @JsonProperty("redirectUris")
    public void setRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
    }

    public KeycloakClientRepresentationData addRedirectUrisItem(String redirectUrisItem) {
        if (this.redirectUris == null) {
            this.redirectUris = new ArrayList<>();
        }

        this.redirectUris.add(redirectUrisItem);
        return this;
    }

    public KeycloakClientRepresentationData removeRedirectUrisItem(String redirectUrisItem) {
        if (redirectUrisItem != null && this.redirectUris != null) {
            this.redirectUris.remove(redirectUrisItem);
        }

        return this;
    }

    /**
     **/
    public KeycloakClientRepresentationData webOrigins(List<String> webOrigins) {
        this.webOrigins = webOrigins;
        return this;
    }

    @JsonProperty("webOrigins")
    public List<String> getWebOrigins() {
        return webOrigins;
    }

    @JsonProperty("webOrigins")
    public void setWebOrigins(List<String> webOrigins) {
        this.webOrigins = webOrigins;
    }

    public KeycloakClientRepresentationData addWebOriginsItem(String webOriginsItem) {
        if (this.webOrigins == null) {
            this.webOrigins = new ArrayList<>();
        }

        this.webOrigins.add(webOriginsItem);
        return this;
    }

    public KeycloakClientRepresentationData removeWebOriginsItem(String webOriginsItem) {
        if (webOriginsItem != null && this.webOrigins != null) {
            this.webOrigins.remove(webOriginsItem);
        }

        return this;
    }

    /**
     **/
    public KeycloakClientRepresentationData directAccessGrantsEnabled(Boolean directAccessGrantsEnabled) {
        this.directAccessGrantsEnabled = directAccessGrantsEnabled;
        return this;
    }

    @JsonProperty("directAccessGrantsEnabled")
    public Boolean getDirectAccessGrantsEnabled() {
        return directAccessGrantsEnabled;
    }

    @JsonProperty("directAccessGrantsEnabled")
    public void setDirectAccessGrantsEnabled(Boolean directAccessGrantsEnabled) {
        this.directAccessGrantsEnabled = directAccessGrantsEnabled;
    }

    /**
     **/
    public KeycloakClientRepresentationData publicClient(Boolean publicClient) {
        this.publicClient = publicClient;
        return this;
    }

    @JsonProperty("publicClient")
    public Boolean getPublicClient() {
        return publicClient;
    }

    @JsonProperty("publicClient")
    public void setPublicClient(Boolean publicClient) {
        this.publicClient = publicClient;
    }

    /**
     **/
    public KeycloakClientRepresentationData frontchannelLogout(Boolean frontchannelLogout) {
        this.frontchannelLogout = frontchannelLogout;
        return this;
    }

    @JsonProperty("frontchannelLogout")
    public Boolean getFrontchannelLogout() {
        return frontchannelLogout;
    }

    @JsonProperty("frontchannelLogout")
    public void setFrontchannelLogout(Boolean frontchannelLogout) {
        this.frontchannelLogout = frontchannelLogout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeycloakClientRepresentationData keycloakClientRepresentationData = (KeycloakClientRepresentationData) o;
        return Objects.equals(this.clientId, keycloakClientRepresentationData.clientId) && Objects.equals(this.name,
                keycloakClientRepresentationData.name) && Objects.equals(this.description,
                keycloakClientRepresentationData.description) && Objects.equals(this.rootUrl,
                keycloakClientRepresentationData.rootUrl) && Objects.equals(this.baseUrl, keycloakClientRepresentationData.baseUrl) && Objects.equals(
                this.redirectUris, keycloakClientRepresentationData.redirectUris) && Objects.equals(this.webOrigins,
                keycloakClientRepresentationData.webOrigins) && Objects.equals(this.directAccessGrantsEnabled,
                keycloakClientRepresentationData.directAccessGrantsEnabled) && Objects.equals(this.publicClient,
                keycloakClientRepresentationData.publicClient) && Objects.equals(this.frontchannelLogout,
                keycloakClientRepresentationData.frontchannelLogout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, name, description, rootUrl, baseUrl, redirectUris, webOrigins, directAccessGrantsEnabled, publicClient,
                frontchannelLogout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeycloakClientRepresentationData {\n");

        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    rootUrl: ").append(toIndentedString(rootUrl)).append("\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
        sb.append("    webOrigins: ").append(toIndentedString(webOrigins)).append("\n");
        sb.append("    directAccessGrantsEnabled: ").append(toIndentedString(directAccessGrantsEnabled)).append("\n");
        sb.append("    publicClient: ").append(toIndentedString(publicClient)).append("\n");
        sb.append("    frontchannelLogout: ").append(toIndentedString(frontchannelLogout)).append("\n");
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
