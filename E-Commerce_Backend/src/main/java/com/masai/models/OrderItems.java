package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderItems {
    @Id
    private Integer order_item_id;

    private Integer order_id;

    private Integer product_id;

    private int quantity;
}
