package com.kgisl.springframework.domain;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private String bookName;
	
	private String author;
	
	private float price;

	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}