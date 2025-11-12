package com.techpoint.techpointRestAPI.repository;

import com.techpoint.techpointRestAPI.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
