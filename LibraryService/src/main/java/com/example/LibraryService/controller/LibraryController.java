package com.example.LibraryService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryService.entity.Book;
import com.example.LibraryService.repo.service.LibraryService;

@RestController
@RequestMapping("/lib")
public class LibraryController {
	
	@Autowired
	private LibraryService libraryService; 
	
	@RequestMapping("/createBook")
	public Book createBook(@RequestBody Book book) {
		return libraryService.createBook(book);
	}
	
	@RequestMapping("/getBookById")
	public Book getBookById(@PathVariable int id) {
		return libraryService.getBookById(id);
	}

}
