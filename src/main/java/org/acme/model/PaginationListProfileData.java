package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.acme.model.PaginationListMetaData;
import org.acme.model.ProfileData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PaginationListProfileData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class PaginationListProfileData   {
  private PaginationListMetaData meta;
  private @Valid List<@Valid ProfileData> items = new ArrayList<>();

  public PaginationListProfileData() {
  }

  /**
   **/
  public PaginationListProfileData meta(PaginationListMetaData meta) {
    this.meta = meta;
    return this;
  }

  
  @JsonProperty("meta")
  @Valid public PaginationListMetaData getMeta() {
    return meta;
  }

  @JsonProperty("meta")
  public void setMeta(PaginationListMetaData meta) {
    this.meta = meta;
  }

  /**
   * List of items of the PaginationList
   **/
  public PaginationListProfileData items(List<@Valid ProfileData> items) {
    this.items = items;
    return this;
  }

  
  @JsonProperty("items")
  @Valid public List<@Valid ProfileData> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid ProfileData> items) {
    this.items = items;
  }

  public PaginationListProfileData addItemsItem(ProfileData itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public PaginationListProfileData removeItemsItem(ProfileData itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
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
    PaginationListProfileData paginationListProfileData = (PaginationListProfileData) o;
    return Objects.equals(this.meta, paginationListProfileData.meta) &&
        Objects.equals(this.items, paginationListProfileData.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationListProfileData {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

