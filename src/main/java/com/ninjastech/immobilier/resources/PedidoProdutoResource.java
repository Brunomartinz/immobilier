package com.ninjastech.immobilier.resources;

import com.ninjastech.immobilier.entities.PedidoProduto;
import com.ninjastech.immobilier.services.PedidoProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wesley
 */

@RestController
@RequestMapping(value = "/pedidoProduto")
public class PedidoProdutoResource {

    @Autowired
    private PedidoProdutoService service;

    @GetMapping
    public ResponseEntity<List<PedidoProduto>> findAll() {
        List<PedidoProduto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<PedidoProduto>> findById(@PathVariable Long id) {
        List<PedidoProduto> pedidos = service.findById(id);
        return ResponseEntity.ok().body(pedidos);
    }

    @PostMapping
    public ResponseEntity<PedidoProduto> insert(@RequestBody PedidoProduto obj) {
        obj = service.insertPedido(obj);
        return ResponseEntity.ok().body(obj);
    }
}