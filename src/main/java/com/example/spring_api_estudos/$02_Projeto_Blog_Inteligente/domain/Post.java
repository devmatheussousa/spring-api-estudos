package com.example.spring_api_estudos.$02_Projeto_Blog_Inteligente.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

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

    @ManyToOne // Relacionamento muitos para um com a entidade Usuario
    @JoinColumn(name = "autor_id", nullable = false) // Cria uma coluna autor_id na tabela post que referencia a chave primária da tabela usuario
    private Usuario autor;

    @ManyToMany
    @JoinTable(
            name = "post_categorias",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private List<Categoria> categorias;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comentario> comentarios;

    @CreationTimestamp
    @Column(name = "data_criacao", nullable = false, updatable = false)
    private LocalDateTime dataCriacao;

    @UpdateTimestamp
    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

}
