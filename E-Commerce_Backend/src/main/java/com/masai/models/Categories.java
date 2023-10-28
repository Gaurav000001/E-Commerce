package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Categories {
    @Id
    private Integer category_id;

    private Integer parent_category_id;

    private String category_name;
}
