package com.doranco.relations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.relations.model.Book;
import com.doranco.relations.repository.BookRepository;

@Service
//dois être un bean
//un bean (classe java qui hérite de object avec au moins un constructeur vide [par defaut])
//injectable (on peut l'appler via l'expression Autowired)
//scannable l'application le connais grâce à son annotation
// le service permettra de charger et définir les méthodes des repos dont on a besoin (uniquement)

public class BookServiceImplement implements BookServiceInterface {

	@Autowired
	BookRepository bookRepository;
	
	
	@Override
	public Book createOneBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public List<Book> findBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public void deleteOneBook(int id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);

	}

}
