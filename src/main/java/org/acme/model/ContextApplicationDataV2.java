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



@JsonTypeName("ContextApplicationDataV2")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ContextApplicationDataV2   {
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
  private @Valid List<Long> applicationGroupIds = new ArrayList<>();
  private Long parentApplicationId;
  private Boolean favourite;
  private Boolean active;

  public ContextApplicationDataV2() {
  }

  @JsonCreator
  public ContextApplicationDataV2(
    @JsonProperty(required = true, value = "applicationGroupIds") List<Long> applicationGroupIds
  ) {
    this.applicationGroupIds = applicationGroupIds;
  }

  /**
   * Technical id of this application.
   **/
  public ContextApplicationDataV2 id(Long id) {
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
  public ContextApplicationDataV2 uuid(UUID uuid) {
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
  public ContextApplicationDataV2 name(TranslationHolderData name) {
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
  public ContextApplicationDataV2 category(TranslationHolderData category) {
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
  public ContextApplicationDataV2 description(TranslationHolderData description) {
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
  public ContextApplicationDataV2 features(List<@Valid TranslationHolderData> features) {
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

  public ContextApplicationDataV2 addFeaturesItem(TranslationHolderData featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }

    this.features.add(featuresItem);
    return this;
  }

  public ContextApplicationDataV2 removeFeaturesItem(TranslationHolderData featuresItem) {
    if (featuresItem != null && this.features != null) {
      this.features.remove(featuresItem);
    }

    return this;
  }
  /**
   * URL of the application for direct access to the dashboard with a specific context. (i.e. the first page after context selection) Context selection happens in portal, portal links directly into the application.
   **/
  public ContextApplicationDataV2 url(String url) {
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
  public ContextApplicationDataV2 endpointUser(String endpointUser) {
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
  public ContextApplicationDataV2 endpointOrganization(String endpointOrganization) {
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
  public ContextApplicationDataV2 endpointOrganizationUUID(String endpointOrganizationUUID) {
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
  public ContextApplicationDataV2 enableUserScheduler(Boolean enableUserScheduler) {
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
  public ContextApplicationDataV2 enableOrganizationScheduler(Boolean enableOrganizationScheduler) {
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
   * Groups of the application. Has to be a valid id of a group.
   **/
  public ContextApplicationDataV2 applicationGroupIds(List<Long> applicationGroupIds) {
    this.applicationGroupIds = applicationGroupIds;
    return this;
  }

  
  @JsonProperty(required = true, value = "applicationGroupIds")
  @NotNull  @Size(min=1)public List<Long> getApplicationGroupIds() {
    return applicationGroupIds;
  }

  @JsonProperty(required = true, value = "applicationGroupIds")
  public void setApplicationGroupIds(List<Long> applicationGroupIds) {
    this.applicationGroupIds = applicationGroupIds;
  }

  public ContextApplicationDataV2 addApplicationGroupIdsItem(Long applicationGroupIdsItem) {
    if (this.applicationGroupIds == null) {
      this.applicationGroupIds = new ArrayList<>();
    }

    this.applicationGroupIds.add(applicationGroupIdsItem);
    return this;
  }

  public ContextApplicationDataV2 removeApplicationGroupIdsItem(Long applicationGroupIdsItem) {
    if (applicationGroupIdsItem != null && this.applicationGroupIds != null) {
      this.applicationGroupIds.remove(applicationGroupIdsItem);
    }

    return this;
  }
  /**
   * The direct parent application of this application. Applications which have a parent are called a child. Only parent -child is allowed, not grandparent, parent, child or any further ancestry.
   **/
  public ContextApplicationDataV2 parentApplicationId(Long parentApplicationId) {
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
   * Did the user mark this application as favourite for the current context?
   **/
  public ContextApplicationDataV2 favourite(Boolean favourite) {
    this.favourite = favourite;
    return this;
  }

  
  @JsonProperty("favourite")
  public Boolean getFavourite() {
    return favourite;
  }

  @JsonProperty("favourite")
  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }

  /**
   * True if the contexts organization has an access grant for this application.
   **/
  public ContextApplicationDataV2 active(Boolean active) {
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
    ContextApplicationDataV2 contextApplicationDataV2 = (ContextApplicationDataV2) o;
    return Objects.equals(this.id, contextApplicationDataV2.id) &&
        Objects.equals(this.uuid, contextApplicationDataV2.uuid) &&
        Objects.equals(this.name, contextApplicationDataV2.name) &&
        Objects.equals(this.category, contextApplicationDataV2.category) &&
        Objects.equals(this.description, contextApplicationDataV2.description) &&
        Objects.equals(this.features, contextApplicationDataV2.features) &&
        Objects.equals(this.url, contextApplicationDataV2.url) &&
        Objects.equals(this.endpointUser, contextApplicationDataV2.endpointUser) &&
        Objects.equals(this.endpointOrganization, contextApplicationDataV2.endpointOrganization) &&
        Objects.equals(this.endpointOrganizationUUID, contextApplicationDataV2.endpointOrganizationUUID) &&
        Objects.equals(this.enableUserScheduler, contextApplicationDataV2.enableUserScheduler) &&
        Objects.equals(this.enableOrganizationScheduler, contextApplicationDataV2.enableOrganizationScheduler) &&
        Objects.equals(this.applicationGroupIds, contextApplicationDataV2.applicationGroupIds) &&
        Objects.equals(this.parentApplicationId, contextApplicationDataV2.parentApplicationId) &&
        Objects.equals(this.favourite, contextApplicationDataV2.favourite) &&
        Objects.equals(this.active, contextApplicationDataV2.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, name, category, description, features, url, endpointUser, endpointOrganization, endpointOrganizationUUID, enableUserScheduler, enableOrganizationScheduler, applicationGroupIds, parentApplicationId, favourite, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextApplicationDataV2 {\n");
    
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
    sb.append("    applicationGroupIds: ").append(toIndentedString(applicationGroupIds)).append("\n");
    sb.append("    parentApplicationId: ").append(toIndentedString(parentApplicationId)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
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

