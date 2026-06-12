package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ChangePasswordInputData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ChangePasswordInputData   {
  private String password;

  public ChangePasswordInputData() {
  }

  @JsonCreator
  public ChangePasswordInputData(
    @JsonProperty(required = true, value = "password") String password
  ) {
    this.password = password;
  }

  /**
   * New password for the account. Might get rejected by the idp even if it passes this initial regex validation.
   **/
  public ChangePasswordInputData password(String password) {
    this.password = password;
    return this;
  }

  
  @JsonProperty(required = true, value = "password")
  @NotNull  @Pattern(regexp="\\S")public String getPassword() {
    return password;
  }

  @JsonProperty(required = true, value = "password")
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePasswordInputData changePasswordInputData = (ChangePasswordInputData) o;
    return Objects.equals(this.password, changePasswordInputData.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePasswordInputData {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
