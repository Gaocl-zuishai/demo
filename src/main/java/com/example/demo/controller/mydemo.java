package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class mydemo {

	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	@ResponseBody
	public List <User> hello() {
		List <User> userList= userService.list();
		for (User user : userList) {
			System.out.println(user.nickname);
		}
		return userList;
	}

}
