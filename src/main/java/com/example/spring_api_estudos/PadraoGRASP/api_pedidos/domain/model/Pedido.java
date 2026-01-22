package com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(String nome, BigDecimal preco, int qtd){
        itens.add(new ItemPedido(nome, preco, qtd));
    }

    public BigDecimal calcularTotal(){
        return itens.stream()
                .map(ItemPedido::getSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
