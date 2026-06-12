package org.acme.model;

import org.acme.model.TranslationHolderData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ApplicationGroupInputDataV3")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ApplicationGroupInputDataV3 {

    private TranslationHolderData name;

    private Integer order;

    private Boolean displayOnDashboard = true;

    private Boolean displayOnSidebar = false;

    private String icon;

    public ApplicationGroupInputDataV3() {
    }

    @JsonCreator
    public ApplicationGroupInputDataV3(@JsonProperty(required = true, value = "name") TranslationHolderData name) {
        this.name = name;
    }

    /**
     * Translated application group name.
     **/
    public ApplicationGroupInputDataV3 name(TranslationHolderData name) {
        this.name = name;
        return this;
    }

    @JsonProperty(required = true, value = "name")
    @NotNull
    @Valid
    public TranslationHolderData getName() {
        return name;
    }

    @JsonProperty(required = true, value = "name")
    public void setName(TranslationHolderData name) {
        this.name = name;
    }

    /**
     * Application group order.
     **/
    public ApplicationGroupInputDataV3 order(Integer order) {
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
    public ApplicationGroupInputDataV3 displayOnDashboard(Boolean displayOnDashboard) {
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
    public ApplicationGroupInputDataV3 displayOnSidebar(Boolean displayOnSidebar) {
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
     * Icon CSS class (e.g. &#39;fa-regular fa-folder&#39;).
     **/
    public ApplicationGroupInputDataV3 icon(String icon) {
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
        ApplicationGroupInputDataV3 applicationGroupInputDataV3 = (ApplicationGroupInputDataV3) o;
        return Objects.equals(this.name, applicationGroupInputDataV3.name) && Objects.equals(this.order,
                applicationGroupInputDataV3.order) && Objects.equals(this.displayOnDashboard,
                applicationGroupInputDataV3.displayOnDashboard) && Objects.equals(this.displayOnSidebar,
                applicationGroupInputDataV3.displayOnSidebar) && Objects.equals(this.icon, applicationGroupInputDataV3.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, order, displayOnDashboard, displayOnSidebar, icon);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationGroupInputDataV3 {\n");

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
