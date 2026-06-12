package org.acme.model;

import java.util.UUID;

import org.acme.model.TranslationHolderData;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("SalutationDataV2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" + ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public class SalutationDataV2 {

    private UUID id;

    private Long salutationNumber;

    private TranslationHolderData salutation;

    public SalutationDataV2() {
    }

    /**
     * Id of the salutation.
     **/
    public SalutationDataV2 id(UUID id) {
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
     * Number of the salutation.
     **/
    public SalutationDataV2 salutationNumber(Long salutationNumber) {
        this.salutationNumber = salutationNumber;
        return this;
    }

    @JsonProperty("salutationNumber")
    public Long getSalutationNumber() {
        return salutationNumber;
    }

    @JsonProperty("salutationNumber")
    public void setSalutationNumber(Long salutationNumber) {
        this.salutationNumber = salutationNumber;
    }

    /**
     * Translated salutation.
     **/
    public SalutationDataV2 salutation(TranslationHolderData salutation) {
        this.salutation = salutation;
        return this;
    }

    @JsonProperty("salutation")
    @Valid
    public TranslationHolderData getSalutation() {
        return salutation;
    }

    @JsonProperty("salutation")
    public void setSalutation(TranslationHolderData salutation) {
        this.salutation = salutation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SalutationDataV2 salutationDataV2 = (SalutationDataV2) o;
        return Objects.equals(this.id, salutationDataV2.id) && Objects.equals(this.salutationNumber,
                salutationDataV2.salutationNumber) && Objects.equals(this.salutation, salutationDataV2.salutation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salutationNumber, salutation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SalutationDataV2 {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    salutationNumber: ").append(toIndentedString(salutationNumber)).append("\n");
        sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
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
