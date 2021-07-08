package com.ryan.wishlist.repository;

import com.ryan.wishlist.document.Client;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientRepository extends ReactiveMongoRepository<Client, String>{
    
}
