package com.java.crud.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.crud.mongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
