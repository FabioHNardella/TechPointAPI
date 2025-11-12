package com.techpoint.techpointRestAPI.service;

import com.techpoint.techpointRestAPI.dtos.ClienteDTO;
import com.techpoint.techpointRestAPI.entity.Cliente;
import com.techpoint.techpointRestAPI.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public Cliente criarCliente(ClienteDTO dto){
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        return repo.save(cliente);
    }
    public List<Cliente> listarClientes(){
        return repo.findAll();
    }
    public Optional<Cliente> listarPorId(long id){
        return repo.findById(id);
    }
}
