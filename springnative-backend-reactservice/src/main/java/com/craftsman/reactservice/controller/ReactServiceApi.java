package com.craftsman.reactservice.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.craftsman.reactservice.domain.dto.ReactServiceDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/api/v1/reactservice")
public interface ReactServiceApi {

	/**
	 * PUT REST Service
	 */
	@Operation(operationId = "updateRecord", summary = "Update a record", tags = { "ReactService" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "record created"),
			@ApiResponse(responseCode = "400", description = "invalid user operation"),
			@ApiResponse(responseCode = "404", description = "url not found") })
	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.CONFLICT)
	@ResponseBody
	public ResponseEntity<Mono<ReactServiceDto>> putOperation(@Valid @RequestBody(required = true) ReactServiceDto in);

	/**
	 * POST REST Service
	 */
	@Operation(operationId = "createRecord", summary = "Create a record", tags = { "ReactService" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "record created"),
			@ApiResponse(responseCode = "400", description = "invalid user operation"),
			@ApiResponse(responseCode = "404", description = "url not found") })
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.CREATED)
	@ResponseBody
	public ResponseEntity<Mono<ReactServiceDto>> postOperation(@Valid @RequestBody ReactServiceDto in);

	/**
	 * DELETE REST Service
	 */
	@Operation(operationId = "deleteRecord", summary = "Delete a record", tags = { "ReactService" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "record created"),
			@ApiResponse(responseCode = "400", description = "invalid user operation"),
			@ApiResponse(responseCode = "404", description = "url not found") })
	@DeleteMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	@ResponseBody
	public ResponseEntity<Mono<ReactServiceDto>> deleteOperation(@Valid @RequestBody ReactServiceDto in);

	/**
	 * GET REST Service
	 */
	@Operation(operationId = "getRecordById", summary = "Get a record by id", tags = { "ReactService" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "record created"),
			@ApiResponse(responseCode = "400", description = "invalid user operation"),
			@ApiResponse(responseCode = "404", description = "url not found") })
	@GetMapping(value = "{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ResponseEntity<Mono<ReactServiceDto>> getOperation(@PathVariable(value = "id") Long id);

	/**
	 * GET REST Service
	 */
	@Operation(operationId = "getAllRecords", summary = "Get all records", tags = { "ReactService" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "record created"),
			@ApiResponse(responseCode = "400", description = "invalid user operation"),
			@ApiResponse(responseCode = "404", description = "url not found") })
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ResponseEntity<Flux<ReactServiceDto>>  getOperation();



}
