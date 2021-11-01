package com.ninjastech.immobilier.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.ninjastech.immobilier.entities.Grupo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ninjastech.immobilier.entities.Categoria;
import com.ninjastech.immobilier.entities.Cliente;
import com.ninjastech.immobilier.entities.ClienteEndereco;
import com.ninjastech.immobilier.entities.Produto;
import com.ninjastech.immobilier.entities.Usuario;
import com.ninjastech.immobilier.repositories.CategoryRepository;
import com.ninjastech.immobilier.repositories.ClienteEnderecoRepository;
import com.ninjastech.immobilier.repositories.ClienteRepository;
import com.ninjastech.immobilier.repositories.ProdutoRepository;
import com.ninjastech.immobilier.repositories.UsuarioRepository;
import java.time.LocalDate;

@Configuration
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private UsuarioRepository usuarioRep;
        
        @Autowired
	private ClienteRepository clientRep;
        
        @Autowired
        private ClienteEnderecoRepository endRep;
        
        
	@Override
	public void run(String... args) throws Exception {

		// Popula Banco de Dados para teste ==>
		Categoria cat1 = new Categoria(null, "Quarto");
		Categoria cat2 = new Categoria(null, "Sala");
		Categoria cat3 = new Categoria(null, "Cozinha");
		Categoria cat4 = new Categoria(null, "Banheiro");


		Produto p1 = new Produto(1,"cama casal", "linda cama casal queen", 1870.50, "https://firebasestorage.googleapis.com/v0/b/pi4senac-221bd.appspot.com/o/88098684_2683507728543926_425182039814176768_n.jpg?alt=media&token=cba448da-52d5-4f0c-b690-78b2cbeb427f","ativo",5,20);
		Produto p2 = new Produto(2,"Armário de Cozinha", "linda cama casal queen", 300.25, "https://firebasestorage.googleapis.com/v0/b/pi4senac-221bd.appspot.com/o/88098684_2683507728543926_425182039814176768_n.jpg?alt=media&token=cba448da-52d5-4f0c-b690-78b2cbeb427f","Inativo",4,10);
		Produto p3 = new Produto(3,"Mesa Gamer", "Mesa gamer black piano", 250.00, "https://firebasestorage.googleapis.com/v0/b/pi4senac-221bd.appspot.com/o/88098684_2683507728543926_425182039814176768_n.jpg?alt=media&token=cba448da-52d5-4f0c-b690-78b2cbeb427f","ativo",2,5);
		Produto p4 = new Produto(4, "Armario Banheiro", "Armario banheiro com espelho", 700.25, "https://firebasestorage.googleapis.com/v0/b/pi4senac-221bd.appspot.com/o/88098684_2683507728543926_425182039814176768_n.jpg?alt=media&token=cba448da-52d5-4f0c-b690-78b2cbeb427f","ativo",3,9);

		Usuario user1 = new Usuario(1, "admin@email.com", "21232f297a57a5a743894a0e4a801fc3", "21232f297a57a5a743894a0e4a801fc3", "admin souza", "47983653867", "admin", "ativo");

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));

		usuarioRep.saveAll(Arrays.asList(user1));

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
                LocalDate localDate = LocalDate.parse("2000-04-08");
                Cliente cli1 = new Cliente(null,"Arnaldo Victor Yamawaki Alves","arnaldo@mail.com" ,"51325677892" ,"03945120" , "masculino", localDate, "202cb962ac59075b964b07152d234b70", "202cb962ac59075b964b07152d234b70", "Joao gomes pereira","298", "Jardim Tiete", "São Paulo", "SP");
                clientRep.saveAll(Arrays.asList(cli1));
                
                ClienteEndereco end = new ClienteEndereco("03945120", "João Gomes pereira","2", "Jardim Tiete", "São Paulo", "SP", true, "1", true);
                endRep.saveAll(Arrays.asList(end));
		}   


	}


