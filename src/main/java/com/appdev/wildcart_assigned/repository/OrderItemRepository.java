package com.appdev.wildcart_assigned.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.appdev.wildcart_assigned.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
