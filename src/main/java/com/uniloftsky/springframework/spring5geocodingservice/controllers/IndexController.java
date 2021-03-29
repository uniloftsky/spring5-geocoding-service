package com.uniloftsky.springframework.spring5geocodingservice.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.uniloftsky.springframework.spring5geocodingservice.api.model.GeoRequestDTO;
import com.uniloftsky.springframework.spring5geocodingservice.service.GeoRequestService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/geocode")
public class IndexController {

    private final GeoRequestService geoRequestService;

    public IndexController(GeoRequestService geoRequestService) {
        this.geoRequestService = geoRequestService;
    }

    @GetMapping(params = "q")
    @ResponseStatus(HttpStatus.OK)
    public GeoRequestDTO getRequestDetails(@RequestParam("q") String query) throws JsonProcessingException {
        return geoRequestService.getRequest(query);
    }

}
