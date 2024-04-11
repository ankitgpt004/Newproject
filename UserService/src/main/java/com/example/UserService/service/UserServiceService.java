package com.example.UserService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserService.entity.User;
import com.example.UserService.repo.UserServiceRepo;
//import jakarta.annotation.PostConstruct;

@Service
public class UserServiceService {
	
	@Autowired
	private UserServiceRepo userServiceRepo;
	
	List<User> userList = null;
	
//	@PostConstruct
//	public List<User> getUserFronDB(){
//		userList.add(new User(12,"Anam",11));
//		userList.add(new User(15,"Ankit",13));
//		userList.add(new User(12,"Ajay",56));
//		userList.add(new User(16,"Amiyansh",87));
//		return userList;
//	}

	public User createUser(User user) {
		return userServiceRepo.save(user);
	}

	public List<User> getAllUser() {
		return userServiceRepo.findAll();
	}
	
	

}
