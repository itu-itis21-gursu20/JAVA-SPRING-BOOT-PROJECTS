package com.berkaygursu.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.berkaygursu.springboot.entity.Customer;
import com.berkaygursu.springboot.entity.Item;
import com.berkaygursu.springboot.repository.CustomerRepository;
import com.berkaygursu.springboot.repository.ItemRepository;

@SpringBootApplication

public class SpringBootHibernateAllMappingsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateAllMappingsApplication.class, args);
	}
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public void run(String... args) throws Exception {

//		ONE TO ONE SAVE PART-----------------------------------------------
//		Customer customer = new Customer();
//		
//		Item item = new Item();
//		
//		item.setName("toshiba");
//		item.setPrice(50.45);
//		
//		customer.setName("berkay");
//		customer.setItem(item);
//		
//		customerRepository.save(customer);
//		itemRepository.save(item);
		
//---------------------------------------------------------------------
		
//		ONE TO MANY, MANY TO MANY SAVE PART
		
//		Customer customer = new Customer();
//		
//		Item item = new Item();
//		item.setName("toshiba");
//		item.setPrice(50.45);
//		
//		Item item2 = new Item();
//		item2.setName("dell");
//		item2.setPrice(65.82);
//		
//		customer.setName("berkay");
//		
//		customer.getItems().add(item);
//		item.setCustomer(customer);
//		
//		customer.getItems().add(item2);
//		item2.setCustomer(customer);
//		
//		customerRepository.save(customer);
//			
// -------------------------------------------------------------------------------	
// 		MANY TO MANY SAVE PART
		
//		Customer customer = new Customer();
//		Customer customer2 = new Customer();
//		
//		customer.setName("berkay");
//		customer2.setName("arda");
//		
//		Item item = new Item();
//		Item item2 = new Item();
//		
//		item.setName("toshiba");
//		item.setPrice(50.48);
//		item2.setName("dell");
//		item2.setPrice(85.74);
//				
//		customer.getItems().add(item);
//		item.getCustomers().add(customer);
//		
//		customer.getItems().add(item2);
//		item2.getCustomers().add(customer);
//		
//		customer2.getItems().add(item);
//		item.getCustomers().add(customer2);
//		
//		
//		customerRepository.save(customer);
//		customerRepository.save(customer2);
//	--------------------------------------------------------------------------
		
	}

}
