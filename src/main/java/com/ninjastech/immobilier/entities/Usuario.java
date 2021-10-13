/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;




/**
 *
 * @author vitor.sas
 */


@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    //INFORMACOES PESSOAIS
    @NotBlank
    private String nomeCompleto;


    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @CPF
    private String cpf;

    //CREDENCIAIS
    @NotBlank
    private String nomeUsuario;
    @NotBlank
    private String senha;

    @NotBlank
    private String email;
    @NotBlank
    private String endereco;

    // associação com a classe pedidos
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<>();

 }
