package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.model.Produto;



public interface ProdutoRepository extends JpaRepository<Produto, Long> {
  
    List<Produto> findAllByPreco(double preco);
}
