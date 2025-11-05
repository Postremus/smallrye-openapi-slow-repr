package org.acme.model;

import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ApplicationGroupDataV2")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ApplicationGroupDataV2   {
  private Long id;
  private TranslationHolderData name;
  private Integer order;
  private Boolean displayOnDashboard;

  public ApplicationGroupDataV2() {
  }

  /**
   * Id of the application group.
   **/
  public ApplicationGroupDataV2 id(Long id) {
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
   * Translated application group name.
   **/
  public ApplicationGroupDataV2 name(TranslationHolderData name) {
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
   * Order number of application group.
   **/
  public ApplicationGroupDataV2 order(Integer order) {
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
  public ApplicationGroupDataV2 displayOnDashboard(Boolean displayOnDashboard) {
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
    ApplicationGroupDataV2 applicationGroupDataV2 = (ApplicationGroupDataV2) o;
    return Objects.equals(this.id, applicationGroupDataV2.id) &&
        Objects.equals(this.name, applicationGroupDataV2.name) &&
        Objects.equals(this.order, applicationGroupDataV2.order) &&
        Objects.equals(this.displayOnDashboard, applicationGroupDataV2.displayOnDashboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, displayOnDashboard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationGroupDataV2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

