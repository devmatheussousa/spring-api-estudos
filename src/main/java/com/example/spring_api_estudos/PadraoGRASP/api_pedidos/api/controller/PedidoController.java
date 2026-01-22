package com.example.spring_api_estudos.PadraoGRASP.api_pedidos.api.controller;

import com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.repository.PedidoRepository;
import com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.service.PagamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos/GRASP")
public class PedidoController {

    private final PagamentoService pagamentoService;


    public PedidoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    public ResponseEntity<Void> criar(){
        pagamentoService.criarPedido();
        return ResponseEntity.ok().build();
    }
}
