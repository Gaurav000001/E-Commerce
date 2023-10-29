package com.masai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Feedbacks;

public interface FeedbacksRepository extends JpaRepository<Feedbacks, String> {

}
