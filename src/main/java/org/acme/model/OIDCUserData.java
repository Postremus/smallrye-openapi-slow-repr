package org.acme.model;

import org.acme.model.AccountData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OIDCUserData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

