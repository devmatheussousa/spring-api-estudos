package com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private BigDecimal preco;
    private int qtd;

    public ItemPedido() {

    }

    public ItemPedido(String nome, BigDecimal preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public BigDecimal getSubtotal(){
        return preco.multiply(BigDecimal.valueOf(qtd));
    }
}
