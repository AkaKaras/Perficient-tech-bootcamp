package com.perficient.techbootcampkit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;
	
	@Column(name = "book_name")
	private String book_name;
	
	@Column(name = "book_author")
	private int book_author;
	
	@Column(name = "book_page")
	private int book_page;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBook_author() {
		return book_author;
	}
	public void setBook_author(int book_author) {
		this.book_author = book_author;
	}
	public int getBook_Page() {
		return book_page;
	}
	public void setBook_Page(int book_page) {
		this.book_page = book_page;
	}
	
	
}
