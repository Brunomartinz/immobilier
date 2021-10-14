package com.ninjastech.immobilier.entities;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Funcionario {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //informacoes de login
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String senha;
    private Role role;

    //informacoes pessoais
    @NotBlank
    private String nome;
    private String sexo;
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date nascimento;
    @CPF
    private String cpf;


    //construtores
    public Funcionario() {
    }

    public Funcionario(Long id, String email, String senha, Role role, String nome, String sexo, Date nascimento, String cpf) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.role = role;
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    //getters e setters
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
