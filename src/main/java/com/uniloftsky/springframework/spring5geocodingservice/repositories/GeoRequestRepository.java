package com.uniloftsky.springframework.spring5geocodingservice.repositories;

import com.uniloftsky.springframework.spring5geocodingservice.model.GeoRequestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoRequestRepository extends CrudRepository<GeoRequestEntity, Long> {
}
