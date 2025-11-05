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



@JsonTypeName("DesignProfileData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class DesignProfileData   {
  private UUID id;
  private UUID tenantId;
  private String name;
  private TranslationHolderData noticeUrl;
  private TranslationHolderData privacyPolicyUrl;
  private Boolean active;
  private @Valid List<@Valid DesignCategoryData> categories = new ArrayList<>();
  private Boolean deletable;

  public DesignProfileData() {
  }

  /**
   **/
  public DesignProfileData id(UUID id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public DesignProfileData tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  
  @JsonProperty("tenantId")
   @Pattern(regexp="[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")public UUID getTenantId() {
    return tenantId;
  }

  @JsonProperty("tenantId")
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  /**
   **/
  public DesignProfileData name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public DesignProfileData noticeUrl(TranslationHolderData noticeUrl) {
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
   **/
  public DesignProfileData privacyPolicyUrl(TranslationHolderData privacyPolicyUrl) {
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
   **/
  public DesignProfileData active(Boolean active) {
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
   **/
  public DesignProfileData categories(List<@Valid DesignCategoryData> categories) {
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

  public DesignProfileData addCategoriesItem(DesignCategoryData categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }

    this.categories.add(categoriesItem);
    return this;
  }

  public DesignProfileData removeCategoriesItem(DesignCategoryData categoriesItem) {
    if (categoriesItem != null && this.categories != null) {
      this.categories.remove(categoriesItem);
    }

    return this;
  }
  /**
   **/
  public DesignProfileData deletable(Boolean deletable) {
    this.deletable = deletable;
    return this;
  }

  
  @JsonProperty("deletable")
  public Boolean getDeletable() {
    return deletable;
  }

  @JsonProperty("deletable")
  public void setDeletable(Boolean deletable) {
    this.deletable = deletable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DesignProfileData designProfileData = (DesignProfileData) o;
    return Objects.equals(this.id, designProfileData.id) &&
        Objects.equals(this.tenantId, designProfileData.tenantId) &&
        Objects.equals(this.name, designProfileData.name) &&
        Objects.equals(this.noticeUrl, designProfileData.noticeUrl) &&
        Objects.equals(this.privacyPolicyUrl, designProfileData.privacyPolicyUrl) &&
        Objects.equals(this.active, designProfileData.active) &&
        Objects.equals(this.categories, designProfileData.categories) &&
        Objects.equals(this.deletable, designProfileData.deletable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, name, noticeUrl, privacyPolicyUrl, active, categories, deletable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignProfileData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    noticeUrl: ").append(toIndentedString(noticeUrl)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
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

