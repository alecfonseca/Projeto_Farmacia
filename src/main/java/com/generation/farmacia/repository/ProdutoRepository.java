package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	public List<Produto> findByPrecoBetween(BigDecimal preco1, BigDecimal preco2);
	
	public List<Produto> findAllByNomeContainingIgnoringCaseAndLaboratorioContainingIgnoringCase (String nome, String laboratorio);

}