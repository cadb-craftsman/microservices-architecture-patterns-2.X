package com.craftsman.functionservice.repository;


import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.craftsman.functionservice.domain.model.ReactServiceBean;

@Repository
public interface ReactServiceRepository extends R2dbcRepository<ReactServiceBean, Long> {
}
