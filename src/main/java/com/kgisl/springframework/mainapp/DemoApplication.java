package com.kgisl.springframework.mainapp;

import com.kgisl.springframework.controllers.ProductController;
import com.kgisl.springframework.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan("com.kgisl.springframework")
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		ProductController controller = (ProductController) ctx.getBean("productController");

		List<Product> products = controller.getProducts();
		for(Product product : products){
			System.out.println(product.getDescription());
		}
		
	}
}
