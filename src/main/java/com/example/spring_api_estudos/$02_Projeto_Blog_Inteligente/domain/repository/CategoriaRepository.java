package com.example.spring_api_estudos.$02_Projeto_Blog_Inteligente.domain.repository;

import com.example.spring_api_estudos.$02_Projeto_Blog_Inteligente.domain.entities.Categoria;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository {
    Optional<Categoria> findByNomeIgnoreCase(String nome);
    boolean existsByNomeIgnoreCase(String nome);
}
