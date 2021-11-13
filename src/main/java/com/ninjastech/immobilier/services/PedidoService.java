package com.ninjastech.immobilier.services;

import com.ninjastech.immobilier.entities.Pedido;
import com.ninjastech.immobilier.repositories.PedidoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wesley
 */
@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    public Pedido findById(Long id) {
        Optional<Pedido> obj = pedidoRepository.findById(id);
        return obj.get();
    }

    public Pedido insertPedido(Pedido obj) {
        return pedidoRepository.save(obj);
    }

    public void deletPedido(Pedido obj) {
        pedidoRepository.deleteById(obj.getId());
    }

    public Pedido editPedido(Pedido obj) {
        return pedidoRepository.save(obj);
    }
}
