package org.acme.model;

import org.acme.model.ServiceLinkTargetType;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ServiceLinkInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ServiceLinkInputData   {
  private TranslationHolderData translation;
  private ServiceLinkTargetType targetType;
  private String iconClass;
  private Integer ordinal;
  private String link;
  private Boolean active;

  public ServiceLinkInputData() {
  }

  @JsonCreator
  public ServiceLinkInputData(
    @JsonProperty(required = true, value = "translation") TranslationHolderData translation,
    @JsonProperty(required = true, value = "targetType") ServiceLinkTargetType targetType,
    @JsonProperty(required = true, value = "iconClass") String iconClass,
    @JsonProperty(required = true, value = "ordinal") Integer ordinal,
    @JsonProperty(required = true, value = "link") String link
  ) {
    this.translation = translation;
    this.targetType = targetType;
    this.iconClass = iconClass;
    this.ordinal = ordinal;
    this.link = link;
  }

  /**
   **/
  public ServiceLinkInputData translation(TranslationHolderData translation) {
    this.translation = translation;
    return this;
  }

  
  @JsonProperty(required = true, value = "translation")
  @NotNull @Valid public TranslationHolderData getTranslation() {
    return translation;
  }

  @JsonProperty(required = true, value = "translation")
  public void setTranslation(TranslationHolderData translation) {
    this.translation = translation;
  }

  /**
   **/
  public ServiceLinkInputData targetType(ServiceLinkTargetType targetType) {
    this.targetType = targetType;
    return this;
  }

  
  @JsonProperty(required = true, value = "targetType")
  @NotNull public ServiceLinkTargetType getTargetType() {
    return targetType;
  }

  @JsonProperty(required = true, value = "targetType")
  public void setTargetType(ServiceLinkTargetType targetType) {
    this.targetType = targetType;
  }

  /**
   **/
  public ServiceLinkInputData iconClass(String iconClass) {
    this.iconClass = iconClass;
    return this;
  }

  
  @JsonProperty(required = true, value = "iconClass")
  @NotNull  @Pattern(regexp="\\S")public String getIconClass() {
    return iconClass;
  }

  @JsonProperty(required = true, value = "iconClass")
  public void setIconClass(String iconClass) {
    this.iconClass = iconClass;
  }

  /**
   **/
  public ServiceLinkInputData ordinal(Integer ordinal) {
    this.ordinal = ordinal;
    return this;
  }

  
  @JsonProperty(required = true, value = "ordinal")
  @NotNull public Integer getOrdinal() {
    return ordinal;
  }

  @JsonProperty(required = true, value = "ordinal")
  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }

  /**
   **/
  public ServiceLinkInputData link(String link) {
    this.link = link;
    return this;
  }

  
  @JsonProperty(required = true, value = "link")
  @NotNull  @Pattern(regexp="\\S")public String getLink() {
    return link;
  }

  @JsonProperty(required = true, value = "link")
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  public ServiceLinkInputData active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  @JsonProperty("active")
  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLinkInputData serviceLinkInputData = (ServiceLinkInputData) o;
    return Objects.equals(this.translation, serviceLinkInputData.translation) &&
        Objects.equals(this.targetType, serviceLinkInputData.targetType) &&
        Objects.equals(this.iconClass, serviceLinkInputData.iconClass) &&
        Objects.equals(this.ordinal, serviceLinkInputData.ordinal) &&
        Objects.equals(this.link, serviceLinkInputData.link) &&
        Objects.equals(this.active, serviceLinkInputData.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translation, targetType, iconClass, ordinal, link, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLinkInputData {\n");
    
    sb.append("    translation: ").append(toIndentedString(translation)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    iconClass: ").append(toIndentedString(iconClass)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

