package com.perficient.techbootcampkit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perficient.techbootcampkit.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	//display list of books
	@GetMapping("/disp")
	public String viewHomePage(Model model) {
		model.addAttribute("listBooks",bookService.getAllBooks());
		return "index";
	}
}
