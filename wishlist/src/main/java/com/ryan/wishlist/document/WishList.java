package com.ryan.wishlist.document;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="wishlist")
public class WishList {
    @Id
    private String id;
    private Product[] products;
    private Client cliente;
    public WishList(String id, Product[] products, Client cliente) {
        this.id = id;
        this.products = products;
        this.cliente = cliente;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Client getCliente() {
        return cliente;
    }
    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public boolean add_product(){
        return false;

    }

    @Override
    public String toString() {
        return "WishList [cliente=" + cliente + ", id=" + id + ", products=" + Arrays.toString(products) + "]";
    }


    

    
}
