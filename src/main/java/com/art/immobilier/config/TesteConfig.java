package com.art.immobilier.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.art.immobilier.model.Categoria;
import com.art.immobilier.model.Produto;
import com.art.immobilier.repository.CategoryRepository;

@Configuration
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Popula Banco de Dados para teste ==>
		Categoria cat1 = new Categoria(null,"Quarto");
		Categoria cat2 = new Categoria(null,"Sala");
		Categoria cat3 = new Categoria(null,"Cozinha");
		
		// salva no banco de dados ==>
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		//Popula Banco de dados para teste ==>
		Produto p1 = new Produto();
		
	}
}
	