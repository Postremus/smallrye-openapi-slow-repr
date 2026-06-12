package org.acme.model;

import java.util.UUID;

import org.acme.model.TranslationHolderData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ApplicationGroupDataV3")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ApplicationGroupDataV3 {

    private UUID id;

    private TranslationHolderData name;

    private Integer order;

    private Boolean displayOnDashboard;

    private Boolean displayOnSidebar;

    private String icon;

    public ApplicationGroupDataV3() {
    }

    /**
     * Id of the application group.
     **/
    public ApplicationGroupDataV3 id(UUID id) {
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
     * Translated application group name.
     **/
    public ApplicationGroupDataV3 name(TranslationHolderData name) {
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
     * Order number of application group.
     **/
    public ApplicationGroupDataV3 order(Integer order) {
        this.order = order;
        return this;
    }

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * Decides if applications of this application group should be displayed on the dashboard.
     **/
    public ApplicationGroupDataV3 displayOnDashboard(Boolean displayOnDashboard) {
        this.displayOnDashboard = displayOnDashboard;
        return this;
    }

    @JsonProperty("displayOnDashboard")
    public Boolean getDisplayOnDashboard() {
        return displayOnDashboard;
    }

    @JsonProperty("displayOnDashboard")
    public void setDisplayOnDashboard(Boolean displayOnDashboard) {
        this.displayOnDashboard = displayOnDashboard;
    }

    /**
     * Decides if this application group should be displayed as a link in the sidebar.
     **/
    public ApplicationGroupDataV3 displayOnSidebar(Boolean displayOnSidebar) {
        this.displayOnSidebar = displayOnSidebar;
        return this;
    }

    @JsonProperty("displayOnSidebar")
    public Boolean getDisplayOnSidebar() {
        return displayOnSidebar;
    }

    @JsonProperty("displayOnSidebar")
    public void setDisplayOnSidebar(Boolean displayOnSidebar) {
        this.displayOnSidebar = displayOnSidebar;
    }

    /**
     * Icon CSS class for sidebar display (e.g. &#39;fa-regular fa-folder&#39;).
     **/
    public ApplicationGroupDataV3 icon(String icon) {
        this.icon = icon;
        return this;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationGroupDataV3 applicationGroupDataV3 = (ApplicationGroupDataV3) o;
        return Objects.equals(this.id, applicationGroupDataV3.id) && Objects.equals(this.name, applicationGroupDataV3.name) && Objects.equals(
                this.order, applicationGroupDataV3.order) && Objects.equals(this.displayOnDashboard,
                applicationGroupDataV3.displayOnDashboard) && Objects.equals(this.displayOnSidebar,
                applicationGroupDataV3.displayOnSidebar) && Objects.equals(this.icon, applicationGroupDataV3.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, order, displayOnDashboard, displayOnSidebar, icon);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationGroupDataV3 {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    displayOnDashboard: ").append(toIndentedString(displayOnDashboard)).append("\n");
        sb.append("    displayOnSidebar: ").append(toIndentedString(displayOnSidebar)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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
