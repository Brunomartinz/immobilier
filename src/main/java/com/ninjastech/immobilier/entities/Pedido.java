package com.ninjastech.immobilier.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author wesley
 */
@Entity
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String numero;

    private String valorTotal;

    private String status;

    private LocalDate data;
    
    private String frete;
    
    private String formaPagamento;
    
    private int idcliente;
    
    private int idEndereco;
    
    public Pedido() {}

    public Pedido(String numero, String valorTotal, String status, LocalDate data, String frete, String formaPagamento, int idcliente,int idEndreco ) {
        this.numero = numero;
        this.valorTotal = valorTotal;
        this.status = status;
        this.data = data;
        this.frete = frete;
        this.formaPagamento = formaPagamento;
        this.idcliente = idcliente;
        this.idEndereco = idEndreco;
    }

    public Pedido(long id, String numero, String valorTotal, String status, LocalDate data, String frete, String formaPagamento,int idcliente,int idEndreco) {
        this.id = id;
        this.numero = numero;
        this.valorTotal = valorTotal;
        this.status = status;
        this.data = data;
        this.frete = frete;
        this.formaPagamento = formaPagamento;
        this.idcliente = idcliente;
        this.idEndereco = idEndreco;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
    
}
