package com.uniloftsky.springframework.spring5geocodingservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class GeoRequest extends BaseEntity {

    public GeoRequest() {
    }

    public GeoRequest(String formatted, String location) {
        this.formatted = formatted;
        this.location = location;
    }

    private String formatted;
    private String location;

}
