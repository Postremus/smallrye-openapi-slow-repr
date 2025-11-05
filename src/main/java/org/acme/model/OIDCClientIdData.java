package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OIDCClientIdData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class OIDCClientIdData   {
  private Long id;
  private String clientId;
  private String host;
  private String application;

  public OIDCClientIdData() {
  }

  /**
   **/
  public OIDCClientIdData id(Long id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The client_id for the oidc configuration. Depends on the host and application type.
   **/
  public OIDCClientIdData clientId(String clientId) {
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
  public OIDCClientIdData host(String host) {
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
  public OIDCClientIdData application(String application) {
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
    OIDCClientIdData oiDCClientIdData = (OIDCClientIdData) o;
    return Objects.equals(this.id, oiDCClientIdData.id) &&
        Objects.equals(this.clientId, oiDCClientIdData.clientId) &&
        Objects.equals(this.host, oiDCClientIdData.host) &&
        Objects.equals(this.application, oiDCClientIdData.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, host, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCClientIdData {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

