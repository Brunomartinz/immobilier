/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.services;

import com.ninjastech.immobilier.entities.Imagens;
import com.ninjastech.immobilier.repositories.ImagensRepository;
import java.util.List;
import java.util.Optional;
import static javassist.CtMethod.ConstParameter.integer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arnaldo
 */
@Service
public class ImagensService {
    @Autowired
	private ImagensRepository imagensRepository ;
	
	// Lista todos os produtos 
	public List<Imagens> findAll() {
		return imagensRepository.findAll();
	}
		// Busca o produto pelo Id do Produto
	public List<Imagens> findById(long id) {
		return imagensRepository.findByIdProd(id);
	}
        // Apaga a imagem do banco
	public void deletImagen(Imagens obj){
        imagensRepository.deleteById(obj.getId());
        }
	// Insere no banco de dados um novo objeto do tipo Produto
	public Imagens insertImagen(Imagens obj) {
		return imagensRepository.save(obj);
		
	}
}
