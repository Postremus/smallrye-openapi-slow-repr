package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.acme.model.ApplicationDataV3;
import org.acme.model.PaginationListMetaData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PaginationListApplicationDataV3")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class PaginationListApplicationDataV3   {
  private PaginationListMetaData meta;
  private @Valid List<@Valid ApplicationDataV3> items = new ArrayList<>();

  public PaginationListApplicationDataV3() {
  }

  /**
   **/
  public PaginationListApplicationDataV3 meta(PaginationListMetaData meta) {
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
  public PaginationListApplicationDataV3 items(List<@Valid ApplicationDataV3> items) {
    this.items = items;
    return this;
  }

  
  @JsonProperty("items")
  @Valid public List<@Valid ApplicationDataV3> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid ApplicationDataV3> items) {
    this.items = items;
  }

  public PaginationListApplicationDataV3 addItemsItem(ApplicationDataV3 itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public PaginationListApplicationDataV3 removeItemsItem(ApplicationDataV3 itemsItem) {
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
    PaginationListApplicationDataV3 paginationListApplicationDataV3 = (PaginationListApplicationDataV3) o;
    return Objects.equals(this.meta, paginationListApplicationDataV3.meta) &&
        Objects.equals(this.items, paginationListApplicationDataV3.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationListApplicationDataV3 {\n");
    
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

