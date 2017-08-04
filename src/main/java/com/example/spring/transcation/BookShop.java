package com.example.spring.transcation;

import java.util.List;

public class BookShop {
	
	private List<Book> books;
	
	private String shopName;

	public BookShop(List<Book> books, String shopName) {
		super();
		this.books = books;
		this.shopName = shopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
}
