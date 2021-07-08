package ryan.producoes.wishlist.models;


public class Product {
    public String name;
    public double price;
    public String description;
    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "Product [description=" + description + ", name=" + name + ", price=" + price + "]";
    }

    
    


}
