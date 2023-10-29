package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Orders {
    @Id
    private Integer order_id;

    private Integer user_id;

    private Integer payment_id;

    private Integer address_id;

    private Double total_order_amount;

    private Date order_date;

    private Date delivery_date;
}
