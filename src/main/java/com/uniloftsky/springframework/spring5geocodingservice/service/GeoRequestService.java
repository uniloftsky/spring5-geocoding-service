package com.uniloftsky.springframework.spring5geocodingservice.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.uniloftsky.springframework.spring5geocodingservice.api.mappedmodel.GeoRequestDTO;
import com.uniloftsky.springframework.spring5geocodingservice.model.GeoRequestEntity;

public interface GeoRequestService {

    GeoRequestDTO getRequest(String address) throws JsonProcessingException;

    void save(GeoRequestDTO dto);

    GeoRequestEntity save(GeoRequestEntity obj);

    void delete(GeoRequestEntity obj);

}
