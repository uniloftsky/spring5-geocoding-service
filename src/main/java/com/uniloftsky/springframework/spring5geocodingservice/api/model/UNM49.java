
package com.uniloftsky.springframework.spring5geocodingservice.api.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "regions",
    "statistical_groupings"
})
public class UNM49 {

    @JsonProperty("regions")
    private Regions regions;
    @JsonProperty("statistical_groupings")
    private List<String> statisticalGroupings = null;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("regions")
    public Regions getRegions() {
        return regions;
    }

    @JsonProperty("regions")
    public void setRegions(Regions regions) {
        this.regions = regions;
    }

    @JsonProperty("statistical_groupings")
    public List<String> getStatisticalGroupings() {
        return statisticalGroupings;
    }

    @JsonProperty("statistical_groupings")
    public void setStatisticalGroupings(List<String> statisticalGroupings) {
        this.statisticalGroupings = statisticalGroupings;
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
