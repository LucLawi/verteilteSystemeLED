package com.app.userService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.userService.model.Comment;
import com.app.userService.model.User;
import com.app.userService.repository.CommentRepository;
import com.app.userService.repository.RegistrationRepository;

@Service
public class UserserviceService {

	@Autowired
	private RegistrationRepository repo;
	@Autowired
	private CommentRepository Commentrepo;

	public User saveUser(User user) {
		return repo.save(user);
	}

	public User fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}
	public User fetchUserByEmailIdAndPassword(String email, String password) {
		return repo.findByEmailIdAndPassword(email, password);
	}
	
	public Comment saveComment(Comment comment) {
		return Commentrepo.save(comment);
	}
	public List<Comment> fetchComment() {
		return Commentrepo.findAll();
	}
}
