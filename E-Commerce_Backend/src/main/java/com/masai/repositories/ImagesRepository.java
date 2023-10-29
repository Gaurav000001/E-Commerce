package com.masai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Images;

public interface ImagesRepository extends JpaRepository<Images, String> {

}
