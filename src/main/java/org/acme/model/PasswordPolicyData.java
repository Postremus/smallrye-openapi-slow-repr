package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PasswordPolicyData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class PasswordPolicyData   {
  private Boolean canChangePassword;

  public PasswordPolicyData() {
  }

  /**
   * Decides if the portal can change the password of this account. * true - if the user is managed in our idp. * false - if the user exist in an external idp, or if the account does not exist.
   **/
  public PasswordPolicyData canChangePassword(Boolean canChangePassword) {
    this.canChangePassword = canChangePassword;
    return this;
  }

  
  @JsonProperty("canChangePassword")
  public Boolean getCanChangePassword() {
    return canChangePassword;
  }

  @JsonProperty("canChangePassword")
  public void setCanChangePassword(Boolean canChangePassword) {
    this.canChangePassword = canChangePassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordPolicyData passwordPolicyData = (PasswordPolicyData) o;
    return Objects.equals(this.canChangePassword, passwordPolicyData.canChangePassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canChangePassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyData {\n");
    
    sb.append("    canChangePassword: ").append(toIndentedString(canChangePassword)).append("\n");
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

