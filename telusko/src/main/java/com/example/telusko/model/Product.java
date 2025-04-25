package com.example.telusko.model;

public class Product {
    private int Id;
    private String productName;
    private int price;


public Product(int Id, String productName, int price) {
        this.Id = Id;
        this.productName = productName;
        this.price = price;
    }

public int getId() {
    return Id;
}

public void setId(int Id) {
    this.Id = Id;
}

public String getProductName() {
    return productName;
}

public void setProductName(String productName) {
    this.productName = productName;
}

public int getPrice() {
    return price;
}

public void setPrice(int price) {
    this.price = price;
}
}