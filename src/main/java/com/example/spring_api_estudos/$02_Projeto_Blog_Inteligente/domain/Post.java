package com.example.spring_api_estudos.$02_Projeto_Blog_Inteligente.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "post")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    @Column(nullable = false, length = 200)
    private String titulo;

    @NotBlank
    @Size(min = 10)
    @Column(nullable = false, columnDefinition = "TEXT") //columnDefinition = "TEXT" para armazenar o conteúdo do post
    private String conteudo;

    @Column(name = "imagem_url")
    private String imagemUrl;

    @Column(name = "visualizacoes", nullable = false)
    private Integer visualizacoes = 0;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false, updatable = false)
    private LocalDateTime dataCriacao;

    @UpdateTimestamp
    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

}
