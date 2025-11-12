package com.techpoint.techpointRestAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produto_id", nullable = false)
    private long id;

    @Column(name = "produto_nome", nullable = false)
    private String nome;

    @Column(name = "produto_preco", nullable = false)
    private double preco;

    @Column(name = "produto_estoque", nullable = false)
    private int estoque;


}
