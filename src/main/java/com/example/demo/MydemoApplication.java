package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class MydemoApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(MydemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// 创建表
		userService.create(User.class);

		log.info(":=============表初始化完毕");

	}

}
