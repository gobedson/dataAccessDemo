package com.example.oluniyin.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.oluniyin.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
