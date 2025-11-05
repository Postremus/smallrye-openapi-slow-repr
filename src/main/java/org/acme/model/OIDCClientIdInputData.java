package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OIDCClientIdInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class OIDCClientIdInputData   {
  private String clientId;
  private String host;
  private String application;

  public OIDCClientIdInputData() {
  }

  @JsonCreator
  public OIDCClientIdInputData(
    @JsonProperty(required = true, value = "clientId") String clientId,
    @JsonProperty(required = true, value = "host") String host,
    @JsonProperty(required = true, value = "application") String application
  ) {
    this.clientId = clientId;
    this.host = host;
    this.application = application;
  }

  /**
   * The client_id for the oidc configuration. Depends on the host and application type.
   **/
  public OIDCClientIdInputData clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  
  @JsonProperty(required = true, value = "clientId")
  @NotNull  @Pattern(regexp="\\S")public String getClientId() {
    return clientId;
  }

  @JsonProperty(required = true, value = "clientId")
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   **/
  public OIDCClientIdInputData host(String host) {
    this.host = host;
    return this;
  }

  
  @JsonProperty(required = true, value = "host")
  @NotNull  @Pattern(regexp="\\S")public String getHost() {
    return host;
  }

  @JsonProperty(required = true, value = "host")
  public void setHost(String host) {
    this.host = host;
  }

  /**
   **/
  public OIDCClientIdInputData application(String application) {
    this.application = application;
    return this;
  }

  
  @JsonProperty(required = true, value = "application")
  @NotNull  @Pattern(regexp="\\S")public String getApplication() {
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
    OIDCClientIdInputData oiDCClientIdInputData = (OIDCClientIdInputData) o;
    return Objects.equals(this.clientId, oiDCClientIdInputData.clientId) &&
        Objects.equals(this.host, oiDCClientIdInputData.host) &&
        Objects.equals(this.application, oiDCClientIdInputData.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, host, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCClientIdInputData {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

