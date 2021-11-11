package com.ninjastech.immobiler.frete;

public class Teste {
    public static void main(String[] args) {
        Fretenator fretenator = new Fretenator();
        fretenator.codServico("40010");
        fretenator.codFormato(1);
        fretenator.altura(11d);
        fretenator.largura(12d);
        fretenator.comprimento(16d);
        fretenator.peso("0,450");
        fretenator.cepOrigem("13348867");
        fretenator.cepDestino("29156034");
        FretenatorResult result = fretenator.result();
        FretenatorResultItem servico = result.getServico(40010);

        System.out.println(servico.getErro());
        System.out.println(servico.getMensagemDeErro());
        System.out.println(servico.getPrazo());
        System.out.println(servico.getValor());
        System.out.println(servico.getEntregaDomiciliar());
        System.out.println(servico.getEntregaSabado());
    }
}
