package com.craftsman.restservice.domain.mappers;

import org.mapstruct.Mapper;

import com.craftsman.restservice.domain.dto.RestServiceDto;
import com.craftsman.restservice.domain.model.RestServiceBean;

@Mapper
public interface RestServiceFactoryMapper {
	
	RestServiceBean mapToRestServiceEntity(RestServiceDto d);
	
	RestServiceDto mapToRestServiceDto(RestServiceBean e);

}
