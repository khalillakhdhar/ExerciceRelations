package com.doranco.relations.service;

import java.util.List;

import com.doranco.relations.model.Article;
// on utilise ce genre d'interface pour des raisons d'organisation
// affaiblir le couplage entre les classe et les repo => au lieu de charger tout le code de repo on charge uniquement nos besoins
// les interfaces documentent mieux notre code
// les interfaces nous permettent d'avoir plus de controle sur notre codes

public interface ArticleServiceInterface {
	Article createArticle(Article article);
	List<Article> getAll();
	void DeleteArticle(long id);
	List<Article> searchAuteur(String auteur);
	List<Article> searchType(String type);

}
