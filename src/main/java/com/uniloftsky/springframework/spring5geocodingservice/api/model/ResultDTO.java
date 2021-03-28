package com.uniloftsky.springframework.spring5geocodingservice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultDTO {

    private String formatted;

    @JsonProperty("geometry")
    private GeometryDTO geometryDTO;

}
