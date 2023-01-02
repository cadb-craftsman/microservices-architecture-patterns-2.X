package com.craftsman.reactservice.services;

import com.craftsman.reactservice.domain.dto.ReactServiceDto;
import com.craftsman.reactservice.domain.exceptions.ReactServiceException;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IReactService {

	public Mono<ReactServiceDto> create(ReactServiceDto in) throws ReactServiceException;

	public Flux<ReactServiceDto> read() throws ReactServiceException;
	
	public Mono<ReactServiceDto> read(Long id) throws ReactServiceException;

	public Mono<ReactServiceDto> update(ReactServiceDto in) throws ReactServiceException;

	public Mono<ReactServiceDto> delete(ReactServiceDto in) throws ReactServiceException;

}
