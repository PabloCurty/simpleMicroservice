package com.curty.simpleMicroservice.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {

    @NotNull(message = "Id is required")
    private Long id;

    @NotEmpty(message = "Name is required")
    @NotNull(message = "Name is required")
    private String name;
}
