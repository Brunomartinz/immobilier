/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import com.ninjastech.immobilier.entities.Produto;
import com.ninjastech.immobilier.services.ProdutoService;

/**
 *
 * @author Bruno M.
 */

@RestController
@RequestMapping(value = "/produto")
@ComponentScan(basePackages = { "com.*" })
public class ProdutoResource {

	@Autowired
	private ProdutoService service;

	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
        
	@GetMapping(value = "/pesquisa/{nome}")
	public ResponseEntity<List<Produto>> findNome(@PathVariable String nome) {
		List<Produto> list = service.findNome(nome);
		return ResponseEntity.ok().body(list);

	}
	
	@PostMapping
	public ResponseEntity<Produto> insert(@RequestBody Produto obj) {
		obj = service.insertProduto(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping(value = "/excluir")
	public void delete(@Valid @RequestBody Produto obj) {
                    service.deletProduto(obj);

	}
        
	@PostMapping(value = "/editar")
	public ResponseEntity<Produto> edit(@Valid @RequestBody Produto obj) {
                   obj = service.editProduto(obj);
                   return ResponseEntity.ok().body(obj);

	}

}
