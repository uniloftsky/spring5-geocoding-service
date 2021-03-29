package com.uniloftsky.springframework.spring5geocodingservice.api.mappedmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultDTO {

    public ResultDTO(String formatted, GeometryDTO geometryDTO) {
        this.formatted = formatted;
        this.geometryDTO = geometryDTO;
    }

    private String formatted;
    @JsonProperty("geometry")
    private GeometryDTO geometryDTO;

}
