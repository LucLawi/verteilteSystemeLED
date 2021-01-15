package com.Edgeserver.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Edgeserver.server.clients.userClient;
import com.Edgeserver.server.models.Comment;
import com.Edgeserver.server.models.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class userController {
	@Autowired
	userClient userClient;

	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User register(@RequestBody User user) {
		return userClient.registerUser(user);
	}

	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User login(@RequestBody User user) {
		return userClient.loginUser(user);
	}

	@PostMapping("/savecomment")
	@CrossOrigin(origins = "http://localhost:4200")
	public Comment savecomment(@RequestBody Comment comment) {
		return userClient.addComment(comment);
	}

	@GetMapping("/getcomments")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Comment> registerUser() {
		return userClient.getComments();
	}
}
