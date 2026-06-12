package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.acme.model.PaginationListMetaData;
import org.acme.model.ProfileGroupDataV2;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("PaginationListProfileGroupDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class PaginationListProfileGroupDataV2 {

    private PaginationListMetaData meta;

    private @Valid List<@Valid ProfileGroupDataV2> items = new ArrayList<>();

    public PaginationListProfileGroupDataV2() {
    }

    /**
     **/
    public PaginationListProfileGroupDataV2 meta(PaginationListMetaData meta) {
        this.meta = meta;
        return this;
    }

    @JsonProperty("meta")
    @Valid
    public PaginationListMetaData getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(PaginationListMetaData meta) {
        this.meta = meta;
    }

    /**
     * List of items of the PaginationList. May be null if no items are available.
     **/
    public PaginationListProfileGroupDataV2 items(List<@Valid ProfileGroupDataV2> items) {
        this.items = items;
        return this;
    }

    @JsonProperty("items")
    @Valid
    public List<@Valid ProfileGroupDataV2> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<@Valid ProfileGroupDataV2> items) {
        this.items = items;
    }

    public PaginationListProfileGroupDataV2 addItemsItem(ProfileGroupDataV2 itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }

        this.items.add(itemsItem);
        return this;
    }

    public PaginationListProfileGroupDataV2 removeItemsItem(ProfileGroupDataV2 itemsItem) {
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
        PaginationListProfileGroupDataV2 paginationListProfileGroupDataV2 = (PaginationListProfileGroupDataV2) o;
        return Objects.equals(this.meta, paginationListProfileGroupDataV2.meta) && Objects.equals(this.items, paginationListProfileGroupDataV2.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meta, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaginationListProfileGroupDataV2 {\n");

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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
