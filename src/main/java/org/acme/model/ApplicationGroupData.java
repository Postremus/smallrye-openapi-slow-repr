package org.acme.model;

import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ApplicationGroupData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class ApplicationGroupData   {
  private Long id;
  private TranslationHolderData name;
  private Integer order;
  private Boolean displayOnDashboard;

  public ApplicationGroupData() {
  }

  /**
   * Id of the application group.
   **/
  public ApplicationGroupData id(Long id) {
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
  public ApplicationGroupData name(TranslationHolderData name) {
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
  public ApplicationGroupData order(Integer order) {
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
  public ApplicationGroupData displayOnDashboard(Boolean displayOnDashboard) {
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
    ApplicationGroupData applicationGroupData = (ApplicationGroupData) o;
    return Objects.equals(this.id, applicationGroupData.id) &&
        Objects.equals(this.name, applicationGroupData.name) &&
        Objects.equals(this.order, applicationGroupData.order) &&
        Objects.equals(this.displayOnDashboard, applicationGroupData.displayOnDashboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, displayOnDashboard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationGroupData {\n");
    
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

