package com.techpoint.techpointRestAPI.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDTO {
    private String nome;
    private double preco;
    private int estoque;
}
