package com.app.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.userService.model.User;

public interface RegistrationRepository extends JpaRepository<User, Integer> {

	public User findByEmailId(String emailId);
	public User findByEmailIdAndPassword(String emailId, String password);
}
