package com.techpoint.techpointRestAPI.controller;

import com.techpoint.techpointRestAPI.dtos.ProdutoDTO;
import com.techpoint.techpointRestAPI.entity.Produto;
import com.techpoint.techpointRestAPI.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto criarProduto(ProdutoDTO dto){
        return service.criarProduto(dto);
    }
    @GetMapping
    public List<Produto> listarProdutos(){
        return service.listarProdutos();
    }
    @GetMapping("/{id}")
    public Optional<Produto> listarPorId(@PathVariable Long id){
        return service.listarPorId(id);
    }
}
