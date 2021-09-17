/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninjastech.immobilier.entities.Categoria;
import com.ninjastech.immobilier.services.CategoryService;

/**
 *
 * @author vitor.sas
 */

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResource {

	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll() {
		List<Categoria> list = service.findAll();
;		return  ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}") 
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
