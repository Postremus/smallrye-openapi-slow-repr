package org.acme.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("IDLongListInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class IDLongListInputData   {
  private @Valid Set<Long> ids = new LinkedHashSet<>();

  public IDLongListInputData() {
  }

  /**
   **/
  public IDLongListInputData ids(Set<Long> ids) {
    this.ids = ids;
    return this;
  }

  
  @JsonProperty("ids")
  public Set<Long> getIds() {
    return ids;
  }

  @JsonProperty("ids")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setIds(Set<Long> ids) {
    this.ids = ids;
  }

  public IDLongListInputData addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new LinkedHashSet<>();
    }

    this.ids.add(idsItem);
    return this;
  }

  public IDLongListInputData removeIdsItem(Long idsItem) {
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
    IDLongListInputData idLongListInputData = (IDLongListInputData) o;
    return Objects.equals(this.ids, idLongListInputData.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IDLongListInputData {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

