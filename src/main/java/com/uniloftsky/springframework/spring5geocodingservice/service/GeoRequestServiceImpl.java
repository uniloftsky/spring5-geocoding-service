package com.uniloftsky.springframework.spring5geocodingservice.service;

import com.uniloftsky.springframework.spring5geocodingservice.model.GeoRequest;
import com.uniloftsky.springframework.spring5geocodingservice.repositories.GeoRequestRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class GeoRequestServiceImpl implements GeoRequestService {

    private final GeoRequestRepository geoRequestRepository;

    public GeoRequestServiceImpl(GeoRequestRepository geoRequestRepository) {
        this.geoRequestRepository = geoRequestRepository;
    }

    @Override
    public GeoRequest findById(Long id) {
        Optional<GeoRequest> geoRequestOptional = geoRequestRepository.findById(id);
        if (geoRequestOptional.isEmpty()) {
            throw new NullPointerException("Excepted request not found");
        }
        return geoRequestOptional.get();
    }

    @Override
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
    }
}
