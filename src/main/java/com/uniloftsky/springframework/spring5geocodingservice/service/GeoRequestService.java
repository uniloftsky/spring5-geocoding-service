package com.uniloftsky.springframework.spring5geocodingservice.service;


import com.uniloftsky.springframework.spring5geocodingservice.api.model.GeoRequestDTO;

public interface GeoRequestService {

//    GeoRequest findById(Long id);
    GeoRequestDTO getRequest(String address);
//    Set<GeoRequest> findAll();
//    GeoRequest save(GeoRequest obj);
//    void delete(GeoRequest obj);

}
