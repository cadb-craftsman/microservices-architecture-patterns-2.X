package com.craftsman.functionservice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.craftsman.functionservice.domain.dto.ReactServiceDto;
import com.craftsman.functionservice.domain.mappers.ReactServiceFactoryMapper;
import com.craftsman.functionservice.repository.ReactServiceRepository;
import com.craftsman.functionservice.services.IReactService;

@DisplayName("RestServiceApiTest")
@ActiveProfiles("integration")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ReactServiceApiTest {

	@Autowired
	IReactService service;
	@Autowired
	ReactServiceFactoryMapper mapper;
	@Autowired
	ReactServiceRepository repository;

	private static ReactServiceDto in;
	
	@BeforeAll
	static void initAll() {
		in = new ReactServiceDto(1L, "Product", "Product Description");
	}

}
