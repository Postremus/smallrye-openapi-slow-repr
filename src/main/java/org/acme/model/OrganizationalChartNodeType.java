package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets OrganizationalChartNodeType
 */
public enum OrganizationalChartNodeType {
  
  TENANT("TENANT"),
  
  ORGANIZATION("ORGANIZATION"),
  
  TENANT_ORGANIZATION("TENANT_ORGANIZATION"),
  
  MANDATOR_ORGANIZATION("MANDATOR_ORGANIZATION");

  private String value;

  OrganizationalChartNodeType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OrganizationalChartNodeType fromString(String s) {
      for (OrganizationalChartNodeType b : OrganizationalChartNodeType.values()) {
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
  public static OrganizationalChartNodeType fromValue(String value) {
    for (OrganizationalChartNodeType b : OrganizationalChartNodeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


