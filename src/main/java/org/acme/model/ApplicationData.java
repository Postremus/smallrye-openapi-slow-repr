package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ApplicationData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ApplicationData   {
  private Long id;
  private UUID uuid;
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
  private String image;

  public ApplicationData() {
  }

  /**
   * Technical id of this application.
   **/
  public ApplicationData id(Long id) {
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
  public ApplicationData uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @JsonProperty("uuid")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getUuid() {
    return uuid;
  }

  @JsonProperty("uuid")
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
   * Translated application name.
   **/
  public ApplicationData name(TranslationHolderData name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  @Valid public TranslationHolderData getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(TranslationHolderData name) {
    this.name = name;
  }

  /**
   * Translated application category.
   **/
  public ApplicationData category(TranslationHolderData category) {
    this.category = category;
    return this;
  }

  
  @JsonProperty("category")
  @Valid public TranslationHolderData getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(TranslationHolderData category) {
    this.category = category;
  }

  /**
   * Translated application description.
   **/
  public ApplicationData description(TranslationHolderData description) {
    this.description = description;
    return this;
  }

  
  @JsonProperty("description")
  @Valid public TranslationHolderData getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(TranslationHolderData description) {
    this.description = description;
  }

  /**
   * Translated application feature list.
   **/
  public ApplicationData features(List<@Valid TranslationHolderData> features) {
    this.features = features;
    return this;
  }

  
  @JsonProperty("features")
  @Valid public List<@Valid TranslationHolderData> getFeatures() {
    return features;
  }

  @JsonProperty("features")
  public void setFeatures(List<@Valid TranslationHolderData> features) {
    this.features = features;
  }

  public ApplicationData addFeaturesItem(TranslationHolderData featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }

    this.features.add(featuresItem);
    return this;
  }

  public ApplicationData removeFeaturesItem(TranslationHolderData featuresItem) {
    if (featuresItem != null && this.features != null) {
      this.features.remove(featuresItem);
    }

    return this;
  }
  /**
   * URL of the application for direct access to the dashboard with a specific context. (i.e. the first page after context selection) Context selection happens in portal, portal links directly into the application.
   **/
  public ApplicationData url(String url) {
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
  public ApplicationData endpointUser(String endpointUser) {
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
  public ApplicationData endpointOrganization(String endpointOrganization) {
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
  public ApplicationData endpointOrganizationUUID(String endpointOrganizationUUID) {
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
  public ApplicationData enableUserScheduler(Boolean enableUserScheduler) {
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
  public ApplicationData enableOrganizationScheduler(Boolean enableOrganizationScheduler) {
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
  public ApplicationData iconClass(String iconClass) {
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
   * First group of the application. Has to be a valid id of a group. Deprecated since 4.1, use applicationGroupIds instead.
   **/
  public ApplicationData applicationGroupId(Long applicationGroupId) {
    this.applicationGroupId = applicationGroupId;
    return this;
  }

  
  @JsonProperty("applicationGroupId")
  public Long getApplicationGroupId() {
    return applicationGroupId;
  }

  @JsonProperty("applicationGroupId")
  public void setApplicationGroupId(Long applicationGroupId) {
    this.applicationGroupId = applicationGroupId;
  }

  /**
   * The direct parent application of this application. Applications which have a parent are called a child. Only parent-child is allowed, not grandparent, parent, child or any further ancestry.
   **/
  public ApplicationData parentApplicationId(Long parentApplicationId) {
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

  /**
   * Image of this application, used in portal as header when displaying a list of applications. This is a base64 encoded byte array.
   **/
  public ApplicationData image(String image) {
    this.image = image;
    return this;
  }

  
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  @JsonProperty("image")
  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationData applicationData = (ApplicationData) o;
    return Objects.equals(this.id, applicationData.id) &&
        Objects.equals(this.uuid, applicationData.uuid) &&
        Objects.equals(this.name, applicationData.name) &&
        Objects.equals(this.category, applicationData.category) &&
        Objects.equals(this.description, applicationData.description) &&
        Objects.equals(this.features, applicationData.features) &&
        Objects.equals(this.url, applicationData.url) &&
        Objects.equals(this.endpointUser, applicationData.endpointUser) &&
        Objects.equals(this.endpointOrganization, applicationData.endpointOrganization) &&
        Objects.equals(this.endpointOrganizationUUID, applicationData.endpointOrganizationUUID) &&
        Objects.equals(this.enableUserScheduler, applicationData.enableUserScheduler) &&
        Objects.equals(this.enableOrganizationScheduler, applicationData.enableOrganizationScheduler) &&
        Objects.equals(this.iconClass, applicationData.iconClass) &&
        Objects.equals(this.applicationGroupId, applicationData.applicationGroupId) &&
        Objects.equals(this.parentApplicationId, applicationData.parentApplicationId) &&
        Objects.equals(this.image, applicationData.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, name, category, description, features, url, endpointUser, endpointOrganization, endpointOrganizationUUID, enableUserScheduler, enableOrganizationScheduler, iconClass, applicationGroupId, parentApplicationId, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

