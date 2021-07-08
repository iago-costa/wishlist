package com.ryan.wishlist.services;

import com.ryan.wishlist.document.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Flux<Product> findAll();

    Mono<Product> findById(String id);

    Mono<Product> save(Product product);

    
}
