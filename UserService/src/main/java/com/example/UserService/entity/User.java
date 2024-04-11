package com.example.UserService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usrer_id;
	
	private String userName;
	
	private int bookId;
	
	

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getUsrer_id() {
		return usrer_id;
	}

	public void setUsrer_id(int usrer_id) {
		this.usrer_id = usrer_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User(int usrer_id, String userName, int bookId) {
		super();
		this.usrer_id = usrer_id;
		this.userName = userName;
		this.bookId = bookId;
	} 
	
	

}
