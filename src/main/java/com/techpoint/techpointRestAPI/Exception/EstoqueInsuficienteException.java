package com.techpoint.techpointRestAPI.Exception;

public class EstoqueInsuficienteException extends RuntimeException {
    public EstoqueInsuficienteException() {
        super("Não há produto em estoque no momento!");
    }
}