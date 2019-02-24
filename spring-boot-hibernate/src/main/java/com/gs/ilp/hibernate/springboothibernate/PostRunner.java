package com.gs.ilp.hibernate.springboothibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gs.ilp.hibernate.springboothibernate.model.Post;
import com.gs.ilp.hibernate.springboothibernate.repository.PostRepository;

@Component
public class PostRunner implements CommandLineRunner {

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		Post post = new Post();
		post.setContent("content 1");
		post.setDescription("desc 1");
		post.setTitle("title");
		postRepository.save(post);
	}

}
