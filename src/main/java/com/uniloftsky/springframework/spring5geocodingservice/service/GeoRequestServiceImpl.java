package com.uniloftsky.springframework.spring5geocodingservice.service;

import com.uniloftsky.springframework.spring5geocodingservice.api.model.GeoRequestDTO;
import com.uniloftsky.springframework.spring5geocodingservice.api.model.ResultDTO;
import com.uniloftsky.springframework.spring5geocodingservice.exceptions.NotFoundException;
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

    public GeoRequestServiceImpl(RestTemplate restTemplate, GeoRequestRepository geoRequestRepository, @Value("${api.url}") String API_URL, @Value("${api.key}") String API_KEY) {
        this.restTemplate = restTemplate;
        this.geoRequestRepository = geoRequestRepository;
        this.API_URL = API_URL;
        this.API_KEY = API_KEY;
    }

    @Override
    public GeoRequestDTO getRequest(String address) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(API_URL)
                .queryParam("q", address)
                .queryParam("key", API_KEY);
        GeoRequestDTO result = restTemplate.getForObject(uriBuilder.toUriString(), GeoRequestDTO.class);
        if (result == null) {
            throw new NotFoundException("Result is null!");
        }
        save(result);
        return result;
    }

    @Override
    public void save(GeoRequestDTO dto) {
        for (ResultDTO v : dto.getResultDTOS()) {
            geoRequestRepository.save(new GeoRequest(v.getFormatted(), v.getGeometryDTO().getLat() + ", " + v.getGeometryDTO().getLng()));
        }
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
