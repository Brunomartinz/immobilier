package com.ninjastech.immobilier.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import com.ninjastech.immobilier.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.ninjastech.immobilier.entities.Categoria;
import com.ninjastech.immobilier.entities.Produto;
import com.ninjastech.immobilier.repositories.CategoryRepository;
import com.ninjastech.immobilier.repositories.ProdutoRepository;

@Configuration
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private UsuarioRepository usuarioRep;

	@Override
	public void run(String... args) throws Exception {

		// Popula Banco de Dados para teste ==>
		Categoria cat1 = new Categoria(null, "Quarto");
		Categoria cat2 = new Categoria(null, "Sala");
		Categoria cat3 = new Categoria(null, "Cozinha");
		Categoria cat4 = new Categoria(null, "Banheiro");


		Produto p1 = new Produto(1,"cama casal", "linda cama casal queen", 1870.50, "https://firebasestorage.googleapis.com/v0/b/pi4senac-221bd.appspot.com/o/1633197339914-images.jpg?alt=media&token=57ec7f09-fc0b-4511-b5f9-01740966d568","ativo",5,20);
		Produto p2 = new Produto(2,"Armário de Cozinha", "linda cama casal queen", 300.25, "https://firebasestorage.googleapis.com/v0/b/pi4senac-221bd.appspot.com/o/1633197339914-images.jpg?alt=media&token=57ec7f09-fc0b-4511-b5f9-01740966d568","Inativo",4,10);
		Produto p3 = new Produto(3,"Mesa Gamer", "Mesa gamer black piano", 250.00, "https://firebasestorage.googleapis.com/v0/b/pi4senac-221bd.appspot.com/o/1633197339914-images.jpg?alt=media&token=57ec7f09-fc0b-4511-b5f9-01740966d568","ativo",2,5);
		Produto p4 = new Produto(4, "Armario Banheiro", "Armario banheiro com espelho", 700.25, "https://firebasestorage.googleapis.com/v0/b/pi4senac-221bd.appspot.com/o/1633197339914-images.jpg?alt=media&token=57ec7f09-fc0b-4511-b5f9-01740966d568","ativo",3,9);

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
		
		// associando a categoria aos produtos
		p1.getCategorias().add(cat1);
		p2.getCategorias().add(cat2);
		p3.getCategorias().add(cat3);
		p4.getCategorias().add(cat4);

		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));

		//CRIAR UMA DATA
		final String dateStr = "02-17-2001";
		final DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		final Date date = df.parse(dateStr);


		}
		

	}


