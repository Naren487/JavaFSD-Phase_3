package com.example.S11SpringBootDataJPA;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringBootDataJPA.entity.Product;
import com.example.S11SpringBootDataJPA.repository.ProductRepository;

@SpringBootTest
class S11SpringBootDataJpaApplicationTests {
	ApplicationContext context;
	@Test
	void contextLoads() {
	}
	@Test
	void createProduct() {
		Product product=new Product();
		product.setName("Headset");
		product.setDescription("Audio Device");
		product.setPrice(2000);
		ProductRepository productrepository=context.getBean(ProductRepository.class);
		productrepository.save(product);
	}
}
