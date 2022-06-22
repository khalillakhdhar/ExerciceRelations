package com.doranco.relations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.relations.model.Book;
import com.doranco.relations.repository.BookRepository;

@Service
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
