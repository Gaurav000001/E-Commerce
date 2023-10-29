package com.masai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Products;

public interface ProductsRepository extends JpaRepository<Products, String> {

}
