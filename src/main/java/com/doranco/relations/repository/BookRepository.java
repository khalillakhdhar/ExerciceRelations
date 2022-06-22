package com.doranco.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.relations.model.Book;

//Autowirable interface
//des interface avec une implementation adaptable créé dans les packages de JPA
//injectable (on peut l'appler via l'expression Autowired)
//scannable l'application grace à l'interface mére (JPARepo)
public interface BookRepository extends JpaRepository<Book, Integer> {

}
