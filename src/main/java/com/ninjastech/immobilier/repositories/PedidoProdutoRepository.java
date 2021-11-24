package com.ninjastech.immobilier.repositories;

import com.ninjastech.immobilier.entities.Pedido;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wesley
 */

@Repository
@Transactional
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    
}