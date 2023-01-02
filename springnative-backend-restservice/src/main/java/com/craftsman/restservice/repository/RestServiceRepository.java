package com.craftsman.restservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.craftsman.restservice.domain.model.RestServiceBean;

@Repository
public interface RestServiceRepository extends CrudRepository<RestServiceBean, Long> {
}
