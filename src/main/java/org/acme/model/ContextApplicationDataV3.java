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

@JsonTypeName("ContextApplicationDataV3")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300" +
        "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ContextApplicationDataV3 {

    private Long applicationNumber;

    private UUID id;

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

    private @Valid List<UUID> applicationGroupIds = new ArrayList<>();

    private UUID parentApplicationId;

    private UUID productId;

    private Boolean favourite;

    private Boolean active;

    public ContextApplicationDataV3() {
    }

    @JsonCreator
    public ContextApplicationDataV3(
            @JsonProperty(required = true, value = "applicationGroupIds") List<@Pattern(regexp =
                    "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a" + "-fA-F0-9]{4}-[a-fA-F0-9]{12}") UUID> applicationGroupIds,
            @JsonProperty(required = true, value = "productId") UUID productId) {
        this.applicationGroupIds = applicationGroupIds;
        this.productId = productId;
    }

    /**
     * Technical id of this application.
     **/
    public ContextApplicationDataV3 applicationNumber(Long applicationNumber) {
        this.applicationNumber = applicationNumber;
        return this;
    }

    @JsonProperty("applicationNumber")
    public Long getApplicationNumber() {
        return applicationNumber;
    }

    @JsonProperty("applicationNumber")
    public void setApplicationNumber(Long applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    /**
     * UUIDv4 which identifies this application in external systems.
     **/
    public ContextApplicationDataV3 id(UUID id) {
        this.id = id;
        return this;
    }

    @JsonProperty("id")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Translated application name.
     **/
    public ContextApplicationDataV3 name(TranslationHolderData name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name")
    @Valid
    public TranslationHolderData getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(TranslationHolderData name) {
        this.name = name;
    }

    /**
     * Translated application category.
     **/
    public ContextApplicationDataV3 category(TranslationHolderData category) {
        this.category = category;
        return this;
    }

    @JsonProperty("category")
    @Valid
    public TranslationHolderData getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(TranslationHolderData category) {
        this.category = category;
    }

    /**
     * Translated application description.
     **/
    public ContextApplicationDataV3 description(TranslationHolderData description) {
        this.description = description;
        return this;
    }

    @JsonProperty("description")
    @Valid
    public TranslationHolderData getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(TranslationHolderData description) {
        this.description = description;
    }

    /**
     * Translated application feature list.
     **/
    public ContextApplicationDataV3 features(List<@Valid TranslationHolderData> features) {
        this.features = features;
        return this;
    }

    @JsonProperty("features")
    @Valid
    public List<@Valid TranslationHolderData> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<@Valid TranslationHolderData> features) {
        this.features = features;
    }

    public ContextApplicationDataV3 addFeaturesItem(TranslationHolderData featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }

        this.features.add(featuresItem);
        return this;
    }

    public ContextApplicationDataV3 removeFeaturesItem(TranslationHolderData featuresItem) {
        if (featuresItem != null && this.features != null) {
            this.features.remove(featuresItem);
        }

        return this;
    }

    /**
     * URL of the application for direct access to the dashboard with a specific context. (i.e. the first page after context selection) Context
     * selection happens in portal, portal links directly into the application.
     **/
    public ContextApplicationDataV3 url(String url) {
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
    public ContextApplicationDataV3 endpointUser(String endpointUser) {
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
    public ContextApplicationDataV3 endpointOrganization(String endpointOrganization) {
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
    public ContextApplicationDataV3 endpointOrganizationUUID(String endpointOrganizationUUID) {
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
    public ContextApplicationDataV3 enableUserScheduler(Boolean enableUserScheduler) {
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
    public ContextApplicationDataV3 enableOrganizationScheduler(Boolean enableOrganizationScheduler) {
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
    public ContextApplicationDataV3 applicationGroupIds(List<UUID> applicationGroupIds) {
        this.applicationGroupIds = applicationGroupIds;
        return this;
    }

    @JsonProperty(required = true, value = "applicationGroupIds")
    @NotNull
    @Size(min = 1)
    public List<@Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}") UUID> getApplicationGroupIds() {
        return applicationGroupIds;
    }

    @JsonProperty(required = true, value = "applicationGroupIds")
    public void setApplicationGroupIds(List<UUID> applicationGroupIds) {
        this.applicationGroupIds = applicationGroupIds;
    }

    public ContextApplicationDataV3 addApplicationGroupIdsItem(UUID applicationGroupIdsItem) {
        if (this.applicationGroupIds == null) {
            this.applicationGroupIds = new ArrayList<>();
        }

        this.applicationGroupIds.add(applicationGroupIdsItem);
        return this;
    }

    public ContextApplicationDataV3 removeApplicationGroupIdsItem(UUID applicationGroupIdsItem) {
        if (applicationGroupIdsItem != null && this.applicationGroupIds != null) {
            this.applicationGroupIds.remove(applicationGroupIdsItem);
        }

        return this;
    }

    /**
     * The direct parent application of this application. Applications which have a parent are called a child. Only parent -child is allowed, not
     * grandparent, parent, child or any further ancestry.
     **/
    public ContextApplicationDataV3 parentApplicationId(UUID parentApplicationId) {
        this.parentApplicationId = parentApplicationId;
        return this;
    }

    @JsonProperty("parentApplicationId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getParentApplicationId() {
        return parentApplicationId;
    }

    @JsonProperty("parentApplicationId")
    public void setParentApplicationId(UUID parentApplicationId) {
        this.parentApplicationId = parentApplicationId;
    }

    /**
     * Product of the application. Has to be a valid id of a product.
     **/
    public ContextApplicationDataV3 productId(UUID productId) {
        this.productId = productId;
        return this;
    }

    @JsonProperty(required = true, value = "productId")
    @NotNull
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getProductId() {
        return productId;
    }

    @JsonProperty(required = true, value = "productId")
    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    /**
     * Did the user mark this application as favourite for the current context?
     **/
    public ContextApplicationDataV3 favourite(Boolean favourite) {
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
    public ContextApplicationDataV3 active(Boolean active) {
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
        ContextApplicationDataV3 contextApplicationDataV3 = (ContextApplicationDataV3) o;
        return Objects.equals(this.applicationNumber, contextApplicationDataV3.applicationNumber) && Objects.equals(this.id,
                contextApplicationDataV3.id) && Objects.equals(this.name, contextApplicationDataV3.name) && Objects.equals(this.category,
                contextApplicationDataV3.category) && Objects.equals(this.description, contextApplicationDataV3.description) && Objects.equals(
                this.features, contextApplicationDataV3.features) && Objects.equals(this.url, contextApplicationDataV3.url) && Objects.equals(
                this.endpointUser, contextApplicationDataV3.endpointUser) && Objects.equals(this.endpointOrganization,
                contextApplicationDataV3.endpointOrganization) && Objects.equals(this.endpointOrganizationUUID,
                contextApplicationDataV3.endpointOrganizationUUID) && Objects.equals(this.enableUserScheduler,
                contextApplicationDataV3.enableUserScheduler) && Objects.equals(this.enableOrganizationScheduler,
                contextApplicationDataV3.enableOrganizationScheduler) && Objects.equals(this.applicationGroupIds,
                contextApplicationDataV3.applicationGroupIds) && Objects.equals(this.parentApplicationId,
                contextApplicationDataV3.parentApplicationId) && Objects.equals(this.productId, contextApplicationDataV3.productId) && Objects.equals(
                this.favourite, contextApplicationDataV3.favourite) && Objects.equals(this.active, contextApplicationDataV3.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationNumber, id, name, category, description, features, url, endpointUser, endpointOrganization,
                endpointOrganizationUUID, enableUserScheduler, enableOrganizationScheduler, applicationGroupIds, parentApplicationId, productId,
                favourite, active);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContextApplicationDataV3 {\n");

        sb.append("    applicationNumber: ").append(toIndentedString(applicationNumber)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
