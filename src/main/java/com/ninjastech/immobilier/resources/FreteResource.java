/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.resources;

import com.ninjastech.immobiler.frete.Fretenator;
import com.ninjastech.immobiler.frete.FretenatorResult;
import com.ninjastech.immobiler.frete.FretenatorResultItem;
import com.ninjastech.immobilier.entities.Frete;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Arnaldo
 */
@RestController
@RequestMapping(value = "/frete")
@ComponentScan(basePackages = {"com.*"})
public class FreteResource {

    @GetMapping(value = "pac/{cep}")
    @ResponseBody
    public ResponseEntity pac(@PathVariable String cep) {
        Frete fr = new Frete();

        Fretenator fretenator = new Fretenator();
        fretenator.codServico("41106");
        fretenator.codFormato(1);
        fretenator.altura(11d);
        fretenator.largura(12d);
        fretenator.comprimento(16d);
        fretenator.peso("5,450");
        fretenator.cepOrigem("13348867");
        fretenator.cepDestino(cep);
        FretenatorResult result = fretenator.result();
        FretenatorResultItem servico = result.getServico(41106);
        fr.setTempo(String.valueOf(servico.getPrazo()));
        fr.setModalidade("pac");
        fr.setValor(String.valueOf(servico.getValor()));
        return ResponseEntity.ok().body(fr);
    }
    
    @GetMapping(value = "sedex/{cep}")
    @ResponseBody
    public ResponseEntity sedex(@PathVariable String cep) {
        Frete fr = new Frete();

        Fretenator fretenator = new Fretenator();
        fretenator.codServico("40010");
        fretenator.codFormato(1);
        fretenator.altura(16d);
        fretenator.largura(16d);
        fretenator.comprimento(16d);
        fretenator.peso("5,450");
        fretenator.cepOrigem("13348867");
        fretenator.cepDestino(cep);
        FretenatorResult result = fretenator.result();
        FretenatorResultItem servico = result.getServico(40010);
        fr.setTempo(String.valueOf(servico.getPrazo()));
        fr.setModalidade("sedex");
        fr.setValor(String.valueOf(servico.getValor()));
        return ResponseEntity.ok().body(fr);
    }
    @GetMapping(value = "jadlog/{cep}")
    @ResponseBody
    public ResponseEntity jadlog(@PathVariable String cep) {
        Frete fr = new Frete();

        Fretenator fretenator = new Fretenator();
        fretenator.codServico("40010");
        fretenator.codFormato(1);
        fretenator.altura(16d);
        fretenator.largura(16d);
        fretenator.comprimento(16d);
        fretenator.peso("5,450");
        fretenator.cepOrigem("13348867");
        fretenator.cepDestino(cep);
        FretenatorResult result = fretenator.result();
        FretenatorResultItem servico = result.getServico(40010);
        fr.setTempo(String.valueOf(servico.getPrazo()*2));
        fr.setModalidade("jadlog");
        fr.setValor(String.valueOf(servico.getValor()*2));
        return ResponseEntity.ok().body(fr);
    }
}
