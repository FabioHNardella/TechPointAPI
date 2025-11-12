package com.techpoint.techpointRestAPI.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class ClienteDTO {
    private String nome;
    private String email;
    private String telefone;
}
