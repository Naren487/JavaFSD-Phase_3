package com.example.S10SpringBootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.S10SpringBootDemo.dao.SomeDAO;
@Component
public class SomeService {
	@Autowired
	SomeDAO someDao;
	public void hello() {
		someDao.create();
	}
}
