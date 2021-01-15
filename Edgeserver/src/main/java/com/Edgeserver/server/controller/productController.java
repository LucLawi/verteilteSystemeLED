package com.Edgeserver.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Edgeserver.server.clients.productsClient;
import com.Edgeserver.server.models.Product;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class productController {

	@Autowired
	productsClient pC;

	@GetMapping("/products")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Product> products() {
		return pC.getProducts();
	}
	
	@GetMapping("/test")
	public String test() {
		return "teste";
	}
	
	
}
