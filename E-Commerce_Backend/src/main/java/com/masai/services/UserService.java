package com.masai.services;

import com.masai.models.User;

public interface UserService {
	
	public User getUser(String userId);
	
	public User createUser(User user);
	
	public User updateUser(String userId, User user);
	
	public User deleteUser(String userId);
}
