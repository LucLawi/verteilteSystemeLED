package com.catalog.products.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.catalog.products.model.Product;
//import com.catalog.products.repository.ProductRepository;

@RestController
public class ProductController {

//	@Autowired
//	private ProductRepository productRepository;

	@GetMapping("/products")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Product> getAllProducts() {

		List<Product> products = new ArrayList<Product>();
		
		Product product = new Product();
		product.setProductId("1");
		product.setName("One Piece");
		product.setCode("Skypiea");
		product.setTitle("One Piece - Skypiea");
		product.setDescription("Skypiea Arc");
		product.setImgUrl("OnePiece.jpg");
		product.setPrice(6.50);
		products.add(product);

		product = new Product();
		product.setProductId("2");
		product.setName("Detektiv Conan");
		product.setCode("Conan Edogawa");
		product.setTitle("Meister Detektiv");
		product.setDescription("Seines Zeichen Detektiv");
		product.setImgUrl("Conan.jpg");
		product.setPrice(7.50);
		products.add(product);
		
		product = new Product();
		product.setProductId("3");
		product.setName("Dragon Ball");
		product.setCode("DBGT");
		product.setTitle("Dragon Ball GT");
		product.setDescription("Goku als Kind");
		product.setImgUrl("Goku.jpg");
		product.setPrice(7.50);
		products.add(product);

		product = new Product();
		product.setProductId("4");
		product.setName("Soul Eater");
		product.setCode("Soul");
		product.setTitle("Soul Eater");
		product.setDescription("Soul ist eine Sense");
		product.setImgUrl("Soul.jpg");
		product.setPrice(6.50);
		products.add(product);
		
		product = new Product();
		product.setProductId("5");
		product.setName("Hilda");
		product.setCode("HildaStaffel1");
		product.setTitle("HildaTrolberg");
		product.setDescription("Hilda zieht nach Trolberg");
		product.setImgUrl("Hilda.jpg");
		product.setPrice(8.50);
		products.add(product);
		
		product = new Product();
		product.setProductId("6");
		product.setName("Naruto");
		product.setCode("Naruto Shippuden");
		product.setTitle("Narutoshippuden");
		product.setDescription("Naruto Ninja");
		product.setImgUrl("Hilda.jpg");
		product.setPrice(6.50);
		products.add(product);
		
		return products;
		// return productRepository.findAll();
	}
}