package com.Edgeserver.server.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Edgeserver.server.models.Comment;
import com.Edgeserver.server.models.User;



@FeignClient("userService")
public interface userClient {
	@RequestMapping(method = RequestMethod.POST, value = "/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	User registerUser(@RequestBody User user);
	
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	@CrossOrigin(origins = "http://localhost:4200")
	User loginUser(@RequestBody User user);
	
	@RequestMapping(method = RequestMethod.POST, value = "/savecomment")
	@CrossOrigin(origins = "http://localhost:4200")
	Comment addComment(@RequestBody Comment comment);
	
	@RequestMapping(method = RequestMethod.GET, value = "/getcomments")
	@CrossOrigin(origins = "http://localhost:4200")
	List<Comment> getComments();
	
}