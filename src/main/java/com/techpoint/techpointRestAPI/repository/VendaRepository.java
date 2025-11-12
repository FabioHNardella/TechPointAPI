package com.techpoint.techpointRestAPI.repository;

import com.techpoint.techpointRestAPI.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendaRepository extends JpaRepository<Venda, Long> {
    List<Venda> findAllByClienteId(Long clienteId);
    List<Venda> findAllByProdutoId(Long produtoId);

}
