package org.acme.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Locale")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class Locale   {
  private String language;
  private String script;
  private String country;
  private String variant;
  private @Valid Set<String> extensionKeys = new LinkedHashSet<>();
  private @Valid Set<String> unicodeLocaleAttributes = new LinkedHashSet<>();
  private @Valid Set<String> unicodeLocaleKeys = new LinkedHashSet<>();
  private String iSO3Language;
  private String iSO3Country;
  private String displayLanguage;
  private String displayScript;
  private String displayCountry;
  private String displayVariant;
  private String displayName;

  public Locale() {
  }

  /**
   **/
  public Locale language(String language) {
    this.language = language;
    return this;
  }

  
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  @JsonProperty("language")
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   **/
  public Locale script(String script) {
    this.script = script;
    return this;
  }

  
  @JsonProperty("script")
  public String getScript() {
    return script;
  }

  @JsonProperty("script")
  public void setScript(String script) {
    this.script = script;
  }

  /**
   **/
  public Locale country(String country) {
    this.country = country;
    return this;
  }

  
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  public Locale variant(String variant) {
    this.variant = variant;
    return this;
  }

  
  @JsonProperty("variant")
  public String getVariant() {
    return variant;
  }

  @JsonProperty("variant")
  public void setVariant(String variant) {
    this.variant = variant;
  }

  /**
   **/
  public Locale extensionKeys(Set<String> extensionKeys) {
    this.extensionKeys = extensionKeys;
    return this;
  }

  
  @JsonProperty("extensionKeys")
  public Set<String> getExtensionKeys() {
    return extensionKeys;
  }

  @JsonProperty("extensionKeys")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setExtensionKeys(Set<String> extensionKeys) {
    this.extensionKeys = extensionKeys;
  }

  public Locale addExtensionKeysItem(String extensionKeysItem) {
    if (this.extensionKeys == null) {
      this.extensionKeys = new LinkedHashSet<>();
    }

    this.extensionKeys.add(extensionKeysItem);
    return this;
  }

  public Locale removeExtensionKeysItem(String extensionKeysItem) {
    if (extensionKeysItem != null && this.extensionKeys != null) {
      this.extensionKeys.remove(extensionKeysItem);
    }

    return this;
  }
  /**
   **/
  public Locale unicodeLocaleAttributes(Set<String> unicodeLocaleAttributes) {
    this.unicodeLocaleAttributes = unicodeLocaleAttributes;
    return this;
  }

  
  @JsonProperty("unicodeLocaleAttributes")
  public Set<String> getUnicodeLocaleAttributes() {
    return unicodeLocaleAttributes;
  }

  @JsonProperty("unicodeLocaleAttributes")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setUnicodeLocaleAttributes(Set<String> unicodeLocaleAttributes) {
    this.unicodeLocaleAttributes = unicodeLocaleAttributes;
  }

  public Locale addUnicodeLocaleAttributesItem(String unicodeLocaleAttributesItem) {
    if (this.unicodeLocaleAttributes == null) {
      this.unicodeLocaleAttributes = new LinkedHashSet<>();
    }

    this.unicodeLocaleAttributes.add(unicodeLocaleAttributesItem);
    return this;
  }

  public Locale removeUnicodeLocaleAttributesItem(String unicodeLocaleAttributesItem) {
    if (unicodeLocaleAttributesItem != null && this.unicodeLocaleAttributes != null) {
      this.unicodeLocaleAttributes.remove(unicodeLocaleAttributesItem);
    }

    return this;
  }
  /**
   **/
  public Locale unicodeLocaleKeys(Set<String> unicodeLocaleKeys) {
    this.unicodeLocaleKeys = unicodeLocaleKeys;
    return this;
  }

  
  @JsonProperty("unicodeLocaleKeys")
  public Set<String> getUnicodeLocaleKeys() {
    return unicodeLocaleKeys;
  }

  @JsonProperty("unicodeLocaleKeys")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setUnicodeLocaleKeys(Set<String> unicodeLocaleKeys) {
    this.unicodeLocaleKeys = unicodeLocaleKeys;
  }

  public Locale addUnicodeLocaleKeysItem(String unicodeLocaleKeysItem) {
    if (this.unicodeLocaleKeys == null) {
      this.unicodeLocaleKeys = new LinkedHashSet<>();
    }

    this.unicodeLocaleKeys.add(unicodeLocaleKeysItem);
    return this;
  }

  public Locale removeUnicodeLocaleKeysItem(String unicodeLocaleKeysItem) {
    if (unicodeLocaleKeysItem != null && this.unicodeLocaleKeys != null) {
      this.unicodeLocaleKeys.remove(unicodeLocaleKeysItem);
    }

    return this;
  }
  /**
   **/
  public Locale iSO3Language(String iSO3Language) {
    this.iSO3Language = iSO3Language;
    return this;
  }

  
  @JsonProperty("iSO3Language")
  public String getiSO3Language() {
    return iSO3Language;
  }

  @JsonProperty("iSO3Language")
  public void setiSO3Language(String iSO3Language) {
    this.iSO3Language = iSO3Language;
  }

  /**
   **/
  public Locale iSO3Country(String iSO3Country) {
    this.iSO3Country = iSO3Country;
    return this;
  }

  
  @JsonProperty("iSO3Country")
  public String getiSO3Country() {
    return iSO3Country;
  }

  @JsonProperty("iSO3Country")
  public void setiSO3Country(String iSO3Country) {
    this.iSO3Country = iSO3Country;
  }

  /**
   **/
  public Locale displayLanguage(String displayLanguage) {
    this.displayLanguage = displayLanguage;
    return this;
  }

  
  @JsonProperty("displayLanguage")
  public String getDisplayLanguage() {
    return displayLanguage;
  }

  @JsonProperty("displayLanguage")
  public void setDisplayLanguage(String displayLanguage) {
    this.displayLanguage = displayLanguage;
  }

  /**
   **/
  public Locale displayScript(String displayScript) {
    this.displayScript = displayScript;
    return this;
  }

  
  @JsonProperty("displayScript")
  public String getDisplayScript() {
    return displayScript;
  }

  @JsonProperty("displayScript")
  public void setDisplayScript(String displayScript) {
    this.displayScript = displayScript;
  }

  /**
   **/
  public Locale displayCountry(String displayCountry) {
    this.displayCountry = displayCountry;
    return this;
  }

  
  @JsonProperty("displayCountry")
  public String getDisplayCountry() {
    return displayCountry;
  }

  @JsonProperty("displayCountry")
  public void setDisplayCountry(String displayCountry) {
    this.displayCountry = displayCountry;
  }

  /**
   **/
  public Locale displayVariant(String displayVariant) {
    this.displayVariant = displayVariant;
    return this;
  }

  
  @JsonProperty("displayVariant")
  public String getDisplayVariant() {
    return displayVariant;
  }

  @JsonProperty("displayVariant")
  public void setDisplayVariant(String displayVariant) {
    this.displayVariant = displayVariant;
  }

  /**
   **/
  public Locale displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Locale locale = (Locale) o;
    return Objects.equals(this.language, locale.language) &&
        Objects.equals(this.script, locale.script) &&
        Objects.equals(this.country, locale.country) &&
        Objects.equals(this.variant, locale.variant) &&
        Objects.equals(this.extensionKeys, locale.extensionKeys) &&
        Objects.equals(this.unicodeLocaleAttributes, locale.unicodeLocaleAttributes) &&
        Objects.equals(this.unicodeLocaleKeys, locale.unicodeLocaleKeys) &&
        Objects.equals(this.iSO3Language, locale.iSO3Language) &&
        Objects.equals(this.iSO3Country, locale.iSO3Country) &&
        Objects.equals(this.displayLanguage, locale.displayLanguage) &&
        Objects.equals(this.displayScript, locale.displayScript) &&
        Objects.equals(this.displayCountry, locale.displayCountry) &&
        Objects.equals(this.displayVariant, locale.displayVariant) &&
        Objects.equals(this.displayName, locale.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, script, country, variant, extensionKeys, unicodeLocaleAttributes, unicodeLocaleKeys, iSO3Language, iSO3Country, displayLanguage, displayScript, displayCountry, displayVariant, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Locale {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    extensionKeys: ").append(toIndentedString(extensionKeys)).append("\n");
    sb.append("    unicodeLocaleAttributes: ").append(toIndentedString(unicodeLocaleAttributes)).append("\n");
    sb.append("    unicodeLocaleKeys: ").append(toIndentedString(unicodeLocaleKeys)).append("\n");
    sb.append("    iSO3Language: ").append(toIndentedString(iSO3Language)).append("\n");
    sb.append("    iSO3Country: ").append(toIndentedString(iSO3Country)).append("\n");
    sb.append("    displayLanguage: ").append(toIndentedString(displayLanguage)).append("\n");
    sb.append("    displayScript: ").append(toIndentedString(displayScript)).append("\n");
    sb.append("    displayCountry: ").append(toIndentedString(displayCountry)).append("\n");
    sb.append("    displayVariant: ").append(toIndentedString(displayVariant)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

