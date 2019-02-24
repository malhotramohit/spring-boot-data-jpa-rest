package com.gs.ilp.hibernate.springboothibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gs.ilp.hibernate.springboothibernate.model.Post;
import com.gs.ilp.hibernate.springboothibernate.repository.PostRepository;

@RestController
public class PostController {

	@Autowired
	private PostRepository postRepository;

	@GetMapping("/posts")
	public List<Post> getAllPosts(){
		return postRepository.findAll();
	}
	
	@PostMapping("/post")
	public void createPost(@RequestBody Post post){
		 postRepository.save(post);
	}
}
