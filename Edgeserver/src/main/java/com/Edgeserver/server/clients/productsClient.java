package com.Edgeserver.server.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Edgeserver.server.models.Product;


@FeignClient("productApi")
public interface productsClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/products")
	@CrossOrigin(origins = "http://localhost:4200")
	List<Product> getProducts();
}
