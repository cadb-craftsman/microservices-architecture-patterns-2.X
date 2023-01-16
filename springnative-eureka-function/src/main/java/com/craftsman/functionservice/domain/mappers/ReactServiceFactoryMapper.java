package com.craftsman.functionservice.domain.mappers;

import org.mapstruct.Mapper;

import com.craftsman.functionservice.domain.dto.ReactServiceDto;
import com.craftsman.functionservice.domain.model.ReactServiceBean;

@Mapper
public interface ReactServiceFactoryMapper {
	
	ReactServiceBean toReactServiceEntity(ReactServiceDto d);
	
	ReactServiceDto toReactServiceDto(ReactServiceBean e);

}
