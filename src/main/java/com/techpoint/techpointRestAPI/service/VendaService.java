package com.techpoint.techpointRestAPI.service;

import com.techpoint.techpointRestAPI.Exception.EstoqueInsuficienteException;
import com.techpoint.techpointRestAPI.Exception.QuantidadeExcedidaError;
import com.techpoint.techpointRestAPI.dtos.VendaDTO;
import com.techpoint.techpointRestAPI.entity.Cliente;
import com.techpoint.techpointRestAPI.entity.Produto;
import com.techpoint.techpointRestAPI.entity.Venda;
import com.techpoint.techpointRestAPI.repository.ClienteRepository;
import com.techpoint.techpointRestAPI.repository.ProdutoRepository;
import com.techpoint.techpointRestAPI.repository.VendaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VendaService {
    private final VendaRepository vendaRepo;
    private final ProdutoRepository prodRepo;
    private final ClienteRepository clienteRepo;

    public VendaService(VendaRepository repo, ProdutoRepository prodRepo, ClienteRepository clienteRepo) {
        this.vendaRepo = repo;
        this.prodRepo = prodRepo;
        this.clienteRepo = clienteRepo;
    }

    public Venda criarVenda(VendaDTO dto){
        Venda venda = new Venda();
        Produto produto = prodRepo.findById(dto.getIdProduto()).orElse(null);
        Cliente cliente = clienteRepo.findById(dto.getIdCliente()).orElse(null);


        if(produto.getEstoque() < 0){
            throw new EstoqueInsuficienteException();
        }
        if(dto.getQuantidade() > 1){
            throw new QuantidadeExcedidaError();
        }

        venda.setCliente(cliente);
        venda.setProduto(produto);
        venda.setQuantidade(dto.getQuantidade());
        venda.setPrecoUnitario(produto.getPreco());
        double total = venda.getQuantidade() * venda.getPrecoUnitario();
        venda.setTotal(total);
        venda.setDataVenda(LocalDate.now());

        // Desafio que o professor falou lá

           // atualiza apenas o estoque do produto
           produto.setEstoque(produto.getEstoque() - 1);

           // atualiza no banco de dados
           prodRepo.save(produto);

        return vendaRepo.save(venda);
    }

    public List<Venda> listarPorClienteId(Long id){
        return vendaRepo.findAllByClienteId(id);
    }
    public List<Venda> listarPorProdutoId(Long id){
        return vendaRepo.findAllByProdutoId(id);
    }

    public List<Venda> listarVendas() {
       return vendaRepo.findAll();
    }
}
