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

import com.ninjastech.immobilier.entities.Categoria;
import com.ninjastech.immobilier.repositories.CategoryRepository;

/**
 *
 * @author Bruno M.
 */

@Service
public class CategoryService {
    
	@Autowired
	private CategoryRepository repository;
	
	public List<Categoria> findAll() {
		return repository.findAll();
	}
	
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.get();
	}
}