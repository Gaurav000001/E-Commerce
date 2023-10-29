package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {
    @Id
    private Integer cart_id;

    private Integer user_id;
}
