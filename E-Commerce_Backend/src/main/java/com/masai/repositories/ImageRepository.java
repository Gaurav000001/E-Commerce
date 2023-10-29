package com.masai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Image;

public interface ImageRepository extends JpaRepository<Image, String> {

}
