package com.appdev.wildcart_assigned.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.appdev.wildcart_assigned.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
