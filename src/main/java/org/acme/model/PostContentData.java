package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PostContentData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class PostContentData   {
  private String languageTag;
  private String title;
  private String preview;
  private String body;

  public PostContentData() {
  }

  @JsonCreator
  public PostContentData(
    @JsonProperty(required = true, value = "languageTag") String languageTag,
    @JsonProperty(required = true, value = "title") String title,
    @JsonProperty(required = true, value = "preview") String preview,
    @JsonProperty(required = true, value = "body") String body
  ) {
    this.languageTag = languageTag;
    this.title = title;
    this.preview = preview;
    this.body = body;
  }

  /**
   * Language tag indicating the language of this translation. RFC-5646 Format
   **/
  public PostContentData languageTag(String languageTag) {
    this.languageTag = languageTag;
    return this;
  }

  
  @JsonProperty(required = true, value = "languageTag")
  @NotNull  @Pattern(regexp="\\S") @Size(max=255)public String getLanguageTag() {
    return languageTag;
  }

  @JsonProperty(required = true, value = "languageTag")
  public void setLanguageTag(String languageTag) {
    this.languageTag = languageTag;
  }

  /**
   * title of the post
   **/
  public PostContentData title(String title) {
    this.title = title;
    return this;
  }

  
  @JsonProperty(required = true, value = "title")
  @NotNull  @Pattern(regexp="\\S")public String getTitle() {
    return title;
  }

  @JsonProperty(required = true, value = "title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * A short summary of the post
   **/
  public PostContentData preview(String preview) {
    this.preview = preview;
    return this;
  }

  
  @JsonProperty(required = true, value = "preview")
  @NotNull  @Pattern(regexp="\\S")public String getPreview() {
    return preview;
  }

  @JsonProperty(required = true, value = "preview")
  public void setPreview(String preview) {
    this.preview = preview;
  }

  /**
   * Bod of this post, containing the post itself.
   **/
  public PostContentData body(String body) {
    this.body = body;
    return this;
  }

  
  @JsonProperty(required = true, value = "body")
  @NotNull  @Pattern(regexp="\\S")public String getBody() {
    return body;
  }

  @JsonProperty(required = true, value = "body")
  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostContentData postContentData = (PostContentData) o;
    return Objects.equals(this.languageTag, postContentData.languageTag) &&
        Objects.equals(this.title, postContentData.title) &&
        Objects.equals(this.preview, postContentData.preview) &&
        Objects.equals(this.body, postContentData.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageTag, title, preview, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContentData {\n");
    
    sb.append("    languageTag: ").append(toIndentedString(languageTag)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

