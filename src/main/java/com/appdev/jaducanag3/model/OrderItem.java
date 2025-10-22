package com.appdev.jaducanag3.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_item_id;

    private int quantity;
    private double price;

    // Getters and Setters
    public int getOrder_item_id() { return order_item_id; }
    public void setOrder_item_id(int order_item_id) { this.order_item_id = order_item_id; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
