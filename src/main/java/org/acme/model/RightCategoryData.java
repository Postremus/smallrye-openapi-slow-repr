package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.acme.model.RightData;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RightCategoryData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class RightCategoryData   {
  private Long id;
  private TranslationHolderData name;
  private @Valid List<@Valid RightData> rights = new ArrayList<>();

  public RightCategoryData() {
  }

  /**
   * Id of the right category.
   **/
  public RightCategoryData id(Long id) {
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
   * Translated category name.
   **/
  public RightCategoryData name(TranslationHolderData name) {
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
   **/
  public RightCategoryData rights(List<@Valid RightData> rights) {
    this.rights = rights;
    return this;
  }

  
  @JsonProperty("rights")
  @Valid public List<@Valid RightData> getRights() {
    return rights;
  }

  @JsonProperty("rights")
  public void setRights(List<@Valid RightData> rights) {
    this.rights = rights;
  }

  public RightCategoryData addRightsItem(RightData rightsItem) {
    if (this.rights == null) {
      this.rights = new ArrayList<>();
    }

    this.rights.add(rightsItem);
    return this;
  }

  public RightCategoryData removeRightsItem(RightData rightsItem) {
    if (rightsItem != null && this.rights != null) {
      this.rights.remove(rightsItem);
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
    RightCategoryData rightCategoryData = (RightCategoryData) o;
    return Objects.equals(this.id, rightCategoryData.id) &&
        Objects.equals(this.name, rightCategoryData.name) &&
        Objects.equals(this.rights, rightCategoryData.rights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, rights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RightCategoryData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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

