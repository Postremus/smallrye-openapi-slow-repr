package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.acme.model.DesignCategoryData;
import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DesignProfileInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class DesignProfileInputData   {
  private UUID tenantId;
  private String name;
  private TranslationHolderData noticeUrl;
  private TranslationHolderData privacyPolicyUrl;
  private Boolean active;
  private @Valid List<@Valid DesignCategoryData> categories = new ArrayList<>();

  public DesignProfileInputData() {
  }

  @JsonCreator
  public DesignProfileInputData(
    @JsonProperty(required = true, value = "tenantId") UUID tenantId,
    @JsonProperty(required = true, value = "name") String name
  ) {
    this.tenantId = tenantId;
    this.name = name;
  }

  /**
   **/
  public DesignProfileInputData tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  
  @JsonProperty(required = true, value = "tenantId")
  @NotNull  @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getTenantId() {
    return tenantId;
  }

  @JsonProperty(required = true, value = "tenantId")
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  /**
   * Name of the design profile.
   **/
  public DesignProfileInputData name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty(required = true, value = "name")
  @NotNull  @Pattern(regexp="\\S")public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * TranslationHolder to store the notice Urls - default language is mandatory.
   **/
  public DesignProfileInputData noticeUrl(TranslationHolderData noticeUrl) {
    this.noticeUrl = noticeUrl;
    return this;
  }

  
  @JsonProperty("noticeUrl")
  @Valid public TranslationHolderData getNoticeUrl() {
    return noticeUrl;
  }

  @JsonProperty("noticeUrl")
  public void setNoticeUrl(TranslationHolderData noticeUrl) {
    this.noticeUrl = noticeUrl;
  }

  /**
   * TranslationHolder to store the privacy policy Urls - default language is mandatory.
   **/
  public DesignProfileInputData privacyPolicyUrl(TranslationHolderData privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

  
  @JsonProperty("privacyPolicyUrl")
  @Valid public TranslationHolderData getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  @JsonProperty("privacyPolicyUrl")
  public void setPrivacyPolicyUrl(TranslationHolderData privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }

  /**
   * Design profile activity flag.
   **/
  public DesignProfileInputData active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  @JsonProperty("active")
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * The categories.
   **/
  public DesignProfileInputData categories(List<@Valid DesignCategoryData> categories) {
    this.categories = categories;
    return this;
  }

  
  @JsonProperty("categories")
  @Valid public List<@Valid DesignCategoryData> getCategories() {
    return categories;
  }

  @JsonProperty("categories")
  public void setCategories(List<@Valid DesignCategoryData> categories) {
    this.categories = categories;
  }

  public DesignProfileInputData addCategoriesItem(DesignCategoryData categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }

    this.categories.add(categoriesItem);
    return this;
  }

  public DesignProfileInputData removeCategoriesItem(DesignCategoryData categoriesItem) {
    if (categoriesItem != null && this.categories != null) {
      this.categories.remove(categoriesItem);
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
    DesignProfileInputData designProfileInputData = (DesignProfileInputData) o;
    return Objects.equals(this.tenantId, designProfileInputData.tenantId) &&
        Objects.equals(this.name, designProfileInputData.name) &&
        Objects.equals(this.noticeUrl, designProfileInputData.noticeUrl) &&
        Objects.equals(this.privacyPolicyUrl, designProfileInputData.privacyPolicyUrl) &&
        Objects.equals(this.active, designProfileInputData.active) &&
        Objects.equals(this.categories, designProfileInputData.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, name, noticeUrl, privacyPolicyUrl, active, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignProfileInputData {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    noticeUrl: ").append(toIndentedString(noticeUrl)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

