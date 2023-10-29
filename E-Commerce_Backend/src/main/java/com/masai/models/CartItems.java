package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CartItems {
    @Id
    private Integer cart_item_id;

    private Integer cart_id;

    private Integer product_id;

    private int quantity;
}
