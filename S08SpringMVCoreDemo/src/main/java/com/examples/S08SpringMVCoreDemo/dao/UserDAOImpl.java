package com.examples.S08SpringMVCoreDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.examples.S08SpringMVCoreDemo.entity.User;
@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	private HibernateTemplate hibernatetemplate;
	@Override
	public int create(User user) {
		// TODO Auto-generated method stub
		int result=(int)hibernatetemplate.save(user);
		return result;
	}
	@Override
	public List<User> readAll() {
		// TODO Auto-generated method stub
		return hibernatetemplate.loadAll(User.class);
	}
	@Override
	public User emailExists(String email) {
		// TODO Auto-generated method stub
		User result=null;
		List<?> users=hibernatetemplate.find("from User u where u.email =?0", email);
		if(users!=null && users.size()>0) {
			result=(User) users.get(0);
			System.out.println(users.get(0));
		}
		return result;
	}

}
