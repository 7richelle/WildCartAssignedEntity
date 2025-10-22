package com.appdev.jaducanag3.controller;

import org.springframework.web.bind.annotation.*;

import com.appdev.jaducanag3.model.OrderItem;
import com.appdev.jaducanag3.service.OrderItemService;

import java.util.*;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController {
     private final OrderItemService service;

    public OrderItemController(OrderItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() { return service.getAllOrderItems(); }

    @PostMapping
    public OrderItem addOrderItem(@RequestBody OrderItem orderItem) { return service.addOrderItem(orderItem); }

    @GetMapping("/{id}")
    public OrderItem getOrderItemById(@PathVariable int id) { return service.getOrderItemById(id); }

    @PutMapping("/{id}")
    public OrderItem updateOrderItem(@PathVariable int id, @RequestBody OrderItem newOrderItem) {
        return service.updateOrderItem(id, newOrderItem);
    }

    @DeleteMapping("/{id}")
    public String deleteOrderItem(@PathVariable int id) {
        service.deleteOrderItem(id);
        return "Order item deleted with ID: " + id;
    }
}

