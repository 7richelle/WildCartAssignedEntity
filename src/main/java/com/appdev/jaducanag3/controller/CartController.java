package com.appdev.jaducanag3.controller;

import org.springframework.web.bind.annotation.*;

import com.appdev.jaducanag3.model.Cart;
import com.appdev.jaducanag3.service.CartService;

import java.util.*;

@RestController
@RequestMapping("/api/carts")
public class CartController {
      private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cart> getAllCarts() { return service.getAllCarts(); }

    @PostMapping
    public Cart addCart(@RequestBody Cart cart) { return service.addCart(cart); }

    @GetMapping("/{id}")
    public Cart getCartById(@PathVariable int id) { return service.getCartById(id); }

    @PutMapping("/{id}")
    public Cart updateCart(@PathVariable int id, @RequestBody Cart newCart) {
        return service.updateCart(id, newCart);
    }

    @DeleteMapping("/{id}")
    public String deleteCart(@PathVariable int id) {
        service.deleteCart(id);
        return "Cart deleted with ID: " + id;
    }
}
