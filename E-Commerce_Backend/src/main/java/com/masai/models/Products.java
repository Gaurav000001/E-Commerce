package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Products {
	@Id
	private String productId;
	
	private String imageId; // !!
	
	private String categoryId; // !!
	
	private String productName;
	
	private Integer stock;
	
	private String description;
	
	private Double salePrice;
	
	private Double marketPrice;
	
	private Boolean is_available;
}
