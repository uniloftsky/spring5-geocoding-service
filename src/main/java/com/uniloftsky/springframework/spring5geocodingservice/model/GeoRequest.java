package com.uniloftsky.springframework.spring5geocodingservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class GeoRequest extends BaseEntity {

    private String address;

    @ManyToOne
    private Location location;

}
