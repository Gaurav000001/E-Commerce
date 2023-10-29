package com.masai.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	public Optional<User> findByMobileNumber(String mobileNumber);
	
	public Optional<User> findByEmail(String email);
}
