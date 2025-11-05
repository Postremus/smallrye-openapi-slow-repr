package org.acme.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.acme.model.TranslationData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TranslationHolderData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class TranslationHolderData   {
  private @Valid List<@Valid TranslationData> translations = new ArrayList<>();

  public TranslationHolderData() {
  }

  @JsonCreator
  public TranslationHolderData(
    @JsonProperty(required = true, value = "translations") List<@Valid TranslationData> translations
  ) {
    this.translations = translations;
  }

  /**
   * List containing all known translations for this field. A translation for the system default language is always present.
   **/
  public TranslationHolderData translations(List<@Valid TranslationData> translations) {
    this.translations = translations;
    return this;
  }

  
  @JsonProperty(required = true, value = "translations")
  @NotNull @Valid  @Size(min=1)public List<@Valid TranslationData> getTranslations() {
    return translations;
  }

  @JsonProperty(required = true, value = "translations")
  public void setTranslations(List<@Valid TranslationData> translations) {
    this.translations = translations;
  }

  public TranslationHolderData addTranslationsItem(TranslationData translationsItem) {
    if (this.translations == null) {
      this.translations = new ArrayList<>();
    }

    this.translations.add(translationsItem);
    return this;
  }

  public TranslationHolderData removeTranslationsItem(TranslationData translationsItem) {
    if (translationsItem != null && this.translations != null) {
      this.translations.remove(translationsItem);
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
    TranslationHolderData translationHolderData = (TranslationHolderData) o;
    return Objects.equals(this.translations, translationHolderData.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationHolderData {\n");
    
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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

