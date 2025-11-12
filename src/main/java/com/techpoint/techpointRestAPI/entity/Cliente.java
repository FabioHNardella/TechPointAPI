package com.techpoint.techpointRestAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id", nullable = false)
    private long id;

    @Column(name = "cliente_nome", nullable = false)
    private String nome;

    @Column(name = "cliente_email", nullable = false, unique = true)
    private String email;

    @Column(name = "cliente_telefone")
    private String telefone;



}
