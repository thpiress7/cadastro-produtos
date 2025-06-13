package com.thiago.cadastro_produtos.controller;

import com.thiago.cadastro_produtos.business.ProdutoService;
import com.thiago.cadastro_produtos.infrastructure.entitys.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Void> cadastrarProduto(@RequestBody Produto produto){
        produtoService.cadastrarProduto(produto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarTodosProdutos(){
        return ResponseEntity.ok(produtoService.listarTodosProdutos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> listarProdutoPorId(@PathVariable Long id){
        return ResponseEntity.ok(produtoService.listarProdutoPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarProdutoPorId(@PathVariable Long id, @RequestBody Produto produto){
        produtoService.atualizarProdutoPorId(id, produto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProdutoPorId(@PathVariable Long id){
        produtoService.deletarProdutoPorId(id);
        return ResponseEntity.ok().build();
    }

}
