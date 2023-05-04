package com.example.S11SpringBootDataJPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringBootDataJPA.entity.Product;
import com.example.S11SpringBootDataJPA.repository.ProductRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional;

@SpringBootTest
class S11SpringBootDataJpaApplicationTests {
	@Autowired
	ApplicationContext context;
	@Test
	void contextLoads() {
	}
//	@Test
	void createProduct() {
		Product product=new Product();
		product.setName("Headset");
		product.setDescription("Audio Device");
		product.setPrice(2000);
		ProductRepository productrepository=context.getBean(ProductRepository.class);
		productrepository.save(product);
	}
	
//	@Test
	void readProduct() {
		ProductRepository productrepository=context.getBean(ProductRepository.class);
		java.util.Optional<Product> p=productrepository.findById(2);
		if(p.isPresent()) {
			Product pro=p.get();
			System.out.println(pro);
		}
		else {
			System.out.println("Product Not Found");
		}
	}
	
//	@Test
	void readAllProduct() {
		ProductRepository productrepository=context.getBean(ProductRepository.class);
		List<Product> p=(List<Product>) productrepository.findAll();
		System.out.println(p);
	}
	@Test
	void findByName() {
		ProductRepository productrepository=context.getBean(ProductRepository.class);
		List<Product> p=(List<Product>) productrepository.findByName("Headset");
		System.out.println(p);
	}
}
 