package com.ryan.wishlist.services;

import com.ryan.wishlist.document.Client;
import com.ryan.wishlist.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository pr;

    @Override
    public Flux<Client> findAll() {
        return pr.findAll();
    }

    @Override
    public Mono<Client> findById(String id) {
        return pr.findById(id);
    }

    @Override
    public Mono<Client> save(Client client) {
        return pr.save(client);
    }

    @Override
    public Mono<Client> upById(String id) {
        
        return null;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return pr.deleteById(id);
    }
}
