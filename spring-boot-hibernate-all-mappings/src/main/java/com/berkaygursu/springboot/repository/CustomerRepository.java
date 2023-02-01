package com.berkaygursu.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berkaygursu.springboot.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
