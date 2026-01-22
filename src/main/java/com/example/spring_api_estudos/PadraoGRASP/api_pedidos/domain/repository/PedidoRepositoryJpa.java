package com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.repository;

import com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.model.Pedido;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PedidoRepositoryJpa implements PedidoRepository {

    private final JpaRepository<Pedido, Long> jpaR;


    public Pedido salvar(Pedido pedido) {
        return jpaR.save(pedido);
    }
}
