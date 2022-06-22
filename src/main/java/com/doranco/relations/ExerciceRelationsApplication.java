package com.doranco.relations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doranco.relations.model.Article;
import com.doranco.relations.model.Book;
import com.doranco.relations.service.ArticleServiceImplement;
import com.doranco.relations.service.BookServiceImplement;

@SpringBootApplication
public class ExerciceRelationsApplication implements CommandLineRunner {
@Autowired
ArticleServiceImplement articleService;
@Autowired
BookServiceImplement booksapi;
	
	public static void main(String[] args) {
		
		SpringApplication.run(ExerciceRelationsApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Article art1=new Article("java EE par la pratique", "20/07/2021", "James Gosling", true, "les bonne pratique java EE", "Software");
		Article art2=new Article("les impacts de IA","01/03/2022", "khalil Lakhdhar", false, "IA et hi tech moderne", "Intelligence artificiel");
		
		articleService.createArticle(art1);
		articleService.createArticle(art2);
		
		articleService.getAll().forEach(a->{
		System.out.println(a.toString());	
		}
		);
		Book b1=new Book("UML2 par la pratique", "Jhon weid", 20);
		Book b2=new Book("java EE the full guide", "Oussama Saidi", 40);
		booksapi.createOneBook(b1);
		booksapi.createOneBook(b2);
		booksapi.findBooks().forEach( bk->{
			System.out.println(bk.toString());
		}
		);
		
		
		
	}
	

}
