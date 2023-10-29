package com.masai.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Users;

public interface UsersRepository extends JpaRepository<Users, String> {
	
	public Optional<Users> findByMobileNumber(String mobileNumber);
	
	public Optional<Users> findByEmail(String email);
}
