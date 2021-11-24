package com.ninjastech.immobilier.services;

import com.ninjastech.immobilier.entities.PedidoProduto;
import com.ninjastech.immobilier.repositories.PedidoProdutoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wesley
 */

@Service
public class PedidoProdutoService {

    @Autowired
    private PedidoProdutoRepository pedidoProdutoRepository;

    public List<PedidoProduto> findAll() {
        return pedidoProdutoRepository.findAll();
    }

    public List<PedidoProduto> findById(Long id) {
        List<PedidoProduto> pedidos = pedidoProdutoRepository.findByIdPedido(id);
        return pedidos;
    }

    public PedidoProduto insertPedido(PedidoProduto obj) {
        return pedidoProdutoRepository.save(obj);
    }
}