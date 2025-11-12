package com.techpoint.techpointRestAPI.repository;

import com.techpoint.techpointRestAPI.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
