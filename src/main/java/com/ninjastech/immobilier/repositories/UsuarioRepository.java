package com.ninjastech.immobilier.repositories;

import com.ninjastech.immobilier.entities.Produto;
import com.ninjastech.immobilier.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    //procurar pelo email do Usuario
//    @Query("FROM Usuario WHERE email ?1")
//    List<Usuario> findByemail(String email);
	
	  @Query("FROM Usuario WHERE email like ?1")
	    List<Usuario> findByEmail(String email);
}
