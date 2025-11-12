package com.techpoint.techpointRestAPI.Exception;

public class QuantidadeExcedidaError extends RuntimeException {
    public QuantidadeExcedidaError() {
        super("Quantidade de venda maior do que a permitida! (1)");
    }
}
