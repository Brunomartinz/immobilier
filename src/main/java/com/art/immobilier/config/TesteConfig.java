package com.art.immobilier.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.art.immobilier.model.Categoria;
import com.art.immobilier.model.Produto;
import com.art.immobilier.repository.CategoryRepository;
import com.art.immobilier.repository.ProdutoRepository;

@Configuration
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {

		// Popula Banco de Dados para teste ==>
		Categoria cat1 = new Categoria(null, "Quarto");
		Categoria cat2 = new Categoria(null, "Sala");
		Categoria cat3 = new Categoria(null, "Cozinha");
		Categoria cat4 = new Categoria(null, "Banheiro");

		// salva no banco de dados ==>

		Produto p1 = new Produto(null, "cama casal", "linda cama casal queen", 1872, "");
		Produto p2 = new Produto(null, "Armário de Cozinha", "linda cama casal queen", 300, "");
		Produto p3 = new Produto(null, "Mesa Gamer", "Mesa gamer black piano", 250, "");
		Produto p4 = new Produto(null, "Armario Banheiro", "Armario banheiro com espelho", 700, "");

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
		
		// associando a categoria aos produtos
		p1.getCategorias().add(cat1);
		p2.getCategorias().add(cat2);
		p3.getCategorias().add(cat3);
		p4.getCategorias().add(cat4);

		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
		

	}

}
