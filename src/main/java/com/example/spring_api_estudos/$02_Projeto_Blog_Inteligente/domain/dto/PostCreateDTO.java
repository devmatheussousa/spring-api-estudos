package com.example.spring_api_estudos.$02_Projeto_Blog_Inteligente.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class PostCreateDTO {

    @NotBlank(message = "Titulo e obrigatorio")
    @Size(min = 3, max = 200, message = "Titulo deve ter entre 3 e 200")
    private String titulo;

    @NotBlank(message = "Conteudo e Obrigatorio")
    @Size(min = 10, message = "Conteudo deve ter pelo menos 10 caracteres")
    private String conteudo;

    private String imageUrl;
    private List<Long> categorias; // IDs das categorias associadas ao post
}
