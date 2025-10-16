package com.appdev.wildcart_assigned.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.appdev.wildcart_assigned.model.Cart;
import com.appdev.wildcart_assigned.repository.CartRepository;

@Service
public class CartService {
     private final CartRepository repo;

    public CartService(CartRepository repo) {
        this.repo = repo;
    }

    public List<Cart> getAllCarts() { return repo.findAll(); }
    public Cart addCart(Cart c) { return repo.save(c); }
    public Cart getCartById(int id) { return repo.findById(id).orElse(null); }
    public Cart updateCart(int id, Cart newCart) {
        return repo.findById(id).map(cart -> {
            cart.setDate_created(newCart.getDate_created());
            return repo.save(cart);
        }).orElse(null);
    }
    public void deleteCart(int id) { repo.deleteById(id); }
}