/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.immobilier.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.immobilier.model.Produto;
import com.art.immobilier.repository.service.ProdutoService;

/**
 *
 * @author Bruno M.
 */

@RestController
@RequestMapping(value = "/produto")
public class ProdutoEntity {

	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = service.findAll();
;		return  ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}") 
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
