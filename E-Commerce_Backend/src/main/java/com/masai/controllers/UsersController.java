package com.masai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.models.User;
import com.masai.services.UserService;

@RestController
@RequestMapping("/users/")
public class UsersController {
	
	@Autowired
	private UserService usersService;
	
	@GetMapping("{userId}/")
	public ResponseEntity<User> getUserHandler(@PathVariable String userId){
		User user = usersService.getUser(userId);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> createUserHandler(@RequestBody User user){
		User createdUser = usersService.createUser(user);
		
		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}
	
	@PutMapping("{userId}/")
	public ResponseEntity<User> updateUserHandler(@PathVariable String userId, @RequestBody User user){
		User updatedUser = usersService.updateUser(userId, user);
		
		return new ResponseEntity<User>(updatedUser, HttpStatus.OK);
	}
	
	@DeleteMapping("{userId}/")
	public ResponseEntity<User> deleteUserHandler(@PathVariable String userId){
		User deletedUser = usersService.deleteUser(userId);
		
		return new ResponseEntity<User>(deletedUser, HttpStatus.OK);
	}
}
