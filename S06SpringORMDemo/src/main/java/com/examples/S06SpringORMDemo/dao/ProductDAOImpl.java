package com.examples.S06SpringORMDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.examples.S06SpringORMDemo.entity.Product;

@Transactional(readOnly = false)
@Component("productdao")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	HibernateTemplate hibernatetemplate;
	@Override
	public int create(Product product) {
		Integer result=(Integer) hibernatetemplate.save(product);
		return result;
	}
	@Override
	public void update(Product product) {
		hibernatetemplate.update(product);
	}
	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernatetemplate.delete(product);
		
	}
	@Override
	public Product find(int id) {
		// TODO Auto-generated method stub
		return hibernatetemplate.get(Product.class,id);
	}
	@Override
	public List<Product> findall() {
		// TODO Auto-generated method stub
		return hibernatetemplate.loadAll(Product.class);
	}

}
