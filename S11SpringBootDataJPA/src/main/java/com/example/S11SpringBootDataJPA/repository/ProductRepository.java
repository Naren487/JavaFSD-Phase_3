package com.example.S11SpringBootDataJPA.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.S11SpringBootDataJPA.entity.*;
public interface ProductRepository extends CrudRepository<Product,Integer> {

}
