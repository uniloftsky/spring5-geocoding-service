package com.uniloftsky.springframework.spring5geocodingservice.service;

import com.uniloftsky.springframework.spring5geocodingservice.api.model.GeoRequestDTO;
import com.uniloftsky.springframework.spring5geocodingservice.mapper.GeoRequestMapper;
import com.uniloftsky.springframework.spring5geocodingservice.model.GeoRequest;
import com.uniloftsky.springframework.spring5geocodingservice.repositories.GeoRequestRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class GeoRequestServiceImpl implements GeoRequestService {

    private final RestTemplate restTemplate;
    private final GeoRequestRepository geoRequestRepository;
    private final String API_KEY;
    private final String API_URL;
    private final GeoRequestMapper geoRequestMapper;

    public GeoRequestServiceImpl(RestTemplate restTemplate, GeoRequestRepository geoRequestRepository, @Value("${api.url}") String API_URL, @Value("${api.key}") String API_KEY, GeoRequestMapper geoRequestMapper) {
        this.restTemplate = restTemplate;
        this.geoRequestRepository = geoRequestRepository;
        this.API_URL = API_URL;
        this.API_KEY = API_KEY;
        this.geoRequestMapper = geoRequestMapper;
    }

//    @Override
//    public GeoRequest findById(Long id) {
//        Optional<GeoRequest> geoRequestOptional = geoRequestRepository.findById(id);
//        if (geoRequestOptional.isEmpty()) {
//            throw new NullPointerException("Excepted request not found");
//        }
//        return geoRequestOptional.get();
//    }

    @Override
    public GeoRequestDTO getRequest(String address) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(API_URL)
                .queryParam("q", address)
                .queryParam("key", API_KEY);
        GeoRequestDTO result = restTemplate.getForObject(uriBuilder.toUriString(), GeoRequestDTO.class);
        save(geoRequestMapper.DTOToGeoRequest(result));
        return result;
    }

    @Override
    public GeoRequest save(GeoRequest obj) {
        return geoRequestRepository.save(obj);
    }

    @Override
    public void delete(GeoRequest obj) {
        geoRequestRepository.delete(obj);
    }
}
