package com.doranco.relations.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.relations.model.Article;
import com.doranco.relations.service.ArticleServiceImplement;

@RestController
// javaBean qui est scannable
// signifie que l'application va interagir avec le HTTP
// mes retours sont mise en ligne dans les URL du controller
@RequestMapping("article")
public class ArticleController {
	@Autowired 
	ArticleServiceImplement articleServiceImplement;
	@GetMapping
	public List<Article> getAllArticle()
	{
		return articleServiceImplement.getAll();
	}
	@PostMapping
	// objectif => ajouter un article dans la BD
	public Article addOneArt(@RequestBody @Valid Article article)
	// @RequestBody signifie que dans le corp de la requete envoyé je dois trouver?... 
	// requestBody vient soit d'un formulaire (web / mobile ) ou un testeur json data ou logiciel de teste
	{
		return articleServiceImplement.createArticle(article);
	}
	@GetMapping("/{id}")
	public Article getArticle(@PathVariable("id") long id)
	{
		return articleServiceImplement.findOneArticle(id).get();
		// get pour récupérer le résultat qui est soit null (404) soit un article (BD)
	}
	@DeleteMapping("/{id}")
	public void deleteMyArticle(@PathVariable("id") long id)
	{
		articleServiceImplement.DeleteArticle(id);
		//return "deleted successfull";
	}
	
	
	

}
