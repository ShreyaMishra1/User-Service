package com.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.entity.Users;
import com.customerservice.service.UserService;

@RestController
@RequestMapping("/users")
public class Usercontroller {

	@Autowired
	private UserService userService;

	@GetMapping("/AllUsers")
	public ResponseEntity<List<Users>> getAllUsers() {
		List<Users> users = null;
		try {
			users = userService.getAllUsers();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Users>>(users, HttpStatus.OK);

	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<Users> getUsersById(@PathVariable("id")int userId) {
		Users users = null;
		try {
			users = userService.getUsersById(userId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Users>(users, HttpStatus.OK);

	}
	@PostMapping("/addOrUpdate")
	public ResponseEntity<Users> addOrUpdate(@RequestBody Users user) {
		Users users = null;
		try {
			users = userService.addOrUpdateUser(user);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Users>(users, HttpStatus.OK);

	}
	@PutMapping("/update")
	public ResponseEntity<Users> update(@RequestBody Users user) {
		Users users = null;
		try {
			users = userService.updateUser(user);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Users>(users, HttpStatus.OK);

	}



}
