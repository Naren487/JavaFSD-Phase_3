package com.examples.S08SpringMVCoreDemo.dao;

import java.util.List;

import com.examples.S08SpringMVCoreDemo.entity.User;

public interface UserDAO {
	int create(User user);
	List<User> readAll();
	User emailExists(String email);
}
