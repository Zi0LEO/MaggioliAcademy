package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ContactsRepository extends CrudRepository<Contact, Integer>{
	
}
