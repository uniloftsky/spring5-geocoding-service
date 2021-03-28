package com.uniloftsky.springframework.spring5geocodingservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Location extends BaseEntity {

    private float lat;
    private float lng;

}
