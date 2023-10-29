package com.masai.models;

import jakarta.persistence.Entity;
<<<<<<< HEAD
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
=======
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Products {
    @Id
    private String id;


>>>>>>> 2f1189aa956a6da21c1275fa2f31bb77771689e7
}
