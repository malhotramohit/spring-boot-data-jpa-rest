package com.gs.ilp.hibernate.springboothibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gs.ilp.hibernate.springboothibernate.model.Comment;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
