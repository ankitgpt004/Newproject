package com.example.LibraryService.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryService.entity.Book;
import com.example.LibraryService.repo.LibraryRepo;

@Service
public class LibraryService {
	
	@Autowired
	private LibraryRepo libraryRepo;

	public Book createBook(Book book) {
		return libraryRepo.save(book);
	}

	public Book getBookById(int id) {
		return libraryRepo.getById(id);
	}
	
	
	
	
	

}
