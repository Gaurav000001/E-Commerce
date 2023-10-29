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

import com.masai.models.Users;
import com.masai.services.UsersService;

@RestController
@RequestMapping("/users/")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("{userId}/")
	public ResponseEntity<Users> getUserHandler(@PathVariable String userId){
		Users user = usersService.getUser(userId);
		
		return new ResponseEntity<Users>(user, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Users> createUserHandler(@RequestBody Users user){
		Users createdUser = usersService.createUser(user);
		
		return new ResponseEntity<Users>(createdUser, HttpStatus.CREATED);
	}
	
	@PutMapping("{userId}/")
	public ResponseEntity<Users> updateUserHandler(@PathVariable String userId, @RequestBody Users user){
		Users updatedUser = usersService.updateUser(userId, user);
		
		return new ResponseEntity<Users>(updatedUser, HttpStatus.OK);
	}
	
	@DeleteMapping("{userId}/")
	public ResponseEntity<Users> deleteUserHandler(@PathVariable String userId){
		Users deletedUser = usersService.deleteUser(userId);
		
		return new ResponseEntity<Users>(deletedUser, HttpStatus.OK);
	}
}
