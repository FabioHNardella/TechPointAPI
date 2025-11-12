package com.techpoint.techpointRestAPI.controller;

import com.techpoint.techpointRestAPI.dtos.ClienteDTO;
import com.techpoint.techpointRestAPI.entity.Cliente;
import com.techpoint.techpointRestAPI.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public Cliente criarCliente(ClienteDTO dto){
        return service.criarCliente(dto);
    }
    @GetMapping
    public List<Cliente> listarClientes(){
        return service.listarClientes();
    }
    @GetMapping("/{id}")
    public Optional<Cliente> listarPorId(@PathVariable Long id){
        return service.listarPorId(id);
    }
}
