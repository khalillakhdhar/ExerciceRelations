package com.doranco.relations.service;

import java.util.List;

import com.doranco.relations.model.Article;

public interface ArticleServiceInterface {
	Article createArticle(Article article);
	List<Article> getAll();
	void DeleteArticle(long id);
	List<Article> searchAuteur(String auteur);
	List<Article> searchType(String type);

}
