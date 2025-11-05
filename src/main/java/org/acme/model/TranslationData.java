package org.acme.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TranslationData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class TranslationData   {
  private String language;
  private String translation;

  public TranslationData() {
  }

  @JsonCreator
  public TranslationData(
    @JsonProperty(required = true, value = "language") String language,
    @JsonProperty(required = true, value = "translation") String translation
  ) {
    this.language = language;
    this.translation = translation;
  }

  /**
   * The language tag for this translation in rfc5676 format.
   **/
  public TranslationData language(String language) {
    this.language = language;
    return this;
  }

  
  @JsonProperty(required = true, value = "language")
  @NotNull  @Pattern(regexp="[a-z]{2}-[A-Z]{2}")public String getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Translation for the given language.
   **/
  public TranslationData translation(String translation) {
    this.translation = translation;
    return this;
  }

  
  @JsonProperty(required = true, value = "translation")
  @NotNull  @Pattern(regexp="\\S")public String getTranslation() {
    return translation;
  }

  @JsonProperty(required = true, value = "translation")
  public void setTranslation(String translation) {
    this.translation = translation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationData translationData = (TranslationData) o;
    return Objects.equals(this.language, translationData.language) &&
        Objects.equals(this.translation, translationData.translation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, translation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationData {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    translation: ").append(toIndentedString(translation)).append("\n");
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

