package com.masai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, String> {

}
