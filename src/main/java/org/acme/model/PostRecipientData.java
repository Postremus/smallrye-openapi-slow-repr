package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PostRecipientData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class PostRecipientData   {
  private String type;
  private String key;

  public PostRecipientData() {
  }

  @JsonCreator
  public PostRecipientData(
    @JsonProperty(required = true, value = "type") String type,
    @JsonProperty(required = true, value = "key") String key
  ) {
    this.type = type;
    this.key = key;
  }

  /**
   * Context type of this recipient
   **/
  public PostRecipientData type(String type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty(required = true, value = "type")
  @NotNull  @Pattern(regexp="\\S") @Size(max=255)public String getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Context key of this recipient, e.g. the business relation number
   **/
  public PostRecipientData key(String key) {
    this.key = key;
    return this;
  }

  
  @JsonProperty(required = true, value = "key")
  @NotNull  @Pattern(regexp="\\S") @Size(max=255)public String getKey() {
    return key;
  }

  @JsonProperty(required = true, value = "key")
  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRecipientData postRecipientData = (PostRecipientData) o;
    return Objects.equals(this.type, postRecipientData.type) &&
        Objects.equals(this.key, postRecipientData.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRecipientData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

