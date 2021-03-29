
package com.uniloftsky.springframework.spring5geocodingservice.api.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "drive_on",
    "road",
    "speed_in"
})
public class Roadinfo {

    @JsonProperty("drive_on")
    private String driveOn;
    @JsonProperty("road")
    private String road;
    @JsonProperty("speed_in")
    private String speedIn;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("drive_on")
    public String getDriveOn() {
        return driveOn;
    }

    @JsonProperty("drive_on")
    public void setDriveOn(String driveOn) {
        this.driveOn = driveOn;
    }

    @JsonProperty("road")
    public String getRoad() {
        return road;
    }

    @JsonProperty("road")
    public void setRoad(String road) {
        this.road = road;
    }

    @JsonProperty("speed_in")
    public String getSpeedIn() {
        return speedIn;
    }

    @JsonProperty("speed_in")
    public void setSpeedIn(String speedIn) {
        this.speedIn = speedIn;
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
