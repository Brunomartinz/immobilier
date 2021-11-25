package com.ninjastech.immobilier.repositories;

import com.ninjastech.immobilier.entities.Pedido;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wesley
 */

@Repository
@Transactional
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    
    
    @Query("FROM Pedido WHERE idcliente like ?1")
	    List<Pedido> findByCliente(int id);
    
}