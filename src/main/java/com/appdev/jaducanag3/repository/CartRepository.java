package com.appdev.jaducanag3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.appdev.jaducanag3.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
