package com.example.S11SpringBootDataJPA.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.S11SpringBootDataJPA.entity.*;
public interface ProductRepository extends CrudRepository<Product,Integer> {
	List<Product> findByName(String name);
	
	List<Product> findByPrice(double price);
	List<Product> findByNameAndPrice(String name,double price);
}
