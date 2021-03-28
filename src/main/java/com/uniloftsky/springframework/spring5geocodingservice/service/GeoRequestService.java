package com.uniloftsky.springframework.spring5geocodingservice.service;


import com.uniloftsky.springframework.spring5geocodingservice.api.model.GeoRequestDTO;
import com.uniloftsky.springframework.spring5geocodingservice.model.GeoRequest;

public interface GeoRequestService {

//    GeoRequest findById(Long id);
    GeoRequestDTO getRequest(String address);
    GeoRequest save(GeoRequest obj);
    void delete(GeoRequest obj);

}
