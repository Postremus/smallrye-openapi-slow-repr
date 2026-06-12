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

@JsonTypeName("TenantApplicationDataV3")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class TenantApplicationDataV3 {

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

    private Boolean active;

    private @Valid List<@Valid TenantApplicationDataV3> applicationOverrides = new ArrayList<>();

    public TenantApplicationDataV3() {
    }

    @JsonCreator
    public TenantApplicationDataV3(
            @JsonProperty(required = true, value = "applicationGroupIds") List<@Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a" + "-fA-F0-9]{4}-[a-fA-F0-9]{12}") UUID> applicationGroupIds,
            @JsonProperty(required = true, value = "productId") UUID productId) {
        this.applicationGroupIds = applicationGroupIds;
        this.productId = productId;
    }

    /**
     * Technical id of this application.
     **/
    public TenantApplicationDataV3 applicationNumber(Long applicationNumber) {
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
    public TenantApplicationDataV3 id(UUID id) {
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
    public TenantApplicationDataV3 name(TranslationHolderData name) {
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
    public TenantApplicationDataV3 category(TranslationHolderData category) {
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
    public TenantApplicationDataV3 description(TranslationHolderData description) {
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
    public TenantApplicationDataV3 features(List<@Valid TranslationHolderData> features) {
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

    public TenantApplicationDataV3 addFeaturesItem(TranslationHolderData featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }

        this.features.add(featuresItem);
        return this;
    }

    public TenantApplicationDataV3 removeFeaturesItem(TranslationHolderData featuresItem) {
        if (featuresItem != null && this.features != null) {
            this.features.remove(featuresItem);
        }

        return this;
    }

    /**
     * URL of the application for direct access to the dashboard with a specific context. (i.e. the first page after context selection) Context
     * selection happens in portal, portal links directly into the application.
     **/
    public TenantApplicationDataV3 url(String url) {
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
    public TenantApplicationDataV3 endpointUser(String endpointUser) {
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
    public TenantApplicationDataV3 endpointOrganization(String endpointOrganization) {
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
    public TenantApplicationDataV3 endpointOrganizationUUID(String endpointOrganizationUUID) {
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
    public TenantApplicationDataV3 enableUserScheduler(Boolean enableUserScheduler) {
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
    public TenantApplicationDataV3 enableOrganizationScheduler(Boolean enableOrganizationScheduler) {
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
    public TenantApplicationDataV3 applicationGroupIds(List<UUID> applicationGroupIds) {
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

    public TenantApplicationDataV3 addApplicationGroupIdsItem(UUID applicationGroupIdsItem) {
        if (this.applicationGroupIds == null) {
            this.applicationGroupIds = new ArrayList<>();
        }

        this.applicationGroupIds.add(applicationGroupIdsItem);
        return this;
    }

    public TenantApplicationDataV3 removeApplicationGroupIdsItem(UUID applicationGroupIdsItem) {
        if (applicationGroupIdsItem != null && this.applicationGroupIds != null) {
            this.applicationGroupIds.remove(applicationGroupIdsItem);
        }

        return this;
    }

    /**
     * The direct parent application of this application. Applications which have a parent are called a child. Only parent -child is allowed, not
     * grandparent, parent, child or any further ancestry.
     **/
    public TenantApplicationDataV3 parentApplicationId(UUID parentApplicationId) {
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
    public TenantApplicationDataV3 productId(UUID productId) {
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
     * True if the tenant has an access grant for this application. False if neither main nor override grants are present. NULL if main grant is
     * missing but override application is granted.
     **/
    public TenantApplicationDataV3 active(Boolean active) {
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

    /**
     * List of application overrides. Depth max &#x3D; 1
     **/
    public TenantApplicationDataV3 applicationOverrides(List<@Valid TenantApplicationDataV3> applicationOverrides) {
        this.applicationOverrides = applicationOverrides;
        return this;
    }

    @JsonProperty("applicationOverrides")
    @Valid
    public List<@Valid TenantApplicationDataV3> getApplicationOverrides() {
        return applicationOverrides;
    }

    @JsonProperty("applicationOverrides")
    public void setApplicationOverrides(List<@Valid TenantApplicationDataV3> applicationOverrides) {
        this.applicationOverrides = applicationOverrides;
    }

    public TenantApplicationDataV3 addApplicationOverridesItem(TenantApplicationDataV3 applicationOverridesItem) {
        if (this.applicationOverrides == null) {
            this.applicationOverrides = new ArrayList<>();
        }

        this.applicationOverrides.add(applicationOverridesItem);
        return this;
    }

    public TenantApplicationDataV3 removeApplicationOverridesItem(TenantApplicationDataV3 applicationOverridesItem) {
        if (applicationOverridesItem != null && this.applicationOverrides != null) {
            this.applicationOverrides.remove(applicationOverridesItem);
        }

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TenantApplicationDataV3 tenantApplicationDataV3 = (TenantApplicationDataV3) o;
        return Objects.equals(this.applicationNumber, tenantApplicationDataV3.applicationNumber) && Objects.equals(this.id,
                tenantApplicationDataV3.id) && Objects.equals(this.name, tenantApplicationDataV3.name) && Objects.equals(this.category,
                tenantApplicationDataV3.category) && Objects.equals(this.description, tenantApplicationDataV3.description) && Objects.equals(
                this.features, tenantApplicationDataV3.features) && Objects.equals(this.url, tenantApplicationDataV3.url) && Objects.equals(
                this.endpointUser, tenantApplicationDataV3.endpointUser) && Objects.equals(this.endpointOrganization,
                tenantApplicationDataV3.endpointOrganization) && Objects.equals(this.endpointOrganizationUUID,
                tenantApplicationDataV3.endpointOrganizationUUID) && Objects.equals(this.enableUserScheduler,
                tenantApplicationDataV3.enableUserScheduler) && Objects.equals(this.enableOrganizationScheduler,
                tenantApplicationDataV3.enableOrganizationScheduler) && Objects.equals(this.applicationGroupIds,
                tenantApplicationDataV3.applicationGroupIds) && Objects.equals(this.parentApplicationId,
                tenantApplicationDataV3.parentApplicationId) && Objects.equals(this.productId, tenantApplicationDataV3.productId) && Objects.equals(
                this.active, tenantApplicationDataV3.active) && Objects.equals(this.applicationOverrides,
                tenantApplicationDataV3.applicationOverrides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationNumber, id, name, category, description, features, url, endpointUser, endpointOrganization,
                endpointOrganizationUUID, enableUserScheduler, enableOrganizationScheduler, applicationGroupIds, parentApplicationId, productId,
                active, applicationOverrides);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantApplicationDataV3 {\n");

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
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    applicationOverrides: ").append(toIndentedString(applicationOverrides)).append("\n");
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
