package com.ninjastech.immobilier.repositories;

import com.ninjastech.immobilier.entities.PedidoProduto;
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
public interface PedidoProdutoRepository extends JpaRepository<PedidoProduto, Long> {
    
    @Query("FROM PedidoProduto WHERE idPedido = ?1")
    List<PedidoProduto> findByIdPedido(long idPedido);
}