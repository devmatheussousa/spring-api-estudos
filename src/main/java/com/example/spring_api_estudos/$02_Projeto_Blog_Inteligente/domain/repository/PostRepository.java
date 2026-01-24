package com.example.spring_api_estudos.$02_Projeto_Blog_Inteligente.domain.repository;

import com.example.spring_api_estudos.$02_Projeto_Blog_Inteligente.domain.entities.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Page<Post> findByTituloContainingIgnoreCase(String titulo, Pageable pageable);
    Page<Post> findByAutorId(Long autorId, Pageable pageable);

    @Query("SELECT p FROM Post p JOIN p.categorias c WHERE c.id = :categoriaId")
    Page<Post> findByCategoriaId(@Param("categoriaId") Long categoriaId, Pageable pageable);

    @Query("SELECT p FROM Post p ORDER BY p.visualizacoes DESC")
    Page<Post> findMaisVisualizados(Pageable pageable);

    @Query("SELECT p FROM Post p ORDER BY p.dataCriacao DESC")
    Page<Post> findRecentes(Pageable pageable);
}
