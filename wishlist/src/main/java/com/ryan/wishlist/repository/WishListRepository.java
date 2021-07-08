package com.ryan.wishlist.repository;

import com.ryan.wishlist.document.WishList;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface WishListRepository extends ReactiveMongoRepository<WishList, String> {
    
}
