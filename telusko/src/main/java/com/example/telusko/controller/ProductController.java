package com.example.telusko.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.telusko.model.Product;
import com.example.telusko.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {
    
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }
    
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id)
    {
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product prod)
    {
        return service.updateProduct(prod);
    }

    @DeleteMapping("/products")
    public void deleteProduct(@RequestBody Product prod)
    {
        service.deleteProduct(prod);
    }


}
