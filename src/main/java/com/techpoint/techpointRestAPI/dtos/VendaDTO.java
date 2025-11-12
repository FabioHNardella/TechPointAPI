package com.techpoint.techpointRestAPI.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.techpoint.techpointRestAPI.entity.Cliente;
import com.techpoint.techpointRestAPI.entity.Produto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class VendaDTO {
    private Long idCliente;
    private Long idProduto;
    private int quantidade;
    private double precoUnitario;
    private double total;
    private LocalDate dataVenda;
}
