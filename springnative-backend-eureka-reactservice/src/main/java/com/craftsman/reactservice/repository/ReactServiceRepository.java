package com.craftsman.reactservice.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.craftsman.reactservice.domain.model.ReactServiceEntity;

@Repository
public interface ReactServiceRepository extends R2dbcRepository<ReactServiceEntity, Long> {
}
