package com.example.S13SpringBootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.S13SpringBootREST.entity.Product;
import com.example.S13SpringBootREST.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductApiController {
	@Autowired
	private ProductRepository productRepo;
	@GetMapping
	public Iterable<Product> getProducts(){
		return productRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Integer id){
		return productRepo.findById(id).get();
	}
	
	@PostMapping
	public Product create(@RequestBody Product product){
		return productRepo.save(product);
	}
	
	@PutMapping
	public Product update(@RequestBody Product product){
		return productRepo.save(product);
	}
}
