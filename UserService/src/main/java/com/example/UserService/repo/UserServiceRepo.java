package com.example.UserService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.UserService.entity.User;

public interface UserServiceRepo extends JpaRepository<User, Integer>{

	
	public User save(User user);
	
	
}
