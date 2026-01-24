package com.example.spring_api_estudos.$02_Projeto_Blog_Inteligente.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CategoriaDTO {
    private Long id;
    private String nome;
    private String descricao;
    private Integer totalPosts;
    private LocalDateTime dataCriacao;
}
