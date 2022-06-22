package com.doranco.relations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.relations.model.Article;
import com.doranco.relations.repository.ArticleRepository;
//un service est une classe auto-injectable dans d'autres beans (classe java)
@Service
public class ArticleServiceImplement implements ArticleServiceInterface {

	@Autowired
	//exécuter en arriére plan (initialisation sans [new])
	
	ArticleRepository articleRepository;
	
	@Override
	public Article createArticle(Article article) {
		// TODO Auto-generated method stub
		
		return articleRepository.save(article);
	}

	@Override
	public List<Article> getAll() {
		// TODO Auto-generated method stub
		return articleRepository.findAll();
	}

	@Override
	public void DeleteArticle(long id) {
		// TODO Auto-generated method stub
		articleRepository.deleteById(id);

	}

	@Override
	public List<Article> searchAuteur(String auteur) {
		// TODO Auto-generated method stub
		return articleRepository.findByAuteur(auteur);
	}

	@Override
	public List<Article> searchType(String type) {
		// TODO Auto-generated method stub
		return articleRepository.findByType(type);
	}

	@Override
	//Optional => Article || null
	public Optional<Article> findOneArticle(long id) {
		// TODO Auto-generated method stub
		return articleRepository.findById(id);
	}

}
