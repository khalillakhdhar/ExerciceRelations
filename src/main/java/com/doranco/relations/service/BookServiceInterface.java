package com.doranco.relations.service;

import java.util.List;

import com.doranco.relations.model.Book;

public interface BookServiceInterface {
Book createOneBook(Book book);
List<Book> findBooks();
void deleteOneBook(int id);
}
