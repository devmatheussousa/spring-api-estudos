package com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.repository;

import com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.model.Pedido;

public interface PedidoRepository {
    Pedido salvar(Pedido pedido);
}
