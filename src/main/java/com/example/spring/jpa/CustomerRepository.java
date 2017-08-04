package com.example.spring.jpa;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spring.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Long> {

	public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
	
}
