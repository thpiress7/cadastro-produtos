package com.thiago.cadastro_produtos.business;

import com.thiago.cadastro_produtos.infrastructure.entitys.Produto;
import com.thiago.cadastro_produtos.infrastructure.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public void cadastrarProduto(Produto produto){
        repository.saveAndFlush(produto);
    }

    public List<Produto> listarTodosProdutos(){
        List<Produto> produtos = repository.findAll();
        if (produtos.isEmpty()){
            throw new RuntimeException("Nenhum produto cadastrado.");
        }
        return produtos;
    }

    public Produto listarProdutoPorId(Long id){
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("Nenhum produto encontrado.")
        );
    }

    public void atualizarProdutoPorId(Long id, Produto produto){
        Produto produtoEntity = repository.findById(id).orElseThrow(() ->
                new RuntimeException("Produto não encontrado."));
        Produto produtoAtualizado = Produto.builder()
                .nome(produto.getNome() != null ? produto.getNome() : produtoEntity.getNome())
                .preco(produto.getPreco() != null ? produto.getPreco() : produtoEntity.getPreco())
                .quantidade(produto.getQuantidade() != null ? produto.getQuantidade() : produtoEntity.getQuantidade())
                .id(produtoEntity.getId())
                .build();
        repository.saveAndFlush(produtoAtualizado);
    }

    public void deletarProdutoPorId(Long id){
        repository.deleteById(id);
    }

}
