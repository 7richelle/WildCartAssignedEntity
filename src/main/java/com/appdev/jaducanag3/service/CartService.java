package com.appdev.jaducanag3.service;

import org.springframework.stereotype.Service;

import com.appdev.jaducanag3.model.Cart;
import com.appdev.jaducanag3.repository.CartRepository;

import java.util.List;

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