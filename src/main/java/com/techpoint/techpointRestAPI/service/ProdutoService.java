package com.techpoint.techpointRestAPI.service;

import com.techpoint.techpointRestAPI.dtos.ProdutoDTO;
import com.techpoint.techpointRestAPI.entity.Produto;
import com.techpoint.techpointRestAPI.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo) {
        this.repo = repo;
    }

    public Produto criarProduto(ProdutoDTO dto){
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());
        produto.setEstoque(dto.getEstoque());
        return repo.save(produto);
    }
    public List<Produto> listarProdutos(){
        return repo.findAll();
    }
    public Optional<Produto> listarPorId(long id){
        return repo.findById(id);
    }
}
