package com.masai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Addresses;

public interface AddressesRepository extends JpaRepository<Addresses, String> {

}
