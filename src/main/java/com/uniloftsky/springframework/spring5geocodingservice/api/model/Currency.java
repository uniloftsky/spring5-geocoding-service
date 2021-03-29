
package com.uniloftsky.springframework.spring5geocodingservice.api.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alternate_symbols",
    "decimal_mark",
    "html_entity",
    "iso_code",
    "iso_numeric",
    "name",
    "smallest_denomination",
    "subunit",
    "subunit_to_unit",
    "symbol",
    "symbol_first",
    "thousands_separator"
})
public class Currency {

    @JsonProperty("alternate_symbols")
    private List<Object> alternateSymbols = null;
    @JsonProperty("decimal_mark")
    private String decimalMark;
    @JsonProperty("html_entity")
    private String htmlEntity;
    @JsonProperty("iso_code")
    private String isoCode;
    @JsonProperty("iso_numeric")
    private String isoNumeric;
    @JsonProperty("name")
    private String name;
    @JsonProperty("smallest_denomination")
    private Integer smallestDenomination;
    @JsonProperty("subunit")
    private String subunit;
    @JsonProperty("subunit_to_unit")
    private Integer subunitToUnit;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("symbol_first")
    private Integer symbolFirst;
    @JsonProperty("thousands_separator")
    private String thousandsSeparator;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("alternate_symbols")
    public List<Object> getAlternateSymbols() {
        return alternateSymbols;
    }

    @JsonProperty("alternate_symbols")
    public void setAlternateSymbols(List<Object> alternateSymbols) {
        this.alternateSymbols = alternateSymbols;
    }

    @JsonProperty("decimal_mark")
    public String getDecimalMark() {
        return decimalMark;
    }

    @JsonProperty("decimal_mark")
    public void setDecimalMark(String decimalMark) {
        this.decimalMark = decimalMark;
    }

    @JsonProperty("html_entity")
    public String getHtmlEntity() {
        return htmlEntity;
    }

    @JsonProperty("html_entity")
    public void setHtmlEntity(String htmlEntity) {
        this.htmlEntity = htmlEntity;
    }

    @JsonProperty("iso_code")
    public String getIsoCode() {
        return isoCode;
    }

    @JsonProperty("iso_code")
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    @JsonProperty("iso_numeric")
    public String getIsoNumeric() {
        return isoNumeric;
    }

    @JsonProperty("iso_numeric")
    public void setIsoNumeric(String isoNumeric) {
        this.isoNumeric = isoNumeric;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("smallest_denomination")
    public Integer getSmallestDenomination() {
        return smallestDenomination;
    }

    @JsonProperty("smallest_denomination")
    public void setSmallestDenomination(Integer smallestDenomination) {
        this.smallestDenomination = smallestDenomination;
    }

    @JsonProperty("subunit")
    public String getSubunit() {
        return subunit;
    }

    @JsonProperty("subunit")
    public void setSubunit(String subunit) {
        this.subunit = subunit;
    }

    @JsonProperty("subunit_to_unit")
    public Integer getSubunitToUnit() {
        return subunitToUnit;
    }

    @JsonProperty("subunit_to_unit")
    public void setSubunitToUnit(Integer subunitToUnit) {
        this.subunitToUnit = subunitToUnit;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("symbol_first")
    public Integer getSymbolFirst() {
        return symbolFirst;
    }

    @JsonProperty("symbol_first")
    public void setSymbolFirst(Integer symbolFirst) {
        this.symbolFirst = symbolFirst;
    }

    @JsonProperty("thousands_separator")
    public String getThousandsSeparator() {
        return thousandsSeparator;
    }

    @JsonProperty("thousands_separator")
    public void setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
