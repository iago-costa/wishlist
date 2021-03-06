package com.ryan.wishlist.services;

import com.ryan.wishlist.document.Client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    Flux<Client> findAll();

    Mono<Client> findById(String id);

    Mono<Client> upById(String id);

    Mono<Void> deleteById(String id);

    Mono<Client> save(Client client);

}
