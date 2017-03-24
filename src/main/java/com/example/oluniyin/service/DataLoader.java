package com.example.oluniyin.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oluniyin.domain.Author;
import com.example.oluniyin.domain.Post;
import com.example.oluniyin.repository.AuthorRepository;
import com.example.oluniyin.repository.PostRepository;

@Service
public class DataLoader {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;

	@Autowired
	public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
		this.postRepository = postRepository;
	}

	@PostConstruct
	private void loadData() {
		// create an author
		Author mb = new Author("Madjou", "bah");
		authorRepository.save(mb);
		
		// create a post
		Post post = new Post("Spring Data by Godson");
		post.setBody("This is my first post ...");
		post.setPosteOn(new Date());
		post.setAuthor(mb);
		postRepository.save(post);
		
		
	}
}
