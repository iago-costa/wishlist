package com.ryan.wishlist.document;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="client")
public class Client {
    private String name;
    private String email;
    private String senha;
    
    public Client(String name, String email, String senha) {
        this.name = name;
        this.email = email;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Client [email=" + email + ", name=" + name + ", senha=" + senha + "]";
    }

    
}
