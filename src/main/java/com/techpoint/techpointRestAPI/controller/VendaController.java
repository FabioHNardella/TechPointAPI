package com.techpoint.techpointRestAPI.controller;

import com.techpoint.techpointRestAPI.dtos.ProdutoDTO;
import com.techpoint.techpointRestAPI.dtos.VendaDTO;
import com.techpoint.techpointRestAPI.entity.Produto;
import com.techpoint.techpointRestAPI.entity.Venda;
import com.techpoint.techpointRestAPI.service.VendaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/venda")
public class VendaController {
    private final VendaService service;

    public VendaController(VendaService service) {
        this.service = service;
    }

    @PostMapping
    public Venda criarVenda(VendaDTO dto){
        return service.criarVenda(dto);
    }

    @GetMapping
    public List<Venda> listarVendas(){
        return service.listarVendas();
    }

    @GetMapping("/cliente/{id}")
    public List<Venda> listarPorClienteId(@PathVariable Long id){
        return service.listarPorClienteId(id);
    }
    @GetMapping("/produto/{id}")
    public List<Venda> listarPorProdutoId(@PathVariable Long id){
        return service.listarPorProdutoId(id);
    }
}
