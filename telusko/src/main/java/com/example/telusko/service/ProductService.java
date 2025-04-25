package com.example.telusko.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.telusko.model.Product;

@Service
public class ProductService {
    

    List<Product> products =new ArrayList<>(Arrays.asList(
        new Product(1, "Laptop", 1000),
        new Product(2, "Mobile", 500),
        new Product(3, "PC", 5000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id)
    {
        return products.stream().filter(p -> p.getId() == id)
        .findFirst().orElse(new Product(0,"None",0));
    }

    public void addProduct(Product prod)
    {
        products.add(prod);
    }

    public Product updateProduct(Product prod) {
        int index=0;
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getId()==prod.getId())
            {
                index=i;
            }
        }
        return products.set(index, prod);
    }

    public void deleteProduct(Product prod) {
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getId()==prod.getId())
            {
                products.remove(i);
            }
        }
    }
}
