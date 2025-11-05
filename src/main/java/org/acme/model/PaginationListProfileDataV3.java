package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.acme.model.PaginationListMetaData;
import org.acme.model.ProfileDataV3;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PaginationListProfileDataV3")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class PaginationListProfileDataV3   {
  private PaginationListMetaData meta;
  private @Valid List<@Valid ProfileDataV3> items = new ArrayList<>();

  public PaginationListProfileDataV3() {
  }

  /**
   **/
  public PaginationListProfileDataV3 meta(PaginationListMetaData meta) {
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
  public PaginationListProfileDataV3 items(List<@Valid ProfileDataV3> items) {
    this.items = items;
    return this;
  }

  
  @JsonProperty("items")
  @Valid public List<@Valid ProfileDataV3> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid ProfileDataV3> items) {
    this.items = items;
  }

  public PaginationListProfileDataV3 addItemsItem(ProfileDataV3 itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public PaginationListProfileDataV3 removeItemsItem(ProfileDataV3 itemsItem) {
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
    PaginationListProfileDataV3 paginationListProfileDataV3 = (PaginationListProfileDataV3) o;
    return Objects.equals(this.meta, paginationListProfileDataV3.meta) &&
        Objects.equals(this.items, paginationListProfileDataV3.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationListProfileDataV3 {\n");
    
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

