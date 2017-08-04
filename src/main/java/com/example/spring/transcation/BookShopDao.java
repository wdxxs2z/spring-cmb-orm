package com.example.spring.transcation;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookShopDao extends PagingAndSortingRepository<Book,Long>{
	
	@Query("select price from books where isbn=?1")
	public double findBookPriceByIsbn(String isbn);

	public void updateBookStock(String isbn);

	public void updateUserAccount(String username, double price);

}
