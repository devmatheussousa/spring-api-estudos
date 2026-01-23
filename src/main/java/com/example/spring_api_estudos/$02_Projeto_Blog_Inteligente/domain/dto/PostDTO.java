package com.example.spring_api_estudos.$02_Projeto_Blog_Inteligente.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data // Gera getters, setters, toString, equals, hashCode
public class PostDTO {
    private Long id;
    private String titulo;
    private String conteudo;
    private String imagemUrl;
    private Integer visualizacoes;
    private Long autorId;
    private String autorNome;
    private Integer totalComentarios;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
}
