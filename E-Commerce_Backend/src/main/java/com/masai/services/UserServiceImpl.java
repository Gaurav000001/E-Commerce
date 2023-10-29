package com.masai.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.UsersException;
import com.masai.models.User;
import com.masai.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository usersRepository;
	
	@Override
	public User getUser(String userId) {
		
		return usersRepository.findById(userId).orElseThrow(() -> new UsersException("User not found with userId: " + userId));
	}

	@Override
	public User createUser(User user) {
		Optional<User> userByEmailOpt = usersRepository.findByEmail(user.getEmail());
		if(userByEmailOpt.isPresent()) throw new UsersException("User Already Present with email: " + user.getEmail());
		
		Optional<User> userByMobileNumberOpt = usersRepository.findByMobileNumber(user.getMobileNumber());
		if(userByMobileNumberOpt.isPresent()) throw new UsersException("User Already Present with mobile number: " + user.getMobileNumber());
		
		user.setUserId(UUID.randomUUID().toString());
		// create and assign one cart to user
		
		User createdUser = usersRepository.save(user);
		
		return createdUser;
	}

	@Override
	public User updateUser(String userId, User user) {
		// updates firstname, lastname, and dob
		Optional<User> existingUserOpt = usersRepository.findById(userId);
		if(existingUserOpt.isEmpty()) throw new UsersException("User Not found with userId: " + userId);
		
		User existingUser = existingUserOpt.get();
		existingUser.setFirstname(user.getFirstname());
		existingUser.setLastname(user.getLastname());
		existingUser.setDob(user.getDob());
		
		usersRepository.save(existingUser);
		
		return existingUser;
	}

	@Override
	public User deleteUser(String userId) {
		Optional<User> existingUserOpt = usersRepository.findById(userId);
		if(existingUserOpt.isEmpty()) throw new UsersException("User Not found with userId: " + userId);
		
		User existingUser = existingUserOpt.get();
		usersRepository.delete(existingUser);
		
		return existingUser;
	}


}
