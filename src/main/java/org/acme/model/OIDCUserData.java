package org.acme.model;

import java.util.Map;
import java.util.Objects;

import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("OIDCUserData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date =
        "2026-06-12T06:27:49" + ".020268300" + "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class OIDCUserData   {
  private AccountData portalAccount;
  private AccountData keycloakAccount;
  private String keycloakRealm;

  public OIDCUserData() {
  }

  /**
   * Data of portal account.
   **/
  public OIDCUserData portalAccount(AccountData portalAccount) {
    this.portalAccount = portalAccount;
    return this;
  }

  
  @JsonProperty("portalAccount")
  @Valid public AccountData getPortalAccount() {
    return portalAccount;
  }

  @JsonProperty("portalAccount")
  public void setPortalAccount(AccountData portalAccount) {
    this.portalAccount = portalAccount;
  }

  /**
   * Data of keycloak account.
   **/
  public OIDCUserData keycloakAccount(AccountData keycloakAccount) {
    this.keycloakAccount = keycloakAccount;
    return this;
  }

  
  @JsonProperty("keycloakAccount")
  @Valid public AccountData getKeycloakAccount() {
    return keycloakAccount;
  }

  @JsonProperty("keycloakAccount")
  public void setKeycloakAccount(AccountData keycloakAccount) {
    this.keycloakAccount = keycloakAccount;
  }

  /**
   * Realm of keycloak account.
   **/
  public OIDCUserData keycloakRealm(String keycloakRealm) {
    this.keycloakRealm = keycloakRealm;
    return this;
  }

  
  @JsonProperty("keycloakRealm")
  public String getKeycloakRealm() {
    return keycloakRealm;
  }

  @JsonProperty("keycloakRealm")
  public void setKeycloakRealm(String keycloakRealm) {
    this.keycloakRealm = keycloakRealm;
  }

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public OIDCUserData putAdditionalProperty(String key, Object value) {
        return this;
    }

    /**
     * Return the additional (undeclared) properties.
     * @return the additional (undeclared) properties
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return null;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     * @param key the name of the property
     * @return the additional (undeclared) property with the specified name
     */
    public Object getAdditionalProperty(String key) {
        return null;
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCUserData oiDCUserData = (OIDCUserData) o;
    return Objects.equals(this.portalAccount, oiDCUserData.portalAccount) &&
        Objects.equals(this.keycloakAccount, oiDCUserData.keycloakAccount) &&
        Objects.equals(this.keycloakRealm, oiDCUserData.keycloakRealm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portalAccount, keycloakAccount, keycloakRealm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCUserData {\n");
    
    sb.append("    portalAccount: ").append(toIndentedString(portalAccount)).append("\n");
    sb.append("    keycloakAccount: ").append(toIndentedString(keycloakAccount)).append("\n");
    sb.append("    keycloakRealm: ").append(toIndentedString(keycloakRealm)).append("\n");
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
