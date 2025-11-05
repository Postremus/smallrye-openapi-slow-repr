package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PaginationListMetaData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class PaginationListMetaData   {
  private Integer currentPage;
  private Integer pageCount;
  private Integer pageSize;
  private Long totalCount;
  private String sortAttribute;
  private Boolean sortAscending;

  public PaginationListMetaData() {
  }

  /**
   **/
  public PaginationListMetaData currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }

  @JsonProperty("currentPage")
  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  /**
   **/
  public PaginationListMetaData pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }

  @JsonProperty("pageCount")
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  /**
   **/
  public PaginationListMetaData pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  @JsonProperty("pageSize")
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   **/
  public PaginationListMetaData totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }

  @JsonProperty("totalCount")
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  /**
   **/
  public PaginationListMetaData sortAttribute(String sortAttribute) {
    this.sortAttribute = sortAttribute;
    return this;
  }

  
  @JsonProperty("sortAttribute")
  public String getSortAttribute() {
    return sortAttribute;
  }

  @JsonProperty("sortAttribute")
  public void setSortAttribute(String sortAttribute) {
    this.sortAttribute = sortAttribute;
  }

  /**
   **/
  public PaginationListMetaData sortAscending(Boolean sortAscending) {
    this.sortAscending = sortAscending;
    return this;
  }

  
  @JsonProperty("sortAscending")
  public Boolean getSortAscending() {
    return sortAscending;
  }

  @JsonProperty("sortAscending")
  public void setSortAscending(Boolean sortAscending) {
    this.sortAscending = sortAscending;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationListMetaData paginationListMetaData = (PaginationListMetaData) o;
    return Objects.equals(this.currentPage, paginationListMetaData.currentPage) &&
        Objects.equals(this.pageCount, paginationListMetaData.pageCount) &&
        Objects.equals(this.pageSize, paginationListMetaData.pageSize) &&
        Objects.equals(this.totalCount, paginationListMetaData.totalCount) &&
        Objects.equals(this.sortAttribute, paginationListMetaData.sortAttribute) &&
        Objects.equals(this.sortAscending, paginationListMetaData.sortAscending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, pageCount, pageSize, totalCount, sortAttribute, sortAscending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationListMetaData {\n");
    
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    sortAttribute: ").append(toIndentedString(sortAttribute)).append("\n");
    sb.append("    sortAscending: ").append(toIndentedString(sortAscending)).append("\n");
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

