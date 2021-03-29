
package com.uniloftsky.springframework.spring5geocodingservice.api.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apparent",
    "astronomical",
    "civil",
    "nautical"
})
public class Set {

    @JsonProperty("apparent")
    private Integer apparent;
    @JsonProperty("astronomical")
    private Integer astronomical;
    @JsonProperty("civil")
    private Integer civil;
    @JsonProperty("nautical")
    private Integer nautical;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("apparent")
    public Integer getApparent() {
        return apparent;
    }

    @JsonProperty("apparent")
    public void setApparent(Integer apparent) {
        this.apparent = apparent;
    }

    @JsonProperty("astronomical")
    public Integer getAstronomical() {
        return astronomical;
    }

    @JsonProperty("astronomical")
    public void setAstronomical(Integer astronomical) {
        this.astronomical = astronomical;
    }

    @JsonProperty("civil")
    public Integer getCivil() {
        return civil;
    }

    @JsonProperty("civil")
    public void setCivil(Integer civil) {
        this.civil = civil;
    }

    @JsonProperty("nautical")
    public Integer getNautical() {
        return nautical;
    }

    @JsonProperty("nautical")
    public void setNautical(Integer nautical) {
        this.nautical = nautical;
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
