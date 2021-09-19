/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.resources;

import com.ninjastech.immobilier.entities.Imagens;
import com.ninjastech.immobilier.services.ImagensService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Arnaldo
 */
@RestController
@RequestMapping(value = "/imagens")
@ComponentScan(basePackages = {"com.*"})
public class ImagensResource {

    @Autowired
    private ImagensService service;

    @GetMapping
    public ResponseEntity<List<Imagens>> findAll() {
        List<Imagens> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<List<Imagens>> findById(@PathVariable long id) {
        List<Imagens> list = service.findById(id);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping(value = "/excluir")
    public void delete(@Valid @RequestBody Imagens obj) {
        service.deletImagen(obj);

    }

    @PostMapping
    public ResponseEntity<Imagens> insert(@RequestBody Imagens obj) {
        obj = service.insertImagen(obj);
        return ResponseEntity.ok().body(obj);
    }

}
