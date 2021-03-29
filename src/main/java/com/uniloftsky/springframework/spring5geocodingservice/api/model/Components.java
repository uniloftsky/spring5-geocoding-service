
package com.uniloftsky.springframework.spring5geocodingservice.api.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ISO_3166-1_alpha-2",
    "ISO_3166-1_alpha-3",
    "_category",
    "_type",
    "continent",
    "country",
    "country_code",
    "house_number",
    "museum",
    "political_union",
    "postcode",
    "road",
    "state",
    "state_code",
    "suburb",
    "town"
})
public class Components {

    @JsonProperty("ISO_3166-1_alpha-2")
    private String iSO31661Alpha2;
    @JsonProperty("ISO_3166-1_alpha-3")
    private String iSO31661Alpha3;
    @JsonProperty("_category")
    private String category;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("house_number")
    private String houseNumber;
    @JsonProperty("museum")
    private String museum;
    @JsonProperty("political_union")
    private String politicalUnion;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("road")
    private String road;
    @JsonProperty("state")
    private String state;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("suburb")
    private String suburb;
    @JsonProperty("town")
    private String town;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ISO_3166-1_alpha-2")
    public String getISO31661Alpha2() {
        return iSO31661Alpha2;
    }

    @JsonProperty("ISO_3166-1_alpha-2")
    public void setISO31661Alpha2(String iSO31661Alpha2) {
        this.iSO31661Alpha2 = iSO31661Alpha2;
    }

    @JsonProperty("ISO_3166-1_alpha-3")
    public String getISO31661Alpha3() {
        return iSO31661Alpha3;
    }

    @JsonProperty("ISO_3166-1_alpha-3")
    public void setISO31661Alpha3(String iSO31661Alpha3) {
        this.iSO31661Alpha3 = iSO31661Alpha3;
    }

    @JsonProperty("_category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("_category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("house_number")
    public String getHouseNumber() {
        return houseNumber;
    }

    @JsonProperty("house_number")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @JsonProperty("museum")
    public String getMuseum() {
        return museum;
    }

    @JsonProperty("museum")
    public void setMuseum(String museum) {
        this.museum = museum;
    }

    @JsonProperty("political_union")
    public String getPoliticalUnion() {
        return politicalUnion;
    }

    @JsonProperty("political_union")
    public void setPoliticalUnion(String politicalUnion) {
        this.politicalUnion = politicalUnion;
    }

    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @JsonProperty("road")
    public String getRoad() {
        return road;
    }

    @JsonProperty("road")
    public void setRoad(String road) {
        this.road = road;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("suburb")
    public String getSuburb() {
        return suburb;
    }

    @JsonProperty("suburb")
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    @JsonProperty("town")
    public String getTown() {
        return town;
    }

    @JsonProperty("town")
    public void setTown(String town) {
        this.town = town;
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
