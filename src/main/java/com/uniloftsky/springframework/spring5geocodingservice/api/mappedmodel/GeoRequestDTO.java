package com.uniloftsky.springframework.spring5geocodingservice.api.mappedmodel;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GeoRequestDTO {

    public GeoRequestDTO(List<ResultDTO> results) {
        this.results = results;
    }

    List<ResultDTO> results = new ArrayList<>();

}
