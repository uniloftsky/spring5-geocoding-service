package com.uniloftsky.springframework.spring5geocodingservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uniloftsky.springframework.spring5geocodingservice.api.model.GeoRequestDTO;
import com.uniloftsky.springframework.spring5geocodingservice.model.GeoRequest;
import com.uniloftsky.springframework.spring5geocodingservice.repositories.GeoRequestRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
    public GeoRequestDTO getRequest(String query) throws JsonProcessingException {
        UriComponentsBuilder uriBuilder =
                UriComponentsBuilder.fromUriString(API_URL)
                        .queryParam("key", API_KEY)
                        .queryParam("q", query);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(getJsonString(uriBuilder.toUriString()), GeoRequestDTO.class);
    }

    private String getJsonString(String uri) {
        URL url = null;
        StringBuffer content = null;
        try {
            url = new URL(uri);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    @Override
    public void save(GeoRequestDTO dto) {
/*        for (ResultDTO v : dto.getResultDTOS()) {
            geoRequestRepository.save(new GeoRequest(v.getFormatted(), v.getGeometryDTO().getLat() + ", " + v.getGeometryDTO().getLng()));
        }*/
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
