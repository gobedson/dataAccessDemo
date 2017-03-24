package com.example.oluniyin.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.oluniyin.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
