package com.masai.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.UsersException;
import com.masai.models.Users;
import com.masai.repositories.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public Users getUser(String userId) {
		
		return usersRepository.findById(userId).orElseThrow(() -> new UsersException("User not found with userId: " + userId));
	}

	@Override
	public Users createUser(Users user) {
		Optional<Users> userByEmailOpt = usersRepository.findByEmail(user.getEmail());
		if(userByEmailOpt.isPresent()) throw new UsersException("User Already Present with email: " + user.getEmail());
		
		Optional<Users> userByMobileNumberOpt = usersRepository.findByMobileNumber(user.getMobileNumber());
		if(userByMobileNumberOpt.isPresent()) throw new UsersException("User Already Present with mobile number: " + user.getMobileNumber());
		
		user.setUserId(UUID.randomUUID().toString());
		// create and assign one cart to user
		
		Users createdUser = usersRepository.save(user);
		
		return createdUser;
	}

	@Override
	public Users updateUser(String userId, Users user) {
		// updates firstname, lastname, and dob
		Optional<Users> existingUserOpt = usersRepository.findById(userId);
		if(existingUserOpt.isEmpty()) throw new UsersException("User Not found with userId: " + userId);
		
		Users existingUser = existingUserOpt.get();
		existingUser.setFirstname(user.getFirstname());
		existingUser.setLastname(user.getLastname());
		existingUser.setDob(user.getDob());
		
		usersRepository.save(existingUser);
		
		return existingUser;
	}

	@Override
	public Users deleteUser(String userId) {
		Optional<Users> existingUserOpt = usersRepository.findById(userId);
		if(existingUserOpt.isEmpty()) throw new UsersException("User Not found with userId: " + userId);
		
		Users existingUser = existingUserOpt.get();
		usersRepository.delete(existingUser);
		
		return existingUser;
	}


}
