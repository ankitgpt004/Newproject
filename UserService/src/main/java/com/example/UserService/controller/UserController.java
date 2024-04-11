package com.example.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.UserService.Model.Book;
import com.example.UserService.entity.User;
import com.example.UserService.service.UserServiceService;

@RestController
@RequestMapping("/userInfo")
public class UserController {
	
	@Autowired
    RestTemplate restTemplate;

	@Autowired
	private UserServiceService userService;
	
	/*
	 * for persisting user into database
	 */
	@RequestMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	/*
	 * to get the book information related to user
	 */
	@RequestMapping("/findBookInfoByUserId/{id}")
	@Cacheable(value="Book", key="#id")
	public Book getBookInfo(@RequestBody User user) {
		return restTemplate.getForObject("http://localhost:8081/lib/getBookById"+user.getBookId(), Book.class);
	}
	
	/*
	 * to get all users
	 */
	@RequestMapping("/getAllUser")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	
}
