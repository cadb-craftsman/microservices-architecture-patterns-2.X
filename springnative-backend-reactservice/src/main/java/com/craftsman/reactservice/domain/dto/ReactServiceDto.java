package com.craftsman.reactservice.domain.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReactServiceDto {
	@NotNull(message = "El id no puede ser nulo.")
	@Positive(message = "El id debe ser un numero igual o superior a uno.")
	Long id;
	@NotBlank(message = "El nombre no puede estar vacio.")
	String name;
	@NotBlank(message = "La descripcion no puede estar vacia.")
	String description;
}
