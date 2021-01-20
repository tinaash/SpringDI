package com.kgisl.springframework.services;

import com.kgisl.springframework.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> listProducts() {
    	
        ArrayList<Product> products = new ArrayList<Product>(2);
        products.add(new Product("HP Probook Laptop"));
        products.add(new Product("HP Inkjet Scanner"));
        products.add(new Product("DELL wireless Mouse"));
        return products;
    }
}
