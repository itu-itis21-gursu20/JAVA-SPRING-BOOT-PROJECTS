package com.berkaygursu.springdatajpademo.repository;

import com.berkaygursu.springdatajpademo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
