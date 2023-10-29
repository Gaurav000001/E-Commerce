package com.masai.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Feedbacks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Feedbacks {
	@Id
	private String feedbackId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private String userId;
	
	private String productId; // !!
	
	private Integer rating;
	
	private String review;
}
