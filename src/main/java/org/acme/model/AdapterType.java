package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdapterType
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-06-12T06:27:49" +
        ".020268300+02:00[Europe/Berlin]", comments = "Generator version: 7.22.0")
public enum AdapterType {

    GENERIC("GENERIC"),

    JIRA("JIRA"),

    SERVICEDESK("SERVICEDESK"),

    PL_STORE("PL_STORE"),

    WIN_LAGER("WIN_LAGER"),

    BONSAI("BONSAI"),

    PYRAMID("PYRAMID"),

    RETEACH("RETEACH");

    private String value;

    AdapterType(String value) {
        this.value = value;
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AdapterType fromString(String s) {
        for (AdapterType b : AdapterType.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static AdapterType fromValue(String value) {
        for (AdapterType b : AdapterType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}


