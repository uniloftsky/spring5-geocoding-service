
package com.uniloftsky.springframework.spring5geocodingservice.api.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "created_http",
    "created_unix"
})
public class Timestamp {

    @JsonProperty("created_http")
    private String createdHttp;
    @JsonProperty("created_unix")
    private Integer createdUnix;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created_http")
    public String getCreatedHttp() {
        return createdHttp;
    }

    @JsonProperty("created_http")
    public void setCreatedHttp(String createdHttp) {
        this.createdHttp = createdHttp;
    }

    @JsonProperty("created_unix")
    public Integer getCreatedUnix() {
        return createdUnix;
    }

    @JsonProperty("created_unix")
    public void setCreatedUnix(Integer createdUnix) {
        this.createdUnix = createdUnix;
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
