package com.uniloftsky.springframework.spring5geocodingservice.service;

import com.uniloftsky.springframework.spring5geocodingservice.api.model.GeoRequestDTO;
import com.uniloftsky.springframework.spring5geocodingservice.repositories.GeoRequestRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class GeoRequestServiceImpl implements GeoRequestService {

    private final RestTemplate restTemplate;
    private final GeoRequestRepository geoRequestRepository;
    private final String API_KEY = "df4533513d7045b59536aa891483a379";
    private final String API_URL;

    public GeoRequestServiceImpl(RestTemplate restTemplate, GeoRequestRepository geoRequestRepository, @Value("${api.url}") String API_URL) {
        this.restTemplate = restTemplate;
        this.geoRequestRepository = geoRequestRepository;
        this.API_URL = API_URL;
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
        return restTemplate.getForObject(uriBuilder.toUriString(), GeoRequestDTO.class);
    }

/*    @Override
    public Set<GeoRequest> findAll() {
        Set<GeoRequest> requests = new HashSet<>();
        geoRequestRepository.findAll().iterator().forEachRemaining(requests::add);
        return requests;
    }

    @Override
    public GeoRequest save(GeoRequest obj) {
        return geoRequestRepository.save(obj);
    }

    @Override
    public void delete(GeoRequest obj) {
        geoRequestRepository.delete(obj);
    }*/
}
