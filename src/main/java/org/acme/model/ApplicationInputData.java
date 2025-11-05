package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ApplicationInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ApplicationInputData   {
  private TranslationHolderData name;
  private TranslationHolderData category;
  private TranslationHolderData description;
  private @Valid List<@Valid TranslationHolderData> features = new ArrayList<>();
  private String url;
  private String endpointUser;
  private String endpointOrganization;
  private String endpointOrganizationUUID;
  private Boolean enableUserScheduler;
  private Boolean enableOrganizationScheduler;
  private String iconClass;
  private Long applicationGroupId;
  private Long parentApplicationId;

  public ApplicationInputData() {
  }

  @JsonCreator
  public ApplicationInputData(
    @JsonProperty(required = true, value = "name") TranslationHolderData name,
    @JsonProperty(required = true, value = "category") TranslationHolderData category,
    @JsonProperty(required = true, value = "description") TranslationHolderData description,
    @JsonProperty(required = true, value = "features") List<@Valid TranslationHolderData> features,
    @JsonProperty(required = true, value = "applicationGroupId") Long applicationGroupId
  ) {
    this.name = name;
    this.category = category;
    this.description = description;
    this.features = features;
    this.applicationGroupId = applicationGroupId;
  }

  /**
   * Translated application name.
   **/
  public ApplicationInputData name(TranslationHolderData name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty(required = true, value = "name")
  @NotNull @Valid public TranslationHolderData getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(TranslationHolderData name) {
    this.name = name;
  }

  /**
   * Translated application category.
   **/
  public ApplicationInputData category(TranslationHolderData category) {
    this.category = category;
    return this;
  }

  
  @JsonProperty(required = true, value = "category")
  @NotNull @Valid public TranslationHolderData getCategory() {
    return category;
  }

  @JsonProperty(required = true, value = "category")
  public void setCategory(TranslationHolderData category) {
    this.category = category;
  }

  /**
   * Translated application description.
   **/
  public ApplicationInputData description(TranslationHolderData description) {
    this.description = description;
    return this;
  }

  
  @JsonProperty(required = true, value = "description")
  @NotNull @Valid public TranslationHolderData getDescription() {
    return description;
  }

  @JsonProperty(required = true, value = "description")
  public void setDescription(TranslationHolderData description) {
    this.description = description;
  }

  /**
   * Translated application feature list.
   **/
  public ApplicationInputData features(List<@Valid TranslationHolderData> features) {
    this.features = features;
    return this;
  }

  
  @JsonProperty(required = true, value = "features")
  @NotNull @Valid public List<@Valid TranslationHolderData> getFeatures() {
    return features;
  }

  @JsonProperty(required = true, value = "features")
  public void setFeatures(List<@Valid TranslationHolderData> features) {
    this.features = features;
  }

  public ApplicationInputData addFeaturesItem(TranslationHolderData featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }

    this.features.add(featuresItem);
    return this;
  }

  public ApplicationInputData removeFeaturesItem(TranslationHolderData featuresItem) {
    if (featuresItem != null && this.features != null) {
      this.features.remove(featuresItem);
    }

    return this;
  }
  /**
   * URL of the application for direct access to the dashboard with a specific context. (i.e. the first page after context selection) Context selection happens in portal, portal links directly into the application.
   **/
  public ApplicationInputData url(String url) {
    this.url = url;
    return this;
  }

  
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * URL where portal can access a list of all users.
   **/
  public ApplicationInputData endpointUser(String endpointUser) {
    this.endpointUser = endpointUser;
    return this;
  }

  
  @JsonProperty("endpointUser")
  public String getEndpointUser() {
    return endpointUser;
  }

  @JsonProperty("endpointUser")
  public void setEndpointUser(String endpointUser) {
    this.endpointUser = endpointUser;
  }

  /**
   *  URL where portal can GET a list of all organizations.
   **/
  public ApplicationInputData endpointOrganization(String endpointOrganization) {
    this.endpointOrganization = endpointOrganization;
    return this;
  }

  
  @JsonProperty("endpointOrganization")
  public String getEndpointOrganization() {
    return endpointOrganization;
  }

  @JsonProperty("endpointOrganization")
  public void setEndpointOrganization(String endpointOrganization) {
    this.endpointOrganization = endpointOrganization;
  }

  /**
   * URL where portal can POST the organization uuid.
   **/
  public ApplicationInputData endpointOrganizationUUID(String endpointOrganizationUUID) {
    this.endpointOrganizationUUID = endpointOrganizationUUID;
    return this;
  }

  
  @JsonProperty("endpointOrganizationUUID")
  public String getEndpointOrganizationUUID() {
    return endpointOrganizationUUID;
  }

  @JsonProperty("endpointOrganizationUUID")
  public void setEndpointOrganizationUUID(String endpointOrganizationUUID) {
    this.endpointOrganizationUUID = endpointOrganizationUUID;
  }

  /**
   * Enable automatic user retrieval from this application on a schedule.
   **/
  public ApplicationInputData enableUserScheduler(Boolean enableUserScheduler) {
    this.enableUserScheduler = enableUserScheduler;
    return this;
  }

  
  @JsonProperty("enableUserScheduler")
  public Boolean getEnableUserScheduler() {
    return enableUserScheduler;
  }

  @JsonProperty("enableUserScheduler")
  public void setEnableUserScheduler(Boolean enableUserScheduler) {
    this.enableUserScheduler = enableUserScheduler;
  }

  /**
   * Enable automatic organization retrieval from this application on a schedule.
   **/
  public ApplicationInputData enableOrganizationScheduler(Boolean enableOrganizationScheduler) {
    this.enableOrganizationScheduler = enableOrganizationScheduler;
    return this;
  }

  
  @JsonProperty("enableOrganizationScheduler")
  public Boolean getEnableOrganizationScheduler() {
    return enableOrganizationScheduler;
  }

  @JsonProperty("enableOrganizationScheduler")
  public void setEnableOrganizationScheduler(Boolean enableOrganizationScheduler) {
    this.enableOrganizationScheduler = enableOrganizationScheduler;
  }

  /**
   * Icon used in the client for this application in specific display modes. This can be for example the name of a css class for an icon.
   **/
  public ApplicationInputData iconClass(String iconClass) {
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
   * Group of the application. Has to be a valid id of a group.
   **/
  public ApplicationInputData applicationGroupId(Long applicationGroupId) {
    this.applicationGroupId = applicationGroupId;
    return this;
  }

  
  @JsonProperty(required = true, value = "applicationGroupId")
  @NotNull public Long getApplicationGroupId() {
    return applicationGroupId;
  }

  @JsonProperty(required = true, value = "applicationGroupId")
  public void setApplicationGroupId(Long applicationGroupId) {
    this.applicationGroupId = applicationGroupId;
  }

  /**
   * The direct parent application of this application. Applications which have a parent are called a child. Only parent-child is allowed, not grandparent, parent, child or any further ancestry.
   **/
  public ApplicationInputData parentApplicationId(Long parentApplicationId) {
    this.parentApplicationId = parentApplicationId;
    return this;
  }

  
  @JsonProperty("parentApplicationId")
  public Long getParentApplicationId() {
    return parentApplicationId;
  }

  @JsonProperty("parentApplicationId")
  public void setParentApplicationId(Long parentApplicationId) {
    this.parentApplicationId = parentApplicationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationInputData applicationInputData = (ApplicationInputData) o;
    return Objects.equals(this.name, applicationInputData.name) &&
        Objects.equals(this.category, applicationInputData.category) &&
        Objects.equals(this.description, applicationInputData.description) &&
        Objects.equals(this.features, applicationInputData.features) &&
        Objects.equals(this.url, applicationInputData.url) &&
        Objects.equals(this.endpointUser, applicationInputData.endpointUser) &&
        Objects.equals(this.endpointOrganization, applicationInputData.endpointOrganization) &&
        Objects.equals(this.endpointOrganizationUUID, applicationInputData.endpointOrganizationUUID) &&
        Objects.equals(this.enableUserScheduler, applicationInputData.enableUserScheduler) &&
        Objects.equals(this.enableOrganizationScheduler, applicationInputData.enableOrganizationScheduler) &&
        Objects.equals(this.iconClass, applicationInputData.iconClass) &&
        Objects.equals(this.applicationGroupId, applicationInputData.applicationGroupId) &&
        Objects.equals(this.parentApplicationId, applicationInputData.parentApplicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category, description, features, url, endpointUser, endpointOrganization, endpointOrganizationUUID, enableUserScheduler, enableOrganizationScheduler, iconClass, applicationGroupId, parentApplicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationInputData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    endpointUser: ").append(toIndentedString(endpointUser)).append("\n");
    sb.append("    endpointOrganization: ").append(toIndentedString(endpointOrganization)).append("\n");
    sb.append("    endpointOrganizationUUID: ").append(toIndentedString(endpointOrganizationUUID)).append("\n");
    sb.append("    enableUserScheduler: ").append(toIndentedString(enableUserScheduler)).append("\n");
    sb.append("    enableOrganizationScheduler: ").append(toIndentedString(enableOrganizationScheduler)).append("\n");
    sb.append("    iconClass: ").append(toIndentedString(iconClass)).append("\n");
    sb.append("    applicationGroupId: ").append(toIndentedString(applicationGroupId)).append("\n");
    sb.append("    parentApplicationId: ").append(toIndentedString(parentApplicationId)).append("\n");
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

