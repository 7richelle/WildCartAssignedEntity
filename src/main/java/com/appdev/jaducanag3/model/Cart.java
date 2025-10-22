package com.appdev.jaducanag3.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cart")
public class Cart {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cart_id;

    private LocalDateTime date_created;

    // Getters and Setters
    public int getCart_id() { return cart_id; }
    public void setCart_id(int cart_id) { this.cart_id = cart_id; }

    public LocalDateTime getDate_created() { return date_created; }
    public void setDate_created(LocalDateTime date_created) { this.date_created = date_created; }
}
