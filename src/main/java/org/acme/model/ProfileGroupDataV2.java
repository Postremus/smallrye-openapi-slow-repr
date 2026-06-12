package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.acme.model.ProfileGroupApplicationGrantDataV2;
import org.acme.model.ProfileGroupRightDataV2;
import org.acme.model.TranslationHolderData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ProfileGroupDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ProfileGroupDataV2 {

    private UUID id;

    private String matchCode;

    private TranslationHolderData name;

    private Boolean deleted;

    private UUID tenantId;

    private Boolean modifieable;

    private @Valid List<@Valid ProfileGroupRightDataV2> rights = new ArrayList<>();

    private @Valid List<@Valid ProfileGroupApplicationGrantDataV2> accessGrants = new ArrayList<>();

    public ProfileGroupDataV2() {
    }

    @JsonCreator
    public ProfileGroupDataV2(@JsonProperty(required = true, value = "matchCode") String matchCode) {
        this.matchCode = matchCode;
    }

    /**
     * Id of this account profile group.
     **/
    public ProfileGroupDataV2 id(UUID id) {
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
     * Matchcode of this object. Matchcodes are upper cases abbreviations of e.g. the object name, or the upper cased functional key of the object.
     **/
    public ProfileGroupDataV2 matchCode(String matchCode) {
        this.matchCode = matchCode;
        return this;
    }

    @JsonProperty(required = true, value = "matchCode")
    @NotNull
    @Pattern(regexp = "[A-Z0-9]*")
    @Size(max = 100)
    public String getMatchCode() {
        return matchCode;
    }

    @JsonProperty(required = true, value = "matchCode")
    public void setMatchCode(String matchCode) {
        this.matchCode = matchCode;
    }

    /**
     * Translated account profile group name.
     **/
    public ProfileGroupDataV2 name(TranslationHolderData name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name")
    @Valid
    public TranslationHolderData getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(TranslationHolderData name) {
        this.name = name;
    }

    /**
     * true if this account profile group is deleted.
     **/
    public ProfileGroupDataV2 deleted(Boolean deleted) {
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

    /**
     * Id of the tenant this account profile group belongs to.
     **/
    public ProfileGroupDataV2 tenantId(UUID tenantId) {
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
    public ProfileGroupDataV2 modifieable(Boolean modifieable) {
        this.modifieable = modifieable;
        return this;
    }

    @JsonProperty("modifieable")
    public Boolean getModifieable() {
        return modifieable;
    }

    @JsonProperty("modifieable")
    public void setModifieable(Boolean modifieable) {
        this.modifieable = modifieable;
    }

    /**
     **/
    public ProfileGroupDataV2 rights(List<@Valid ProfileGroupRightDataV2> rights) {
        this.rights = rights;
        return this;
    }

    @JsonProperty("rights")
    @Valid
    public List<@Valid ProfileGroupRightDataV2> getRights() {
        return rights;
    }

    @JsonProperty("rights")
    public void setRights(List<@Valid ProfileGroupRightDataV2> rights) {
        this.rights = rights;
    }

    public ProfileGroupDataV2 addRightsItem(ProfileGroupRightDataV2 rightsItem) {
        if (this.rights == null) {
            this.rights = new ArrayList<>();
        }

        this.rights.add(rightsItem);
        return this;
    }

    public ProfileGroupDataV2 removeRightsItem(ProfileGroupRightDataV2 rightsItem) {
        if (rightsItem != null && this.rights != null) {
            this.rights.remove(rightsItem);
        }

        return this;
    }

    /**
     * List of all applications this profile group is allowed to use.
     **/
    public ProfileGroupDataV2 accessGrants(List<@Valid ProfileGroupApplicationGrantDataV2> accessGrants) {
        this.accessGrants = accessGrants;
        return this;
    }

    @JsonProperty("accessGrants")
    @Valid
    public List<@Valid ProfileGroupApplicationGrantDataV2> getAccessGrants() {
        return accessGrants;
    }

    @JsonProperty("accessGrants")
    public void setAccessGrants(List<@Valid ProfileGroupApplicationGrantDataV2> accessGrants) {
        this.accessGrants = accessGrants;
    }

    public ProfileGroupDataV2 addAccessGrantsItem(ProfileGroupApplicationGrantDataV2 accessGrantsItem) {
        if (this.accessGrants == null) {
            this.accessGrants = new ArrayList<>();
        }

        this.accessGrants.add(accessGrantsItem);
        return this;
    }

    public ProfileGroupDataV2 removeAccessGrantsItem(ProfileGroupApplicationGrantDataV2 accessGrantsItem) {
        if (accessGrantsItem != null && this.accessGrants != null) {
            this.accessGrants.remove(accessGrantsItem);
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
        ProfileGroupDataV2 profileGroupDataV2 = (ProfileGroupDataV2) o;
        return Objects.equals(this.id, profileGroupDataV2.id) && Objects.equals(this.matchCode, profileGroupDataV2.matchCode) && Objects.equals(
                this.name, profileGroupDataV2.name) && Objects.equals(this.deleted, profileGroupDataV2.deleted) && Objects.equals(this.tenantId,
                profileGroupDataV2.tenantId) && Objects.equals(this.modifieable, profileGroupDataV2.modifieable) && Objects.equals(this.rights,
                profileGroupDataV2.rights) && Objects.equals(this.accessGrants, profileGroupDataV2.accessGrants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, matchCode, name, deleted, tenantId, modifieable, rights, accessGrants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfileGroupDataV2 {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    modifieable: ").append(toIndentedString(modifieable)).append("\n");
        sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
        sb.append("    accessGrants: ").append(toIndentedString(accessGrants)).append("\n");
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
