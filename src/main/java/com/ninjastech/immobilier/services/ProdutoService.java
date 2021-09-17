/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjastech.immobilier.entities.Produto;
import com.ninjastech.immobilier.repositories.ProdutoRepository;

/**
 *
 * @author Bruno M.
 */

@Service
public class ProdutoService {
    
	@Autowired
	private ProdutoRepository produtoRepository;
	
	// Lista todos os produtos 
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}
	
	// Busca o produto pelo Id
	public Produto findById(Long id) {
		Optional<Produto> obj = produtoRepository.findById(id);
		return obj.get();
	}
	
	// Insere no banco de dados um novo objeto do tipo Produto
	public Produto insertProduto(Produto obj) {
		return produtoRepository.save(obj);
		
	}
	
}
	
