
package com.uniloftsky.springframework.spring5geocodingservice.api.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DE",
    "EUROPE",
    "WESTERN_EUROPE",
    "WORLD"
})
public class Regions {

    @JsonProperty("DE")
    private String dE;
    @JsonProperty("EUROPE")
    private String eUROPE;
    @JsonProperty("WESTERN_EUROPE")
    private String wESTERNEUROPE;
    @JsonProperty("WORLD")
    private String wORLD;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DE")
    public String getDE() {
        return dE;
    }

    @JsonProperty("DE")
    public void setDE(String dE) {
        this.dE = dE;
    }

    @JsonProperty("EUROPE")
    public String getEUROPE() {
        return eUROPE;
    }

    @JsonProperty("EUROPE")
    public void setEUROPE(String eUROPE) {
        this.eUROPE = eUROPE;
    }

    @JsonProperty("WESTERN_EUROPE")
    public String getWESTERNEUROPE() {
        return wESTERNEUROPE;
    }

    @JsonProperty("WESTERN_EUROPE")
    public void setWESTERNEUROPE(String wESTERNEUROPE) {
        this.wESTERNEUROPE = wESTERNEUROPE;
    }

    @JsonProperty("WORLD")
    public String getWORLD() {
        return wORLD;
    }

    @JsonProperty("WORLD")
    public void setWORLD(String wORLD) {
        this.wORLD = wORLD;
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
