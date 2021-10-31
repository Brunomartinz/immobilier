/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.resources;

import com.ninjastech.immobilier.entities.Cliente;
import com.ninjastech.immobilier.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

/**
 *
 * @author Wesley
 */

@RestController
@RequestMapping(value = "/cliente")
@ComponentScan(basePackages = { "com.*" })
public class ClienteResource {

	@Autowired
	private ClienteService service;

	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		List<Cliente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Long id) {
		Cliente obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
        
	@GetMapping(value = "/pesquisa/{email}")
	public ResponseEntity<List<Cliente>> findNome(@PathVariable String email) {
		List<Cliente> list = service.findEmail(email);
		return ResponseEntity.ok().body(list);
	}
        @GetMapping(value = "/pesquisa/cpf/{cpf}")
	public ResponseEntity<List<Cliente>> findCpf(@PathVariable String cpf) {
		List<Cliente> list = service.findCPF(cpf);
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> insert(@RequestBody Cliente obj) {
		obj = service.insertCliente(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping(value = "/excluir")
	public void delete(@Valid @RequestBody Cliente obj) {
		service.deletCliente(obj);
	}
        
	@PostMapping(value = "/editar")
	public ResponseEntity<Cliente> edit(@Valid @RequestBody Cliente obj) {
		obj = service.editCliente(obj);
        return ResponseEntity.ok().body(obj);
	}

}
