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



@JsonTypeName("UnknownTechnicalException")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class UnknownTechnicalException   {
  private ErrorCode errorCode;
  private @Valid List<Object> additionalInfo = new ArrayList<>();
  private @Valid List<String> stackTraceLines = new ArrayList<>();
  private String uuId;
  private String message;

  public UnknownTechnicalException() {
  }

  /**
   **/
  public UnknownTechnicalException errorCode(ErrorCode errorCode) {
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
  public UnknownTechnicalException additionalInfo(List<Object> additionalInfo) {
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

  public UnknownTechnicalException addAdditionalInfoItem(Object additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<>();
    }

    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

  public UnknownTechnicalException removeAdditionalInfoItem(Object additionalInfoItem) {
    if (additionalInfoItem != null && this.additionalInfo != null) {
      this.additionalInfo.remove(additionalInfoItem);
    }

    return this;
  }
  /**
   **/
  public UnknownTechnicalException stackTraceLines(List<String> stackTraceLines) {
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

  public UnknownTechnicalException addStackTraceLinesItem(String stackTraceLinesItem) {
    if (this.stackTraceLines == null) {
      this.stackTraceLines = new ArrayList<>();
    }

    this.stackTraceLines.add(stackTraceLinesItem);
    return this;
  }

  public UnknownTechnicalException removeStackTraceLinesItem(String stackTraceLinesItem) {
    if (stackTraceLinesItem != null && this.stackTraceLines != null) {
      this.stackTraceLines.remove(stackTraceLinesItem);
    }

    return this;
  }
  /**
   **/
  public UnknownTechnicalException uuId(String uuId) {
    this.uuId = uuId;
    return this;
  }

  
  @JsonProperty("uuId")
  public String getUuId() {
    return uuId;
  }

  @JsonProperty("uuId")
  public void setUuId(String uuId) {
    this.uuId = uuId;
  }

  /**
   **/
  public UnknownTechnicalException message(String message) {
    this.message = message;
    return this;
  }

  
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnknownTechnicalException unknownTechnicalException = (UnknownTechnicalException) o;
    return Objects.equals(this.errorCode, unknownTechnicalException.errorCode) &&
        Objects.equals(this.additionalInfo, unknownTechnicalException.additionalInfo) &&
        Objects.equals(this.stackTraceLines, unknownTechnicalException.stackTraceLines) &&
        Objects.equals(this.uuId, unknownTechnicalException.uuId) &&
        Objects.equals(this.message, unknownTechnicalException.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, additionalInfo, stackTraceLines, uuId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnknownTechnicalException {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    stackTraceLines: ").append(toIndentedString(stackTraceLines)).append("\n");
    sb.append("    uuId: ").append(toIndentedString(uuId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

