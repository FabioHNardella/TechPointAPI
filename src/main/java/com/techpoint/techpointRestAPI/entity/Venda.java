package com.techpoint.techpointRestAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venda_id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Column(name = "venda_quantidade")
    private int quantidade;

    @Column(name = "venda_preco_unitario")
    private double precoUnitario;

    @Column(name = "venda_total")
    private double total;

    private LocalDate dataVenda;

}
