package com.examples.S08SpringMVCoreDemo.service;

import java.util.List;

import com.examples.S08SpringMVCoreDemo.entity.User;
import com.examples.S08SpringMVCoreDemo.exception.UserAlreadyExistsException;

public interface UserService {
	int save(User user) throws UserAlreadyExistsException;
	List<User> retrive();
}
