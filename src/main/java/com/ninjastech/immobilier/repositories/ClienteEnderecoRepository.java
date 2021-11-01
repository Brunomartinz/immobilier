package com.ninjastech.immobilier.repositories;

import com.ninjastech.immobilier.entities.ClienteEndereco;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wesley
 */

@Repository
public interface ClienteEnderecoRepository extends JpaRepository<ClienteEndereco, Long> {
    @Query("FROM ClienteEndereco WHERE Idcliente like ?1")
	  List<ClienteEndereco> findByIdcliente(String id);
}