package com.example.LibraryService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LibraryService.entity.Book;

@Repository
public interface LibraryRepo extends JpaRepository<Book, Integer>{

}
