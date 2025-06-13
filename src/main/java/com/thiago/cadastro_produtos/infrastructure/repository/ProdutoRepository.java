package com.thiago.cadastro_produtos.infrastructure.repository;

import com.thiago.cadastro_produtos.infrastructure.entitys.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    
}
