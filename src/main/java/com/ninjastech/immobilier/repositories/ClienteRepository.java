package com.ninjastech.immobilier.repositories;

import com.ninjastech.immobilier.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

	  @Query("FROM Cliente WHERE email like ?1")
	  List<Cliente> findByEmail(String email);
          
          @Query("FROM Cliente WHERE cpf like ?1")
	  List<Cliente> findByCPF(String cpf);
}