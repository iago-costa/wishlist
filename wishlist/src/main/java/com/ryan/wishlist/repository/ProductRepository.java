package com.ryan.wishlist.repository;

import com.ryan.wishlist.document.Product;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

    
}
