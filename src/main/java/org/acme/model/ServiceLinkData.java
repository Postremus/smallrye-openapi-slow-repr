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



@JsonTypeName("ServiceLinkData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ServiceLinkData   {
  private Long id;
  private TranslationHolderData translation;
  private ServiceLinkTargetType targetType;
  private String iconClass;
  private Integer ordinal;
  private String link;
  private Boolean active;

  public ServiceLinkData() {
  }

  /**
   **/
  public ServiceLinkData id(Long id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public ServiceLinkData translation(TranslationHolderData translation) {
    this.translation = translation;
    return this;
  }

  
  @JsonProperty("translation")
  @Valid public TranslationHolderData getTranslation() {
    return translation;
  }

  @JsonProperty("translation")
  public void setTranslation(TranslationHolderData translation) {
    this.translation = translation;
  }

  /**
   **/
  public ServiceLinkData targetType(ServiceLinkTargetType targetType) {
    this.targetType = targetType;
    return this;
  }

  
  @JsonProperty("targetType")
  public ServiceLinkTargetType getTargetType() {
    return targetType;
  }

  @JsonProperty("targetType")
  public void setTargetType(ServiceLinkTargetType targetType) {
    this.targetType = targetType;
  }

  /**
   **/
  public ServiceLinkData iconClass(String iconClass) {
    this.iconClass = iconClass;
    return this;
  }

  
  @JsonProperty("iconClass")
  public String getIconClass() {
    return iconClass;
  }

  @JsonProperty("iconClass")
  public void setIconClass(String iconClass) {
    this.iconClass = iconClass;
  }

  /**
   **/
  public ServiceLinkData ordinal(Integer ordinal) {
    this.ordinal = ordinal;
    return this;
  }

  
  @JsonProperty("ordinal")
  public Integer getOrdinal() {
    return ordinal;
  }

  @JsonProperty("ordinal")
  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }

  /**
   **/
  public ServiceLinkData link(String link) {
    this.link = link;
    return this;
  }

  
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  public ServiceLinkData active(Boolean active) {
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
    ServiceLinkData serviceLinkData = (ServiceLinkData) o;
    return Objects.equals(this.id, serviceLinkData.id) &&
        Objects.equals(this.translation, serviceLinkData.translation) &&
        Objects.equals(this.targetType, serviceLinkData.targetType) &&
        Objects.equals(this.iconClass, serviceLinkData.iconClass) &&
        Objects.equals(this.ordinal, serviceLinkData.ordinal) &&
        Objects.equals(this.link, serviceLinkData.link) &&
        Objects.equals(this.active, serviceLinkData.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, translation, targetType, iconClass, ordinal, link, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLinkData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

