package com.perficient.techbootcampkit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perficient.techbootcampkit.model.Book;
import com.perficient.techbootcampkit.repository.BookRepository;

@Service

public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}
}
