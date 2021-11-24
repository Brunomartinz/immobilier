package com.ninjastech.immobilier.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author wesley
 */
@Entity
public class PedidoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nome;
    
    private String avaliacao;
    
    private String descricao;
    
    private String imgUrl;
    
    private double preco;
    
    private int qtd;
    
    private long idPedido;

    public PedidoProduto(long idPedido, String nome, String avaliacao, String descricao, String imgUrl, double preco, int qtd) {
        this.idPedido = idPedido;
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.descricao = descricao;
        this.imgUrl = imgUrl;
        this.preco = preco;
        this.qtd = qtd;
    }

    public PedidoProduto(String nome, String avaliacao, String descricao, String imgUrl, double preco, int qtd) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.descricao = descricao;
        this.imgUrl = imgUrl;
        this.preco = preco;
        this.qtd = qtd;
    }
    
    public PedidoProduto() {}
     
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }
}
