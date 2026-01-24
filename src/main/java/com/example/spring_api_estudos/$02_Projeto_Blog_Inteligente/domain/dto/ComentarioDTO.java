package com.example.spring_api_estudos.$02_Projeto_Blog_Inteligente.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ComentarioDTO {
    private Long id;
    private String conteudo;
    private Long autorId;
    private String autorNome;
    private Long postId;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
}
