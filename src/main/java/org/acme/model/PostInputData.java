package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.acme.model.PostCategory;
import org.acme.model.PostContentData;
import org.acme.model.PostRecipientData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("PostInputData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class PostInputData   {
  private PostCategory category;
  private Boolean isBanner;
  private Boolean isBlogpost;
  private Boolean displayAuthor;
  private Date visibleFrom;
  private Date visibleTo;
  private Boolean isGlobal;
  private Boolean allAvailableRecipients;
  private String defaultLanguage;
  private @Valid List<String> filterEnabledFor = new ArrayList<>();
  private @Valid List<@Valid PostContentData> content = new ArrayList<>();
  private @Valid List<@Valid PostRecipientData> recipients = new ArrayList<>();
  private Boolean markUnread = false;

  public PostInputData() {
  }

  @JsonCreator
  public PostInputData(
    @JsonProperty(required = true, value = "category") PostCategory category,
    @JsonProperty(required = true, value = "visibleFrom") Date visibleFrom,
    @JsonProperty(required = true, value = "visibleTo") Date visibleTo,
    @JsonProperty(required = true, value = "defaultLanguage") String defaultLanguage
  ) {
    this.category = category;
    this.visibleFrom = visibleFrom;
    this.visibleTo = visibleTo;
    this.defaultLanguage = defaultLanguage;
  }

  /**
   * category of this post
   **/
  public PostInputData category(PostCategory category) {
    this.category = category;
    return this;
  }

  
  @JsonProperty(required = true, value = "category")
  @NotNull public PostCategory getCategory() {
    return category;
  }

  @JsonProperty(required = true, value = "category")
  public void setCategory(PostCategory category) {
    this.category = category;
  }

  /**
   * Whether this post should be displayed as a banner
   **/
  public PostInputData isBanner(Boolean isBanner) {
    this.isBanner = isBanner;
    return this;
  }

  
  @JsonProperty("isBanner")
  public Boolean getIsBanner() {
    return isBanner;
  }

  @JsonProperty("isBanner")
  public void setIsBanner(Boolean isBanner) {
    this.isBanner = isBanner;
  }

  /**
   * Whether this post should be displayed as a blog post
   **/
  public PostInputData isBlogpost(Boolean isBlogpost) {
    this.isBlogpost = isBlogpost;
    return this;
  }

  
  @JsonProperty("isBlogpost")
  public Boolean getIsBlogpost() {
    return isBlogpost;
  }

  @JsonProperty("isBlogpost")
  public void setIsBlogpost(Boolean isBlogpost) {
    this.isBlogpost = isBlogpost;
  }

  /**
   * Whether the author of the post should be displayed
   **/
  public PostInputData displayAuthor(Boolean displayAuthor) {
    this.displayAuthor = displayAuthor;
    return this;
  }

  
  @JsonProperty("displayAuthor")
  public Boolean getDisplayAuthor() {
    return displayAuthor;
  }

  @JsonProperty("displayAuthor")
  public void setDisplayAuthor(Boolean displayAuthor) {
    this.displayAuthor = displayAuthor;
  }

  /**
   **/
  public PostInputData visibleFrom(Date visibleFrom) {
    this.visibleFrom = visibleFrom;
    return this;
  }

  
  @JsonProperty(required = true, value = "visibleFrom")
  @NotNull public Date getVisibleFrom() {
    return visibleFrom;
  }

  @JsonProperty(required = true, value = "visibleFrom")
  public void setVisibleFrom(Date visibleFrom) {
    this.visibleFrom = visibleFrom;
  }

  /**
   **/
  public PostInputData visibleTo(Date visibleTo) {
    this.visibleTo = visibleTo;
    return this;
  }

  
  @JsonProperty(required = true, value = "visibleTo")
  @NotNull public Date getVisibleTo() {
    return visibleTo;
  }

  @JsonProperty(required = true, value = "visibleTo")
  public void setVisibleTo(Date visibleTo) {
    this.visibleTo = visibleTo;
  }

  /**
   * Whether this post should be display to everyone in the system. Only usable for contexts of type SYSTEM.
   **/
  public PostInputData isGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
    return this;
  }

  
  @JsonProperty("isGlobal")
  public Boolean getIsGlobal() {
    return isGlobal;
  }

  @JsonProperty("isGlobal")
  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }

  /**
   * Whether this post should be display to every possible recipient of the current context. If this is set, the content of the recipients array is ignored. Only usable for contexts of type SYSTEM.
   **/
  public PostInputData allAvailableRecipients(Boolean allAvailableRecipients) {
    this.allAvailableRecipients = allAvailableRecipients;
    return this;
  }

  
  @JsonProperty("allAvailableRecipients")
  public Boolean getAllAvailableRecipients() {
    return allAvailableRecipients;
  }

  @JsonProperty("allAvailableRecipients")
  public void setAllAvailableRecipients(Boolean allAvailableRecipients) {
    this.allAvailableRecipients = allAvailableRecipients;
  }

  /**
   * Default language that should be used for displaying this post, if no other was explicitly specified.
   **/
  public PostInputData defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  
  @JsonProperty(required = true, value = "defaultLanguage")
  @NotNull public String getDefaultLanguage() {
    return defaultLanguage;
  }

  @JsonProperty(required = true, value = "defaultLanguage")
  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  /**
   * Context types the filter field is enabled for. Only used by FE.
   **/
  public PostInputData filterEnabledFor(List<String> filterEnabledFor) {
    this.filterEnabledFor = filterEnabledFor;
    return this;
  }

  
  @JsonProperty("filterEnabledFor")
  public List<String> getFilterEnabledFor() {
    return filterEnabledFor;
  }

  @JsonProperty("filterEnabledFor")
  public void setFilterEnabledFor(List<String> filterEnabledFor) {
    this.filterEnabledFor = filterEnabledFor;
  }

  public PostInputData addFilterEnabledForItem(String filterEnabledForItem) {
    if (this.filterEnabledFor == null) {
      this.filterEnabledFor = new ArrayList<>();
    }

    this.filterEnabledFor.add(filterEnabledForItem);
    return this;
  }

  public PostInputData removeFilterEnabledForItem(String filterEnabledForItem) {
    if (filterEnabledForItem != null && this.filterEnabledFor != null) {
      this.filterEnabledFor.remove(filterEnabledForItem);
    }

    return this;
  }
  /**
   **/
  public PostInputData content(List<@Valid PostContentData> content) {
    this.content = content;
    return this;
  }

  
  @JsonProperty("content")
  @Valid public List<@Valid PostContentData> getContent() {
    return content;
  }

  @JsonProperty("content")
  public void setContent(List<@Valid PostContentData> content) {
    this.content = content;
  }

  public PostInputData addContentItem(PostContentData contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }

    this.content.add(contentItem);
    return this;
  }

  public PostInputData removeContentItem(PostContentData contentItem) {
    if (contentItem != null && this.content != null) {
      this.content.remove(contentItem);
    }

    return this;
  }
  /**
   **/
  public PostInputData recipients(List<@Valid PostRecipientData> recipients) {
    this.recipients = recipients;
    return this;
  }

  
  @JsonProperty("recipients")
  @Valid public List<@Valid PostRecipientData> getRecipients() {
    return recipients;
  }

  @JsonProperty("recipients")
  public void setRecipients(List<@Valid PostRecipientData> recipients) {
    this.recipients = recipients;
  }

  public PostInputData addRecipientsItem(PostRecipientData recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }

    this.recipients.add(recipientsItem);
    return this;
  }

  public PostInputData removeRecipientsItem(PostRecipientData recipientsItem) {
    if (recipientsItem != null && this.recipients != null) {
      this.recipients.remove(recipientsItem);
    }

    return this;
  }
  /**
   * Flag which decided if the post should be marked as unread (true) for everyone, or if the current read state should be kept (false)
   **/
  public PostInputData markUnread(Boolean markUnread) {
    this.markUnread = markUnread;
    return this;
  }

  
  @JsonProperty("markUnread")
  public Boolean getMarkUnread() {
    return markUnread;
  }

  @JsonProperty("markUnread")
  public void setMarkUnread(Boolean markUnread) {
    this.markUnread = markUnread;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInputData postInputData = (PostInputData) o;
    return Objects.equals(this.category, postInputData.category) &&
        Objects.equals(this.isBanner, postInputData.isBanner) &&
        Objects.equals(this.isBlogpost, postInputData.isBlogpost) &&
        Objects.equals(this.displayAuthor, postInputData.displayAuthor) &&
        Objects.equals(this.visibleFrom, postInputData.visibleFrom) &&
        Objects.equals(this.visibleTo, postInputData.visibleTo) &&
        Objects.equals(this.isGlobal, postInputData.isGlobal) &&
        Objects.equals(this.allAvailableRecipients, postInputData.allAvailableRecipients) &&
        Objects.equals(this.defaultLanguage, postInputData.defaultLanguage) &&
        Objects.equals(this.filterEnabledFor, postInputData.filterEnabledFor) &&
        Objects.equals(this.content, postInputData.content) &&
        Objects.equals(this.recipients, postInputData.recipients) &&
        Objects.equals(this.markUnread, postInputData.markUnread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, isBanner, isBlogpost, displayAuthor, visibleFrom, visibleTo, isGlobal, allAvailableRecipients, defaultLanguage, filterEnabledFor, content, recipients, markUnread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInputData {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    isBanner: ").append(toIndentedString(isBanner)).append("\n");
    sb.append("    isBlogpost: ").append(toIndentedString(isBlogpost)).append("\n");
    sb.append("    displayAuthor: ").append(toIndentedString(displayAuthor)).append("\n");
    sb.append("    visibleFrom: ").append(toIndentedString(visibleFrom)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    allAvailableRecipients: ").append(toIndentedString(allAvailableRecipients)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    filterEnabledFor: ").append(toIndentedString(filterEnabledFor)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    markUnread: ").append(toIndentedString(markUnread)).append("\n");
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

