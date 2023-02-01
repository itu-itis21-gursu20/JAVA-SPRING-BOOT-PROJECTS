package com.berkaygursu.springdatajpademo.repository;

import com.berkaygursu.springdatajpademo.entity.Product;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;


    @Test
    void saveMethod() {

        //create product
        Product product = new Product();
        product.setSku("100ABC");
        product.setName("product 1");
        product.setDescription("product 1 description");
        product.setPrice(BigDecimal.valueOf(100));
        product.setActive(true);
        product.setImageUrl("product1.png");
        // no need to give input for dates because we handled it in class with annotations

        // save product
        Product savedProduct = productRepository.save(product);

        // display product info
        System.out.println(savedProduct.getName());
        System.out.println(savedProduct.toString());
    }

    @Test
    void updateUsingSaveMethod() {

        // retrieve object to be updated
        Long id = 1L;
        Product product = productRepository.findById(id).get();

        // change columns
        product.setDescription("updated product desc");
        product.setPrice(BigDecimal.valueOf(200));

        // save updated object
        productRepository.save(product);

        // print updated object
        System.out.println(product.toString());

    }

    @Test
    void findByIdMethod() {
        // retrieve object to be updated
        Long id = 1L;
        Product product = productRepository.findById(id).get();

        // print retrieved object
        System.out.println(product.toString());
    }

    @Test
    void saveAllMethod() {
        //create multiple products
        Product product2 = new Product();
        product2.setSku("300ABC");
        product2.setName("product 2");
        product2.setDescription("product 2 description");
        product2.setPrice(BigDecimal.valueOf(300));
        product2.setActive(true);
        product2.setImageUrl("product2.png");

        Product product3 = new Product();
        product3.setSku("400ABC");
        product3.setName("product 3");
        product3.setDescription("product 3 description");
        product3.setPrice(BigDecimal.valueOf(400));
        product3.setActive(true);
        product3.setImageUrl("product3.png");

        //save product as list
        List<Product> productList = new ArrayList<Product>();
        productList.add(product2);
        productList.add(product3);
        productRepository.saveAll(productList);

        for(int i = 0; i<productList.size(); i++){
            System.out.println(productList.get(i));
        }
        System.out.println("----------------------------------");
        for(Product product : productList){
            System.out.println(product);
        }
    }

    @Test
    void findAllMethod() {
        List<Product> products = productRepository.findAll();

        for(Product product : products){
            System.out.println(product);
        }
    }

    @Test
    void deleteByIdMethod() {
        Long id = 1L;
        productRepository.deleteById(id);
    }

    @Test
    void deleteMethod() {
        // find object to be deleted by id
        Long id = 2L;
        Product product = productRepository.findById(id).get();

        // delete this product as entity
        productRepository.delete(product);
    }

    @Test
    void deleteAllMethod() {

        // productRepository.deleteAll();   without parameter

        // Product product1 = productRepository.findById(1L).get();
        // Product product2 = productRepository.findById(2L).get();
        // productRepository.deleteAll(List.of(product1, product2));     with parameter

    }

    @Test
    void existsByIdMethod() {
        Long id = 7L;
        boolean result = productRepository.existsById(id);
        System.out.println(result);
    }

    @Test
    void countMethod() {
        Long count = productRepository.count();
        System.out.println(count);
    }

}