package org.acme.model;

import java.util.UUID;
import org.acme.model.ImageType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ImageDesignData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ImageDesignData   {
  private UUID id;
  private String mimeType;
  private String fileData;
  private ImageType usage;
  private UUID profileId;

  public ImageDesignData() {
  }

  @JsonCreator
  public ImageDesignData(
    @JsonProperty(required = true, value = "mimeType") String mimeType,
    @JsonProperty(required = true, value = "fileData") String fileData,
    @JsonProperty(required = true, value = "usage") ImageType usage,
    @JsonProperty(required = true, value = "profileId") UUID profileId
  ) {
    this.mimeType = mimeType;
    this.fileData = fileData;
    this.usage = usage;
    this.profileId = profileId;
  }

  /**
   **/
  public ImageDesignData id(UUID id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public ImageDesignData mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  
  @JsonProperty(required = true, value = "mimeType")
  @NotNull  @Size(min=1)public String getMimeType() {
    return mimeType;
  }

  @JsonProperty(required = true, value = "mimeType")
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   **/
  public ImageDesignData fileData(String fileData) {
    this.fileData = fileData;
    return this;
  }

  
  @JsonProperty(required = true, value = "fileData")
  @NotNull  @Size(min=1)public String getFileData() {
    return fileData;
  }

  @JsonProperty(required = true, value = "fileData")
  public void setFileData(String fileData) {
    this.fileData = fileData;
  }

  /**
   **/
  public ImageDesignData usage(ImageType usage) {
    this.usage = usage;
    return this;
  }

  
  @JsonProperty(required = true, value = "usage")
  @NotNull public ImageType getUsage() {
    return usage;
  }

  @JsonProperty(required = true, value = "usage")
  public void setUsage(ImageType usage) {
    this.usage = usage;
  }

  /**
   **/
  public ImageDesignData profileId(UUID profileId) {
    this.profileId = profileId;
    return this;
  }

  
  @JsonProperty(required = true, value = "profileId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getProfileId() {
    return profileId;
  }

  @JsonProperty(required = true, value = "profileId")
  public void setProfileId(UUID profileId) {
    this.profileId = profileId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDesignData imageDesignData = (ImageDesignData) o;
    return Objects.equals(this.id, imageDesignData.id) &&
        Objects.equals(this.mimeType, imageDesignData.mimeType) &&
        Objects.equals(this.fileData, imageDesignData.fileData) &&
        Objects.equals(this.usage, imageDesignData.usage) &&
        Objects.equals(this.profileId, imageDesignData.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mimeType, fileData, usage, profileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDesignData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    fileData: ").append(toIndentedString(fileData)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
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

