package com.ninjastech.immobilier.resources;

import com.ninjastech.immobilier.entities.ClienteEndereco;
import com.ninjastech.immobilier.services.ClienteEnderecoService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
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
@RequestMapping(value = "/endereco")
@ComponentScan(basePackages = {"com.*"})
public class ClienteEnderecoResource {

    @Autowired
    private ClienteEnderecoService service;

    @GetMapping
    public ResponseEntity<List<ClienteEndereco>> findAll() {
        List<ClienteEndereco> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClienteEndereco> findById(@PathVariable Long id) {
        ClienteEndereco obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<ClienteEndereco> insert(@RequestBody ClienteEndereco obj) {
        obj = service.insertEndereco(obj);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping(value = "/excluir")
    public void delete(@Valid @RequestBody ClienteEndereco obj) {
        service.deletEndereco(obj);
    }

    @PostMapping(value = "/editar")
    public ResponseEntity<ClienteEndereco> edit(@Valid @RequestBody ClienteEndereco obj) {
        obj = service.editEndereco(obj);
        return ResponseEntity.ok().body(obj);
    }
}
