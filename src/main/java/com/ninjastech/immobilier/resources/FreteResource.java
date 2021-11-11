/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.resources;

import com.ninjastech.immobilier.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Arnaldo
 */
@RestController
@RequestMapping(value = "/frete")
@ComponentScan(basePackages = {"com.*"})
public class FreteResource {

    @Autowired
    @GetMapping(value = "/{id}")
    public String frete(@PathVariable Long id) {
        return "Ok";
    }
}
