package com.masai.services;

import com.masai.models.Users;

public interface UsersService {
	
	public Users getUser(String userId);
	
	public Users createUser(Users user);
	
	public Users updateUser(String userId, Users user);
	
	public Users deleteUser(String userId);
}
