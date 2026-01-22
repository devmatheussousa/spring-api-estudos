package com.example.spring_api_estudos.PadraoGRASP.api_pedidos.domain.model;

import java.math.BigDecimal;

public interface Pagamento {
    void pagar(BigDecimal valor);
}
