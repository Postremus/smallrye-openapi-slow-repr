package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PostAlertResultData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class PostAlertResultData   {
  private Long postId;
  private String title;
  private String preview;
  private Boolean read;

  public PostAlertResultData() {
  }

  /**
   * Id of the post this alert relates to
   **/
  public PostAlertResultData postId(Long postId) {
    this.postId = postId;
    return this;
  }

  
  @JsonProperty("postId")
  public Long getPostId() {
    return postId;
  }

  @JsonProperty("postId")
  public void setPostId(Long postId) {
    this.postId = postId;
  }

  /**
   * title of the post
   **/
  public PostAlertResultData title(String title) {
    this.title = title;
    return this;
  }

  
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * A short summary of the post
   **/
  public PostAlertResultData preview(String preview) {
    this.preview = preview;
    return this;
  }

  
  @JsonProperty("preview")
  public String getPreview() {
    return preview;
  }

  @JsonProperty("preview")
  public void setPreview(String preview) {
    this.preview = preview;
  }

  /**
   * If this post was marked as read
   **/
  public PostAlertResultData read(Boolean read) {
    this.read = read;
    return this;
  }

  
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }

  @JsonProperty("read")
  public void setRead(Boolean read) {
    this.read = read;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAlertResultData postAlertResultData = (PostAlertResultData) o;
    return Objects.equals(this.postId, postAlertResultData.postId) &&
        Objects.equals(this.title, postAlertResultData.title) &&
        Objects.equals(this.preview, postAlertResultData.preview) &&
        Objects.equals(this.read, postAlertResultData.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postId, title, preview, read);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAlertResultData {\n");
    
    sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

