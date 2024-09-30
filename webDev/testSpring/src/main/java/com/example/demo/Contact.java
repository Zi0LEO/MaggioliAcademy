package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    private String name;
	private Integer number;
	
	public Integer getId() { return id; }
	
	public String getName() { return name; }
	public Integer getNumber() { return number; }
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(Integer id) {
	  this.id = id;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
}
