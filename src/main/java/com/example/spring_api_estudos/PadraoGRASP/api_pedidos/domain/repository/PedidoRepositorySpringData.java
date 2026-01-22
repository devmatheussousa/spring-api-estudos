package com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.repository;

import com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorySpringData extends JpaRepository<Pedido, Long> {
}