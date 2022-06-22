package com.doranco.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.relations.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
