package com.uniloftsky.springframework.spring5geocodingservice.mapper;

import com.uniloftsky.springframework.spring5geocodingservice.api.model.GeoRequestDTO;
import com.uniloftsky.springframework.spring5geocodingservice.model.GeoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GeoRequestMapper {

    GeoRequestMapper INSTANCE = Mappers.getMapper(GeoRequestMapper.class);

    GeoRequestDTO geoRequestToDTO(GeoRequest geoRequest);

    GeoRequest DTOToGeoRequest(GeoRequestDTO geoRequestDTO);

}
