package com.ironpapalords.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ironpapalords.model.User;
import com.ironpapalords.repository.UserRepository;

@RestController("/api/v1")
public class UserController {

	@Autowired
	UserRepository userRepo;

	@GetMapping("/users")
	List<User> getAll() {
		return userRepo.findAll();
	}

	@PostMapping("/users")
	User newUser(@RequestBody User user) {
		return userRepo.save(user);
	}

	@PutMapping("/users/{correo}")
	User replaceUser(@RequestBody User newUser, @PathVariable String correo) {
		return userRepo.save(newUser);
	}

	@DeleteMapping("/users/{correo}")
	void deleteUser(@PathVariable String correo) {
		userRepo.deleteById(correo);
	}

}