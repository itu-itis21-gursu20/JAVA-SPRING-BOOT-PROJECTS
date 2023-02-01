package com.berkaygursu.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berkaygursu.springboot.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
