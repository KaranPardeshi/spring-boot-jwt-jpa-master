package com.techgeeknext.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    @JsonIgnore
    private String password;
    @Column
    private int quantity;
    @Column
    private double price;

    public Product() {
    }

    public Product(int id, String name, String password, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
