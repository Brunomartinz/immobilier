/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.services;

import com.ninjastech.immobilier.entities.Cliente;
import com.ninjastech.immobilier.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Wesley
 */

@Service
public class ClienteService {
    
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
	
	public Cliente findById(Long id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.get();
	}
	
	public Cliente insertCliente(Cliente obj) {
		return clienteRepository.save(obj);
	}

	public List<Cliente> findEmail(String palavra) {
        String email = palavra+"%";
        System.out.println(email);
		return clienteRepository.findByEmail(email);
	}
	
	public void deletCliente(Cliente obj){
			clienteRepository.deleteById(obj.getId());
        }
	
	public Cliente editCliente(Cliente obj){
                return clienteRepository.save(obj);
        }
}
	
