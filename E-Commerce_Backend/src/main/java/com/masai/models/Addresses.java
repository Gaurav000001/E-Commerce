package com.masai.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Addresses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Addresses {
	@Id
	private String addressId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private String userId;
	
	private Boolean isDefault;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private Integer postalCode;
}
