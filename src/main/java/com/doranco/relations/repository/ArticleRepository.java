package com.doranco.relations.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.relations.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
List<Article> findByAuteur(String auteur);
List<Article> findByType(String type);
}
