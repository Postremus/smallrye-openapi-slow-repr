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

@JsonTypeName("ApplicationDataV4")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ApplicationDataV4 {

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

    public ApplicationDataV4() {
    }

    @JsonCreator
    public ApplicationDataV4(
            @JsonProperty(required = true, value = "applicationGroupIds") List<@Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a" + "-fA-F0-9]{4}-[a-fA-F0-9]{12}") UUID> applicationGroupIds,
            @JsonProperty(required = true, value = "productId") UUID productId) {
        this.applicationGroupIds = applicationGroupIds;
        this.productId = productId;
    }

    /**
     * Technical id of this application.
     **/
    public ApplicationDataV4 applicationNumber(Long applicationNumber) {
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
    public ApplicationDataV4 id(UUID id) {
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
    public ApplicationDataV4 name(TranslationHolderData name) {
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
    public ApplicationDataV4 category(TranslationHolderData category) {
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
    public ApplicationDataV4 description(TranslationHolderData description) {
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
    public ApplicationDataV4 features(List<@Valid TranslationHolderData> features) {
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

    public ApplicationDataV4 addFeaturesItem(TranslationHolderData featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }

        this.features.add(featuresItem);
        return this;
    }

    public ApplicationDataV4 removeFeaturesItem(TranslationHolderData featuresItem) {
        if (featuresItem != null && this.features != null) {
            this.features.remove(featuresItem);
        }

        return this;
    }

    /**
     * URL of the application for direct access to the dashboard with a specific context. (i.e. the first page after context selection) Context
     * selection happens in portal, portal links directly into the application.
     **/
    public ApplicationDataV4 url(String url) {
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
    public ApplicationDataV4 endpointUser(String endpointUser) {
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
    public ApplicationDataV4 endpointOrganization(String endpointOrganization) {
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
    public ApplicationDataV4 endpointOrganizationUUID(String endpointOrganizationUUID) {
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
    public ApplicationDataV4 enableUserScheduler(Boolean enableUserScheduler) {
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
    public ApplicationDataV4 enableOrganizationScheduler(Boolean enableOrganizationScheduler) {
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
    public ApplicationDataV4 applicationGroupIds(List<UUID> applicationGroupIds) {
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

    public ApplicationDataV4 addApplicationGroupIdsItem(UUID applicationGroupIdsItem) {
        if (this.applicationGroupIds == null) {
            this.applicationGroupIds = new ArrayList<>();
        }

        this.applicationGroupIds.add(applicationGroupIdsItem);
        return this;
    }

    public ApplicationDataV4 removeApplicationGroupIdsItem(UUID applicationGroupIdsItem) {
        if (applicationGroupIdsItem != null && this.applicationGroupIds != null) {
            this.applicationGroupIds.remove(applicationGroupIdsItem);
        }

        return this;
    }

    /**
     * The direct parent application of this application. Applications which have a parent are called a child. Only parent -child is allowed, not
     * grandparent, parent, child or any further ancestry.
     **/
    public ApplicationDataV4 parentApplicationId(UUID parentApplicationId) {
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
    public ApplicationDataV4 productId(UUID productId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationDataV4 applicationDataV4 = (ApplicationDataV4) o;
        return Objects.equals(this.applicationNumber, applicationDataV4.applicationNumber) && Objects.equals(this.id,
                applicationDataV4.id) && Objects.equals(this.name, applicationDataV4.name) && Objects.equals(this.category,
                applicationDataV4.category) && Objects.equals(this.description, applicationDataV4.description) && Objects.equals(this.features,
                applicationDataV4.features) && Objects.equals(this.url, applicationDataV4.url) && Objects.equals(this.endpointUser,
                applicationDataV4.endpointUser) && Objects.equals(this.endpointOrganization,
                applicationDataV4.endpointOrganization) && Objects.equals(this.endpointOrganizationUUID,
                applicationDataV4.endpointOrganizationUUID) && Objects.equals(this.enableUserScheduler,
                applicationDataV4.enableUserScheduler) && Objects.equals(this.enableOrganizationScheduler,
                applicationDataV4.enableOrganizationScheduler) && Objects.equals(this.applicationGroupIds,
                applicationDataV4.applicationGroupIds) && Objects.equals(this.parentApplicationId,
                applicationDataV4.parentApplicationId) && Objects.equals(this.productId, applicationDataV4.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationNumber, id, name, category, description, features, url, endpointUser, endpointOrganization,
                endpointOrganizationUUID, enableUserScheduler, enableOrganizationScheduler, applicationGroupIds, parentApplicationId, productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationDataV4 {\n");

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
