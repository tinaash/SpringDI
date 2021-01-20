package com.kgisl.springframework.controllers;

import com.kgisl.springframework.domain.Book;
import com.kgisl.springframework.domain.Product;
import com.kgisl.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

	// We can include additional object dependencies later also
	// Field based DI to inject Book
	// @Autowired
	// private Book newBook;
	
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getProducts(){
        return productService.listProducts();
    }

}
