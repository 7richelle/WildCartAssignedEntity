package com.appdev.wildcart_assigned.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.appdev.wildcart_assigned.model.OrderItem;
import com.appdev.wildcart_assigned.repository.OrderItemRepository;

@Service
public class OrderItemService {
     private final OrderItemRepository repo;

    public OrderItemService(OrderItemRepository repo) {
        this.repo = repo;
    }

    public List<OrderItem> getAllOrderItems() { return repo.findAll(); }
    public OrderItem addOrderItem(OrderItem oi) { return repo.save(oi); }
    public OrderItem getOrderItemById(int id) { return repo.findById(id).orElse(null); }
    public OrderItem updateOrderItem(int id, OrderItem newItem) {
        return repo.findById(id).map(item -> {
            item.setQuantity(newItem.getQuantity());
            item.setPrice(newItem.getPrice());
            return repo.save(item);
        }).orElse(null);
    }
    public void deleteOrderItem(int id) { repo.deleteById(id); }
}
