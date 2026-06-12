package org.acme.model;

import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("PaginationListMetaData")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300" +
        "+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
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
   * Current page number. First page is 1. If no items are found, this value is 0. Never negative.
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
   * Total number of pages available. If no items are found, this value is 0. Never negative. Can be calculated using the formula: &#x60;
   * (totalCount / pageSize) + ((totalCount % pageSize) &gt; 0 ? 1 : 0&#x60;
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
   * Number of items per page. If no items are found, this value is 0. Never negative. Will either: * Match the amount of items on the page if the
   * requested page contains enough elements * or be 0 if the requested page contains no elements.  The client can indicate with the &#39;
   * pageSize&#39; parameter the upper bound (inclusive) for the requested pageSize.
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
   * Total number of items available over all pages. If no items are found, this value is 0. Never negative.
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
   * Used sort attribute. The client can indicate the requested sort order using the &#39;sortAttribute&#39; parameter.
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
   * Indicates if the sorting of the result is ascending (true) or descending (false).
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

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * Creates the property if it does not already exist, otherwise replaces it.
     * @param key the name of the property
     * @param value the value of the property
     * @return self reference
     */
    @JsonAnySetter
    public PaginationListMetaData putAdditionalProperty(String key, Object value) {
        return this;
    }

    /**
     * Return the additional (undeclared) properties.
     * @return the additional (undeclared) properties
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return null;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     * @param key the name of the property
     * @return the additional (undeclared) property with the specified name
     */
    public Object getAdditionalProperty(String key) {
        return null;
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
      return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
