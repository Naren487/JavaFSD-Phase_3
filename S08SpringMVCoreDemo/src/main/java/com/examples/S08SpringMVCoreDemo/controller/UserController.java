package com.examples.S08SpringMVCoreDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.S08SpringMVCoreDemo.entity.User;
import com.examples.S08SpringMVCoreDemo.exception.UserAlreadyExistsException;
import com.examples.S08SpringMVCoreDemo.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userservice;
	@RequestMapping("/register")
	public String register() {
		return "userReg";
	}
	
	@RequestMapping("/registeruser")
	public String registerUser(@ModelAttribute("user") User user,ModelMap model) {
		int result = 0;
		try {
			result = userservice.save(user);
			model.addAttribute("users",userservice.retrive());
			model.addAttribute("msg",result);
		} catch (UserAlreadyExistsException e) {
			// TODO Auto-generated catch block
			model.addAttribute("msg",e.getMessage());
			System.out.println("Email already exists");
		}
		
		return "userReg";
	}
}
