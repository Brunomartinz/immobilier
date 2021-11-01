package com.ninjastech.immobilier.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author wesley
 */
@Entity
public class ClienteEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "O campo CEP não pode estar vazio!")
    private String cep;

    @NotBlank(message = "O campo logradouro não pode estar vazio!")
    private String logradouro;
    
    @NotBlank(message = "O campo logradouro não pode estar vazio!")
    private String numero;
    
    @NotBlank(message = "O campo bairro não pode estar vazio!")
    private String bairro;

    @NotBlank(message = "O campo cidade não pode estar vazio!")
    private String cidade;

    @NotBlank(message = "O campo uf não pode estar vazio!")
    private String uf;
    
    @NotBlank(message = "O campo id cliennte não pode estar vazio!")
    private String idcliente;
    
    private boolean principal;

    private boolean status;

    public ClienteEndereco() {}
	
    public ClienteEndereco(String cep, String logradouro,String numero, String bairro, String cidade, String uf, boolean status, String idcliente, boolean principal) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.status = status;
        this.idcliente = idcliente;
        this.principal = principal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }
    
    
    
    
}
