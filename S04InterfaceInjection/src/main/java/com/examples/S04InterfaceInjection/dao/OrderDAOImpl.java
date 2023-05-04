package com.examples.S04InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdao")
public class OrderDAOImpl implements OrderDAO{

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("My sqlDB");
	}

}
