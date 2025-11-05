package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.acme.model.ErrorCode;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AuthenticationException")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class AuthenticationException   {
  private ErrorCode errorCode;
  private @Valid List<Object> additionalInfo = new ArrayList<>();
  private @Valid List<String> stackTraceLines = new ArrayList<>();

  public AuthenticationException() {
  }

  /**
   **/
  public AuthenticationException errorCode(ErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  
  @JsonProperty("errorCode")
  public ErrorCode getErrorCode() {
    return errorCode;
  }

  @JsonProperty("errorCode")
  public void setErrorCode(ErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  public AuthenticationException additionalInfo(List<Object> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  
  @JsonProperty("additionalInfo")
  public List<Object> getAdditionalInfo() {
    return additionalInfo;
  }

  @JsonProperty("additionalInfo")
  public void setAdditionalInfo(List<Object> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public AuthenticationException addAdditionalInfoItem(Object additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<>();
    }

    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

  public AuthenticationException removeAdditionalInfoItem(Object additionalInfoItem) {
    if (additionalInfoItem != null && this.additionalInfo != null) {
      this.additionalInfo.remove(additionalInfoItem);
    }

    return this;
  }
  /**
   **/
  public AuthenticationException stackTraceLines(List<String> stackTraceLines) {
    this.stackTraceLines = stackTraceLines;
    return this;
  }

  
  @JsonProperty("stackTraceLines")
  public List<String> getStackTraceLines() {
    return stackTraceLines;
  }

  @JsonProperty("stackTraceLines")
  public void setStackTraceLines(List<String> stackTraceLines) {
    this.stackTraceLines = stackTraceLines;
  }

  public AuthenticationException addStackTraceLinesItem(String stackTraceLinesItem) {
    if (this.stackTraceLines == null) {
      this.stackTraceLines = new ArrayList<>();
    }

    this.stackTraceLines.add(stackTraceLinesItem);
    return this;
  }

  public AuthenticationException removeStackTraceLinesItem(String stackTraceLinesItem) {
    if (stackTraceLinesItem != null && this.stackTraceLines != null) {
      this.stackTraceLines.remove(stackTraceLinesItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationException authenticationException = (AuthenticationException) o;
    return Objects.equals(this.errorCode, authenticationException.errorCode) &&
        Objects.equals(this.additionalInfo, authenticationException.additionalInfo) &&
        Objects.equals(this.stackTraceLines, authenticationException.stackTraceLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, additionalInfo, stackTraceLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationException {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    stackTraceLines: ").append(toIndentedString(stackTraceLines)).append("\n");
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

