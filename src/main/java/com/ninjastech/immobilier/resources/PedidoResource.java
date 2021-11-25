package com.ninjastech.immobilier.resources;

import com.ninjastech.immobilier.entities.Pedido;
import com.ninjastech.immobilier.services.PedidoService;
import java.util.List;
import javax.validation.Valid;
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
@RequestMapping(value = "/pedido")
public class PedidoResource {

    @Autowired
    private PedidoService service;

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll() {
        List<Pedido> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Long id) {
        Pedido obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping(value = "/cliente/{id}")
    public ResponseEntity<List<Pedido>> findByIdCliente(@PathVariable int id) {
        List<Pedido> list = service.findByIdCliente(id);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Pedido> insert(@RequestBody Pedido obj) {
        obj = service.insertPedido(obj);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping(value = "/excluir")
    public void delete(@Valid @RequestBody Pedido obj) {
        service.deletPedido(obj);
    }

    @PostMapping(value = "/editar")
    public ResponseEntity<Pedido> edit(@Valid @RequestBody Pedido obj) {
        obj = service.editPedido(obj);
        return ResponseEntity.ok().body(obj);
    }
}
