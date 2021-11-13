/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.entities;

/**
 *
 * @author Arnaldo
 */
public class Frete {
    private String Modalidade;
    private String tempo;
    private String valor;

    public String getModalidade() {
        return Modalidade;
    }

    public void setModalidade(String Modalidade) {
        this.Modalidade = Modalidade;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Frete(String Modalidade, String tempo, String valor) {
        this.Modalidade = Modalidade;
        this.tempo = tempo;
        this.valor = valor;
    }

    public Frete() {
    }
    
}
