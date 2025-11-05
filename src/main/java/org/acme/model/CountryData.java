package org.acme.model;

import org.acme.model.TranslationHolderData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CountryData")
@jakarta.annotation.Generated(value = "org.acme.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-05T18:35:24.197415100+01:00[Europe/Berlin]", comments = "Generator version: 7.17.0")
public class CountryData   {
  private String iso2;
  private String iso3;
  private String licensePlate;
  private String zipcodePattern;
  private TranslationHolderData name;
  private String flag;

  public CountryData() {
  }

  /**
   **/
  public CountryData iso2(String iso2) {
    this.iso2 = iso2;
    return this;
  }

  
  @JsonProperty("iso2")
  public String getIso2() {
    return iso2;
  }

  @JsonProperty("iso2")
  public void setIso2(String iso2) {
    this.iso2 = iso2;
  }

  /**
   **/
  public CountryData iso3(String iso3) {
    this.iso3 = iso3;
    return this;
  }

  
  @JsonProperty("iso3")
  public String getIso3() {
    return iso3;
  }

  @JsonProperty("iso3")
  public void setIso3(String iso3) {
    this.iso3 = iso3;
  }

  /**
   **/
  public CountryData licensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
    return this;
  }

  
  @JsonProperty("licensePlate")
  public String getLicensePlate() {
    return licensePlate;
  }

  @JsonProperty("licensePlate")
  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  /**
   **/
  public CountryData zipcodePattern(String zipcodePattern) {
    this.zipcodePattern = zipcodePattern;
    return this;
  }

  
  @JsonProperty("zipcodePattern")
  public String getZipcodePattern() {
    return zipcodePattern;
  }

  @JsonProperty("zipcodePattern")
  public void setZipcodePattern(String zipcodePattern) {
    this.zipcodePattern = zipcodePattern;
  }

  /**
   **/
  public CountryData name(TranslationHolderData name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  @Valid public TranslationHolderData getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(TranslationHolderData name) {
    this.name = name;
  }

  /**
   * Flag of the country. This is a base64 encoded byte array containing an image/svg.
   **/
  public CountryData flag(String flag) {
    this.flag = flag;
    return this;
  }

  
  @JsonProperty("flag")
  public String getFlag() {
    return flag;
  }

  @JsonProperty("flag")
  public void setFlag(String flag) {
    this.flag = flag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryData countryData = (CountryData) o;
    return Objects.equals(this.iso2, countryData.iso2) &&
        Objects.equals(this.iso3, countryData.iso3) &&
        Objects.equals(this.licensePlate, countryData.licensePlate) &&
        Objects.equals(this.zipcodePattern, countryData.zipcodePattern) &&
        Objects.equals(this.name, countryData.name) &&
        Objects.equals(this.flag, countryData.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iso2, iso3, licensePlate, zipcodePattern, name, flag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryData {\n");
    
    sb.append("    iso2: ").append(toIndentedString(iso2)).append("\n");
    sb.append("    iso3: ").append(toIndentedString(iso3)).append("\n");
    sb.append("    licensePlate: ").append(toIndentedString(licensePlate)).append("\n");
    sb.append("    zipcodePattern: ").append(toIndentedString(zipcodePattern)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
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

