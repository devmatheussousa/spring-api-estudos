package com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.service;

import com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.model.Pedido;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculadoraPedido {

    public BigDecimal calcular(Pedido pedido){
        return pedido.calcularTotal();
    }
}
