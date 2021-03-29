package com.uniloftsky.springframework.spring5geocodingservice.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.uniloftsky.springframework.spring5geocodingservice.api.model.GeoRequestDTO;
import com.uniloftsky.springframework.spring5geocodingservice.model.GeoRequest;

public interface GeoRequestService {

    GeoRequestDTO getRequest(String address) throws JsonProcessingException;

    void save(GeoRequestDTO dto);

    GeoRequest save(GeoRequest obj);

    void delete(GeoRequest obj);

}
