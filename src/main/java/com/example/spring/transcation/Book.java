package com.example.spring.transcation;

public class Book {
	
	private String name;
	private double price;
	private String isbn;
	
	public Book(String name, double price, String isbn) {
		super();
		this.name = name;
		this.price = price;
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
