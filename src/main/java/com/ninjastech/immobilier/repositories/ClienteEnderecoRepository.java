package com.ninjastech.immobilier.repositories;

import com.ninjastech.immobilier.entities.ClienteEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wesley
 */

@Repository
public interface ClienteEnderecoRepository extends JpaRepository<ClienteEndereco, Long> {
    
}