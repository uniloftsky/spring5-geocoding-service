package com.uniloftsky.springframework.spring5geocodingservice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GeoRequestDTO {

    @JsonProperty("results")
    List<ResultDTO> resultDTOS = new ArrayList<>();

}
