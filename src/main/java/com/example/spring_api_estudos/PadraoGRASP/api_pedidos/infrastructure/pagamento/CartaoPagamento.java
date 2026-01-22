package com.example.spring_api_estudos.PadraoGRASP.api_pedidos.infrastructure.pagamento;

import com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.model.Pagamento;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CartaoPagamento implements Pagamento {
    public void pagar(BigDecimal valor){
        System.out.println("Pagando " + valor + " via Cartão");
    }
}
