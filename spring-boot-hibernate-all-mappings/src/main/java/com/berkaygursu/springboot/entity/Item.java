package com.berkaygursu.springboot.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private Double price;
	
	public Item() {
		
	}
	
	public Item(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	//@JoinColumn(name = "cust_id") // naming foreign key column in item table
//	private Customer customer;
//	
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	//---------------------------------------------------------
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<Customer> customers = new ArrayList<>();
//	
//	public List<Customer> getCustomers() {
//		return customers;
//	}
//
//	public void setCustomers(List<Customer> customers) {
//		this.customers = customers;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
