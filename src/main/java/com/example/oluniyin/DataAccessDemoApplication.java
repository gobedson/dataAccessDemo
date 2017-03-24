package com.example.oluniyin;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.oluniyin.domain.Post;
import com.example.oluniyin.repository.PostRepository;
import com.example.oluniyin.service.DataLoader;

@SpringBootApplication
public class DataAccessDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(DataAccessDemoApplication.class);

	@Autowired
	PostRepository postRepository;
	@Autowired
	DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(DataAccessDemoApplication.class, args);
	}

	@PostConstruct
	void seePosts() {
		logger.info("seePosts method called...");
		for (Post post : postRepository.findAll()) {
			logger.info(post.toString());
		}
	}
}
