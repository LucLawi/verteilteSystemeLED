package com.app.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.userService.model.Comment;
import com.app.userService.model.User;
import com.app.userService.service.UserserviceService;

@RestController
public class UserserviceController {

	@Autowired
	private UserserviceService service;

	@PostMapping("/registeruser")
	@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8111"})
	
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();

		if (tempEmailId != null && !"".equals(tempEmailId)) {
			User userobj = service.fetchUserByEmailId(tempEmailId);
			if (userobj != null) {
				throw new Exception("user with " + tempEmailId + " is already exist");
			}
		}

		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}

	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPass = user.getPassword();
		User userObj = null;

		if (tempEmailId != null && tempPass != null) {
			userObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(userObj == null) {
			throw new Exception("Bad credientials");
		}
		return userObj;
	}
	
	@PostMapping("/savecomment")
	@CrossOrigin(origins = "http://localhost:4200")
	public Comment addComment(@RequestBody Comment comment) throws Exception {
		if (comment.getUserName() != null && comment.getComment() != null) {
		 new Exception("Bad comment");
		}
		service.saveComment(comment);
		return comment;
	}
	
	@GetMapping("/getcomments")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Comment> getComments() throws Exception {		
		return service.fetchComment();
	}
}
