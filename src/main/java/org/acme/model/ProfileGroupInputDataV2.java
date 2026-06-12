package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.acme.model.ProfileGroupApplicationGrantDataV2;
import org.acme.model.ProfileGroupRightInputDataV2;
import org.acme.model.TranslationHolderData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ProfileGroupInputDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class ProfileGroupInputDataV2 {

    private String matchCode;

    private TranslationHolderData name;

    private UUID tenantId;

    private @Valid List<@Valid ProfileGroupRightInputDataV2> rights = new ArrayList<>();

    private @Valid List<@Valid ProfileGroupApplicationGrantDataV2> accessGrants = new ArrayList<>();

    public ProfileGroupInputDataV2() {
    }

    @JsonCreator
    public ProfileGroupInputDataV2(@JsonProperty(required = true, value = "matchCode") String matchCode,
            @JsonProperty(required = true, value = "name") TranslationHolderData name,
            @JsonProperty(required = true, value = "tenantId") UUID tenantId) {
        this.matchCode = matchCode;
        this.name = name;
        this.tenantId = tenantId;
    }

    /**
     * Matchcode of this object. Matchcodes are upper cases abbreviations of e.g. the object name, or the upper cased functional key of the object.
     **/
    public ProfileGroupInputDataV2 matchCode(String matchCode) {
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
    public ProfileGroupInputDataV2 name(TranslationHolderData name) {
        this.name = name;
        return this;
    }

    @JsonProperty(required = true, value = "name")
    @NotNull
    @Valid
    public TranslationHolderData getName() {
        return name;
    }

    @JsonProperty(required = true, value = "name")
    public void setName(TranslationHolderData name) {
        this.name = name;
    }

    /**
     * Id of the tenant this account profile group belongs to.
     **/
    public ProfileGroupInputDataV2 tenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    @JsonProperty(required = true, value = "tenantId")
    @NotNull
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    public UUID getTenantId() {
        return tenantId;
    }

    @JsonProperty(required = true, value = "tenantId")
    public void setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
    }

    /**
     **/
    public ProfileGroupInputDataV2 rights(List<@Valid ProfileGroupRightInputDataV2> rights) {
        this.rights = rights;
        return this;
    }

    @JsonProperty("rights")
    @Valid
    public List<@Valid ProfileGroupRightInputDataV2> getRights() {
        return rights;
    }

    @JsonProperty("rights")
    public void setRights(List<@Valid ProfileGroupRightInputDataV2> rights) {
        this.rights = rights;
    }

    public ProfileGroupInputDataV2 addRightsItem(ProfileGroupRightInputDataV2 rightsItem) {
        if (this.rights == null) {
            this.rights = new ArrayList<>();
        }

        this.rights.add(rightsItem);
        return this;
    }

    public ProfileGroupInputDataV2 removeRightsItem(ProfileGroupRightInputDataV2 rightsItem) {
        if (rightsItem != null && this.rights != null) {
            this.rights.remove(rightsItem);
        }

        return this;
    }

    /**
     * List of all applications this profile group is allowed to use.
     **/
    public ProfileGroupInputDataV2 accessGrants(List<@Valid ProfileGroupApplicationGrantDataV2> accessGrants) {
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

    public ProfileGroupInputDataV2 addAccessGrantsItem(ProfileGroupApplicationGrantDataV2 accessGrantsItem) {
        if (this.accessGrants == null) {
            this.accessGrants = new ArrayList<>();
        }

        this.accessGrants.add(accessGrantsItem);
        return this;
    }

    public ProfileGroupInputDataV2 removeAccessGrantsItem(ProfileGroupApplicationGrantDataV2 accessGrantsItem) {
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
        ProfileGroupInputDataV2 profileGroupInputDataV2 = (ProfileGroupInputDataV2) o;
        return Objects.equals(this.matchCode, profileGroupInputDataV2.matchCode) && Objects.equals(this.name,
                profileGroupInputDataV2.name) && Objects.equals(this.tenantId, profileGroupInputDataV2.tenantId) && Objects.equals(this.rights,
                profileGroupInputDataV2.rights) && Objects.equals(this.accessGrants, profileGroupInputDataV2.accessGrants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchCode, name, tenantId, rights, accessGrants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfileGroupInputDataV2 {\n");

        sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
