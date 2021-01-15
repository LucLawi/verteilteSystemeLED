package com.app.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.userService.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
