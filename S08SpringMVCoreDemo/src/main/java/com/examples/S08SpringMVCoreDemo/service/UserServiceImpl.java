package com.examples.S08SpringMVCoreDemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.S08SpringMVCoreDemo.dao.UserDAO;
import com.examples.S08SpringMVCoreDemo.entity.User;
import com.examples.S08SpringMVCoreDemo.exception.UserAlreadyExistsException;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userdao;
	@Override
	@Transactional
	public int save(User user) throws UserAlreadyExistsException {
		
		if(userdao.emailExists(user.getEmail())!=null) {
			throw new UserAlreadyExistsException(user.getEmail());
		}
		
		// TODO Auto-generated method stub
		return userdao.create(user);
	}
	@Override
	public List<User> retrive() {
		// TODO Auto-generated method stub
		return userdao.readAll();
	}

}
