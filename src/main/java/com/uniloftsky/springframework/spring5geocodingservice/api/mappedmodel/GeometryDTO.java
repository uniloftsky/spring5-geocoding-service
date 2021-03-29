package com.uniloftsky.springframework.spring5geocodingservice.api.mappedmodel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeometryDTO {

    public GeometryDTO(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    private double lat;
    private double lng;

}
