package com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.service;

import com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.model.Pagamento;
import com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.model.Pedido;
import com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PagamentoService {
    private final PedidoRepository repository;
    private final PagamentoService pagamentoService;

    private final Pagamento pagamento;

    public PagamentoService(PedidoRepository repository, PagamentoService pagamentoService, @Qualifier(value = "cartaoPagamento") Pagamento pagamento) {
        this.repository = repository;
        this.pagamentoService = pagamentoService;
        this.pagamento = pagamento;
    }

    public void processarPagamento(BigDecimal valor){
        pagamento.pagar(valor);
    }

    public void criarPedido(){
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Livro", new BigDecimal("100"), 2);

        repository.salvar(pedido);
        pagamentoService.processarPagamento(pedido.calcularTotal());
    }
}
