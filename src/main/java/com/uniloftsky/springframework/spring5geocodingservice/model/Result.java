package com.uniloftsky.springframework.spring5geocodingservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Result extends BaseEntity {

    private String formatted;

    @ManyToOne
    @JsonProperty("geometry")
    private Geometry geometry;

}
