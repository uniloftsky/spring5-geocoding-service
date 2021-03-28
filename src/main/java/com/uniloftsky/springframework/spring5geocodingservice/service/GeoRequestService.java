package com.uniloftsky.springframework.spring5geocodingservice.service;

import com.uniloftsky.springframework.spring5geocodingservice.model.GeoRequest;

import java.util.Set;

public interface GeoRequestService {

    GeoRequest findById(Long id);
    Set<GeoRequest> findAll();
    GeoRequest save(GeoRequest obj);
    void delete(GeoRequest obj);

}
