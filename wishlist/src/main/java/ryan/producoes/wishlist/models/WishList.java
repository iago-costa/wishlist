package ryan.producoes.wishlist.models;

import java.util.Arrays;

public class WishList {
    private Product[] products;
    private Client cliente;

    public WishList(Product[] products, Client cliente) {
        this.products = products;
        this.cliente = cliente;
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

    public Boolean addProduct(Product product) {



        return null;
        
    }

    @Override
    public String toString() {
        return "WishList [cliente=" + cliente + ", products=" + Arrays.toString(products) + "]";
    }
    
}
