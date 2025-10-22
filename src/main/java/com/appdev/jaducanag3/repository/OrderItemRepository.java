package com.appdev.jaducanag3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.appdev.jaducanag3.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
