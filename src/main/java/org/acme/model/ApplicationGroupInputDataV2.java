package org.acme.model;

import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ApplicationGroupInputDataV2")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ApplicationGroupInputDataV2   {
  private TranslationHolderData name;
  private Integer order;
  private Boolean displayOnDashboard = true;

  public ApplicationGroupInputDataV2() {
  }

  @JsonCreator
  public ApplicationGroupInputDataV2(
    @JsonProperty(required = true, value = "name") TranslationHolderData name
  ) {
    this.name = name;
  }

  /**
   * Translated application group name.
   **/
  public ApplicationGroupInputDataV2 name(TranslationHolderData name) {
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
   * Application group order.
   **/
  public ApplicationGroupInputDataV2 order(Integer order) {
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
  public ApplicationGroupInputDataV2 displayOnDashboard(Boolean displayOnDashboard) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationGroupInputDataV2 applicationGroupInputDataV2 = (ApplicationGroupInputDataV2) o;
    return Objects.equals(this.name, applicationGroupInputDataV2.name) &&
        Objects.equals(this.order, applicationGroupInputDataV2.order) &&
        Objects.equals(this.displayOnDashboard, applicationGroupInputDataV2.displayOnDashboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, order, displayOnDashboard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationGroupInputDataV2 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    displayOnDashboard: ").append(toIndentedString(displayOnDashboard)).append("\n");
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

