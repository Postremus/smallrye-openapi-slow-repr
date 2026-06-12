package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.acme.model.Status;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("UserModelData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class UserModelData {

    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    private String locale;

    private UUID salutationId;

    private String oidcId;

    private Status status;

    private UUID tenantId;

    private UUID organizationId;

    private @Valid List<String> tags = new ArrayList<>();

    public UserModelData() {
    }

    @JsonCreator
    public UserModelData(@JsonProperty(required = true, value = "email") String email) {
        this.email = email;
    }

    /**
     **/
    public UserModelData id(UUID id) {
        this.id = id;
        return this;
    }

    @JsonProperty("id")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     **/
    public UserModelData firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     **/
    public UserModelData lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     **/
    public UserModelData email(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty(required = true, value = "email")
    @NotNull
    @Size(max = 255)
    public String getEmail() {
        return email;
    }

    @JsonProperty(required = true, value = "email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     **/
    public UserModelData locale(String locale) {
        this.locale = locale;
        return this;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     **/
    public UserModelData salutationId(UUID salutationId) {
        this.salutationId = salutationId;
        return this;
    }

    @JsonProperty("salutationId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getSalutationId() {
        return salutationId;
    }

    @JsonProperty("salutationId")
    public void setSalutationId(UUID salutationId) {
        this.salutationId = salutationId;
    }

    /**
     **/
    public UserModelData oidcId(String oidcId) {
        this.oidcId = oidcId;
        return this;
    }

    @JsonProperty("oidcId")
    public String getOidcId() {
        return oidcId;
    }

    @JsonProperty("oidcId")
    public void setOidcId(String oidcId) {
        this.oidcId = oidcId;
    }

    /**
     **/
    public UserModelData status(Status status) {
        this.status = status;
        return this;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     **/
    public UserModelData tenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    @JsonProperty("tenantId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getTenantId() {
        return tenantId;
    }

    @JsonProperty("tenantId")
    public void setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
    }

    /**
     **/
    public UserModelData organizationId(UUID organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    @JsonProperty("organizationId")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getOrganizationId() {
        return organizationId;
    }

    @JsonProperty("organizationId")
    public void setOrganizationId(UUID organizationId) {
        this.organizationId = organizationId;
    }

    /**
     **/
    public UserModelData tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public UserModelData addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }

        this.tags.add(tagsItem);
        return this;
    }

    public UserModelData removeTagsItem(String tagsItem) {
        if (tagsItem != null && this.tags != null) {
            this.tags.remove(tagsItem);
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
        UserModelData userModelData = (UserModelData) o;
        return Objects.equals(this.id, userModelData.id) && Objects.equals(this.firstName, userModelData.firstName) && Objects.equals(this.lastName,
                userModelData.lastName) && Objects.equals(this.email, userModelData.email) && Objects.equals(this.locale,
                userModelData.locale) && Objects.equals(this.salutationId, userModelData.salutationId) && Objects.equals(this.oidcId,
                userModelData.oidcId) && Objects.equals(this.status, userModelData.status) && Objects.equals(this.tenantId,
                userModelData.tenantId) && Objects.equals(this.organizationId, userModelData.organizationId) && Objects.equals(this.tags,
                userModelData.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, locale, salutationId, oidcId, status, tenantId, organizationId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserModelData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    salutationId: ").append(toIndentedString(salutationId)).append("\n");
        sb.append("    oidcId: ").append(toIndentedString(oidcId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
