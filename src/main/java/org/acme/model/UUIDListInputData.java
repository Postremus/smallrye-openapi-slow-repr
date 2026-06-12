package org.acme.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("UUIDListInputData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class UUIDListInputData {

    private @Valid Set<UUID> ids = new LinkedHashSet<>();

    public UUIDListInputData() {
    }

    /**
     **/
    public UUIDListInputData ids(Set<UUID> ids) {
        this.ids = ids;
        return this;
    }

    @JsonProperty("ids")
    public Set<@Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}") UUID> getIds() {
        return ids;
    }

    @JsonProperty("ids")
    @JsonDeserialize(as = LinkedHashSet.class)
    public void setIds(Set<UUID> ids) {
        this.ids = ids;
    }

    public UUIDListInputData addIdsItem(UUID idsItem) {
        if (this.ids == null) {
            this.ids = new LinkedHashSet<>();
        }

        this.ids.add(idsItem);
        return this;
    }

    public UUIDListInputData removeIdsItem(UUID idsItem) {
        if (idsItem != null && this.ids != null) {
            this.ids.remove(idsItem);
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
        UUIDListInputData uuIDListInputData = (UUIDListInputData) o;
        return Objects.equals(this.ids, uuIDListInputData.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UUIDListInputData {\n");

        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
