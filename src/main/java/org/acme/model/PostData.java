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



@JsonTypeName("PostData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class PostData   {
  private Long id;
  private PostCategory category;
  private Boolean isBanner;
  private Boolean isBlogpost;
  private Boolean displayAuthor;
  private Date visibleFrom;
  private Date visibleTo;
  private Boolean isGlobal;
  private Boolean allAvailableRecipients;
  private String defaultLanguage;
  private Date createDateTime;
  private Date lastUpdateDateTime;
  private Boolean read;
  private String creatorContextType;
  private String creatorContextId;
  private @Valid List<String> filterEnabledFor = new ArrayList<>();
  private String createUser;
  private String lastUpdateUser;
  private @Valid List<@Valid PostContentData> content = new ArrayList<>();
  private @Valid List<@Valid PostRecipientData> recipients = new ArrayList<>();
  private Boolean deleted;

  public PostData() {
  }

  @JsonCreator
  public PostData(
    @JsonProperty(required = true, value = "defaultLanguage") String defaultLanguage
  ) {
    this.defaultLanguage = defaultLanguage;
  }

  /**
   * Id of this post
   **/
  public PostData id(Long id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * category of this post
   **/
  public PostData category(PostCategory category) {
    this.category = category;
    return this;
  }

  
  @JsonProperty("category")
  public PostCategory getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(PostCategory category) {
    this.category = category;
  }

  /**
   * Whether this post should be displayed as a banner
   **/
  public PostData isBanner(Boolean isBanner) {
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
  public PostData isBlogpost(Boolean isBlogpost) {
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
  public PostData displayAuthor(Boolean displayAuthor) {
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
  public PostData visibleFrom(Date visibleFrom) {
    this.visibleFrom = visibleFrom;
    return this;
  }

  
  @JsonProperty("visibleFrom")
  public Date getVisibleFrom() {
    return visibleFrom;
  }

  @JsonProperty("visibleFrom")
  public void setVisibleFrom(Date visibleFrom) {
    this.visibleFrom = visibleFrom;
  }

  /**
   **/
  public PostData visibleTo(Date visibleTo) {
    this.visibleTo = visibleTo;
    return this;
  }

  
  @JsonProperty("visibleTo")
  public Date getVisibleTo() {
    return visibleTo;
  }

  @JsonProperty("visibleTo")
  public void setVisibleTo(Date visibleTo) {
    this.visibleTo = visibleTo;
  }

  /**
   * Whether this post should be display to everyone in the system. Only usable for contexts of type SYSTEM.
   **/
  public PostData isGlobal(Boolean isGlobal) {
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
  public PostData allAvailableRecipients(Boolean allAvailableRecipients) {
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
  public PostData defaultLanguage(String defaultLanguage) {
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
   **/
  public PostData createDateTime(Date createDateTime) {
    this.createDateTime = createDateTime;
    return this;
  }

  
  @JsonProperty("createDateTime")
  public Date getCreateDateTime() {
    return createDateTime;
  }

  @JsonProperty("createDateTime")
  public void setCreateDateTime(Date createDateTime) {
    this.createDateTime = createDateTime;
  }

  /**
   **/
  public PostData lastUpdateDateTime(Date lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
    return this;
  }

  
  @JsonProperty("lastUpdateDateTime")
  public Date getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  @JsonProperty("lastUpdateDateTime")
  public void setLastUpdateDateTime(Date lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }

  /**
   * If this post was marked as read
   **/
  public PostData read(Boolean read) {
    this.read = read;
    return this;
  }

  
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }

  @JsonProperty("read")
  public void setRead(Boolean read) {
    this.read = read;
  }

  /**
   * Context type of this posts original creator
   **/
  public PostData creatorContextType(String creatorContextType) {
    this.creatorContextType = creatorContextType;
    return this;
  }

  
  @JsonProperty("creatorContextType")
  public String getCreatorContextType() {
    return creatorContextType;
  }

  @JsonProperty("creatorContextType")
  public void setCreatorContextType(String creatorContextType) {
    this.creatorContextType = creatorContextType;
  }

  /**
   * Context id of this posts original creator
   **/
  public PostData creatorContextId(String creatorContextId) {
    this.creatorContextId = creatorContextId;
    return this;
  }

  
  @JsonProperty("creatorContextId")
  public String getCreatorContextId() {
    return creatorContextId;
  }

  @JsonProperty("creatorContextId")
  public void setCreatorContextId(String creatorContextId) {
    this.creatorContextId = creatorContextId;
  }

  /**
   * Context types the filter field is enabled for. Only used by FE.
   **/
  public PostData filterEnabledFor(List<String> filterEnabledFor) {
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

  public PostData addFilterEnabledForItem(String filterEnabledForItem) {
    if (this.filterEnabledFor == null) {
      this.filterEnabledFor = new ArrayList<>();
    }

    this.filterEnabledFor.add(filterEnabledForItem);
    return this;
  }

  public PostData removeFilterEnabledForItem(String filterEnabledForItem) {
    if (filterEnabledForItem != null && this.filterEnabledFor != null) {
      this.filterEnabledFor.remove(filterEnabledForItem);
    }

    return this;
  }
  /**
   * Name of the user who created this blog post, in the format lastname, firstname.
   **/
  public PostData createUser(String createUser) {
    this.createUser = createUser;
    return this;
  }

  
  @JsonProperty("createUser")
  public String getCreateUser() {
    return createUser;
  }

  @JsonProperty("createUser")
  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  /**
   * Name of the user who last updated this blog post, in the format lastname, firstname.
   **/
  public PostData lastUpdateUser(String lastUpdateUser) {
    this.lastUpdateUser = lastUpdateUser;
    return this;
  }

  
  @JsonProperty("lastUpdateUser")
  public String getLastUpdateUser() {
    return lastUpdateUser;
  }

  @JsonProperty("lastUpdateUser")
  public void setLastUpdateUser(String lastUpdateUser) {
    this.lastUpdateUser = lastUpdateUser;
  }

  /**
   **/
  public PostData content(List<@Valid PostContentData> content) {
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

  public PostData addContentItem(PostContentData contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }

    this.content.add(contentItem);
    return this;
  }

  public PostData removeContentItem(PostContentData contentItem) {
    if (contentItem != null && this.content != null) {
      this.content.remove(contentItem);
    }

    return this;
  }
  /**
   **/
  public PostData recipients(List<@Valid PostRecipientData> recipients) {
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

  public PostData addRecipientsItem(PostRecipientData recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }

    this.recipients.add(recipientsItem);
    return this;
  }

  public PostData removeRecipientsItem(PostRecipientData recipientsItem) {
    if (recipientsItem != null && this.recipients != null) {
      this.recipients.remove(recipientsItem);
    }

    return this;
  }
  /**
   * true if this post is deleted.
   **/
  public PostData deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  @JsonProperty("deleted")
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostData postData = (PostData) o;
    return Objects.equals(this.id, postData.id) &&
        Objects.equals(this.category, postData.category) &&
        Objects.equals(this.isBanner, postData.isBanner) &&
        Objects.equals(this.isBlogpost, postData.isBlogpost) &&
        Objects.equals(this.displayAuthor, postData.displayAuthor) &&
        Objects.equals(this.visibleFrom, postData.visibleFrom) &&
        Objects.equals(this.visibleTo, postData.visibleTo) &&
        Objects.equals(this.isGlobal, postData.isGlobal) &&
        Objects.equals(this.allAvailableRecipients, postData.allAvailableRecipients) &&
        Objects.equals(this.defaultLanguage, postData.defaultLanguage) &&
        Objects.equals(this.createDateTime, postData.createDateTime) &&
        Objects.equals(this.lastUpdateDateTime, postData.lastUpdateDateTime) &&
        Objects.equals(this.read, postData.read) &&
        Objects.equals(this.creatorContextType, postData.creatorContextType) &&
        Objects.equals(this.creatorContextId, postData.creatorContextId) &&
        Objects.equals(this.filterEnabledFor, postData.filterEnabledFor) &&
        Objects.equals(this.createUser, postData.createUser) &&
        Objects.equals(this.lastUpdateUser, postData.lastUpdateUser) &&
        Objects.equals(this.content, postData.content) &&
        Objects.equals(this.recipients, postData.recipients) &&
        Objects.equals(this.deleted, postData.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, isBanner, isBlogpost, displayAuthor, visibleFrom, visibleTo, isGlobal, allAvailableRecipients, defaultLanguage, createDateTime, lastUpdateDateTime, read, creatorContextType, creatorContextId, filterEnabledFor, createUser, lastUpdateUser, content, recipients, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    isBanner: ").append(toIndentedString(isBanner)).append("\n");
    sb.append("    isBlogpost: ").append(toIndentedString(isBlogpost)).append("\n");
    sb.append("    displayAuthor: ").append(toIndentedString(displayAuthor)).append("\n");
    sb.append("    visibleFrom: ").append(toIndentedString(visibleFrom)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    allAvailableRecipients: ").append(toIndentedString(allAvailableRecipients)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    createDateTime: ").append(toIndentedString(createDateTime)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    creatorContextType: ").append(toIndentedString(creatorContextType)).append("\n");
    sb.append("    creatorContextId: ").append(toIndentedString(creatorContextId)).append("\n");
    sb.append("    filterEnabledFor: ").append(toIndentedString(filterEnabledFor)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    lastUpdateUser: ").append(toIndentedString(lastUpdateUser)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

