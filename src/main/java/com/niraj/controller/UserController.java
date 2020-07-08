package com.niraj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niraj.model.User;

@RestController
public class UserController {

	@GetMapping("/user")
	public User getUser(@RequestParam(value = "firstName", defaultValue = "Niraj") String firstName,
			@RequestParam(value = "lastName", defaultValue = "Bhoyar") String lastName,
			@RequestParam(value = "age", defaultValue = "23") int age) {

		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);

		return user;

	}

	@PostMapping("/user")
	public User postUser(User user) {

		System.out.println("firstName: " + user.getFirstName());

		return user;
	}

}
