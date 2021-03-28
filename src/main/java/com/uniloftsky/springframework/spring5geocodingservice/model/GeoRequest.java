package com.uniloftsky.springframework.spring5geocodingservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class GeoRequest extends BaseEntity {

    @OneToMany
    @JsonProperty("results")
    List<Result> result = new ArrayList<>();

}
